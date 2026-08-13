package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f25176a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object[] f25177b = new java.lang.Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25179d;

    public AU(int i6) {
    }

    private final java.lang.Object f() {
        com.google.android.gms.internal.ads.LC.f(this.f25179d > 0);
        java.lang.Object[] objArr = this.f25177b;
        int i6 = this.f25178c;
        java.lang.Object obj = objArr[i6];
        objArr[i6] = null;
        this.f25178c = (i6 + 1) % objArr.length;
        this.f25179d--;
        return obj;
    }

    public final synchronized int a() {
        return this.f25179d;
    }

    public final synchronized java.lang.Object b() {
        if (this.f25179d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized java.lang.Object c(long j6) {
        java.lang.Object objF;
        objF = null;
        while (this.f25179d > 0 && j6 - this.f25176a[this.f25178c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j6, java.lang.Object obj) {
        try {
            int i6 = this.f25179d;
            if (i6 > 0) {
                if (j6 <= this.f25176a[((this.f25178c + i6) - 1) % this.f25177b.length]) {
                    e();
                }
            }
            int length = this.f25177b.length;
            if (this.f25179d >= length) {
                int i10 = length + length;
                long[] jArr = new long[i10];
                java.lang.Object[] objArr = new java.lang.Object[i10];
                int i11 = this.f25178c;
                int i12 = length - i11;
                java.lang.System.arraycopy(this.f25176a, i11, jArr, 0, i12);
                java.lang.System.arraycopy(this.f25177b, this.f25178c, objArr, 0, i12);
                int i13 = this.f25178c;
                if (i13 > 0) {
                    java.lang.System.arraycopy(this.f25176a, 0, jArr, i12, i13);
                    java.lang.System.arraycopy(this.f25177b, 0, objArr, i12, this.f25178c);
                }
                this.f25176a = jArr;
                this.f25177b = objArr;
                this.f25178c = 0;
            }
            int i14 = this.f25178c;
            int i15 = this.f25179d;
            java.lang.Object[] objArr2 = this.f25177b;
            int length2 = (i14 + i15) % objArr2.length;
            this.f25176a[length2] = j6;
            objArr2[length2] = obj;
            this.f25179d = i15 + 1;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f25178c = 0;
        this.f25179d = 0;
        java.util.Arrays.fill(this.f25177b, (java.lang.Object) null);
    }
}
