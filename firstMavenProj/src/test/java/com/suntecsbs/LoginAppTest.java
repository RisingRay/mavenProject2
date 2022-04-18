package com.suntecsbs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAppTest {

	@Test

	public void loginTest1() {

		Assert.assertEquals(0, new LoginApp().credCheck("nichy", "nimmy"));
	}

	@Test

	public void loginTest2() {
		Assert.assertEquals(1, new LoginApp().credCheck("adhi", "adhi123"));
	}

}
