import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

	Map<Integer, String> codes;

	public DialingCodes() {
		codes = new HashMap<>();
	}

	public Map<Integer, String> getCodes() {
		return codes;
	}

	public void setDialingCode(Integer code, String country) {
		codes.put(code, country);
	}

	public String getCountry(Integer code) {
		return codes.get(code);
	}

	public void addNewDialingCode(Integer code, String country) {
		if (!codes.containsKey(code) && !codes.containsValue(country)) {
			codes.put(code, country);
		}
	}

	public Integer findDialingCode(String country) {
		for (Integer code : codes.keySet()) {
			if (country.equals(codes.get(code))) {
				return code;
			}
		}

		return null;
	}

	public void updateCountryDialingCode(Integer code, String country) {
		if (codes.containsValue(country)) {
			Integer currentCode = findDialingCode(country);
			codes.remove(currentCode, country);

			setDialingCode(code, country);
		}
	}
}
