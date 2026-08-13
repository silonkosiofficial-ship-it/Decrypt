package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f27350b;

    public FM(int i6) {
        this.f27350b = new long[i6];
    }

    public final int a() {
        return this.f27349a;
    }

    public final long b(int i6) {
        if (i6 >= 0 && i6 < this.f27349a) {
            return this.f27350b[i6];
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index " + i6 + ", size is " + this.f27349a);
    }

    public final void c(long j6) {
        int i6 = this.f27349a;
        long[] jArr = this.f27350b;
        if (i6 == jArr.length) {
            this.f27350b = java.util.Arrays.copyOf(jArr, i6 + i6);
        }
        long[] jArr2 = this.f27350b;
        int i10 = this.f27349a;
        this.f27349a = i10 + 1;
        jArr2[i10] = j6;
    }

    public final void d(long[] jArr) {
        int i6 = this.f27349a;
        int length = jArr.length;
        int i10 = i6 + length;
        long[] jArr2 = this.f27350b;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.f27350b = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(length2 + length2, i10));
        }
        java.lang.System.arraycopy(jArr, 0, this.f27350b, this.f27349a, length);
        this.f27349a = i10;
    }
}
