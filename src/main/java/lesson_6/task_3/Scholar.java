package lesson_6.task_3;

import java.util.List;
import java.util.Map;

public class Scholar {
    Map<DayOfWeek, List<Lesson>> diary;

    public void setDiary(Map<DayOfWeek, List<Lesson>> diary) {
        this.diary = diary;
    }

    public Map<DayOfWeek, List<Lesson>> getDiary() {
        return diary;
    }

}