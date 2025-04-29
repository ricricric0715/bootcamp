import java.security.PrivateKey;

public class MemberData {

   private String name;
   private String vip;
   private int mobile;

   public void setName(String name){
    this.name = name; 
   }
   public String getName(){
    return this.name;
   }

   public void setVip(String vip){
    this.vip = vip;
   }
   public String getVip(){
    return this.vip;
   }

   public void setMoblie(int mobile){
    this.mobile = mobile;
   }
   public int getMobile(){
    return this.mobile;
   }

  public static void main(String[] args) {
    

    String member1Name = "Elros";
    String member1Vip = "vip904721";
    int member1Mobile = 60111234;

    String member2Name = "Yin";
    String member2Vip = "vip904722";
    int member2Mobile = 60112345;

    String member3Name = "Elliot";
    String member3Vip = "vip904723";
    int member3Mobile = 60113456;

    MemberData m1 = new MemberData();
    MemberData m2 = new MemberData();
    MemberData m3 = new MemberData();

    m1.setName(member1Name);
    m2.setName(member2Name);
    m3.setName(member3Name);

   System.out.println(m1.getName());
   System.out.println(m2.getName());
   System.out.println(m3.getName());

   m1.setVip(member1Vip);
   m2.setVip(member2Vip);
   m3.setVip(member3Vip);

   System.out.println(m1.getVip());
   System.out.println(m2.getVip());
   System.out.println(m3.getVip());
   
   m1.setMoblie(member1Mobile);
   m2.setMoblie(member2Mobile);
   m3.setMoblie(member3Mobile);

   System.out.println(m1.getMobile());
   System.out.println(m2.getMobile());
   System.out.println(m3.getMobile());
    

  }
}

