package mypack;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ShreenshortExample {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hdw.eweb4.com/out/1171857.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> imags=driver.findElements(By.tagName("img"));
		for(int i=0;i<imags.size();i++)
		{
			File sf=((FirefoxDriver)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage bi=ImageIO.read(sf);
			int x=imags.get(i).getLocation().getX();
			int y=imags.get(i).getLocation().getY();
			int w=imags.get(i).getSize().getWidth();
			int h=imags.get(i).getSize().getHeight();
			System.out.println(x+""+y+""+w+""+h);
			try
			{
				BufferedImage bg=bi.getSubimage(x, y, w, h);
				ImageIO.write(bg, "png", new File("E:\\myfile\\img"+i+".png"));
			}catch(Exception e)
			{
				System.out.println("image problem");
			}
		}
		driver.close();

	}

}
