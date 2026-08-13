package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4182jr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.media.AudioAttributes f36750a;

    /* synthetic */ C4182jr(com.google.android.gms.internal.ads.C5459vS c5459vS, com.google.android.gms.internal.ads.PE pe) {
        android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i6 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f36750a = usage.build();
    }
}
