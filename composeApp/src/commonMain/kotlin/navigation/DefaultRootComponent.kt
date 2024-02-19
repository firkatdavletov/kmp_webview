//package navigation
//
//import com.arkivanov.decompose.ComponentContext
//import com.arkivanov.decompose.router.stack.ChildStack
//import com.arkivanov.decompose.router.stack.StackNavigation
//import com.arkivanov.decompose.router.stack.childStack
//import com.arkivanov.decompose.router.stack.pop
//import com.arkivanov.decompose.router.stack.popTo
//import com.arkivanov.decompose.router.stack.push
//import com.arkivanov.decompose.value.Value
//import kotlinx.serialization.Serializable
//import presentation.components.home_component.DefaultHomeComponent
//import presentation.components.home_component.HomeComponent
//import presentation.components.webview_component.DefaultWebViewComponent
//import presentation.components.webview_component.WebViewComponent
//
//
//class DefaultRootComponent(
//    componentContext: ComponentContext
//): RootComponent, ComponentContext by componentContext {
//    private val navigation = StackNavigation<Config>()
//
//    override val stack: Value<ChildStack<*, RootComponent.Child>> = childStack(
//        source = navigation,
//        serializer = Config.serializer(),
//        initialConfiguration = Config.WebView("https://www.google.com"),
//        handleBackButton = true,
//        childFactory = ::child
//    )
//
//    private fun child(config: Config, componentContext: ComponentContext): RootComponent.Child =
//        when (config) {
//            is Config.Home -> RootComponent.Child.HomeChild(homeComponent(componentContext))
//            is Config.WebView -> RootComponent.Child.WebViewChild(webViewComponent(componentContext))
//        }
//
//
//    private fun homeComponent(componentContext: ComponentContext): HomeComponent =
//        DefaultHomeComponent(
//            componentContext = componentContext,
//            onItemSelected = { item: String ->
//                navigation.push(Config.WebView(item))
//            }
//        )
//
//
//    private fun webViewComponent(componentContext: ComponentContext): WebViewComponent =
//        DefaultWebViewComponent(
//            componentContext = componentContext,
//            onClicked = navigation::pop
//        )
//
//    override fun onBackClicked(toIndex: Int) {
//        navigation.popTo(toIndex)
//    }
//
//    @Serializable
//    private sealed interface Config {
//        @Serializable
//        data object Home: Config
//        @Serializable
//        data class WebView(val link: String): Config
//    }
//}