package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class HG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.Boolean f28001a;

    public static int a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i6, int i10, double d6) {
        if (com.google.android.gms.internal.ads.EW.f27061a < 29) {
            return 0;
        }
        java.lang.Boolean bool = f28001a;
        if (bool == null || !bool.booleanValue()) {
            return com.google.android.gms.internal.ads.GG0.a(videoCapabilities, i6, i10, d6);
        }
        return 0;
    }
}
