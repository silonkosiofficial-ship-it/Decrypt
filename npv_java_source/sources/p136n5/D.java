package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class D extends n5.G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f51517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f51518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f51520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f51521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f51522i;

    D(int i6, java.lang.String str, int i10, long j6, long j10, boolean z6, int i11, java.lang.String str2, java.lang.String str3) {
        this.f51514a = i6;
        if (str == null) {
            throw new java.lang.NullPointerException("Null model");
        }
        this.f51515b = str;
        this.f51516c = i10;
        this.f51517d = j6;
        this.f51518e = j10;
        this.f51519f = z6;
        this.f51520g = i11;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null manufacturer");
        }
        this.f51521h = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null modelClass");
        }
        this.f51522i = str3;
    }

    @Override // n5.G.b
    public int a() {
        return this.f51514a;
    }

    @Override // n5.G.b
    public int b() {
        return this.f51516c;
    }

    @Override // n5.G.b
    public long d() {
        return this.f51518e;
    }

    @Override // n5.G.b
    public boolean e() {
        return this.f51519f;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.G.b)) {
            return false;
        }
        n5.G.b bVar = (n5.G.b) obj;
        return this.f51514a == bVar.a() && this.f51515b.equals(bVar.g()) && this.f51516c == bVar.b() && this.f51517d == bVar.j() && this.f51518e == bVar.d() && this.f51519f == bVar.e() && this.f51520g == bVar.i() && this.f51521h.equals(bVar.f()) && this.f51522i.equals(bVar.h());
    }

    @Override // n5.G.b
    public java.lang.String f() {
        return this.f51521h;
    }

    @Override // n5.G.b
    public java.lang.String g() {
        return this.f51515b;
    }

    @Override // n5.G.b
    public java.lang.String h() {
        return this.f51522i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f51514a ^ 1000003) * 1000003) ^ this.f51515b.hashCode()) * 1000003) ^ this.f51516c) * 1000003;
        long j6 = this.f51517d;
        int i6 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f51518e;
        return ((((((((i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f51519f ? 1231 : 1237)) * 1000003) ^ this.f51520g) * 1000003) ^ this.f51521h.hashCode()) * 1000003) ^ this.f51522i.hashCode();
    }

    @Override // n5.G.b
    public int i() {
        return this.f51520g;
    }

    @Override // n5.G.b
    public long j() {
        return this.f51517d;
    }

    public java.lang.String toString() {
        return "DeviceData{arch=" + this.f51514a + ", model=" + this.f51515b + ", availableProcessors=" + this.f51516c + ", totalRam=" + this.f51517d + ", diskSpace=" + this.f51518e + ", isEmulator=" + this.f51519f + ", state=" + this.f51520g + ", manufacturer=" + this.f51521h + ", modelClass=" + this.f51522i + "}";
    }
}
