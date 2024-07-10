package MyProject.demo.Services;

import MyProject.demo.Model.License;
import MyProject.demo.Repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LicenseServices {
    @Autowired
    public LicenseRepository licenseRepository;

    public License createLicense(License license) {
        return licenseRepository.save(license);
    }

    public List<License> findAll() {
        return licenseRepository.findAll();
    }

    public Optional<License> findById(Integer licenseId) {
        return licenseRepository.findById(licenseId);
    }

    public void deleteLicense(Integer licenseId) {
        licenseRepository.deleteById(licenseId);
    }
}
