package p204u3;

/* JADX INFO: renamed from: u3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7199a {
    public static final boolean a(android.content.Context context, android.content.Intent intent, p204u3.InterfaceC7202d interfaceC7202d, p204u3.InterfaceC7200b interfaceC7200b, boolean z6, com.google.android.gms.internal.ads.C3588eO c3588eO, java.lang.String str) {
        if (z6) {
            return c(context, intent.getData(), interfaceC7202d, interfaceC7200b);
        }
        try {
            p214v3.AbstractC7265q0.k("Launching an intent: " + intent.toURI());
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Vc)).booleanValue()) {
                p174r3.v.t();
                p214v3.E0.x(context, intent, c3588eO, str);
            } else {
                p174r3.v.t();
                p214v3.E0.t(context, intent);
            }
            if (interfaceC7202d != null) {
                interfaceC7202d.i();
            }
            if (interfaceC7200b != null) {
                interfaceC7200b.a(true);
            }
            return true;
        } catch (android.content.ActivityNotFoundException e6) {
            p224w3.p.g(e6.getMessage());
            if (interfaceC7200b != null) {
                interfaceC7200b.a(false);
            }
            return false;
        }
    }

    public static final boolean b(android.content.Context context, p204u3.l lVar, p204u3.InterfaceC7202d interfaceC7202d, p204u3.InterfaceC7200b interfaceC7200b, com.google.android.gms.internal.ads.C3588eO c3588eO, java.lang.String str) {
        java.lang.String strConcat;
        int i6 = 0;
        if (lVar == null) {
            strConcat = "No intent data for launcher overlay.";
        } else {
            com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
            android.content.Intent intent = lVar.f55498J;
            if (intent != null) {
                return a(context, intent, interfaceC7202d, interfaceC7200b, lVar.f55500L, c3588eO, str);
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (!android.text.TextUtils.isEmpty(lVar.f55492D)) {
                if (android.text.TextUtils.isEmpty(lVar.f55493E)) {
                    intent2.setData(android.net.Uri.parse(lVar.f55492D));
                } else {
                    java.lang.String str2 = lVar.f55492D;
                    intent2.setDataAndType(android.net.Uri.parse(str2), lVar.f55493E);
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!android.text.TextUtils.isEmpty(lVar.f55494F)) {
                    intent2.setPackage(lVar.f55494F);
                }
                if (!android.text.TextUtils.isEmpty(lVar.f55495G)) {
                    java.lang.String[] strArrSplit = lVar.f55495G.split("/", 2);
                    if (strArrSplit.length < 2) {
                        strConcat = "Could not parse component name from open GMSG: ".concat(java.lang.String.valueOf(lVar.f55495G));
                    } else {
                        intent2.setClassName(strArrSplit[0], strArrSplit[1]);
                    }
                }
                java.lang.String str3 = lVar.f55496H;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    try {
                        i6 = java.lang.Integer.parseInt(str3);
                    } catch (java.lang.NumberFormatException unused) {
                        p224w3.p.g("Could not parse intent flags.");
                    }
                    intent2.addFlags(i6);
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25244D4)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25233C4)).booleanValue()) {
                        p174r3.v.t();
                        p214v3.E0.U(context, intent2);
                    }
                }
                return a(context, intent2, interfaceC7202d, interfaceC7200b, lVar.f55500L, c3588eO, str);
            }
            strConcat = "Open GMSG did not contain a URL.";
        }
        p224w3.p.g(strConcat);
        return false;
    }

    private static final boolean c(android.content.Context context, android.net.Uri uri, p204u3.InterfaceC7202d interfaceC7202d, p204u3.InterfaceC7200b interfaceC7200b) {
        int iS;
        try {
            iS = p174r3.v.t().S(context, uri);
            if (interfaceC7202d != null) {
                interfaceC7202d.i();
            }
        } catch (android.content.ActivityNotFoundException e6) {
            p224w3.p.g(e6.getMessage());
            iS = 6;
        }
        if (interfaceC7200b != null) {
            interfaceC7200b.B(iS);
        }
        return iS == 5;
    }
}
