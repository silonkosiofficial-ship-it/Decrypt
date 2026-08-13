package R1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f9404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f9405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f9407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f9408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f9409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f9410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f9411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f9412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final R1.b.o f9413j;

    public e() {
        this.f9404a = java.lang.Math.sqrt(1500.0d);
        this.f9405b = 0.5d;
        this.f9406c = false;
        this.f9412i = Double.MAX_VALUE;
        this.f9413j = new R1.b.o();
    }

    public e(float f6) {
        this.f9404a = java.lang.Math.sqrt(1500.0d);
        this.f9405b = 0.5d;
        this.f9406c = false;
        this.f9412i = Double.MAX_VALUE;
        this.f9413j = new R1.b.o();
        this.f9412i = f6;
    }

    private void b() {
        if (this.f9406c) {
            return;
        }
        if (this.f9412i == Double.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d6 = this.f9405b;
        if (d6 > 1.0d) {
            double d10 = this.f9404a;
            this.f9409f = ((-d6) * d10) + (d10 * java.lang.Math.sqrt((d6 * d6) - 1.0d));
            double d11 = this.f9405b;
            double d12 = this.f9404a;
            this.f9410g = ((-d11) * d12) - (d12 * java.lang.Math.sqrt((d11 * d11) - 1.0d));
        } else if (d6 >= 0.0d && d6 < 1.0d) {
            this.f9411h = this.f9404a * java.lang.Math.sqrt(1.0d - (d6 * d6));
        }
        this.f9406c = true;
    }

    public float a() {
        return (float) this.f9412i;
    }

    public boolean c(float f6, float f10) {
        return ((double) java.lang.Math.abs(f10)) < this.f9408e && ((double) java.lang.Math.abs(f6 - a())) < this.f9407d;
    }

    public R1.e d(float f6) {
        if (f6 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f9405b = f6;
        this.f9406c = false;
        return this;
    }

    public R1.e e(float f6) {
        this.f9412i = f6;
        return this;
    }

    public R1.e f(float f6) {
        if (f6 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f9404a = java.lang.Math.sqrt(f6);
        this.f9406c = false;
        return this;
    }

    void g(double d6) {
        double dAbs = java.lang.Math.abs(d6);
        this.f9407d = dAbs;
        this.f9408e = dAbs * 62.5d;
    }

    R1.b.o h(double d6, double d10, long j6) {
        double dCos;
        double dPow;
        b();
        double d11 = j6 / 1000.0d;
        double d12 = d6 - this.f9412i;
        double d13 = this.f9405b;
        if (d13 > 1.0d) {
            double d14 = this.f9410g;
            double d15 = this.f9409f;
            double d16 = d12 - (((d14 * d12) - d10) / (d14 - d15));
            double d17 = ((d12 * d14) - d10) / (d14 - d15);
            dPow = (java.lang.Math.pow(2.718281828459045d, d14 * d11) * d16) + (java.lang.Math.pow(2.718281828459045d, this.f9409f * d11) * d17);
            double d18 = this.f9410g;
            double dPow2 = d16 * d18 * java.lang.Math.pow(2.718281828459045d, d18 * d11);
            double d19 = this.f9409f;
            dCos = dPow2 + (d17 * d19 * java.lang.Math.pow(2.718281828459045d, d19 * d11));
        } else if (d13 == 1.0d) {
            double d20 = this.f9404a;
            double d21 = d10 + (d20 * d12);
            double d22 = d12 + (d21 * d11);
            dPow = java.lang.Math.pow(2.718281828459045d, (-d20) * d11) * d22;
            double dPow3 = d22 * java.lang.Math.pow(2.718281828459045d, (-this.f9404a) * d11);
            double d23 = this.f9404a;
            dCos = (d21 * java.lang.Math.pow(2.718281828459045d, (-d23) * d11)) + (dPow3 * (-d23));
        } else {
            double d24 = 1.0d / this.f9411h;
            double d25 = this.f9404a;
            double d26 = d24 * ((d13 * d25 * d12) + d10);
            double dPow4 = java.lang.Math.pow(2.718281828459045d, (-d13) * d25 * d11) * ((java.lang.Math.cos(this.f9411h * d11) * d12) + (java.lang.Math.sin(this.f9411h * d11) * d26));
            double d27 = this.f9404a;
            double d28 = this.f9405b;
            double d29 = (-d27) * dPow4 * d28;
            double dPow5 = java.lang.Math.pow(2.718281828459045d, (-d28) * d27 * d11);
            double d30 = this.f9411h;
            double dSin = (-d30) * d12 * java.lang.Math.sin(d30 * d11);
            double d31 = this.f9411h;
            dCos = d29 + (dPow5 * (dSin + (d26 * d31 * java.lang.Math.cos(d31 * d11))));
            dPow = dPow4;
        }
        R1.b.o oVar = this.f9413j;
        oVar.f9398a = (float) (dPow + this.f9412i);
        oVar.f9399b = (float) dCos;
        return oVar;
    }
}
