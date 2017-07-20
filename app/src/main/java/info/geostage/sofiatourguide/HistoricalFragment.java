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
public class HistoricalFragment extends Fragment {


    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.sites_list, container, false);

        // Create a list of tour guide sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(R.string.alexander_nevsky, R.string.alexNevskyAdd, R.string.alexNevskyTime, R.drawable.alexander_nevsky));
        sites.add(new Sites(R.string.rotunda, R.string.rotundaAdd, R.drawable.rotunda));
        sites.add(new Sites(R.string.serdica, R.string.serdicaAdd, R.drawable.ancient_serdica));

        SitesAdapter adapter = new SitesAdapter(getActivity(), sites, R.color.category_historic);

        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootview;
    }
}