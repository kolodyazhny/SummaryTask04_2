package ua.nure.kolodiazhny.SummaryTask04_2.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import ua.nure.kolodiazhny.SummaryTask04_2.web.model.entity.UserBean;

/**
 * Used for processing on authentication through DAO-layer.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public interface AuthenticationUserService {

	/**
	 * Registration user.
	 *
	 * @param userBean
	 *            java-bean for transfer data
	 * @throws SQLException
	 *             incorrect parameters into SQL-query
	 */
	public void registrationUser(UserBean userBean) throws Exception;

	/**
	 * Login user.
	 *
	 * @param request
	 *            input http request
	 * @return java-bean for transfer data
	 * @throws SQLException
	 *             incorrect parameters into SQL-query
	 */
	public UserBean loginUser(HttpServletRequest request) throws SQLException;
}
