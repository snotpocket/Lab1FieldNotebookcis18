import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoteBookQueries {
    public static int totalOrganisms(FieldNotebook nb) {
        return nb.get_sightings().stream().mapToInt(Sighting::getCount).sum();
    }
    public static List<String> speciesSeen(FieldNotebook nb) {
        return nb.get_sightings().stream().map(Sighting::getSpecies).distinct().sorted().toList();
    }
    public static List<Sighting> sightingsOver(FieldNotebook nb, int n) {
        return nb.get_sightings().stream().filter(s -> s.getCount() > n).toList();
    }
    public static String busiestSpecies(FieldNotebook nb) {
        return nb.get_sightings().stream().collect(Collectors.groupingBy(
                Sighting::getSpecies,Collectors.summingInt(Sighting::getCount)
        )).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }
    public static String SightingsListasString(FieldNotebook nb) {
        return nb.get_sightings().stream().map(Sighting::getSpecies).collect(Collectors.joining(", "));
    }
    public static Map<String, List<Sighting>> GroupByMonth(FieldNotebook nb) {
        return nb.get_sightings().stream().collect(Collectors.groupingBy(s -> s.getWhen().getMonth().toString()));
    }
    // C1 sum(s.count for s in sightings)
    // C2 sorted({s.species for s in sightings})
    // C3 [s for s in sightings if s.count > n]
    // C4 max(totals, key=totals.get)
    // C5 ", ".join(s.species for s in sightings)
    // C6
}
