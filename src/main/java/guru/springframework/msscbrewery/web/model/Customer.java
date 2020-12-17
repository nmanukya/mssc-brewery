package guru.springframework.msscbrewery.web.model;

public class Customer {
    private Integer id;
    private String customerName;

    public Customer(Integer id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public Customer() {
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) return false;
        final Customer other = (Customer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$customerName = this.getCustomerName();
        final Object other$customerName = other.getCustomerName();
        if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Customer;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $customerName = this.getCustomerName();
        result = result * PRIME + ($customerName == null ? 43 : $customerName.hashCode());
        return result;
    }

    public String toString() {
        return "Customer(id=" + this.getId() + ", customerName=" + this.getCustomerName() + ")";
    }

    public static class CustomerBuilder {
        private Integer id;
        private String customerName;

        CustomerBuilder() {
        }

        public CustomerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Customer build() {
            return new Customer(id, customerName);
        }

        public String toString() {
            return "Customer.CustomerBuilder(id=" + this.id + ", customerName=" + this.customerName + ")";
        }
    }
}
