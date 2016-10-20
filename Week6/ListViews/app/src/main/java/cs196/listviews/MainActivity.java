package cs196.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        final ArrayList<User> users = new ArrayList<>();
        inflateData(users);

        UserAdapter adapter = new UserAdapter(getApplicationContext(), users);

        ListView userListView = (ListView) findViewById(R.id.userList);
        userListView.setAdapter(adapter);

        userListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User elon = users.get(position);
            }
        });
    }

    public void inflateData(ArrayList<User> users){
        users.add(new User("Tommy Yu", "Male", 18));
        users.add(new User("Elon Musk", "Male", 45));
        users.add(new User("Hillary Clinton", "Female", 68));
        users.add(new User("Harambe", "Male Gorilla", 17));

        for(User user: users){
            mDatabase.child("users").child(user.getName()).setValue(user);
        }
    }
}
