package ua.nure.kolodiazhny.SummaryTask04_2.web.model.extractor;

/**
 * Used for extracting from <tt>HttpServletRequest</tt>.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 * @param <T>
 * 			input generic class
 */
public interface Extractor_Generic_OneParameter<T,E> extends Extractor {

	/**
	 * Extract data.
	 *
	 * @param preparedStatement
	 * 						input PreparedStatement data
	 * @return
	 * 		extracted data
	 */
	public T extract(E e); /*PreparedStatement preparedStatement*/
}
