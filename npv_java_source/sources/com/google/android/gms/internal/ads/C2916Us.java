package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2916Us implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    private static final java.lang.Integer b(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) map.get(str)));
        } catch (java.lang.NumberFormatException unused) {
            p224w3.p.g("Precache invalid numeric parameter '" + str + "': " + ((java.lang.String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.AbstractC2880Ts c2988Ws;
        com.google.android.gms.internal.ads.C2550Ks c2550KsD;
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) obj;
        if (p224w3.p.j(3)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            p224w3.p.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        com.google.android.gms.internal.ads.C2586Ls c2586LsC = p174r3.v.C();
        if (map.containsKey("abort")) {
            if (c2586LsC.g(interfaceC3746fs)) {
                return;
            }
            p224w3.p.g("Precache abort but no precache task running.");
            return;
        }
        java.lang.String str = (java.lang.String) map.get("src");
        java.lang.Integer numB = b(map, "periodicReportIntervalMs");
        java.lang.Integer numB2 = b(map, "exoPlayerRenderingIntervalMs");
        java.lang.Integer numB3 = b(map, "exoPlayerIdleIntervalMs");
        com.google.android.gms.internal.ads.C3636es c3636es = new com.google.android.gms.internal.ads.C3636es((java.lang.String) map.get("flags"));
        boolean z6 = c3636es.f35083k;
        if (str != null) {
            java.lang.String[] strArr = {str};
            java.lang.String str2 = (java.lang.String) map.get("demuxed");
            if (str2 != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                    java.lang.String[] strArr2 = new java.lang.String[jSONArray.length()];
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        strArr2[i6] = jSONArray.getString(i6);
                    }
                    strArr = strArr2;
                } catch (org.json.JSONException unused) {
                    p224w3.p.g("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new java.lang.String[]{str};
            }
            if (z6) {
                java.util.Iterator it = c2586LsC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c2550KsD = null;
                        break;
                    }
                    com.google.android.gms.internal.ads.C2550Ks c2550Ks = (com.google.android.gms.internal.ads.C2550Ks) it.next();
                    if (c2550Ks.f29016c == interfaceC3746fs && str.equals(c2550Ks.e())) {
                        c2550KsD = c2550Ks;
                        break;
                    }
                }
            } else {
                c2550KsD = c2586LsC.d(interfaceC3746fs);
            }
            if (c2550KsD != null) {
                p224w3.p.g("Precache task is already running.");
                return;
            }
            if (interfaceC3746fs.j() == null) {
                p224w3.p.g("Precache requires a dependency provider.");
                return;
            }
            java.lang.Integer numB4 = b(map, "player");
            if (numB4 == null) {
                numB4 = 0;
            }
            if (numB != null) {
                interfaceC3746fs.r(numB.intValue());
            }
            if (numB2 != null) {
                interfaceC3746fs.E0(numB2.intValue());
            }
            if (numB3 != null) {
                interfaceC3746fs.y0(numB3.intValue());
            }
            int iIntValue = numB4.intValue();
            com.google.android.gms.internal.ads.C2291Ds c2291Ds = interfaceC3746fs.j().f53837b;
            if (iIntValue > 0) {
                int i10 = c3636es.f35079g;
                int iQ = com.google.android.gms.internal.ads.AbstractC2987Wr.Q();
                if (iQ < i10) {
                    c2988Ws = new com.google.android.gms.internal.ads.C3419ct(interfaceC3746fs, c3636es);
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25631n)).booleanValue()) {
                        iQ = com.google.android.gms.internal.ads.C3096Zs.t();
                    }
                    c2988Ws = iQ < c3636es.f35074b ? new com.google.android.gms.internal.ads.C3096Zs(interfaceC3746fs, c3636es) : new com.google.android.gms.internal.ads.C3024Xs(interfaceC3746fs);
                }
            } else {
                c2988Ws = new com.google.android.gms.internal.ads.C2988Ws(interfaceC3746fs);
            }
            new com.google.android.gms.internal.ads.C2550Ks(interfaceC3746fs, c2988Ws, str, strArr).b();
        } else {
            com.google.android.gms.internal.ads.C2550Ks c2550KsD2 = c2586LsC.d(interfaceC3746fs);
            if (c2550KsD2 == null) {
                p224w3.p.g("Precache must specify a source.");
                return;
            }
            c2988Ws = c2550KsD2.f29017d;
        }
        java.lang.Integer numB5 = b(map, "minBufferMs");
        if (numB5 != null) {
            c2988Ws.n(numB5.intValue());
        }
        java.lang.Integer numB6 = b(map, "maxBufferMs");
        if (numB6 != null) {
            c2988Ws.m(numB6.intValue());
        }
        java.lang.Integer numB7 = b(map, "bufferForPlaybackMs");
        if (numB7 != null) {
            c2988Ws.k(numB7.intValue());
        }
        java.lang.Integer numB8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (numB8 != null) {
            c2988Ws.l(numB8.intValue());
        }
    }
}
