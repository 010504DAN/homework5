class Hero {
    // Приватные поля
    private int health;
    private int damage;
    private String superPower;

    // Конструктор, задающий все поля
    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    // Конструктор, задающий только здоровье и урон
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = "No super power"; // Суперспособность по умолчанию
    }

    // Геттер для здоровья
    public int getHealth() {
        return health;
    }

    // Геттер для урона
    public int getDamage() {
        return damage;
    }

    // Геттер для суперспособности
    public String getSuperPower() {
        return superPower;
    }
}