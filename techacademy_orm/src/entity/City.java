package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
    
@Entity
@Table(name="city")
public class City {
    //プロパティ
    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Countrycode")
    private String countryCode;
    
    @Column(name = "District")
    private String district;
    
    @Column(name = "Population")
    private int population;
    
    // setter / getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}

