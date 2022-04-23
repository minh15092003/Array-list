package ArrayList;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args){
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty ? :" +  topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("hello are the top" + topCompanies.size()+"companies iin the world ");
        String bestCompany = topCompanies.get(0);
        String secondBeatCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() -1);
        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company :"+secondBeatCompany);
        System.out.println("Last Company in the list :" + lastCompany);

        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list :" + topCompanies);
    }
}
