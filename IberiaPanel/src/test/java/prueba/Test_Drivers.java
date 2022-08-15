package prueba;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_Drivers {
	
private static WebDriver driver;
	
	@Test
	public void driverChrome() {
	System.setProperty("webdriver.chrome.driver", "..\\IberiaPanel\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.iberia.com/");
	
	//Aceptar Cookies
	WebElement btnCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
	btnCookies.click();
	
	
	//Elegir Destino
	WebElement elementDestiny;
	elementDestiny = driver.findElement(By.id("flight_destiny1"));
	elementDestiny.sendKeys("Prag");
	elementDestiny = driver.findElement(By.className("ui-menu-item-link__city"));
	elementDestiny.click();
	
    

	//Selección Fecha Ida
	WebElement elementDatePicker = driver.findElement(By.xpath("//*[@id=\"flight_round_date1\"]"));
	//elementDatePicker.click();
	elementDatePicker.sendKeys("25112022");
	elementDatePicker.sendKeys(Keys.TAB);

	//Selección Fecha Vuelta
	WebElement elementDatePickerReturn = driver.findElement(By.xpath("//*[@id=\"flight_return_date1\"]"));
	//elementDatePicker.click();
	elementDatePickerReturn.sendKeys("28112022");
	elementDatePickerReturn.sendKeys(Keys.TAB);
	
	
	//Selección Pasajeros
	WebElement btnPassengers = driver.findElement(By.id("flight_passengers1"));
	btnPassengers.click();
	
	WebElement btnPassengerNumber = driver.findElement(By.xpath("//*[@id=\"people-counter-1\"]/ul/li[2]/div[2]/button[2]"));
	btnPassengerNumber.click();
	btnPassengerNumber.click();
	btnPassengerNumber.click();
	
	//Selección Pasajeros Niños
	WebElement btnPassengersKids = driver.findElement(By.id("flight_passengers1"));
	btnPassengersKids.click();
	
	WebElement btnNumberKids = driver.findElement(By.xpath("//*[@id=\"people-counter-1\"]/ul/li[5]/div[2]/button[2]"));
	btnNumberKids.click();
	btnNumberKids.click();
	
	//Click Buscar
	WebElement btnSearch = driver.findElement(By.id("buttonSubmit1"));
	btnSearch.click();
	
	
	


	

	
	

	
	
	
	


	

	//@Test
	//public void driverFireFox() {
	//System.setProperty("webdriver.gecko.driver", "..\\IberiaPanel\\Drivers\\geckodriver.exe");
	//driver= new FirefoxDriver();
	//}
	}
}
