package com.rafaelfelix.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafaelfelix.web_services.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
