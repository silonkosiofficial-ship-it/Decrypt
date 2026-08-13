package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f24495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T2.e f24496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.android.billingclient.api.y f24497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.android.billingclient.api.H f24498d = new com.android.billingclient.api.H(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.android.billingclient.api.H f24499e = new com.android.billingclient.api.H(this, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24500f;

    I(android.content.Context context, T2.e eVar, T2.u uVar, T2.k kVar, T2.h hVar, com.android.billingclient.api.y yVar) {
        this.f24495a = context;
        this.f24496b = eVar;
        this.f24497c = yVar;
    }

    static /* bridge */ /* synthetic */ T2.k a(com.android.billingclient.api.I i6) {
        i6.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ T2.h e(com.android.billingclient.api.I i6) {
        i6.getClass();
        return null;
    }

    final T2.e d() {
        return this.f24496b;
    }

    final void f() {
        this.f24498d.c(this.f24495a);
        this.f24499e.c(this.f24495a);
    }

    final void g(boolean z6) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f24500f = z6;
        this.f24499e.a(this.f24495a, intentFilter2);
        if (this.f24500f) {
            this.f24498d.b(this.f24495a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f24498d.a(this.f24495a, intentFilter);
        }
    }
}
