package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.on0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4725on0 extends com.google.android.gms.internal.ads.AbstractC3297bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4945qn0 f37870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f37871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f37872c;

    private C4725on0(com.google.android.gms.internal.ads.C4945qn0 c4945qn0, com.google.android.gms.internal.ads.Lu0 lu0, java.lang.Integer num) {
        this.f37870a = c4945qn0;
        this.f37871b = lu0;
        this.f37872c = num;
    }

    public static com.google.android.gms.internal.ads.C4725on0 a(com.google.android.gms.internal.ads.C4945qn0 c4945qn0, java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.Lu0 lu0B;
        if (c4945qn0.b() == com.google.android.gms.internal.ads.C4835pn0.f38075b) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            lu0B = com.google.android.gms.internal.ads.Lu0.b(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c4945qn0.b() != com.google.android.gms.internal.ads.C4835pn0.f38076c) {
                throw new java.security.GeneralSecurityException("Unknown Variant: ".concat(c4945qn0.b().toString()));
            }
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            lu0B = com.google.android.gms.internal.ads.Lu0.b(new byte[0]);
        }
        return new com.google.android.gms.internal.ads.C4725on0(c4945qn0, lu0B, num);
    }

    public final com.google.android.gms.internal.ads.C4945qn0 b() {
        return this.f37870a;
    }

    public final java.lang.Integer c() {
        return this.f37872c;
    }
}
