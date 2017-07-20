
package info.geostage.sofiatourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SitesAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Sites} objects.
 */
public class SitesAdapter extends ArrayAdapter<Sites> {

    /**
     * Resource ID for the background color for this list of sites
     */
    private int mColorResourceId;

    /**
     * Create a new {@link SitesAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param sites           is the list of {@link Sites}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of sites
     */
    public SitesAdapter(Context context, ArrayList<Sites> sites, int colorResourceId) {
        super(context, 0, sites);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Sites} object located at this position in the list
        Sites currentSite = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name from the currentSite object and set this text on
        // the Name TextView.
        nameTextView.setText(currentSite.getSiteName());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address from the currentSite object and set this text on
        // the Address TextView.
        addressTextView.setText(currentSite.getSiteAddress());

        // Find the TextView in the list_item.xml layout with the ID time_text_view.
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        // Check if an image is provided for this Site or not
        if (currentSite.hasWorkTime()) {
            // If an image is available, display the provided image based on the resource ID
            timeTextView.setText(currentSite.getWorkTime());
            // Make sure the view is visible
            timeTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            timeTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this Site or not
        if (currentSite.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSite.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}