package ac.za.cput.streetstock.factory.System;

import ac.za.cput.streetstock.domain.device.Laptop;

public class WindowsFactory extends Laptop
{
    private String OSVersion;

    private WindowsFactory(Builder builder)
    {
        super();
        this.OSVersion = builder.OSVersion;
    }
    public String getOSVersion()
    {
        return OSVersion;
    }
    public static class Builder
    {
        private String OSVersion;

        public Builder OSVersion(String OSVersion)
        {
            this.OSVersion = OSVersion;
            return this;
        }
    }
}