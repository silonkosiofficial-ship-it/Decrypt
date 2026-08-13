package p239x9;

/* JADX INFO: renamed from: x9.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7323q0 implements p219v9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f57031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v9.d f57032b;

    public C7323q0(java.lang.String str, p219v9.d dVar) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(dVar, "kind");
        this.f57031a = str;
        this.f57032b = dVar;
    }

    private final java.lang.Void b() {
        throw new java.lang.IllegalStateException("Primitive descriptor " + a() + " does not have elements");
    }

    @Override // p219v9.f
    public java.lang.String a() {
        return this.f57031a;
    }

    @Override // p219v9.f
    public /* synthetic */ boolean c() {
        return p219v9.e.c(this);
    }

    @Override // p219v9.f
    public int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        b();
        throw new p087i7.C6665k();
    }

    @Override // p219v9.f
    public int e() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p239x9.C7323q0)) {
            return false;
        }
        p239x9.C7323q0 c7323q0 = (p239x9.C7323q0) obj;
        return p247y7.AbstractC7350t.b(a(), c7323q0.a()) && p247y7.AbstractC7350t.b(j(), c7323q0.j());
    }

    @Override // p219v9.f
    public java.lang.String f(int i6) {
        b();
        throw new p087i7.C6665k();
    }

    @Override // p219v9.f
    public java.util.List g(int i6) {
        b();
        throw new p087i7.C6665k();
    }

    @Override // p219v9.f
    public p219v9.f h(int i6) {
        b();
        throw new p087i7.C6665k();
    }

    public int hashCode() {
        return a().hashCode() + (j().hashCode() * 31);
    }

    @Override // p219v9.f
    public boolean i(int i6) {
        b();
        throw new p087i7.C6665k();
    }

    @Override // p219v9.f
    public /* synthetic */ java.util.List k() {
        return p219v9.e.a(this);
    }

    @Override // p219v9.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p219v9.d j() {
        return this.f57032b;
    }

    @Override // p219v9.f
    public /* synthetic */ boolean m() {
        return p219v9.e.b(this);
    }

    public java.lang.String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
