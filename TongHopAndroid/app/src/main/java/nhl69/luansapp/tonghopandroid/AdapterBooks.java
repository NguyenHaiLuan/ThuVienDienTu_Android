package nhl69.luansapp.tonghopandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AdapterBooks extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Books> arrayList;

    public AdapterBooks(Context context, int layout, List<Books> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        Books books =arrayList.get(i);

        TextView name = convertView.findViewById(R.id.name);
        TextView describe = convertView.findViewById(R.id.author);
        TextView state = convertView.findViewById(R.id.state);
        ImageView image = convertView.findViewById(R.id.image);

        name.setText(books.getNameBook());
        describe.setText(books.getAuthor());
        state.setText(books.getState());
        image.setImageResource(books.getImageBook());

        return convertView;
    }
}
