package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC2145n implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T2.c f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.android.billingclient.api.C2133b f24616b;

    /* synthetic */ ServiceConnectionC2145n(com.android.billingclient.api.C2133b c2133b, T2.c cVar, T2.l lVar) {
        this.f24616b = c2133b;
        this.f24615a = cVar;
    }

    private final void c(com.android.billingclient.api.C2135d c2135d) {
        synchronized (this.f24616b.f24540a) {
            try {
                if (this.f24616b.f24541b == 3) {
                    return;
                }
                this.f24615a.b(c2135d);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0273  */
    /* JADX WARN: Code duplicated, block: B:163:0x0278  */
    final /* synthetic */ java.lang.Object a() {
        android.os.Bundle bundle;
        boolean z6;
        int i6;
        int i10;
        java.lang.String strA;
        int iT1;
        com.android.billingclient.api.C2135d c2135d;
        com.google.android.gms.internal.play_billing.InterfaceC6199d interfaceC6199d;
        synchronized (this.f24616b.f24540a) {
            try {
                if (this.f24616b.f24541b != 3) {
                    int i11 = this.f24616b.f24541b;
                    if (android.text.TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new android.os.Bundle();
                        bundle.putString("accountName", null);
                        com.android.billingclient.api.C2133b c2133b = this.f24616b;
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.c(bundle, c2133b.f24542c, c2133b.f24539F.longValue());
                    }
                    try {
                        synchronized (this.f24616b.f24540a) {
                            interfaceC6199d = this.f24616b.f24547h;
                        }
                        if (interfaceC6199d == null) {
                            this.f24616b.M(0);
                            com.android.billingclient.api.C2133b c2133b2 = this.f24616b;
                            com.android.billingclient.api.C2135d c2135d2 = com.android.billingclient.api.z.f24660m;
                            c2133b2.j0(119, 6, c2135d2);
                            c(c2135d2);
                        } else {
                            java.lang.String packageName = this.f24616b.f24545f.getPackageName();
                            iT1 = 3;
                            int i12 = 23;
                            while (true) {
                                if (i12 < 3) {
                                    i12 = 0;
                                    break;
                                }
                                iT1 = bundle == null ? interfaceC6199d.t1(i12, packageName, "subs") : interfaceC6199d.n5(i12, packageName, "subs", bundle);
                                if (iT1 == 0) {
                                    com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                    break;
                                }
                                i12--;
                            }
                            this.f24616b.f24550k = i12 >= 5;
                            this.f24616b.f24549j = i12 >= 3;
                            if (i12 < 3) {
                                com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "In-app billing API does not support subscription on this device.");
                                i6 = 9;
                            } else {
                                i6 = 1;
                            }
                            for (int i13 = 23; i13 >= 3; i13--) {
                                iT1 = bundle == null ? interfaceC6199d.t1(i13, packageName, "inapp") : interfaceC6199d.n5(i13, packageName, "inapp", bundle);
                                if (iT1 == 0) {
                                    this.f24616b.f24551l = i13;
                                    com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "mHighestLevelSupportedForInApp: " + this.f24616b.f24551l);
                                    break;
                                }
                            }
                            com.android.billingclient.api.C2133b c2133b3 = this.f24616b;
                            c2133b3.f24534A = c2133b3.f24551l >= 23;
                            com.android.billingclient.api.C2133b c2133b4 = this.f24616b;
                            c2133b4.f24565z = c2133b4.f24551l >= 22;
                            com.android.billingclient.api.C2133b c2133b5 = this.f24616b;
                            c2133b5.f24564y = c2133b5.f24551l >= 21;
                            com.android.billingclient.api.C2133b c2133b6 = this.f24616b;
                            c2133b6.f24563x = c2133b6.f24551l >= 20;
                            com.android.billingclient.api.C2133b c2133b7 = this.f24616b;
                            c2133b7.f24562w = c2133b7.f24551l >= 19;
                            com.android.billingclient.api.C2133b c2133b8 = this.f24616b;
                            c2133b8.f24561v = c2133b8.f24551l >= 18;
                            com.android.billingclient.api.C2133b c2133b9 = this.f24616b;
                            c2133b9.f24560u = c2133b9.f24551l >= 17;
                            com.android.billingclient.api.C2133b c2133b10 = this.f24616b;
                            c2133b10.f24559t = c2133b10.f24551l >= 16;
                            com.android.billingclient.api.C2133b c2133b11 = this.f24616b;
                            c2133b11.f24558s = c2133b11.f24551l >= 15;
                            com.android.billingclient.api.C2133b c2133b12 = this.f24616b;
                            c2133b12.f24557r = c2133b12.f24551l >= 14;
                            com.android.billingclient.api.C2133b c2133b13 = this.f24616b;
                            c2133b13.f24556q = c2133b13.f24551l >= 12;
                            com.android.billingclient.api.C2133b c2133b14 = this.f24616b;
                            c2133b14.f24555p = c2133b14.f24551l >= 10;
                            com.android.billingclient.api.C2133b c2133b15 = this.f24616b;
                            c2133b15.f24554o = c2133b15.f24551l >= 9;
                            com.android.billingclient.api.C2133b c2133b16 = this.f24616b;
                            c2133b16.f24553n = c2133b16.f24551l >= 8;
                            com.android.billingclient.api.C2133b c2133b17 = this.f24616b;
                            c2133b17.f24552m = c2133b17.f24551l >= 6;
                            if (this.f24616b.f24551l < 3) {
                                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i6 = 36;
                            }
                            if (iT1 == 0) {
                                synchronized (this.f24616b.f24540a) {
                                    try {
                                        if (this.f24616b.f24541b != 3) {
                                            z6 = i11 != 1;
                                            this.f24616b.M(2);
                                            com.android.billingclient.api.I i14 = this.f24616b.f24544e != null ? this.f24616b.f24544e : null;
                                            if (i14 != null) {
                                                i14.g(this.f24616b.f24564y);
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                z6 = i11 != 1;
                                this.f24616b.M(0);
                            }
                            strA = null;
                            if (iT1 == 0) {
                                try {
                                    if (true != z6) {
                                        this.f24616b.l0(6);
                                    } else {
                                        com.android.billingclient.api.y yVar = this.f24616b.f24546g;
                                        com.google.android.gms.internal.play_billing.E4 e4C = com.google.android.gms.internal.play_billing.G4.C();
                                        com.google.android.gms.internal.play_billing.T3 t3F = com.google.android.gms.internal.play_billing.X3.F();
                                        t3F.t(0);
                                        e4C.q(t3F);
                                        yVar.c((com.google.android.gms.internal.play_billing.G4) e4C.l());
                                    }
                                } catch (java.lang.Throwable th2) {
                                    com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th2);
                                }
                                c2135d = com.android.billingclient.api.z.f24659l;
                            } else {
                                com.android.billingclient.api.C2135d c2135d3 = com.android.billingclient.api.z.f24648a;
                                try {
                                    if (true != z6) {
                                        this.f24616b.k0(i6, 6, c2135d3, strA);
                                    } else {
                                        com.google.android.gms.internal.play_billing.T3 t3F2 = com.google.android.gms.internal.play_billing.X3.F();
                                        t3F2.t(c2135d3.b());
                                        t3F2.r(c2135d3.a());
                                        t3F2.u(i6);
                                        if (strA != null) {
                                            t3F2.q(strA);
                                        }
                                        com.android.billingclient.api.y yVar2 = this.f24616b.f24546g;
                                        com.google.android.gms.internal.play_billing.E4 e4C2 = com.google.android.gms.internal.play_billing.G4.C();
                                        e4C2.r((com.google.android.gms.internal.play_billing.X3) t3F2.l());
                                        yVar2.c((com.google.android.gms.internal.play_billing.G4) e4C2.l());
                                    }
                                } catch (java.lang.Throwable th3) {
                                    com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th3);
                                }
                                c2135d = com.android.billingclient.api.z.f24648a;
                            }
                            c(c2135d);
                        }
                    } catch (java.lang.Exception e6) {
                        z6 = i11 != 1;
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Exception while checking if billing is supported; try to reconnect", e6);
                        if (e6 instanceof android.os.DeadObjectException) {
                            i10 = 101;
                        } else if (e6 instanceof android.os.RemoteException) {
                            i10 = 100;
                        } else {
                            if (e6 instanceof java.lang.SecurityException) {
                                i10 = 102;
                            } else {
                                i6 = 42;
                            }
                            if (i6 == 42) {
                                strA = com.android.billingclient.api.x.a(e6);
                            } else {
                                strA = null;
                            }
                            this.f24616b.M(0);
                            iT1 = 6;
                        }
                        i6 = i10;
                        if (i6 == 42) {
                            strA = com.android.billingclient.api.x.a(e6);
                        } else {
                            strA = null;
                        }
                        this.f24616b.M(0);
                        iT1 = 6;
                    }
                }
            } catch (java.lang.Throwable th4) {
                throw th4;
            }
        }
        return null;
    }

    final /* synthetic */ void b() {
        this.f24616b.M(0);
        com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24661n;
        this.f24616b.j0(24, 6, c2135d);
        c(c2135d);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Billing service died.");
        try {
            if (com.android.billingclient.api.C2133b.b0(this.f24616b)) {
                com.android.billingclient.api.y yVar = this.f24616b.f24546g;
                com.google.android.gms.internal.play_billing.L3 l3E = com.google.android.gms.internal.play_billing.N3.E();
                l3E.r(6);
                com.google.android.gms.internal.play_billing.T3 t3F = com.google.android.gms.internal.play_billing.X3.F();
                t3F.u(122);
                l3E.q(t3F);
                yVar.d((com.google.android.gms.internal.play_billing.N3) l3E.l());
            } else {
                this.f24616b.f24546g.a(com.google.android.gms.internal.play_billing.C6186a4.A());
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f24616b.f24540a) {
            if (this.f24616b.f24541b != 3 && this.f24616b.f24541b != 0) {
                this.f24616b.M(0);
                this.f24616b.O();
                this.f24615a.e();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClient", "Billing service connected.");
        synchronized (this.f24616b.f24540a) {
            try {
                if (this.f24616b.f24541b == 3) {
                    return;
                }
                this.f24616b.f24547h = com.google.android.gms.internal.play_billing.AbstractBinderC6193c.y0(iBinder);
                com.android.billingclient.api.C2133b c2133b = this.f24616b;
                if (com.android.billingclient.api.C2133b.k(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.l
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        this.f24613a.a();
                        return null;
                    }
                }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24614C.b();
                    }
                }, c2133b.g0(), c2133b.I()) == null) {
                    com.android.billingclient.api.C2133b c2133b2 = this.f24616b;
                    com.android.billingclient.api.C2135d c2135dG = c2133b2.G();
                    c2133b2.j0(25, 6, c2135dG);
                    c(c2135dG);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClient", "Billing service disconnected.");
        try {
            if (com.android.billingclient.api.C2133b.b0(this.f24616b)) {
                com.android.billingclient.api.y yVar = this.f24616b.f24546g;
                com.google.android.gms.internal.play_billing.L3 l3E = com.google.android.gms.internal.play_billing.N3.E();
                l3E.r(6);
                com.google.android.gms.internal.play_billing.T3 t3F = com.google.android.gms.internal.play_billing.X3.F();
                t3F.u(121);
                l3E.q(t3F);
                yVar.d((com.google.android.gms.internal.play_billing.N3) l3E.l());
            } else {
                this.f24616b.f24546g.b(com.google.android.gms.internal.play_billing.K4.A());
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f24616b.f24540a) {
            try {
                if (this.f24616b.f24541b == 3) {
                    return;
                }
                this.f24616b.M(0);
                this.f24615a.e();
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
