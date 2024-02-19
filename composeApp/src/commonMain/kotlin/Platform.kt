import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

@Composable
expect fun WebView(modifier: Modifier, link: String)