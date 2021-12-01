package se.ifmo.lab4;
public class Story {
    public static void main(String[] args) throws Exceptions.NotEnoughSpaceException {
        Ponchic ponchic=new Ponchic("Пончик");
        Servant servant=new Servant("Слуги");
        Workers workers=new Workers("Рабочие");
        ponchic.businessmanPonchik.workSlave();
        ponchic.businessmanPonchik.dontWorkSlave();
        ponchic.businessmanPonchik.thinking();

        try {
            ponchic.businessmanPonchik.makeFactory("старенький хлипкий сарайчик");
            ponchic.businessmanPonchik.buyStupki(6);
            ponchic.businessmanPonchik.readyWork();
            workers.crusher(6);
            workers.workPiece(3);
            workers.sale(3);
            ponchic.businessmanPonchik.dullness();
            workers.setSalary(1);
            workers.expensesWorker();
            workers.expensesWorkers(ponchic);
            ponchic.businessmanPonchik.businessmanActivity();
            ponchic.businessmanPonchik.income(workers);
            ponchic.businessmanPonchik.quickIncome();
            ponchic.businessmanPonchik.oldLive();
            ponchic.businessmanPonchik.calculation(workers);
            ponchic.businessmanPonchik.ambitions();
            try {
                workers.setCountWorkers(6,ponchic);
                ponchic.businessmanPonchik.ambitions();
                workers.setCountWorkers(2,ponchic);
            }
            catch (Exceptions.NotEnoughSpaceException e){
                System.out.println(e.getMessage());

            }
            ponchic.businessmanPonchik.newFactory();
            ponchic.businessmanPonchik.readyWork();
            ponchic.ordinary();
            ponchic.newName();
            ponchic.oldlive();
            ponchic.live();
            ponchic.hireServ();
            servant.maintenance();
            servant.cleaning();
            servant.lookAfterHouse();
            ponchic.dullness();
            ponchic.goRestaurans();
            ponchic.eat();
            ponchic.dullness();
            ponchic.happy();
            Shorties.ShortiesPersonality shortiesPersonality=new Shorties.ShortiesPersonality("Коротышки"){
                @Override
                protected void shortiesFalling() {System.out.println(getName()+" c силой вылетают с атракциона и падают в воду");}

            };
            shortiesPersonality.ordinary();
            UsialWheel wheel=new UsialWheel("Чертовое колесо","USIAL");
            wheel.annotation();
            shortiesPersonality.allwantsHappy();
            wheel.workPlace();
            wheel.fastMove();
            wheel.workPrinciple();
            wheel.workFall();
            shortiesPersonality.winner();
            WaterWheel wheel1=new WaterWheel("Чертовое колесо","WATER");
            wheel1.annotation();
            wheel1.workPlace();
            wheel1.workFall();
            shortiesPersonality.shortiesFalling();
            shortiesPersonality.kek();
            Paraboloid paraboloid=new Paraboloid("Морской параболоид");
            paraboloid.annotation();
            paraboloid.workPrinciple();
            shortiesPersonality.shortiesFalling();
            shortiesPersonality.shortiesParabola();
            paraboloid.workPlace();
            Rich rich=new Rich("Богачи");
            rich.relax();
            ponchic.relax();
        }
        catch (Exceptions.NotEnoughWorkException notEnoughWorkException){notEnoughWorkException.getMessage();}


    }
}
