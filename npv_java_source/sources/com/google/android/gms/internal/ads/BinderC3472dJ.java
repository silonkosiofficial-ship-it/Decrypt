package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3472dJ extends p184s3.X0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f34690C = new java.lang.Object();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p184s3.Y0 f34691D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4282km f34692E;

    public BinderC3472dJ(p184s3.Y0 y6, com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km) {
        this.f34691D = y6;
        this.f34692E = interfaceC4282km;
    }

    @Override // p184s3.Y0
    public final void b4(p184s3.InterfaceC7081b1 interfaceC7081b1) {
        synchronized (this.f34690C) {
            try {
                p184s3.Y0 y6 = this.f34691D;
                if (y6 != null) {
                    y6.b4(interfaceC7081b1);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p184s3.Y0
    public final float d() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final float e() {
        com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km = this.f34692E;
        if (interfaceC4282km != null) {
            return interfaceC4282km.i();
        }
        return 0.0f;
    }

    @Override // p184s3.Y0
    public final int g() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final p184s3.InterfaceC7081b1 h() {
        synchronized (this.f34690C) {
            try {
                p184s3.Y0 y6 = this.f34691D;
                if (y6 == null) {
                    return null;
                }
                return y6.h();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p184s3.Y0
    public final float i() {
        com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km = this.f34692E;
        if (interfaceC4282km != null) {
            return interfaceC4282km.g();
        }
        return 0.0f;
    }

    @Override // p184s3.Y0
    public final void k() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final void l() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final void l0(boolean z6) throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final void n() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final boolean p() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final boolean q() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // p184s3.Y0
    public final boolean s() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }
}
