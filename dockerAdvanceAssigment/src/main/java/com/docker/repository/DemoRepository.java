package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer>{

}
