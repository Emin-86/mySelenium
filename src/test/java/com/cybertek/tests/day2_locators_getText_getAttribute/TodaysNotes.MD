MAY 9TH, SUNDAY FUNDAY

TODAY'S SCHEDULE:
- REVIEW
- TASK SOLUTION
- findElement()
- Locators
- getText()
- getAttribute()

----------------------------------------------------------------

- What is Selenium?
    - Basically Selenium is a set of jar files that help us automate browsers.
    - In simple terms it is basically some jar files.
    - We use these jar files to automate tests cases on wep application/pages' UI.

    - Jar file: is basically bunch of ready classes and methods.
    - Jar = Java Archive

- Is Maven for testers?
    - No. Therefore we will not be using Maven to its full capacity.
    - But, as testers we are taking advantage of SOME of the functionalities of maven.

- What is Maven?
    - Maven is a build automation tool.
    - Maven helps us automate project creation and management.

  When we create a project with Maven following things happen.

  #1- Project comes with existing folder structure.

  	- src
  		- main : developer writes the actual code here
  		- test : UNIT TESTS goes here.

  #2- pom.xml file is created.

  	-> pom.xml file is THE MOST important file in a Maven project.
  	-> We add and manage our dependencies in our pom.xml file.
  	-> We manage the versions of the dependencies in our project as well.

- Will they ask us what version of which tool we are using?
    - Yes.
    - Java 				: 8
    - Selenium			: 3.141.59
    - WebDriverManager 	: 4.4.1

- What is a build?
  -> Build is a repeating steps in project creation and management.

  -> Creating certain folder structure
  -> Compile code
  -> Add jar files, dependencies
  -> manage versions
  -> deploy

- If developers are using both main and test folders, where do SDET (testers) use?
    - Testers and developers are not working on the same project.
    - As SDET you will not have access to source code of application, unless you actually need to do something there.

- What do we test as testers?
    - Actual Result vs Expected Result (in the web page)
    - Broken software cannot be automated.
    - Before "thinking outside of the box" and getting creative we MUST verify actual vs expected.

- Where do we get our actual data?
    - Actual : We get the actual result from the browser after doing testing.

- Where do we get our actual data?
    - Documentation: A/C ( Acceptance Criteria), Requirements etc

------------------------------------------------------------------------------

To be able to click (or do any action) to any link:
1- we need to find the web element
2- locate it
3- apply action(click or send input) with selenium

- .findElement(By.locator);
    - This method will find and return A SINGLE web element.
    - It accepts a locator parameter to locate web elements.
    - findElement method will THROW NoSuchElementException if it is not able to find web element with given locator.
    - RETURN TYPE : WebElement
    - This WebElement type is coming from Selenium Library.

- What are locators in Selenium?
    - Locators help us locate web elements using SELENIUM WEBDRIVER.
    - There are 8 locators in Selenium.


#1- linkText("THE TEXT OF THE LINK");
	- linkText locator will look through all of the links' texts on the page, and will return the link with matching text.

	- This locator will ONLY ONLY work on links.

	- How do we know if it is a link or not?
		- We inspect and see if it is an anchor tag <a>.
	- We must pass the text of the link inside of the locator.
	- This method will be looking for EXACT match of the text.
	- This is similar to .equals method in java.

ex:
<a href="https://something.com"> Click here to go to somewhere </a>

	WHAT IS THE TEXT OF MY LINK:

	- "Click here to go to somewhere" --> This text needs to be passed into the linkText locator to be able to locate the link.


		// COMMAND + D : multiplies the current line
        // control + D : multiplies the current line

        // MAC : moving the line up and down: command + shift + up /down arrow
        // WINDOWS: moving the line up and down: control + shift + up /down arrow


#2- partialLinkText:
	- partialLinkText locator will be looking for PARTIAL TEXT MATCH.
	- this is similar to .contains method in java
	- make sure what text is passed is unique.
	- if there are multiple matching result, this method will return the first matching result and do the action on it.


