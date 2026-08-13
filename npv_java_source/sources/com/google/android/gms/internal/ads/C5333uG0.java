package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5333uG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AG0 f39130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.media.MediaFormat f39131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.D f39132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.view.Surface f39133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.media.MediaCrypto f39134e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C5113sG0 f39135f;

    private C5333uG0(com.google.android.gms.internal.ads.AG0 ag0, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.D d6, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, com.google.android.gms.internal.ads.C5113sG0 c5113sG0) {
        this.f39130a = ag0;
        this.f39131b = mediaFormat;
        this.f39132c = d6;
        this.f39133d = surface;
        this.f39135f = c5113sG0;
    }

    public static com.google.android.gms.internal.ads.C5333uG0 a(com.google.android.gms.internal.ads.AG0 ag0, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.D d6, android.media.MediaCrypto mediaCrypto, com.google.android.gms.internal.ads.C5113sG0 c5113sG0) {
        return new com.google.android.gms.internal.ads.C5333uG0(ag0, mediaFormat, d6, null, null, c5113sG0);
    }

    public static com.google.android.gms.internal.ads.C5333uG0 b(com.google.android.gms.internal.ads.AG0 ag0, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.D d6, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
        return new com.google.android.gms.internal.ads.C5333uG0(ag0, mediaFormat, d6, surface, null, null);
    }
}
