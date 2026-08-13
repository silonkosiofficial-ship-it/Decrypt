package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PO extends com.google.android.gms.internal.ads.AbstractBinderC2502Jj {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SO f30710C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.NO f30711D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.Map f30712E = new java.util.HashMap();

    PO(com.google.android.gms.internal.ads.SO so, com.google.android.gms.internal.ads.NO no) {
        this.f30710C = so;
        this.f30711D = no;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static p184s3.X1 o6(java.util.Map map) {
        p184s3.Y1 y6 = new p184s3.Y1();
        java.lang.String str = (java.lang.String) map.get("ad_request");
        if (str == null) {
            return y6.a();
        }
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(android.net.Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        android.os.Bundle bundle = new android.os.Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        y6.b(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        y6.e(arrayList);
                        break;
                    case "isTestDevice":
                        y6.d(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            y6.h(0);
                            break;
                        } else {
                            y6.h(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            y6.i(0);
                            break;
                        } else {
                            y6.i(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        java.lang.String strNextString = jsonReader.nextString();
                        if (!p104k3.t.f49496f.contains(strNextString)) {
                            break;
                        } else {
                            y6.f(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        y6.c(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (java.io.IOException unused) {
            p224w3.p.b("Ad Request json was malformed, parsing ended early.");
        }
        p184s3.X1 x1A = y6.a();
        android.os.Bundle bundle2 = x1A.f54164O.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = x1A.f54154E;
            x1A.f54164O.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new p184s3.X1(x1A.f54152C, x1A.f54153D, bundle2, x1A.f54155F, x1A.f54156G, x1A.f54157H, x1A.f54158I, x1A.f54159J, x1A.f54160K, x1A.f54161L, x1A.f54162M, x1A.f54163N, x1A.f54164O, x1A.f54165P, x1A.f54166Q, x1A.f54167R, x1A.f54168S, x1A.f54169T, x1A.f54170U, x1A.f54171V, x1A.f54172W, x1A.f54173X, x1A.f54174Y, x1A.f54175Z, x1A.f54176a0, x1A.f54177b0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2539Kj
    public final void G(java.lang.String str) {
        byte b6;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25370O9)).booleanValue()) {
            p214v3.AbstractC7265q0.k("Received H5 gmsg: ".concat(java.lang.String.valueOf(str)));
            android.net.Uri uri = android.net.Uri.parse(str);
            p174r3.v.t();
            java.util.Map mapP = p214v3.E0.p(uri);
            java.lang.String str2 = (java.lang.String) mapP.get("action");
            if (android.text.TextUtils.isEmpty(str2)) {
                p224w3.p.b("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    b6 = 0;
                } else {
                    b6 = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b6 = 1;
            } else {
                b6 = -1;
            }
            if (b6 == 0) {
                this.f30712E.clear();
                this.f30711D.a();
                return;
            }
            if (b6 == 1) {
                java.util.Iterator it = this.f30712E.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.GO) it.next()).a();
                }
                this.f30712E.clear();
                return;
            }
            java.lang.String str3 = (java.lang.String) mapP.get("obj_id");
            try {
                j$.util.Objects.requireNonNull(str3);
                long j6 = java.lang.Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        if (this.f30712E.size() >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25381P9)).intValue()) {
                            p224w3.p.g("Could not create H5 ad, too many existing objects");
                            this.f30711D.i(j6);
                            break;
                        } else {
                            java.util.Map map = this.f30712E;
                            java.lang.Long lValueOf = java.lang.Long.valueOf(j6);
                            if (!map.containsKey(lValueOf)) {
                                java.lang.String str4 = (java.lang.String) mapP.get("ad_unit");
                                if (!android.text.TextUtils.isEmpty(str4)) {
                                    com.google.android.gms.internal.ads.HO hoB = this.f30710C.b();
                                    hoB.a(j6);
                                    hoB.o(str4);
                                    this.f30712E.put(lValueOf, hoB.c().a());
                                    this.f30711D.h(j6);
                                    p214v3.AbstractC7265q0.k("Created H5 interstitial #" + j6 + " with ad unit " + str4);
                                } else {
                                    p224w3.p.g("Could not create H5 ad, missing ad unit id");
                                    this.f30711D.i(j6);
                                }
                            } else {
                                p224w3.p.b("Could not create H5 ad, object ID already exists");
                                this.f30711D.i(j6);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        com.google.android.gms.internal.ads.GO go2 = (com.google.android.gms.internal.ads.GO) this.f30712E.get(java.lang.Long.valueOf(j6));
                        if (go2 == null) {
                            p224w3.p.b("Could not load H5 ad, object ID does not exist");
                            this.f30711D.f(j6);
                            break;
                        } else {
                            go2.b(o6(mapP));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        com.google.android.gms.internal.ads.GO go3 = (com.google.android.gms.internal.ads.GO) this.f30712E.get(java.lang.Long.valueOf(j6));
                        if (go3 == null) {
                            p224w3.p.b("Could not show H5 ad, object ID does not exist");
                            this.f30711D.f(j6);
                            break;
                        } else {
                            go3.c();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        if (this.f30712E.size() >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25381P9)).intValue()) {
                            p224w3.p.g("Could not create H5 ad, too many existing objects");
                            this.f30711D.i(j6);
                            break;
                        } else {
                            java.util.Map map2 = this.f30712E;
                            java.lang.Long lValueOf2 = java.lang.Long.valueOf(j6);
                            if (!map2.containsKey(lValueOf2)) {
                                java.lang.String str5 = (java.lang.String) mapP.get("ad_unit");
                                if (!android.text.TextUtils.isEmpty(str5)) {
                                    com.google.android.gms.internal.ads.HO hoB2 = this.f30710C.b();
                                    hoB2.a(j6);
                                    hoB2.o(str5);
                                    this.f30712E.put(lValueOf2, hoB2.c().b());
                                    this.f30711D.h(j6);
                                    p214v3.AbstractC7265q0.k("Created H5 rewarded #" + j6 + " with ad unit " + str5);
                                } else {
                                    p224w3.p.g("Could not create H5 ad, missing ad unit id");
                                    this.f30711D.i(j6);
                                }
                            } else {
                                p224w3.p.b("Could not create H5 ad, object ID already exists");
                                this.f30711D.i(j6);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        com.google.android.gms.internal.ads.GO go4 = (com.google.android.gms.internal.ads.GO) this.f30712E.get(java.lang.Long.valueOf(j6));
                        if (go4 == null) {
                            p224w3.p.b("Could not load H5 ad, object ID does not exist");
                            this.f30711D.q(j6);
                            break;
                        } else {
                            go4.b(o6(mapP));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        com.google.android.gms.internal.ads.GO go5 = (com.google.android.gms.internal.ads.GO) this.f30712E.get(java.lang.Long.valueOf(j6));
                        if (go5 == null) {
                            p224w3.p.b("Could not show H5 ad, object ID does not exist");
                            this.f30711D.q(j6);
                            break;
                        } else {
                            go5.c();
                            break;
                        }
                        break;
                    case "dispose":
                        java.util.Map map3 = this.f30712E;
                        java.lang.Long lValueOf3 = java.lang.Long.valueOf(j6);
                        com.google.android.gms.internal.ads.GO go6 = (com.google.android.gms.internal.ads.GO) map3.get(lValueOf3);
                        if (go6 == null) {
                            p224w3.p.b("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            go6.a();
                            this.f30712E.remove(lValueOf3);
                            p214v3.AbstractC7265q0.k("Disposed H5 ad #" + j6);
                            break;
                        }
                        break;
                    default:
                        p224w3.p.b("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException unused) {
                p224w3.p.b("H5 gmsg did not contain a valid object id: ".concat(java.lang.String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2539Kj
    public final void d() {
        this.f30712E.clear();
    }
}
