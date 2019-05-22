package ac.za.cput.streetstock.factory.device;

import ac.za.cput.streetstock.domain.device.PC;
import ac.za.cput.streetstock.util.GenerateUserName;

public class PCFactory
{
    public static PC buildPC(String pcName)
    {
        return new PC.Builder().pcID(GenerateUserName.generateUserName())
                .pcName(pcName)
                .build();
    }
}
