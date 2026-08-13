package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class M implements p200u.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54692b;

    public M(float f6, float f10) {
        this.f54691a = java.lang.Math.max(1.0E-7f, java.lang.Math.abs(f10));
        this.f54692b = java.lang.Math.max(1.0E-4f, f6) * (-4.2f);
    }

    @Override // p200u.L
    public float a() {
        return this.f54691a;
    }

    @Override // p200u.L
    public float b(long j6, float f6, float f10) {
        return f10 * ((float) java.lang.Math.exp(((j6 / 1000000) / 1000.0f) * this.f54692b));
    }

    @Override // p200u.L
    public long c(float f6, float f10) {
        return ((long) ((((float) java.lang.Math.log(a() / java.lang.Math.abs(f10))) * 1000.0f) / this.f54692b)) * 1000000;
    }

    @Override // p200u.L
    public float d(float f6, float f10) {
        if (java.lang.Math.abs(f10) <= a()) {
            return f6;
        }
        double dLog = java.lang.Math.log(java.lang.Math.abs(a() / f10));
        float f11 = this.f54692b;
        return (f6 - (f10 / f11)) + ((f10 / f11) * ((float) java.lang.Math.exp((((double) f11) * ((dLog / ((double) f11)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    @Override // p200u.L
    public float e(long j6, float f6, float f10) {
        float f11 = this.f54692b;
        return (f6 - (f10 / f11)) + ((f10 / f11) * ((float) java.lang.Math.exp((f11 * (j6 / 1000000)) / 1000.0f)));
    }
}
