package test_git;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class AujourdHui {
  public static void main(String[] args) {
    DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
            .withLocale( Locale.FRANCE )
            .withZone( ZoneId.systemDefault() );

    Instant date = new Date().toInstant();
    date = date.plus(1, ChronoUnit.DAYS);
    System.out.println("Aujourd'hui nous sommes le "+ formatter.format(date));
  }
}
