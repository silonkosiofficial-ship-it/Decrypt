package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class VZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32513a = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f32514b = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V3.f f32515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.Executor f32516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.L20 f32517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f32519g;

    public VZ(com.google.android.gms.internal.ads.L20 l20, long j6, V3.f fVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f32515c = fVar;
        this.f32517e = l20;
        this.f32518f = j6;
        this.f32516d = executor;
        this.f32519g = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return this.f32517e.a();
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        com.google.android.gms.internal.ads.UZ uz;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Gb)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fb)).booleanValue() && !((java.lang.Boolean) this.f32514b.getAndSet(java.lang.Boolean.TRUE)).booleanValue()) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = com.google.android.gms.internal.ads.AbstractC3524dr.f34798d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.SZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.ads.VZ vz = this.f31710C;
                        vz.f32516d.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.TZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                vz.d();
                            }
                        });
                    }
                };
                long j6 = this.f32518f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j6, j6, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    uz = (com.google.android.gms.internal.ads.UZ) this.f32513a.get();
                    if (uz == null) {
                        com.google.android.gms.internal.ads.UZ uz2 = new com.google.android.gms.internal.ads.UZ(this.f32517e.b(), this.f32518f, this.f32515c);
                        this.f32513a.set(uz2);
                        return uz2.f32231a;
                    }
                    if (!((java.lang.Boolean) this.f32514b.get()).booleanValue() && uz.a()) {
                        P4.d dVar = uz.f32231a;
                        com.google.android.gms.internal.ads.L20 l20 = this.f32517e;
                        com.google.android.gms.internal.ads.UZ uz3 = new com.google.android.gms.internal.ads.UZ(l20.b(), this.f32518f, this.f32515c);
                        this.f32513a.set(uz3);
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Hb)).booleanValue()) {
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ib)).booleanValue()) {
                                com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f32519g.a();
                                c3479dOA.b("action", "scs");
                                c3479dOA.b("sid", java.lang.String.valueOf(this.f32517e.a()));
                                c3479dOA.g();
                            }
                            return dVar;
                        }
                        uz = uz3;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } else {
            uz = (com.google.android.gms.internal.ads.UZ) this.f32513a.get();
            if (uz == null || uz.a()) {
                com.google.android.gms.internal.ads.L20 l21 = this.f32517e;
                com.google.android.gms.internal.ads.UZ uz4 = new com.google.android.gms.internal.ads.UZ(l21.b(), this.f32518f, this.f32515c);
                this.f32513a.set(uz4);
                uz = uz4;
            }
        }
        return uz.f32231a;
    }

    final /* synthetic */ void d() {
        this.f32513a.set(new com.google.android.gms.internal.ads.UZ(this.f32517e.b(), this.f32518f, this.f32515c));
    }
}
