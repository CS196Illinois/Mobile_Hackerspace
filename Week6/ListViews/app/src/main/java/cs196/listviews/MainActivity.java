package cs196.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> users = new ArrayList<>();
        inflateData(users);

        UserAdapter adapter = new UserAdapter(getApplicationContext(), users);

        ListView userListView = (ListView) findViewById(R.id.userList);
        userListView.setAdapter(adapter);
    }

    public void inflateData(ArrayList<User> users){
        users.add(new User("Tommy Yu", "Male", 18));
        users.add(new User("Elon Musk", "Male", 45));
        users.add(new User("Hillary Clinton", "Female", 68));
        users.add(new User("Harambe", "Male Gorilla", 17));
    }
}
