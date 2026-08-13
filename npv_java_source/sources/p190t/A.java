package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class A implements p200u.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.p f54414a;

    public A(Y0.e eVar) {
        this.f54414a = new p190t.p(p190t.B.a(), eVar);
    }

    private final float f(float f6) {
        return this.f54414a.b(f6) * java.lang.Math.signum(f6);
    }

    @Override // p200u.L
    public float a() {
        return 0.0f;
    }

    @Override // p200u.L
    public float b(long j6, float f6, float f10) {
        return this.f54414a.d(f10).b(j6 / 1000000);
    }

    @Override // p200u.L
    public long c(float f6, float f10) {
        return this.f54414a.c(f10) * 1000000;
    }

    @Override // p200u.L
    public float d(float f6, float f10) {
        return f6 + f(f10);
    }

    @Override // p200u.L
    public float e(long j6, float f6, float f10) {
        return f6 + this.f54414a.d(f10).a(j6 / 1000000);
    }
}
