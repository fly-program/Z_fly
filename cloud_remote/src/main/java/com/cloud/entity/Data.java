package com.cloud.entity;

import java.util.Date;

public class Data {
    private Integer id;

    private Integer dataExists;

    private Integer clclenumber;

    private Date date;

    private String filename;

    private String footprint;

    private String format;

    private String identifier;

    private String ingestiondate;

    private String instrument;

    private String instrumentabbreviation;

    private String instrumentmode;

    private String instrumentname;

    private String instrumentswath;

    private String jtsfootprint;

    private String launchdate;

    private Integer missiondatatakeid;

    private String missiontype;

    private String nssdcidentifier;

    private String operator;

    private Integer orbitnumberstart;

    private Integer orbitnumberstop;

    private String passdirection;

    private String phaseidentifier;

    private String polarisation;

    private String productclass;

    private String productclassdescription;

    private String productcomposition;

    private String productlevel;

    private String producttype;

    private String relativeorbitstart;

    private String relativeorbitstop;

    private String resolution;

    private String satellitename;

    private String satellitenumber;

    private String sensingstart;

    private String sensingstop;

    private String size;

    private Integer slicenumber;

    private Integer startrelativeorbitnumber;

    private String status;

    private Integer stoprelativeorbitnumber;

    private String timelinesscategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataExists() {
        return dataExists;
    }

    public void setDataExists(Integer dataExists) {
        this.dataExists = dataExists;
    }

    public Integer getClclenumber() {
        return clclenumber;
    }

