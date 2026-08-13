package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.apps.common.proguard.UsedByReflection("\u09e5")
public class ProxyBillingActivityV2 extends p040e.j {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private p070h.c f24520Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private p070h.c f24521Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private android.os.ResultReceiver f24522a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private android.os.ResultReceiver f24523b0;

    final void Z(p070h.a aVar) {
        android.content.Intent intentA = aVar.a();
        int iB = com.google.android.gms.internal.play_billing.AbstractC6195c1.e(intentA, "ProxyBillingActivityV2").b();
        android.os.ResultReceiver resultReceiver = this.f24522a0;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    final void a0(p070h.a aVar) {
        android.content.Intent intentA = aVar.a();
        int iB = com.google.android.gms.internal.play_billing.AbstractC6195c1.e(intentA, "ProxyBillingActivityV2").b();
        android.os.ResultReceiver resultReceiver = this.f24523b0;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("ProxyBillingActivityV2", java.lang.String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", java.lang.Integer.valueOf(aVar.b()), java.lang.Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // p040e.j, androidx.core.app.f, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f24520Y = X(new p080i.e(), new p070h.b() { // from class: com.android.billingclient.api.C
            @Override // p070h.b
            public final void a(java.lang.Object obj) {
                this.f24485a.Z((p070h.a) obj);
            }
        });
        this.f24521Z = X(new p080i.e(), new p070h.b() { // from class: com.android.billingclient.api.D
            @Override // p070h.b
            public final void a(java.lang.Object obj) {
                this.f24486a.a0((p070h.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f24522a0 = (android.os.ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f24523b0 = (android.os.ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f24522a0 = (android.os.ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f24520Y.a(new h.g.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f24523b0 = (android.os.ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f24521Z.a(new h.g.a(pendingIntent2).a());
        }
    }

    @Override // p040e.j, androidx.core.app.f, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.os.ResultReceiver resultReceiver = this.f24522a0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        android.os.ResultReceiver resultReceiver2 = this.f24523b0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
