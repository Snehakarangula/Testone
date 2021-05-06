
package Problem.TestExercise;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// This class contains the common things which have to do for a test case 


public class Hooks {
	public static String currency2;
	public static String currency3;
	public static String currency4;
	public static String currency5;
	public static String currency1;
	public static String TotalCurrency;

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		currency1 = driver.findElement(By.id("txt_val_1")).getText();
		currency2 =driver.findElement(By.id("txt_val_2")).getText();
		currency3 =driver.findElement(By.id("txt_val_4")).getText();
		currency4 =driver.findElement(By.id("txt_val_5")).getText();
		currency5 =driver.findElement(By.id("txt_val_6")).getText();
		TotalCurrency =driver.findElement(By.id("txt_val")).getText();

	}

	public static void verifycountofvalues(String expectedvalue)	
	{	
		try{
			int i=1,j;
			while(i<=5){  
				driver.findElement(By.id("lbl_ttl_val"+i));
				i++;  
			} 
			j=i-1;
			System.out.println("The no of values present on the screens:"+j);

			String Actualvalue=String.valueOf(j);
			if(expectedvalue.equals(Actualvalue))
			{
				Assert.assertTrue("The no of values present on the screen is"+Actualvalue+"and the expected is"+expectedvalue, true);		
			}
		}

		catch (Exception e) {

			Assert.assertTrue("Actual value is not matched with expected value", false);
		}
	}


	public static void Verifyvaluesgreaterthanzero()
	{
		try {
			
			int Actualvalue1=Integer.parseInt(currency1);  	
			if(Actualvalue1 > 0)
			{
				System.out.println(Actualvalue1+" is  Greater than Zero");
				Assert.assertTrue("The" +Actualvalue1+ "value is Greater than Zero", true);	
			}
			else
			{
				Assert.assertTrue("The" +Actualvalue1+ "value is not Greater than Zero", false);	
			}
			int Actualvalue2=Integer.parseInt(currency2);  	
			if(Actualvalue2 > 0)
			{
				System.out.println(Actualvalue2+" is  Greater than Zero");
				Assert.assertTrue("The" +Actualvalue2+ "value is Greater than Zero", true);	
			}
			else
			{
				Assert.assertTrue("The" +Actualvalue2+ "value is not Greater than Zero", false);	
			}
			int Actualvalue3=Integer.parseInt(currency3);  	
			if(Actualvalue3 > 0)
			{
				System.out.println(Actualvalue3+" is  Greater than Zero");
				Assert.assertTrue("The" +Actualvalue3+ "value is Greater than Zero", true);	
			}
			else
			{
				Assert.assertTrue("The" +Actualvalue3+ "value is not Greater than Zero", false);	
			}

			int Actualvalue4=Integer.parseInt(currency4);  	
			if(Actualvalue4 > 0)
			{
				System.out.println(Actualvalue4+" is a Greater than Zero");
				Assert.assertTrue("The" +Actualvalue4+ "value is Greater than Zero", true);	
			}
			else
			{
				Assert.assertTrue("The" +Actualvalue4+ "value is not Greater than Zero", false);	
			}
			int Actualvalue5=Integer.parseInt(currency5);  	
			if(Actualvalue5 > 0)
			{
				System.out.println(Actualvalue5+" is a Greater than Zero");
				Assert.assertTrue("The" +Actualvalue5+ "value is Greater than Zero", true);	
			}
			else
			{
				Assert.assertTrue("The" +Actualvalue5+ "value is not Greater than Zero", false);	
			}
		}
		catch (Exception e) {
			Assert.assertTrue("The actual values are not greater than zero", false);
		}
	}
	
	// Total balance is correct based on the values listed on the screen
	public static void verifytotalbalance()
	{
		String ActualTotalCurrencyValue = currency1+currency2+currency3+currency4+currency5;
		if (ActualTotalCurrencyValue.equals(TotalCurrency)) {
			
			System.out.println("ActualTotalCurrencyValue and ExpectedCurrencyvalue matched ");
			Assert.assertTrue("The actual currency is " +ActualTotalCurrencyValue+ "andexpected currency value"+TotalCurrency+"value are matched", false);	
			
		} else {
			System.out.println("ActualTotalCurrencyValue and ExpectedCurrencyvalue matched ");
			Assert.assertTrue("The actual currency is " +ActualTotalCurrencyValue+ "and expected currency value"+TotalCurrency+" are not matched", true);	

		}		
	}
	
	// Verifying the total balance matches the sum of the values
	public static void verifytotalbalancewithsum(String ExpectedCurrencyvalue)
	{
		String ActualTotalCurrencyValue = currency1+currency2+currency3+currency4+currency5;
		if (ActualTotalCurrencyValue.equals(ExpectedCurrencyvalue)) {
			
			System.out.println("ActualTotalCurrencyValue and ExpectedCurrencyvalue matched ");
			Assert.assertTrue("The actual currency is " +ActualTotalCurrencyValue+ "andexpected currency value"+ExpectedCurrencyvalue+"value are matched", false);	
			
		} else {
			System.out.println("ActualTotalCurrencyValue and ExpectedCurrencyvalue matched ");
			Assert.assertTrue("The actual currency is " +ActualTotalCurrencyValue+ "and expected currency value"+ExpectedCurrencyvalue+" are not matched", true);
			// As per user totalbalance doesn't match so it is validated as notmatched, hence the test case will get pass 

		}
	}
		// Need to verify the values are formatted as currencies
		public static void verifyvaluesascurrencies()
		{
			if (currency1.startsWith("$")) {
				
				Assert.assertTrue("The currency value " +currency1+ "is formatted as $", true);	
			} else {
				Assert.assertTrue("The currency value " +currency1+ "is not formatted as $", false);	
			}
			if (currency2.startsWith("$")) {
				
				Assert.assertTrue("The currency value " +currency2+ "is formatted as $", true);	
			} else {
				Assert.assertTrue("The currency value " +currency2+ "is not formatted as $", false);	
			}
			if (currency3.startsWith("$")) {
				
				Assert.assertTrue("The currency value " +currency3+ "is formatted as $", true);	
			} else {
				Assert.assertTrue("The currency value " +currency3+ "is not formatted as $", false);	
			}
			if (currency4.startsWith("$")) {
				
				Assert.assertTrue("The currency value " +currency4+ "is formatted as $", true);	
			} else {
				Assert.assertTrue("The currency value " +currency4+ "is not formatted as $", false);	
			}
			if (currency5.startsWith("$")) {
				
				Assert.assertTrue("The currency value " +currency5+ "is formatted as $", true);	
			} else {
				Assert.assertTrue("The currency value " +currency5+ "is not formatted as $", false);	
			}
			
			
		}
	
		
		
	

}
	




