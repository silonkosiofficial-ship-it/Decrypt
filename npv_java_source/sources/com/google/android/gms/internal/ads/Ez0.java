package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Ez0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f27259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Cz0 f27260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Dz0 f27261c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f27263e = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27262d = 0;

    public Ez0(final android.content.Context context, android.os.Handler handler, com.google.android.gms.internal.ads.Dz0 dz0) {
        this.f27259a = com.google.android.gms.internal.ads.AbstractC3009Xg0.a(new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.Az0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                android.media.AudioManager audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            }
        });
        this.f27261c = dz0;
        this.f27260b = new com.google.android.gms.internal.ads.Cz0(this, handler);
    }

    static /* bridge */ /* synthetic */ void c(com.google.android.gms.internal.ads.Ez0 ez0, int i6) {
        if (i6 == -3 || i6 == -2) {
            if (i6 != -2) {
                ez0.g(4);
                return;
            } else {
                ez0.f(0);
                ez0.g(3);
                return;
            }
        }
        if (i6 == -1) {
            ez0.f(-1);
            ez0.e();
            ez0.g(1);
        } else if (i6 == 1) {
            ez0.g(2);
            ez0.f(1);
        } else {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("AudioFocusManager", "Unknown focus change type: " + i6);
        }
    }

    private final void e() {
        int i6 = this.f27262d;
        if (i6 == 1 || i6 == 0 || com.google.android.gms.internal.ads.EW.f27061a >= 26) {
            return;
        }
        ((android.media.AudioManager) this.f27259a.a()).abandonAudioFocus(this.f27260b);
    }

    private final void f(int i6) {
        com.google.android.gms.internal.ads.Dz0 dz0 = this.f27261c;
        if (dz0 != null) {
            int iS = com.google.android.gms.internal.ads.GA0.S(i6);
            com.google.android.gms.internal.ads.GA0 ga0 = ((com.google.android.gms.internal.ads.BA0) dz0).f25912C;
            ga0.e0(ga0.A(), i6, iS);
        }
    }

    private final void g(int i6) {
        if (this.f27262d == i6) {
            return;
        }
        this.f27262d = i6;
        float f6 = i6 == 4 ? 0.2f : 1.0f;
        if (this.f27263e != f6) {
            this.f27263e = f6;
            com.google.android.gms.internal.ads.Dz0 dz0 = this.f27261c;
            if (dz0 != null) {
                ((com.google.android.gms.internal.ads.BA0) dz0).f25912C.b0();
            }
        }
    }

    public final float a() {
        return this.f27263e;
    }

    public final int b(boolean z6, int i6) {
        e();
        g(0);
        return 1;
    }

    public final void d() {
        this.f27261c = null;
        e();
        g(0);
    }
}
