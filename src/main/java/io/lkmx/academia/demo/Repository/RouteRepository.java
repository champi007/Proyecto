package io.lkmx.academia.demo.Repository;

import io.lkmx.academia.demo.Entity.Route;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RouteRepository  extends MongoRepository<Route,String> {

     @Query(value = "{corto:?0}")
     Route findByCortoAndId(String corto);




}
