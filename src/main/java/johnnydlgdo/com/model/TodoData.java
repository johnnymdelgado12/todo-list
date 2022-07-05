package johnnydlgdo.com.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    // == fields ==
    private static int idValue;

    private final List<TodoItem> items = new ArrayList<>();

    // == constructor ==

    public TodoData() {
        //== adding dummy data using the addItem() method so it sets the id field
        addItem(new TodoItem(1,"first", "first details", LocalDate.now()));
        addItem(new TodoItem(2,"second", "second details", LocalDate.now()));
        addItem(new TodoItem(3,"third", "third details", LocalDate.now()));
        addItem(new TodoItem(4,"fourth", "fourth details", LocalDate.now()));
    }

    // == public methods ==
    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull TodoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id){
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for (TodoItem item : items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem toUpdate) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()){
            TodoItem item = itemIterator.next();

            if(item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }
    }
}
