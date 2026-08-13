package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f54770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p200u.F f54771b;

    private V(java.lang.Object obj, p200u.F f6) {
        this.f54770a = obj;
        this.f54771b = f6;
    }

    public /* synthetic */ V(java.lang.Object obj, p200u.F f6, p247y7.AbstractC7342k abstractC7342k) {
        this(obj, f6);
    }

    public final p200u.F a() {
        return this.f54771b;
    }

    public final java.lang.Object b() {
        return this.f54770a;
    }

    public final void c(p200u.F f6) {
        this.f54771b = f6;
    }
}
