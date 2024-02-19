//package presentation.components.home_component
//
//import com.arkivanov.decompose.ComponentContext
//import com.arkivanov.decompose.value.MutableValue
//import com.arkivanov.decompose.value.Value
//import presentation.components.home_component.HomeComponent
//
//class DefaultHomeComponent(
//    componentContext: ComponentContext,
//    private val onItemSelected: (item: String) -> Unit
//): HomeComponent {
//    override val model: Value<HomeComponent.Model>
//        get() = MutableValue(HomeComponent.Model(items = List(10) {"item $it"}))
//
//    override fun onItemClicked(item: String) {
//        onItemSelected(item)
//    }
//}