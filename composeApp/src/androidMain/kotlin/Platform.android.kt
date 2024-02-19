import android.os.Build
import android.webkit.WebView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.example.project.AndroidWebView

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

@Composable
actual fun WebView(modifier: Modifier, link: String) {
    AndroidWebView(modifier, link)
}