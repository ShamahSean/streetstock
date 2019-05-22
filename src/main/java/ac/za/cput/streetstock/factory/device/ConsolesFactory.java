package ac.za.cput.streetstock.factory.device;

import ac.za.cput.streetstock.domain.device.Consoles;
import ac.za.cput.streetstock.util.GenerateUserName;

public class ConsolesFactory
{
    public static Consoles builderConsoles(String playStation)
    {
        return new Consoles.Builder().playStation(GenerateUserName.generateUserName())
                .playStation(playStation).build();
    }

    public static Consoles getConsoles(String playStation)
    {
        return new Consoles.Builder()
                .playStation(GenerateUserName.generateUserName())
                .playStation(playStation)
                .build();
    }
}
