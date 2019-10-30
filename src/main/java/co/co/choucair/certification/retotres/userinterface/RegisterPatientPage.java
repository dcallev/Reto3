package co.co.choucair.certification.retotres.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPatientPage extends PageObject {

    public static final Target ADD_PATIENT = Target.the("Agregar paciente")
            .located(By.xpath("//a[contains(text(),'Agregar Paciente')]"));
    public static final Target FULL_NAME = Target.the("Nombre completo")
            .located(By.xpath("//input[@placeholder='Ingrese el nombre']"));
    public static final Target LAST_NAME = Target.the("Apellidos")
            .located(By.xpath("//input[@placeholder='Ingrese los apellidos']"));
    public static final Target PHONE = Target.the("Teléfono")
            .located(By.xpath("//input[@placeholder='Ingrese el teléfono']"));
    public static final Target TYPE_DOCUMENT = Target.the("Tipo de documento")
            .located(By.xpath("//select[@name='identification_type']"));
    public static final Target DOCUMENT = Target.the("Documento")
            .located(By.xpath("//input[@placeholder='Ingrese el documento de identidad']"));
    public static final Target PREPAID = Target.the("Medicina prepagada")
            .located(By.xpath("//input[@name='prepaid']"));
    public static final Target SAVE = Target.the("Guardar")
            .located(By.xpath("//input[@name='prepaid']"));


}
