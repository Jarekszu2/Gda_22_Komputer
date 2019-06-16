package packKomputer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data

public class SklepKomputerowy {
    private List<Komputer> list = new ArrayList<Komputer>();

    public SklepKomputerowy(List<Komputer> list) {
        this.list = list;
    }

    public void wypiszWszystkieKomputery() {
//        list.forEach(komputer -> System.out.println(komputer));
        list.forEach(System.out::println);
    }

    public void wypiszKomputeryOMocyWyzszejNiz(int moc) {
        List<Komputer> komputersOMocyWiekszejOd = list.stream().filter(komputer -> komputer.getPobieranaMoc() > moc).collect(Collectors.toList());
        komputersOMocyWiekszejOd.forEach(komputer -> System.out.println(komputer));
    }
}
