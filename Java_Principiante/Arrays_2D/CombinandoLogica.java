package Arrays_2D;

public class CombinandoLogica {
    public static void main(String[]args){
        //Calendario de un mes representado en un array de 2 dimensiones
        // las filas son las semanas y las columnas los dias de la semana.
        String[][] calendar = {
                {"volunteer", "delivery", null, null, "doctor", null, "soccer"},
                {null, "exam 1", null, "mechanic", null, null, "soccer"},
                {"volunteer", "off work", null, "birthday", null, "concert", null},
                {null, "exam 2", null, null, "doctor", null, "soccer"},
                {"visit family", null, null, null, null, null, null}
        };

        //Itero en las semanas(filas)
        for(int i = 0; i < calendar.length; i++) {
            int numberOfEventsPerWeek = 0;
            //Itero en los dias de la semana(columnas)
            for(int j = 0; j < calendar[i].length; j++) {
                //Usamos esta logica condicional para garantizar que no contamos los días vacíos.
                String event = calendar[i][j];
                if(event!=null && !event.equals("")) {
                    // Si el día no tiene un valor nulo y una cadena vacía para un evento,
                    // entonces lo imprimimos y lo contamos.
                    System.out.println("Week: " + (i+1) + ", Day: " + (j+1) + ", Event: " + event);
                    numberOfEventsPerWeek++;
                }
            }
            System.out.println("Total number of events for week "+ (i+1) +": " + numberOfEventsPerWeek + "\n");
        }




    }
}
