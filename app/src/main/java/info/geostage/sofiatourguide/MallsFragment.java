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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.sites_list, container, false);

        // Create a list of tour guide sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(R.string.Mall_Of_Sofia, R.string.Mall_Of_SofiaAdd, R.string.Mall_Of_SofiaTime,
                R.drawable.sofia_mall));
        sites.add(new Sites(R.string.paradise, R.string.paradiseAdd, R.string.paradiseTime,
                R.drawable.paradise));
        sites.add(new Sites(R.string.mall, R.string.mallAdd, R.string.mallTime,
                R.drawable.mall));
        SitesAdapter adapter = new SitesAdapter(getActivity(), sites, R.color.category_malls);

        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootview;
    }

}
