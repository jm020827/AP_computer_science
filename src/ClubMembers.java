import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList = new ArrayList<>();

    public void addMembers(String[] names, int gradYear){
        for(String name : names){
            MemberInfo member = new MemberInfo(name, gradYear, true);
            memberList.add(member);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year){
        ArrayList<MemberInfo> gradMembers = new ArrayList<>();
        for(int i=0;i<memberList.size();i++) {
            if(memberList.get(i).getGradYear()<=year){
                if(memberList.get(i).inGoodStanding()){
                    MemberInfo gradMember = memberList.get(i);
                    gradMembers.add(gradMember);
                }
                memberList.remove(i);
                i--;
            }
        }
        return gradMembers;
    }


    public static void main(String[] args) {

        String[] memberStrings = {"Smith", "Jane"};
        ClubMembers members = new ClubMembers();

        members.addMembers(new String[]{"Smith", "Jane"}, 2019);
        members.addMembers(new String[]{"Fox", "Steve"}, 2018);
        members.addMembers(new String[]{"Xin", "Michael"}, 2017);
        members.addMembers(new String[]{"Garcia", "Maria"}, 2020);

        for(int i = 0 ;i<members.memberList.size();i++){
            System.out.println(members.memberList.get(i).name + " /  " + members.memberList.get(i).getGradYear());
        }

        ArrayList<MemberInfo> removed = members.removeMembers(2018);
        for(int i = 0 ;i<removed.size();i++){
            System.out.println(removed.get(i).name);
        }



    }
}
