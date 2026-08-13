package p106k5;

/* JADX INFO: renamed from: k5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6892c extends k5.I.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f49605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49607c;

    C6892c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null crashlyticsInstallId");
        }
        this.f49605a = str;
        this.f49606b = str2;
        this.f49607c = str3;
    }

    @Override // k5.I.a
    public java.lang.String c() {
        return this.f49605a;
    }

    @Override // k5.I.a
    public java.lang.String d() {
        return this.f49607c;
    }

    @Override // k5.I.a
    public java.lang.String e() {
        return this.f49606b;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k5.I.a)) {
            return false;
        }
        k5.I.a aVar = (k5.I.a) obj;
        if (this.f49605a.equals(aVar.c()) && ((str = this.f49606b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            java.lang.String str2 = this.f49607c;
            java.lang.String strD = aVar.d();
            if (str2 == null) {
                if (strD == null) {
                    return true;
                }
            } else if (str2.equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f49605a.hashCode() ^ 1000003) * 1000003;
        java.lang.String str = this.f49606b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.f49607c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f49605a + ", firebaseInstallationId=" + this.f49606b + ", firebaseAuthenticationToken=" + this.f49607c + "}";
    }
}
