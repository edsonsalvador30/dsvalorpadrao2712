package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TipoBloco2 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// TipoBloco2
public static Var Palavra() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf("Uma String qualquer");
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Ativo() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_TRUE;
   }
 }.call();
}

}

