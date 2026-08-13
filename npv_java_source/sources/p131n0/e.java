package p131n0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f51308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f51309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f51310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f51311d;

    public e(float f6, float f10, float f11, float f12) {
        this.f51308a = f6;
        this.f51309b = f10;
        this.f51310c = f11;
        this.f51311d = f12;
    }

    public final float a() {
        return this.f51311d;
    }

    public final float b() {
        return this.f51308a;
    }

    public final float c() {
        return this.f51310c;
    }

    public final float d() {
        return this.f51309b;
    }

    public final void e(float f6, float f10, float f11, float f12) {
        this.f51308a = java.lang.Math.max(f6, this.f51308a);
        this.f51309b = java.lang.Math.max(f10, this.f51309b);
        this.f51310c = java.lang.Math.min(f11, this.f51310c);
        this.f51311d = java.lang.Math.min(f12, this.f51311d);
    }

    public final boolean f() {
        return this.f51308a >= this.f51310c || this.f51309b >= this.f51311d;
    }

    public final void g(float f6, float f10, float f11, float f12) {
        this.f51308a = f6;
        this.f51309b = f10;
        this.f51310c = f11;
        this.f51311d = f12;
    }

    public final void h(float f6) {
        this.f51311d = f6;
    }

    public final void i(float f6) {
        this.f51308a = f6;
    }

    public final void j(float f6) {
        this.f51310c = f6;
    }

    public final void k(float f6) {
        this.f51309b = f6;
    }

    public java.lang.String toString() {
        return "MutableRect(" + p131n0.c.a(this.f51308a, 1) + ", " + p131n0.c.a(this.f51309b, 1) + ", " + p131n0.c.a(this.f51310c, 1) + ", " + p131n0.c.a(this.f51311d, 1) + ')';
    }
}
