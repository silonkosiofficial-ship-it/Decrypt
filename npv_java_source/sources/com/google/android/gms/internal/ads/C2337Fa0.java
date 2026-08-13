package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2337Fa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.TV f27400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f27401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f27402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f27403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f27404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3668f70 f27405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3778g70 f27406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V3.f f27407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f27408i;

    public C2337Fa0(com.google.android.gms.internal.ads.TV tv, p224w3.a aVar, java.lang.String str, java.lang.String str2, android.content.Context context, com.google.android.gms.internal.ads.C3668f70 c3668f70, com.google.android.gms.internal.ads.C3778g70 c3778g70, V3.f fVar, com.google.android.gms.internal.ads.Z9 z10) {
        this.f27400a = tv;
        this.f27401b = aVar.f56217C;
        this.f27402c = str;
        this.f27403d = str2;
        this.f27404e = context;
        this.f27405f = c3668f70;
        this.f27406g = c3778g70;
        this.f27407h = fVar;
        this.f27408i = z10;
    }

    public static final java.util.List f(int i6, int i10, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((java.lang.String) it.next(), "@gw_mpe@", "2." + i10));
        }
        return arrayList;
    }

    public static final java.util.List g(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((java.lang.String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final java.util.List h(java.util.List list, long j6) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((java.lang.String) it.next(), "@gw_ttr@", java.lang.Long.toString(j6, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String i(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        return p224w3.m.k() ? "fakeForAdDebugLog" : str;
    }

    private static java.lang.String j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (true == android.text.TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final java.util.List c(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, java.util.List list) {
        return d(c3558e70, r60, false, "", "", list);
    }

    public final java.util.List d(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, boolean z6, java.lang.String str, java.lang.String str2, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z10 = true;
            java.lang.String strJ = j(j(j((java.lang.String) it.next(), "@gw_adlocid@", c3558e70.f34898a.f34012a.f37513f), "@gw_adnetrefresh@", true != z6 ? "0" : "1"), "@gw_sdkver@", this.f27401b);
            if (r60 != null) {
                strJ = com.google.android.gms.internal.ads.AbstractC5059rq.c(j(j(j(strJ, "@gw_qdata@", r60.f31208y), "@gw_adnetid@", r60.f31206x), "@gw_allocid@", r60.f31204w), this.f27404e, r60.f31156W, r60.f31205w0);
            }
            java.lang.String strJ2 = j(j(j(j(strJ, "@gw_adnetstatus@", this.f27400a.g()), "@gw_ttr@", java.lang.Long.toString(this.f27400a.a(), 10)), "@gw_seqnum@", this.f27402c), "@gw_sessid@", this.f27403d);
            boolean z11 = false;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25254E3)).booleanValue() && !android.text.TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean z12 = !android.text.TextUtils.isEmpty(str2);
            if (z11) {
                z10 = z12;
            } else {
                if (z12) {
                }
                arrayList.add(strJ2);
            }
            if (this.f27408i.f(android.net.Uri.parse(strJ2))) {
                android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(strJ2).buildUpon();
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z10) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strJ2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strJ2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066 A[LOOP:0: B:13:0x0060->B:15:0x0066, LOOP_END] */
    public final java.util.List e(com.google.android.gms.internal.ads.R60 r60, java.util.List list, com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp) {
        com.google.android.gms.internal.ads.C3668f70 c3668f70;
        com.google.android.gms.internal.ads.AbstractC5810yg0 abstractC5810yg0D;
        java.lang.String str;
        java.lang.String str2;
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long jA = this.f27407h.a();
        try {
            java.lang.String strC = interfaceC3302bp.c();
            java.lang.String string = java.lang.Integer.toString(interfaceC3302bp.b());
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25265F3)).booleanValue()) {
                com.google.android.gms.internal.ads.C3778g70 c3778g70 = this.f27406g;
                if (c3778g70 == null) {
                    abstractC5810yg0D = com.google.android.gms.internal.ads.AbstractC5810yg0.c();
                } else {
                    c3668f70 = c3778g70.f35551a;
                }
                str = (java.lang.String) abstractC5810yg0D.a(new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Da0
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.C2337Fa0.i(((com.google.android.gms.internal.ads.C3668f70) obj).f35278a);
                    }
                }).b("");
                str2 = (java.lang.String) abstractC5810yg0D.a(new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Ea0
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.C2337Fa0.i(((com.google.android.gms.internal.ads.C3668f70) obj).f35279b);
                    }
                }).b("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.google.android.gms.internal.ads.AbstractC5059rq.c(j(j(j(j(j(j((java.lang.String) it.next(), "@gw_rwd_userid@", android.net.Uri.encode(str)), "@gw_rwd_custom_data@", android.net.Uri.encode(str2)), "@gw_tmstmp@", java.lang.Long.toString(jA)), "@gw_rwd_itm@", android.net.Uri.encode(strC)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f27401b), this.f27404e, r60.f31156W, r60.f31205w0));
                }
                return arrayList;
            }
            c3668f70 = this.f27405f;
            abstractC5810yg0D = com.google.android.gms.internal.ads.AbstractC5810yg0.d(c3668f70);
            str = (java.lang.String) abstractC5810yg0D.a(new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Da0
                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.C2337Fa0.i(((com.google.android.gms.internal.ads.C3668f70) obj).f35278a);
                }
            }).b("");
            str2 = (java.lang.String) abstractC5810yg0D.a(new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.Ea0
                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.C2337Fa0.i(((com.google.android.gms.internal.ads.C3668f70) obj).f35279b);
                }
            }).b("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.google.android.gms.internal.ads.AbstractC5059rq.c(j(j(j(j(j(j((java.lang.String) it.next(), "@gw_rwd_userid@", android.net.Uri.encode(str)), "@gw_rwd_custom_data@", android.net.Uri.encode(str2)), "@gw_tmstmp@", java.lang.Long.toString(jA)), "@gw_rwd_itm@", android.net.Uri.encode(strC)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f27401b), this.f27404e, r60.f31156W, r60.f31205w0));
            }
            return arrayList;
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("Unable to determine award type and amount.", e6);
            return arrayList;
        }
    }
}
