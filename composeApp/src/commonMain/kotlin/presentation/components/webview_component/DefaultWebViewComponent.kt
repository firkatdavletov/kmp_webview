//package presentation.components.webview_component
//
//import com.arkivanov.decompose.ComponentContext
//import com.arkivanov.decompose.value.MutableValue
//import com.arkivanov.decompose.value.Value
//
//class DefaultWebViewComponent(
//    componentContext: ComponentContext,
//    private val onClicked: () -> Unit
//): WebViewComponent {
//    override val model: Value<WebViewComponent.Model>
//        get() = MutableValue(WebViewComponent.Model("www.google.com"))
//
//    override fun onItemClicked() {
//        onClicked()
//    }
//}