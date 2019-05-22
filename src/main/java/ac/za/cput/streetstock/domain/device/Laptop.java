package ac.za.cput.streetstock.domain.device;

import org.jetbrains.annotations.Contract;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import  java.util.Objects;

@EntityScan
public class Laptop
{
    private String laptopName, laptopModel, laptopImei;

    @Contract(pure = true)
    protected Laptop()
    {}

    private Laptop(Builder builder)
    {
        this.laptopImei = builder.laptopImei;
        this.laptopModel = builder.laptopImei;
        this.laptopName = builder.laptopName;
    }

    public String getLaptopName()
    {
        return laptopName;
    }

    public String getLaptopModel()
    {
        return laptopModel;
    }

    public String getLaptopImei()
    {
        return laptopImei;
    }

    public static class Builder
    {
        private String laptopName, laptopModel, laptopImei;

        public Builder laptopName(String laptopName)
        {
            this.laptopName = laptopName;
            return this;
        }

        public Builder laptopModel(String laptopModel)
        {
            this.laptopModel = laptopModel;
            return this;
        }

        public Builder laptopImei(String laptopImei)
        {
            this.laptopImei = laptopImei;
            return this;
        }

        public Laptop build()
        {
            return new Laptop(this);
        }

    }

    @Override
    public String toString()
    {
        return "Laptop{" +
                "laptopName='" + laptopName + '\'' +
                ", laptopModel='" + laptopModel + '\'' +
                ", laptopImei='" + laptopImei + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return laptopName.equals(laptop.laptopName);
    }

    public int hashCode()
    {
        return Objects.hash(laptopImei);
    }
}
