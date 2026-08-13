package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5779yJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.Spatializer f40034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Handler f40036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.media.Spatializer$OnSpatializerStateChangedListener f40037d;

    private C5779yJ0(android.media.Spatializer spatializer) {
        this.f40034a = spatializer;
        this.f40035b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static com.google.android.gms.internal.ads.C5779yJ0 a(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.C5779yJ0(audioManager.getSpatializer());
    }

    public final void b(com.google.android.gms.internal.ads.GJ0 gj0, android.os.Looper looper) {
        if (this.f40037d == null && this.f40036c == null) {
            this.f40037d = new com.google.android.gms.internal.ads.C4900qJ0(this, gj0);
            final android.os.Handler handler = new android.os.Handler(looper);
            this.f40036c = handler;
            android.media.Spatializer spatializer = this.f40034a;
            j$.util.Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.pJ0
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f40037d);
        }
    }

    public final void c() {
        android.media.Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f40037d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f40036c == null) {
            return;
        }
        this.f40034a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        android.os.Handler handler = this.f40036c;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        handler.removeCallbacksAndMessages(null);
        this.f40036c = null;
        this.f40037d = null;
    }

    public final boolean d(com.google.android.gms.internal.ads.C5459vS c5459vS, com.google.android.gms.internal.ads.D d6) {
        int i6;
        if (j$.util.Objects.equals(d6.f26574o, "audio/eac3-joc") && d6.f26551D == 16) {
            i6 = 12;
        } else {
            i6 = (j$.util.Objects.equals(d6.f26574o, "audio/iamf") && d6.f26551D == -1) ? 6 : d6.f26551D;
        }
        int iA = com.google.android.gms.internal.ads.EW.A(i6);
        if (iA == 0) {
            return false;
        }
        android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(iA);
        int i10 = d6.f26552E;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.f40034a.canBeSpatialized(c5459vS.a().f36750a, channelMask.build());
    }

    public final boolean e() {
        return this.f40034a.isAvailable();
    }

    public final boolean f() {
        return this.f40034a.isEnabled();
    }

    public final boolean g() {
        return this.f40035b;
    }
}
