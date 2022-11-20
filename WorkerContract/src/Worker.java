import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel Level;
    private Double baseSalary;

    private Department department;
    public List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.Level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer year,Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(HourContract c : contracts){  //para cada contrato c na lista de contratos
            cal.setTime(c.getDate());
            int cYear = cal.get(Calendar.YEAR);
            int cMonth = cal.get(Calendar.MONTH) + 1;
            if(year == cYear && month == cMonth){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return Level;
    }

    public void setLevel(WorkerLevel level) {
        Level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
}
