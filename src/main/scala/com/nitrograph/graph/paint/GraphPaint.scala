package com.nitrograph.graph.paint

import org.scalajs.dom
import dom.document
import org.scalajs.dom.Event
import scala.scalajs.js.annotation.JSExportTopLevel

object GraphPaint {
  @JSExportTopLevel("com.nitrograph.graph.paint.main")
  def main(): Unit = {
    val app = document.createElement("div")

    app.appendChild(
      document.createTextNode(
        "Graph::Paint"
      )
    )

    document.addEventListener(
      "DOMContentLoaded",
      (event: Event) => {
        document.querySelector("#graph-paint").appendChild(
          app
        )
      }
    )
  }
}
