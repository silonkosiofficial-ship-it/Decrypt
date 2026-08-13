package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class G60 implements E3.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p184s3.K0 f27678C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.I60 f27679D;

    G60(com.google.android.gms.internal.ads.I60 i60, p184s3.K0 k6) {
        this.f27678C = k6;
        this.f27679D = i60;
    }

    @Override // E3.a
    public final void k() {
        if (this.f27679D.f28407K != null) {
            try {
                this.f27678C.d();
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
    }
}
