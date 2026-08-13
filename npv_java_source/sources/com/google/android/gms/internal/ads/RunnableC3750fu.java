package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3750fu implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2698Ot f35472C;

    public /* synthetic */ RunnableC3750fu(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f35472C = interfaceC2698Ot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35472C.destroy();
    }
}
