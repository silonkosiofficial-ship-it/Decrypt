package p126m5;

/* JADX INFO: loaded from: classes3.dex */
final class b extends p126m5.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f51133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f51134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f51135f;

    b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j6) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null rolloutId");
        }
        this.f51131b = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null parameterKey");
        }
        this.f51132c = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null parameterValue");
        }
        this.f51133d = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null variantId");
        }
        this.f51134e = str4;
        this.f51135f = j6;
    }

    @Override // p126m5.i
    public java.lang.String c() {
        return this.f51132c;
    }

    @Override // p126m5.i
    public java.lang.String d() {
        return this.f51133d;
    }

    @Override // p126m5.i
    public java.lang.String e() {
        return this.f51131b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p126m5.i)) {
            return false;
        }
        p126m5.i iVar = (p126m5.i) obj;
        return this.f51131b.equals(iVar.e()) && this.f51132c.equals(iVar.c()) && this.f51133d.equals(iVar.d()) && this.f51134e.equals(iVar.g()) && this.f51135f == iVar.f();
    }

    @Override // p126m5.i
    public long f() {
        return this.f51135f;
    }

    @Override // p126m5.i
    public java.lang.String g() {
        return this.f51134e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f51131b.hashCode() ^ 1000003) * 1000003) ^ this.f51132c.hashCode()) * 1000003) ^ this.f51133d.hashCode()) * 1000003) ^ this.f51134e.hashCode()) * 1000003;
        long j6 = this.f51135f;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public java.lang.String toString() {
        return "RolloutAssignment{rolloutId=" + this.f51131b + ", parameterKey=" + this.f51132c + ", parameterValue=" + this.f51133d + ", variantId=" + this.f51134e + ", templateVersion=" + this.f51135f + "}";
    }
}
