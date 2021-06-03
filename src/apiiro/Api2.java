package apiiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.*;
import org.apache.commons.crypto.cipher.*;

public class Api2 {
    @GetMapping("api2/bar")
    public String bar () {
        return "bar";
    }
}
