package com.mouad.stockmanagement.exception;

public enum ErrorCodes {
    PRODUCT_NOT_FOUND(1000),
    PRODUCT_NOT_VALID(1001),
    PRODUCT_ALREADY_IN_USE(1002),

    CATEGORY_NOT_FOUND(2000),
    CATEGORY_NOT_VALID(2001),
    CATEGORY_ALREADY_IN_USE(2002),

    CLIENT_NOT_FOUND(3000),
    CLIENT_NOT_VALID(3001),
    CLIENT_ALREADY_IN_USE(3002),

    CLIENT_ORDER_NOT_FOUND(4000),
    CLIENT_ORDER_NOT_VALID(4001),
    CLIENT_ORDER_NOT_MODIFIABLE(4002),
    CLIENT_ORDER_ALREADY_IN_USE(4003),

    SUPPLIER_ORDER_NOT_FOUND(5000),
    SUPPLIER_ORDER_NOT_VALID(5001),
    SUPPLIER_ORDER_NOT_MODIFIABLE(5002),
    SUPPLIER_ORDER_ALREADY_IN_USE(5003),

    COMPANY_NOT_FOUND(6000),
    COMPANY_NOT_VALID(6001),

    SUPPLIER_NOT_FOUND(7000),
    SUPPLIER_NOT_VALID(7001),
    SUPPLIER_ALREADY_IN_USE(7002),

    CLIENT_ORDER_LINE_NOT_FOUND(8000),
    SUPPLIER_ORDER_LINE_NOT_FOUND(9000),
    SALE_LINE_NOT_FOUND(10000),

    STOCK_MOVEMENT_NOT_FOUND(11000),
    STOCK_MOVEMENT_NOT_VALID(11001),

    USER_NOT_FOUND(12000),
    USER_NOT_VALID(12001),
    USER_ALREADY_EXISTS(12002),
    USER_CHANGE_PASSWORD_OBJECT_NOT_VALID(12003),

    BAD_CREDENTIALS(12003),

    SALE_NOT_FOUND(13000),
    SALE_NOT_VALID(13001),
    SALE_ALREADY_IN_USE(13002),

    // Liste des exception techniaues
    UPDATE_PHOTO_EXCEPTION(14000),
    UNKNOWN_CONTEXT(14001)
    ;

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
