package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4674oG0 implements com.google.android.gms.internal.ads.InterfaceC5443vG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37755a;

    public C4674oG0(android.content.Context context) {
        this.f37755a = context;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5443vG0
    public final com.google.android.gms.internal.ads.InterfaceC5663xG0 a(com.google.android.gms.internal.ads.C5333uG0 c5333uG0) throws java.lang.Throwable {
        android.content.Context context;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 >= 23 && (i6 >= 31 || ((context = this.f37755a) != null && i6 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iB = com.google.android.gms.internal.ads.AbstractC3606ed.b(c5333uG0.f39132c.f26574o);
            com.google.android.gms.internal.ads.AbstractC3586eM.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(com.google.android.gms.internal.ads.EW.d(iB)));
            com.google.android.gms.internal.ads.C3467dG0 c3467dG0 = new com.google.android.gms.internal.ads.C3467dG0(iB);
            c3467dG0.e(true);
            return c3467dG0.d(c5333uG0);
        }
        android.media.MediaCodec mediaCodec = null;
        try {
            java.lang.String str = c5333uG0.f39130a.f25094a;
            android.os.Trace.beginSection("createCodec:".concat(str));
            android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            android.os.Trace.endSection();
            try {
                android.os.Trace.beginSection("configureCodec");
                android.view.Surface surface = c5333uG0.f39133d;
                int i10 = 0;
                if (surface == null && c5333uG0.f39130a.f25101h && i6 >= 35) {
                    i10 = 8;
                }
                mediaCodecCreateByCodecName.configure(c5333uG0.f39131b, surface, (android.media.MediaCrypto) null, i10);
                android.os.Trace.endSection();
                android.os.Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                android.os.Trace.endSection();
                return new com.google.android.gms.internal.ads.C3908hH0(mediaCodecCreateByCodecName, c5333uG0.f39135f, null);
            } catch (java.io.IOException e6) {
                e = e6;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (java.lang.RuntimeException e10) {
                e = e10;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (java.io.IOException e11) {
            e = e11;
        } catch (java.lang.RuntimeException e12) {
            e = e12;
        }
    }
}
