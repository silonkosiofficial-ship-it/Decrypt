package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f40704b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f40705a;

    private X3() {
        this.f40705a = f40704b;
    }

    public static int a(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long b(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    static com.google.android.gms.internal.measurement.X3 c(byte[] bArr, int i6, int i10, boolean z6) {
        com.google.android.gms.internal.measurement.C5964a4 c5964a4 = new com.google.android.gms.internal.measurement.C5964a4(bArr, i10);
        try {
            c5964a4.d(i10);
            return c5964a4;
        } catch (com.google.android.gms.internal.measurement.C4 e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public abstract int d(int i6);

    public abstract int e();
}
