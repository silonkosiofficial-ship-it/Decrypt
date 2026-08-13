package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Qz0 extends com.google.android.gms.internal.ads.AbstractC2715Pf {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f31098E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f31099F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f31100G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.D f31101H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f31102I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f31103J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final boolean f31104K;

    static {
        java.lang.Integer.toString(1001, 36);
        java.lang.Integer.toString(1002, 36);
        java.lang.Integer.toString(1003, 36);
        java.lang.Integer.toString(1004, 36);
        java.lang.Integer.toString(1005, 36);
        java.lang.Integer.toString(1006, 36);
    }

    private Qz0(int i6, java.lang.Throwable th, int i10) {
        this(i6, th, null, i10, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Qz0(int i6, java.lang.Throwable th, java.lang.String str, int i10, java.lang.String str2, int i11, com.google.android.gms.internal.ads.D d6, int i12, boolean z6) {
        java.lang.String str3;
        java.lang.String str4;
        if (i6 == 0) {
            str3 = "Source error";
        } else if (i6 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            java.lang.String strValueOf = java.lang.String.valueOf(d6);
            int i13 = com.google.android.gms.internal.ads.EW.f27061a;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new java.lang.IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i11 + ", format=" + strValueOf + ", format_supported=" + str4;
        }
        this(android.text.TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i10, i6, str2, i11, d6, i12, null, android.os.SystemClock.elapsedRealtime(), z6);
    }

    private Qz0(java.lang.String str, java.lang.Throwable th, int i6, int i10, java.lang.String str2, int i11, com.google.android.gms.internal.ads.D d6, int i12, com.google.android.gms.internal.ads.LH0 lh0, long j6, boolean z6) {
        boolean z10;
        super(str, th, i6, android.os.Bundle.EMPTY, j6);
        int i13 = i10;
        if (!z6) {
            z10 = true;
        } else if (i13 == 1) {
            i13 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.internal.ads.LC.d(z10);
        com.google.android.gms.internal.ads.LC.d(th != null);
        this.f31098E = i13;
        this.f31099F = str2;
        this.f31100G = i11;
        this.f31101H = d6;
        this.f31102I = i12;
        this.f31103J = lh0;
        this.f31104K = z6;
    }

    public static com.google.android.gms.internal.ads.Qz0 b(java.lang.Throwable th, java.lang.String str, int i6, com.google.android.gms.internal.ads.D d6, int i10, boolean z6, int i11) {
        return new com.google.android.gms.internal.ads.Qz0(1, th, null, i11, str, i6, d6, d6 == null ? 4 : i10, z6);
    }

    public static com.google.android.gms.internal.ads.Qz0 c(java.io.IOException iOException, int i6) {
        return new com.google.android.gms.internal.ads.Qz0(0, iOException, i6);
    }

    public static com.google.android.gms.internal.ads.Qz0 d(java.lang.RuntimeException runtimeException, int i6) {
        return new com.google.android.gms.internal.ads.Qz0(2, runtimeException, i6);
    }

    final com.google.android.gms.internal.ads.Qz0 a(com.google.android.gms.internal.ads.LH0 lh0) {
        java.lang.String message = getMessage();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return new com.google.android.gms.internal.ads.Qz0(message, getCause(), this.f30763C, this.f31098E, this.f31099F, this.f31100G, this.f31101H, this.f31102I, lh0, this.f30764D, this.f31104K);
    }
}
