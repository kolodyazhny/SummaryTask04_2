package ua.nure.kolodiazhny.SummaryTask04_2.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Used for closing session current user.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public interface CloseSessionService {

	/**
	 * Interrupting session.
	 *
	 * @param request
	 *            input http request
	 */
	public void interruptSession(HttpServletRequest request, HttpServletResponse response);
}