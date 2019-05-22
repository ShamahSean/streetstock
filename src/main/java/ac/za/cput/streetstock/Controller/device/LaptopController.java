package ac.za.cput.streetstock.Controller.device;

import ac.za.cput.streetstock.Service.impl.LaptopServiceImpl;
import ac.za.cput.streetstock.domain.device.Laptop;
import ac.za.cput.streetstock.factory.device.LaptopFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping("/streetstock/laptop")
public class LaptopController
{
    @Autowired
    private LaptopServiceImpl service;

    @GetMapping("/create/{laptopName}")
    public @ResponseBody
    Laptop create(@PathVariable String laptopName)
    {
        Laptop laptop = LaptopFactory.buildLaptop(laptopName);
        return  service.create(laptop);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Laptop> getAll()
    {
        return service.getAll();
    }
}
