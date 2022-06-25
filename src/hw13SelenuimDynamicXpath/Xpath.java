package hw13SelenuimDynamicXpath;

public class Xpath {
	   //1
	////input[@id='SearchBar-input']
	//by Tag with a single atribute(Kroger)
	     //2
	//button[@id='ExposedMenu-Category-Popular' or class='font-500 hover:underline ExposedMenu-TopNav bg-default-50 body-m']
//	by Tag with multiple attribute with 'or' logic
	     //3
	///button[@id='ExposedMenu-Category-Popular' and 'class=font-500 hover:underline ExposedMenu-TopNav bg-default-50 body-m']
	//with 'and' logic
	      //4
	////button[text()='Savings']
	//by Tag with inner text
	       //5
	//button[contains(text(),'Pharmacy and ')]
	//by Tag inner(partial) text
	       //6
	//button[contains(@id, 'ExposedMenu-Category-Departments')]
	//Tag with attributes & use of contains
	
	   //7
	//button[normalize-space(text() )='Pharmacy and Health']
	//Tag nomalize-space
	
  //8
	//button[starts-with(text(),'Planning')]
	//Tag with starts-with text
	
	//9
	//button[starts-with(@id,ExposedMenu-Category-Discover)]
	// Tag with starts-with attribute
	
	

}
