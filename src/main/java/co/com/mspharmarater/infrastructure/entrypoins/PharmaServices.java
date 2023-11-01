package co.com.mspharmarater.infrastructure.entrypoins;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/pharma")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PharmaServices {

}
