package org.forpdi.core.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UFRepository extends JpaRepository<UF, Long> {
}
