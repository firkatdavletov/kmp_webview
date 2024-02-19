//package presentation.components.home_component
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.material.Button
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
//
//@Composable
//fun HomeContent(
//    component: HomeComponent,
//    modifier: Modifier = Modifier
//) {
//    val model by component.model.subscribeAsState()
//
//    Box(
//        modifier = modifier,
//        contentAlignment = Alignment.Center
//    ) {
//        Button(
//            onClick = {
//                component.onItemClicked("www.google.com")
//            }
//        ) {
//            Text("Start web view")
//        }
//    }
//}