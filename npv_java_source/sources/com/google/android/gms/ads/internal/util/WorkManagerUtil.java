package com.google.android.gms.ads.internal.util;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends p214v3.T {
    @com.google.android.apps.common.proguard.UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void o6(android.content.Context context) {
        try {
            I2.t.e(context.getApplicationContext(), new androidx.work.a.b().a());
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // p214v3.U
    public final void zze(X3.a aVar) {
        android.content.Context context = (android.content.Context) X3.b.L0(aVar);
        o6(context);
        try {
            I2.t tVarD = I2.t.d(context);
            tVarD.a("offline_ping_sender_work");
            tVarD.b((I2.l) ((I2.l.a) ((I2.l.a) new I2.l.a(com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender.class).e(new I2.b.a().b(I2.k.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (java.lang.IllegalStateException e6) {
            p224w3.p.h("Failed to instantiate WorkManager.", e6);
        }
    }

    @Override // p214v3.U
    public final boolean zzf(X3.a aVar, java.lang.String str, java.lang.String str2) {
        return zzg(aVar, new p194t3.a(str, str2, ""));
    }

    @Override // p214v3.U
    public final boolean zzg(X3.a aVar, p194t3.a aVar2) throws java.lang.Throwable {
        android.content.Context context = (android.content.Context) X3.b.L0(aVar);
        o6(context);
        I2.b bVarA = new I2.b.a().b(I2.k.CONNECTED).a();
        try {
            I2.t.d(context).b((I2.l) ((I2.l.a) ((I2.l.a) ((I2.l.a) new I2.l.a(com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster.class).e(bVarA)).f(new androidx.work.b.a().e("uri", aVar2.f54617C).e("gws_query_id", aVar2.f54618D).e("image_url", aVar2.f54619E).a())).a("offline_notification_work")).b());
            return true;
        } catch (java.lang.IllegalStateException e6) {
            p224w3.p.h("Failed to instantiate WorkManager.", e6);
            return false;
        }
    }
}
