package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4384li extends p134n3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4274ki f37199a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4822ph f37201c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f37200b = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p104k3.w f37202d = new p104k3.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f37203e = new java.util.ArrayList();

    public C4384li(com.google.android.gms.internal.ads.InterfaceC4274ki interfaceC4274ki) {
        com.google.android.gms.internal.ads.InterfaceC4712oh c4492mh;
        android.os.IBinder iBinder;
        this.f37199a = interfaceC4274ki;
        com.google.android.gms.internal.ads.C4822ph c4822ph = null;
        try {
            java.util.List listA = interfaceC4274ki.A();
            if (listA != null) {
                for (java.lang.Object obj : listA) {
                    if (!(obj instanceof android.os.IBinder) || (iBinder = (android.os.IBinder) obj) == null) {
                        c4492mh = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c4492mh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4712oh ? (com.google.android.gms.internal.ads.InterfaceC4712oh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4492mh(iBinder);
                    }
                    if (c4492mh != null) {
                        this.f37200b.add(new com.google.android.gms.internal.ads.C4822ph(c4492mh));
                    }
                }
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
        try {
            java.util.List listV = this.f37199a.v();
            if (listV != null) {
                for (java.lang.Object obj2 : listV) {
                    p184s3.D0 d0O6 = obj2 instanceof android.os.IBinder ? p184s3.C0.o6((android.os.IBinder) obj2) : null;
                    if (d0O6 != null) {
                        this.f37203e.add(new p184s3.E0(d0O6));
                    }
                }
            }
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("", e10);
        }
        try {
            com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohK = this.f37199a.k();
            if (interfaceC4712ohK != null) {
                c4822ph = new com.google.android.gms.internal.ads.C4822ph(interfaceC4712ohK);
            }
        } catch (android.os.RemoteException e11) {
            p224w3.p.e("", e11);
        }
        this.f37201c = c4822ph;
        try {
            if (this.f37199a.h() != null) {
                new com.google.android.gms.internal.ads.C4053ih(this.f37199a.h());
            }
        } catch (android.os.RemoteException e12) {
            p224w3.p.e("", e12);
        }
    }

    @Override // p134n3.g
    public final p104k3.w a() {
        try {
            if (this.f37199a.g() != null) {
                this.f37202d.c(this.f37199a.g());
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Exception occurred while getting video controller", e6);
        }
        return this.f37202d;
    }

    @Override // p134n3.g
    public final p134n3.d b() {
        return this.f37201c;
    }

    @Override // p134n3.g
    public final java.lang.Double c() {
        try {
            double d6 = this.f37199a.d();
            if (d6 == -1.0d) {
                return null;
            }
            return java.lang.Double.valueOf(d6);
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.Object d() {
        try {
            X3.a aVarL = this.f37199a.l();
            if (aVarL != null) {
                return X3.b.L0(aVarL);
            }
            return null;
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.String e() {
        try {
            return this.f37199a.n();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.String f() {
        try {
            return this.f37199a.p();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.String g() {
        try {
            return this.f37199a.q();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.String h() {
        try {
            return this.f37199a.s();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.String i() {
        try {
            return this.f37199a.u();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.lang.String j() {
        try {
            return this.f37199a.w();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // p134n3.g
    public final java.util.List k() {
        return this.f37200b;
    }
}
