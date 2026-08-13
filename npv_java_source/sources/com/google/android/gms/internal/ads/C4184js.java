package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4184js implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.AudioManager f36755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4075is f36756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f36760f = 1.0f;

    public C4184js(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC4075is interfaceC4075is) {
        this.f36755a = (android.media.AudioManager) context.getSystemService("audio");
        this.f36756b = interfaceC4075is;
    }

    private final void f() {
        boolean z6 = false;
        if (!this.f36758d || this.f36759e || this.f36760f <= 0.0f) {
            if (!this.f36757c) {
                return;
            }
            android.media.AudioManager audioManager = this.f36755a;
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z6 = true;
                }
                this.f36757c = z6;
            }
        } else {
            if (this.f36757c) {
                return;
            }
            android.media.AudioManager audioManager2 = this.f36755a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z6 = true;
                }
                this.f36757c = z6;
            }
        }
        this.f36756b.n();
    }

    public final float a() {
        float f6 = this.f36759e ? 0.0f : this.f36760f;
        if (this.f36757c) {
            return f6;
        }
        return 0.0f;
    }

    public final void b() {
        this.f36758d = true;
        f();
    }

    public final void c() {
        this.f36758d = false;
        f();
    }

    public final void d(boolean z6) {
        this.f36759e = z6;
        f();
    }

    public final void e(float f6) {
        this.f36760f = f6;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        this.f36757c = i6 > 0;
        this.f36756b.n();
    }
}
