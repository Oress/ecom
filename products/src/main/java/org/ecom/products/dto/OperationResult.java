package org.ecom.products.dto;

import lombok.Builder;

import java.util.List;

@Builder
public class OperationResult {
    private boolean isSuccessful;
    private List<ClientMessage> messages;
}
