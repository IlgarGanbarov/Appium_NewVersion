package stepDefinitions;


import io.cucumber.java.en.Given;
import utils.Driver;

public class deneme {
    @Given("kullanici uygulamayi yukler")
    public void kullanici_uygulamayi_yukler() {
        Driver.getAndroidDriver();

    }



}



