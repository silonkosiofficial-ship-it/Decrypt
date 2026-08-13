package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepName
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected int f24841C = 0;

    public static android.content.Intent a(android.content.Context context, android.app.PendingIntent pendingIntent, int i6, boolean z6) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i6);
        intent.putExtra("notify_manager", z6);
        return intent;
    }

    private final void b() {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
        java.lang.Integer num = (java.lang.Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            N3.C1394g.m().n(this, ((java.lang.Integer) Q3.AbstractC1477p.l(num)).intValue(), 2, this);
            this.f24841C = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f24841C = 1;
        } catch (android.content.ActivityNotFoundException e6) {
            if (extras.getBoolean("notify_manager", true)) {
                com.google.android.gms.common.api.internal.C2148c.u(this).D(new N3.C1389b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                java.lang.String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (android.os.Build.FINGERPRINT.contains("generic")) {
                    str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
            }
            this.f24841C = 1;
            finish();
        } catch (android.content.IntentSender.SendIntentException e10) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i6, int i10, android.content.Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f24841C = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.C2148c c2148cU = com.google.android.gms.common.api.internal.C2148c.u(this);
                if (i10 == -1) {
                    c2148cU.E();
                } else if (i10 == 0) {
                    c2148cU.D(new N3.C1389b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i6 == 2) {
            this.f24841C = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f24841C = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f24841C = bundle.getInt("resolution");
        }
        if (this.f24841C != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.f24841C);
        super.onSaveInstanceState(bundle);
    }
}
