package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2175An extends com.google.android.gms.ads.nativead.NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4274ki f25787a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5933zn f25789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.ads.nativead.NativeAd.a f25790d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f25788b = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f25791e = new java.util.ArrayList();

    public C2175An(com.google.android.gms.internal.ads.InterfaceC4274ki interfaceC4274ki) {
        com.google.android.gms.internal.ads.C5933zn c5933zn;
        this.f25787a = interfaceC4274ki;
        com.google.android.gms.internal.ads.C5823yn c5823yn = null;
        try {
            java.util.List listA = interfaceC4274ki.A();
            if (listA != null) {
                for (java.lang.Object obj : listA) {
                    com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohO6 = obj instanceof android.os.IBinder ? com.google.android.gms.internal.ads.AbstractBinderC4602nh.o6((android.os.IBinder) obj) : null;
                    if (interfaceC4712ohO6 != null) {
                        this.f25788b.add(new com.google.android.gms.internal.ads.C5933zn(interfaceC4712ohO6));
                    }
                }
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
        try {
            java.util.List listV = this.f25787a.v();
            if (listV != null) {
                for (java.lang.Object obj2 : listV) {
                    p184s3.D0 d0O6 = obj2 instanceof android.os.IBinder ? p184s3.C0.o6((android.os.IBinder) obj2) : null;
                    if (d0O6 != null) {
                        this.f25791e.add(new p184s3.E0(d0O6));
                    }
                }
            }
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("", e10);
        }
        try {
            com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohK = this.f25787a.k();
            c5933zn = interfaceC4712ohK != null ? new com.google.android.gms.internal.ads.C5933zn(interfaceC4712ohK) : null;
        } catch (android.os.RemoteException e11) {
            p224w3.p.e("", e11);
        }
        this.f25789c = c5933zn;
        try {
            if (this.f25787a.h() != null) {
                c5823yn = new com.google.android.gms.internal.ads.C5823yn(this.f25787a.h());
            }
        } catch (android.os.RemoteException e12) {
            p224w3.p.e("", e12);
        }
        this.f25790d = c5823yn;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String a() {
        try {
            return this.f25787a.p();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String b() {
        try {
            return this.f25787a.s();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final p104k3.u c() {
        p184s3.U0 u0I;
        try {
            u0I = this.f25787a.i();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            u0I = null;
        }
        return p104k3.u.d(u0I);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ java.lang.Object d() {
        try {
            return this.f25787a.m();
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(android.os.Bundle bundle) {
        try {
            this.f25787a.P2(bundle);
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Failed to record native event", e6);
        }
    }
}
