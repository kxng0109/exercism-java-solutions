public class LogLine {

	private final String logLine;
	private final LogLevel logLevel;

	public LogLine(String logLine) {
		this.logLine = logLine;
		this.logLevel = parseLogLevel(logLine);
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}

	public String getOutputForShortLog() {
		return logLevel.getLevelShortCode() + ":" + logLine.split("]:")[1].replace("[", "").trim();
	}

	private LogLevel parseLogLevel(String logLine) {
		int endOfLevel = logLine.indexOf("]:");
		String extractedLogLevel = logLine.substring(1, endOfLevel).trim();
		return switch (extractedLogLevel) {
			case "TRC" -> LogLevel.TRACE;
			case "DBG" -> LogLevel.DEBUG;
			case "INF" -> LogLevel.INFO;
			case "WRN" -> LogLevel.WARNING;
			case "ERR" -> LogLevel.ERROR;
			case "FTL" -> LogLevel.FATAL;
			default -> LogLevel.UNKNOWN;
		};
	}
}
