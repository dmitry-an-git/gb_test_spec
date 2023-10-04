import java.time.LocalDate;
import java.util.Scanner;

class View {

    public void showMenu() {
        System.out.println("--------------------------------");
        System.out.println("Меню реестра животных:");
        System.out.println("1. Добавление новых животных");
        System.out.println("2. Просмотр всех животных");
        System.out.println("3. Тренировка новых навыков");
        System.out.println("4. Просмотр существующих навыков");
        System.out.println("5. Выход");
        System.out.println("--------------------------------");
    }

    public void showAnimalOptions() {
        System.out.println("Возможные животные:");
        System.out.println("1. Кот");
        System.out.println("2. Собака");
        System.out.println("3. Хомяк");
        System.out.println("4. Лошадь");
        System.out.println("5. Осел");
        System.out.println("6. Верблюд");
    }

    /* method that get choice from the user (integer) */
    public int getUserChoice(Integer max) {
        System.out.print("Сделайте выбор: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Integer choice = scanner.nextInt();
                if (choice>max || choice<1) {throw new Exception("Out of limits");}
                return choice;
            } catch (Exception e) { 
                System.out.print("Неверный выбор. Пожалуйста, сделайте корректный ввод (1-" + max +"): ");
            }
        }
    }

    public int getUserChoice(String prompt, Integer max) {
        System.out.println(prompt);
        return getUserChoice(max);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /*
     * we only use it in try-catch of getInputData, so no separate error checking
     */
    public Integer getDigit(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public LocalDate getInputDate(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                Integer year = getDigit("\tВведите год: ");
                Integer month = getDigit("\tВведите месяц: ");
                Integer day = getDigit("\tВведите день: ");
                LocalDate date = LocalDate.of(year, month, day);
                return date;
            } catch (Exception e) {
                System.out.println("Неверный ввод. Повторите попытку.");
            }
        }
    }
}