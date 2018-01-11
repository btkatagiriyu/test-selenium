package com.example.app.welcome;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HelloControllerTest {

    @Test
    public void test() {

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference(FirefoxProfile.ALLOWED_HOSTS_PREFERENCE, "localhost");
        
        FirefoxDriver driver = new FirefoxDriver(profile);
        driver.get("http://localhost:8080/test-selenium/");

        assertThat(driver.findElementByTagName("h1").getText(), is("Hello world!"));
        
    }

}
