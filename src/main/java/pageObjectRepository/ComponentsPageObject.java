package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
//		stepDefinitions
	}
	@FindBy(xpath="//a[text()='Components']")
	private WebElement components;
	
	@FindBy(xpath="//a[text()='Show All Components']")
	private WebElement showAllComponents;
	
	@FindBy(xpath="//a[text()='Mice and Trackballs (0)']")
	private WebElement miceAndTracjballs;
	
	@FindBy(xpath="//a[text()='Monitors (2)']")
	private WebElement monitors;
	
	@FindBy(xpath="//a[text()='Printers (0)']")
	private WebElement printers;
	
	@FindBy(xpath="//a[text()='Scanners (0)']")
	private WebElement scanners;

	@FindBy(xpath="//a[text()='Web Cameras (0)']")
	private WebElement webCameras;
	
	
	
	
	
	
}
