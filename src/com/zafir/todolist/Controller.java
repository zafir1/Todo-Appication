package com.zafir.todolist;

import com.zafir.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Controller {
    private ArrayList<TodoItem> todoItems;
    @FXML
    private ListView todoListView;

    public void initialize(){
        TodoItem item1 = new TodoItem("Email Birthday Card",
                "Buy a 22nd birthday card for Nasir.", LocalDate.of(2019, Month.JANUARY,25));
        TodoItem item2 = new TodoItem("Go and make practice.",
                "Practice for Apti test.", LocalDate.of(2018, Month.APRIL,28));
        TodoItem item3 = new TodoItem("Solve Algorithms",
                "Solve Algorithmic Problems", LocalDate.of(2018, Month.APRIL,11));
        TodoItem item4 = new TodoItem("Preparing for semesters.",
                "Start prepration of semesters.", LocalDate.of(2018, Month.APRIL,12));
        TodoItem item5 = new TodoItem("Take a Job.",
                "This is the perfect time for taking job.", LocalDate.of(2018, Month.MAY,2));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
    }

    @FXML
    public void handleClickListView(){
        TodoItem item = (todoItems) todoListView.getSelectionModel().getSelectedItem();
    }
}
