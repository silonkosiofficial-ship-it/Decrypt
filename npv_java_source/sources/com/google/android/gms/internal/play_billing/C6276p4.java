package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6276p4 extends com.google.android.gms.internal.play_billing.D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f41618e;

    C6276p4(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f41614a = atomicReferenceFieldUpdater;
        this.f41615b = atomicReferenceFieldUpdater2;
        this.f41616c = atomicReferenceFieldUpdater3;
        this.f41617d = atomicReferenceFieldUpdater4;
        this.f41618e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final void a(com.google.android.gms.internal.play_billing.P4 p6, com.google.android.gms.internal.play_billing.P4 p10) {
        this.f41615b.lazySet(p6, p10);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final void b(com.google.android.gms.internal.play_billing.P4 p6, java.lang.Thread thread) {
        this.f41614a.lazySet(p6, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final boolean c(com.google.android.gms.internal.play_billing.R4 r6, com.google.android.gms.internal.play_billing.C6316w3 c6316w3, com.google.android.gms.internal.play_billing.C6316w3 c6316w4) {
        return com.google.android.gms.internal.play_billing.O3.a(this.f41617d, r6, c6316w3, c6316w4);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final boolean d(com.google.android.gms.internal.play_billing.R4 r6, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.play_billing.O3.a(this.f41618e, r6, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    final boolean e(com.google.android.gms.internal.play_billing.R4 r6, com.google.android.gms.internal.play_billing.P4 p6, com.google.android.gms.internal.play_billing.P4 p10) {
        return com.google.android.gms.internal.play_billing.O3.a(this.f41616c, r6, p6, p10);
    }
}
