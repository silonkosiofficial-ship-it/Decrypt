package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4499mk0 extends com.google.android.gms.internal.ads.AbstractC5048rk0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Wk0 f37400Q = new com.google.android.gms.internal.ads.Wk0(com.google.android.gms.internal.ads.AbstractC4499mk0.class);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3011Xh0 f37401N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f37402O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f37403P;

    AbstractC4499mk0(com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0, boolean z6, boolean z10) {
        super(abstractC3011Xh0.size());
        this.f37401N = abstractC3011Xh0;
        this.f37402O = z6;
        this.f37403P = z10;
    }

    private final void L(int i6, java.util.concurrent.Future future) {
        try {
            R(i6, com.google.android.gms.internal.ads.AbstractC5050rl0.a(future));
        } catch (java.util.concurrent.ExecutionException e6) {
            N(e6.getCause());
        } catch (java.lang.Throwable th) {
            N(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void V(com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0) {
        int iD = D();
        int i6 = 0;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.m(iD >= 0, "Less than 0 remaining futures");
        if (iD == 0) {
            if (abstractC3011Xh0 != null) {
                com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N = abstractC3011Xh0.n();
                while (abstractC4167jj0N.hasNext()) {
                    java.util.concurrent.Future future = (java.util.concurrent.Future) abstractC4167jj0N.next();
                    if (!future.isCancelled()) {
                        L(i6, future);
                    }
                    i6++;
                }
            }
            I();
            S();
            W(2);
        }
    }

    private final void N(java.lang.Throwable th) {
        th.getClass();
        if (this.f37402O && !h(th) && Q(F(), th)) {
            O(th);
        } else if (th instanceof java.lang.Error) {
            O(th);
        }
    }

    private static void O(java.lang.Throwable th) {
        f37400Q.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof java.lang.Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void U(int i6, P4.d dVar) {
        try {
            if (dVar.isCancelled()) {
                this.f37401N = null;
                cancel(false);
            } else {
                L(i6, dVar);
            }
        } finally {
            V(null);
        }
    }

    private static boolean Q(java.util.Set set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5048rk0
    final void J(java.util.Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        java.lang.Throwable thA = a();
        j$.util.Objects.requireNonNull(thA);
        Q(set, thA);
    }

    abstract void R(int i6, java.lang.Object obj);

    abstract void S();

    final void T() {
        j$.util.Objects.requireNonNull(this.f37401N);
        if (this.f37401N.isEmpty()) {
            S();
            return;
        }
        if (!this.f37402O) {
            final com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0 = this.f37403P ? this.f37401N : null;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.lk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37215C.V(abstractC3011Xh0);
                }
            };
            com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N = this.f37401N.n();
            while (abstractC4167jj0N.hasNext()) {
                P4.d dVar = (P4.d) abstractC4167jj0N.next();
                if (dVar.isDone()) {
                    V(abstractC3011Xh0);
                } else {
                    dVar.e(runnable, com.google.android.gms.internal.ads.EnumC2172Ak0.INSTANCE);
                }
            }
            return;
        }
        com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N2 = this.f37401N.n();
        final int i6 = 0;
        while (abstractC4167jj0N2.hasNext()) {
            final P4.d dVar2 = (P4.d) abstractC4167jj0N2.next();
            int i10 = i6 + 1;
            if (dVar2.isDone()) {
                U(i6, dVar2);
            } else {
                dVar2.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.kk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37002C.U(i6, dVar2);
                    }
                }, com.google.android.gms.internal.ads.EnumC2172Ak0.INSTANCE);
            }
            i6 = i10;
        }
    }

    void W(int i6) {
        this.f37401N = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final java.lang.String c() {
        com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0 = this.f37401N;
        return abstractC3011Xh0 != null ? "futures=".concat(abstractC3011Xh0.toString()) : super.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final void d() {
        com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0 = this.f37401N;
        W(1);
        if ((abstractC3011Xh0 != null) && isCancelled()) {
            boolean zW = w();
            com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N = abstractC3011Xh0.n();
            while (abstractC4167jj0N.hasNext()) {
                ((java.util.concurrent.Future) abstractC4167jj0N.next()).cancel(zW);
            }
        }
    }
}
