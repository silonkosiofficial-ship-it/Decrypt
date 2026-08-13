package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5576wZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f39630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f39631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f39632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XA f39634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.V70 f39635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f39636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f39637h = p174r3.v.s().j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f39638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4333lB f39639j;

    public C5576wZ(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.XA xa, com.google.android.gms.internal.ads.V70 v70, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C4333lB c4333lB, long j6) {
        this.f39630a = context;
        this.f39631b = str;
        this.f39632c = str2;
        this.f39634e = xa;
        this.f39635f = v70;
        this.f39636g = c4546n70;
        this.f39638i = yn;
        this.f39639j = c4333lB;
        this.f39633d = j6;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.f39638i.b().put("seq_num", this.f39631b);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue()) {
            this.f39638i.c("tsacc", java.lang.String.valueOf(p174r3.v.c().a() - this.f39633d));
            com.google.android.gms.internal.ads.YN yn = this.f39638i;
            p174r3.v.t();
            yn.c("foreground", true != p214v3.E0.h(this.f39630a) ? "1" : "0");
        }
        this.f39634e.o(this.f39636g.f37511d);
        bundle.putAll(this.f39635f.a());
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5686xZ(this.f39630a, bundle, this.f39631b, this.f39632c, this.f39637h, this.f39636g.f37513f, this.f39639j));
    }
}
