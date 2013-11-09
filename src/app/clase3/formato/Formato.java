package app.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) {
        /*Formato.NumberFormat();*/
        /*Formato.MonedaFormat();*/
        /*Formato.FechaFormat();*/
        /*Formato.FechaFormat2();*/
        Formato.FechaFormat3();
    }

    public static void NumberFormat() {
        // Establecer el Locale como US para usar el punto como
        // separador decimal.
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        // separado por comas
        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));
        // No agrupar, sin comas
        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));
        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));
        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));
        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));
        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));
    }

    public static void MonedaFormat() {
        // Formato de moneda
        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(false);

        NumberFormat formatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        formatoAmericano.setGroupingUsed(false);

        Locale lp = new Locale("es", "PE");
        NumberFormat formatoPeruano = NumberFormat.getCurrencyInstance(lp);
        formatoPeruano.setGroupingUsed(false);

        Locale lp1 = new Locale("ar", "AE");
        NumberFormat formatoArabe = NumberFormat.getCurrencyInstance(lp1);
        formatoArabe.setGroupingUsed(false);

        System.out.println("Moneda Euro :" + formatoAleman.format(150));
        System.out.println("Moneda Dolar :" + formatoAmericano.format(150));
        System.out.println("Moneda Soles :" + formatoPeruano.format(150));
        System.out.println("Moneda arabe :" + formatoArabe.format(150));
    }

    public static void FechaFormat() {
        GregorianCalendar ahora = new GregorianCalendar();
        // Crear una fecha
        //Calendar ahora = new GregorianCalendar(2007,2,2);
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        //
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        //
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }

    public static void FechaFormat2() {
        Date now = new Date();
        System.out.println(now.getTime());
        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);
        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT) Hoy es " + s1);
        System.out.println("(MEDIUM) Hoy es " + s2);
        System.out.println("(LONG) Hoy es " + s3);
        System.out.println("(FULL) Hoy es " + s4);
        System.out.println("(CUSTOM) Hoy es " + s5);
    }

    public static void FechaFormat3() {
        Calendar c1 = new GregorianCalendar(2011, 9, 1);
        Date d1 = c1.getTime();
        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date d2 = c2.getTime();
        if (d1.after(d2)) {
            System.out.println("d1 es después que d2");
        }
        if (d1.before(d2)) {
            System.out.println("d1 es antes que d2");
        }
    }
    
    
}
