#!/usr/bin/env bash
#
# Run the app in its own JVM. Never use `sbt run`: sbt shares the terminal
# and writes erase sequences into the TUI's screen.

set -euo pipefail

cd "$(dirname "${BASH_SOURCE[0]}")"

# Compiles, then prints the runtime classpath as the last line.
CP="$(sbt -batch -error 'export runtime:fullClasspath' < /dev/null | tr -d '\r' | tail -1)"

exec java --sun-misc-unsafe-memory-access=allow -cp "$CP" Main "$@"
