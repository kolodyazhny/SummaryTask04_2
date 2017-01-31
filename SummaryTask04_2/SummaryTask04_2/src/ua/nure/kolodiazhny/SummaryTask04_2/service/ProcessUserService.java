package ua.nure.kolodiazhny.SummaryTask04_2.service;

import java.sql.SQLException;
import java.text.ParseException;

import ua.nure.kolodiazhny.SummaryTask04_2.web.model.entity.UserBean;

/**
 * Used for processing different actions with users through DAO-layer.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public interface ProcessUserService {

	/**
	 * Gives ban/unban.
	 *
	 * @param ban
	 *            input parameter
	 * @param email
	 *            email of user
	 * @throws SQLException
	 *             incorrect parameters into SQL-query
	 */
	public void giveBan(String ban, String email) throws SQLException;

	/**
	 * Changes status.
	 *
	 * @param userBean
	 *            java-bean for transfer data
	 * @param language
	 *            current language
	 * @throws SQLException
	 *             incorrect parameters into SQL-query
	 */
	public void change(UserBean userBean, String language) throws SQLException;
}