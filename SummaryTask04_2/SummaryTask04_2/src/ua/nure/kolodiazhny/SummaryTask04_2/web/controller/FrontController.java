package ua.nure.kolodiazhny.SummaryTask04_2.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.kolodiazhny.SummaryTask04_2.exception.ContainerDoesNotContainsCommandException;
import ua.nure.kolodiazhny.SummaryTask04_2.util.consts.RedirectConst;
import ua.nure.kolodiazhny.SummaryTask04_2.web.command.Command;
import ua.nure.kolodiazhny.SummaryTask04_2.web.command.impl.CommandContainer;

/**
 * Main servlet controller.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1600886683263068335L;

	/**
	 * Logger.
	 */
	private static final Logger LOG = Logger.getLogger(FrontController.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Main method of this controller.
	 */
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String comTemp = request.getServletPath();
		comTemp = comTemp.substring(1, comTemp.length());
		String execute = "";
		try {
			Command command = CommandContainer.getCommand(comTemp);
			execute = command.execute(request, response);
		} catch (ContainerDoesNotContainsCommandException e) {
			LOG.trace("Problem has occured in FrontController#execute() method" + e.getMessage());
		}

		try {
			dispatchMethod(execute, request, response);
		} catch (ServletException e) {
			LOG.trace("Problem has occured in FrontController#dispatchMethod() method" + e.getMessage());
		}
	}

	/**
	 * Method is used for dispatching to different page.
	 *
	 */
	private void dispatchMethod(String execute, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		switch (execute) {
		case RedirectConst.REFERER:
			response.sendRedirect(request.getHeader(RedirectConst.REFERER));
			break;
//		case RedirectConst.CAMERA:
//			request.getRequestDispatcher(RedirectConst.CAMERA_PATH).forward(request, response);
//			break;
//		case RedirectConst.CPU:
//			request.getRequestDispatcher(RedirectConst.CPU_PATH).forward(request, response);
//			break;
//		case RedirectConst.DRIVE:
//			request.getRequestDispatcher(RedirectConst.DRIVE_PATH).forward(request, response);
//			break;
//		case RedirectConst.FLASH:
//			request.getRequestDispatcher(RedirectConst.FLASH_PATH).forward(request, response);
//			break;
//		case RedirectConst.SOUND:
//			request.getRequestDispatcher(RedirectConst.SOUND_PATH).forward(request, response);
//			break;
		case RedirectConst.PERSONAL_AREA:
			response.sendRedirect(RedirectConst.PERSONAL_AREA_PATH);
			break;
		case RedirectConst.ADMIN:
			response.sendRedirect(RedirectConst.ADMIN_PATH);
			break;
		case RedirectConst.DETAIL:
			request.getRequestDispatcher(RedirectConst.DETAIL_PATH).forward(request, response);
			break;
		case RedirectConst.MAIN_PAGE:
			response.sendRedirect(RedirectConst.MAIN_PAGE_PATH);
			break;
		case RedirectConst.CONTACT_PAGE:
			response.sendRedirect(RedirectConst.CONTACT_PAGE_PATH);
			break;
		case RedirectConst.CART_PAGE:
			response.sendRedirect(RedirectConst.CART_PAGE_PATH);
			break;
		case RedirectConst.CATALOG_PAGE:
//			response.sendRedirect(RedirectConst.CATALOG_PAGE_PATH);
			request.getRequestDispatcher(RedirectConst.CATALOG_PAGE_PATH).forward(request, response);
			break;

		default:
			break;
		}
	}

}

