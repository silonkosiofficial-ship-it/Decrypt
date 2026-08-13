package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40448a;

    static {
        f40448a = android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static android.app.PendingIntent a(android.content.Context context, int i6, android.content.Intent intent, int i10) {
        return android.app.PendingIntent.getBroadcast(context, 0, intent, i10);
    }
}
