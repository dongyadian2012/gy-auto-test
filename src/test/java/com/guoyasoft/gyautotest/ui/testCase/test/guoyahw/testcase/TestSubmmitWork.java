package com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaIinner2;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaInner1;
import com.guoyasoft.gyautotest.ui.testCase.test.guoyahw.pages.GuoYaLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 10:57
 **/
public class TestSubmmitWork extends BaseUI {
  @Test
  public void testSubmmitWork(){
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    GuoYaLogin guoYaLogin = PageFactory.initElements(driver, GuoYaLogin.class);
    guoYaLogin.sendKeysLoginUserName("dongyd");
    guoYaLogin.sendKeysLoginPassword("144823");
    guoYaLogin.clickLoginButton();
    GuoYaInner1 guoYaInner1 = PageFactory.initElements(driver, GuoYaInner1.class);
    guoYaInner1.clickUploadSummary1811AButton();
    guoYaInner1.clickPictureButton();
    //guoYaInner1.switchToPicture();
    //guoYaInner1.clickInnerUploadSummaryButton();
    //guoYaInner1.homeworkCheck1811ALink();
    //GuoYaIinner2 guoYaIinner2 = PageFactory.initElements(driver, GuoYaIinner2.class);

  }

}
