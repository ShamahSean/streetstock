package ac.za.cput.streetstock.Service.impl;

import ac.za.cput.streetstock.Service.LaptopService;
import ac.za.cput.streetstock.domain.device.Laptop;
import ac.za.cput.streetstock.repository.impl.LaptopRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LaptopServiceImpl implements LaptopService
{
    private static LaptopServiceImpl service = null;
    private LaptopRepositoryImpl repository;

    private LaptopServiceImpl()
    {
        this.repository = LaptopRepositoryImpl.getRepository();
    }

    public Laptop create(Laptop laptop)
    {
        return this.repository.create(laptop);
    }

    public Set<Laptop> getAll()
    {
        return this.repository.getAll();
    }

}
