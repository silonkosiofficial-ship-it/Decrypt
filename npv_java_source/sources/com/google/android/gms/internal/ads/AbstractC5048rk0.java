package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5048rk0 extends com.google.android.gms.internal.ads.AbstractC3015Xj0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC4609nk0 f38547L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Wk0 f38548M = new com.google.android.gms.internal.ads.Wk0(com.google.android.gms.internal.ads.AbstractC5048rk0.class);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private volatile java.util.Set f38549J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private volatile int f38550K;

    static {
        com.google.android.gms.internal.ads.AbstractC4609nk0 c4829pk0;
        java.lang.Throwable th;
        com.google.android.gms.internal.ads.AbstractC4939qk0 abstractC4939qk0 = null;
        try {
            c4829pk0 = new com.google.android.gms.internal.ads.C4719ok0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.AbstractC5048rk0.class, java.util.Set.class, "J"), java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.google.android.gms.internal.ads.AbstractC5048rk0.class, "K"));
            th = null;
        } catch (java.lang.Throwable th2) {
            c4829pk0 = new com.google.android.gms.internal.ads.C4829pk0(abstractC4939qk0);
            th = th2;
        }
        f38547L = c4829pk0;
        if (th != null) {
            f38548M.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    AbstractC5048rk0(int i6) {
        this.f38550K = i6;
    }

    final int D() {
        return f38547L.a(this);
    }

    final java.util.Set F() {
        java.util.Set set = this.f38549J;
        if (set != null) {
            return set;
        }
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
        J(setNewSetFromMap);
        f38547L.b(this, null, setNewSetFromMap);
        java.util.Set set2 = this.f38549J;
        j$.util.Objects.requireNonNull(set2);
        return set2;
    }

    final void I() {
        this.f38549J = null;
    }

    abstract void J(java.util.Set set);
}
