package com.bot.frontend.pageobject;


import com.bot.frontend.helpers.Hook;
import com.bot.frontend.utility.ExcelReader;
import com.bot.frontend.utility.ExtentReportUtil;
import com.bot.frontend.utility.GenerateWord;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;

public class HomeFacebookPageObject {

    private static final String EXCEL_APK = "excel/DataApp-Facebook.xlsx";
    private static final String LOGIN_APK = "Login";
    private static final String COLUMNA_USUARIO = "Usuario";
    private static final String COLUMNA_PASSWORD = "Contrasena";

    public static GenerateWord generateWord = new GenerateWord();
    public AppiumDriver<MobileElement> driver;

    public HomeFacebookPageObject() {
        this.driver = Hook.getDriver();
    }

    private static List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }

    public void home() throws Throwable{
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se visualiza la pantalla de logeo");
            generateWord.sendText("Se visualiza la pantalla de logeo");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }


//Localizadores
    //public static String txt_Usuario="//android.widget.EditText[@content-desc='Nombre de usuario']";
    //public static String txt_Clave="//android.widget.EditText[@content-desc='Contraseña']";
    //public static String btn_IniciarSesion ="//android.view.ViewGroup[@content-desc='Iniciar sesión']";

    public By txt_Usuario = By.xpath("//android.widget.EditText[@content-desc='Nombre de usuario']");
    public By txt_Clave = By.xpath("//android.widget.EditText[@content-desc='Contraseña']");
    public By btn_IniciarSesion = By.xpath("//android.view.ViewGroup[@content-desc='Iniciar sesión']");
    public By btn_Aceptar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
    public By btn_Permitir = By.xpath("//android.view.ViewGroup[@content-desc='Permitir']");
    public By btn_SoloAPP = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]\n");
    public By btn_Notificaciones = By.xpath("//android.view.ViewGroup[@content-desc='Haz una publicación en Facebook']\n");



    public void ingressarCredencialesFacebook(String casoDePrueba) throws Throwable {
        try {
            int valores = Integer.parseInt(casoDePrueba) - 1;
            String numDocumentoData = getData1().get(valores).get(COLUMNA_USUARIO);
            String passwordData = getData1().get(valores).get(COLUMNA_PASSWORD);

            driver.findElement(txt_Usuario).clear();
            driver.findElement(txt_Usuario).sendKeys(numDocumentoData);
            driver.findElement(txt_Clave).clear();
            driver.findElement(txt_Clave).sendKeys(passwordData);


            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresan Credenciales de Facebook: " + numDocumentoData + " - Contraseña: " + passwordData);
            generateWord.sendText("Se ingresan Credenciales de Acceso: Documento: " + numDocumentoData);
            generateWord.addImageToWord(driver);
            driver.findElement(btn_IniciarSesion).click();
            Thread.sleep(5);

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }


    public void ValidarAcceso() throws Throwable {
        try {

            driver.findElement(btn_Aceptar).click();
            Thread.sleep(5);
            driver.findElement(btn_Permitir).click();
            Thread.sleep(5);
            driver.findElement(btn_SoloAPP).click();
            Thread.sleep(5);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se visualiza el  home del usuario");
            generateWord.sendText("Se visualiza el  home del usuario");
            generateWord.addImageToWord(driver);


            Thread.sleep(5);
            driver.findElement(btn_Notificaciones).click();

            ExtentReportUtil.INSTANCE.stepPass(driver, "Puedes publicar algo");
            generateWord.sendText("Puedes publicar algo");
            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }
}
