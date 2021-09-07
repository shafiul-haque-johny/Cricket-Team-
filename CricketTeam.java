//Md.Shafiul Haque Johny Id:011171319 Dept:CSE Section:B.

package cricketteam;

public abstract class CricketTeam {
    
    private String captainName;
    private String cricketkeepername;
    private String teamName;
    public String getCaptainName()
    {
        return captainName;
    }
    public String getTeamName()
    {
        return teamName;
    }
    public abstract String  giveODIRanking();
    public abstract String giveJerseyColor();

}
class Bangladesh extends CricketTeam {
    
    @Override
    public String giveODIRanking()
    {
        String r = "7";
        System.out.println(r);
        return r;
    }
    @Override
    public String giveJerseyColor()
    {
        String js = "Green";
        System.out.println(js);
        return js;
    }
}
class India extends CricketTeam{
    
    @Override
    public String giveODIRanking()
    {
        String r = "1";
        System.out.println(r);
        return r;
        
    }
    @Override
    public String giveJerseyColor()
    {
        String js = "Blue";
        System.out.println(js);
        return js;
    }
    
}
class Australia extends CricketTeam{
    
    @Override
    public String giveODIRanking()
    {
        String r = "4";
        System.out.println(r);
        return r;
    }
    @Override
    public String giveJerseyColor()
    {
        String js = "Yellow";
        System.out.println(js);
        return js;
    }
    
}
class Mymain{
    public static void main(String[] args) {
        
      
        Bangladesh myteam = new Bangladesh();
        India myteam1 = new India();
        Australia myteam2 = new Australia();
        myteam.getCaptainName();
        myteam.getTeamName();
        myteam1.getCaptainName();
        myteam1.getTeamName();
        myteam2.getCaptainName();
        myteam2.getTeamName();
        String a1 = myteam.giveODIRanking();
        String a2 = myteam.giveJerseyColor();
        String a3 = myteam1.giveODIRanking();
        String a4 = myteam1.giveJerseyColor();
        String a5 = myteam2.giveODIRanking();
        String a6 = myteam2.giveJerseyColor();
       
        
    }
    
}
