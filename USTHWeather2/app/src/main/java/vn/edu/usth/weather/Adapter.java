package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.fragment.app.FragmentActivity;



public class Adapter extends FragmentStateAdapter {

    public Adapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @Override
    public Fragment createFragment(int position) {
        // Return WeatherFragment for position 0, ForecastFragment for position 1,
        // and another instance of WeatherAndForecastFragment for position 2.
        if (position == 0) {
            return new WeatherAndForecastFragment();
        } else if (position == 1) {
            return new WeatherAndForecastFragment();
        } else {
            return new WeatherAndForecastFragment();
        }
    }

    @Override
    public int getItemCount() {
        // Return the number of fragments to display (in this case, 3)
        return 3;
    }
}

