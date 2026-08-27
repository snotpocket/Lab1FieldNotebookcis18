import java.time.LocalDate;

class TreeSighting extends Sighting {
    double height_m;

    public TreeSighting(String species, int count, LocalDate when) {
        this(species, count, when, 0.0D,"");
    }
    public TreeSighting(String species, int count, LocalDate when, double height_m) {
        this(species, count, when,height_m, "");
    }
    public TreeSighting(String species, int count, LocalDate when, double height_m, String notes) {
        super(species, count, when, notes);
        this.height_m = height_m;
    }


    public String describe() {
        return String.format("%s, %.1fm tall, on %s",species,height_m,when);
    }
}
