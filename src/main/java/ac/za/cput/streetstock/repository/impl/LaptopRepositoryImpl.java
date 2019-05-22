package ac.za.cput.streetstock.repository.impl;

import ac.za.cput.streetstock.domain.device.Laptop;
import ac.za.cput.streetstock.repository.device.LaptopRepository;

import java.util.HashSet;
import java.util.Set;


public class LaptopRepositoryImpl implements LaptopRepository
{
    private static LaptopRepositoryImpl repository = null;
    private Set<Laptop> laptops;

    private LaptopRepositoryImpl()
    {
        this.laptops = new HashSet<>();
    }

    public static LaptopRepositoryImpl getRepository()
    {
        if (repository == null) repository = new LaptopRepositoryImpl();
        return repository;
    }

    private Laptop findLaptop(String laptopImei)
    {
        return this.laptops.stream()
                .filter(laptop -> laptop.getLaptopImei().trim().equals(laptopImei))
                .findAny()
                .orElse(null);
    }

    public Laptop create(Laptop laptop)
    {
        this.laptops.add(laptop);
        return laptop;
    }


}
