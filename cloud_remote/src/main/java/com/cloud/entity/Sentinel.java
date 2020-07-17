package com.cloud.entity;

import java.util.Date;

public class Sentinel {
    private String filename;

    private String downloadurl;

    private String quicklookurl;

    private String metadataurl;

    private Date clawertime;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl == null ? null : downloadurl.trim();
    }

    public String getQuicklookurl() {
        return quicklookurl;
    }

    public void setQuicklookurl(String quicklookurl) {
        this.quicklookurl = quicklookurl == null ? null : quicklookurl.trim();
    }

    public String getMetadataurl() {
        return metadataurl;
    }

    public void setMetadataurl(String metadataurl) {
        this.metadataurl = metadataurl == null ? null : metadataurl.trim();
    }

    public Date getClawertime() {
        return clawertime;
    }

    public void setClawertime(Date clawertime) {
        this.clawertime = clawertime;
    }
}