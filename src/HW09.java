public class HW09 {
    public static void main(String[] args) {
        // Створення чоловіка і жінки
        Man man = new Man("Stepan", "Stepanov", 66);
        Woman woman = new Woman("Maria", "Shevchenko", 61);

        // Реєстрація шлюбу
        man.registerPartnership(woman);

        System.out.println("Після реєстрації шлюбу:");
        System.out.println("Чоловік: " + man.getFirstName() + " " + man.getLastName() + ", партнер: " + man.getPartner().getFirstName());
        System.out.println("Жінка: " + woman.getFirstName() + " " + woman.partner.getLastName() + ", партнер: " + woman.getPartner().getFirstName());

        // Перевірка на пенсію
        System.out.println("Чоловік на пенсії? " + man.isRetired());
        System.out.println("Жінка на пенсії? " + woman.isRetired());

        // Розірвання шлюбу з поверненням прізвища
        woman.deregisterPartnership(true);

        System.out.println("\nПісля розірвання шлюбу:");
        System.out.println("Чоловік: " + man.getFirstName() + " " + man.getLastName() + ", партнер: " + (man.getPartner() != null ? man.getPartner().getFirstName() : "немає"));
        System.out.println("Жінка: " + woman.getFirstName() + " " + woman.getLastName() + ", партнер: " + (woman.getPartner() != null ? woman.getPartner().getFirstName() : "немає"));
    }
}


