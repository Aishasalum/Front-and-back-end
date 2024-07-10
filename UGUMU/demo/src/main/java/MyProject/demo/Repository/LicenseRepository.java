package MyProject.demo.Repository;

import MyProject.demo.Model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LicenseRepository extends JpaRepository<License, Integer> {
}
