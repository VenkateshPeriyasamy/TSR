
package org.orgw.simples.core.util;

public class CleanseUtil {

    public static String phone(String phone) {
        if (phone == null) {
            return null;
        }
        return phone
                .replaceAll("-", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\\.", "")
                .replaceAll(" ", "");
    }

    public static String streetName(String streetName) {
        if (streetName == null) {
            return null;
        }
        return streetName.toUpperCase().trim()
                .replaceAll(" BLVD[.]?$", " BOULEVARD")
                .replaceAll(" BLVD[.]? ", " BOULEVARD ")
                .replaceAll(" ST[.]?$", " STREET")
                .replaceAll(" ST[.]? ", " STREET ")
                .replaceAll(" STR[.]?$", " STREET")
                .replaceAll(" DR[.]?$", " DRIVE")
                .replaceAll(" DR[.]? ", " DRIVE ")
                .replaceAll(" RD[.]?$", " ROAD")
                .replaceAll(" RD[.]? ", " ROAD ")
                .replaceAll(" AVE[.]?$", " AVENUE")
                .replaceAll(" AVE[.]? ", " AVENUE ")
                .replaceAll(" PKWY[.]?$", " PARKWAY")
                .replaceAll(" PKWY[.]? ", " PARKWAY ")
                .replaceAll(" TPKE[.]?$", " TURNPIKE")
                .replaceAll(" HWY[.]?$", " HIGHWAY")
                .replaceAll(" HWY[.]? ", " HIGHWAY ")
                .replaceAll(" LN[.]?$", " LANE")
                .replaceAll(" CT[.]?$", " COURT")
                .replaceAll(" PLZ[.]?$", " PLAZA")
                .replaceAll(" TER[.]?$", " TERRACE")
                .replaceAll(" RUN[.]?$", " RUNS")
                .replaceAll(" PL[.]?$", " PLACE")
                .replaceAll(" CRES[.]?$", " CRESCENT")
                .replaceAll(" TRL[.]?$", " TRAIL")
                .replaceAll(" FWY[.]?$", " FREEWAY")
                .replaceAll(" CSWY[.]?$", " CAUSEWAY")
                .replaceAll(" BLTWAY[.]?$", " BELTWAY")
                .replaceAll(" XING[.]?$", " CROSSING")
                .replaceAll(" ALY[.]?$", " ALLEY")
                .replaceAll(" PT[.]?$", " POINT")
                .replaceAll(" SQ[.]?$", " SQUARE")
                .replaceAll(" LNDG[.]?$", " LANDING")
                .replaceAll(" DRWY[.]?$", " DRIVEWAY")
                .replaceAll(" CIR[.]?$", " CIRCLE")
                .replaceAll(" BYP[.]?$", " BYPASS")
                .replaceAll("^N[.]? ", "NORTH ")
                .replaceAll("^S[.]? ", "SOUTH ")
                .replaceAll("^E[.]? ", "EAST ")
                .replaceAll("^W[.]? ", "WEST ")
                .replaceAll("^SE[.]? ", "SOUTHEAST ")
                .replaceAll("^SW[.]? ", "SOUTHWEST ")
                .replaceAll("^NE[.]? ", "NORTHEAST ")
                .replaceAll("^NW[.]? ", "NORTHWEST ")
                .replaceAll(" N[.]?$", " NORTH")
                .replaceAll(" S[.]?$", " SOUTH")
                .replaceAll(" E[.]?$", " EAST")
                .replaceAll(" W[.]?$", " WEST")
                .replaceAll(" SE[.]?$", " SOUTHEAST")
                .replaceAll(" SW[.]?$", " SOUTHWEST")
                .replaceAll(" NE[.]?$", " NORTHEAST")
                .replaceAll(" NW[.]?$", " NORTHWEST");
    }

    public static String city(String city) {
        if (city == null) {
            return null;
        }
        return city.trim()
                .replaceAll(",$", "")
                .replaceAll("(?i)^N[.]? ", "North ")
                .replaceAll("(?i)^S[.]? ", "South ")
                .replaceAll("(?i)^E[.]? ", "East ")
                .replaceAll("(?i)^W[.]? ", "West ")
                .replaceAll("(?i)^CLG[.]? ", "College ")
                .replaceAll("(?i)^CMP[.]? ", "Camp ")
                .replaceAll("(?i)^CTR[.]? ", "Center ")
                .replaceAll("(?i)^FT[.]? ", "Fort ")
                .replaceAll("(?i)^GTR[.]? ", "Greater ")
                .replaceAll("(?i)^LK[.]? ", "Lake ")
                .replaceAll("(?i)^LTL[.]? ", " Little  ")
                .replaceAll("(?i)^LWR[.]? ", "Lower ")
                .replaceAll("(?i)^MT[.]? ", "Mount ")
                .replaceAll("(?i)^PCH[.]? ", "Peach ")
                .replaceAll("(?i)^PLS[.]? ", "Palos ")
                .replaceAll("(?i)^PRT[.]? ", "Port ")
                .replaceAll("(?i)^PRT[.]? ", " Port ")
                .replaceAll("(?i)^PT[.]? ", "Point ")
                .replaceAll("(?i)^ST[.]? ", "Saint ")
                .replaceAll("(?i) AIRPT[.]?$", " Airport")
                .replaceAll("(?i) ARSNL[.]?$", " Arsenal")
                .replaceAll("(?i) BCH[.]?$", " Beach")
                .replaceAll("(?i) BRG[.]?$", " Bridge")
                .replaceAll("(?i) BRKS[.]?$", " Barracks")
                .replaceAll("(?i) BRNCH[.]?$", " Branch")
                .replaceAll("(?i) CLAIR[.]?$", " Claire")
                .replaceAll("(?i) COLL[.]?$", " College")
                .replaceAll("(?i) CRK[.]?$", " Creek")
                .replaceAll("(?i) CRSNG[.]?$", " Crossing")
                .replaceAll("(?i) CTY[.]?$", " City")
                .replaceAll("(?i) CY[.]?$", " City")
                .replaceAll("(?i) CYN[.]?$", " Canyon")
                .replaceAll("(?i) DEP[.]?$", " Depot")
                .replaceAll("(?i) EST[.]?$", " Estates")
                .replaceAll("(?i) FLS[.]?$", " Falls")
                .replaceAll("(?i) FLT[.]?$", " Flintridge")
                .replaceAll("(?i) FRNC[.]?$", " Furnace")
                .replaceAll("(?i) FRY[.]?$", " Ferry")
                .replaceAll("(?i) GDNS[.]?$", " Gardens")
                .replaceAll("(?i) GRV[.]?$", " Grove")
                .replaceAll("(?i) HGTS[.]?$", " Heights")
                .replaceAll("(?i) HL[.]?$", " Hill")
                .replaceAll("(?i) HLDS[.]?$", " Highlands")
                .replaceAll("(?i) HLS[.]?$", " Hills")
                .replaceAll("(?i) HTS[.]?$", " Heights")
                .replaceAll("(?i) INST[.]?$", " Institute")
                .replaceAll("(?i) IS[.]?$", " Island")
                .replaceAll("(?i) ISLND[.]?$", " Island")
                .replaceAll("(?i) JCT[.]?$", " Junction")
                .replaceAll("(?i) LAGN[.]?$", " Lagoon")
                .replaceAll("(?i) LGT[.]?$", " Light")
                .replaceAll("(?i) LK[.]?$", " Lake")
                .replaceAll("(?i) LNDG[.]?$", " Landing")
                .replaceAll("(?i) LXNGTN[.]?$", " Lexington")
                .replaceAll("(?i) MDWS[.]?$", " Meadows")
                .replaceAll("(?i) ML[.]?$", " Mills")
                .replaceAll("(?i) MSN[.]?$", " Mission")
                .replaceAll("(?i) MTN[.]?$", " Mountain")
                .replaceAll("(?i) OKS[.]?$", " Oaks")
                .replaceAll("(?i) PK[.]?$", " Park")
                .replaceAll("(?i) PLSDS[.]?$", " Palisades")
                .replaceAll("(?i) PNSL[.]?$", " Peninsula")
                .replaceAll("(?i) RDG[.]?$", " Ridge")
                .replaceAll("(?i) RIV[.]?$", " River")
                .replaceAll("(?i) RNCH[.]?$", " Ranch")
                .replaceAll("(?i) SHANN[.]?$", " Shannon")
                .replaceAll("(?i) SM[.]?$", " Summit")
                .replaceAll("(?i) SMT[.]?$", " Summit")
                .replaceAll("(?i) SPRGS[.]?$", " Springs")
                .replaceAll("(?i) SQ[.]?$", " Square")
                .replaceAll("(?i) STA[.]?$", " Station")
                .replaceAll("(?i) TANN[.]?$", " Tannery")
                .replaceAll("(?i) TER[.]?$", " Terrace")
                .replaceAll("(?i) UNIV[.]?$", " University")
                .replaceAll("(?i) VENT[.]?$", " Ventura")
                .replaceAll("(?i) VLG[.]?$", " Village")
                .replaceAll("(?i) VLY[.]?$", " Valley")
                .replaceAll("(?i) VY[.]?$", " Valley")
                .replaceAll("(?i) X RD[.]?$", " Cross Roads")
                .replaceAll("(?i) X RDS[.]?$", " Cross Roads")
                .replaceAll("(?i) CLG[.]?$", " College")
                .replaceAll("(?i) CTR[.]?$", " Center")
                .replaceAll("(?i) LK[.]?$", " Lake")
                .replaceAll("(?i) LWR[.]?$", " Lower")
                .replaceAll("(?i) PCH[.]?$", " Peach")
                .replaceAll("(?i) PRT[.]?$", "  Port")
                .replaceAll("[.]$", "");
    }

    public static String cleanseStoreName(String storeName) {
        if (storeName == null) {
            return "";
        }

        return storeName
                .replaceAll("-", "")
                .replaceAll("\\.", "")
                .replaceAll("'", "")
                .replaceAll("&", "and")
                .replaceAll(" ", "");
    }
}
