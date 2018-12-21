package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 10:55
 **/
public class GuoYaInner1 extends BaseUI {
  @FindBy(xpath = "//a[contains(text(),'上传总结')]")
  private WebElement uploadSummary1811AButton;

  @FindBy(xpath = "//select[@id='sno']")
  private WebElement pictureButton;

  @FindBy(xpath = "//input[@id='uploadFileBtn']")
  private WebElement innerUploadSummaryButton;

  @FindBy(xpath = "//a[contains(text(),'作业检查')]")
  private WebElement homeworkCheck1811ALink;

  public void clickUploadSummary1811AButton(){click(uploadSummary1811AButton);}

  public void clickPictureButton(){
    click(pictureButton);
  }
  public void switchToPicture(){
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("x.png");
    alert.accept();
  }

  public void clickInnerUploadSummaryButton(){
    clickInnerUploadSummaryButton();
  }
   public void alert(){
    Alert alert = driver.switchTo().alert();
    alert.accept();
  }
  public void homeworkCheck1811ALink(){
    click(homeworkCheck1811ALink);
    }
}
