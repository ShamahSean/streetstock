package ac.za.cput.streetstock.domain.device;

public class PC
{
    private String pcName, pcModel, pcID;

    private PC ()
    {}

    private PC(Builder builder)
    {
        this.pcName = builder.pcName;
        this.pcModel = builder.pcModel;
        this.pcID = builder.pcID;
    }

    public String getPcName()
    {
        return pcName;
    }

    public String getPcModel()
    {
        return pcModel;
    }

    public String getPcID()
    {
        return pcID;
    }

    public static class Builder
    {
        private String pcName, pcModel, pcID;

        public Builder pcName(String pcName)
        {
            this.pcName = pcName;
            return this;
        }

        public Builder pcModel(String pcModel)
        {
            this.pcModel = pcModel;
            return this;
        }

        public Builder pcID(String pcID)
        {
            this.pcID = pcID;
            return this;
        }

        public Builder computer(PC pc)
        {
            this.pcName = pc.pcName;
            this.pcModel = pc.pcModel;
            this.pcID = pc.pcID;
            return this;
        }
         public PC build()
         {
             return new PC(this);
         }
    }

    @Override
    public String toString()
    {
        return "PC{" +
                "pcName='" + pcName + '\'' +
                ", pcModel='" + pcModel + '\'' +
                ", pcID='" + pcID + '\'' +
                '}';
    }


}
