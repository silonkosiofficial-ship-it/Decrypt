package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class T0 extends com.google.android.gms.internal.play_billing.P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41473e;

    T0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f41469a = atomicReferenceFieldUpdater;
        this.f41470b = atomicReferenceFieldUpdater2;
        this.f41471c = atomicReferenceFieldUpdater3;
        this.f41472d = atomicReferenceFieldUpdater4;
        this.f41473e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final com.google.android.gms.internal.play_billing.S0 a(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.S0 s6) {
        return (com.google.android.gms.internal.play_billing.S0) this.f41472d.getAndSet(abstractC6183a1, s6);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final com.google.android.gms.internal.play_billing.Z0 b(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.Z0 z6) {
        return (com.google.android.gms.internal.play_billing.Z0) this.f41471c.getAndSet(abstractC6183a1, z6);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final void c(com.google.android.gms.internal.play_billing.Z0 z6, com.google.android.gms.internal.play_billing.Z0 z10) {
        this.f41470b.lazySet(z6, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final void d(com.google.android.gms.internal.play_billing.Z0 z6, java.lang.Thread thread) {
        this.f41469a.lazySet(z6, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean e(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.S0 s6, com.google.android.gms.internal.play_billing.S0 s10) {
        return com.google.android.gms.internal.play_billing.AbstractC6189b1.a(this.f41472d, abstractC6183a1, s6, s10);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean f(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.play_billing.AbstractC6189b1.a(this.f41473e, abstractC6183a1, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.P0
    final boolean g(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, com.google.android.gms.internal.play_billing.Z0 z6, com.google.android.gms.internal.play_billing.Z0 z10) {
        return com.google.android.gms.internal.play_billing.AbstractC6189b1.a(this.f41471c, abstractC6183a1, z6, z10);
    }
}
