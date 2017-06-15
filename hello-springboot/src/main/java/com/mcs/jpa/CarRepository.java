/**
 * 
 */
package com.mcs.jpa;

import org.springframework.data.repository.CrudRepository;

import com.mcs.model.Car;

/**
 * @author Intern
 *
 */
public interface CarRepository extends CrudRepository<Car, String> {

}
