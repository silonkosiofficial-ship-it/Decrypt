package A;

/* JADX INFO: renamed from: A.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0787v implements A.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A.S f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y0.e f160b;

    public C0787v(A.S s6, Y0.e eVar) {
        this.f159a = s6;
        this.f160b = eVar;
    }

    @Override // A.B
    public float a(Y0.v vVar) {
        Y0.e eVar = this.f160b;
        return eVar.o0(this.f159a.d(eVar, vVar));
    }

    @Override // A.B
    public float b(Y0.v vVar) {
        Y0.e eVar = this.f160b;
        return eVar.o0(this.f159a.a(eVar, vVar));
    }

    @Override // A.B
    public float c() {
        Y0.e eVar = this.f160b;
        return eVar.o0(this.f159a.b(eVar));
    }

    @Override // A.B
    public float d() {
        Y0.e eVar = this.f160b;
        return eVar.o0(this.f159a.c(eVar));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.C0787v)) {
            return false;
        }
        A.C0787v c0787v = (A.C0787v) obj;
        return p247y7.AbstractC7350t.b(this.f159a, c0787v.f159a) && p247y7.AbstractC7350t.b(this.f160b, c0787v.f160b);
    }

    public int hashCode() {
        return (this.f159a.hashCode() * 31) + this.f160b.hashCode();
    }

    public java.lang.String toString() {
        return "InsetsPaddingValues(insets=" + this.f159a + ", density=" + this.f160b + ')';
    }
}
