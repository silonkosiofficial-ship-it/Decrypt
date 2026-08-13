package L8;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.f0 f6446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F8.E f6447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F8.E f6448c;

    public c(O7.f0 f0Var, F8.E e6, F8.E e10) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        p247y7.AbstractC7350t.f(e6, "inProjection");
        p247y7.AbstractC7350t.f(e10, "outProjection");
        this.f6446a = f0Var;
        this.f6447b = e6;
        this.f6448c = e10;
    }

    public final F8.E a() {
        return this.f6447b;
    }

    public final F8.E b() {
        return this.f6448c;
    }

    public final O7.f0 c() {
        return this.f6446a;
    }

    public final boolean d() {
        return G8.e.f3134a.d(this.f6447b, this.f6448c);
    }
}
