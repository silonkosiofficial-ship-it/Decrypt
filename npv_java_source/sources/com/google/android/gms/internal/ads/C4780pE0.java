package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4780pE0 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4999rE0 f37952a;

    /* synthetic */ C4780pE0(com.google.android.gms.internal.ads.C4999rE0 c4999rE0, com.google.android.gms.internal.ads.AbstractC4890qE0 abstractC4890qE0) {
        this.f37952a = c4999rE0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f37952a;
        c4999rE0.j(com.google.android.gms.internal.ads.C4450mE0.d(context, intent, c4999rE0.f38468h, c4999rE0.f38467g));
    }
}
