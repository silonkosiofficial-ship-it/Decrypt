package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2819Sb0 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f31720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.media.AudioManager f31721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3605ec0 f31723d;

    public C2819Sb0(android.os.Handler handler, android.content.Context context, com.google.android.gms.internal.ads.C2745Qb0 c2745Qb0, com.google.android.gms.internal.ads.C3605ec0 c3605ec0) {
        super(handler);
        this.f31720a = context;
        this.f31721b = (android.media.AudioManager) context.getSystemService("audio");
        this.f31723d = c3605ec0;
    }

    private final float c() {
        android.media.AudioManager audioManager = this.f31721b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f6 = streamVolume / streamMaxVolume;
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    private final void d() {
        this.f31723d.e(this.f31722c);
    }

    public final void a() {
        this.f31722c = c();
        d();
        this.f31720a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f31720a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        super.onChange(z6);
        float fC = c();
        if (fC != this.f31722c) {
            this.f31722c = fC;
            d();
        }
    }
}
