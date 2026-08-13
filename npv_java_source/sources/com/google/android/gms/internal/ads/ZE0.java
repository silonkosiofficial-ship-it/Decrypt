package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f33531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Boolean f33532b;

    public ZE0(android.content.Context context) {
        this.f33531a = context;
    }

    public final com.google.android.gms.internal.ads.C5439vE0 a(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.C5459vS c5459vS) {
        java.lang.Boolean boolValueOf;
        boolean zBooleanValue;
        android.media.AudioManager audioManager;
        d6.getClass();
        c5459vS.getClass();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 < 29 || d6.f26552E == -1) {
            return com.google.android.gms.internal.ads.C5439vE0.f39363d;
        }
        android.content.Context context = this.f33531a;
        java.lang.Boolean bool = this.f33532b;
        boolean z6 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (android.media.AudioManager) context.getSystemService("audio")) == null) {
                boolValueOf = java.lang.Boolean.FALSE;
            } else {
                java.lang.String parameters = audioManager.getParameters("offloadVariableRateSupported");
                boolValueOf = java.lang.Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            this.f33532b = boolValueOf;
            zBooleanValue = this.f33532b.booleanValue();
        }
        java.lang.String str = d6.f26574o;
        str.getClass();
        int iA = com.google.android.gms.internal.ads.AbstractC3606ed.a(str, d6.f26570k);
        if (iA == 0 || i6 < com.google.android.gms.internal.ads.EW.z(iA)) {
            return com.google.android.gms.internal.ads.C5439vE0.f39363d;
        }
        int iA2 = com.google.android.gms.internal.ads.EW.A(d6.f26551D);
        if (iA2 == 0) {
            return com.google.android.gms.internal.ads.C5439vE0.f39363d;
        }
        try {
            android.media.AudioFormat audioFormatP = com.google.android.gms.internal.ads.EW.P(d6.f26552E, iA2, iA);
            android.media.AudioAttributes audioAttributes = c5459vS.a().f36750a;
            if (i6 >= 31) {
                int playbackOffloadSupport = android.media.AudioManager.getPlaybackOffloadSupport(audioFormatP, audioAttributes);
                if (playbackOffloadSupport != 0) {
                    com.google.android.gms.internal.ads.C5219tE0 c5219tE0 = new com.google.android.gms.internal.ads.C5219tE0();
                    if (i6 > 32 && playbackOffloadSupport == 2) {
                        z6 = true;
                    }
                    c5219tE0.a(true);
                    c5219tE0.b(z6);
                    c5219tE0.c(zBooleanValue);
                    return c5219tE0.d();
                }
            } else if (android.media.AudioManager.isOffloadedPlaybackSupported(audioFormatP, audioAttributes)) {
                com.google.android.gms.internal.ads.C5219tE0 c5219tE1 = new com.google.android.gms.internal.ads.C5219tE0();
                c5219tE1.a(true);
                c5219tE1.c(zBooleanValue);
                return c5219tE1.d();
            }
            return com.google.android.gms.internal.ads.C5439vE0.f39363d;
        } catch (java.lang.IllegalArgumentException unused) {
            return com.google.android.gms.internal.ads.C5439vE0.f39363d;
        }
    }
}
