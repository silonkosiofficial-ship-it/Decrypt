package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2897Ue0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f32246a = 67108864;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.content.ClipData f32247b = android.content.ClipData.newIntent("", new android.content.Intent());

    public static android.app.PendingIntent a(android.content.Context context, int i6, android.content.Intent intent, int i10) {
        return android.app.PendingIntent.getActivity(context, 0, c(intent, 201326592, 0), 201326592);
    }

    public static android.app.PendingIntent b(android.content.Context context, int i6, android.content.Intent intent, int i10, int i11) {
        return android.app.PendingIntent.getService(context, 0, c(intent, i10, 0), i10);
    }

    private static android.content.Intent c(android.content.Intent intent, int i6, int i10) {
        boolean zD;
        java.lang.String str;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f((i6 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f((i6 & 1) == 0 || d(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f((i6 & 2) == 0 || d(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f((i6 & 4) == 0 || d(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f((i6 & 128) == 0 || d(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f(intent.getComponent() != null, "Must set component on Intent.");
        if (d(0, 1)) {
            zD = !d(i6, 67108864);
            str = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.";
        } else {
            zD = d(i6, 67108864);
            str = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.";
        }
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f(zD, str);
        android.content.Intent intent2 = new android.content.Intent(intent);
        if (!d(i6, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(android.net.Uri.EMPTY, "*/*");
            }
            if (!d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f32247b);
            }
        }
        return intent2;
    }

    private static boolean d(int i6, int i10) {
        return (i6 & i10) == i10;
    }
}
