package org.ecom.products.dto;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class OperationResult {
    boolean isSuccessful;
    List<ClientMessage> messages;
}
