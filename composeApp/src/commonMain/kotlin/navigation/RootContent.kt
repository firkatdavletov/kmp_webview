//package navigation
//
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
//import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
//import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
//import presentation.components.home_component.HomeContent
//import presentation.components.webview_component.WebViewComponent
//import presentation.components.webview_component.WebViewContent
//
//@Composable
//fun RootContent(component: RootComponent, modifier: Modifier = Modifier) {
//    Children(
//        stack = component.stack,
//        modifier = modifier,
//        animation = stackAnimation(fade())
//    ) {
//        when(val child = it.instance) {
//            is RootComponent.Child.HomeChild -> HomeContent(component = child.component)
//            is RootComponent.Child.WebViewChild -> WebViewContent(component = child.component)
//        }
//    }
//}