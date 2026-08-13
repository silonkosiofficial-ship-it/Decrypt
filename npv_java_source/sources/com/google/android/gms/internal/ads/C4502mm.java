package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4502mm implements p244y3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Date f37410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f37412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.location.Location f37414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f37415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f37416g;

    public C4502mm(java.util.Date date, int i6, java.util.Set set, android.location.Location location, boolean z6, int i10, boolean z10, int i11, java.lang.String str) {
        this.f37410a = date;
        this.f37411b = i6;
        this.f37412c = set;
        this.f37414e = location;
        this.f37413d = z6;
        this.f37415f = i10;
        this.f37416g = z10;
    }

    @Override // p244y3.e
    public final int d() {
        return this.f37415f;
    }

    @Override // p244y3.e
    public final boolean f() {
        return this.f37416g;
    }

    @Override // p244y3.e
    public final boolean g() {
        return this.f37413d;
    }

    @Override // p244y3.e
    public final java.util.Set h() {
        return this.f37412c;
    }
}
