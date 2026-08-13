package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KT implements com.google.android.gms.internal.ads.LT {
    static /* synthetic */ com.google.android.gms.internal.ads.QT l(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.MT mt, java.lang.String str4, android.webkit.WebView webView, java.lang.String str5, java.lang.String str6, com.google.android.gms.internal.ads.NT nt) {
        java.lang.String strValueOf;
        java.lang.String str7;
        java.lang.String strConcat;
        com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0A = com.google.android.gms.internal.ads.C2708Pb0.a("Google", str2);
        com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0P = p("javascript");
        com.google.android.gms.internal.ads.EnumC2376Gb0 enumC2376Gb0N = n(mt.toString());
        com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0 = com.google.android.gms.internal.ads.EnumC2671Ob0.NONE;
        if (enumC2671Ob0P == enumC2671Ob0) {
            strConcat = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (enumC2376Gb0N == null) {
                strValueOf = java.lang.String.valueOf(mt);
                str7 = "Omid html session error; Unable to parse creative type: ";
            } else {
                com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0P2 = p(str4);
                if (enumC2376Gb0N != com.google.android.gms.internal.ads.EnumC2376Gb0.VIDEO || enumC2671Ob0P2 != enumC2671Ob0) {
                    com.google.android.gms.internal.ads.C2265Db0 c2265Db0B = com.google.android.gms.internal.ads.C2265Db0.b(c2708Pb0A, webView, str5, "");
                    return new com.google.android.gms.internal.ads.QT(com.google.android.gms.internal.ads.AbstractC2191Bb0.a(com.google.android.gms.internal.ads.C2228Cb0.a(enumC2376Gb0N, o(nt.toString()), enumC2671Ob0P, enumC2671Ob0P2, true), c2265Db0B), c2265Db0B);
                }
                strValueOf = java.lang.String.valueOf(str4);
                str7 = "Omid html session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        p224w3.p.g(strConcat);
        return null;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.QT m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.MT mt, android.webkit.WebView webView, java.lang.String str5, java.lang.String str6, com.google.android.gms.internal.ads.NT nt) {
        java.lang.String strValueOf;
        java.lang.String str7;
        java.lang.String strConcat;
        com.google.android.gms.internal.ads.C2708Pb0 c2708Pb0A = com.google.android.gms.internal.ads.C2708Pb0.a(str, str2);
        com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0P = p("javascript");
        com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0P2 = p(str4);
        com.google.android.gms.internal.ads.EnumC2376Gb0 enumC2376Gb0N = n(mt.toString());
        com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0 = com.google.android.gms.internal.ads.EnumC2671Ob0.NONE;
        if (enumC2671Ob0P == enumC2671Ob0) {
            strConcat = "Omid js session error; Unable to parse impression owner: javascript";
        } else {
            if (enumC2376Gb0N == null) {
                strValueOf = java.lang.String.valueOf(mt);
                str7 = "Omid js session error; Unable to parse creative type: ";
            } else {
                if (enumC2376Gb0N != com.google.android.gms.internal.ads.EnumC2376Gb0.VIDEO || enumC2671Ob0P2 != enumC2671Ob0) {
                    com.google.android.gms.internal.ads.C2265Db0 c2265Db0C = com.google.android.gms.internal.ads.C2265Db0.c(c2708Pb0A, webView, str5, "");
                    return new com.google.android.gms.internal.ads.QT(com.google.android.gms.internal.ads.AbstractC2191Bb0.a(com.google.android.gms.internal.ads.C2228Cb0.a(enumC2376Gb0N, o(nt.toString()), enumC2671Ob0P, enumC2671Ob0P2, true), c2265Db0C), c2265Db0C);
                }
                strValueOf = java.lang.String.valueOf(str4);
                str7 = "Omid js session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        p224w3.p.g(strConcat);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static com.google.android.gms.internal.ads.EnumC2376Gb0 n(java.lang.String str) {
        byte b6;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b6 = 1;
                } else {
                    b6 = -1;
                }
            } else if (str.equals("video")) {
                b6 = 2;
            } else {
                b6 = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b6 = 0;
        } else {
            b6 = -1;
        }
        if (b6 == 0) {
            return com.google.android.gms.internal.ads.EnumC2376Gb0.HTML_DISPLAY;
        }
        if (b6 == 1) {
            return com.google.android.gms.internal.ads.EnumC2376Gb0.NATIVE_DISPLAY;
        }
        if (b6 != 2) {
            return null;
        }
        return com.google.android.gms.internal.ads.EnumC2376Gb0.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static com.google.android.gms.internal.ads.EnumC2487Jb0 o(java.lang.String str) {
        byte b6;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b6 = 2;
                } else {
                    b6 = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b6 = 1;
            } else {
                b6 = -1;
            }
        } else if (str.equals("beginToRender")) {
            b6 = 0;
        } else {
            b6 = -1;
        }
        if (b6 == 0) {
            return com.google.android.gms.internal.ads.EnumC2487Jb0.BEGIN_TO_RENDER;
        }
        if (b6 != 1) {
            return b6 != 2 ? com.google.android.gms.internal.ads.EnumC2487Jb0.UNSPECIFIED : com.google.android.gms.internal.ads.EnumC2487Jb0.ONE_PIXEL;
        }
        return com.google.android.gms.internal.ads.EnumC2487Jb0.DEFINED_BY_JAVASCRIPT;
    }

    private static com.google.android.gms.internal.ads.EnumC2671Ob0 p(java.lang.String str) {
        if ("native".equals(str)) {
            return com.google.android.gms.internal.ads.EnumC2671Ob0.NATIVE;
        }
        return "javascript".equals(str) ? com.google.android.gms.internal.ads.EnumC2671Ob0.JAVASCRIPT : com.google.android.gms.internal.ads.EnumC2671Ob0.NONE;
    }

    private static final java.lang.Object q(com.google.android.gms.internal.ads.JT jt) {
        try {
            return jt.a();
        } catch (java.lang.RuntimeException e6) {
            p174r3.v.s().w(e6, "omid exception");
            return null;
        }
    }

    private static final void r(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.RuntimeException e6) {
            p174r3.v.s().w(e6, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final java.lang.String a(android.content.Context context) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue()) {
            return (java.lang.String) q(new com.google.android.gms.internal.ads.JT() { // from class: com.google.android.gms.internal.ads.FT
                @Override // com.google.android.gms.internal.ads.JT
                public final java.lang.Object a() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final void b(final com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0, final android.view.View view) {
        r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ET
            @Override // java.lang.Runnable
            public final void run() {
                c2634Nb0.f(view, com.google.android.gms.internal.ads.EnumC2450Ib0.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final void c(final com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0, final android.view.View view) {
        r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.AT
            @Override // java.lang.Runnable
            public final void run() {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue() && com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
                    abstractC2191Bb0.d(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final void d(final com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0, final android.view.View view) {
        r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.xT
            @Override // java.lang.Runnable
            public final void run() {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue() && com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
                    abstractC2191Bb0.b(view, com.google.android.gms.internal.ads.EnumC2450Ib0.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final void e(final com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue() && com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
            j$.util.Objects.requireNonNull(abstractC2191Bb0);
            r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.BT
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC2191Bb0.e();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final boolean f(final android.content.Context context) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue()) {
            java.lang.Boolean bool = (java.lang.Boolean) q(new com.google.android.gms.internal.ads.JT() { // from class: com.google.android.gms.internal.ads.DT
                @Override // com.google.android.gms.internal.ads.JT
                public final java.lang.Object a() {
                    if (com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
                        return java.lang.Boolean.TRUE;
                    }
                    com.google.android.gms.internal.ads.AbstractC5910zb0.a(context);
                    return java.lang.Boolean.valueOf(com.google.android.gms.internal.ads.AbstractC5910zb0.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        p224w3.p.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final com.google.android.gms.internal.ads.QT g(final java.lang.String str, final android.webkit.WebView webView, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final com.google.android.gms.internal.ads.NT nt, final com.google.android.gms.internal.ads.MT mt, final java.lang.String str6) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue() || !com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
            return null;
        }
        final java.lang.String str7 = "";
        final java.lang.String str8 = "javascript";
        return (com.google.android.gms.internal.ads.QT) q(new com.google.android.gms.internal.ads.JT(str5, str, str8, str4, mt, webView, str6, str7, nt) { // from class: com.google.android.gms.internal.ads.CT

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26226a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26227b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26229d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.google.android.gms.internal.ads.MT f26230e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ android.webkit.WebView f26231f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26232g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.google.android.gms.internal.ads.NT f26234i;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26228c = "javascript";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f26233h = "";

            {
                this.f26229d = str4;
                this.f26230e = mt;
                this.f26231f = webView;
                this.f26232g = str6;
                this.f26234i = nt;
            }

            @Override // com.google.android.gms.internal.ads.JT
            public final java.lang.Object a() {
                return com.google.android.gms.internal.ads.KT.m(this.f26226a, this.f26227b, this.f26228c, this.f26229d, this.f26230e, this.f26231f, this.f26232g, this.f26233h, this.f26234i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final void h(final com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0) {
        r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.IT
            @Override // java.lang.Runnable
            public final void run() {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue() && com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
                    abstractC2191Bb0.c();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final void i(final com.google.android.gms.internal.ads.C2634Nb0 c2634Nb0, final com.google.android.gms.internal.ads.C4078iu c4078iu) {
        r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.GT
            @Override // java.lang.Runnable
            public final void run() {
                c2634Nb0.g(c4078iu);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final com.google.android.gms.internal.ads.C2634Nb0 j(final p224w3.a aVar, final android.webkit.WebView webView, boolean z6) {
        final boolean z10 = true;
        return (com.google.android.gms.internal.ads.C2634Nb0) q(new com.google.android.gms.internal.ads.JT(webView, z10) { // from class: com.google.android.gms.internal.ads.HT

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ android.webkit.WebView f28054b;

            @Override // com.google.android.gms.internal.ads.JT
            public final java.lang.Object a() {
                p224w3.a aVar2 = this.f28053a;
                return com.google.android.gms.internal.ads.C2634Nb0.b(com.google.android.gms.internal.ads.C2708Pb0.a("Google", aVar2.f56218D + "." + aVar2.f56219E), this.f28054b, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.LT
    public final com.google.android.gms.internal.ads.QT k(final java.lang.String str, final android.webkit.WebView webView, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final com.google.android.gms.internal.ads.NT nt, final com.google.android.gms.internal.ads.MT mt, final java.lang.String str5) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5)).booleanValue() || !com.google.android.gms.internal.ads.AbstractC5910zb0.b()) {
            return null;
        }
        final java.lang.String str6 = "javascript";
        final java.lang.String str7 = "Google";
        final java.lang.String str8 = "";
        return (com.google.android.gms.internal.ads.QT) q(new com.google.android.gms.internal.ads.JT(str7, str, str6, mt, str4, webView, str5, str8, nt) { // from class: com.google.android.gms.internal.ads.zT

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f40304b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.google.android.gms.internal.ads.MT f40306d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f40307e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ android.webkit.WebView f40308f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f40309g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.google.android.gms.internal.ads.NT f40311i;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f40303a = "Google";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f40305c = "javascript";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f40310h = "";

            {
                this.f40304b = str;
                this.f40306d = mt;
                this.f40307e = str4;
                this.f40308f = webView;
                this.f40309g = str5;
                this.f40311i = nt;
            }

            @Override // com.google.android.gms.internal.ads.JT
            public final java.lang.Object a() {
                return com.google.android.gms.internal.ads.KT.l(this.f40303a, this.f40304b, this.f40305c, this.f40306d, this.f40307e, this.f40308f, this.f40309g, this.f40310h, this.f40311i);
            }
        });
    }
}
