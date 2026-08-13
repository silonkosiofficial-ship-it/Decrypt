package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4046id implements Q3.AbstractC1464c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3072Zc f36320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f36321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4264kd f36322c;

    C4046id(com.google.android.gms.internal.ads.C4264kd c4264kd, com.google.android.gms.internal.ads.C3072Zc c3072Zc, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f36320a = c3072Zc;
        this.f36321b = c4512mr;
        this.f36322c = c4264kd;
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        synchronized (this.f36322c.f36993d) {
            try {
                com.google.android.gms.internal.ads.C4264kd c4264kd = this.f36322c;
                if (c4264kd.f36991b) {
                    return;
                }
                c4264kd.f36991b = true;
                final com.google.android.gms.internal.ads.C3036Yc c3036Yc = this.f36322c.f36990a;
                if (c3036Yc == null) {
                    return;
                }
                com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
                final com.google.android.gms.internal.ads.C3072Zc c3072Zc = this.f36320a;
                final com.google.android.gms.internal.ads.C4512mr c4512mr = this.f36321b;
                final P4.d dVarR = yk0.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.fd
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.ads.C4046id c4046id = this.f35374C;
                        com.google.android.gms.internal.ads.C3036Yc c3036Yc2 = c3036Yc;
                        com.google.android.gms.internal.ads.C4512mr c4512mr2 = c4512mr;
                        try {
                            com.google.android.gms.internal.ads.C3278bd c3278bdK0 = c3036Yc2.k0();
                            boolean zJ0 = c3036Yc2.j0();
                            com.google.android.gms.internal.ads.C3072Zc c3072Zc2 = c3072Zc;
                            com.google.android.gms.internal.ads.C2964Wc c2964WcF3 = zJ0 ? c3278bdK0.f3(c3072Zc2) : c3278bdK0.T2(c3072Zc2);
                            if (!c2964WcF3.C()) {
                                c4512mr2.d(new java.lang.RuntimeException("No entry contents."));
                                com.google.android.gms.internal.ads.C4264kd.e(c4046id.f36322c);
                                return;
                            }
                            com.google.android.gms.internal.ads.C3936hd c3936hd = new com.google.android.gms.internal.ads.C3936hd(c4046id, c2964WcF3.s(), 1);
                            int i6 = c3936hd.read();
                            if (i6 == -1) {
                                throw new java.io.IOException("Unable to read from cache.");
                            }
                            c3936hd.unread(i6);
                            c4512mr2.c(com.google.android.gms.internal.ads.C4484md.b(c3936hd, c2964WcF3.w(), c2964WcF3.E(), c2964WcF3.e(), c2964WcF3.D()));
                        } catch (android.os.RemoteException e6) {
                            e = e6;
                            p224w3.p.e("Unable to obtain a cache service instance.", e);
                            c4512mr2.d(e);
                            com.google.android.gms.internal.ads.C4264kd.e(c4046id.f36322c);
                        } catch (java.io.IOException e10) {
                            e = e10;
                            p224w3.p.e("Unable to obtain a cache service instance.", e);
                            c4512mr2.d(e);
                            com.google.android.gms.internal.ads.C4264kd.e(c4046id.f36322c);
                        }
                    }
                });
                final com.google.android.gms.internal.ads.C4512mr c4512mr2 = this.f36321b;
                c4512mr2.e(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.gd
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c4512mr2.isCancelled()) {
                            dVarR.cancel(true);
                        }
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
    }
}
