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
public class CulturalFragment extends Fragment {


    public CulturalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.sites_list, container, false);

        // Create a list of tour guide sites
        final ArrayList<Sites> sites = new ArrayList<Sites>();
        sites.add(new Sites(R.string.National_Theatre, R.string.National_TheatreAdd, R.drawable.national_theatre));
        sites.add(new Sites(R.string.npc, R.string.npcAdd, R.drawable.npc));
        sites.add(new Sites(R.string.opera, R.string.operaAdd, R.string.operaTime, R.drawable.opera));

        SitesAdapter adapter = new SitesAdapter(getActivity(), sites, R.color.category_cultural);

        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootview;
    }
}
