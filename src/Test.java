import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32_74\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://gist.github.com/");
		driver.manage().window().maximize();
		
		//Test create public git
		//The description are the only things that needed
		
		driver.findElement(By.className("CodeMirror-scroll")).sendKeys("description");
		driver.findElement(By.name("gist[public]")).click();
		
		//Test edit public git
		//
		driver.findElement(By.className("btn btn-sm")).click();
		driver.findElement(By.className("CodeMirror-scroll")).sendKeys("description 2");
		driver.findElement(By.className("btn btn-primary")).click();
		
		//Test delete public git
		driver.findElement(By.className("btn btn-sm btn-danger")).click();
		
		//Test see public gist
		//I'm mot sure how to click the link, sorry
		
		System.out.println("Test End");
	}
}
