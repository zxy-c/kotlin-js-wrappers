package samples.breadcrumb

import antd.breadcrumb.breadcrumb
import antd.breadcrumb.breadcrumbItem
import antd.menu.menu
import antd.menu.menuItem
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div

private val menu = buildElement {
    menu {
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.alipay.com/"
                }
                +"General"
            }
        }
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.taobao.com/"
                }
                +"Layout"
            }
        }
        menuItem {
            a {
                attrs {
                    target = "_blank"
                    rel = "noopener noreferrer"
                    href = "http://www.tmall.com/"
                }
                +"Navigation"
            }
        }
    }
}

fun RBuilder.overlay() {
    div("breadcrumb-container") {
        attrs.id = "breadcrumb-overlay"
        breadcrumb {
            breadcrumbItem { +"Ant Design" }
            breadcrumbItem {
                a {
                    attrs.href = ""
                    +"Component"
                }
            }
            breadcrumbItem {
                attrs.overlay = menu
                a {
                    attrs.href = ""
                    +"General"
                }
            }
            breadcrumbItem { +"Button" }
        }
    }
}
