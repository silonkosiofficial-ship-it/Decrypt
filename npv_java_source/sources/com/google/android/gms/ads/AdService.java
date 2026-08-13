package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends android.app.IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent intent) {
        try {
            p184s3.C7147y.a().j(this, new com.google.android.gms.internal.ads.BinderC2801Rl()).M0(intent);
        } catch (android.os.RemoteException e6) {
            p224w3.p.d("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }
}
