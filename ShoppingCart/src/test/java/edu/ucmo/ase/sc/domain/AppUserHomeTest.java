/**
 * 
 */
package edu.ucmo.ase.sc.domain;

import junit.framework.TestCase;

/**
 * @author dhakshin
 *
 */
public class AppUserHomeTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link edu.ucmo.ase.sc.domain.AppUserHome#persist(edu.ucmo.ase.sc.domain.AppUser)}.
	 */
	public void testPersist() {
		AppUser user = new AppUser();
		user.setFirstName("testFirst");
		user.setLastName("testLast");
		user.setGender("Maler");
		AppUserHome userHome = new AppUserHome();
		userHome.persist(user);
//		fail("Not yet implemented");
		
	}

}
