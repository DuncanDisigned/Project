package data;

public enum ColorData {
    WHITE("Белый"), RED("Рыжий"), DARK("Чёрный"), GRAY("Серый");
    private String name;

    ColorData(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
