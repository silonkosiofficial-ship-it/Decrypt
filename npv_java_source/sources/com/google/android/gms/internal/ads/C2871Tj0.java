package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2871Tj0 extends com.google.android.gms.internal.ads.AbstractC2724Pj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f31978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f31979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f31980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f31981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f31982e;

    C2871Tj0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f31978a = atomicReferenceFieldUpdater;
        this.f31979b = atomicReferenceFieldUpdater2;
        this.f31980c = atomicReferenceFieldUpdater3;
        this.f31981d = atomicReferenceFieldUpdater4;
        this.f31982e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final com.google.android.gms.internal.ads.C2835Sj0 a(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0) {
        return (com.google.android.gms.internal.ads.C2835Sj0) this.f31981d.getAndSet(abstractC3183ak0, c2835Sj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final com.google.android.gms.internal.ads.C3087Zj0 b(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0) {
        return (com.google.android.gms.internal.ads.C3087Zj0) this.f31980c.getAndSet(abstractC3183ak0, c3087Zj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final void c(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1) {
        this.f31979b.lazySet(c3087Zj0, c3087Zj1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final void d(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, java.lang.Thread thread) {
        this.f31978a.lazySet(c3087Zj0, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean e(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0, com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1) {
        return com.google.android.gms.internal.ads.AbstractC3293bk0.a(this.f31981d, abstractC3183ak0, c2835Sj0, c2835Sj1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean f(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.ads.AbstractC3293bk0.a(this.f31982e, abstractC3183ak0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2724Pj0
    final boolean g(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0, com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1) {
        return com.google.android.gms.internal.ads.AbstractC3293bk0.a(this.f31980c, abstractC3183ak0, c3087Zj0, c3087Zj1);
    }
}
