package johnnydlgdo.com.controller;

import johnnydlgdo.com.model.ToDoData;
import johnnydlgdo.com.util.Mappings;
import johnnydlgdo.com.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {
    // == model attributes ==
    @ModelAttribute
    public ToDoData todoData() {
        return new ToDoData();
    }

    // == handler methods ==
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
