package lk.ijse.dep10.gallery.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/images")
public class ImageController {
    @GetMapping
    public String getAllImages(){
        return "<h1>Working</h1>";
    }
}
