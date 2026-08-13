package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements p219v9.f, p239x9.InterfaceC7310k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v9.f f57041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f57042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f57043c;

    public t0(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "original");
        this.f57041a = fVar;
        this.f57042b = fVar.a() + '?';
        this.f57043c = p239x9.AbstractC7299e0.a(fVar);
    }

    @Override // p219v9.f
    public java.lang.String a() {
        return this.f57042b;
    }

    @Override // p239x9.InterfaceC7310k
    public java.util.Set b() {
        return this.f57043c;
    }

    @Override // p219v9.f
    public boolean c() {
        return true;
    }

    @Override // p219v9.f
    public int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return this.f57041a.d(str);
    }

    @Override // p219v9.f
    public int e() {
        return this.f57041a.e();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p239x9.t0) && p247y7.AbstractC7350t.b(this.f57041a, ((p239x9.t0) obj).f57041a);
    }

    @Override // p219v9.f
    public java.lang.String f(int i6) {
        return this.f57041a.f(i6);
    }

    @Override // p219v9.f
    public java.util.List g(int i6) {
        return this.f57041a.g(i6);
    }

    @Override // p219v9.f
    public p219v9.f h(int i6) {
        return this.f57041a.h(i6);
    }

    public int hashCode() {
        return this.f57041a.hashCode() * 31;
    }

    @Override // p219v9.f
    public boolean i(int i6) {
        return this.f57041a.i(i6);
    }

    @Override // p219v9.f
    public p219v9.m j() {
        return this.f57041a.j();
    }

    @Override // p219v9.f
    public java.util.List k() {
        return this.f57041a.k();
    }

    public final p219v9.f l() {
        return this.f57041a;
    }

    @Override // p219v9.f
    public boolean m() {
        return this.f57041a.m();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f57041a);
        sb.append('?');
        return sb.toString();
    }
}
