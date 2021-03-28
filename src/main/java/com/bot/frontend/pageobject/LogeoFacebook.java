package com.bot.frontend.pageobject;

import com.bot.frontend.helpers.Hook;
import com.bot.frontend.utility.ExcelReader;
import com.bot.frontend.utility.GenerateWord;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.HashMap;
import java.util.List;

public class LogeoFacebook {

    private static final String EXCEL_APK = "excel/DataApp-Facebook.xlsx";
    private static final String LOGIN_APK = "Login";
    private static final String LOGIN_RECUPERAR = "Recuperar";
    private static final String COLUMNA_USUARIO = "NumDocumento";
    private static final String COLUMNA_PASSWORD = "Contrasena";

    public static GenerateWord generateWord = new GenerateWord();
    public AppiumDriver<MobileElement> driver;

    public LogeoFacebook() {
        this.driver = Hook.getDriver();
    }

    private static List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }
}
