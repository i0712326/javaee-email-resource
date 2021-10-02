package pro.tikkwiki.java.ee.mail;

import javax.ejb.Local;

@Local
public interface JavaMailEjbLocal {
	public void send(String addresses, String topic, String textMessage);
	 public void receive();
}
