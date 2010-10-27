package com.edpichler.osgi.bovespa.test;

import junit.framework.TestSuite;

public class Suite extends TestSuite {
	public static junit.framework.Test suite() {
		TestSuite suite = new TestSuite("OSGi Bovespa QuotesTest Suite");
		suite.addTestSuite(BovespaQuotesTest.class);
		return suite;
	}
}
