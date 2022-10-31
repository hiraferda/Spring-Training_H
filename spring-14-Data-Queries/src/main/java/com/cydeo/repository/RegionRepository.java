package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {
    //display all regions in canada
    List<Region> findByCountry(String country);
    List<Region> getByCountry(String country);

    //display all regions with country names includes "United"
    List<Region> findByCountryContaining(String country);
    //display all regions with country name includes 'United' in order(region)
    List<Region> findByCountryContainsOrderByRegionDesc(String country);
    //display top 2 regions in the US
    List<Region> findTopByCountry(String country);
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);
}
