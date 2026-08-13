package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4750p {
    public static void a(android.view.Surface surface, float f6) {
        try {
            surface.setFrameRate(f6, f6 == 0.0f ? 0 : 1);
        } catch (java.lang.IllegalStateException e6) {
            com.google.android.gms.internal.ads.AbstractC3586eM.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
        }
    }
}
