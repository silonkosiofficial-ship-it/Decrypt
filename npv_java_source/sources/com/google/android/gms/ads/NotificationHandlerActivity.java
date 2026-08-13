package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends android.app.Activity {
    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323EnJ = p184s3.C7147y.a().j(this, new com.google.android.gms.internal.ads.BinderC2801Rl());
            if (interfaceC2323EnJ == null) {
                p224w3.p.d("OfflineUtils is null");
            } else {
                interfaceC2323EnJ.M0(getIntent());
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.d("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
