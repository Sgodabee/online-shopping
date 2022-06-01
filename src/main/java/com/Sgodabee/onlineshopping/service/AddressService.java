package com.Sgodabee.onlineshopping.service;

import com.Sgodabee.onlineshopping.model.Address;

public interface AddressService {

    boolean saveAddress(Address address);

    Address findAddressByBilling(boolean billing);

}
