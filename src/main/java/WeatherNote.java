import java.time.LocalDate;

public class WeatherNote implements Describable{
    private LocalDate date;
    private double TemperatureC;
    private String conditions;
    public WeatherNote(LocalDate date, double TemperatureC, String conditions) {
        this.date = date;
        this.TemperatureC = TemperatureC;
        this.conditions = conditions;
    }
    @Override
    public String describe() {
        return String.format("Weather on %s: %.1f degrees C, $s",date,TemperatureC,conditions);
    }
}
