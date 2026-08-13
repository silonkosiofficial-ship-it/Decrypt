package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5062rr0 extends com.google.android.gms.internal.ads.C2722Pi0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f38565D;

    public C5062rr0(com.google.android.gms.internal.ads.C3843gl0 c3843gl0, int i6, int i10) {
        super(b(2008, 1));
        this.f38565D = 1;
    }

    public C5062rr0(java.io.IOException iOException, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, int i6, int i10) {
        super(iOException, b(i6, i10));
        this.f38565D = i10;
    }

    public C5062rr0(java.lang.String str, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, int i6, int i10) {
        super(str, b(i6, i10));
        this.f38565D = i10;
    }

    public C5062rr0(java.lang.String str, java.io.IOException iOException, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, int i6, int i10) {
        super(str, iOException, b(i6, i10));
        this.f38565D = i10;
    }

    public static com.google.android.gms.internal.ads.C5062rr0 a(java.io.IOException iOException, com.google.android.gms.internal.ads.C3843gl0 c3843gl0, int i6) {
        int i10;
        java.lang.String message = iOException.getMessage();
        if (iOException instanceof java.net.SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof java.io.InterruptedIOException) {
            i10 = 1004;
        } else {
            i10 = (message == null || !com.google.android.gms.internal.ads.AbstractC3723fg0.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i10 == 2007 ? new com.google.android.gms.internal.ads.Qq0(iOException, c3843gl0) : new com.google.android.gms.internal.ads.C5062rr0(iOException, c3843gl0, i10, i6);
    }

    private static int b(int i6, int i10) {
        if (i6 == 2000) {
            return i10 != 1 ? 2000 : 2001;
        }
        return i6;
    }
}
