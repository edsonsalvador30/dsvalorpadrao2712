package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CampoNome {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// CampoNome
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf("Novo Usuario");
   }
 }.call();
}

}

