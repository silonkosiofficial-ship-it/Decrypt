package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class U0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.U0 f32077c = new com.google.android.gms.internal.ads.U0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32079b;

    public U0(long j6, long j10) {
        this.f32078a = j6;
        this.f32079b = j10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.U0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.U0 u6 = (com.google.android.gms.internal.ads.U0) obj;
            if (this.f32078a == u6.f32078a && this.f32079b == u6.f32079b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f32078a) * 31) + ((int) this.f32079b);
    }

    public final java.lang.String toString() {
        return "[timeUs=" + this.f32078a + ", position=" + this.f32079b + "]";
    }
}
