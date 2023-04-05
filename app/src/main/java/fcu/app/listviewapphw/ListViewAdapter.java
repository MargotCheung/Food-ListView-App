package fcu.app.listviewapphw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<FoodItem> listFoods;

    public ListViewAdapter(Context context, List<FoodItem> listFoods) {
        this.context = context;
        this.listFoods = listFoods;
    }

    @Override
    public int getCount() {
        return listFoods.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {  //i = food index i
        if (view == null) {  //if view doesn't exist  //view - food_item_layout
            view = LayoutInflater.from(context).inflate(R.layout.food_item_layout, viewGroup, false);
        }

        //process item# from the list <FoodItem>
        FoodItem food = listFoods.get(i);  //index 0 = burger

        //refer to the top left avatar image
        //get 'view - food_item_layout' using 'inflate'
        ImageView iv = view.findViewById(R.id.iv_food_image);
        iv.setImageResource(food.getImageId());
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iv.setAdjustViewBounds(true);

        TextView tvFoodName = view.findViewById(R.id.tv_food_name);
        tvFoodName.setText(food.getFoodName());

        TextView tvFoodPrice = view.findViewById(R.id.tv_food_price);
        tvFoodPrice.setText("$ " + food.getFoodPrice());

        return view;
    }
}
