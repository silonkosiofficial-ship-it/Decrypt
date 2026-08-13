package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2524Kb0 extends java.util.TimerTask {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.Timer f28975C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2634Nb0 f28976D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4078iu f28977E;

    C2524Kb0(com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0, com.google.android.gms.internal.ads.C4078iu c4078iu, java.util.Timer timer) {
        this.f28977E = c4078iu;
        this.f28975C = timer;
        this.f28976D = c2634Nb0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f28976D.h();
        this.f28977E.a(true);
        this.f28975C.cancel();
    }
}
