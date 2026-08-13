package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4909qR extends com.google.android.gms.internal.ads.AbstractC4249kR {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f38274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38275h = 1;

    C4909qR(android.content.Context context) {
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
                        int i6 = this.f38275h;
                        if (i6 == 2) {
                            this.f36967f.j0().j1(this.f36966e, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Nc)).booleanValue() ? new com.google.android.gms.internal.ads.BinderC4139jR(this.f36962a, this.f36966e) : new com.google.android.gms.internal.ads.BinderC4031iR(this));
                        } else if (i6 == 3) {
                            this.f36967f.j0().R3(this.f38274g, ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Nc)).booleanValue() ? new com.google.android.gms.internal.ads.BinderC4139jR(this.f36962a, this.f36966e) : new com.google.android.gms.internal.ads.BinderC4031iR(this));
                        } else {
                            this.f36962a.d(new com.google.android.gms.internal.ads.AR(1));
                        }
                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                        c4512mr = this.f36962a;
                        ar = new com.google.android.gms.internal.ads.AR(1);
                        c4512mr.d(ar);
                    } catch (java.lang.Throwable th) {
                        p174r3.v.s().x(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i6 = this.f38275h;
                if (i6 != 1 && i6 != 2) {
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.AR(2));
                }
                if (this.f36964c) {
                    return this.f36962a;
                }
                this.f38275h = 2;
                this.f36964c = true;
                this.f36966e = c2730Po;
                this.f36967f.q();
                this.f36962a.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.oR
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37815C.a();
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
                return this.f36962a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final P4.d d(java.lang.String str) {
        synchronized (this.f36963b) {
            try {
                int i6 = this.f38275h;
                if (i6 != 1 && i6 != 3) {
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.AR(2));
                }
                if (this.f36964c) {
                    return this.f36962a;
                }
                this.f38275h = 3;
                this.f36964c = true;
                this.f38274g = str;
                this.f36967f.q();
                this.f36962a.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pR
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38005C.a();
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
                return this.f36962a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4249kR, Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
        p224w3.p.b("Cannot connect to remote service, fallback to local instance.");
        this.f36962a.d(new com.google.android.gms.internal.ads.AR(1));
    }
}
