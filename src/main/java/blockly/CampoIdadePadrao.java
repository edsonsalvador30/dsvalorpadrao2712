package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CampoIdadePadrao {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CampoIdadePadrao
public static Var Idade(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf(10);
   }
 }.call();
}

}

