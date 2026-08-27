//"""Field Notebook - a naturalist's observation log. Python 3.11+"""

import java.time.LocalDate;


void main() {
    FieldNotebook nb = new FieldNotebook("A. Naturalist");
    nb.add(new BirdSighting("Marbled Murrelet", 2, LocalDate.of(2026, 3, 14), true));
    nb.add(new TreeSighting("Coast Redwood", 1, LocalDate.of(2026, 3, 14), 87.4));
    nb.add(new BirdSighting("Steller's Jay", 6, LocalDate.of(2026, 3, 15)));
    nb.add(new Sighting("Banana Slug", 3, LocalDate.of(2026, 3, 15)));
    nb.add(new TreeSighting("Douglas Fir", 4, LocalDate.of(2026, 3, 16), 52.0));

    nb.report();
    System.out.println("Total organisms:" + nb.total_organisms());
    System.out.println("Species seen:" + nb.species_seen());
    System.out.println("Busiest species:" + nb.busiest_species());
    System.out.println("Sightings over 2:" +
            nb.sightings_over(2).stream().map(Sighting::describe).collect(Collectors.toSet())
    );
}