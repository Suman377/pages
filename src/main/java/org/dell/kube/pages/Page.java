package org.dell.kube.pages;

public class Page {
    public Long id;
    public String businessName;
    public Long categoryId;
    public String address;
    public String contactNumber;

    public Page(Long id, String businessName, String address,Long categoryId,  String contactNumber) {
        this.id = id;
        this.businessName = businessName;
        this.categoryId = categoryId;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public Page(String businessName, String address, Long categoryId, String contactNumber) {
        this.businessName = businessName;
        this.categoryId = categoryId;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public Page() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", businessName='" + businessName + '\'' +
                ", categoryId=" + categoryId +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Page)) return false;

        Page page = (Page) o;

        if (getId() != null ? !getId().equals(page.getId()) : page.getId() != null) return false;
        if (getBusinessName() != null ? !getBusinessName().equals(page.getBusinessName()) : page.getBusinessName() != null)
            return false;
        if (getCategoryId() != null ? !getCategoryId().equals(page.getCategoryId()) : page.getCategoryId() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(page.getAddress()) : page.getAddress() != null) return false;
        return getContactNumber() != null ? getContactNumber().equals(page.getContactNumber()) : page.getContactNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getBusinessName() != null ? getBusinessName().hashCode() : 0);
        result = 31 * result + (getCategoryId() != null ? getCategoryId().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getContactNumber() != null ? getContactNumber().hashCode() : 0);
        return result;
    }
}
