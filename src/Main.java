public class Main {
    public static void main(String[] args) {
        // Создание экземпляра Босса и задание всех свойств
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Physical");

        // Печать информации о боссе
        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Вызов метода createHeroes и вывод информации о героях
        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Super Power: " + hero.getSuperPower());
        }
    }

    // Метод createHeroes для создания 3-х героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 20, "Invisibility");
        Hero hero2 = new Hero(150, 25);
        Hero hero3 = new Hero(180, 30, "Fireball");

        // Помещение героев в массив
        Hero[] heroes = {hero1, hero2, hero3};

        // Возврат массива героев
        return heroes;
    }
}