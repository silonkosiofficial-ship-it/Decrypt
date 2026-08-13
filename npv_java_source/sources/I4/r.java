package I4;

/* JADX INFO: loaded from: classes3.dex */
final class r extends I4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f5048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Long f5049b;

    /* synthetic */ r(java.lang.String str, java.lang.Long l6, android.net.Network network, I4.q qVar) {
        this.f5048a = str;
        this.f5049b = l6;
    }

    @Override // I4.d
    public final android.net.Network a() {
        return null;
    }

    @Override // I4.d
    public final java.lang.Long c() {
        return this.f5049b;
    }

    @Override // I4.d
    public final java.lang.String d() {
        return this.f5048a;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Long l6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof I4.d) {
            I4.d dVar = (I4.d) obj;
            if (this.f5048a.equals(dVar.d()) && ((l6 = this.f5049b) != null ? l6.equals(dVar.c()) : dVar.c() == null)) {
                dVar.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f5048a.hashCode() ^ 1000003;
        java.lang.Long l6 = this.f5049b;
        return ((iHashCode * 1000003) ^ (l6 == null ? 0 : l6.hashCode())) * 1000003;
    }

    public final java.lang.String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f5048a + ", cloudProjectNumber=" + this.f5049b + ", network=null}";
    }
}
