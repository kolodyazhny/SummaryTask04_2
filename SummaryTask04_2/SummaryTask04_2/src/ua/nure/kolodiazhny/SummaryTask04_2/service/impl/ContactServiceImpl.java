package ua.nure.kolodiazhny.SummaryTask04_2.service.impl;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ua.nure.kolodiazhny.SummaryTask04_2.service.ContactService;
import ua.nure.kolodiazhny.SummaryTask04_2.support.order.MailHelper;
import ua.nure.kolodiazhny.SummaryTask04_2.support.order.Sender;
import ua.nure.kolodiazhny.SummaryTask04_2.web.model.transfer.ContactTransferBean;

/**
 * Used for sending email to administration.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public class ContactServiceImpl implements ContactService {

	/**
	 * Logger.
	 */
	private final static Logger LOG = Logger.getLogger(ContactServiceImpl.class);

	/*
	 * Sends email.
	 *
	 * @see ua.nure.tarianyk.SummaryTask4.service.ContactService#send(ua.nure.
	 * tarianyk.SummaryTask4.web.model.transfer.ContactTransferBean)
	 */
	@Override
	public void send(HttpServletRequest request, ContactTransferBean contactTransferBean)
			throws AddressException, MessagingException, IOException {
		LOG.log(Level.DEBUG, "Method send starts.");

		Sender send = new Sender(request, request.getSession(false).getServletContext().getInitParameter("login"),
				contactTransferBean.getSubject(), contactTransferBean.getMessage(), null, false);
		send.setDaemon(true);
		send.start();

		LOG.log(Level.DEBUG, "Method send finished.");
	}

}
