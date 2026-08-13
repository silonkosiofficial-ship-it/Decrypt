package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4102j50 implements com.google.android.gms.internal.ads.InterfaceC5647x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.E50 f36561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.G50 f36562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p184s3.X1 f36563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f36564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f36565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p184s3.i2 f36566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.InterfaceC4438m80 f36567g;

    public C4102j50(com.google.android.gms.internal.ads.E50 e50, com.google.android.gms.internal.ads.G50 g50, p184s3.X1 x6, java.lang.String str, java.util.concurrent.Executor executor, p184s3.i2 i2Var, com.google.android.gms.internal.ads.InterfaceC4438m80 interfaceC4438m80) {
        this.f36561a = e50;
        this.f36562b = g50;
        this.f36563c = x6;
        this.f36564d = str;
        this.f36565e = executor;
        this.f36566f = i2Var;
        this.f36567g = interfaceC4438m80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5647x80
    public final com.google.android.gms.internal.ads.InterfaceC4438m80 a() {
        return this.f36567g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5647x80
    public final java.util.concurrent.Executor b() {
        return this.f36565e;
    }
}
