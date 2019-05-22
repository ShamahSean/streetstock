package ac.za.cput.streetstock.repository.device;

import ac.za.cput.streetstock.domain.device.Consoles;

import java.util.Map;

public interface ConsolesRepository
{
    Map<String, Consoles> getAll();

    Consoles update(Consoles consoles);

    void delete(String s);

    Consoles read(String s);

    Consoles create(String consoles);
}
