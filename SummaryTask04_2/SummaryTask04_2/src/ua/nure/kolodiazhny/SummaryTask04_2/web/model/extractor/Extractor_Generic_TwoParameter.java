package ua.nure.kolodiazhny.SummaryTask04_2.web.model.extractor;

import java.sql.SQLException;

/**
 * Used for extracting from <tt>HttpServletRequest</tt>.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 * @param <T>
 * 			input generic class
 */
public interface Extractor_Generic_TwoParameter<T, E> extends Extractor {

	/**
	 * Extract data.
	 *
	 * @param preparedStatement
	 * 						input PreparedStatement data
	 * @param userBean
	 * 				input UserBean data
	 * @return
	 * 		extracted data
	 * @throws SQLException
	 * 					problem in SQL query
	 */
	public T extract(T t, E e) throws Exception;
}