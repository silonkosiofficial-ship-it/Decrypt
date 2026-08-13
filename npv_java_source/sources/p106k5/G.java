package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f49568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49569b;

    public G(java.lang.String str, java.lang.String str2) {
        this.f49568a = str;
        this.f49569b = str2;
    }

    public final java.lang.String a() {
        return this.f49569b;
    }

    public final java.lang.String b() {
        return this.f49568a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p106k5.G)) {
            return false;
        }
        p106k5.G g6 = (p106k5.G) obj;
        return p247y7.AbstractC7350t.b(this.f49568a, g6.f49568a) && p247y7.AbstractC7350t.b(this.f49569b, g6.f49569b);
    }

    public int hashCode() {
        java.lang.String str = this.f49568a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f49569b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FirebaseInstallationId(fid=" + this.f49568a + ", authToken=" + this.f49569b + ')';
    }
}
