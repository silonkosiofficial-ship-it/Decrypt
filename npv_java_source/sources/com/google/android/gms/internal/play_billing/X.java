package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class X extends com.google.android.gms.internal.play_billing.Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.Object[] f41495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f41496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f41497c;

    X(int i6) {
        com.google.android.gms.internal.play_billing.L.a(i6, "initialCapacity");
        this.f41495a = new java.lang.Object[i6];
        this.f41496b = 0;
    }

    private final void d(int i6) {
        int length = this.f41495a.length;
        int iA = com.google.android.gms.internal.play_billing.Y.a(length, this.f41496b + i6);
        if (iA > length || this.f41497c) {
            this.f41495a = java.util.Arrays.copyOf(this.f41495a, iA);
            this.f41497c = false;
        }
    }

    public final com.google.android.gms.internal.play_billing.X b(java.lang.Object obj) {
        obj.getClass();
        d(1);
        java.lang.Object[] objArr = this.f41495a;
        int i6 = this.f41496b;
        this.f41496b = i6 + 1;
        objArr[i6] = obj;
        return this;
    }

    final void c(java.lang.Object[] objArr, int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6301u0.b(objArr, i6);
        d(i6);
        java.lang.System.arraycopy(objArr, 0, this.f41495a, this.f41496b, i6);
        this.f41496b += i6;
    }
}
