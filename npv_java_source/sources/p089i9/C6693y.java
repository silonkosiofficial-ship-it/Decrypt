package p089i9;

/* JADX INFO: renamed from: i9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6693y implements p089i9.V, p129m9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Boolean f47588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Integer f47589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f47590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Integer f47591d;

    public C6693y(java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.f47588a = bool;
        this.f47589b = num;
        this.f47590c = num2;
        this.f47591d = num3;
    }

    public /* synthetic */ C6693y(java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : bool, (i6 & 2) != 0 ? null : num, (i6 & 4) != 0 ? null : num2, (i6 & 8) != 0 ? null : num3);
    }

    @Override // p089i9.V
    public void B(java.lang.Integer num) {
        this.f47590c = num;
    }

    @Override // p089i9.V
    public void D(java.lang.Integer num) {
        this.f47589b = num;
    }

    @Override // p089i9.V
    public void E(java.lang.Integer num) {
        this.f47591d = num;
    }

    @Override // p129m9.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p089i9.C6693y e() {
        return new p089i9.C6693y(c(), h(), u(), l());
    }

    public final void b(p079h9.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "offset");
        z(java.lang.Boolean.valueOf(rVar.a() < 0));
        int iAbs = java.lang.Math.abs(rVar.a());
        D(java.lang.Integer.valueOf(iAbs / 3600));
        B(java.lang.Integer.valueOf((iAbs / 60) % 60));
        E(java.lang.Integer.valueOf(iAbs % 60));
    }

    @Override // p089i9.V
    public java.lang.Boolean c() {
        return this.f47588a;
    }

    public final p079h9.r d() {
        int i6 = p247y7.AbstractC7350t.b(c(), java.lang.Boolean.TRUE) ? -1 : 1;
        java.lang.Integer numH = h();
        java.lang.Integer numValueOf = numH != null ? java.lang.Integer.valueOf(numH.intValue() * i6) : null;
        java.lang.Integer numU = u();
        java.lang.Integer numValueOf2 = numU != null ? java.lang.Integer.valueOf(numU.intValue() * i6) : null;
        java.lang.Integer numL = l();
        return p079h9.t.a(numValueOf, numValueOf2, numL != null ? java.lang.Integer.valueOf(numL.intValue() * i6) : null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.C6693y) {
            p089i9.C6693y c6693y = (p089i9.C6693y) obj;
            if (p247y7.AbstractC7350t.b(c(), c6693y.c()) && p247y7.AbstractC7350t.b(h(), c6693y.h()) && p247y7.AbstractC7350t.b(u(), c6693y.u()) && p247y7.AbstractC7350t.b(l(), c6693y.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // p089i9.V
    public java.lang.Integer h() {
        return this.f47589b;
    }

    public int hashCode() {
        java.lang.Boolean boolC = c();
        int iHashCode = boolC != null ? boolC.hashCode() : 0;
        java.lang.Integer numH = h();
        int iHashCode2 = iHashCode + (numH != null ? numH.hashCode() : 0);
        java.lang.Integer numU = u();
        int iHashCode3 = iHashCode2 + (numU != null ? numU.hashCode() : 0);
        java.lang.Integer numL = l();
        return iHashCode3 + (numL != null ? numL.hashCode() : 0);
    }

    @Override // p089i9.V
    public java.lang.Integer l() {
        return this.f47591d;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Boolean boolC = c();
        if (boolC != null) {
            str = boolC.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        sb.append(str);
        java.lang.Object objH = h();
        if (objH == null) {
            objH = "??";
        }
        sb.append(objH);
        sb.append(':');
        java.lang.Object objU = u();
        if (objU == null) {
            objU = "??";
        }
        sb.append(objU);
        sb.append(':');
        java.lang.Integer numL = l();
        sb.append(numL != null ? numL : "??");
        return sb.toString();
    }

    @Override // p089i9.V
    public java.lang.Integer u() {
        return this.f47590c;
    }

    @Override // p089i9.V
    public void z(java.lang.Boolean bool) {
        this.f47588a = bool;
    }
}
