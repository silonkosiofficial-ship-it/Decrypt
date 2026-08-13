package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZoneId implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map f47698a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        java.util.Map.Entry[] entryArr = {j$.com.android.tools.r8.a.h("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.h("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.h("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.h("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.h("AST", "America/Anchorage"), j$.com.android.tools.r8.a.h("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.h("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.h("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.h("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.h("CST", "America/Chicago"), j$.com.android.tools.r8.a.h("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.h("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.h("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.h("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.h("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.h("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.h("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.h("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.h("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.h("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.h("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.h("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.h("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.h("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.h("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.h("EST", "-05:00"), j$.com.android.tools.r8.a.h("MST", "-07:00"), j$.com.android.tools.r8.a.h("HST", "-10:00")};
        java.util.HashMap map = new java.util.HashMap(28);
        for (int i6 = 0; i6 < 28; i6++) {
            java.util.Map.Entry entry = entryArr[i6];
            java.lang.Object objRequireNonNull = j$.util.Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, j$.util.Objects.requireNonNull(entry.getValue())) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        f47698a = java.util.Collections.unmodifiableMap(map);
    }

    ZoneId() {
        if (getClass() != j$.time.ZoneOffset.class && getClass() != j$.time.s.class) {
            throw new java.lang.AssertionError("Invalid subclass");
        }
    }

    static j$.time.ZoneId M(java.lang.String str, boolean z6) {
        int i6;
        j$.util.Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return j$.time.ZoneOffset.R(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i6 = 3;
        } else {
            if (!str.startsWith("UT")) {
                return j$.time.s.Q(str, z6);
            }
            i6 = 2;
        }
        return O(str, i6, z6);
    }

    public static j$.time.ZoneId N(java.lang.String str, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(str, "prefix");
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new java.lang.IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.getId());
        }
        return new j$.time.s(str, j$.time.zone.ZoneRules.i(zoneOffset));
    }

    private static j$.time.ZoneId O(java.lang.String str, int i6, boolean z6) {
        java.lang.String strSubstring = str.substring(0, i6);
        if (str.length() == i6) {
            return N(strSubstring, j$.time.ZoneOffset.UTC);
        }
        if (str.charAt(i6) != '+' && str.charAt(i6) != '-') {
            return j$.time.s.Q(str, z6);
        }
        try {
            j$.time.ZoneOffset zoneOffsetR = j$.time.ZoneOffset.R(str.substring(i6));
            return zoneOffsetR == j$.time.ZoneOffset.UTC ? N(strSubstring, zoneOffsetR) : N(strSubstring, zoneOffsetR);
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e6);
        }
    }

    public static java.util.Set<java.lang.String> getAvailableZoneIds() {
        return new java.util.HashSet(j$.time.zone.i.a());
    }

    public static j$.time.ZoneId of(java.lang.String str) {
        return M(str, true);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.ZoneId systemDefault() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        j$.util.Objects.requireNonNull(id, "zoneId");
        java.util.Map map = f47698a;
        j$.util.Objects.requireNonNull(map, "aliasMap");
        java.lang.Object objRequireNonNull = (java.lang.String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = j$.util.Objects.requireNonNull(id, "defaultObj");
        }
        return of((java.lang.String) objRequireNonNull);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 7, this);
    }

    abstract void P(java.io.DataOutput dataOutput);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.ZoneId) {
            return getId().equals(((j$.time.ZoneId) obj).getId());
        }
        return false;
    }

    public abstract java.lang.String getId();

    public abstract j$.time.zone.ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public j$.time.ZoneId normalized() {
        try {
            j$.time.zone.ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.d(j$.time.Instant.EPOCH);
            }
        } catch (j$.time.zone.f unused) {
        }
        return this;
    }

    public java.lang.String toString() {
        return getId();
    }
}
