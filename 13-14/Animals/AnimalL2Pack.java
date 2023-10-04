package Animals;

import java.time.LocalDate;
import java.util.LinkedList;

abstract class AnimalL2Pack extends AnimalL1{

    public AnimalL2Pack(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.skills = new LinkedList<String>();
        this.type2 = "Вьючное Животное";
    }

}
