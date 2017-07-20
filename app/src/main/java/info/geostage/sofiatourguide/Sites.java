
package info.geostage.sofiatourguide;

/**
 * {@link Sites} represents a tour places that the user could visit.
 */
public class Sites {

    /**
     * String resource for the name the Site
     */
    private int mSiteName;

    /**
     * String resource for the address of the Site
     */
    private int mSiteAddress;

    /**
     * String resource for work time of the Site
     */
    private int mWorkTime = NO_TIME_PROVIDED;

    /**
     * Constant value that represents no work time was provided for this Site
     */
    private static final int NO_TIME_PROVIDED = -1;

    /**
     * Image resource ID for the Site
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this Site
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Site object.
     *
     * @param siteName        is the string resource for the name of the Site
     * @param siteAddress     is the string resource for address of the the Site
     * @param imageResourceId is the drawable resource ID for the image associated with the Site
     */
    public Sites(int siteName, int siteAddress, int imageResourceId) {
        mSiteName = siteName;
        mSiteAddress = siteAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Site object.
     *
     * @param siteName        is the string resource for the name of the Site
     * @param siteAddress     is the string resource for address of the the Site
     * @param imageResourceId is the drawable resource ID for the image associated with the Site
     */
    public Sites(int siteName, int siteAddress, int workTime, int imageResourceId) {
        mSiteName = siteName;
        mSiteAddress = siteAddress;
        mWorkTime = workTime;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource for the name of the Site.
     */
    public int getSiteName() {
        return mSiteName;
    }

    /**
     * Get the string resource for the address of the Site.
     */
    public int getSiteAddress() {
        return mSiteAddress;
    }

    /**
     * Return the work time resource of the Site.
     */
    public int getWorkTime() {
        return mWorkTime;
    }

    /**
     * Returns whether or not there is a work time for this Site.
     */
    public boolean hasWorkTime() {
        return mWorkTime != NO_TIME_PROVIDED;
    }

    /**
     * Return the image resource ID of the Site.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Site.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}