package pro.tikkwiki.java.ee.mail;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Session Bean implementation class JavaMailEjb
 */
@Stateless(mappedName = "javaMailEjb")
public class JavaMailEjb implements JavaMailEjbLocal {
	private static Logger logger = Logger.getLogger(JavaMailEjb.class.getName());
	@Resource(name = "java:jboss/mail/imaps")
	private Session sessionImaps;
	@Resource(name = "java:jboss/mail/smtp")
	private Session sessionSmtp;
    /**
     * Default constructor. 
     */
    public JavaMailEjb() {
        super();
    }

	@Override
	public void send(String addresses, String topic, String textMessage) {
		try {

            Message message = new MimeMessage(sessionSmtp);
            message.setFrom(new InternetAddress("test@mail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
            message.setSubject(topic);
            message.setText(textMessage);

            Transport.send(message);

        } catch (MessagingException e) {
            logger.log(Level.ALL, "Cannot send mail", e);
        }
		
	}

	@Override
	public void receive() {
		try {
			Store store = sessionImaps.getStore("imaps");
			store.connect("outlook.office365.com","test@hotmail.com", "P@assw0rd");
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);
			Message[] messages = inbox.getMessages();

			for (int i = 0; i < messages.length; ++i) {
				System.out.println("MESSAGE #" + (i + 1) + ":");
				Message msg = messages[i];

				System.out.println("Subject :" + msg.getSubject());
				
				if(i==10) break;
				
			}
			inbox.close(false);
			store.close();
		} catch (MessagingException e) {
			logger.log(Level.ALL, "Exception occured while trying to get email");
		}
		
	}
    

}
