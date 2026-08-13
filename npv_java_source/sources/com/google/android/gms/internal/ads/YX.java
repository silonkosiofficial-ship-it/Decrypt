package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class YX implements p184s3.InterfaceC7076a, com.google.android.gms.internal.ads.MG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p184s3.E f33369C;

    @Override // com.google.android.gms.internal.ads.MG
    public final synchronized void A() {
    }

    public final synchronized void a(p184s3.E e6) {
        this.f33369C = e6;
    }

    @Override // p184s3.InterfaceC7076a
    public final synchronized void e0() {
        p184s3.E e6 = this.f33369C;
        if (e6 != null) {
            try {
                e6.b();
            } catch (android.os.RemoteException e10) {
                p224w3.p.h("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final synchronized void p0() {
        p184s3.E e6 = this.f33369C;
        if (e6 != null) {
            try {
                e6.b();
            } catch (android.os.RemoteException e10) {
                p224w3.p.h("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }
}
