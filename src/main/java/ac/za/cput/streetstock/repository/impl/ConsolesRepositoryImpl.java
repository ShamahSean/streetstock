package ac.za.cput.streetstock.repository.impl;

import ac.za.cput.streetstock.domain.device.Consoles;
import ac.za.cput.streetstock.repository.device.ConsolesInterface;
import ac.za.cput.streetstock.repository.device.ConsolesRepository;

import java.util.HashMap;
import java.util.Map;

public class ConsolesRepositoryImpl implements ConsolesRepository, ConsolesInterface
{
    private static ConsolesRepositoryImpl repository = null;
    private Map<String, Consoles> consoles;

    private ConsolesRepositoryImpl()
    {
        this.consoles = new HashMap<>();
    }
    public static ConsolesRepository getRepository()
    {
        if(repository == null) repository = new ConsolesRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String, Consoles> getAll()
    {
        return null;
    }

    public Consoles create()
    {
        return create((Consoles) null);
    }

    public Consoles create(Consoles consoles)
    {
        this.consoles.put(consoles.getPlayStation(), consoles);
        Consoles savedConsoles = this.consoles.get(consoles.getPlayStation());
        return savedConsoles;
    }

    @Override
    public Consoles update(Consoles consoles)
    {
        return null;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Consoles read(String s)
    {
        return null;
    }

    @Override
    public Consoles create(String consoles)
    {
        return null;
    }
}
