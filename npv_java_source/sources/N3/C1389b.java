package N3;

/* JADX INFO: renamed from: N3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1389b extends R3.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f7646C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f7647D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.app.PendingIntent f7648E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f7649F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final N3.C1389b f7645G = new N3.C1389b(0);
    public static final android.os.Parcelable.Creator<N3.C1389b> CREATOR = new N3.p();

    public C1389b(int i6) {
        this(i6, null, null);
    }

    C1389b(int i6, int i10, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.f7646C = i6;
        this.f7647D = i10;
        this.f7648E = pendingIntent;
        this.f7649F = str;
    }

    public C1389b(int i6, android.app.PendingIntent pendingIntent) {
        this(i6, pendingIntent, null);
    }

    public C1389b(int i6, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this(1, i6, pendingIntent, str);
    }

    static java.lang.String D(int i6) {
        if (i6 == 99) {
            return "UNFINISHED";
        }
        if (i6 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i6) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i6) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i6 + ")";
                }
        }
    }

    public boolean C() {
        return this.f7647D == 0;
    }

    public int e() {
        return this.f7647D;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N3.C1389b)) {
            return false;
        }
        N3.C1389b c1389b = (N3.C1389b) obj;
        return this.f7647D == c1389b.f7647D && Q3.AbstractC1475n.a(this.f7648E, c1389b.f7648E) && Q3.AbstractC1475n.a(this.f7649F, c1389b.f7649F);
    }

    public java.lang.String f() {
        return this.f7649F;
    }

    public int hashCode() {
        return Q3.AbstractC1475n.b(java.lang.Integer.valueOf(this.f7647D), this.f7648E, this.f7649F);
    }

    public android.app.PendingIntent s() {
        return this.f7648E;
    }

    public java.lang.String toString() {
        Q3.AbstractC1475n.a aVarC = Q3.AbstractC1475n.c(this);
        aVarC.a("statusCode", D(this.f7647D));
        aVarC.a("resolution", this.f7648E);
        aVarC.a("message", this.f7649F);
        return aVarC.toString();
    }

    public boolean w() {
        return (this.f7647D == 0 || this.f7648E == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f7646C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, e());
        R3.c.p(parcel, 3, s(), i6, false);
        R3.c.q(parcel, 4, f(), false);
        R3.c.b(parcel, iA);
    }
}
