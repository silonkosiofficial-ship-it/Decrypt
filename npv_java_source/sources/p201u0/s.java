package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p201u0.p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f55353C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f55354D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f55355E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p141o0.AbstractC6984n0 f55356F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final float f55357G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p141o0.AbstractC6984n0 f55358H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final float f55359I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final float f55360J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f55361K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final int f55362L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final float f55363M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final float f55364N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f55365O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final float f55366P;

    private s(java.lang.String str, java.util.List list, int i6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.AbstractC6984n0 abstractC6984n1, float f10, float f11, int i10, int i11, float f12, float f13, float f14, float f15) {
        super(null);
        this.f55353C = str;
        this.f55354D = list;
        this.f55355E = i6;
        this.f55356F = abstractC6984n0;
        this.f55357G = f6;
        this.f55358H = abstractC6984n1;
        this.f55359I = f10;
        this.f55360J = f11;
        this.f55361K = i10;
        this.f55362L = i11;
        this.f55363M = f12;
        this.f55364N = f13;
        this.f55365O = f14;
        this.f55366P = f15;
    }

    public /* synthetic */ s(java.lang.String str, java.util.List list, int i6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.AbstractC6984n0 abstractC6984n1, float f10, float f11, int i10, int i11, float f12, float f13, float f14, float f15, p247y7.AbstractC7342k abstractC7342k) {
        this(str, list, i6, abstractC6984n0, f6, abstractC6984n1, f10, f11, i10, i11, f12, f13, f14, f15);
    }

    public final float C() {
        return this.f55359I;
    }

    public final int D() {
        return this.f55361K;
    }

    public final int E() {
        return this.f55362L;
    }

    public final float M() {
        return this.f55363M;
    }

    public final float N() {
        return this.f55360J;
    }

    public final float O() {
        return this.f55365O;
    }

    public final float P() {
        return this.f55366P;
    }

    public final float Q() {
        return this.f55364N;
    }

    public final p141o0.AbstractC6984n0 d() {
        return this.f55356F;
    }

    public final float e() {
        return this.f55357G;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p201u0.s.class == obj.getClass()) {
            p201u0.s sVar = (p201u0.s) obj;
            return p247y7.AbstractC7350t.b(this.f55353C, sVar.f55353C) && p247y7.AbstractC7350t.b(this.f55356F, sVar.f55356F) && this.f55357G == sVar.f55357G && p247y7.AbstractC7350t.b(this.f55358H, sVar.f55358H) && this.f55359I == sVar.f55359I && this.f55360J == sVar.f55360J && p141o0.g2.e(this.f55361K, sVar.f55361K) && p141o0.h2.e(this.f55362L, sVar.f55362L) && this.f55363M == sVar.f55363M && this.f55364N == sVar.f55364N && this.f55365O == sVar.f55365O && this.f55366P == sVar.f55366P && p141o0.S1.d(this.f55355E, sVar.f55355E) && p247y7.AbstractC7350t.b(this.f55354D, sVar.f55354D);
        }
        return false;
    }

    public final java.lang.String f() {
        return this.f55353C;
    }

    public final java.util.List g() {
        return this.f55354D;
    }

    public int hashCode() {
        int iHashCode = ((this.f55353C.hashCode() * 31) + this.f55354D.hashCode()) * 31;
        p141o0.AbstractC6984n0 abstractC6984n0 = this.f55356F;
        int iHashCode2 = (((iHashCode + (abstractC6984n0 != null ? abstractC6984n0.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.f55357G)) * 31;
        p141o0.AbstractC6984n0 abstractC6984n1 = this.f55358H;
        return ((((((((((((((((((iHashCode2 + (abstractC6984n1 != null ? abstractC6984n1.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.f55359I)) * 31) + java.lang.Float.floatToIntBits(this.f55360J)) * 31) + p141o0.g2.f(this.f55361K)) * 31) + p141o0.h2.f(this.f55362L)) * 31) + java.lang.Float.floatToIntBits(this.f55363M)) * 31) + java.lang.Float.floatToIntBits(this.f55364N)) * 31) + java.lang.Float.floatToIntBits(this.f55365O)) * 31) + java.lang.Float.floatToIntBits(this.f55366P)) * 31) + p141o0.S1.e(this.f55355E);
    }

    public final int o() {
        return this.f55355E;
    }

    public final p141o0.AbstractC6984n0 s() {
        return this.f55358H;
    }
}
