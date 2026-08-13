package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class t implements com.google.android.gms.internal.play_billing.InterfaceC6255m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.function.Consumer f24629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ java.lang.Runnable f24630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.android.billingclient.api.w f24631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f24632d;

    t(com.android.billingclient.api.w wVar, int i6, java.util.function.Consumer consumer, java.lang.Runnable runnable) {
        this.f24632d = i6;
        this.f24629a = consumer;
        this.f24630b = runnable;
        this.f24631c = wVar;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6255m1
    public final void a(java.lang.Throwable th) {
        java.lang.String str;
        if (th instanceof java.util.concurrent.TimeoutException) {
            this.f24631c.S0(114, 28, com.android.billingclient.api.z.f24647G);
            str = "Asynchronous call to Billing Override Service timed out.";
        } else {
            this.f24631c.S0(107, 28, com.android.billingclient.api.z.f24647G);
            str = "An error occurred while retrieving billing override.";
        }
        com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingClientTesting", str, th);
        this.f24630b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6255m1
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int iIntValue = num.intValue();
        com.android.billingclient.api.w wVar = this.f24631c;
        if (!com.android.billingclient.api.w.P0(iIntValue)) {
            this.f24630b.run();
        } else {
            this.f24629a.accept(wVar.Q0(this.f24632d, num.intValue()));
        }
    }
}
