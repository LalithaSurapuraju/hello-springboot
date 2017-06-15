/**
 * 
 */
package com.mcs.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcs.model.Car;

/**
 * @author Intern
 *
 */
@Repository
public interface CarRepository extends JpaRepository<Car, String> {

}
