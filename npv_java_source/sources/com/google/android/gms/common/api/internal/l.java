package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.m f24924C;

    l(com.google.android.gms.common.api.internal.m mVar) {
        this.f24924C = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.n nVar = this.f24924C.f24925a;
        nVar.f24927D.d(nVar.f24927D.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
