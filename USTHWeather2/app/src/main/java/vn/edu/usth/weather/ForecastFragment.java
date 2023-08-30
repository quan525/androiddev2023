package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ForecastFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /*
                LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.parseColor("#89CFF0"));

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

// Create the TextView
        TextView dayTextView = new TextView(requireContext());
        dayTextView.setLayoutParams(layoutParams);
        dayTextView.setText("Thursday");

// Create the ImageView
        ImageView weatherIconImageView = new ImageView(requireContext());
        weatherIconImageView.setLayoutParams(layoutParams);
        weatherIconImageView.setImageResource(R.drawable.cloud);

        Button myButton = new Button(requireContext());
        myButton.setLayoutParams(layoutParams);
        myButton.setText("Click Me"); // Set your desired button text

// Add TextView and ImageView to the LinearLayout
        linearLayout.addView(myButton);
        linearLayout.addView(dayTextView);
        linearLayout.addView(weatherIconImageView);
        return linearLayout;*/
        super.onCreateView(inflater,container,savedInstanceState);
        return inflater.inflate(R.layout.fragment_forecast,container,false);
    }
}
