package O7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8180b;

    protected n0(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f8179a = str;
        this.f8180b = z6;
    }

    public java.lang.Integer a(O7.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "visibility");
        return O7.m0.f8167a.a(this, n0Var);
    }

    public java.lang.String b() {
        return this.f8179a;
    }

    public final boolean c() {
        return this.f8180b;
    }

    public O7.n0 d() {
        return this;
    }

    public final java.lang.String toString() {
        return b();
    }
}
