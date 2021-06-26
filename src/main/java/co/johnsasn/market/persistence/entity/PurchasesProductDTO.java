package co.johnsasn.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class PurchasesProductDTO {

    @EmbeddedId
    private PurchasesProductPK purchasesProductId;

    @Column(name = "cantidad")
    private Integer quantity;

    private Double total;

    @Column(name = "estado")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private PurchaseDTO purchase;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private ProductDTO product;

    public PurchasesProductPK getPurchasesProductId() {
        return purchasesProductId;
    }

    public void setPurchasesProductId(PurchasesProductPK purchasesProductId) {
        this.purchasesProductId = purchasesProductId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public PurchaseDTO getPurchase() {
        return purchase;
    }

    public void setPurchase(PurchaseDTO purchase) {
        this.purchase = purchase;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}


