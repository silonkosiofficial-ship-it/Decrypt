package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ty0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Ty0 f32058j = new com.google.android.gms.internal.ads.Ty0(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Ty0 f32059k = new com.google.android.gms.internal.ads.Ty0(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Ty0 f32060l = new com.google.android.gms.internal.ads.Ty0(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.Ty0 f32061m = new com.google.android.gms.internal.ads.Ty0(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f32062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f32063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f32064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f32065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f32066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f32067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f32068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f32069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f32070i;

    public Ty0(double d6, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f32062a = d13;
        this.f32063b = d14;
        this.f32064c = d15;
        this.f32065d = d6;
        this.f32066e = d10;
        this.f32067f = d11;
        this.f32068g = d12;
        this.f32069h = d16;
        this.f32070i = d17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.internal.ads.Ty0.class != obj.getClass()) {
            return false;
        }
        com.google.android.gms.internal.ads.Ty0 ty0 = (com.google.android.gms.internal.ads.Ty0) obj;
        return java.lang.Double.compare(ty0.f32065d, this.f32065d) == 0 && java.lang.Double.compare(ty0.f32066e, this.f32066e) == 0 && java.lang.Double.compare(ty0.f32067f, this.f32067f) == 0 && java.lang.Double.compare(ty0.f32068g, this.f32068g) == 0 && java.lang.Double.compare(ty0.f32069h, this.f32069h) == 0 && java.lang.Double.compare(ty0.f32070i, this.f32070i) == 0 && java.lang.Double.compare(ty0.f32062a, this.f32062a) == 0 && java.lang.Double.compare(ty0.f32063b, this.f32063b) == 0 && java.lang.Double.compare(ty0.f32064c, this.f32064c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.f32062a);
        long j6 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f32063b);
        long j10 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = java.lang.Double.doubleToLongBits(this.f32064c);
        long j11 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = java.lang.Double.doubleToLongBits(this.f32065d);
        long j12 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = java.lang.Double.doubleToLongBits(this.f32066e);
        long j13 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = java.lang.Double.doubleToLongBits(this.f32067f);
        long j14 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = java.lang.Double.doubleToLongBits(this.f32068g);
        long j15 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = java.lang.Double.doubleToLongBits(this.f32069h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = java.lang.Double.doubleToLongBits(this.f32070i);
        return (((((((((((((((((int) j6) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final java.lang.String toString() {
        if (equals(f32058j)) {
            return "Rotate 0°";
        }
        if (equals(f32059k)) {
            return "Rotate 90°";
        }
        if (equals(f32060l)) {
            return "Rotate 180°";
        }
        if (equals(f32061m)) {
            return "Rotate 270°";
        }
        double d6 = this.f32062a;
        double d10 = this.f32063b;
        double d11 = this.f32064c;
        double d12 = this.f32065d;
        double d13 = this.f32066e;
        double d14 = this.f32067f;
        double d15 = this.f32068g;
        double d16 = this.f32069h;
        double d17 = this.f32070i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d6);
        sb.append(", v=");
        sb.append(d10);
        sb.append(", w=");
        sb.append(d11);
        sb.append(", a=");
        sb.append(d12);
        sb.append(", b=");
        sb.append(d13);
        sb.append(", c=");
        sb.append(d14);
        sb.append(", d=");
        sb.append(d15);
        sb.append(", tx=");
        sb.append(d16);
        sb.append(", ty=");
        sb.append(d17);
        sb.append("}");
        return sb.toString();
    }
}
