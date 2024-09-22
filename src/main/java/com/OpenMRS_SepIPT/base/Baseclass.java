package com.OpenMRS_SepIPT.base;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Baseclass {
		//WebDriver driver= new ChromeDriver();
		  protected static WebDriver driver;

		  public static ExtentReports extendReports;

		  public static File file;
	//BROWSER LAUNCH= TO LAUNCH A BROWSER
		 //======================================================================================
		protected static WebDriver browserLaunch(String browserName) {
			try {
				if (browserName.equalsIgnoreCase("chrome")) {

					 ChromeOptions options = new ChromeOptions();

					 //options.addArguments("incognito");
					 options.addArguments("start-maximized");

					// options.addArguments("headless");


					driver= new ChromeDriver(options);


				}else if (browserName.equalsIgnoreCase("edge")){
					 driver= new EdgeDriver();

				}else if (browserName.equalsIgnoreCase("firefox")){
					 driver= new FirefoxDriver();

				}

				else {
					System.out.println("INVALID BROWSER NAME");

				}
				//driver.manage().window().maximize();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return driver;
		}

	//URL LAUNCH = TO LAUNCH AN URL LIKE "WWW.AMAZON .IN"//
			//======================================================================================

			protected static void urlLaunch(String url) {
				try {
					driver.get(url);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//======================================================================================

		//======================================================================================

		//INPUT VALUES= TO PASS INPUT VALUES IN THE ELEMENT//
		//======================================================================================

		protected static void inputValues(WebDriver driver , WebElement element ,String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//======================================================================================



	//navigateTo
		//======================================================================================
		protected static void navigateTo(WebDriver driver , String navigateUrl) {
			try {
				driver.navigate().to(navigateUrl);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		/*
		 * Note: I have kept navigateTo method separately here as a choice and for my
		 * comfort
		 */
		//======================================================================================

	//NAVIGATE ALL ROUNDER METHOD
		//======================================================================================

		protected static void navigateAllRounderMethods(WebDriver driver , String navigateMethod,String navigateUrl) {
			try {
				if (navigateMethod.equalsIgnoreCase("back")) {
					driver.navigate().back();
				}
				else if (navigateMethod.equalsIgnoreCase("forward")) {
					driver.navigate().forward();
				}
				else if (navigateMethod.equalsIgnoreCase("refresh")) {
					driver.navigate().refresh();
				}
				else if (navigateMethod.equalsIgnoreCase("to")) {
					driver.navigate().to(navigateUrl);
				}else {
					System.out.println("INVALID ENTRY! PLEASE CHECK THE ENTRY IN NAVIGATE ALL ROUNDER METHODS FOR CLARITY");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 * NOTE1: IN THIS METHODS IN navigateMethod = THE POSSIBLE VALUES ARE = 1] to 2] back 3]forward 4] refresh
		 * NOTE2: IN THIS METHOD ONLY WHEN "to" keyword is used in navigateMethod we have to give the "navigateUrl" link
		 *
		 * following are the example of using this method
		 * navigateAllRounderMethods(driver, "to", "https://www.amazon.in");
		 * navigateAllRounderMethods(driver, "back", null);
		 * navigateAllRounderMethods(driver, "forward", null);
		 * navigateAllRounderMethods(driver, "refresh", null);
		 */

		//======================================================================================


	//SIMPLE ALERT
		//======================================================================================
		protected static void simpleAlert() {
			try {
				//accept
//				driver.findElement(By.id("accept")).click();
				Alert alert	= driver.switchTo().alert();
				String text =alert.getText();
				System.out.println("Simple Alert Text  "+ text);
				alert.accept();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//======================================================================================

	//PROMPT ALERT
		//======================================================================================
		protected static void promptAlert(String text_to_be_typed, String Element_Id) {
			try {
				driver.findElement(By.id("prompt")).click();
				Alert alert = driver.switchTo().alert();
				alert.sendKeys(text_to_be_typed);
				alert.accept();

				String name= driver.findElement(By.id(Element_Id)).getText();
				System.out.println(name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//======================================================================================

		//isDisplayed_Enabled_Selected_AllRounderMethod
		//======================================================================================
		protected static void isDisplayed_Enabled_Selected_AllRounderMethod(WebDriver driver, WebElement element, String requisiteFunction ) {


			try {
				if (requisiteFunction.equalsIgnoreCase("displayed")) {
					if  (element.isDisplayed()) {
						System.out.println("Element is Displayed");
					}else {
						System.out.println("Element is not Displayed");
					}

				}
				else if (requisiteFunction.equalsIgnoreCase("enabled")) {

					if  (element.isEnabled()) {
						System.out.println("Element is Enabled");
					}else {
						System.out.println("Element is not Enabled");
					}
				}
				else if (requisiteFunction.equalsIgnoreCase("selected")) {

					if  (element.isSelected()) {
						System.out.println("Element is Selected");
					}else {
						System.out.println("Element is not Selected");
					}
				}
				else {
					System.out.println("INVALID ENTRY! PLEASE CHECK THE requisiteFunction ENTRY IN isDisplayed_Enabled_Selected_AllRounderMethod");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/*
		 * Note:- Below given is the sample way to access this method
		 *
		 *
		 * navigateAllRounderMethods(driver, "to", "https://www.amazon.in"); WebElement
		 * k=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		 *
		 * isDisplayed_Enabled_Selected_AllRounderMethod(driver, k, "displayed") ;
		 *
		 * isDisplayed_Enabled_Selected_AllRounderMethod(driver, k, "enabled") ;
		 *
		 * isDisplayed_Enabled_Selected_AllRounderMethod(driver, k, "selected") ;
		 *
		 * isDisplayed_Enabled_Selected_AllRounderMethod(driver, k, "none") ;
		 *
		 */

		//======================================================================================

	//singleDropdown
		//======================================================================================

		protected static void singleDropdown(WebDriver driver,WebElement element, String option , String value  ) {
			 try {
				Select s= new Select(element);

				 if (option.equalsIgnoreCase("value")) {
					 s.selectByValue(value);
				 }else if (option.equalsIgnoreCase("text")) {
					 s.selectByVisibleText(value);
				 }else if (option.equalsIgnoreCase("index")) {
					 s.selectByIndex(Integer.parseInt(value));
				 }

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	//CLICK ELEMENT
		//======================================================================================

		protected static void clickElement(WebDriver driver, WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		//======================================================================================






	//IMPLICIT WAIT METHOD
		//======================================================================================

		protected static void implicitWait(WebDriver driver , int time) {
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//======================================================================================

	// EXPLICIT WAIT DISPLAYED
		//======================================================================================
		protected static void explicitWaitDisplayed(WebDriver driver , WebElement element , int time) {
			try {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));

				wait.until(ExpectedConditions.elementToBeClickable(element));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*
		 *
		 * Note:- A sample of how to use this method
		 * navigateAllRounderMethods(driver, "to", "https://www.amazon.in"); WebElement
		 * k=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		 * explicitWaitDisplayed(driver, k, 20); k.click();
		 *
		 *
		 *
		 */


		//======================================================================================




	//KEYBOARD ROBOT PRESS
		/*
		 * ( I HAVE CREATED THIS FOR 1]DOWN 2]ENTER 3] TAB) .fURTHER ADDITION WILL BE
		 * DONE IF REQUIRED
		 */
		//======================================================================================

		protected static void keyboardRobotPress(WebDriver driver, WebElement element , String keyboardFunction) throws AWTException {

			try {
				Robot robot = new Robot();

				if (keyboardFunction.equalsIgnoreCase("down")) {
					robot.keyPress(KeyEvent.VK_DOWN);
				}

				else if (keyboardFunction.equalsIgnoreCase("enter")) {
					robot.keyPress(KeyEvent.VK_ENTER);
				}
				else if (keyboardFunction.equalsIgnoreCase("tab")) {
					robot.keyPress(KeyEvent.VK_TAB);
				}
				else {
					System.out.println("INVALID ENTRY! CHECK keyboardFunction IN THE keyboardRobotPress METHOD");
				}
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
		/*
		 *
		 *
		 * try { Robot robot = new Robot();
		 *
		 * switch (keyboardFunction.toUpperCase()) { case "UP":
		 * robot.keyPress(KeyEvent.VK_UP); break; case "DOWN":
		 * robot.keyPress(KeyEvent.VK_DOWN); break; case "RIGHT":
		 * robot.keyPress(KeyEvent.VK_RIGHT); break; case "LEFT":
		 * robot.keyPress(KeyEvent.VK_LEFT); case "TAB":
		 * robot.keyPress(KeyEvent.VK_TAB); case "ENTER":
		 * robot.keyPress(KeyEvent.VK_ENTER); default:
		 * System.out.println("Invalid locator type"); return; } } catch (AWTException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 *
		 *
		 */

		//======================================================================================




	//FULL SCREENSHOT= CAPTURES THE FULL PAGE
	//======================================================================================

	protected static void takeFullScreenshot(WebDriver driver, String fileName, String format ) {

		try {
			TakesScreenshot ts=(TakesScreenshot)driver;

				File sourcefile = ts.getScreenshotAs(OutputType.FILE);


				//System.getProperty("user.dir") gets the project location dynamically
				File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\" + fileName + "." + format);

				//the below line will copy the sourcefile to target file
				sourcefile.renameTo(targetfile);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			}
	//======================================================================================

	//GET TITLE = GIVES THE PAGE TITLE
		//======================================================================================
		protected static void getTitle (WebDriver driver) {
		try {
			String title=driver.getTitle();
			System.out.println("Title is "+title);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
			}


		//======================================================================================

	//GET TITLE = GIVES THE PAGE TITLE
		//======================================================================================
			protected static void getCurrentUrl (WebDriver driver) {
			try {
				String currentUrl=driver.getCurrentUrl();
				System.out.println("The Current URL  is "+currentUrl);
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
					}
				}

			//======================================================================================



	//GET TEXT = GETS ALL THE TEXT AVAILABLE IN AN ELEMENT
		//======================================================================================
		protected static void getText(WebDriver driver, WebElement element) {
				try {
					String text=element.getText();
					System.out.println(text);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		//======================================================================================





	//TERMINATE BROWSER
	//======================================================================================
			protected static void browserTerminate(WebDriver driver) {

				try {
					driver.quit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

	//======================================================================================

	//QUIT BROWSER
	//======================================================================================
					protected static void quitBrowser(WebDriver driver) {
						try {
							driver.close();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
	//======================================================================================

					public static void extentReportStart(String location) {
						 extendReports =new ExtentReports();
						file = new File(location);
						ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
						extendReports. attachReporter(sparkReporter);
						extendReports. setSystemInfo("OS", System.getProperty("os.name"));
						extendReports. setSystemInfo( "Java Version", System.getProperty("java. version"));
						}


						public static void extentReportTearDown(String location) throws IOException {
						extendReports.flush();
						file = new File(location);
						Desktop.getDesktop() . browse((file) . toURI());

						}

						public String takeScreenshot() throws IOException {
						TakesScreenshot screenshot1 = (TakesScreenshot) driver;
						String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss") .format(new Date());

						File scrfile1 =screenshot1.getScreenshotAs(OutputType.FILE);

						File destfile1 =  new File("Screenshort\\.png" + "_" + timeStamp + ".png");

						FileUtils.copyFile(scrfile1, destfile1);
						return destfile1.getAbsolutePath();

						}

//						public static void validation(WebDriver act, String ect) {
//							Assert.assertEquals(act.getTitle(), ect);
							
						}


















	}

	
	


