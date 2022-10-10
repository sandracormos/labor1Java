public class ScutireView
{
    public void PrintScutireDetails(String excuseeName, String excuseReason, String excuserName)
    {
        System.out.println("Excusee Name: " + excuseeName);
        System.out.println("Excuse Reason:: " + excuseReason);
        System.out.println("Excuser Name: " + excuserName);
    }

    public void PrintScutireDetails(Scutire scutire)
    {
        System.out.println("Excusee Name: " + scutire.getExcuseeName());
        System.out.println("Excuse Reason:: " + scutire.getExcuseReason());
        System.out.println("Excuser Name: " + scutire.getExcuserName());
    }
}