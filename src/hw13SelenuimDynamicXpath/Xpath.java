package hw13SelenuimDynamicXpath;

public class Xpath {
	   /*
	    * (1) Tag with a single attribute
	    * Source: https://www.kroger.com/
	    * Kroger logo Image...................>//img[@class='Image']
	    * Kroger Search bar...................>//input[@id='SearchBar-input']
	    * Kroger ExposedMenu Popular......>//button[@id='ExposedMenu-Category-Popular']
	    * Kroger ExposedMenu Department.......>//button[@id='ExposedMenu-Category-Departments']
	    * Kroger ExposedMenu Payments and Services....>//button[@id='ExposedMenu-Category-Payments and Services' and @class='font-500 hover:underline ExposedMenu-TopNav bg-default-50 body-m']
	    */
	
	     /*(2) Tag with multiple attribute with 'or' logic
	     *()iSource: https://www.kroger.com/ https://www.macys.com
	      * kroger SearchBar...........>//input[@id='SearchBar-input-open' or @class='kds-Input kds-FormField-input--withIconButton']
	      * 
	      * (ii)Source: https://www.macys.com
	      * Macys Bag icon............>//span[@id='bag-icon-reskin' or @class='bag-icon-reskin bag-icon-reskin-star']
	      * Macys wedding Registry.....>//a[@id='registry-link' or @title='Wedding Registry']
	      * Macys Sign In button.........>//input[@id='sign-in' or @class='button expanded']
	      * Macys Create Account.........>//a[@id='standard-sign-up' or @class='button secondary expanded']
	      */
	
	 /*(3) Tag with 'and' logic
	 * Source: https://www.macys.com
	 * Macys Bag icon............>//span[@id='bag-icon-reskin' and @class='bag-icon-reskin bag-icon-reskin-star']
	 * Macys Sign in button.....>//input[@id='sign-in' and @class='button expanded']
	 * Macys wedding Registry.........>//a[@id='registry-link' and @title='Wedding Registry']
	 * Macys Create Account............>//a[@id='standard-sign-up' and @class='button secondary expanded']
	 * Macys Forgot Your Password.........>//a[@id='forgot-password' and @class='button tertiary login365-fyp']
	 */
	
	/*
	 * (4)Tag with 'inner text'
	 * Source: https://www.kroger.com/
	 * Kroger ExposedMenu Popular.......>//button[text()='Popular']
	 * Kroger ExposedMenu Departments......>//button[text()='Departments']
	 * Kroger ExposedMenu Savings............>//button[text()='Savings']
	 * Kroger ExposedMenu Our Brands.......>//button[text()='Our Brands']
	 * Kroger ExposedMenu Pharmacy and Health......>//button[text()='Pharmacy and Health']
	 */
	
	  /*
	 * (5) Tag with inner (partial)text
	 * Source: https://www.kroger.com/
	 * Kroger ExposedMenu Departments......>//button[contains(text(),'Depart')]
	 * Kroger ExposedMenu Popular...........>//button[contains(text(),'Popu')]
	 * Kroger ExposedMenu Savings.........>//button[contains(text(),'Sav')]
	 * Kroger ExposedMenu Pharmacy and Health....>//button[contains(text(),'Pharmacy and ')]
	 * Kroger ExposedMenu Our Brands.......>//button[contains(text(),'Our ')]
	 */
	
	/*
	 * (6)Tag with attributes & use of contains
	 * Source: https://www.kroger.com/
	 *  Kroger ExposedMenu Department.........>//button[contains(@id, 'ExposedMenu-Category-Departments')]
	 * Kroger ExposedMenu Popular.................>//button[contains(@id,'ExposedMenu-Category-Popular')]........
	 * Kroger ExposedMenu Saving..................>//button[contains(@id,'ExposedMenu-Category-Savings')]
	 * Kroger ExposedMenu Planning................>//button[contains(@id,'ExposedMenu-Category-Planning')]
	 * Kroger ExposedMenu Our Brands..............>//button[contains(@id,'ExposedMenu-Category-Our Brands')]
	 */
	
	/*
	 * (7) Nomalize-space
	 * Source: https://www.macys.com
	 * Macys shoes.............................>//span[normalize-space(text() ) ='Shoes']
	 * Macys Handbags........................>//span[normalize-space(text() ) ='Handbags']
	 * Macys Toys................................>//span[normalize-space(text() ) ='Toys']
	 * Macys Own Your Style.................>//span[normalize-space(text() ) ='Own Your Style']
	 *  Macys home..............................>//span[normalize-space(text() ) ='Home']
	 */
	
	/*(8)Tag with starts-with text'
	 * (i)Source:https://www.kroger.com/
	 * Kroger ExposedMenu Planning......>//button[starts-with(text(),'Planning')]
	 * kroger ExpMenu Pharmacy and Health.................>//button[starts-with(text(),'Pharmacy and Health')]
	 * 
	 * (ii)Source: https://www.macys.com
	 * Macys Beauty..........................>//span[starts-with(text(),'Beauty')]
	 * Macys Handbags.......................>//span[starts-with(text(),'Handbags')]
	 * Macys Kids................................>//span[starts-with(text(),'Kids')]
	 */
	
	/*(9)Tag with starts-with attribute
	 * 
	 * Kroger ExposedMenu Dicover.....>//button[starts-with(@id,'ExposedMenu-Category-Discover')]
	 * Kroger ExposedMenu Our Brans........>//button[starts-with(@id,'ExposedMenu-Category-Our Brands')]
	 * Kroger ExposedMenu Plannig............>//button[starts-with(@id,'ExposedMenu-Category-Planning')]
	 * 
	 * (ii)Source: https://www.macys.com
	 * Macys Wedding Registry......>//a[starts-with(@id,'registry-link')]
	 * Macys logo Image..............>//a[starts-with(@class,'header-logo__image')]
	 */
	       
	 
 

	

}
