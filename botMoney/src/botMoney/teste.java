package botMoney;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//TAG POS=1 TYPE=INPUT:TEXT FORM=ACTION:https://app.amazonpedido.com/#/login ATTR=* CONTENT=91993798914

class teste {

	public static void main(String[] args) {

		File file = new File("drivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

		
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(false);
		WebDriver driver = new ChromeDriver(options);
		
		
		
		String login = "gcxmtv@gmail.com";
		String password = "Alice!@1";

		String xPathLoginFacebook = "//*[@id=\"email\"]";
		String xPathSenhaFacebook = "//*[@id=\"pass\"]";
		

		String menuLateral = "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i";
		String menuLogout = "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[1]/div/i";
		String postPensando = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span";
		String campoPostPensando = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div";
		String botaoPost = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[2]/div/div/span";		
		String postTest = "Testando as funcoes de meu bot!!! Mensagem automatica.. Ignorem!";
		
		String inicioPerfil = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div";
		String fotosPerfil = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/a[4]/div/span";
		String primeiraFoto = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div/div/div/div/div/div/div/div/div[3]/div[1]/div[1]/div/div/a/img";
		
		
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath(xPathLoginFacebook)).sendKeys(login);
		driver.findElement(By.xpath(xPathSenhaFacebook)).sendKeys(password + Keys.ENTER);
	
		driver.findElement(By.xpath(inicioPerfil)).click();
		driver.findElement(By.xpath(fotosPerfil)).click();
		driver.findElement(By.xpath(primeiraFoto)).click();
		driver.findElement(By.xpath(botaoPost)).click();
		
		//driver.findElement(By.xpath(menuLateral)).click();
		//driver.findElement(By.xpath(menuLogout)).click();
		

		// driver.close();

	}
}
