package antd.input

import antd.*
import org.w3c.dom.*
import react.*

external object TextAreaComponent : Component<TextAreaProps, TextAreaState> {
    override fun render(): ReactElement?
}

external interface TextAreaProps : TextareaHTMLAttributes<HTMLTextAreaElement>, RProps {
    var prefixCls: String?
    var autosize: Any? /* Boolean | AutoSizeType */
    var onPressEnter: KeyboardEventHandler<HTMLTextAreaElement>?
}

external interface TextAreaState : RState {
    var textareaStyles: dynamic
}

external interface AutoSizeType {
    var minRows: Number?
    var maxRows: Number?
}
