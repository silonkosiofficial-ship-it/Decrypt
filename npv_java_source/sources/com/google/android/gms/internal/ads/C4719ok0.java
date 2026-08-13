package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ok0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4719ok0 extends com.google.android.gms.internal.ads.AbstractC4609nk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f37857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f37858b;

    C4719ok0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f37857a = atomicReferenceFieldUpdater;
        this.f37858b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4609nk0
    final int a(com.google.android.gms.internal.ads.AbstractC5048rk0 abstractC5048rk0) {
        return this.f37858b.decrementAndGet(abstractC5048rk0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4609nk0
    final void b(com.google.android.gms.internal.ads.AbstractC5048rk0 abstractC5048rk0, java.util.Set set, java.util.Set set2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f37857a;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC5048rk0, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC5048rk0) == null);
    }
}
