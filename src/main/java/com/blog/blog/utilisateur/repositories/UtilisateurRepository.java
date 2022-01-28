package com.blog.blog.utilisateur.repositories;

import com.blog.blog.models.Utilisateur;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {

	Optional<Utilisateur> findByEmail(String email);
}
