package MyProject.demo.Controller;

import MyProject.demo.Model.License;
import MyProject.demo.Services.LicenseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/license")

public class LicenseController {
    @Autowired
    public LicenseServices licenseServices;

    @PostMapping
    public License addLicense(@RequestBody License license){
        return licenseServices.createLicense(license);
    }
    @GetMapping
    public List<License> findAll(){
        return licenseServices.findAll();
    }

    @GetMapping("{licenseId}")
    public Optional<License> findById(@PathVariable Integer licenseId){
        return licenseServices.findById(licenseId);
    }
    @DeleteMapping("{licenseId}")
    public void deleteLicense(@PathVariable Integer licenseId){
        licenseServices.deleteLicense(licenseId);
    }
    @PutMapping("{licenseId}")
    public License updateLicense(@RequestBody License license,@PathVariable Integer licenseId){
        license.setLicenseId(licenseId);
        return licenseServices.createLicense(license);
    }
}
