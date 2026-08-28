# Part B
1. In Sighting, make the fields private or protected and add getters. Then answer in ANSWERS.md: what did
   `private` buy you that Python's `_sightings` naming convention did not?
Java's access modifiers gain the defensive code where developers don't have to follow convention. The fields are truly private or protected
2. FieldNotebook must compose its list, not inherit it. Then write two sentences on what would go wrong if
   FieldNotebook extends ArrayList<Sighting>. Be specific, name a method that would become available and
   should not be.
    This would make flexibility of the FieldNotebook class not as good due to inheritance hierarchies 
3. Add a describeAll() method to FieldNotebook that loops over List<Sighting> calling describe(). One call
   site, three different outputs. In ANSWERS.md, name the mechanism that makes that work and explain where
   the decision is made (compile time or run time?).
       It runs at compile time because java is a statically typed language.
4. Add a second implementer of Describable that is not a Sighting — e.g. a WeatherNote. Add it to
   describeAll()'s handling without changing Sighting at all. This is the moment "program to an interface"
   stops being a slogan
   Everything in fieldnotebook should have been programmed into interface making it difficult to add other classes to fieldnotebook.
5.  The Field Notebook class will need to be changed as the program grows more complex if there are class files implamenting the same interface.
6. The Field Notebook class will break because it is using the Sighting class but not other classes that use the Describable interface
7. I would change all pointers to sighting in the field notebook class to describable and add the required methods to the describable interface

