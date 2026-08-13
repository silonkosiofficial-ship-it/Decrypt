package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class N60 implements E3.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p184s3.InterfaceC7077a0 f30178C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.O60 f30179D;

    N60(com.google.android.gms.internal.ads.O60 o60, p184s3.InterfaceC7077a0 interfaceC7077a0) {
        this.f30178C = interfaceC7077a0;
        this.f30179D = o60;
    }

    @Override // E3.a
    public final void k() {
        if (this.f30179D.f30450F != null) {
            try {
                this.f30178C.d();
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
    }
}
