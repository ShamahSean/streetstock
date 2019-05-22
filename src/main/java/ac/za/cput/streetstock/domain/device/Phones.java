package ac.za.cput.streetstock.domain.device;



public class Phones
{
    private String phoneName, phoneModel, ImeiNum;

    private Phones()
    { }

    private Phones(Builder builder)
    {
        this.phoneName = builder.phoneName;
        this.phoneModel = builder.phoneModel;
        this.ImeiNum = builder.ImeiNum;
    }

    public String getPhoneName()
    {
        return phoneName;
    }

    public String getImeiNum()
    {
        return ImeiNum;
    }

    public String getPhoneModel()
    {
        return phoneModel;
    }

    public static class Builder
    {
        private String phoneName, phoneModel, ImeiNum;

        public Builder phoneName(String phoneName)
        {
            this.phoneName = phoneName;
            return this;
        }

        public Builder phoneModel(String phoneModel)
        {
            this.phoneModel = phoneModel;
            return this;
        }

        public Builder imeiNum (String imeiNum)
        {
            this.ImeiNum = ImeiNum;
            return this;
        }

        public Builder Cellular(Phones phones)
        {
            this.phoneName = phones.phoneName;
            this.phoneModel = phones.phoneModel;
            this.ImeiNum = phones.ImeiNum;
            return this;
        }

        public Phones buildPhone()
        {
            return new Phones(this);
        }
    }

    @Override
    public String toString()
    {
        return "Phones{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneModel='" + phoneModel + '\'' +
                ", ImeiNum='" + ImeiNum + '\'' +
                '}';
    }

    public boolean equals(Object o1)
    {
        if(this == o1) return true;
        if(o1 == null || getClass() != o1.getClass())return false;
        Phones phones = (Phones) o1;
        return ImeiNum.equals(phones.ImeiNum);
    }

}
