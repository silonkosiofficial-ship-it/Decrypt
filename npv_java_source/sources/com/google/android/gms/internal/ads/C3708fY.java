package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3708fY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4366lY f35356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f35357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p184s3.U0 f35358c;

    public C3708fY(com.google.android.gms.internal.ads.InterfaceC4366lY interfaceC4366lY, java.lang.String str) {
        this.f35356a = interfaceC4366lY;
        this.f35357b = str;
    }

    public final synchronized java.lang.String a() {
        p184s3.U0 u6;
        try {
            u6 = this.f35358c;
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            return null;
        }
        return u6 != null ? u6.i() : null;
    }

    public final synchronized java.lang.String b() {
        p184s3.U0 u6;
        try {
            u6 = this.f35358c;
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            return null;
        }
        return u6 != null ? u6.i() : null;
    }

    public final synchronized void d(p184s3.X1 x6, int i6) {
        this.f35358c = null;
        com.google.android.gms.internal.ads.C4476mY c4476mY = new com.google.android.gms.internal.ads.C4476mY(i6);
        com.google.android.gms.internal.ads.C3598eY c3598eY = new com.google.android.gms.internal.ads.C3598eY(this);
        this.f35356a.b(x6, this.f35357b, c4476mY, c3598eY);
    }

    public final synchronized boolean e() {
        return this.f35356a.a();
    }
}
