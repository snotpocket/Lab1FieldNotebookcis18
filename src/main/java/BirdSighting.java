import java.time.LocalDate;

class BirdSighting extends Sighting {
    private boolean heard_only;
    public BirdSighting(String species, int count, LocalDate when) {
        this(species, count, when,false,"");
    }
    public BirdSighting(String species, int count, LocalDate when, boolean heard_only) {
       this(species,count,when,heard_only,"");
    }
    public BirdSighting(String species, int count, LocalDate when, boolean heard_only, String notes) {
        super(species, count, when, notes);
        this.heard_only = heard_only;
    }
    public String describe() {
        String how = this.heard_only ? "heard" : "";
        return String.format("%dx %s (%s) on %s",count,species,how,when);
    }
}
