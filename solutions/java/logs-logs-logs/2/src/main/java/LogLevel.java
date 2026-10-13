public enum LogLevel {
	TRACE("TRC", 1),
	DEBUG("DBG", 2),
	INFO("INF", 4),
	WARNING("WRN", 5),
	ERROR("ERR", 6),
	FATAL("FTL", 42),
	UNKNOWN("UKN", 0);

	private final String levelShortName;
	private final int levelShortCode;

	LogLevel(String levelShortName, int levelShortCode){
		this.levelShortName = levelShortName;
		this.levelShortCode = levelShortCode;
	}

	public int getLevelShortCode(){
		return levelShortCode;
	}
}
