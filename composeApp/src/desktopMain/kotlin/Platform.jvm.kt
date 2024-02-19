import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()

@Composable
actual fun WebView(modifier: Modifier, link: String) {
    DesktopWebView(modifier, link)
}