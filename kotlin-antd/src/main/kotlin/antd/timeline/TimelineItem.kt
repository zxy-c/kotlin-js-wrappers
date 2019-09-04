package antd.timeline

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TimelineItemComponent : Component<TimelineItemProps, RState> {
    override fun render(): ReactElement?
}

external interface TimelineItemProps : RProps {
    var prefixCls: String?
    var className: String?
    var color: String?
    var dot: Any? /* String | ReactElement */
    var pending: Boolean?
    var position: String?
    var style: dynamic
}
