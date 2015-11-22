package daz.lmis_light;

/**
 * Created by Devesh on 22/11/15.
 */
public class Users {


    public Users() {
    }

    public String id(String name) {
        String code;
        switch (name) {
            case "John Barnes":
                code = "DXyJmlo9rge";
                break;
            case "Kevin Boateng":
                code = "OYLGMiazHtW";
                break;
            case "Suleimane Diawara":
                code = "awtnYWiVEd5";
                break;
            case "Seydou Keita":
                code = "Onf73mPD6sL";
                break;
            case "Didier Konan":
                code = "I9fMsY4pRKk";
                break;
            case "Adonkia CHP":
                code = "Rp268JB6Ne4";
                break;
            case "Afro Arab Clinic":
                code = "cDw53Ej8rju";
                break;
            case "Bailor CHP":
                code = "Eyj2kiEJ7M3";
                break;
            case "Bambuibu Tommy MCHP":
                code = "aSfF9kuNINJ";
                break;
            case "Bandajuma Clinic CHC":
                code = "FNnj3jKGS7i";
                break;
            case "Africare HQ":
                code = "vAvEltyXGbD";
                break;
            case "Bo District M&E officers":
                code = "ZoHNWQajIoe";
                break;
            case "Family Health Partner":
                code = "ZrsVF7IJ93y";
                break;
            case "HIV Program Coordinators":
                code = "Rg8wusV7QYi";
                break;
            case "World Health Program":
                code = "Iqfwd3j2qe5";
            default:
                code = "PhzytPW3g2J";
        }
        return code;
    }

}
