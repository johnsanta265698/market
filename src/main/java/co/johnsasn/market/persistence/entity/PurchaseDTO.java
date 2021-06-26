package co.johnsasn.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class PurchaseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer purchaseId;

    @Column(name = "id_cliente")
    private String customerId;

    @Column(name = "fecha")
    private LocalDateTime date;

    @Column(name = "medio_pago")
    private String paymentMethod;

    @Column(name = "comentario")
    private String commentary;

    @Column(name = "estado")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private CustomerDTO customer;

    @OneToMany(mappedBy = "product")
    private List<PurchasesProductDTO> productsOfAPurchase;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<PurchasesProductDTO> getProductsOfAPurchase() {
        return productsOfAPurchase;
    }

    public void setProductsOfAPurchase(List<PurchasesProductDTO> productsOfAPurchase) {
        this.productsOfAPurchase = productsOfAPurchase;
    }
}
