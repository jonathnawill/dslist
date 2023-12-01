package com.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dslist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
