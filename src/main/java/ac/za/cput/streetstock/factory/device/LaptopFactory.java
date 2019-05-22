package ac.za.cput.streetstock.factory.device;

import ac.za.cput.streetstock.domain.device.Laptop;
import ac.za.cput.streetstock.util.GenerateUserName;

public class LaptopFactory
{
    public static Laptop buildLaptop(String laptopImei)
    {
        return new Laptop.Builder().laptopImei(GenerateUserName.generateUserName())
                .laptopImei(laptopImei).build();
    }
}
