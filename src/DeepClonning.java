class Accounts implements Cloneable {
    int accountid;
    String name ;

    public Accounts(int accountid, String name) {
        this.accountid = accountid;
        this.name = name;
    }

    public int getAccountid() {
        return accountid;
    }

    public String getName() {
        return name;
    }
}
class Employees implements Cloneable{
    int empid;
    String name;
    Account account;

    public Employees(int empid, String name, Account account) {
        this.empid = empid;
        this.name = name;
        this.account = account;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }


    public Object clones()  throws CloneNotSupportedException{
        Account dup=new Account(account.accountid,account.name);
        Employees dupe=new Employees(empid,name,dup);
        return dupe;

    }
}

class DeepClonning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account ac=new Account(12,"khush");
        Employees emp =new Employees(22,"khush",ac);
        Employees dupo=(Employees)emp.clones();
        System.out.println(emp);
        System.out.println(dupo);
        System.out.println(emp.account);   //both container and contained object is cloned....
        System.out.println(dupo.account);

    }
}
