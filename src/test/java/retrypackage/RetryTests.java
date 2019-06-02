package retrypackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests {

	@Test

	public void test() {
		Assert.assertEquals(true, true);
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}

}
