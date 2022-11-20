package program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class program {
    public static void main(String[] args) {
        //Site para consulta de "time format"
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        
        // UTC - Tempo Universal Coordenado

        //(Agora) -> Data-hora
        LocalDate d1 = LocalDate.now(); // Data local
        LocalDateTime d2 = LocalDateTime.now(); // Data-hora local
        Instant d3 = Instant.now(); // Data-hora global

        //Texto ISO 8601 -> Data-hora
        //Convertendo texto padrão ISO 8601 em instância. "parse = converter"
        LocalDate d4 = LocalDate.parse("2022-09-25");
        LocalDateTime d5 = LocalDateTime.parse("2022-09-25T14:52:06");
        Instant d6 = Instant.parse("2022-09-25T14:52:06Z"); // Z no final para indicar padrão UTC
        Instant d7 = Instant.parse("2022-09-25T14:52:06-04:00"); // c/ fuso horário
        
        //Passando texto customizado para a instância -> Data-hora
        //forma passando objeto -> DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //forma passando direto -v
        LocalDate d8 = LocalDate.parse("25/09/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d9 = LocalDateTime.parse("25/09/2022 15:20", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        
        //Passando separadamente a data/hora como parâmeto
        LocalDate d10 = LocalDate.of(2022, 9, 25);
        LocalDateTime d11 = LocalDateTime.of(2022, 9, 25, 4, 50);
 
        //toString já gera o texto formatado p/ o padrão ISO.
        System.out.println("\nInstanciação de data-hora");
        System.out.println("d1: "+d1.toString());
        System.out.println("d2: "+d2.toString());
        System.out.println("d3: "+d3.toString());
        System.out.println("\nConvertendo texto padrão ISO 8601 em instância.");       
        System.out.println("d4: "+d4.toString());    
        System.out.println("d5: "+d5.toString());      
        System.out.println("d6: "+d6.toString()); 
        System.out.println("d7: "+d7.toString());
        System.out.println("\nPassando texto customizado para a instância"); 
        System.out.println("d8: "+d8.toString());
        System.out.println("d9: "+d9.toString());
        System.out.println("\nPassando parâmetros separados para a instância");
        System.out.println("d10: "+d10.toString());
        System.out.println("d11: "+d11.toString());

        System.out.println("\n---------------------------------------------------------------------\n");
        // Convertendo data-hora para texto

        System.out.println("Convertendo data-hora para texto");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d12 = LocalDate.parse("2022-07-20");
        LocalDate d13 = LocalDate.now();
        LocalDateTime d14 = LocalDateTime.now();

        System.out.println("d12: "+ d12.format(fmt)); 
        System.out.println("d13.1: "+ d13.format(fmt)); //formas de chamar
        System.out.println("d13.2: "+ fmt.format(d13)); //...
        System.out.println("d13.3: "+ d13.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d14: "+ d14.format(fmt2));

        //Instant global, para formatar é necessário passar qual é o fuso horário
        //o formatador foi passado o fuso horário com .withZone();
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        Instant d15 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d16 = Instant.now();
        
        // System.out.println("d15: "+ d15.format(fmt3)); isso não é possivel pq o objeto Instant não tem o metodo format
        //Então irei chamar pelo objeto "fmt3"

        System.out.println("d15: "+ fmt3.format(d15)); //parse
        System.out.println("d16: "+ fmt3.format(d16)); //now
        
        //Formatters
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d5: " + fmt4.format(d5));
        
        System.out.println("\n---------------------------------------------------------------------\n");
        System.out.println("Convertendo data-hora global para local");

        LocalDate d17 = LocalDate.parse("2022-09-25");
        LocalDateTime d18 = LocalDateTime.parse("2022-09-25T14:52:16");
        Instant d19 = Instant.parse("2022-09-20T01:32:06Z"); // Z no final para indicar padrão UTC

        LocalDate r1 = LocalDate.ofInstant(d19, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d19, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d19, ZoneId.of("Portugal"));

        System.out.println("d19, r1: " + r1);
        System.out.println("d19, r2: " + r2);
        System.out.println("d19, r3: " + r3);

        //pegando separadamente
        System.out.println("\nd18 dia: " + d18.getDayOfMonth());
        System.out.println("d18 mês: " + d18.getMonthValue());
        System.out.println("d18 ano: " + d18.getYear());
        System.out.println("d18 horas: " + d18.getHour());
        System.out.println("d18 minutos: " + d18.getMinute());
        System.out.println("d18 segundos: " + d18.getSecond());

        System.out.println("\n---------------------------------------------------------------------\n");
        System.out.println("Calculos com data e hora");

        //Calc nova instância data-hora com + ou - tempo
        LocalDateTime d20 = LocalDateTime.parse("2022-07-20T01:30:01");

        LocalDateTime pastWeek = d20.minusDays(7);
        LocalDateTime nextWeek = d20.plusDays(7);
        LocalDateTime pastYear = d20.minusYears(2);
        LocalDateTime nextYear = d20.plusYears(3);  

        System.out.println("pastWeek: " + pastWeek);
        System.out.println("nextWeek: " + nextWeek);
        System.out.println("pastyear: " + pastYear);
        System.out.println("nextyear: " + nextYear);

        //Com Instante
        Instant d21 = Instant.parse("2022-07-20T01:30:26Z");
       
        Instant instPastWeek = d21.minus(7, ChronoUnit.DAYS); 
        Instant InstNextWeek = d21.plus(7, ChronoUnit.DAYS);
        
        System.out.println("instPastWeek: " + instPastWeek);
        System.out.println("instNextWeek: " + InstNextWeek);
      
        //Calc duração entre data-hora
        System.out.println("\nCalc de duração entre datas");
        Duration t1 = Duration.between(pastWeek, d20);

        System.out.println("t1 duração dias: " + t1.toDays());
        System.out.println("t1 duração horas: " + t1.toHours());
        System.out.println("t1 duração minutos: " + t1.toMinutes());

        //não é possível ver a duração de LocalDate, para isso é necessário converter para LocalDateTime
        //Usar .atTime(0,0) ou atStartOfDay() para converter LocalDate em LocalDateTime.
        LocalDate d22 = LocalDate.now();

        Duration t2 = Duration.between(nextWeek, d22.atStartOfDay());
        
        System.out.println("t2 duração dias: " + t2.toDays());

    }
}
