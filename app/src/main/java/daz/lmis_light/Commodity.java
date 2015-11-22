package daz.lmis_light;

/**
 * Created by Devesh on 19/11/15.
 */
public class Commodity {

    private int _id;
    private String _commodityName;
    private String _quantity;

    public Commodity(){}

    public Commodity(String _commodityName, String _quantity) {
        this._commodityName = _commodityName;
        this._quantity = _quantity;
    }

    public String get_commodityName() {
        return _commodityName;
    }

    public void set_commodityName(String _commodityName) {
        this._commodityName = _commodityName;
    }

    public String get_quantity() {
        return _quantity;
    }

    public void set_quantity(String _quantity) {
        this._quantity = _quantity;
    }
}
