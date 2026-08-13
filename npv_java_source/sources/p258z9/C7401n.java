package p258z9;

/* JADX INFO: renamed from: z9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C7401n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p258z9.A f57775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57776b;

    public C7401n(p258z9.A a6) {
        p247y7.AbstractC7350t.f(a6, "writer");
        this.f57775a = a6;
        this.f57776b = true;
    }

    public final boolean a() {
        return this.f57776b;
    }

    public void b() {
        this.f57776b = true;
    }

    public void c() {
        this.f57776b = false;
    }

    public void d() {
        this.f57776b = false;
    }

    public void e(byte b6) {
        this.f57775a.c(b6);
    }

    public final void f(char c6) {
        this.f57775a.a(c6);
    }

    public void g(double d6) {
        this.f57775a.d(java.lang.String.valueOf(d6));
    }

    public void h(float f6) {
        this.f57775a.d(java.lang.String.valueOf(f6));
    }

    public void i(int i6) {
        this.f57775a.c(i6);
    }

    public void j(long j6) {
        this.f57775a.c(j6);
    }

    public final void k(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "v");
        this.f57775a.d(str);
    }

    public void l(short s6) {
        this.f57775a.c(s6);
    }

    public void m(boolean z6) {
        this.f57775a.d(java.lang.String.valueOf(z6));
    }

    public void n(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f57775a.b(str);
    }

    protected final void o(boolean z6) {
        this.f57776b = z6;
    }

    public void p() {
    }

    public void q() {
    }
}
