package ua.nure.kolodiazhny.SummaryTask04_2.support.captcha;

/**
 * POJO-class.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public class CaptchaResponse {

	/**
	 * Contains data from passing.
	 */
	public boolean success;

	//////////////////////////////////
	// Below are getters and setters//
	/////////////////////////////////
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}