//package navigation
//
//import com.arkivanov.decompose.router.stack.ChildStack
//import com.arkivanov.decompose.value.Value
//import presentation.components.home_component.HomeComponent
//import presentation.components.webview_component.WebViewComponent
//
//interface RootComponent {
//    val stack: Value<ChildStack<*, Child>>
//
//    fun onBackClicked(toIndex: Int)
//
//    sealed class Child {
//        class HomeChild(val component: HomeComponent): Child()
//        class WebViewChild(val component: WebViewComponent): Child()
//    }
//}