package hw13SelenuimDynamicXpath;

public class Xpath {
	   /*
	    * 1 by Tag with a single atribute
	    * Kroger Search bar.......>//input[@id='SearchBar-input']
	    * Kroger ExposedMenu Popular......>//button[@id='ExposedMenu-Category-Popular']
	    * Kroger Sign In Button...............>//button[@id='SignIn-submitButton']
	    * Kroger ExposedMenu Department.......>//button[@id='ExposedMenu-Category-Departments']
	    * Kroger ExposedMenu Payments and Services....>//button[@id='ExposedMenu-Category-Payments and Services' and @class='font-500 hover:underline ExposedMenu-TopNav bg-default-50 body-m']
	    */
	
	     /*(2) by Tag with multiple attribute with 'or' logic
	     * 
	      * kroger SearchBar...........>//input[@id='SearchBar-input-open' or @class='kds-Input kds-FormField-input--withIconButton']
	      * Macys Bag icon............>//span[@id='bag-icon-reskin' or @class='bag-icon-reskin bag-icon-reskin-star']
	      * Macys wedding Registry.....>//a[@id='registry-link' or @title='Wedding Registry']
	      * Macys Sign In button.........>//input[@id='sign-in' or @class='button expanded']
	      * Macys Create Account.........>//a[@id='standard-sign-up' or @class='button secondary expanded']
	      */
	
	 
	
	
	
	/*3	with 'and' logic
	 * Macys Bag icon............>//span[@id='bag-icon-reskin' and @class='bag-icon-reskin bag-icon-reskin-star']
	 * Macys Sign in button.....>//input[@id='sign-in' and @class='button expanded']
	 * Macys wedding Registry.........>//a[@id='registry-link' and @title='Wedding Registry']
	 * Macys Create Account............>//a[@id='standard-sign-up' and @class='button secondary expanded']
	 * Macys Forgot Your Password.........>//a[@id='forgot-password' and @class='button tertiary login365-fyp']
	 */
	
	/*(4)by Tag with 'inner text'
	 * Kroger ExposedMenu Popular.......>//button[text()='Popular']
	 * Kroger ExposedMenu Departments......>//button[text()='Departments']
	 * Kroger ExposedMenu Savings............>//button[text()='Savings']
	 * Kroger ExposedMenu Our Brands.......>//button[text()='Our Brands']
	 * Kroger ExposedMenu Pharmacy and Health......>//button[text()='Pharmacy and Health']
	 */
	
	     
	/*(5) Tag with inner (partial)text
	 * Kroger ExposedMenu Departments......>//button[contains(text(),'Depart')]
	 * Kroger ExposedMenu Popular...........>//button[contains(text(),'Popu')]
	 * Kroger ExposedMenu Savings.........>//button[contains(text(),'Sav')]
	 * Kroger ExposedMenu Pharmacy and Health....>//button[contains(text(),'Pharmacy and ')]
	 * Kroger ExposedMenu Our Brands.......>//button[contains(text(),'Our ')]
	 */
	
	/*
	 * (6)Tag with attributes & use of contains
	 *  Kroger ExposedMenu Department.........>//button[contains(@id, 'ExposedMenu-Category-Departments')]
	 * Kroger ExposedMenu Popular.................>//button[contains(@id,'ExposedMenu-Category-Popular')]
	 * Kroger ExposedMenu 
	 * Kroger ExposedMenu 
	 */
	
	/*(7)Tag nomalize-space
	 *Kroger ExposedMenu Pharmacy and Health....>//button[normalize-space(text() )='Pharmacy and Health']
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 */
	
	/*(8)Tag with starts-with text'
	 * Kroger ExposedMenu Planning......>//button[starts-with(text(),'Planning')]
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 */
	
	/*(9)Tag with starts-with attribute
	 * Kroger ExposedMenu Dicover.....>//button[starts-with(@id,ExposedMenu-Category-Discover)]
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 * Kroger ExposedMenu Departmen
	 */
	       
	 
 

	

}
