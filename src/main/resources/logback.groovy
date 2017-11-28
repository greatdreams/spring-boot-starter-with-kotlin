import ch.qos.logback.classic.encoder.PatternLayoutEncoder

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%level %date %logger - %msg%n"
    }
}
root(INFO, ["CONSOLE"])
