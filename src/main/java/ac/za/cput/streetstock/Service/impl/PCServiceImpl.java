package ac.za.cput.streetstock.Service.impl;

import ac.za.cput.streetstock.Service.PCService;
import ac.za.cput.streetstock.domain.device.PC;

import java.util.Set;

public class PCServiceImpl implements PCService
{
    private PCServiceImpl repository;

    public PC create(PC pc)
    {
        return this.repository.create(pc);
    }

    public Set<PC> getAll()
    {
        return this.repository.getAll();
    }
}
