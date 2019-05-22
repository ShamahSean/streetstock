package ac.za.cput.streetstock.domain.product;
import java.util.Set;

public class Products
{
    private String distributorName, productName, model, description;
    private Set<Stock>stocks;

    private Products(){}

    private Products (Builder builder)
    {
        this.productName = builder.productName;
        this.distributorName = builder.distributorName;
        this.model = builder.model;
        this.description = builder.description;
    }

    public String getDistributorName()
    {
        return distributorName;
    }

    public String getProductName()
    {
        return productName;
    }

    public String getModel()
    {
        return model;
    }

    public String getDescription()
    {
        return description;
    }
     public static class Builder
     {
         private String distributorName, productName, model, description;
         private Set<Stock>stocks;

    public Builder distributorName( String distributorName)
    {
        this.distributorName = distributorName;
        return this;
    }

    public Builder productName ( String productName)
    {
        this.productName = productName;
        return this;
    }

    public Builder model( String model)
    {
        this.model = model;
        return this;
    }

    public Builder description( String description)
    {
        this.description= description;
        return this;
    }

    public Products build()
    {
        return new Products(this);
    }
     }

    @Override
    public String toString()
    {
        return "Products{" +
                "distributorName='" + distributorName + '\'' +
                ", productName='" + productName + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", stocks=" + stocks +
                '}';
    }
}