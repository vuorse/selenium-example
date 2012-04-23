
package com.houston.seleniumtest;

import com.thoughtworks.selenium.DefaultSelenium;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeleniumExampleTest {

    protected DefaultSelenium createSeleniumClient(String url) throws Exception {
        return new DefaultSelenium("localhost", 4444, "*firefox", url);
    }

    @Test
    public void testSomethingSimple() throws Exception {
        DefaultSelenium selenium = createSeleniumClient("http://www.houston-inc.com/");
        selenium.start();

        selenium.open("/");
        selenium.waitForPageToLoad("30000");
        assertEquals("Etusivu | Houston Inc.", selenium.getTitle());
        selenium.isTextPresent("Kehitämme vaativia liiketoimintasovelluksia suurille yrityksille.");

        selenium.stop();
    }

}
