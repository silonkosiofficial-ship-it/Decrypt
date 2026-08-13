package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class SM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K70 f31686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PM f31687b;

    SM(com.google.android.gms.internal.ads.K70 k70, com.google.android.gms.internal.ads.PM pm) {
        this.f31686a = k70;
        this.f31687b = pm;
    }

    final com.google.android.gms.internal.ads.InterfaceC2945Vl a() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlB = this.f31686a.b();
        if (interfaceC2945VlB != null) {
            return interfaceC2945VlB;
        }
        p224w3.p.g("Unexpected call to adapter creator.");
        throw new android.os.RemoteException();
    }

    public final com.google.android.gms.internal.ads.InterfaceC2874Tm b(java.lang.String str) {
        com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874TmE = a().E(str);
        this.f31687b.d(str, interfaceC2874TmE);
        return interfaceC2874TmE;
    }

    public final com.google.android.gms.internal.ads.M70 c(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.InterfaceC3053Yl interfaceC3053YlY;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC3053YlY = new com.google.android.gms.internal.ads.BinderC5601wm(new com.google.ads.mediation.admob.AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC3053YlY = new com.google.android.gms.internal.ads.BinderC5601wm(new com.google.android.gms.internal.ads.zzbrw());
            } else {
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlA = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        java.lang.String string = jSONObject.getString("class_name");
                        if (interfaceC2945VlA.o(string)) {
                            interfaceC3053YlY = interfaceC2945VlA.y("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            interfaceC3053YlY = interfaceC2945VlA.Z(string) ? interfaceC2945VlA.y(string) : interfaceC2945VlA.y("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (org.json.JSONException e6) {
                        p224w3.p.e("Invalid custom event.", e6);
                        interfaceC3053YlY = interfaceC2945VlA.y(str);
                    }
                } else {
                    interfaceC3053YlY = interfaceC2945VlA.y(str);
                }
            }
            com.google.android.gms.internal.ads.M70 m70 = new com.google.android.gms.internal.ads.M70(interfaceC3053YlY);
            this.f31687b.c(str, m70);
            return m70;
        } catch (java.lang.Throwable th) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25620l9)).booleanValue()) {
                this.f31687b.c(str, null);
            }
            throw new com.google.android.gms.internal.ads.C5315u70(th);
        }
    }

    public final boolean d() {
        return this.f31686a.b() != null;
    }
}
