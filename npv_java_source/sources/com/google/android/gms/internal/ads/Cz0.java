package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Cz0 implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f26545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Ez0 f26546b;

    public Cz0(com.google.android.gms.internal.ads.Ez0 ez0, android.os.Handler handler) {
        this.f26546b = ez0;
        this.f26545a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i6) {
        this.f26545a.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Bz0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.Ez0.c(this.f26105C.f26546b, i6);
            }
        });
    }
}
