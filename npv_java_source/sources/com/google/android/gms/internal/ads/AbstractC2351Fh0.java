package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2351Fh0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f27445C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f27446D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f27447E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2536Kh0 f27448F;

    /* synthetic */ AbstractC2351Fh0(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0, com.google.android.gms.internal.ads.AbstractC2499Jh0 abstractC2499Jh0) {
        this.f27448F = c2536Kh0;
        this.f27445C = c2536Kh0.f29000G;
        this.f27446D = c2536Kh0.h();
    }

    private final void c() {
        if (this.f27448F.f29000G != this.f27445C) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    abstract java.lang.Object b(int i6);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27446D >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        c();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i6 = this.f27446D;
        this.f27447E = i6;
        java.lang.Object objB = b(i6);
        this.f27446D = this.f27448F.j(this.f27446D);
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        com.google.android.gms.internal.ads.AbstractC2164Ag0.m(this.f27447E >= 0, "no calls to next() since the last call to remove()");
        this.f27445C += 32;
        int i6 = this.f27447E;
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0 = this.f27448F;
        c2536Kh0.remove(com.google.android.gms.internal.ads.C2536Kh0.k(c2536Kh0, i6));
        this.f27446D--;
        this.f27447E = -1;
    }
}
