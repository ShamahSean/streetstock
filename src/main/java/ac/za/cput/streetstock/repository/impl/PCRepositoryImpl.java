package ac.za.cput.streetstock.repository.impl;

import ac.za.cput.streetstock.domain.device.Laptop;
import ac.za.cput.streetstock.domain.device.PC;
import ac.za.cput.streetstock.repository.device.PCRepository;

import java.util.HashSet;
import java.util.Set;

public class PCRepositoryImpl implements PCRepository
{
    private static PCRepositoryImpl repository = null;
    private Set<PC> pcs;

    private PCRepositoryImpl()
    {
        this.pcs = new HashSet<>();
    }

    private PC findPC(String pcID)
    {
        return this.pcs.stream()
                .filter(laptop -> laptop.getPcID().trim().equals(pcID))
                .findAny()
                .orElse(null);
    }

    public static PCRepositoryImpl getRepository()
    {
        if (repository == null) repository = new PCRepositoryImpl();
        return repository;
    }

    public Laptop create(Laptop pc)
    {
        this.pcs.add(pc);
        return pc;
    }

    public PC read(final String pcID)
    {
        PC pc = findPC(pcID);
        return pc;
    }

    public void delete(String pcID)
    {
        PC pc = findPC(pcID);
        if (pc != null) this.pcs.remove(pc);
    }

    public PC update(PC pc)
    {
        PC toDelete = findPC(pc.getPcID());
        if(toDelete != null)
        {
            this.pcs.remove(toDelete);
            return create(pc);
        }
        return null;
    }

    public Set<PC> getAll()
    {
        return this.pcs;
    }
}