package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6325y0 extends com.google.android.gms.internal.play_billing.AbstractC6330z0 implements java.io.Serializable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.C6325y0 f41676E = new com.google.android.gms.internal.play_billing.C6325y0(com.google.android.gms.internal.play_billing.T.f41468D, com.google.android.gms.internal.play_billing.S.f41459D);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.gms.internal.play_billing.U f41677C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final com.google.android.gms.internal.play_billing.U f41678D;

    private C6325y0(com.google.android.gms.internal.play_billing.U u6, com.google.android.gms.internal.play_billing.U u10) {
        this.f41677C = u6;
        this.f41678D = u10;
        if (u6.e(u10) > 0 || u6 == com.google.android.gms.internal.play_billing.S.f41459D || u10 == com.google.android.gms.internal.play_billing.T.f41468D) {
            throw new java.lang.IllegalArgumentException("Invalid range: ".concat(e(u6, u10)));
        }
    }

    public static com.google.android.gms.internal.play_billing.C6325y0 a() {
        return f41676E;
    }

    private static java.lang.String e(com.google.android.gms.internal.play_billing.U u6, com.google.android.gms.internal.play_billing.U u10) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(16);
        u6.g(sb);
        sb.append("..");
        u10.i(sb);
        return sb.toString();
    }

    public final com.google.android.gms.internal.play_billing.C6325y0 b(com.google.android.gms.internal.play_billing.C6325y0 c6325y0) {
        int iE = this.f41677C.e(c6325y0.f41677C);
        int iE2 = this.f41678D.e(c6325y0.f41678D);
        if (iE >= 0 && iE2 <= 0) {
            return this;
        }
        if (iE <= 0 && iE2 >= 0) {
            return c6325y0;
        }
        com.google.android.gms.internal.play_billing.U u6 = iE >= 0 ? this.f41677C : c6325y0.f41677C;
        com.google.android.gms.internal.play_billing.U u10 = iE2 <= 0 ? this.f41678D : c6325y0.f41678D;
        com.google.android.gms.internal.play_billing.AbstractC6294t.d(u6.e(u10) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c6325y0);
        return new com.google.android.gms.internal.play_billing.C6325y0(u6, u10);
    }

    public final com.google.android.gms.internal.play_billing.C6325y0 c(com.google.android.gms.internal.play_billing.C6325y0 c6325y0) {
        int iE = this.f41677C.e(c6325y0.f41677C);
        int iE2 = this.f41678D.e(c6325y0.f41678D);
        if (iE <= 0 && iE2 >= 0) {
            return this;
        }
        if (iE >= 0 && iE2 <= 0) {
            return c6325y0;
        }
        com.google.android.gms.internal.play_billing.U u6 = iE <= 0 ? this.f41677C : c6325y0.f41677C;
        if (iE2 >= 0) {
            c6325y0 = this;
        }
        return new com.google.android.gms.internal.play_billing.C6325y0(u6, c6325y0.f41678D);
    }

    public final boolean d() {
        return this.f41677C.equals(this.f41678D);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_billing.C6325y0) {
            com.google.android.gms.internal.play_billing.C6325y0 c6325y0 = (com.google.android.gms.internal.play_billing.C6325y0) obj;
            if (this.f41677C.equals(c6325y0.f41677C) && this.f41678D.equals(c6325y0.f41678D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41677C.hashCode() * 31) + this.f41678D.hashCode();
    }

    public final java.lang.String toString() {
        return e(this.f41677C, this.f41678D);
    }
}
