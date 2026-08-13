package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2173Al implements com.google.android.gms.internal.ads.InterfaceC4390ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4610nl f25778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4720ol f25779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3952hl f25780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f25781d;

    C2173Al(com.google.android.gms.internal.ads.C3952hl c3952hl, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC4720ol interfaceC4720ol, com.google.android.gms.internal.ads.InterfaceC4610nl interfaceC4610nl) {
        this.f25780c = c3952hl;
        this.f25781d = str;
        this.f25779b = interfaceC4720ol;
        this.f25778a = interfaceC4610nl;
    }

    static /* bridge */ /* synthetic */ void d(com.google.android.gms.internal.ads.C2173Al c2173Al, com.google.android.gms.internal.ads.C3294bl c3294bl, com.google.android.gms.internal.ads.InterfaceC4061il interfaceC4061il, java.lang.Object obj, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        try {
            p174r3.v.t();
            java.lang.String string = java.util.UUID.randomUUID().toString();
            com.google.android.gms.internal.ads.AbstractC3728fj.f35410o.c(string, new com.google.android.gms.internal.ads.C5929zl(c2173Al, c3294bl, c4512mr));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", c2173Al.f25779b.c(obj));
            interfaceC4061il.G0(c2173Al.f25781d, jSONObject);
        } catch (java.lang.Exception e6) {
            try {
                c4512mr.d(e6);
                p224w3.p.e("Unable to invokeJavascript", e6);
            } finally {
                c3294bl.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
    public final P4.d b(java.lang.Object obj) {
        return c(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4390ll
    public final P4.d c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        com.google.android.gms.internal.ads.C3294bl c3294blB = this.f25780c.b(null);
        p214v3.AbstractC7265q0.k("callJs > getEngine: Promise created");
        c3294blB.f(new com.google.android.gms.internal.ads.C5709xl(this, c3294blB, obj, c4512mr), new com.google.android.gms.internal.ads.C5819yl(this, c4512mr, c3294blB));
        return c4512mr;
    }
}
