package entities;

import javax.swing.plaf.PanelUI;

public enum CustomerType {
    PERSONAL ("ca nhan"),

    administrativeUnit ("don vi hanh chinh "),

    BusinessUnit ("don vi kinh doanh ");
    public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
