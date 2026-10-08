import zio.*

import io.github.wickedsik.wsconsole.app.Application
import io.github.wickedsik.wsconsole.buffer.Frame
import io.github.wickedsik.wsconsole.component.{Alignment, Spacer, Text, VBox}
import io.github.wickedsik.wsconsole.layout.Constraint
import io.github.wickedsik.wsconsole.terminal.TerminalFactory

object Main extends ZIOAppDefault:

  // Two Fill spacers share the leftover rows, centering the text vertically.
  private val root = VBox(
    Constraint.Fill     -> Spacer,
    Constraint.Fixed(1) -> Text("Welcome", align = Alignment.Center),
    Constraint.Fill     -> Spacer
  )

  // Entrypoint for the application
  def run: ZIO[ZIOAppArgs & Scope, Any, Unit] =
    Application.make
      .flatMap(_.run(root))
      .provide(TerminalFactory.live, Frame.live)
