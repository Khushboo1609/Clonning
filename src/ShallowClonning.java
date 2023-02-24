 class Account {
    int accountid;
    String name ;

     public Account(int accountid, String name) {
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
 class Employee implements Cloneable{
    int empid;
    String name;
    Account account;

     public Employee(int empid, String name, Account account) {
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


     public Object clone() throws CloneNotSupportedException{
         Object obj=super.clone();     //only shallow clonning is possible through Object Class clone method
         return obj;
     }
 }

 class ShallowClonning {
     public static void main(String[] args) throws CloneNotSupportedException {
         Account a=new Account(111,"khushboo");
         Employee e=new Employee(11,"khushboo",a);
         System.out.println(e.account);
         System.out.println(e);
         Employee dup=(Employee)e.clone();
         System.out.println(dup.account);


     }
}
