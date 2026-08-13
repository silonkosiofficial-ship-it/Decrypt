package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC4044ic implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.view.View f36318C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4482mc f36319D;

    RunnableC4044ic(com.google.android.gms.internal.ads.C4482mc c4482mc, android.view.View view) {
        this.f36318C = view;
        this.f36319D = c4482mc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36319D.b(this.f36318C);
    }
}
