package ac.za.cput.streetstock.util;

import java.util.UUID;

public class UserName
{
    public static String generateUserName()
    {
        return UUID.randomUUID().toString();
    }
}
