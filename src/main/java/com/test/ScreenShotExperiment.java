package com.test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class ScreenShotExperiment {
	
	public static void captureScreenShot(WebDriver webdriver) throws Exception
	 {
		System.out.println("Calling screenshot ***********########");
		Date cDate = new Date();
		SimpleDateFormat sdf  = new SimpleDateFormat ("hh_mm_ss");
		
		
		
      TakesScreenshot scrShot =((TakesScreenshot)webdriver);
      File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
      String Destpath = SrcFile.getAbsolutePath();
      System.out.println(Destpath);
      Destpath =Destpath+"_"+sdf.format(cDate)+"_.png";
      File DestFile=new File(Destpath);
      Files.copy(SrcFile, DestFile);
   }
	
}
