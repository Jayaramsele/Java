package seleniumProgram;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: 
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantiate the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Launch the url in the chosen browser
		// Load a new web page in the current browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the screen
		driver.manage().window().maximize();
		// Locate the webelement (DOM)
		
		WebElement webUsername = driver.findElement(By.id("username"));
		webUsername.sendKeys("demosalesmanager");
		
		// driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		WebElement webPassword = driver.findElement(By.id("password"));
		webPassword.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Get the title of the current page. 
		String orgTitle = "Leaftaps - TestLeaf Automation Platform";
		String title = driver.getTitle();
		
		if(orgTitle.equals(title))
			System.out.println("Landed in the login page correctly ");
		else
			System.out.println("Incorrect landing of the page");
		// click on CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				// click on Leads tab
				driver.findElement(By.linkText("Leads")).click();
				// click on create lead link
				driver.findElement(By.linkText("Create Lead")).click();
				// Enter the cmpny name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				// Enter the first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaram");
				// Enter the last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suriyaraj");
				// Enter the Source
			    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			    Select s1=new Select(source);
			    s1.selectByVisibleText("Employee");
			    //Enter the marketing campaign
			    WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			    Select mc=new Select(marketing);
			    mc.selectByVisibleText("Automobile");
			    //Enter the Local Firstname
			    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sachin");
			  //Enter the Local lastname
			    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Tendulkar");
			    //Enter the Salutation
			    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR.");
			    //Enter the Birthdate
			    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/01/1950");
			    //Enter the Title
			    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("M.Tech");
			    //Enter the Department
			    driver.findElement(By.name("departmentName")).sendKeys("Power Electronics");
			    //annualRevenue
			    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000000");
			    //preferred currency
			    WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
			    Select cur=new Select(currency);
			    cur.selectByValue("ALL");
			    //Industry
			    WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			    Select ind=new Select(industry);
			    ind.selectByIndex(4);
			    //employee
			    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000000");
			    //ownership
			    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			    Select owner=new Select(ownership);
			    owner.selectByVisibleText("Corporation");
			    //SIC Code
			    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("612001");
			    //TickerSymbol
			    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$$$$$$$$$$$");
			    //Description
			    driver.findElement(By.id("createLeadForm_description")).sendKeys("This is m first assignment in selenium");
			    //ImportantNote
			    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Java is Case Sensitive");
			    
			    // Enter the Country Code 
				 WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				 countryCode.clear();
				 countryCode.sendKeys("2");
				 //Enter the Area Code
				 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6000009");
				 //Enter the phoneNumber
				 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2432543");
				 //Extension
				 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
				 //Email Id
				 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jayaram.s14@gmail.com");
				 //web url
				 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.Leafftaps.com");
				 //to name
				 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("TestLeaf");
				 //attention name
				 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Director");
				 //address1
				 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no6 Vivekanandhar street");
				 //address2
				 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("dubai main road");
				 //city
				 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dubai");
				 //State/province
				 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				 state.sendKeys("Alaska");
				 //postal code
				 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("99501");
				 //country
				 WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				 Select coun=new Select(country);
				 coun.selectByValue("CHE");
				 //postal code
				 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("9485");
			
				// click on Create lead button
				driver.findElement(By.className("smallSubmit")).click();
	 
				// title : View Lead | opentaps CRM
				// To be done
				
				// Verify if the view page occurs successfully
				String yestitle="View Lead | opentaps CRM";
				String title1 = driver.getTitle();
				if(yestitle.equals(title1))
					System.out.println("Verified the page");
				else
					System.out.println("Incorrect page");
	
	}

}
