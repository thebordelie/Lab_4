package se.ifmo.lab4;

public class Workers extends Shorties.ShortiesPersonality {
    private int countWorkers=12;
    private int salaryOneWorker=0;
    public Workers(String name){
        super(name);
    }
    @Override
    public void ordinary(){
        System.out.println(getName()+" рабоют");
    }
    protected void crusher(int count){
        System.out.println(count+" "+getName()+" измельчают соль в медных ступках");
    }
    protected void workPiece(int count){
        System.out.println(count+" "+getName()+" таскают кристаллы соли с берега");
    }
    protected void sale(int count){
        System.out.println(count+" "+getName()+" разносят соль по ресторанам и столовым");
    }
    protected int getSalary(){
        return salaryOneWorker;
    }
    protected int getCountWorkers(){
        return countWorkers;
    }

    protected void setCountWorkers(int value,Ponchic ponchic) throws Exceptions.NotEnoughSpaceException {
        countWorkers = value;
        System.out.println("Рабочих теперь "+countWorkers);
        if (countWorkers <= 0) {
            throw new Exceptions.NotEnoughSpaceException("Завод не может функционировать");
        }
        if (countWorkers > 100) {
            throw new Exceptions.NotEnoughSpaceException(ponchic.businessmanPonchik.getFactoryPlace() + " не может выдержать такого количество рабочих");
        }
    }
    protected void expensesWorker(){
        System.out.println("Каждый рабочий получает "+salaryOneWorker+" фертингов");
    }
    protected void expensesWorkers(Ponchic ponchic){
        System.out.println(ponchic.getName()+" тратит на зарплату рабочим: "+salaryOneWorker*countWorkers+" фертингов");
    }

    protected void setSalary(int value){
        salaryOneWorker+=value;
    }
}
