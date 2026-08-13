package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class C extends n5.G.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f51511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p076h5.f f51513f;

    C(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i6, p076h5.f fVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null appIdentifier");
        }
        this.f51508a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null versionCode");
        }
        this.f51509b = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null versionName");
        }
        this.f51510c = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null installUuid");
        }
        this.f51511d = str4;
        this.f51512e = i6;
        if (fVar == null) {
            throw new java.lang.NullPointerException("Null developmentPlatformProvider");
        }
        this.f51513f = fVar;
    }

    @Override // n5.G.a
    public java.lang.String a() {
        return this.f51508a;
    }

    @Override // n5.G.a
    public int c() {
        return this.f51512e;
    }

    @Override // n5.G.a
    public p076h5.f d() {
        return this.f51513f;
    }

    @Override // n5.G.a
    public java.lang.String e() {
        return this.f51511d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.G.a)) {
            return false;
        }
        n5.G.a aVar = (n5.G.a) obj;
        return this.f51508a.equals(aVar.a()) && this.f51509b.equals(aVar.f()) && this.f51510c.equals(aVar.g()) && this.f51511d.equals(aVar.e()) && this.f51512e == aVar.c() && this.f51513f.equals(aVar.d());
    }

    @Override // n5.G.a
    public java.lang.String f() {
        return this.f51509b;
    }

    @Override // n5.G.a
    public java.lang.String g() {
        return this.f51510c;
    }

    public int hashCode() {
        return ((((((((((this.f51508a.hashCode() ^ 1000003) * 1000003) ^ this.f51509b.hashCode()) * 1000003) ^ this.f51510c.hashCode()) * 1000003) ^ this.f51511d.hashCode()) * 1000003) ^ this.f51512e) * 1000003) ^ this.f51513f.hashCode();
    }

    public java.lang.String toString() {
        return "AppData{appIdentifier=" + this.f51508a + ", versionCode=" + this.f51509b + ", versionName=" + this.f51510c + ", installUuid=" + this.f51511d + ", deliveryMechanism=" + this.f51512e + ", developmentPlatformProvider=" + this.f51513f + "}";
    }
}
