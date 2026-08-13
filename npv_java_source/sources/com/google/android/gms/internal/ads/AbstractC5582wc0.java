package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5582wc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f39654a = 2;

    public static void a(android.content.Context context) {
        context.registerReceiver(new com.google.android.gms.internal.ads.C5472vc0(), new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (com.google.android.gms.internal.ads.AbstractC5142sc0.a() != com.google.android.gms.internal.ads.EnumC2413Hb0.CTV) {
            return 2;
        }
        return f39654a;
    }
}
