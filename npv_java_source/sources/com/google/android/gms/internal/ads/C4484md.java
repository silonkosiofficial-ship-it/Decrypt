package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4484md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.InputStream f37380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f37383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37384e;

    private C4484md(java.io.InputStream inputStream, boolean z6, boolean z10, long j6, boolean z11) {
        this.f37380a = inputStream;
        this.f37381b = z6;
        this.f37382c = z10;
        this.f37383d = j6;
        this.f37384e = z11;
    }

    public static com.google.android.gms.internal.ads.C4484md b(java.io.InputStream inputStream, boolean z6, boolean z10, long j6, boolean z11) {
        return new com.google.android.gms.internal.ads.C4484md(inputStream, z6, z10, j6, z11);
    }

    public final long a() {
        return this.f37383d;
    }

    public final java.io.InputStream c() {
        return this.f37380a;
    }

    public final boolean d() {
        return this.f37381b;
    }

    public final boolean e() {
        return this.f37384e;
    }

    public final boolean f() {
        return this.f37382c;
    }
}
