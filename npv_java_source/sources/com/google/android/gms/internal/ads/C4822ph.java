package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4822ph extends p134n3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4712oh f38046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.drawable.Drawable f38047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.net.Uri f38048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f38049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f38051f;

    public C4822ph(com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712oh) {
        android.graphics.drawable.Drawable drawable;
        double dB;
        int iF;
        this.f38046a = interfaceC4712oh;
        android.net.Uri uriD = null;
        try {
            X3.a aVarE = interfaceC4712oh.e();
            drawable = aVarE != null ? (android.graphics.drawable.Drawable) X3.b.L0(aVarE) : null;
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
        this.f38047b = drawable;
        try {
            uriD = this.f38046a.d();
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("", e10);
        }
        this.f38048c = uriD;
        try {
            dB = this.f38046a.b();
        } catch (android.os.RemoteException e11) {
            p224w3.p.e("", e11);
            dB = 1.0d;
        }
        this.f38049d = dB;
        int iC = -1;
        try {
            iF = this.f38046a.f();
        } catch (android.os.RemoteException e12) {
            p224w3.p.e("", e12);
            iF = -1;
        }
        this.f38050e = iF;
        try {
            iC = this.f38046a.c();
        } catch (android.os.RemoteException e13) {
            p224w3.p.e("", e13);
        }
        this.f38051f = iC;
    }

    @Override // p134n3.d
    public final android.graphics.drawable.Drawable a() {
        return this.f38047b;
    }

    @Override // p134n3.d
    public final double b() {
        return this.f38049d;
    }

    @Override // p134n3.d
    public final android.net.Uri c() {
        return this.f38048c;
    }

    @Override // p134n3.d
    public final int d() {
        return this.f38051f;
    }

    @Override // p134n3.d
    public final int e() {
        return this.f38050e;
    }
}
