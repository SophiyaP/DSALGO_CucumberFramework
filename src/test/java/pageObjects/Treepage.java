package pageObjects;

import static utils.configPropertiesFile.getPassword;
import static utils.configPropertiesFile.getUserName;
import static utils.configPropertiesFile.pythonCode;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Treepage {

WebDriver driver=null;
	
	public Treepage(WebDriver driver)  // create constructor to access these methods
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  // to initalise web elements
	}
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signInButton;
	
	@FindBy(xpath="//input[@id='id_username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	public void signInButton()
	{
		signInButton.click();
	}
	public void userName() throws IOException
	{
	username.sendKeys(getUserName());
	}
	public void password() throws IOException
	{
		password.sendKeys(getPassword());
	}
	public void loginButton()
	{
		loginButton.click();
	}
	
	
	@FindBy(linkText="Get Started")
	WebElement getStartedButton;
	
	public void getstarted()
	{
	getStartedButton.click();
	}
	
	@FindBy(xpath="//a[@href='tree']")
	WebElement getStarted;
	
	public void treeGetStrted()
	{
		getStarted.click();
	}
	@FindBy(xpath="//a[normalize-space()='Overview of Trees']")
	WebElement OverViewofTrees;
	//a[normalize-space()='Overview of Trees']
	public void overViewTrees()
	{
		OverViewofTrees.click();
	}
	@FindBy(linkText="Try here>>>")
	WebElement TryHere1;
	
	
	public void tryHere1()
	{
		TryHere1.click();
	}
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor1;
	
	public void editor1() throws IOException
	{
		editor1.sendKeys(pythonCode());
	}
	
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton1;
	public void runbtn1()
	{
		runButton1.click();
	}
	
	@FindBy(xpath="//pre[@id='output']")
	WebElement output;
	
	public void output()
	{
output.getText();

	}
	
	@FindBy(linkText="Terminologies")
	WebElement terminologies;

	public void terminologies()
	{
		terminologies.click();
	}
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere2;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor2;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton2;

	public void tryHere2()
	{
		TryHere2.click();
	}
	public void editor2()
	{
		editor2.click();
	}
	public void runbtn2()
	{
		runButton2.click();
	}
	

	//Types of Trees
	
	@FindBy(linkText="Types of Trees")
	WebElement TypesofTrees;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere3;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor3;
	
	
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton3;
	

	public void TypesofTrees()
	{
		TypesofTrees.click();
	}

	public void tryHere3()
	{
		TryHere3.click();
	}
	public void editor3()
	{
		editor3.click();
	}
	public void runbtn3()
	{
		runButton3.click();
	}
	//Tree Traversals
	@FindBy(linkText="Tree Traversals")
	WebElement TreeTraversals;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere4;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor4;
	
	
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton4;
	
	public void TreeTraversals()
	{
		TreeTraversals.click();
	}

	public void tryHere4()
	{
		TryHere4.click();
	}
	public void editor4()
	{
		editor4.click();
	}
	public void runbtn4()
	{
		runButton4.click();
	}
	
	//Traversals-Illustration
	
	@FindBy(linkText="Traversals-Illustration")
	WebElement traversalsIllustration;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere5;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor5;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton5;
	

	public void traversalsIllustration()
	{
		traversalsIllustration.click();
	}

	public void tryHere5()
	{
		TryHere5.click();
	}
	public void editor5()
	{
		editor5.click();
	}
	public void runbtn5()
	{
		runButton5.click();
	}
	//Binary Trees
	
	@FindBy(linkText="Binary Trees")
	WebElement binaryTrees;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere6;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor6;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton6;

	public void binaryTrees()
	{
		binaryTrees.click();
	}

	public void tryHere6()
	{
		TryHere6.click();
	}
	public void editor6()
	{
		editor6.click();
	}
	public void runbtn6()
	{
		runButton6.click();
	}
	//Types of Binary Trees

	@FindBy(linkText="Types of Binary Trees")
	WebElement BinaryTreesTypes;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere7;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor7;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton7;
	public void BinaryTreesTypes()
	{
		BinaryTreesTypes.click();
	}

	public void tryHere7()
	{
		TryHere7.click();
	}
	public void editor7()
	{
		editor7.click();
	}
	public void runbtn7()
	{
		runButton7.click();
	}
//Implementation in Python
	@FindBy(linkText="Implementation in Python")
	WebElement ImplementationinPython;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere8;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor8;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton8;
	public void ImplementationinPython()
	{
		ImplementationinPython.click();
	}

	public void tryHere8()
	{
		TryHere8.click();
	}
	public void editor8()
	{
		editor8.click();
	}
	public void runbtn8()
	{
		runButton8.click();
	}
	 //Binary Tree Traversals

	@FindBy(linkText="Binary Tree Traversals")
	WebElement BinaryTreeTraversals;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere9;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor9;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton9;
	public void BinaryTreeTraversals()
	{
		BinaryTreeTraversals.click();
	}

	public void tryHere9()
	{
		TryHere9.click();
	}
	public void editor9()
	{
		editor9.click();
	}
	public void runbtn9()
	{
		runButton9.click();
	}
	//Implementation of Binary Trees
	
	@FindBy(linkText="Implementation of Binary Trees")
	WebElement implementationBinaryTrees;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere10;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor10;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton10;
	public void implementationBinaryTrees()
	{
		implementationBinaryTrees.click();
	}

	public void tryHere10()
	{
		TryHere10.click();
	}
	public void editor10()
	{
		editor10.click();
	}
	public void runbtn10()
	{
		runButton10.click();
	}
//Applications of Binary trees
	@FindBy(linkText="Applications of Binary trees")
	WebElement applicationsofBinarytrees;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere11;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor11;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton11;

	public void applicationsofBinarytrees()
	{
		applicationsofBinarytrees.click();
	}

	public void tryHere11()
	{
		TryHere11.click();
	}
	public void editor11()
	{
		editor11.click();
	}
	public void runbtn11()
	{
		runButton11.click();
	}
	//Binary Search Trees
	
	@FindBy(linkText="Binary Search Trees")
	WebElement BinarySearchTrees;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere12;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor12;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton12;

	public void BinarySearchTrees()
	{
		BinarySearchTrees.click();
	}

	public void tryHere12()
	{
		TryHere12.click();
	}
	public void editor12()
	{
		editor12.click();
	}
	public void runbtn12()
	{
		runButton12.click();
	}
	
	//Implementation Of BST
	@FindBy(linkText="Implementation Of BST")
	WebElement ImplementationOfBST;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere13;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor13;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton13;
	public void ImplementationOfBST()
	{
		ImplementationOfBST.click();
	}

	public void tryHere13()
	{
		TryHere13.click();
	}
	public void editor13()
	{
		editor13.click();
	}
	public void runbtn13()
	{
		runButton13.click();
	}
	//Practice Questions
	@FindBy(linkText="Practice Questions")
	WebElement PracticeQuestions;
	
	@FindBy(linkText="Try here>>>")
	WebElement TryHere14;
	
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor14;
		
	@FindBy(xpath="//button[@type='button']")
	WebElement runButton14;
	
	public void PracticeQuestions()
	{
		PracticeQuestions.click();
	}

	public void tryHere14()
	{
		TryHere14.click();
	}
	public void editor14()
	{
		editor14.click();
	}
	public void runbtn14()
	{
		runButton14.click();
	}
	


	
}
