package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class EZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f27076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f27077b;

    public EZ(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f27076a = yk0;
        this.f27077b = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f27076a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.DZ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f26722a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.FZ c() {
        int i6;
        int streamMaxVolume;
        android.media.AudioManager audioManager = (android.media.AudioManager) this.f27077b.getSystemService("audio");
        float fA = p174r3.v.v().a();
        boolean zE = p174r3.v.v().e();
        if (audioManager == null) {
            return new com.google.android.gms.internal.ads.FZ(-1, false, false, -1, -1, -1, -1, -1, fA, zE, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ra)).booleanValue()) {
            int i10 = p174r3.v.u().i(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i6 = i10;
        } else {
            i6 = -1;
            streamMaxVolume = -1;
        }
        return new com.google.android.gms.internal.ads.FZ(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i6, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fA, zE, false);
    }
}
