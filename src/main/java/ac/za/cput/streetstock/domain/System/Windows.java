package ac.za.cput.streetstock.domain.System;

import ac.za.cput.streetstock.domain.device.Laptop;

public class Windows extends Laptop
{
    private String OSVersion;

    private Windows(){}

    private Windows(Builder builder)
    {
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