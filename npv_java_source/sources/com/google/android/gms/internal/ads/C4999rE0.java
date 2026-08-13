package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4999rE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f38461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Handler f38462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4560nE0 f38463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.BroadcastReceiver f38464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4670oE0 f38465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4450mE0 f38466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5109sE0 f38467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5459vS f38468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3465dF0 f38470j;

    /* JADX WARN: Multi-variable type inference failed */
    C4999rE0(android.content.Context context, com.google.android.gms.internal.ads.C3465dF0 c3465dF0, com.google.android.gms.internal.ads.C5459vS c5459vS, com.google.android.gms.internal.ads.C5109sE0 c5109sE0) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f38461a = applicationContext;
        this.f38470j = c3465dF0;
        this.f38468h = c5459vS;
        this.f38467g = c5109sE0;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        android.os.Handler handler = new android.os.Handler(com.google.android.gms.internal.ads.EW.R(), null);
        this.f38462b = handler;
        this.f38463c = com.google.android.gms.internal.ads.EW.f27061a >= 23 ? new com.google.android.gms.internal.ads.C4560nE0(this, objArr2 == true ? 1 : 0) : null;
        this.f38464d = new com.google.android.gms.internal.ads.C4780pE0(this, objArr == true ? 1 : 0);
        android.net.Uri uriA = com.google.android.gms.internal.ads.C4450mE0.a();
        this.f38465e = uriA != null ? new com.google.android.gms.internal.ads.C4670oE0(this, handler, applicationContext.getContentResolver(), uriA) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(com.google.android.gms.internal.ads.C4450mE0 c4450mE0) {
        if (!this.f38469i || c4450mE0.equals(this.f38466f)) {
            return;
        }
        this.f38466f = c4450mE0;
        this.f38470j.f34675a.G(c4450mE0);
    }

    public final com.google.android.gms.internal.ads.C4450mE0 c() {
        com.google.android.gms.internal.ads.C4560nE0 c4560nE0;
        if (this.f38469i) {
            com.google.android.gms.internal.ads.C4450mE0 c4450mE0 = this.f38466f;
            c4450mE0.getClass();
            return c4450mE0;
        }
        this.f38469i = true;
        com.google.android.gms.internal.ads.C4670oE0 c4670oE0 = this.f38465e;
        if (c4670oE0 != null) {
            c4670oE0.a();
        }
        if (com.google.android.gms.internal.ads.EW.f27061a >= 23 && (c4560nE0 = this.f38463c) != null) {
            android.content.Context context = this.f38461a;
            android.os.Handler handler = this.f38462b;
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(c4560nE0, handler);
        }
        com.google.android.gms.internal.ads.C4450mE0 c4450mE0D = com.google.android.gms.internal.ads.C4450mE0.d(this.f38461a, this.f38461a.registerReceiver(this.f38464d, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f38462b), this.f38468h, this.f38467g);
        this.f38466f = c4450mE0D;
        return c4450mE0D;
    }

    public final void g(com.google.android.gms.internal.ads.C5459vS c5459vS) {
        this.f38468h = c5459vS;
        j(com.google.android.gms.internal.ads.C4450mE0.c(this.f38461a, c5459vS, this.f38467g));
    }

    public final void h(android.media.AudioDeviceInfo audioDeviceInfo) {
        com.google.android.gms.internal.ads.C5109sE0 c5109sE0 = this.f38467g;
        if (j$.util.Objects.equals(audioDeviceInfo, c5109sE0 == null ? null : c5109sE0.f38705a)) {
            return;
        }
        com.google.android.gms.internal.ads.C5109sE0 c5109sE1 = audioDeviceInfo != null ? new com.google.android.gms.internal.ads.C5109sE0(audioDeviceInfo) : null;
        this.f38467g = c5109sE1;
        j(com.google.android.gms.internal.ads.C4450mE0.c(this.f38461a, this.f38468h, c5109sE1));
    }

    public final void i() {
        com.google.android.gms.internal.ads.C4560nE0 c4560nE0;
        if (this.f38469i) {
            this.f38466f = null;
            if (com.google.android.gms.internal.ads.EW.f27061a >= 23 && (c4560nE0 = this.f38463c) != null) {
                android.media.AudioManager audioManager = (android.media.AudioManager) this.f38461a.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(c4560nE0);
            }
            this.f38461a.unregisterReceiver(this.f38464d);
            com.google.android.gms.internal.ads.C4670oE0 c4670oE0 = this.f38465e;
            if (c4670oE0 != null) {
                c4670oE0.b();
            }
            this.f38469i = false;
        }
    }
}
