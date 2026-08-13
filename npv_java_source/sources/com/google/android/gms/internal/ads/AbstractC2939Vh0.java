package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2939Vh0 extends com.google.android.gms.internal.ads.AbstractC2975Wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.Object[] f32551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f32552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f32553c;

    AbstractC2939Vh0(int i6) {
        com.google.android.gms.internal.ads.AbstractC5812yh0.a(i6, "initialCapacity");
        this.f32551a = new java.lang.Object[i6];
        this.f32552b = 0;
    }

    private final void f(int i6) {
        int length = this.f32551a.length;
        int iB = com.google.android.gms.internal.ads.AbstractC2975Wh0.b(length, this.f32552b + i6);
        if (iB > length || this.f32553c) {
            this.f32551a = java.util.Arrays.copyOf(this.f32551a, iB);
            this.f32553c = false;
        }
    }

    public final com.google.android.gms.internal.ads.AbstractC2939Vh0 c(java.lang.Object obj) {
        obj.getClass();
        f(1);
        java.lang.Object[] objArr = this.f32551a;
        int i6 = this.f32552b;
        this.f32552b = i6 + 1;
        objArr[i6] = obj;
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC2975Wh0 d(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            f(collection.size());
            if (collection instanceof com.google.android.gms.internal.ads.AbstractC3011Xh0) {
                this.f32552b = ((com.google.android.gms.internal.ads.AbstractC3011Xh0) collection).d(this.f32551a, this.f32552b);
                return this;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    final void e(java.lang.Object[] objArr, int i6) {
        com.google.android.gms.internal.ads.AbstractC2611Mi0.b(objArr, 2);
        f(2);
        java.lang.System.arraycopy(objArr, 0, this.f32551a, this.f32552b, 2);
        this.f32552b += 2;
    }
}
