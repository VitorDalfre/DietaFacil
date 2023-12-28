package dietafacil.shared;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverteData {

    private ConverteData() {

    }

    public static String converte(String data) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Formartar a data inserida
        Date dataFormatada = null;
        dataFormatada = sdf.parse(data);

        return sdf.format(dataFormatada);
    }
}
