package web.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count <= 0) {
            count = 5;
        }
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}