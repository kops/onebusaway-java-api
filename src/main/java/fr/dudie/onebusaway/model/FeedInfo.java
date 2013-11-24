package fr.dudie.onebusaway.model;

import java.util.Date;
import java.util.Locale;

/**
 * GTFS feed info details.
 * 
 * @author Jeremie Huchet
 */
public class FeedInfo {

    /** The feed publisher name. */
    private String publisherName;

    /** The feed publisher URL. */
    private String publisherUrl;

    /** The feed language. */
    private Locale lang;

    /** The feed start date. */
    private Date start;

    /** The feed end date. */
    private Date end;

    /** The feed version. */
    private String version;

    /**
     * Gets the feed publisher name.
     * 
     * @return the feed publisher name
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the feed publisher name.
     * 
     * @param publishedName
     *            the feed publisher name to set
     */
    public void setPublisherName(final String publishedName) {
        this.publisherName = publishedName;
    }

    /**
     * Gets the feed publisher URL.
     * 
     * @return the feed publisher URL
     */
    public String getPublisherUrl() {
        return publisherUrl;
    }

    /**
     * Sets feed publisher URL.
     * 
     * @param publisherUrl
     *            the feed publisher URL to set
     */
    public final void setPublisherUrl(final String publisherUrl) {
        this.publisherUrl = publisherUrl;
    }

    /**
     * Gets the feed language.
     * 
     * @return the feed feed language
     */
    public Locale getLang() {
        return lang;
    }

    /**
     * Sets the feed language.
     * 
     * @param lang
     *            the feed language to set
     */
    public final void setLang(final Locale lang) {
        this.lang = lang;
    }

    /**
     * Gets the feed start date.
     * 
     * @return the feed start date
     */
    public final Date getStart() {
        return start;
    }

    /**
     * Sets the feed start date.
     * 
     * @param start
     *            the feed start date to set
     */
    public final void setStart(final Date start) {
        this.start = start;
    }

    /**
     * Gets the feed end date.
     * 
     * @return the feed end date
     */
    public final Date getEnd() {
        return end;
    }

    /**
     * Gets the feed end date.
     * 
     * @param end
     *            the feed end date to set
     */
    public final void setEnd(final Date end) {
        this.end = end;
    }

    /**
     * Gets the feed version.
     * 
     * @return the feed version
     */
    public final String getVersion() {
        return version;
    }

    /**
     * Sets the feed version.
     * 
     * @param version
     *            the feed version to set
     */
    public final void setVersion(final String version) {
        this.version = version;
    }

}
