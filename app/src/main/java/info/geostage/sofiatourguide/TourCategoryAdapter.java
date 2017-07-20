package info.geostage.sofiatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link TourCategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Sites} objects.
 */
public class TourCategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link TourCategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public TourCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new CulturalFragment();
        } else if (position == 3) {
            return new MallsFragment();
        } else {
            return new FoodFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_historic);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mContext.getString(R.string.category_cultural);
        } else if (position == 3) {
            return mContext.getString(R.string.category_malls);
        } else {
            return mContext.getString(R.string.category_food);

        }
    }
}
