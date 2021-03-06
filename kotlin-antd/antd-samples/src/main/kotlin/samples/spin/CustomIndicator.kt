package samples.spin

import antd.icon.*
import antd.spin.*
import kotlinext.js.*
import react.*
import styled.*

private val antIcon = buildElement {
    icon {
        attrs {
            type = "loading"
            style = js { fontSize = 24 }
            spin = true
        }
    }
}

fun RBuilder.customIndicator() {
    styledDiv {
        css { +SpinStyles.customIndicator }
        spin {
            attrs.indicator = antIcon
        }
    }
}
