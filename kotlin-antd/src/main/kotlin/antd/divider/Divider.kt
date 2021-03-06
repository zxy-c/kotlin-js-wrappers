@file:JsModule("antd/lib/divider")
@file:JsNonModule

package antd.divider

import react.*

@JsName("default")
external object DividerComponent : Component<DividerProps, RState> {
    override fun render(): ReactElement?
}

external interface DividerProps : RProps {
    var prefixCls: String?
    var type: DividerType?
    var orientation: DividerOrientation?
    var className: String?
    var children: ReactElement?
    var dashed: Boolean?
    var style: dynamic
}
