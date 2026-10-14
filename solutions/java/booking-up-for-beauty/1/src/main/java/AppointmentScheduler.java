import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

class AppointmentScheduler {

	private final LocalDateTime now = LocalDateTime.now();

	public LocalDateTime schedule(String appointmentDateDescription) {
		String[] split = appointmentDateDescription.split(" ");
		DateTimeFormatter localDateParser = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter localTimeParser = DateTimeFormatter.ofPattern("k:mm:ss");

		return LocalDateTime.of(
				LocalDate.parse(split[0], localDateParser),
				LocalTime.parse(split[1], localTimeParser)
		);
	}

	public boolean hasPassed(LocalDateTime appointmentDate) {
		return appointmentDate.isBefore(now);
	}

	public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
		return appointmentDate.toLocalTime().isAfter(LocalTime.of(11, 59, 59))
				&& appointmentDate.toLocalTime().isBefore(LocalTime.of(18, 0, 0));
	}

	public String getDescription(LocalDateTime appointmentDate) {
		DateTimeFormatter printer = new DateTimeFormatterBuilder()
				.appendPattern("EEEE, MMMM d, yyyy, 'at' h:mm ")
				.appendText(ChronoField.AMPM_OF_DAY, TextStyle.SHORT)
				.appendLiteral(".")
				.toFormatter(Locale.US);

		return "You have an appointment on " + printer.format(appointmentDate);
	}

	public LocalDate getAnniversaryDate() {
		return LocalDate.of(LocalDate.now().getYear(), 9, 15);
	}
}
