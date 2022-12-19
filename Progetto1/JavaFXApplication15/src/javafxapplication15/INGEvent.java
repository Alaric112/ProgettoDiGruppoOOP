/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication15;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author GROUP 06
 */
public class INGEvent implements Serializable{
    
    
    private String eventID;
    private LocalDate time;
    private double latiutude;
    private double longitude;
    private double depthkm;
    private String author;
    private String catalog;
    private String contributor;
    private String contributorID;
    private String magType;
    private double magnitude;
    private String magAuthor;
    private String eventLocationName;

    public INGEvent(String eventID, LocalDate time, double latiutude, double longitude, double depthkm, String author, String catalog, String contributor, String contributorID, String magType, double magnitude, String magAuthor, String eventLocationName) {
        this.eventID = eventID;
        this.time = time;
        this.latiutude = latiutude;
        this.longitude = longitude;
        this.depthkm = depthkm;
        this.author = author;
        this.catalog = catalog;
        this.contributor = contributor;
        this.contributorID = contributorID;
        this.magType = magType;
        this.magnitude = magnitude;
        this.magAuthor = magAuthor;
        this.eventLocationName = eventLocationName;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public double getLatiutude() {
        return latiutude;
    }

    public void setLatiutude(double latiutude) {
        this.latiutude = latiutude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getDepthkm() {
        return depthkm;
    }

    public void setDepthkm(double depthkm) {
        this.depthkm = depthkm;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getContributorID() {
        return contributorID;
    }

    public void setContributorID(String contributorID) {
        this.contributorID = contributorID;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getMagAuthor() {
        return magAuthor;
    }

    public void setMagAuthor(String magAuthor) {
        this.magAuthor = magAuthor;
    }

    public String getEventLocationName() {
        return eventLocationName;
    }

    public void setEventLocationName(String eventLocationName) {
        this.eventLocationName = eventLocationName;
    }
    
    
    
    
}
