package mypack;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class Notepad {
	@Test
	public void f() {
		try{
			Runtime.getRuntime().exec("notepad.exe");
			for(int i=0;i<=10;i++){
				StringSelection x = new StringSelection("Hi this is google maps and sakher");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}

		}
		catch(Exception e){

		}
	}
}
