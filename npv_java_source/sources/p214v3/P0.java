package p214v3;

/* JADX INFO: loaded from: classes.dex */
public class P0 extends p214v3.H0 {
    @Override // p214v3.AbstractC7234b
    public final android.content.Intent e(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // p214v3.AbstractC7234b
    public final com.google.android.gms.internal.ads.EnumC2932Ve f(android.content.Context context, android.telephony.TelephonyManager telephonyManager) {
        p174r3.v.t();
        if (p214v3.E0.b(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) {
            return com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_TRUE;
        }
        return com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_FALSE;
    }

    @Override // p214v3.AbstractC7234b
    public final void g(android.content.Context context, java.lang.String str, java.lang.String str2) {
        p214v3.O0.a();
        android.app.NotificationChannel notificationChannelA = p214v3.N0.a("offline_notification_channel", "AdMob Offline Notifications", ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25689s8)).intValue());
        notificationChannelA.setShowBadge(false);
        ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).createNotificationChannel(notificationChannelA);
    }

    @Override // p214v3.AbstractC7234b
    public final boolean h(android.content.Context context, java.lang.String str) {
        android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
