package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M9.g f4754a;

    public k() {
        this(5, 5L, java.util.concurrent.TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i6, long j6, java.util.concurrent.TimeUnit timeUnit) {
        this(new M9.g(L9.e.f6461i, i6, j6, timeUnit));
        p247y7.AbstractC7350t.f(timeUnit, "timeUnit");
    }

    public k(M9.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "delegate");
        this.f4754a = gVar;
    }

    public final void a() {
        this.f4754a.d();
    }

    public final M9.g b() {
        return this.f4754a;
    }
}
