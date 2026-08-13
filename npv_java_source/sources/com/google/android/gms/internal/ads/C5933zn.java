package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5933zn extends com.google.android.gms.ads.nativead.NativeAd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4712oh f40387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.drawable.Drawable f40388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.net.Uri f40389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f40390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40392f;

    public C5933zn(com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712oh) {
        android.graphics.drawable.Drawable drawable;
        double dB;
        int iF;
        this.f40387a = interfaceC4712oh;
        android.net.Uri uriD = null;
        try {
            X3.a aVarE = interfaceC4712oh.e();
            drawable = aVarE != null ? (android.graphics.drawable.Drawable) X3.b.L0(aVarE) : null;
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
        this.f40388b = drawable;
        try {
            uriD = this.f40387a.d();
        } catch (android.os.RemoteException e10) {
            p224w3.p.e("", e10);
        }
        this.f40389c = uriD;
        try {
            dB = this.f40387a.b();
        } catch (android.os.RemoteException e11) {
            p224w3.p.e("", e11);
            dB = 1.0d;
        }
        this.f40390d = dB;
        int iC = -1;
        try {
            iF = this.f40387a.f();
        } catch (android.os.RemoteException e12) {
            p224w3.p.e("", e12);
            iF = -1;
        }
        this.f40391e = iF;
        try {
            iC = this.f40387a.c();
        } catch (android.os.RemoteException e13) {
            p224w3.p.e("", e13);
        }
        this.f40392f = iC;
    }
}