ex:
<a href="https://something.com"> Click here to go to somewhere </a>


	driver.findElement(By.partialLinkText("Click"));
	driver.findElement(By.partialLinkText("here"));
	driver.findElement(By.partialLinkText("to"));
	driver.findElement(By.partialLinkText("go"));
	driver.findElement(By.partialLinkText("somewhere"));

#3 - name:
	- name is one of 8 locators in Selenium.
	- Looks through the html code, and returns the matching "name" attribute's value.


ex:
<a href="https://something.com" name="ubt7"> Click here to go to somewhere </a>


syntax: driver.findElement(By.name("ubt7"));


HOW TO WRITE SOMETHING USING SELENIUM?

- .sendKeys("STRING");
    - Sends the given argument as a String.
    - Accepts a String argument

syntax: driver.findElement(By.name("ubt7")).sendKeys("this will be sent");

--> If you are not seeing attribute name="q" when you inspect, make sure you go to: https://www.google.com

--> Keys.ENTER --> This piece of code imitates user action of "pressing ENTER key" from keyboard.

ex:         driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

#4- id:
	- id is one of the 8 locators of Selenium.
	- Very similar to "name" locator.
	- id is unique to each web element.

	- sometimes id can be dynamic.
	- dynamic means, everytime you refresh the page, either part of the id attribute value or all of it might change.

ex:
<a href="https://something.com" name="ubt7" id="cbt78"> Click here to go to somewhere </a>


syntax: driver.findElement(By.id("cbt78")).click();


#5- className:
	- "className" is one of 8 locators in Selenium.
	- it is very similar to "name" and "id" locators.
	- it uses "class" attribute's value.

	- this locator will look through the HTML code, and return the web element with matching "class" attribute value.
	- this locator is not looking for class and name attribute's value at the same time.
	- this is only looking for class attribute's value.


ex:
<a href="https://something.com" name="ubt7" id="cbt78" class="is45"> Click here to go to somewhere </a>


syntax: driver.findElemet(By.className("is45")).click();


#6- tagName:
	- tagName is one of the 8 locators of Selenium
	- tagName is locating web elements using their tag names.


syntax: driver.findElement(By.tagName("div")) --> this will return first div it finds
driver.findElement(By.tagName("a")) 	--> this will return first a it finds
driver.findElement(By.tagName("span")) 	--> this will return first span it finds
driver.findElement(By.tagName("h1")) 	--> this will return first h1 it finds

- if there are more than 1 of the matching result, .findElement method will return the first matching result, and apply the action (click, sendKeys etc) to it.



--------------------------------------------------------------------------------

.getText() :
- .getText() method gets the text of the given web element.
- .getText() method is ONLY able to return the text that is in between the OPENING TAG and CLOSING TAG.
- This method DOES NOT accept any argument.
- Return type is: String

ex:

<a href="https://something.com" name="ubt7" id="cbt78" class="is45"> Click here to go to somewhere </a>

syntax:
--> driver.findElement(By.id("cbt78")).getText();
--> Returns as String : "Click here to go to somewhere"



.getAttribute("attribute");
- .getAttribute("attribute") method will get the given attribute's value
- .getAttribute("attribute") is only able to read inside of the <openingTag>
- it will find the matching attribute name, and return the value
- Return type: String

ex:

<a href="https://something.com" name="ubt7" id="cbt78" class="is45"> Click here to go to somewhere </a>


syntax:

-> driver.findElement(By.partialLinkText("Click")).getAttribute("name") 	--> ubt7
-> driver.findElement(By.partialLinkText("Click")).getAttribute("id") 		--> cbt78
-> driver.findElement(By.partialLinkText("Click")).getAttribute("class") 	--> is45
-> driver.findElement(By.partialLinkText("Click")).getAttribute("href")
--> https://something.com



- WebElement is like a container.
- We find and store the web element we want to re-use, just like String or int

  driver.findElement(By.something...);
  WebElement something =	driver.findElement(By.something...);





