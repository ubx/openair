package www.ubx.ch.validation;

import org.eclipse.xtext.validation.Check;

import www.ubx.ch.openAir.AsName;
import www.ubx.ch.openAir.LatDegr;
import www.ubx.ch.openAir.LongDegr;
import www.ubx.ch.openAir.MinSec;
import www.ubx.ch.openAir.OpenAir;
import www.ubx.ch.openAir.OpenAirPackage;

public class OpenAirJavaValidator extends AbstractOpenAirJavaValidator {

	public final static String INVALID_AIRSPACE_NAME = "INVALID_AIRSPACE_NAME";

	@Check
	public void checkLongDegrRange(LongDegr longDegr) {
		if (!(longDegr.getValue() >= 0 && longDegr.getValue() <= 90)) {
			error("Longitude in range 0 .. 90", OpenAirPackage.LONG_DEC__VALUE);
		}
	}

	@Check
	public void checkLatDegrRange(LatDegr latDegr) {
		if (!(latDegr.getValue() >= 0 && latDegr.getValue() <= 180)) {
			error("Latitude in range 0 .. 180", OpenAirPackage.LONG_DEC__VALUE);
		}
	}

	@Check
	public void checkMinSecRange(MinSec minSec) {
		if (!(minSec.getValue() >= 0 && minSec.getValue() <= 59)) {
			error("Min/sec in range 0 .. 59", OpenAirPackage.LONG_DEC__VALUE);
		}
	}

	@Check
	public void checkAsName(AsName asName) {
		// if (!(asName.getName().startsWith("'"))) {
		// error("Name must be in quotes", 5, INVALID_AIRSPACE_NAME);
		// }
	}
}
