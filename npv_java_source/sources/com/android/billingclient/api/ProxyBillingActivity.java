package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.apps.common.proguard.UsedByReflection("Á")
public class ProxyBillingActivity extends android.app.Activity {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.os.ResultReceiver f24515C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.os.ResultReceiver f24516D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f24517E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f24518F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f24519G;

    private android.content.Intent a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private android.content.Intent b() {
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i6, int i10, android.content.Intent intent) {
        android.content.Intent intentB;
        super.onActivityResult(i6, i10, intent);
        if (i6 == 100 || i6 == 110) {
            int iB = com.google.android.gms.internal.play_billing.AbstractC6195c1.e(intent, "ProxyBillingActivity").b();
            if (i10 != -1) {
                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + iB);
            } else if (iB != 0) {
                i10 = -1;
                com.google.android.gms.internal.play_billing.AbstractC6195c1.j("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + iB);
            } else {
                iB = 0;
            }
            android.os.ResultReceiver resultReceiver = this.f24515C;
            if (resultReceiver != null) {
                resultReceiver.send(iB, intent != null ? intent.getExtras() : null);
            } else {
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        java.lang.String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            intentB = a(string);
                        } else {
                            intentB = b();
                            intentB.putExtras(intent.getExtras());
                        }
                    } else {
                        intentB = b();
                        com.google.android.gms.internal.play_billing.AbstractC6195c1.j("ProxyBillingActivity", "Got null bundle!");
                        intentB.putExtra("RESPONSE_CODE", 6);
                        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        com.android.billingclient.api.C2135d.a aVarC = com.android.billingclient.api.C2135d.c();
                        aVarC.c(6);
                        aVarC.b("An internal error occurred.");
                        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", com.android.billingclient.api.x.b(22, 2, aVarC.a()).d());
                    }
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentB = b();
                }
                if (i6 == 110) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
        } else if (i6 == 101) {
            int iA = com.google.android.gms.internal.play_billing.AbstractC6195c1.a(intent, "ProxyBillingActivity");
            android.os.ResultReceiver resultReceiver2 = this.f24516D;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iA, intent != null ? intent.getExtras() : null);
            }
        } else {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.j("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i6 + "; skipping...");
        }
        this.f24517E = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent;
        int i6;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.i("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f24517E = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f24515C = (android.os.ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f24516D = (android.os.ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f24518F = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f24519G = bundle.getInt("activity_code", 100);
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC6195c1.i("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f24519G = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f24518F = true;
                i6 = 110;
                this.f24519G = i6;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f24515C = (android.os.ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f24516D = (android.os.ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i6 = 101;
            this.f24519G = i6;
        } else {
            pendingIntent = null;
        }
        try {
            this.f24517E = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f24519G, new android.content.Intent(), 0, 0, 0);
        } catch (android.content.IntentSender.SendIntentException e6) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e6);
            android.os.ResultReceiver resultReceiver = this.f24515C;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                android.os.ResultReceiver resultReceiver2 = this.f24516D;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    android.content.Intent intentB = b();
                    if (this.f24518F) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f24517E = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f24517E) {
            android.content.Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i6 = this.f24519G;
            if (i6 == 110 || i6 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.os.ResultReceiver resultReceiver = this.f24515C;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        android.os.ResultReceiver resultReceiver2 = this.f24516D;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f24517E);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f24518F);
        bundle.putInt("activity_code", this.f24519G);
    }
}
