package com.tshepo.issuetracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tshepo.issuetracker.entity.DeveloperEntity;

@Repository
public interface DeveloperDao extends JpaRepository<DeveloperEntity, Integer> {

}
