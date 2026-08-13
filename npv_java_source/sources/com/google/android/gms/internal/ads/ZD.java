package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZD extends com.google.android.gms.internal.ads.BF {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f33522D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V3.f f33523E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f33524F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f33525G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f33526H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f33527I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f33528J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f33529K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f33530L;

    public ZD(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, V3.f fVar) {
        super(java.util.Collections.emptySet());
        this.f33524F = -1L;
        this.f33525G = -1L;
        this.f33526H = -1L;
        this.f33527I = -1L;
        this.f33528J = false;
        this.f33522D = scheduledExecutorService;
        this.f33523E = fVar;
    }

    private final synchronized void s1(long j6) {
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f33529K;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f33529K.cancel(false);
            }
            this.f33524F = this.f33523E.c() + j6;
            this.f33529K = this.f33522D.schedule(new com.google.android.gms.internal.ads.WD(this, null), j6, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final synchronized void t1(long j6) {
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f33530L;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f33530L.cancel(false);
            }
            this.f33525G = this.f33523E.c() + j6;
            this.f33530L = this.f33522D.schedule(new com.google.android.gms.internal.ads.XD(this, null), j6, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f33528J = false;
        s1(0L);
    }

    public final synchronized void b() {
        try {
            if (this.f33528J) {
                return;
            }
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f33529K;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f33526H = -1L;
            } else {
                this.f33529K.cancel(false);
                this.f33526H = this.f33524F - this.f33523E.c();
            }
            java.util.concurrent.ScheduledFuture scheduledFuture2 = this.f33530L;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.f33527I = -1L;
            } else {
                this.f33530L.cancel(false);
                this.f33527I = this.f33525G - this.f33523E.c();
            }
            this.f33528J = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        java.util.concurrent.ScheduledFuture scheduledFuture2;
        try {
            if (this.f33528J) {
                if (this.f33526H > 0 && (scheduledFuture2 = this.f33529K) != null && scheduledFuture2.isCancelled()) {
                    s1(this.f33526H);
                }
                if (this.f33527I > 0 && (scheduledFuture = this.f33530L) != null && scheduledFuture.isCancelled()) {
                    t1(this.f33527I);
                }
                this.f33528J = false;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void q1(int i6) {
        if (i6 > 0) {
            long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(i6);
            if (this.f33528J) {
                long j6 = this.f33526H;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f33526H = millis;
                return;
            }
            long jC = this.f33523E.c();
            long j10 = this.f33524F;
            if (jC > j10 || j10 - jC > millis) {
                s1(millis);
            }
        }
    }

    public final synchronized void r1(int i6) {
        if (i6 > 0) {
            long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(i6);
            if (this.f33528J) {
                long j6 = this.f33527I;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f33527I = millis;
                return;
            }
            long jC = this.f33523E.c();
            long j10 = this.f33525G;
            if (jC > j10 || j10 - jC > millis) {
                t1(millis);
            }
        }
    }
}
