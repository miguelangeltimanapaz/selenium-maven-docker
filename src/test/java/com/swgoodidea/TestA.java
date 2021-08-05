package com.swgoodidea;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.net.MalformedURLException;

public class TestA {

	private static RemoteWebDriver webdriver = null;
	public static String remote_url_chrome = "http://3.82.230.88:4444/wd/hub";

	@BeforeClass
	public void setUp() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
        webdriver = new RemoteWebDriver(new URL(remote_url_chrome), options);
		System.out.println("*******************");
		System.out.println("launching browser");

	}

	@Test
	public void testGooglePageTitle() {
		//WebDriver webdriver = driver.get();
		webdriver.navigate().to("https://www.google.com");
		String strPageTitle = webdriver.getTitle();
		System.out.println("Título de la página: - "+strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Página del título no coincide");
	}
}
