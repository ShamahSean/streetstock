package ac.za.cput.streetstock.util;

import java.util.UUID;

public class GenerateUserName
{
    public static String generateUserName()
    {
        return UUID.randomUUID().toString();
    }
}
