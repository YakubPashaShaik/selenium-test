Functional testing is a black box testing, because we do not how the software works(Ia mean we do not see code). We know what we should click and what output should be. Yes, we have specification. So, I will not give you here theoretical overview, just create a custom sample project and will show you the main features of Selenium Java Web Driver, TestNG and lets get it done using Maven.

The first thing we have to do is to select the page we want to test. I do not like thinking too much - lets just test my blogspot page - http://jevgenimarenkov.blogspot.com/. When we click on the link byJevgeni(its on the right just below the about section) we want to get label "On Blogger since September 2010". So lets start:

1. Download and Install Selenium IDE for Firefox (http://release.seleniumhq.org/selenium-ide/1.8.1/). You can read some tutorials on the same page(http://seleniumhq.org/projects/ide/) as well. It is not prohibited!

2. Start Selenium IDE,it starts automatically recording actions that you perform. To understand that Selenium is recording your actions, make sure that red button in the right upper corner is pressed.

Go to http://jevgenimarenkov.blogspot.com/

Click on link by Jevgeni.

Right click on label (On Blogger since September 2010)

Choose assertText css=p.sidebar-item.item-key On Blogger since September 2010