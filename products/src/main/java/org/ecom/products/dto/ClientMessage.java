package org.ecom.products.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClientMessage {
    private String contents;
    private String type;
}
