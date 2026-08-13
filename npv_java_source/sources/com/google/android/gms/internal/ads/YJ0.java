package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class YJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33334c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.RJ0[] f33335d = new com.google.android.gms.internal.ads.RJ0[100];

    public YJ0(boolean z6, int i6) {
    }

    public final synchronized int a() {
        return this.f33333b * 65536;
    }

    public final synchronized com.google.android.gms.internal.ads.RJ0 b() {
        com.google.android.gms.internal.ads.RJ0 rj0;
        try {
            this.f33333b++;
            int i6 = this.f33334c;
            if (i6 > 0) {
                com.google.android.gms.internal.ads.RJ0[] rj0Arr = this.f33335d;
                int i10 = i6 - 1;
                this.f33334c = i10;
                rj0 = rj0Arr[i10];
                if (rj0 == null) {
                    throw null;
                }
                rj0Arr[i10] = null;
            } else {
                rj0 = new com.google.android.gms.internal.ads.RJ0(new byte[65536], 0);
                int i11 = this.f33333b;
                com.google.android.gms.internal.ads.RJ0[] rj0Arr2 = this.f33335d;
                int length = rj0Arr2.length;
                if (i11 > length) {
                    this.f33335d = (com.google.android.gms.internal.ads.RJ0[]) java.util.Arrays.copyOf(rj0Arr2, length + length);
                    return rj0;
                }
            }
            return rj0;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(com.google.android.gms.internal.ads.RJ0 rj0) {
        com.google.android.gms.internal.ads.RJ0[] rj0Arr = this.f33335d;
        int i6 = this.f33334c;
        this.f33334c = i6 + 1;
        rj0Arr[i6] = rj0;
        this.f33333b--;
        notifyAll();
    }

    public final synchronized void d(com.google.android.gms.internal.ads.SJ0 sj0) {
        while (sj0 != null) {
            try {
                com.google.android.gms.internal.ads.RJ0[] rj0Arr = this.f33335d;
                int i6 = this.f33334c;
                this.f33334c = i6 + 1;
                rj0Arr[i6] = sj0.c();
                this.f33333b--;
                sj0 = sj0.f();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i6) {
        int i10 = this.f33332a;
        this.f33332a = i6;
        if (i6 < i10) {
            g();
        }
    }

    public final synchronized void g() {
        int i6 = this.f33332a;
        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
        int iMax = java.lang.Math.max(0, ((i6 + 65535) / 65536) - this.f33333b);
        int i11 = this.f33334c;
        if (iMax >= i11) {
            return;
        }
        java.util.Arrays.fill(this.f33335d, iMax, i11, (java.lang.Object) null);
        this.f33334c = iMax;
    }
}
