package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC2142k implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f24610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ T2.d f24611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.android.billingclient.api.C2133b f24612c;

    CallableC2142k(com.android.billingclient.api.C2133b c2133b, java.lang.String str, T2.d dVar) {
        this.f24610a = str;
        this.f24611b = dVar;
        this.f24612c = c2133b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        T2.w wVarS = this.f24612c.S(this.f24610a, 9);
        if (wVarS.b() != null) {
            this.f24611b.a(wVarS.a(), wVarS.b());
            return null;
        }
        this.f24611b.a(wVarS.a(), com.google.android.gms.internal.play_billing.AbstractC6206e0.E());
        return null;
    }
}
