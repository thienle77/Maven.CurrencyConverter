package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
       // return Double.MAX_VALUE;
    }

    CurrencyType getCurrencyType();
}
