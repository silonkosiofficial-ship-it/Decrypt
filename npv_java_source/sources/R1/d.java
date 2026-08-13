package R1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends R1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private R1.e f9401A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f9402B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f9403C;

    public d(java.lang.Object obj, R1.c cVar) {
        super(obj, cVar);
        this.f9401A = null;
        this.f9402B = Float.MAX_VALUE;
        this.f9403C = false;
    }

    private void o() {
        R1.e eVar = this.f9401A;
        if (eVar == null) {
            throw new java.lang.UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = eVar.a();
        if (dA > this.f9392g) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f9393h) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // R1.b
    public void i() {
        o();
        this.f9401A.g(d());
        super.i();
    }

    @Override // R1.b
    boolean k(long j6) {
        R1.e eVar;
        double d6;
        double d10;
        long j10;
        if (this.f9403C) {
            float f6 = this.f9402B;
            if (f6 != Float.MAX_VALUE) {
                this.f9401A.e(f6);
                this.f9402B = Float.MAX_VALUE;
            }
            this.f9387b = this.f9401A.a();
            this.f9386a = 0.0f;
            this.f9403C = false;
            return true;
        }
        if (this.f9402B != Float.MAX_VALUE) {
            this.f9401A.a();
            j10 = j6 / 2;
            R1.b.o oVarH = this.f9401A.h(this.f9387b, this.f9386a, j10);
            this.f9401A.e(this.f9402B);
            this.f9402B = Float.MAX_VALUE;
            eVar = this.f9401A;
            d6 = oVarH.f9398a;
            d10 = oVarH.f9399b;
        } else {
            eVar = this.f9401A;
            d6 = this.f9387b;
            d10 = this.f9386a;
            j10 = j6;
        }
        R1.b.o oVarH2 = eVar.h(d6, d10, j10);
        this.f9387b = oVarH2.f9398a;
        this.f9386a = oVarH2.f9399b;
        float fMax = java.lang.Math.max(this.f9387b, this.f9393h);
        this.f9387b = fMax;
        float fMin = java.lang.Math.min(fMax, this.f9392g);
        this.f9387b = fMin;
        if (!n(fMin, this.f9386a)) {
            return false;
        }
        this.f9387b = this.f9401A.a();
        this.f9386a = 0.0f;
        return true;
    }

    public void l(float f6) {
        if (e()) {
            this.f9402B = f6;
            return;
        }
        if (this.f9401A == null) {
            this.f9401A = new R1.e(f6);
        }
        this.f9401A.e(f6);
        i();
    }

    public boolean m() {
        return this.f9401A.f9405b > 0.0d;
    }

    boolean n(float f6, float f10) {
        return this.f9401A.c(f6, f10);
    }

    public R1.d p(R1.e eVar) {
        this.f9401A = eVar;
        return this;
    }

    public void q() {
        if (!m()) {
            throw new java.lang.UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9391f) {
            this.f9403C = true;
        }
    }
}
