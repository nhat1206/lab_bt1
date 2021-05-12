package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);
        Log.d("Insert: ", "Inserting ..");
        db.addStudent(new Student(1,"Nhan","Ha Noi","0987654321"));
        Log.d("Reading: ", "Reading all contacts..");
        List<Student> students = db.getAllStudents();

        for (Student st : students) {
            String log = "Id: " + st.getId() + " ,Name: " + st.getName() + " ,Address: " + st.getAddress() + " ,Phone: " +
                    st.getPhone_number();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}
