class Boss {
    // Приватные поля
    private int health;
    private int damage;
    private String defenseType;

    // Геттеры для всех полей
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    // Сеттеры для всех полей
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}