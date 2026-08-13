package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f54774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p170r.C f54776c;

    private X() {
        this.f54774a = 300;
        this.f54776c = p170r.AbstractC7040o.b();
    }

    public /* synthetic */ X(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public final int a() {
        return this.f54775b;
    }

    public final int b() {
        return this.f54774a;
    }

    public final p170r.C c() {
        return this.f54776c;
    }

    public final void d(int i6) {
        this.f54774a = i6;
    }

    public final p200u.V e(p200u.V v6, p200u.F f6) {
        v6.c(f6);
        return v6;
    }
}
