package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
final class H extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.android.billingclient.api.I f24494c;

    H(com.android.billingclient.api.I i6, boolean z6) {
        this.f24494c = i6;
        this.f24493b = z6;
    }

    private final void d(android.os.Bundle bundle, com.android.billingclient.api.C2135d c2135d, int i6) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f24494c.f24497c.d(com.google.android.gms.internal.play_billing.N3.B(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.A2.a()));
            } else {
                this.f24494c.f24497c.d(com.android.billingclient.api.x.b(23, i6, c2135d));
            }
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(android.content.Context context, android.content.IntentFilter intentFilter) {
        try {
            if (this.f24492a) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f24493b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f24492a = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(android.content.Context context, android.content.IntentFilter intentFilter, java.lang.String str) {
        try {
            if (this.f24492a) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f24493b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
            this.f24492a = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(android.content.Context context) {
        if (!this.f24492a) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f24492a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingBroadcastManager", "Bundle is null.");
            com.android.billingclient.api.y yVar = this.f24494c.f24497c;
            com.android.billingclient.api.C2135d c2135d = com.android.billingclient.api.z.f24658k;
            yVar.d(com.android.billingclient.api.x.b(11, 1, c2135d));
            com.android.billingclient.api.I i6 = this.f24494c;
            if (i6.f24496b != null) {
                i6.f24496b.a(c2135d, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.C2135d c2135dE = com.google.android.gms.internal.play_billing.AbstractC6195c1.e(intent, "BillingBroadcastManager");
        java.lang.String action = intent.getAction();
        int i10 = true == j$.util.Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            java.util.List listH = com.google.android.gms.internal.play_billing.AbstractC6195c1.h(extras);
            if (c2135dE.b() == 0) {
                this.f24494c.f24497c.g(com.android.billingclient.api.x.d(i10));
            } else {
                d(extras, c2135dE, i10);
            }
            this.f24494c.f24496b.a(c2135dE, listH);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c2135dE.b() != 0) {
                d(extras, c2135dE, i10);
                this.f24494c.f24496b.a(c2135dE, com.google.android.gms.internal.play_billing.AbstractC6206e0.E());
                return;
            }
            com.android.billingclient.api.I i11 = this.f24494c;
            com.android.billingclient.api.I.a(i11);
            com.android.billingclient.api.I.e(i11);
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            com.android.billingclient.api.y yVar2 = this.f24494c.f24497c;
            com.android.billingclient.api.C2135d c2135d2 = com.android.billingclient.api.z.f24658k;
            yVar2.d(com.android.billingclient.api.x.b(77, i10, c2135d2));
            this.f24494c.f24496b.a(c2135d2, com.google.android.gms.internal.play_billing.AbstractC6206e0.E());
        }
    }
}
