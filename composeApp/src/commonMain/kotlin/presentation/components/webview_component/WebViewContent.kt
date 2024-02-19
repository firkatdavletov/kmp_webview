//package presentation.components.webview_component
//
//import WebView
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.Button
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
//
//@Composable
//fun WebViewContent(
//    component: WebViewComponent,
//    modifier: Modifier = Modifier
//) {
//    val model by component.model.subscribeAsState()
//    Box(
//        modifier = modifier
//    ) {
//        WebView(
//            link = model.link,
//            modifier = Modifier.fillMaxSize()
//        )
//    }
//}