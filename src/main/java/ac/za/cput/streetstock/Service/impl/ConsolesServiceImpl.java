package ac.za.cput.streetstock.Service.impl;

import ac.za.cput.streetstock.domain.device.Consoles;
import ac.za.cput.streetstock.repository.device.ConsolesRepository;
import ac.za.cput.streetstock.repository.impl.ConsolesRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsolesServiceImpl
{
    private static ConsolesServiceImpl service = null;

    ConsolesRepository repository = ConsolesRepositoryImpl.getRepository();

    private static ConsolesServiceImpl getInstance()
    {
        if(service == null)
            service = new ConsolesServiceImpl();
        return service;
    }

    public Map<String, Consoles> getAllPlaystation()
    {
        return null;
    }

    public Map<String, Consoles> getAll()
    {
        return null;
    }

    public Consoles create(String consoles)
    {
        return repository.create(consoles);
    }

    public Consoles update(Consoles consoles)
    {
        return repository.update(consoles);
    }

    public void delete(String s)
    {
        repository.delete(s);
    }

    public Consoles read(String s)
    {
        return repository.read(s);
    }
}
