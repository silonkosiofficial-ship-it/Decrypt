package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3715fc0 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3825gc0 f35373a;

    C3715fc0(com.google.android.gms.internal.ads.C3825gc0 c3825gc0) {
        this.f35373a = c3825gc0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.internal.ads.C3825gc0 c3825gc0;
        boolean z6;
        boolean z10;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            c3825gc0 = this.f35373a;
            z6 = c3825gc0.f35641c;
            z10 = true;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            c3825gc0 = this.f35373a;
            z6 = c3825gc0.f35641c;
            z10 = false;
        }
        c3825gc0.d(z10, z6);
        this.f35373a.f35640b = z10;
    }
}
