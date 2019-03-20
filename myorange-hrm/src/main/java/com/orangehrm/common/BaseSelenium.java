package com.orangehrm.common;

 import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(TestListner.class)
public class BaseSelenium {
@DataProvider (name="LoginData")
public String [][] getLoginData(){
	String [][] data = {{"kiran","kiran"}};
return data;
}
}