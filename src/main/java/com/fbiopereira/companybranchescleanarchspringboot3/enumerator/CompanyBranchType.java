package com.fbiopereira.companybranchescleanarchspringboot3.enumerator;

public enum CompanyBranchType {
    Deposit("CD"),
    Store("LOJA"),
    Online("ONLINE");

    public final String label;

    private CompanyBranchType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

}
