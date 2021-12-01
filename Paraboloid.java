package se.ifmo.lab4;

public class Paraboloid extends Amusement{
    public Paraboloid(String name){
        super(name);
        joinStory();
    }
    @Override
    public void annotation(){
        System.out.println(getName()+" устроен так же как и водяное колесо");
    }
    @Override
    protected void workPlace(){
        System.out.println(getName()+" Установлен на побережье залива в Лос-Паганос");
    }
    @Override
    protected void workPrinciple(){
        class WorkPrincip{
            public void centrifugalForce(){
                System.out.println("Появляется центробежная сила");
            }
            public void centrifugalForcePrinciple(){
                System.out.println("Центробежная сила отбрасывает коротышек от центра");
            }

            public void device(){
                System.out.println(getName()+" -это огромное блюдце с поднятыми кверху краями ");
            }

        }
        WorkPrincip workPrincip=new WorkPrincip();
        workPrincip.device();
        workPrincip.centrifugalForce();
        workPrincip.centrifugalForcePrinciple();
    }
}
