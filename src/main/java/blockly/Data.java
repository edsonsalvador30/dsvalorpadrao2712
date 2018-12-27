package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Data {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Data
public static Var Nascimento() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.dateTime.Operations.getNowNoHour();
   }
 }.call();
}

}

