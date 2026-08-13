package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2402Gs implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27911a;

    private static int b(android.content.Context context, java.util.Map map, java.lang.String str, int i6) {
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (str2 != null) {
            try {
                p184s3.C7147y.b();
                i6 = p224w3.g.z(context, java.lang.Integer.parseInt(str2));
            } catch (java.lang.NumberFormatException unused) {
                p224w3.p.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (p214v3.AbstractC7265q0.m()) {
            p214v3.AbstractC7265q0.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i6 + ".");
        }
        return i6;
    }

    private static void c(com.google.android.gms.internal.ads.C2879Tr c2879Tr, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("minBufferMs");
        java.lang.String str2 = (java.lang.String) map.get("maxBufferMs");
        java.lang.String str3 = (java.lang.String) map.get("bufferForPlaybackMs");
        java.lang.String str4 = (java.lang.String) map.get("bufferForPlaybackAfterRebufferMs");
        java.lang.String str5 = (java.lang.String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                c2879Tr.c(java.lang.Integer.parseInt(str));
            } catch (java.lang.NumberFormatException unused) {
                p224w3.p.g(java.lang.String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            c2879Tr.b(java.lang.Integer.parseInt(str2));
        }
        if (str3 != null) {
            c2879Tr.I(java.lang.Integer.parseInt(str3));
        }
        if (str4 != null) {
            c2879Tr.J(java.lang.Integer.parseInt(str4));
        }
        if (str5 != null) {
            c2879Tr.l(java.lang.Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x03e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:198:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:203:0x0448  */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x03fb, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        int iG;
        int iMin;
        int iB;
        int i6;
        int iMin2;
        java.lang.Integer numValueOf;
        int i10 = 0;
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if (str == null) {
            p224w3.p.g("Action missing from video GMSG.");
            return;
        }
        java.lang.Integer numValueOf2 = map.containsKey("playerId") ? java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get("playerId"))) : null;
        java.lang.Integer numB = interfaceC3746fs.p() != null ? interfaceC3746fs.p().b() : null;
        if (numValueOf2 != null && numB != null && !numValueOf2.equals(numB) && !str.equals("load")) {
            p224w3.p.f(java.lang.String.format(java.util.Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numB));
            return;
        }
        if (p224w3.p.j(3)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            p224w3.p.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            java.lang.String str2 = (java.lang.String) map.get("color");
            if (android.text.TextUtils.isEmpty(str2)) {
                p224w3.p.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC3746fs.setBackgroundColor(android.graphics.Color.parseColor(str2));
                return;
            } catch (java.lang.IllegalArgumentException unused) {
                p224w3.p.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            java.lang.String str3 = (java.lang.String) map.get("color");
            if (android.text.TextUtils.isEmpty(str3)) {
                p224w3.p.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC3746fs.B(android.graphics.Color.parseColor(str3));
                return;
            } catch (java.lang.IllegalArgumentException unused2) {
                p224w3.p.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            java.lang.String str4 = (java.lang.String) map.get("mimeTypes");
            if (str4 == null) {
                p224w3.p.g("No MIME types specified for decoder properties inspection.");
                java.util.HashMap map2 = new java.util.HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                interfaceC3746fs.O("onVideoEvent", map2);
                return;
            }
            java.util.HashMap map3 = new java.util.HashMap();
            java.lang.String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i10 < length) {
                java.lang.String str5 = strArrSplit[i10];
                map3.put(str5, p214v3.AbstractC7259n0.a(str5.trim()));
                i10++;
            }
            java.util.HashMap map4 = new java.util.HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            interfaceC3746fs.O("onVideoEvent", map4);
            return;
        }
        com.google.android.gms.internal.ads.C2915Ur c2915UrP = interfaceC3746fs.p();
        if (c2915UrP == null) {
            p224w3.p.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            android.content.Context context = interfaceC3746fs.getContext();
            int iB2 = b(context, map, "x", 0);
            int iB3 = b(context, map, "y", 0);
            int iB4 = b(context, map, "w", -1);
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25452W3;
            try {
                if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                    if (iB4 == -1) {
                        iMin = interfaceC3746fs.g();
                    } else {
                        iG = interfaceC3746fs.g();
                    }
                    iB = b(context, map, "h", -1);
                    if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                        if (iB == -1) {
                            iMin2 = interfaceC3746fs.i();
                        } else {
                            i6 = interfaceC3746fs.i();
                        }
                        i10 = java.lang.Integer.parseInt((java.lang.String) map.get("player"));
                        int i11 = i10;
                        boolean z6 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("spherical"));
                        if (zEquals || c2915UrP.a() != null) {
                            c2915UrP.c(iB2, iB3, iMin, iMin2);
                            return;
                        }
                        c2915UrP.d(iB2, iB3, iMin, iMin2, i11, z6, new com.google.android.gms.internal.ads.C3636es((java.lang.String) map.get("flags")));
                        com.google.android.gms.internal.ads.C2879Tr c2879TrA = c2915UrP.a();
                        if (c2879TrA != null) {
                            c(c2879TrA, map);
                            return;
                        }
                        return;
                    }
                    if (p214v3.AbstractC7265q0.m()) {
                        p214v3.AbstractC7265q0.k("Calculate height with original height " + iB + ", videoHost.getVideoBoundingHeight() " + interfaceC3746fs.i() + ", y " + iB3 + ".");
                    }
                    i6 = interfaceC3746fs.i() - iB3;
                    iMin2 = java.lang.Math.min(iB, i6);
                    i10 = java.lang.Integer.parseInt((java.lang.String) map.get("player"));
                    int i12 = i10;
                    boolean z10 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("spherical"));
                    if (zEquals) {
                    }
                    c2915UrP.c(iB2, iB3, iMin, iMin2);
                    return;
                }
                if (p214v3.AbstractC7265q0.m()) {
                    p214v3.AbstractC7265q0.k("Calculate width with original width " + iB4 + ", videoHost.getVideoBoundingWidth() " + interfaceC3746fs.g() + ", x " + iB2 + ".");
                }
                iG = interfaceC3746fs.g() - iB2;
                if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
                    if (iB == -1) {
                        iMin2 = interfaceC3746fs.i();
                    } else {
                        i6 = interfaceC3746fs.i();
                    }
                    i10 = java.lang.Integer.parseInt((java.lang.String) map.get("player"));
                    int i13 = i10;
                    boolean z11 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("spherical"));
                    if (zEquals) {
                    }
                    c2915UrP.c(iB2, iB3, iMin, iMin2);
                    return;
                }
                if (p214v3.AbstractC7265q0.m()) {
                    p214v3.AbstractC7265q0.k("Calculate height with original height " + iB + ", videoHost.getVideoBoundingHeight() " + interfaceC3746fs.i() + ", y " + iB3 + ".");
                }
                i6 = interfaceC3746fs.i() - iB3;
                i10 = java.lang.Integer.parseInt((java.lang.String) map.get("player"));
            } catch (java.lang.NumberFormatException unused3) {
            }
            iMin = java.lang.Math.min(iB4, iG);
            iB = b(context, map, "h", -1);
            iMin2 = java.lang.Math.min(iB, i6);
            int i14 = i10;
            boolean z12 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("spherical"));
            if (zEquals) {
            }
            c2915UrP.c(iB2, iB3, iMin, iMin2);
            return;
        }
        com.google.android.gms.internal.ads.BinderC5287tu binderC5287tuS = interfaceC3746fs.s();
        if (binderC5287tuS != null) {
            if (str.equals("timeupdate")) {
                java.lang.String str6 = (java.lang.String) map.get("currentTime");
                if (str6 == null) {
                    p224w3.p.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    binderC5287tuS.t6(java.lang.Float.parseFloat(str6));
                    return;
                } catch (java.lang.NumberFormatException unused4) {
                    p224w3.p.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                binderC5287tuS.A();
                return;
            }
        }
        com.google.android.gms.internal.ads.C2879Tr c2879TrA2 = c2915UrP.a();
        if (c2879TrA2 == null) {
            java.util.HashMap map5 = new java.util.HashMap();
            map5.put("event", "no_video_view");
            interfaceC3746fs.O("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            android.content.Context context2 = interfaceC3746fs.getContext();
            int iB5 = b(context2, map, "x", 0);
            float fB = b(context2, map, "y", 0);
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iB5, fB, 0);
            c2879TrA2.H(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            java.lang.String str7 = (java.lang.String) map.get("time");
            if (str7 == null) {
                p224w3.p.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                c2879TrA2.G((int) (java.lang.Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (java.lang.NumberFormatException unused5) {
                p224w3.p.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c2879TrA2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c2879TrA2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            c2879TrA2.B(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            c(c2879TrA2, map);
            return;
        }
        if (str.equals("muted")) {
            if (java.lang.Boolean.parseBoolean((java.lang.String) map.get("muted"))) {
                c2879TrA2.C();
                return;
            } else {
                c2879TrA2.r();
                return;
            }
        }
        if (str.equals("pause")) {
            c2879TrA2.E();
            return;
        }
        if (str.equals("play")) {
            c2879TrA2.F();
            return;
        }
        if (str.equals("show")) {
            c2879TrA2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            java.lang.String str8 = (java.lang.String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get("periodicReportIntervalMs")));
                } catch (java.lang.NumberFormatException unused6) {
                    p224w3.p.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(java.lang.String.valueOf((java.lang.String) map.get("periodicReportIntervalMs"))));
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            java.lang.String[] strArr = {str8};
            java.lang.String str9 = (java.lang.String) map.get("demuxed");
            if (str9 != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str9);
                    java.lang.String[] strArr2 = new java.lang.String[jSONArray.length()];
                    for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                        strArr2[i15] = jSONArray.getString(i15);
                    }
                    strArr = strArr2;
                } catch (org.json.JSONException unused7) {
                    p224w3.p.g("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new java.lang.String[]{str8};
                }
            }
            if (numValueOf != null) {
                interfaceC3746fs.r(numValueOf.intValue());
            }
            c2879TrA2.m(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            android.content.Context context3 = interfaceC3746fs.getContext();
            c2879TrA2.p(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.f27911a) {
                return;
            }
            interfaceC3746fs.F();
            this.f27911a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                c2879TrA2.x();
                return;
            } else {
                p224w3.p.g("Unknown video action: ".concat(str));
                return;
            }
        }
        java.lang.String str10 = (java.lang.String) map.get("volume");
        if (str10 == null) {
            p224w3.p.g("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            c2879TrA2.o(java.lang.Float.parseFloat(str10));
        } catch (java.lang.NumberFormatException unused8) {
            p224w3.p.g("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
