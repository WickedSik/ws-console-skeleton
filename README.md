# ws-console-skeleton

A minimal starting point for a terminal app built on [ws-console](../ws-console). It renders a centered "Welcome" and exits on `Ctrl+C`.

## Requirements

- JDK 20 or newer
- sbt 1.10+
- A local build of ws-console, published to `~/.ivy2/local`:

  ```bash
  cd ../ws-console
  sbt publishLocal
  ```

## Run

```bash
./run.sh
```

Do not use `sbt run`. sbt shares the terminal with the app and writes erase sequences into the screen. `run.sh` resolves the classpath through sbt, then starts the app in its own JVM.

## Layout

```
build.sbt                  Scala 3.3.6, depends on ws-console 0.1.0-SNAPSHOT
run.sh                     Launches Main outside sbt
src/main/scala/Main.scala  Entry point: builds the component tree and runs it
```

## Next steps

Edit `root` in `Main.scala` to build your own component tree. Rerun `sbt publishLocal` in ws-console whenever you change the library.

## License

GNU General Public License v3.0. See [LICENSE](LICENSE).
