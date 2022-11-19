package org.ecom.cart.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart extends AbstractPersistable<Long> {
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "cart")
    private List<Product> products;
    private String userId;
    private Date lastModified;
}
