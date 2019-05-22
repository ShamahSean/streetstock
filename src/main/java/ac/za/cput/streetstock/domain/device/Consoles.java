package ac.za.cput.streetstock.domain.device;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Consoles
{
    private String playStation, xBox;

    private Consoles()
    {}

    private Consoles(Builder builder)
    {
        this.playStation = builder.playStation;
        this.xBox = builder.xBox;
    }

    public String getPlayStation()
    {
        return playStation;
    }

    public String getxBox()
    {
        return xBox;
    }

    public static class Builder
    {
        private String playStation, xBox;

        public Builder playStation(String playStation)
        {
            this.playStation = playStation;
            return this;
        }

        public Builder xBox(String xBox)
        {
            this.xBox = xBox;
            return this;
        }

        public Builder copy(Consoles consoles)
        {
            this.playStation = consoles.playStation;
            this.xBox = consoles.xBox;
            return this;
        }

        public Consoles build()
        {
            return new Consoles(this);
        }
    }
}
