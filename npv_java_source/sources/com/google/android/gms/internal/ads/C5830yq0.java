package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5830yq0 implements com.google.android.gms.internal.ads.Cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lu0 f40143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4187jt0 f40144b;

    private C5830yq0(com.google.android.gms.internal.ads.C4187jt0 c4187jt0, com.google.android.gms.internal.ads.Lu0 lu0) {
        this.f40144b = c4187jt0;
        this.f40143a = lu0;
    }

    public static com.google.android.gms.internal.ads.C5830yq0 a(com.google.android.gms.internal.ads.C4187jt0 c4187jt0) {
        return new com.google.android.gms.internal.ads.C5830yq0(c4187jt0, com.google.android.gms.internal.ads.Kq0.a(c4187jt0.h0()));
    }

    public static com.google.android.gms.internal.ads.C5830yq0 b(com.google.android.gms.internal.ads.C4187jt0 c4187jt0) {
        return new com.google.android.gms.internal.ads.C5830yq0(c4187jt0, com.google.android.gms.internal.ads.Kq0.b(c4187jt0.h0()));
    }

    public final com.google.android.gms.internal.ads.C4187jt0 c() {
        return this.f40144b;
    }

    @Override // com.google.android.gms.internal.ads.Cq0
    public final com.google.android.gms.internal.ads.Lu0 f() {
        return this.f40143a;
    }
}
