import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String cpf;
    private final LocalDate birthDate;
    private final String address;

    public Customer(String name, String address, String birthDate, String cpf) {
        this.name = name;
        this.address = address;
        this.birthDate = LocalDate.parse(birthDate);
        this.cpf = cpf;
    }


    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }
}
