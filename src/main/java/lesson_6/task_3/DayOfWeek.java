package lesson_6.task_3;

public enum DayOfWeek {

    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String day;

    DayOfWeek(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}