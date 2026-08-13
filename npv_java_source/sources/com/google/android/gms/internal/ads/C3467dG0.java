package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3467dG0 implements com.google.android.gms.internal.ads.InterfaceC5443vG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f34676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f34677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34678c;

    public C3467dG0(int i6) {
        com.google.android.gms.internal.ads.C3248bG0 c3248bG0 = new com.google.android.gms.internal.ads.C3248bG0(i6);
        com.google.android.gms.internal.ads.C3357cG0 c3357cG0 = new com.google.android.gms.internal.ads.C3357cG0(i6);
        this.f34676a = c3248bG0;
        this.f34677b = c3357cG0;
        this.f34678c = true;
    }

    static /* synthetic */ android.os.HandlerThread b(int i6) {
        return new android.os.HandlerThread(com.google.android.gms.internal.ads.C3686fG0.r(i6, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ android.os.HandlerThread c(int i6) {
        return new android.os.HandlerThread(com.google.android.gms.internal.ads.C3686fG0.r(i6, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5443vG0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5663xG0 a(com.google.android.gms.internal.ads.C5333uG0 c5333uG0) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x001d, B:6:0x0023, B:10:0x002e, B:15:0x0039, B:18:0x0053, B:17:0x0042), top: B:40:0x001d }] */
    public final com.google.android.gms.internal.ads.C3686fG0 d(com.google.android.gms.internal.ads.C5333uG0 c5333uG0) throws java.lang.Exception {
        android.media.MediaCodec mediaCodecCreateByCodecName;
        com.google.android.gms.internal.ads.InterfaceC5773yG0 c4234kG0;
        int i6;
        java.lang.String str = c5333uG0.f39130a.f25094a;
        com.google.android.gms.internal.ads.C3686fG0 c3686fG0 = null;
        try {
            android.os.Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            try {
                if (this.f34678c) {
                    com.google.android.gms.internal.ads.D d6 = c5333uG0.f39132c;
                    int i10 = com.google.android.gms.internal.ads.EW.f27061a;
                    if (i10 >= 34 && (i10 >= 35 || com.google.android.gms.internal.ads.AbstractC3606ed.i(d6.f26574o))) {
                        c4234kG0 = new com.google.android.gms.internal.ads.C4018iH0(mediaCodecCreateByCodecName);
                        i6 = 4;
                    } else {
                        c4234kG0 = new com.google.android.gms.internal.ads.C4234kG0(mediaCodecCreateByCodecName, c(((com.google.android.gms.internal.ads.C3357cG0) this.f34677b).f34477C));
                        i6 = 0;
                    }
                } else {
                    c4234kG0 = new com.google.android.gms.internal.ads.C4234kG0(mediaCodecCreateByCodecName, c(((com.google.android.gms.internal.ads.C3357cG0) this.f34677b).f34477C));
                    i6 = 0;
                }
                com.google.android.gms.internal.ads.InterfaceC5773yG0 interfaceC5773yG0 = c4234kG0;
                int i11 = i6;
                com.google.android.gms.internal.ads.C3686fG0 c3686fG1 = new com.google.android.gms.internal.ads.C3686fG0(mediaCodecCreateByCodecName, b(((com.google.android.gms.internal.ads.C3248bG0) this.f34676a).f34260C), interfaceC5773yG0, c5333uG0.f39135f, null);
                try {
                    android.os.Trace.endSection();
                    android.view.Surface surface = c5333uG0.f39133d;
                    if (surface == null && c5333uG0.f39130a.f25101h && com.google.android.gms.internal.ads.EW.f27061a >= 35) {
                        i11 |= 8;
                    }
                    com.google.android.gms.internal.ads.C3686fG0.q(c3686fG1, c5333uG0.f39131b, surface, null, i11);
                    return c3686fG1;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    c3686fG0 = c3686fG1;
                    if (c3686fG0 != null) {
                        c3686fG0.m();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (java.lang.Exception e10) {
                e = e10;
            }
        } catch (java.lang.Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }

    public final void e(boolean z6) {
        this.f34678c = true;
    }
}
