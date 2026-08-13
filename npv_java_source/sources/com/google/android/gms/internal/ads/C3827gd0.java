package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3827gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f35644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Looper f35645b;

    public C3827gd0(android.content.Context context, android.os.Looper looper) {
        this.f35644a = context;
        this.f35645b = looper;
    }

    public final void a(java.lang.String str) {
        com.google.android.gms.internal.ads.C5364ud0 c5364ud0B0 = com.google.android.gms.internal.ads.C5694xd0.b0();
        c5364ud0B0.z(this.f35644a.getPackageName());
        c5364ud0B0.B(2);
        com.google.android.gms.internal.ads.C5034rd0 c5034rd0B0 = com.google.android.gms.internal.ads.C5254td0.b0();
        c5034rd0B0.z(str);
        c5034rd0B0.A(2);
        c5364ud0B0.A(c5034rd0B0);
        new com.google.android.gms.internal.ads.C3937hd0(this.f35644a, this.f35645b, (com.google.android.gms.internal.ads.C5694xd0) c5364ud0B0.u()).a();
    }
}
