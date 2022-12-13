/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskservice;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author patap
 */
public class Terremoto {
    
    private String eventID;
    private LocalDateTime date;
    private double latitude;
    private double longitude;
    private double depthKm;  
    private String catalog;
    private String contributor;
    private String contributorId;
    private String magType;
    private String magnitude;
    private String magAuthor;
    private String eventLocationName;
    private String eventType;

    public Terremoto(String eventID, LocalDateTime date, double latitude, double longitude, double depthKm, String catalog, String contributor, String contributorId, String magType, String magnitude, String magAuthor, String eventLocationName, String eventType, String location) {
        this.eventID = eventID;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.depthKm = depthKm;
        this.catalog = catalog;
        this.contributor = contributor;
        this.contributorId = contributorId;
        this.magType = magType;
        this.magnitude = magnitude;
        this.magAuthor = magAuthor;
        this.eventLocationName = eventLocationName;
        this.eventType = eventType;
    }

        public Terremoto() {

    }
    
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getLatidute() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getDepthKm() {
        return depthKm;
    }

    public void setDepthKm(double depthKm) {
        this.depthKm = depthKm;
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

    public String getContributorId() {
        return contributorId;
    }

    public void setContributorId(String contributorId) {
        this.contributorId = contributorId;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "Terremoto{" + "eventID=" + eventID + ", date=" + date + ", latitude=" + latitude + ", longitude=" + longitude + ", depthKm=" + depthKm + ", catalog=" + catalog + ", contributor=" + contributor + ", contributorId=" + contributorId + ", magType=" + magType + ", magnitude=" + magnitude + ", magAuthor=" + magAuthor + ", eventLocationName=" + eventLocationName + ", eventType=" + eventType + '}';
    }
    
    
    
}
