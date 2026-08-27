import java.time.LocalDate;

class Sighting implements Describable {
    public String getSpecies() {
        return species;
    }

    //  One observation of one organism.
    protected String species;

    public int getCount() {
        return count;
    }

    protected int count;

    public LocalDate getWhen() {
        return when;
    }

    protected LocalDate when;

    public String getNotes() {
        return notes;
    }

    protected String notes;

    public Sighting(String species, int count, LocalDate when, String notes) {
        this.species = species;
        this.count = count;
        this.when = when;
        this.notes = notes;
    }
    public Sighting(String species, int count, LocalDate when) {
        this(species,count,when,"");
    }

    public String describe() {
        return String.format("%dx %s on %s",count,species,when);
    }
}