    public void setClclenumber(Integer clclenumber) {
        this.clclenumber = clclenumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFootprint() {
        return footprint;
    }

    public void setFootprint(String footprint) {
        this.footprint = footprint == null ? null : footprint.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getIngestiondate() {
        return ingestiondate;
    }

    public void setIngestiondate(String ingestiondate) {
        this.ingestiondate = ingestiondate == null ? null : ingestiondate.trim();
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument == null ? null : instrument.trim();
    }

    public String getInstrumentabbreviation() {
        return instrumentabbreviation;
    }

    public void setInstrumentabbreviation(String instrumentabbreviation) {
        this.instrumentabbreviation = instrumentabbreviation == null ? null : instrumentabbreviation.trim();
    }

    public String getInstrumentmode() {
        return instrumentmode;
    }

    public void setInstrumentmode(String instrumentmode) {
        this.instrumentmode = instrumentmode == null ? null : instrumentmode.trim();
    }

    public String getInstrumentname() {
        return instrumentname;
    }

    public void setInstrumentname(String instrumentname) {
        this.instrumentname = instrumentname == null ? null : instrumentname.trim();
    }

    public String getInstrumentswath() {
        return instrumentswath;
    }

    public void setInstrumentswath(String instrumentswath) {
        this.instrumentswath = instrumentswath == null ? null : instrumentswath.trim();
    }

    public String getJtsfootprint() {
        return jtsfootprint;
    }

    public void setJtsfootprint(String jtsfootprint) {
        this.jtsfootprint = jtsfootprint == null ? null : jtsfootprint.trim();
    }

    public String getLaunchdate() {
        return launchdate;
    }

    public void setLaunchdate(String launchdate) {
        this.launchdate = launchdate == null ? null : launchdate.trim();
    }

    public Integer getMissiondatatakeid() {
        return missiondatatakeid;
    }

    public void setMissiondatatakeid(Integer missiondatatakeid) {
        this.missiondatatakeid = missiondatatakeid;
    }

    public String getMissiontype() {
        return missiontype;
    }

    public void setMissiontype(String missiontype) {
        this.missiontype = missiontype == null ? null : missiontype.trim();
    }

    public String getNssdcidentifier() {
        return nssdcidentifier;
    }

    public void setNssdcidentifier(String nssdcidentifier) {
        this.nssdcidentifier = nssdcidentifier == null ? null : nssdcidentifier.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getOrbitnumberstart() {
        return orbitnumberstart;
    }

    public void setOrbitnumberstart(Integer orbitnumberstart) {
        this.orbitnumberstart = orbitnumberstart;
    }

    public Integer getOrbitnumberstop() {
        return orbitnumberstop;
    }

    public void setOrbitnumberstop(Integer orbitnumberstop) {
        this.orbitnumberstop = orbitnumberstop;
    }

    public String getPassdirection() {
        return passdirection;
    }

    public void setPassdirection(String passdirection) {
        this.passdirection = passdirection == null ? null : passdirection.trim();
    }

    public String getPhaseidentifier() {
        return phaseidentifier;
    }

    public void setPhaseidentifier(String phaseidentifier) {
        this.phaseidentifier = phaseidentifier == null ? null : phaseidentifier.trim();
    }

    public String getPolarisation() {
        return polarisation;
    }

    public void setPolarisation(String polarisation) {
        this.polarisation = polarisation == null ? null : polarisation.trim();
    }

    public String getProductclass() {
        return productclass;
    }

    public void setProductclass(String productclass) {
        this.productclass = productclass == null ? null : productclass.trim();
    }

    public String getProductclassdescription() {
        return productclassdescription;
    }

    public void setProductclassdescription(String productclassdescription) {
        this.productclassdescription = productclassdescription == null ? null : productclassdescription.trim();
    }

    public String getProductcomposition() {
        return productcomposition;
    }

    public void setProductcomposition(String productcomposition) {
        this.productcomposition = productcomposition == null ? null : productcomposition.trim();
    }

    public String getProductlevel() {
        return productlevel;
    }

    public void setProductlevel(String productlevel) {
        this.productlevel = productlevel == null ? null : productlevel.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getRelativeorbitstart() {
        return relativeorbitstart;
    }

    public void setRelativeorbitstart(String relativeorbitstart) {
        this.relativeorbitstart = relativeorbitstart == null ? null : relativeorbitstart.trim();
    }

    public String getRelativeorbitstop() {
        return relativeorbitstop;
    }

    public void setRelativeorbitstop(String relativeorbitstop) {
        this.relativeorbitstop = relativeorbitstop == null ? null : relativeorbitstop.trim();
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }

    public String getSatellitename() {
        return satellitename;
    }

    public void setSatellitename(String satellitename) {
        this.satellitename = satellitename == null ? null : satellitename.trim();
    }

    public String getSatellitenumber() {
        return satellitenumber;
    }

    public void setSatellitenumber(String satellitenumber) {
        this.satellitenumber = satellitenumber == null ? null : satellitenumber.trim();
    }

    public String getSensingstart() {
        return sensingstart;
    }

    public void setSensingstart(String sensingstart) {
        this.sensingstart = sensingstart == null ? null : sensingstart.trim();
    }

    public String getSensingstop() {
        return sensingstop;
    }

    public void setSensingstop(String sensingstop) {
        this.sensingstop = sensingstop == null ? null : sensingstop.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Integer getSlicenumber() {
        return slicenumber;
    }

    public void setSlicenumber(Integer slicenumber) {
        this.slicenumber = slicenumber;
    }

    public Integer getStartrelativeorbitnumber() {
        return startrelativeorbitnumber;
    }

    public void setStartrelativeorbitnumber(Integer startrelativeorbitnumber) {
        this.startrelativeorbitnumber = startrelativeorbitnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getStoprelativeorbitnumber() {
        return stoprelativeorbitnumber;
    }

    public void setStoprelativeorbitnumber(Integer stoprelativeorbitnumber) {
        this.stoprelativeorbitnumber = stoprelativeorbitnumber;
    }

    public String getTimelinesscategory() {
        return timelinesscategory;
    }

    public void setTimelinesscategory(String timelinesscategory) {
        this.timelinesscategory = timelinesscategory == null ? null : timelinesscategory.trim();
    }
}