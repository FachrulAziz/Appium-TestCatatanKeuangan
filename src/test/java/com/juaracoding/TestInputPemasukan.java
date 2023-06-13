package com.juaracoding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestInputPemasukan {
    AndroidDriver<MobileElement> driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Xiaomi Redmi S2");
        dc.setCapability("udid", "9c1d9013");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, dc);
    }
    @Test
    public void inputPemasukan() {
        delay(3);
        MobileElement tambah = driver.findElementById("com.chad.financialrecord:id/fabMenu");
        tambah.click();
        delay(2);
        MobileElement pilihKategori = driver.findElementById("com.chad.financialrecord:id/btnIncome");
        pilihKategori.click();
        delay(2);
        MobileElement tanggal = driver.findElementById("com.chad.financialrecord:id/btnIncome");
        tanggal.click();
        delay(2);
        MobileElement Pilihtanggal = driver.findElement(By.id("com.chad.financialrecord:id/tvDate"));
        Pilihtanggal.click();
        delay(2);
        MobileElement tanggalDipilih = driver.findElementByAccessibilityId("10 Juni 2023");
        tanggalDipilih.click();
        delay(2);
        MobileElement btnOkTgl = driver.findElementById("android:id/button1");
        btnOkTgl.click();
        delay(2);
        MobileElement pilihPemasukan = driver.findElementById("com.chad.financialrecord:id/spCategory");
        pilihPemasukan.click();
        delay(2);
        MobileElement pilih = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.TextView");
        pilih.click();
        delay(2);
        MobileElement pemasukan = driver.findElementById("com.chad.financialrecord:id/etAmount");
        pemasukan.sendKeys("250000");
        delay(2);
        MobileElement catatan = driver.findElementById("com.chad.financialrecord:id/etNote");
        catatan.sendKeys("Penjualan Sparepart");
        delay(2);
        MobileElement simpan = driver.findElementById("com.chad.financialrecord:id/btSave");
        simpan.click();
    }
    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
