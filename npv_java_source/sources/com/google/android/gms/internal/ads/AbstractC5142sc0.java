package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5142sc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.app.UiModeManager f38778a;

    public static com.google.android.gms.internal.ads.EnumC2413Hb0 a() {
        android.app.UiModeManager uiModeManager = f38778a;
        if (uiModeManager == null) {
            return com.google.android.gms.internal.ads.EnumC2413Hb0.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? com.google.android.gms.internal.ads.EnumC2413Hb0.OTHER : com.google.android.gms.internal.ads.EnumC2413Hb0.CTV;
        }
        return com.google.android.gms.internal.ads.EnumC2413Hb0.MOBILE;
    }

    public static void b(android.content.Context context) {
        if (context != null) {
            f38778a = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }
}
