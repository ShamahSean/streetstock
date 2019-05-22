package ac.za.cput.streetstock.repository.device;

import ac.za.cput.streetstock.domain.device.Laptop;
import ac.za.cput.streetstock.repository.IRepository;

import java.util.Set;


public interface LaptopRepository extends IRepository<Laptop, String>
{
    default Set<Laptop> getAll()
    {
        return null;
    }
}
