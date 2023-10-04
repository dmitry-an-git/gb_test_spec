import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import Animals.*;

class Presenter {

    private View view;
    private List<AnimalL1> animals;

    public Presenter() {
        this.view = new View();
        this.animals = new LinkedList<>();
    }

    public void run() {
        while (true) {
            view.showMenu();
            int choice = view.getUserChoice(5);
            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    showAllAnimals();
                    break;
                case 3:
                    trainSkill();
                    break;
                case 4:
                    showAnimalSkills();
                    break;
                case 5:
                    view.displayMessage("Прекращаю работу программы.");
                    return;
              }
        }
    }

    private void addAnimal() {
        view.showAnimalOptions();
        AnimalL1 animal = new L3Cat("noname", LocalDate.now());
        boolean selected = false;
        do {
            int choice = view.getUserChoice(6);
            switch (choice) {
                case 1:
                    animal = new L3Cat("noname", LocalDate.now());
                    selected = true;
                    break;
                case 2:
                    animal = new L3Dog("noname", LocalDate.now());
                    selected = true;
                    break;
                case 3:
                    animal = new L3Hamster("noname", LocalDate.now());
                    selected = true;
                    break;
                case 4:
                    animal = new L3Horse("noname", LocalDate.now());
                    selected = true;
                    break;
                case 5:
                    animal = new L3Donkey("noname", LocalDate.now());
                    selected = true;
                    break;
                case 6:
                    animal = new L3Camel("noname", LocalDate.now());
                    selected = true;
                    break;
            }
        } while (selected = false);
        String name = view.getInput("Введите имя животного: ");
        LocalDate DOB = view.getInputDate("Введите день рождения животного: ");
        animal.setName(name);
        animal.setDateOfBirth(DOB);

        try (Counter newcounter = new Counter()) {
            animals.add(animal);
            view.displayMessage(name + " был добавлен в реестр.");
            newcounter.add();
            System.out.println("\tСчетчик животных в реестре: " + newcounter.getValue()); 
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    private void showAllAnimals() {
        view.displayMessage("Реестр животных:");
        for (int i = 0; i < animals.size(); i++) {
            AnimalL1 animal = animals.get(i);
            view.displayMessage((i + 1) + ". " + animal.getName() + " (" + animal.getType3() + ", DOB: " + animal.getDateOfBirth() + ")");
        }
    }

    private void trainSkill() {
        if (animals.size() == 0) {
            System.out.println("Животных в реестре еще нет.");
            return;
        }

        showAllAnimals();
        int choice = view.getUserChoice("Введите номер животного для добавления навыка: ", animals.size());

        String skill = view.getInput("Введите новый навык: ");
        animals.get(choice - 1).trainSkill(skill);
        view.displayMessage("Добавлен навык: " + skill);

    }

    private void showAnimalSkills() {
        if (animals.size() == 0) {
            System.out.println("Животных в реестре еще нет.");
            return;
        }

        showAllAnimals();

        int choice = view.getUserChoice("Введите номер животного для просмотра навыков: ", animals.size());

        AnimalL1 animal = animals.get(choice - 1);
        List<String> skills = animal.getSkills();
        if (skills.isEmpty()) {
            view.displayMessage(animal.getName() + " пока ничего не умеет.");
        } else {
            view.displayMessage(animal.getName() + " может следующее: ");
            for (int i = 0; i < skills.size(); i++) {
                view.displayMessage((i + 1) + ". " + skills.get(i));
            }
        }

    }
}