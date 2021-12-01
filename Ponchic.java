package se.ifmo.lab4;

public class Ponchic extends Rich {
    protected BusinessmanPonchik businessmanPonchik=new BusinessmanPonchik();
    public Ponchic(String name) {
        super(name);
    }
    @Override
    protected void happy(){System.out.println(getName()+" вертится на чертовом колесе или морском параболоиде");}
    @Override
    protected void relax(){System.out.println(getName()+" тоже любит кататься на параболоиде больше, чем на колесе");}
    protected void oldlive(){
        System.out.println(getName()+" жил в гостинице");
    }
    protected void dullness(){
        System.out.println(getName()+" нечего не делает");
    }
    protected void goRestaurans(){
        System.out.println(getName()+" Ходит по ресторанам");
    }
    protected void eat(){
        System.out.println(getName()+" кушает самые вкусные кушанья");
    }
    @Override
    public String toString(){
        return "Пончик "+getName();
    }
    @Override
    public boolean equals(Object p){
        if (this==p)return true;
        if (p instanceof Ponchic) return getName().equals(((Ponchic) p).getName());
        return false;
    }
    @Override
    public int hashCode(){
        return getName().hashCode();
    }
    protected class BusinessmanPonchik{
        private String factoryPlace="";
        private int stupki;
        private int salary;
        protected void businessmanActivity(){
            setSalary(240+Math.round(Math.random()*10));
            System.out.println(getName()+" продаёт всю дневную добычу соли за "+ (240+Math.round(Math.random()*10)-1)+ " фертингов");
        }
        protected void workSlave(){
            System.out.println(getName()+" целыми днями торгует в ресторане солью");
        }
        protected void dontWorkSlave(){
            System.out.println(getName()+" не одобряет свою работу, больше он не торгует солью");
        }
        protected void makeFactory(String nameFactory){
            factoryPlace=nameFactory;
            if (factoryPlace=="") throw new Exceptions.NotEnoughWorkException("Пончик не смог придумать, как увеличить заработок");
            System.out.println(getName()+" нанял-"+nameFactory+" находится неподалёку от моря");

        }
        protected void buyStupki(int countStupki){
            System.out.println(getName()+" Купил "+countStupki+" ступок");
            stupki=countStupki;
        }
        protected void readyWork() {
            System.out.println("Завод готов");

        }
        protected void ambitions(){System.out.println(getName()+" Хочет увеличить количество рабочих");}
        public void newFactory(){
            System.out.println("Нехватка мест");
            System.out.println(getName()+" решил построить другое, более обширное помещение");
            setFactoryPlace("Новый завод");
        }
        protected void oldLive(){
            System.out.println("Раньше "+getName()+" сам измельчал соль и продавал в рестораны");
            System.out.println("Отныне все делают всё за "+ getName());
        }
        protected void calculation(Workers workers){
            System.out.println(getName()+" Высчитал, что каждый рабочий приносит 20 фертингов");
        }

        protected void thinking(){
            System.out.println(getName()+" размышляет о том, как увеличить заработок");
        }
        protected void setFactoryPlace(String name){
            factoryPlace=name;
        }
        protected void dullness(){System.out.println(getName()+ " ничего не делает, но зарабатывает ");}
        protected void income(Workers workers){System.out.println(getName()+" кладёт себе в карман в "+salary/(workers.getSalary()*workers.getCountWorkers())+" раз больше чем тратит");}
        protected void quickIncome(){System.out.println(getName()+" богатеет не по дням, а по часам");}
        protected int getSalary(){return salary;}
        protected void setSalary(long value){salary+=value;}

        public String getFactoryPlace() {
            return factoryPlace;
        }
    }
}
