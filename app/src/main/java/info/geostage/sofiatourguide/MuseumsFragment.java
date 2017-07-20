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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.sites_list, container, false);

        // Create a list of tour guide sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(R.string.National_History, R.string.National_HistoryAdd, R.string.National_HistoryTime,
                R.drawable.national_history));
        sites.add(new Sites(R.string.Earth_Man, R.string.Earth_ManAdd, R.string.Earth_ManTime,
                R.drawable.earth_man));
        sites.add(new Sites(R.string.basilica, R.string.basilicaAdd, R.string.basilicaTime,
                R.drawable.basilica));

        SitesAdapter adapter = new SitesAdapter(getActivity(), sites, R.color.category_museums);

        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootview;
    }

}
