package com.challenge.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
