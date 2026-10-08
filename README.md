# ws-console-skeleton

A minimal starting point for a terminal app built on [ws-console](https://github.com/WickedSik/ws-console), resolved from Maven Central as `"io.github.wickedsik" %% "ws-console" % "0.1.0"`. It renders a centered "Welcome" and exits on `Ctrl+C`.

## Requirements

- JDK 23 or newer (`run.sh` passes `--sun-misc-unsafe-memory-access=allow`, which older JVMs reject)
- sbt 1.10+

## Run

```bash
./run.sh
```

Do not use `sbt run`. sbt shares the terminal with the app and writes erase sequences into the screen. `run.sh` resolves the classpath through sbt, then starts the app in its own JVM.

## Next steps

Edit `root` in `Main.scala` to build your own component tree.

## License

MIT. See [LICENSE](LICENSE). Apps you build from this skeleton can use any license. ws-console itself is licensed under LGPL-3.0-or-later.
