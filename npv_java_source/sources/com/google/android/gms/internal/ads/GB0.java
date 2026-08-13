package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GB0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.GB0 f27755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.GB0 f27756d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27758b;

    static {
        com.google.android.gms.internal.ads.GB0 gb0 = new com.google.android.gms.internal.ads.GB0(0L, 0L);
        f27755c = gb0;
        new com.google.android.gms.internal.ads.GB0(Long.MAX_VALUE, Long.MAX_VALUE);
        new com.google.android.gms.internal.ads.GB0(Long.MAX_VALUE, 0L);
        new com.google.android.gms.internal.ads.GB0(0L, Long.MAX_VALUE);
        f27756d = gb0;
    }

    public GB0(long j6, long j10) {
        com.google.android.gms.internal.ads.LC.d(j6 >= 0);
        com.google.android.gms.internal.ads.LC.d(j10 >= 0);
        this.f27757a = j6;
        this.f27758b = j10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.GB0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.GB0 gb0 = (com.google.android.gms.internal.ads.GB0) obj;
            if (this.f27757a == gb0.f27757a && this.f27758b == gb0.f27758b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f27757a) * 31) + ((int) this.f27758b);
    }
}
