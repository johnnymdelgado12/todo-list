package johnnydlgdo.com.service;

import johnnydlgdo.com.model.TodoItem;
import johnnydlgdo.com.model.TodoData;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    // == filed ==
    @Getter
    private final TodoData data = new TodoData();

    // public methods ==
    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(int id, TodoItem toUpdate) {
        data.updateItem(id, toUpdate);
    }
}

