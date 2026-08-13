package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4469mR extends com.google.android.gms.internal.ads.AbstractC4249kR {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.Context f37350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.Executor f37351h;

    C4469mR(android.content.Context context, java.util.concurrent.Executor executor) {
        this.f37350g = context;
        this.f37351h = executor;
        this.f36967f = new com.google.android.gms.internal.ads.C5275to(context, p174r3.v.x().b(), this, this);
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.C4512mr c4512mr;
        com.google.android.gms.internal.ads.AR ar;
        synchronized (this.f36963b) {
            try {
                if (!this.f36965d) {
                    this.f36965d = true;
                    try {
                        this.f36967f.j0().A3(this.f36966e, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Nc)).booleanValue() ? new com.google.android.gms.internal.ads.BinderC4139jR(this.f36962a, this.f36966e) : new com.google.android.gms.internal.ads.BinderC4031iR(this));
                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                        c4512mr = this.f36962a;
                        ar = new com.google.android.gms.internal.ads.AR(1);
                        c4512mr.d(ar);
                    } catch (java.lang.Throwable th) {
                        p174r3.v.s().x(th, "RemoteSignalsClientTask.onConnected");
                        c4512mr = this.f36962a;
                        ar = new com.google.android.gms.internal.ads.AR(1);
                        c4512mr.d(ar);
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final P4.d c(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        synchronized (this.f36963b) {
            try {
                if (this.f36964c) {
                    return this.f36962a;
                }
                this.f36964c = true;
                this.f36966e = c2730Po;
                this.f36967f.q();
                this.f36962a.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.lR
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37173C.a();
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
                com.google.android.gms.internal.ads.AbstractC4249kR.b(this.f37350g, this.f36962a, this.f37351h);
                return this.f36962a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
