package kosgebWorkshop.entities;

public class CreditFeatures {
    private int id;
    private Credit credit;
    private Feature feature;

    public CreditFeatures() {
    }

    public CreditFeatures(int id, Credit credit, Feature feature) {
        this.id = id;
        this.credit = credit;
        this.feature = feature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
