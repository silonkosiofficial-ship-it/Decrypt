package p200u;

/* JADX INFO: renamed from: u.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7176j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54943a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f54946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f54947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f54948f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f54944b = java.lang.Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54949g = 1.0f;

    public C7176j0(float f6) {
        this.f54943a = f6;
    }

    private final void c() {
        if (this.f54945c) {
            return;
        }
        if (this.f54943a == p200u.AbstractC7178k0.b()) {
            throw new java.lang.IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f6 = this.f54949g;
        double d6 = ((double) f6) * ((double) f6);
        if (f6 > 1.0f) {
            double d10 = this.f54944b;
            double d11 = d6 - ((double) 1);
            this.f54946d = (((double) (-f6)) * d10) + (d10 * java.lang.Math.sqrt(d11));
            double d12 = -this.f54949g;
            double d13 = this.f54944b;
            this.f54947e = (d12 * d13) - (d13 * java.lang.Math.sqrt(d11));
        } else if (f6 >= 0.0f && f6 < 1.0f) {
            this.f54948f = this.f54944b * java.lang.Math.sqrt(((double) 1) - d6);
        }
        this.f54945c = true;
    }

    public final float a() {
        return this.f54949g;
    }

    public final float b() {
        double d6 = this.f54944b;
        return (float) (d6 * d6);
    }

    public final void d(float f6) {
        if (f6 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f54949g = f6;
        this.f54945c = false;
    }

    public final void e(float f6) {
        this.f54943a = f6;
    }

    public final void f(float f6) {
        if (b() <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f54944b = java.lang.Math.sqrt(f6);
        this.f54945c = false;
    }

    public final long g(float f6, float f10, long j6) {
        double dCos;
        double dExp;
        c();
        float f11 = f6 - this.f54943a;
        double d6 = j6 / 1000.0d;
        float f12 = this.f54949g;
        if (f12 > 1.0f) {
            double d10 = f11;
            double d11 = this.f54947e;
            double d12 = f10;
            double d13 = this.f54946d;
            double d14 = d10 - (((d11 * d10) - d12) / (d11 - d13));
            double d15 = ((d10 * d11) - d12) / (d11 - d13);
            dExp = (java.lang.Math.exp(d11 * d6) * d14) + (java.lang.Math.exp(this.f54946d * d6) * d15);
            double d16 = this.f54947e;
            double dExp2 = d14 * d16 * java.lang.Math.exp(d16 * d6);
            double d17 = this.f54946d;
            dCos = dExp2 + (d15 * d17 * java.lang.Math.exp(d17 * d6));
        } else if (f12 == 1.0f) {
            double d18 = this.f54944b;
            double d19 = f11;
            double d20 = ((double) f10) + (d18 * d19);
            double d21 = d19 + (d20 * d6);
            double dExp3 = java.lang.Math.exp((-d18) * d6) * d21;
            double dExp4 = d21 * java.lang.Math.exp((-this.f54944b) * d6);
            double d22 = this.f54944b;
            dCos = (dExp4 * (-d22)) + (d20 * java.lang.Math.exp((-d22) * d6));
            dExp = dExp3;
        } else {
            double d23 = ((double) 1) / this.f54948f;
            double d24 = this.f54944b;
            double d25 = f11;
            double d26 = d23 * ((((double) f12) * d24 * d25) + ((double) f10));
            double dExp5 = java.lang.Math.exp(((double) (-f12)) * d24 * d6) * ((java.lang.Math.cos(this.f54948f * d6) * d25) + (java.lang.Math.sin(this.f54948f * d6) * d26));
            double d27 = this.f54944b;
            float f13 = this.f54949g;
            double d28 = (-d27) * dExp5 * ((double) f13);
            double dExp6 = java.lang.Math.exp(((double) (-f13)) * d27 * d6);
            double d29 = this.f54948f;
            double dSin = (-d29) * d25 * java.lang.Math.sin(d29 * d6);
            double d30 = this.f54948f;
            dCos = d28 + (dExp6 * (dSin + (d26 * d30 * java.lang.Math.cos(d30 * d6))));
            dExp = dExp5;
        }
        return p200u.AbstractC7178k0.a((float) (dExp + ((double) this.f54943a)), (float) dCos);
    }
}
