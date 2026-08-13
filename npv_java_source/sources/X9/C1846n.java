package X9;

/* JADX INFO: renamed from: X9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1846n extends X9.a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private X9.a0 f16181f;

    public C1846n(X9.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "delegate");
        this.f16181f = a0Var;
    }

    @Override // X9.a0
    public X9.a0 a() {
        return this.f16181f.a();
    }

    @Override // X9.a0
    public X9.a0 b() {
        return this.f16181f.b();
    }

    @Override // X9.a0
    public long c() {
        return this.f16181f.c();
    }

    @Override // X9.a0
    public X9.a0 d(long j6) {
        return this.f16181f.d(j6);
    }

    @Override // X9.a0
    public boolean e() {
        return this.f16181f.e();
    }

    @Override // X9.a0
    public void f() throws java.io.InterruptedIOException {
        this.f16181f.f();
    }

    @Override // X9.a0
    public X9.a0 g(long j6, java.util.concurrent.TimeUnit timeUnit) {
        p247y7.AbstractC7350t.f(timeUnit, "unit");
        return this.f16181f.g(j6, timeUnit);
    }

    @Override // X9.a0
    public long h() {
        return this.f16181f.h();
    }

    public final X9.a0 i() {
        return this.f16181f;
    }

    public final X9.C1846n j(X9.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "delegate");
        this.f16181f = a0Var;
        return this;
    }
}
