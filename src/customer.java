import java.time.LocalDate;

public class customer {
    private  String name;
    private  String cpf;
    private  LocalDate birthDate;
    private  String address;

    public customer(String name, String address, String birthDate, String cpf) {
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
