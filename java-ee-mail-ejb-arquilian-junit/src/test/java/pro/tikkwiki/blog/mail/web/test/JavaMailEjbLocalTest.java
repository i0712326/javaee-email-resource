package pro.tikkwiki.blog.mail.web.test;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import pro.tikkwiki.java.ee.mail.JavaMailEjb;
import pro.tikkwiki.java.ee.mail.JavaMailEjbLocal;

@RunWith(Arquillian.class)
public class JavaMailEjbLocalTest {
	
	@Deployment
	public static Archive<?> createTestArchive() {
		return ShrinkWrap.create(WebArchive.class, "ApplicationUntitTest.war")
				.addClass(JavaMailEjbLocal.class)
				.addClass(JavaMailEjb.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}
	
	@EJB
	private JavaMailEjbLocal javaMailEjb;
	
	@Test
	public void testSend() {
		javaMailEjb.send("test@mail.com", "test email 002", "Hello Test Test Test");
		Assert.assertTrue(true);
	}

	@Test
	public void testReceive() {
		javaMailEjb.receive();
		Assert.assertTrue(true);
	}

}
