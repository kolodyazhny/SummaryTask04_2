package ua.nure.kolodiazhny.SummaryTask04_2.web.validator;

/**
 * Used for validating input data.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 * @param <T>
 *            generic input parameter
 */
public interface Validator<T> {

	/**
	 * Validating input data.
	 *
	 * @param t
	 *            generic object that will be validate
	 * @return key for redirect
	 */
	public String validateInputData(T t);
}