package johnnydlgdo.com.service;

import johnnydlgdo.com.model.TodoData;
import johnnydlgdo.com.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();
}
