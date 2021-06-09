package ru.job4j.stream;

import ru.job4j.inheritance.Builder;

public class CompanyStructure {
    private String nameCompany;
    private String address;
    private int index;
    private int inn;
    private String taxation;
    private String field;
    private int countEmployees;
    private boolean agent;

    CompanyStructure buildNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
        return this;
    }

    CompanyStructure buildAddress(String address) {
        this.address = address;
        return this;
    }

    CompanyStructure buildIndex(int index) {
        this.index = index;
        return this;
    }

    CompanyStructure buildInn(int inn) {
        this.inn = inn;
        return this;
    }

    CompanyStructure buildTaxation(String taxation) {
        this.taxation = taxation;
        return this;
    }

    CompanyStructure buildField(String field) {
        this.field = field;
        return this;
    }

    CompanyStructure buildCountEmployees(int countEmployees) {
        this.countEmployees = countEmployees;
        return this;
    }

    CompanyStructure buildAgent(boolean agent) {
        this.agent = agent;
        return this;
    }

    CompanyStructure build() {
        CompanyStructure companyStructure = new CompanyStructure();
        companyStructure.nameCompany = nameCompany;
        companyStructure.address = address;
        companyStructure.index = index;
        companyStructure.inn = inn;
        companyStructure.taxation = taxation;
        companyStructure.field = field;
        companyStructure.countEmployees = countEmployees;
        companyStructure.agent = agent;
        return companyStructure;
    }

    @Override
    public String toString() {
        return "CompanyStructure{"
                + "nameCompany='" + nameCompany + '\''
                + ", address='" + address + '\''
                + ", index=" + index
                + ", inn=" + inn
                + ", taxation='" + taxation + '\''
                + ", field='" + field + '\''
                + ", countEmployees=" + countEmployees
                + ", agent=" + agent
                + '}';
    }

    public static void main(String[] args) {
        CompanyStructure companyStructure = new CompanyStructure()
                .buildNameCompany("CSI")
                .buildAddress("Saint-Petersburg, Chkalov p. b. 50 lit. A")
                .buildIndex(192568)
                .buildInn(123456789)
                .buildTaxation("main")
                .buildField("IT")
                .buildCountEmployees(750)
                .buildAgent(true)
                .build();

        System.out.println(companyStructure);
    }
}

