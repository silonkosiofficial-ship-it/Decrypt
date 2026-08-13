package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class v implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.android.billingclient.api.w f24634a;

    /* synthetic */ v(com.android.billingclient.api.w wVar, T2.o oVar) {
        this.f24634a = wVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("BillingClientTesting", "Billing Override Service connected.");
        this.f24634a.f24637I = com.google.android.gms.internal.play_billing.AbstractBinderC6229i.y0(iBinder);
        this.f24634a.f24636H = 2;
        this.f24634a.T0(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingClientTesting", "Billing Override Service disconnected.");
        this.f24634a.f24637I = null;
        this.f24634a.f24636H = 0;
    }
}
