package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f29454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29458e;

    public LH0(java.lang.Object obj, int i6, int i10, long j6) {
        this(obj, i6, i10, j6, -1);
    }

    private LH0(java.lang.Object obj, int i6, int i10, long j6, int i11) {
        this.f29454a = obj;
        this.f29455b = i6;
        this.f29456c = i10;
        this.f29457d = j6;
        this.f29458e = i11;
    }

    public LH0(java.lang.Object obj, long j6) {
        this(obj, -1, -1, j6, -1);
    }

    public LH0(java.lang.Object obj, long j6, int i6) {
        this(obj, -1, -1, j6, i6);
    }

    public final com.google.android.gms.internal.ads.LH0 a(java.lang.Object obj) {
        return this.f29454a.equals(obj) ? this : new com.google.android.gms.internal.ads.LH0(obj, this.f29455b, this.f29456c, this.f29457d, this.f29458e);
    }

    public final boolean b() {
        return this.f29455b != -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.LH0)) {
            return false;
        }
        com.google.android.gms.internal.ads.LH0 lh0 = (com.google.android.gms.internal.ads.LH0) obj;
        return this.f29454a.equals(lh0.f29454a) && this.f29455b == lh0.f29455b && this.f29456c == lh0.f29456c && this.f29457d == lh0.f29457d && this.f29458e == lh0.f29458e;
    }

    public final int hashCode() {
        return ((((((((this.f29454a.hashCode() + 527) * 31) + this.f29455b) * 31) + this.f29456c) * 31) + ((int) this.f29457d)) * 31) + this.f29458e;
    }
}
