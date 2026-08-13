package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class X implements p219v9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.X f56979a = new p239x9.X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.m f56980b = v9.n.d.f56061a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f56981c = "kotlin.Nothing";

    private X() {
    }

    private final java.lang.Void b() {
        throw new java.lang.IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p219v9.f
    public java.lang.String a() {
        return f56981c;
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
        return this == obj;
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
    public p219v9.m j() {
        return f56980b;
    }

    @Override // p219v9.f
    public /* synthetic */ java.util.List k() {
        return p219v9.e.a(this);
    }

    @Override // p219v9.f
    public /* synthetic */ boolean m() {
        return p219v9.e.b(this);
    }

    public java.lang.String toString() {
        return "NothingSerialDescriptor";
    }
}
