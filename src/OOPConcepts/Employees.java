package OOPConcepts;

public interface Employees {
  String getNames();
}

class SoftwareEngineer implements Employees{

    @Override
    public String getNames() {
        return "Sofwatre Engineer";
    }
}


