package Game;

public class Player {

    public String name;
    public String avatarPreference;
    public Companion[] playerCompanions = new Companion[3];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarPreference() {
        return avatarPreference;
    }

    public void setAvatarPreference(String avatarPreference) {
        this.avatarPreference = avatarPreference;
    }


    public void setCompanionList(char[] companionList) {
        for (int i = 0; i < 3; i++)
            this.playerCompanions[i] = new Companion(companionList[i]);
    }
   

}
