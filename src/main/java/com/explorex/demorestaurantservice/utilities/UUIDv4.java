package com.explorex.demorestaurantservice.utilities;

import java.util.UUID;

public class UUIDv4 {

    public static String generateUUIDv4() {
        UUID uuid = UUID.randomUUID();
        return(String.valueOf(uuid));
    }
}
