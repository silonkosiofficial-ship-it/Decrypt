package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5720xq0 implements com.google.android.gms.internal.ads.Cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f39928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f39929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3753fv0 f39930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC3529dt0 f39931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Kt0 f39932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Integer f39933f;

    private C5720xq0(java.lang.String str, com.google.android.gms.internal.ads.Lu0 lu0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.EnumC3529dt0 enumC3529dt0, com.google.android.gms.internal.ads.Kt0 kt0, java.lang.Integer num) {
        this.f39928a = str;
        this.f39929b = lu0;
        this.f39930c = abstractC3753fv0;
        this.f39931d = enumC3529dt0;
        this.f39932e = kt0;
        this.f39933f = num;
    }

    public static com.google.android.gms.internal.ads.C5720xq0 a(java.lang.String str, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.EnumC3529dt0 enumC3529dt0, com.google.android.gms.internal.ads.Kt0 kt0, java.lang.Integer num) {
        if (kt0 == com.google.android.gms.internal.ads.Kt0.RAW) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new java.security.GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new com.google.android.gms.internal.ads.C5720xq0(str, com.google.android.gms.internal.ads.Kq0.a(str), abstractC3753fv0, enumC3529dt0, kt0, num);
    }

    public final com.google.android.gms.internal.ads.EnumC3529dt0 b() {
        return this.f39931d;
    }

    public final com.google.android.gms.internal.ads.Kt0 c() {
        return this.f39932e;
    }

    public final com.google.android.gms.internal.ads.AbstractC3753fv0 d() {
        return this.f39930c;
    }

    public final java.lang.Integer e() {
        return this.f39933f;
    }

    @Override // com.google.android.gms.internal.ads.Cq0
    public final com.google.android.gms.internal.ads.Lu0 f() {
        return this.f39929b;
    }

    public final java.lang.String g() {
        return this.f39928a;
    }
}
