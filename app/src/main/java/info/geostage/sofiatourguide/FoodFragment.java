package info.geostage.sofiatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.sites_list, container, false);

        // Create a list of tour guide sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(R.string.izbata, R.string.izbataAdd, R.string.izbataTime, R.drawable.izbata));
        sites.add(new Sites(R.string.cactus, R.string.cactusAdd, R.string.cactusTime, R.drawable.cactus));
        sites.add(new Sites(R.string.divaka, R.string.divakaAdd, R.string.divakaTime, R.drawable.divaka));


        SitesAdapter adapter = new SitesAdapter(getActivity(), sites, R.color.category_food);

        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return rootview;

    }
}
