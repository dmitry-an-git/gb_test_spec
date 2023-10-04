package Animals;

import java.time.LocalDate;
import java.util.LinkedList;

abstract class AnimalL2Home extends AnimalL1{

    public AnimalL2Home(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.skills = new LinkedList<String>();
        this.type2 = "Домашнее Животное";
    }

}
