package se.blekingeindustri.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.blekingeindustri.sample.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
