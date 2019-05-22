package ac.za.cput.streetstock.Controller.device;

import ac.za.cput.streetstock.Service.impl.ConsolesServiceImpl;
import ac.za.cput.streetstock.domain.device.Consoles;
import ac.za.cput.streetstock.factory.device.ConsolesFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("streetstock/consoles")
public class ConsolesController
{
    @Autowired
    ConsolesServiceImpl service;

    @GetMapping("/landingPage.html")
    public @ResponseBody
    Consoles create(@PathVariable Map<String, String> values, String playStation,String xBox)
    {
        Consoles consoles = ConsolesFactory.getConsoles(playStation);
        return service.create(playStation);
    }
}
