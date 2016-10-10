package cs196.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tommypacker for HackIllinois' 2016 Clue Hunt
 */

public class UserAdapter extends ArrayAdapter<User> {

    public static class ViewHolder{
        TextView name;
        TextView gender;
        TextView age;
    }

    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, R.layout.custom_row, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        ViewHolder viewHolder;

        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.custom_row, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.gender = (TextView) convertView.findViewById(R.id.gender);
            viewHolder.age = (TextView) convertView.findViewById(R.id.age);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(user.getName());
        viewHolder.gender.setText(user.getGender());
        viewHolder.age.setText(user.getAge());

        return convertView;
    }
}
