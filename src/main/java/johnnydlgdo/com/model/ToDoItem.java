package johnnydlgdo.com.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class ToDoItem {
    // == fields ==
    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    // == constructors ==
    public ToDoItem(int id, String title, String details, LocalDate deadline) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }
}
