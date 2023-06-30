package com.AmazonCA.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmazonCA.qa.base.TestBase;

public class Homepage extends TestBase {
	
	//PageFactory
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtextbox;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement amazonlogo;
	
	@FindBy(xpath="//body[@class='a-aui_72554-c a-aui_accordion_a11y_role_354025-t1 a-aui_killswitch_csa_logger_372963-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate']/div[@id='a-page']/div[@id='navFooter']/div[@class='navFooterVerticalColumn navAccessibility']/div[@class='navFooterVerticalRow navAccessibility']/div[1]")
	WebElement footer;
	//List<WebElement> footerlist=footer.findElements(By.tagName("a"));
	
	//@FindBy(xpath="//label[@id='searchDropdownDescription']")
	//WebElement dropdownbox;
	//List<WebElement> options=dropdownbox.findElements(By.xpath("//option[contains@value='search-alias']"));
		
	public Homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public boolean logopresent() {
	 return amazonlogo.isDisplayed();
	}
	public boolean footerpresent() {
		 return footer.isDisplayed();
		}
		
	public String validatehomepagetitle() {
		return driver.getTitle();
			}
	
	}
