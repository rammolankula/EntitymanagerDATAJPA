package Rit.Entitymanager.reposiotory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Rit.Entitymanager.domain.Manager;
@Repository
public interface Managerepository extends JpaRepository<Manager,Integer> {

}
