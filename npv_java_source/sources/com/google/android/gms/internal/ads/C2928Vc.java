package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2928Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ScheduledFuture f32524a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Runnable f32525b = new com.google.android.gms.internal.ads.RunnableC2783Rc(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f32526c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3036Yc f32527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.content.Context f32528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3278bd f32529f;

    static /* bridge */ /* synthetic */ void h(com.google.android.gms.internal.ads.C2928Vc c2928Vc) {
        synchronized (c2928Vc.f32526c) {
            try {
                com.google.android.gms.internal.ads.C3036Yc c3036Yc = c2928Vc.f32527d;
                if (c3036Yc == null) {
                    return;
                }
                if (c3036Yc.j() || c2928Vc.f32527d.e()) {
                    c2928Vc.f32527d.h();
                }
                c2928Vc.f32527d = null;
                c2928Vc.f32529f = null;
                android.os.Binder.flushPendingCommands();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f32526c) {
            try {
                if (this.f32528e != null && this.f32527d == null) {
                    com.google.android.gms.internal.ads.C3036Yc c3036YcD = d(new com.google.android.gms.internal.ads.C2856Tc(this), new com.google.android.gms.internal.ads.C2892Uc(this));
                    this.f32527d = c3036YcD;
                    c3036YcD.q();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final long a(com.google.android.gms.internal.ads.C3072Zc c3072Zc) {
        synchronized (this.f32526c) {
            try {
                if (this.f32529f == null) {
                    return -2L;
                }
                if (this.f32527d.j0()) {
                    try {
                        return this.f32529f.d2(c3072Zc);
                    } catch (android.os.RemoteException e6) {
                        p224w3.p.e("Unable to call into cache service.", e6);
                    }
                }
                return -2L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.ads.C2964Wc b(com.google.android.gms.internal.ads.C3072Zc c3072Zc) {
        synchronized (this.f32526c) {
            if (this.f32529f == null) {
                return new com.google.android.gms.internal.ads.C2964Wc();
            }
            try {
                if (this.f32527d.j0()) {
                    return this.f32529f.f3(c3072Zc);
                }
                return this.f32529f.T2(c3072Zc);
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Unable to call into cache service.", e6);
                return new com.google.android.gms.internal.ads.C2964Wc();
            }
        }
    }

    protected final synchronized com.google.android.gms.internal.ads.C3036Yc d(Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar) {
        return new com.google.android.gms.internal.ads.C3036Yc(this.f32528e, p174r3.v.x().b(), aVar, bVar);
    }

    public final void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f32526c) {
            try {
                if (this.f32528e != null) {
                    return;
                }
                this.f32528e = context.getApplicationContext();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25626m4)).booleanValue()) {
                    l();
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25616l4)).booleanValue()) {
                        p174r3.v.e().c(new com.google.android.gms.internal.ads.C2820Sc(this));
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25636n4)).booleanValue()) {
            synchronized (this.f32526c) {
                try {
                    l();
                    java.util.concurrent.ScheduledFuture scheduledFuture = this.f32524a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f32524a = com.google.android.gms.internal.ads.AbstractC3524dr.f34798d.schedule(this.f32525b, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25646o4)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }
}
