package org.stepdefinition;

import org.junit.After;
import org.junit.Before;

public class hiiks extends BaseClass {
@Before
private void precondition() {
	launchTheBrowser();
	windowMax();

}

@After
private void postcondition() {
	driver.close();

}
}
