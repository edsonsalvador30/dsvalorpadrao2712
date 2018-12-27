package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ValorPadraoTipos {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var Ativo() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_TRUE;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var Data() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.dateTime.Operations.getNowNoHour();
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var DataHora() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.dateTime.Operations.getNow();
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var Hora() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.conversion.Operations.stringToDate(Var.valueOf(cronapi.dateTime.Operations.getHour(cronapi.dateTime.Operations.getNow()).toString() + Var.valueOf(":").toString() + cronapi.dateTime.Operations.getMinute(cronapi.dateTime.Operations.getNow()).toString()), Var.valueOf("HH:mm"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var Palavra() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf("Palavra padrão vinda de Bloco");
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var Valor() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.conversion.Operations.toDouble(Var.valueOf("15,26"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// ValorPadraoTipos
public static Var numero() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf(18);
   }
 }.call();
}

}

