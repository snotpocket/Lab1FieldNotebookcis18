import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class FieldNotebook {
    //"""HAS-A list of sightings. Note: it does NOT extend list."""
    String owner;
    List<Sighting> _sightings;

    public FieldNotebook(String owner) {
        this.owner = owner;
        this._sightings = new ArrayList<>();
    }

    void add(Sighting s) {
        this._sightings.add(s);
    }

    int total_organisms() {
        return this._sightings.stream().mapToInt(Sighting::getCount).sum();
       // return sum(s.count for s in self._sightings)
    }

    List<String> species_seen() {
        return this._sightings.stream().map(Sighting::getSpecies).distinct().sorted().toList();
//        return sorted({s.species for s in self._sightings})
    }

    String busiest_species() {
        Map<String, Integer> totals = new HashMap<>();
        for(Sighting s : _sightings) {
            totals.merge(s.getSpecies(),s.getCount(),Integer::sum);
        }
       return totals.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    List<Sighting> sightings_over(int n) {
        return _sightings.stream().filter(s -> s.getCount() > n).collect(Collectors.toList());
    }

    void report() {
        System.out.printf("--- %s's notebook ---%n",owner);
        for (Sighting s : _sightings) {
            System.out.println(" " + s.describe());
        }
    }
}


