package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4301kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f37029d = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f37030e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f37031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f37032b = f37029d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.internal.ads.C4411lv0 f37033c;

    /* synthetic */ AbstractC4301kv0(com.google.android.gms.internal.ads.AbstractC4191jv0 abstractC4191jv0) {
    }

    public static int c(int i6) {
        return (i6 >>> 1) ^ (-(i6 & 1));
    }

    public static long d(long j6) {
        return (j6 >>> 1) ^ (-(1 & j6));
    }

    public static com.google.android.gms.internal.ads.AbstractC4301kv0 e(java.io.InputStream inputStream, int i6) {
        if (inputStream != null) {
            return new com.google.android.gms.internal.ads.C4081iv0(inputStream, 4096, null);
        }
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        int length = bArr.length;
        return f(bArr, 0, 0, false);
    }

    static com.google.android.gms.internal.ads.AbstractC4301kv0 f(byte[] bArr, int i6, int i10, boolean z6) {
        com.google.android.gms.internal.ads.C3863gv0 c3863gv0 = new com.google.android.gms.internal.ads.C3863gv0(bArr, i6, i10, z6, null);
        try {
            c3863gv0.j(i10);
            return c3863gv0;
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public abstract void A(int i6);

    public abstract boolean a();

    public abstract boolean b();

    public abstract double g();

    public abstract float h();

    public abstract int i();

    public abstract int j(int i6);

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract com.google.android.gms.internal.ads.AbstractC3753fv0 w();

    public abstract java.lang.String x();

    public abstract java.lang.String y();

    public abstract void z(int i6);
}
