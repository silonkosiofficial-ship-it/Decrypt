package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2528Kd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2190Bb f28987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.io.File f28988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.io.File f28989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.io.File f28990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f28991e;

    public C2528Kd0(com.google.android.gms.internal.ads.C2190Bb c2190Bb, java.io.File file, java.io.File file2, java.io.File file3) {
        this.f28987a = c2190Bb;
        this.f28988b = file;
        this.f28989c = file3;
        this.f28990d = file2;
    }

    public final com.google.android.gms.internal.ads.C2190Bb a() {
        return this.f28987a;
    }

    public final java.io.File b() {
        return this.f28989c;
    }

    public final java.io.File c() {
        return this.f28988b;
    }

    public final boolean d(long j6) {
        return this.f28987a.c0() - (java.lang.System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] e() throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        byte[] bArrD;
        java.io.FileInputStream fileInputStream2 = null;
        if (this.f28991e == null) {
            try {
                fileInputStream = new java.io.FileInputStream(this.f28990d);
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i6 = 0;
                        while (i6 < iMin) {
                            int i10 = fileInputStream.read(bArr, i6, iMin - i6);
                            if (i10 == -1) {
                                break;
                            }
                            i6 += i10;
                        }
                        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0T = i6 == 0 ? null : com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArr, 0, i6);
                        if (abstractC3753fv0T == null) {
                            break;
                        }
                        arrayList.add(abstractC3753fv0T);
                        iMin = java.lang.Math.min(iMin + iMin, 8192);
                    }
                    bArrD = com.google.android.gms.internal.ads.AbstractC3753fv0.S(arrayList).d();
                    V3.l.a(fileInputStream);
                } catch (java.io.IOException unused) {
                    V3.l.a(fileInputStream);
                    bArrD = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    V3.l.a(fileInputStream2);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
                fileInputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            this.f28991e = bArrD;
        }
        byte[] bArr2 = this.f28991e;
        if (bArr2 == null) {
            return null;
        }
        return java.util.Arrays.copyOf(bArr2, bArr2.length);
    }
}
