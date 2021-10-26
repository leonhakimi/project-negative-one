package com.revature.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http:localhost:8080");
		
		WebElement addInput1 = driver.findElement(By.id("addNumber1"));
		WebElement addInput2 = driver.findElement(By.id("addNumber2"));
		WebElement addButton = driver.findElement(By.id("addButton"));
		
		addInput1.sendKeys("10");
		addInput2.sendKeys("15");
		addButton.click();
		
		driver.switchTo().frame("addResult");
		WebElement addResult = driver.findElement(By.tagName("pre"));
		System.out.println(addResult.getText());
		driver.switchTo().defaultContent();
		
		WebElement subtractInput1 = driver.findElement(By.id("subtractNumber1"));
		WebElement subtractInput2 = driver.findElement(By.id("subtractNumber2"));
		WebElement subtractButton = driver.findElement(By.id("subtractButton"));
		
		subtractInput1.sendKeys("30");
		subtractInput2.sendKeys("10");
		subtractButton.click();
		
		driver.switchTo().frame("subtractResult");
		WebElement subtractResult = driver.findElement(By.tagName("pre"));
		System.out.println(subtractResult.getText());
		driver.switchTo().defaultContent();
		
		WebElement multiplyInput1 = driver.findElement(By.id("multiplyNumber1"));
		WebElement multiplyInput2 = driver.findElement(By.id("multiplyNumber2"));
		WebElement multiplyButton = driver.findElement(By.id("multiplyButton"));
		
		multiplyInput1.sendKeys("3");
		multiplyInput2.sendKeys("5");
		multiplyButton.click();
		
		driver.switchTo().frame("multiplyResult");
		WebElement multiplyResult = driver.findElement(By.tagName("pre"));
		System.out.println(multiplyResult.getText());
		driver.switchTo().defaultContent();
		
		
		WebElement divideInput1 = driver.findElement(By.id("divideNumber1"));
		WebElement divideInput2 = driver.findElement(By.id("divideNumber2"));
		WebElement divideButton = driver.findElement(By.id("divideButton"));
		
		divideInput1.sendKeys("50");
		divideInput2.sendKeys("5");
		divideButton.click();
		
		driver.switchTo().frame("divideResult");
		WebElement divideResult = driver.findElement(By.tagName("pre"));
		System.out.println(divideResult.getText());
		driver.switchTo().defaultContent();
		
		
		//WebElement iframe = driver.findElement(By.id("result"));
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
