package Z2;

/* JADX INFO: loaded from: classes.dex */
final class c extends Z2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f16678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p084i3.a f16679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p084i3.a f16680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f16681d;

    c(android.content.Context context, p084i3.a aVar, p084i3.a aVar2, java.lang.String str) {
        if (context == null) {
            throw new java.lang.NullPointerException("Null applicationContext");
        }
        this.f16678a = context;
        if (aVar == null) {
            throw new java.lang.NullPointerException("Null wallClock");
        }
        this.f16679b = aVar;
        if (aVar2 == null) {
            throw new java.lang.NullPointerException("Null monotonicClock");
        }
        this.f16680c = aVar2;
        if (str == null) {
            throw new java.lang.NullPointerException("Null backendName");
        }
        this.f16681d = str;
    }

    @Override // Z2.h
    public android.content.Context b() {
        return this.f16678a;
    }

    @Override // Z2.h
    public java.lang.String c() {
        return this.f16681d;
    }

    @Override // Z2.h
    public p084i3.a d() {
        return this.f16680c;
    }

    @Override // Z2.h
    public p084i3.a e() {
        return this.f16679b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z2.h)) {
            return false;
        }
        Z2.h hVar = (Z2.h) obj;
        return this.f16678a.equals(hVar.b()) && this.f16679b.equals(hVar.e()) && this.f16680c.equals(hVar.d()) && this.f16681d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f16678a.hashCode() ^ 1000003) * 1000003) ^ this.f16679b.hashCode()) * 1000003) ^ this.f16680c.hashCode()) * 1000003) ^ this.f16681d.hashCode();
    }

    public java.lang.String toString() {
        return "CreationContext{applicationContext=" + this.f16678a + ", wallClock=" + this.f16679b + ", monotonicClock=" + this.f16680c + ", backendName=" + this.f16681d + "}";
    }
}
