package introductions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/introductions.xml")
public class IntroductionsTest {

	@Autowired
	private Bean bean;

	@Test
	public void testIntroduction() {
		for (int i = 0; i < 10; i++) {
			bean.doIt();
		}
		Assert.assertEquals(10, ((CallCounter) bean).getCounter());
	}
}
