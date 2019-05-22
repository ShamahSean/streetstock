package ac.za.cput.streetstock.Controller.device;


import ac.za.cput.streetstock.Service.impl.PCServiceImpl;
import ac.za.cput.streetstock.domain.device.PC;
import ac.za.cput.streetstock.factory.device.PCFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

public class PCController
{
    private PCServiceImpl service;

    @Autowired
    @GetMapping("/create/{pcName}")
    public @ResponseBody
    PC create(@PathVariable String pcName)
    {
        PC pc = PCFactory.buildPC(pcName);
        return service.create(pc);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<PC> getAll()
    {
        return service.getAll();
    }

}
