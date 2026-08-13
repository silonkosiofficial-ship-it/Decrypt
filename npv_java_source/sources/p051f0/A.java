package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44775a = p051f0.p.H().f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p051f0.A f44776b;

    public abstract void c(p051f0.A a6);

    public abstract p051f0.A d();

    public final p051f0.A e() {
        return this.f44776b;
    }

    public final int f() {
        return this.f44775a;
    }

    public final void g(p051f0.A a6) {
        this.f44776b = a6;
    }

    public final void h(int i6) {
        this.f44775a = i6;
    }
}
