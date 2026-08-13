package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class SC extends com.google.android.gms.internal.ads.BF implements com.google.android.gms.internal.ads.IC {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f31639D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f31640E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f31641F;

    public SC(com.google.android.gms.internal.ads.RC rc, java.util.Set set, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f31641F = false;
        this.f31639D = scheduledExecutorService;
        super.F0(rc, executor);
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void F(final com.google.android.gms.internal.ads.YH yh) {
        if (this.f31641F) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.f31640E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.NC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.IC) obj).F(yh);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void b() {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.KC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.IC) obj).b();
            }
        });
    }

    public final synchronized void d() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.f31640E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void e() {
        this.f31640E = this.f31639D.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.MC
            @Override // java.lang.Runnable
            public final void run() {
                this.f29687C.q1();
            }
        }, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ca)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void p(final p184s3.W0 w6) {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.JC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.IC) obj).p(w6);
            }
        });
    }

    final /* synthetic */ void q1() {
        synchronized (this) {
            p224w3.p.d("Timeout waiting for show call succeed to be called.");
            F(new com.google.android.gms.internal.ads.YH("Timeout for show call succeed."));
            this.f31641F = true;
        }
    }
}
