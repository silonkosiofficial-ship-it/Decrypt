package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5130sT extends java.util.TimerTask {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.app.AlertDialog f38744C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.util.Timer f38745D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ p204u3.x f38746E;

    C5130sT(com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, android.app.AlertDialog alertDialog, java.util.Timer timer, p204u3.x xVar) {
        this.f38744C = alertDialog;
        this.f38745D = timer;
        this.f38746E = xVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f38744C.dismiss();
        this.f38745D.cancel();
        p204u3.x xVar = this.f38746E;
        if (xVar != null) {
            xVar.b();
        }
    }
}
