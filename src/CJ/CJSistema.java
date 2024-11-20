package CJ;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CJSistema {
    private String cjleerarchivo(){
        try {
            FileReader archivo=new FileReader("src\\CJ\\Carrillo.Velez.txt");
            BufferedReader leer=new BufferedReader(archivo);
            String cjfrase=leer.readLine();
            Scanner cjseparador =new Scanner(cjfrase).useDelimiter(";");
        } catch (Exception e) {
        }
        return "asa";

    }
    private void cjmostrarInformacion(){

    }
}
