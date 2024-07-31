package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;

public class BasePage extends BaseClass{
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;

	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	 
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement ShoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishListLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
		
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndshoesLink;
    
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitaldownloadsLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;
	 
	@FindBy(id ="small-searchterms")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@v]alue='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutLink;
	 
	
    /**
     * 
     * getter
     */
	
	/**
	 * this method is used to access the registrction link
	 * @return
	 */
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getLogoutLink() {
		
		return logoutLink;
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndshoesLink() {
		return apparelAndshoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}

}
