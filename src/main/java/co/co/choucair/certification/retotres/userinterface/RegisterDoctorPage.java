package co.co.choucair.certification.retotres.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterDoctorPage extends PageObject {

            public static final Target ADD_DOCTOR = Target.the("Agregar doctor")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
            public static final Target FULL_NAME = Target.the("Nombre completo")
                    .located(By.xpath("//input[@id='name']"));
            public static final Target LAST_NAME = Target.the("Apellidos")
                    .located(By.xpath("//input[@id='last_name']"));
            public static final Target PHONE = Target.the("Teléfono")
                    .located(By.xpath("//input[@id='telephone']"));
            public static final Target SELECT_DOCUMENT = Target.the("Seleccionar documento")
                    .located(By.xpath("//select[@id='identification_type']"));
            public static final Target DOCUMENT = Target.the("Identificacion")
                    .located(By.xpath("//input[@id='identification']"));
            public static final Target SAVE = Target.the("Guardar")
                    .located(By.className("btn btn-primary pull-right"));

}
