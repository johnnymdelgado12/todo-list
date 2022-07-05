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

    private final List<ToDoItem> items = new ArrayList<>();

    // == constructor ==

    public TodoData() {
        //== adding dummy data using the addItem() method so it sets the id field
        addItem(new ToDoItem(1,"first", "first details", LocalDate.now()));
        addItem(new ToDoItem(2,"second", "second details", LocalDate.now()));
        addItem(new ToDoItem(3,"third", "third details", LocalDate.now()));
    }

    // == public methods ==
    public List<ToDoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ToDoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id){
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()) {
            ToDoItem item = itemIterator.next();

            if (item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public ToDoItem getItem(int id) {
        for (ToDoItem item : items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ToDoItem toUpdate) {
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();

            if(item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }
    }
}
