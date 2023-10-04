package Animals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public abstract class AnimalL1 {
    
    protected String type1 = "Животное";
    protected String type2;
    protected String type3;
    protected LinkedList<String> skills;

    protected String name;
    protected LocalDate dateOfBirth;

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getType3() {
        return type3;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void trainSkill(String skill) {
        skills.add(skill);
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate date) {
        this.dateOfBirth = date;
    }
}
