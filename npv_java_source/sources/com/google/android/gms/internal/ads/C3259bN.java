package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3259bN implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f34303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f34304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f34305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f34306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f34307e;

    public C3259bN(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz4) {
        this.f34303a = interfaceC5078rz0;
        this.f34304b = interfaceC5078rz1;
        this.f34305c = interfaceC5078rz2;
        this.f34306d = interfaceC5078rz3;
        this.f34307e = interfaceC5078rz4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Context contextA = ((com.google.android.gms.internal.ads.C3204av) this.f34303a).a();
        final java.lang.String strB = ((com.google.android.gms.internal.ads.JQ) this.f34304b).b();
        p224w3.a aVarA = ((com.google.android.gms.internal.ads.C4740ov) this.f34305c).a();
        final com.google.android.gms.internal.ads.EnumC5473vd enumC5473vd = (com.google.android.gms.internal.ads.EnumC5473vd) this.f34306d.b();
        final java.lang.String str = (java.lang.String) this.f34307e.b();
        com.google.android.gms.internal.ads.C4704od c4704od = new com.google.android.gms.internal.ads.C4704od(new com.google.android.gms.internal.ads.C5363ud(contextA));
        com.google.android.gms.internal.ads.C3002Xd c3002XdH0 = com.google.android.gms.internal.ads.C3038Yd.h0();
        c3002XdH0.z(aVarA.f56218D);
        c3002XdH0.B(aVarA.f56219E);
        c3002XdH0.A(true != aVarA.f56220F ? 2 : 0);
        final com.google.android.gms.internal.ads.C3038Yd c3038Yd = (com.google.android.gms.internal.ads.C3038Yd) c3002XdH0.u();
        c4704od.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.aN
            @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
            public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                com.google.android.gms.internal.ads.C5693xd c5693xd = (com.google.android.gms.internal.ads.C5693xd) c3004Xe.H().H();
                c5693xd.z(enumC5473vd);
                c3004Xe.z(c5693xd);
                com.google.android.gms.internal.ads.C2713Pe c2713Pe = (com.google.android.gms.internal.ads.C2713Pe) c3004Xe.I().H();
                c2713Pe.z(strB);
                c2713Pe.A(c3038Yd);
                c3004Xe.B(c2713Pe);
                c3004Xe.C(str);
            }
        });
        return c4704od;
    }
}
