package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class Third {
	WebDriver driver;
	String text;
	public Third(String searchtext)
	{
		
	}
	@Parameters
	public static Collection<Object[]> data()
	{
		Object[][] data=new Object[][]
		{
			{"mindq"},
			{"selenium"},
			{"junit"}
		};
		return Arrays.asList(data);
	}
}
