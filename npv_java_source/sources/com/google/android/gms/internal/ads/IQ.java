package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class IQ implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28465a;

    public IQ(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f28465a = interfaceC5078rz0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.lang.String strValueOf;
        com.google.android.gms.internal.ads.C4546n70 c4546n70A = ((com.google.android.gms.internal.ads.C5434vC) this.f28465a).a();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25509b7)).booleanValue()) {
            java.lang.String str = c4546n70A.f37511d.f54175Z;
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new org.json.JSONObject(str).getString("request_id");
                    if (android.text.TextUtils.isEmpty(strValueOf)) {
                        if (c4546n70A.f37511d.f54170U != null) {
                            try {
                                strValueOf = new org.json.JSONObject(c4546n70A.f37511d.f54170U.f54150C).getString("request_id");
                                if (android.text.TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = java.lang.String.valueOf(p184s3.C7147y.e().nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (org.json.JSONException unused) {
                            }
                        } else {
                            strValueOf = java.lang.String.valueOf(p184s3.C7147y.e().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (org.json.JSONException unused2) {
                }
            } else if (c4546n70A.f37511d.f54170U != null) {
                strValueOf = new org.json.JSONObject(c4546n70A.f37511d.f54170U.f54150C).getString("request_id");
                if (android.text.TextUtils.isEmpty(strValueOf)) {
                    strValueOf = java.lang.String.valueOf(p184s3.C7147y.e().nextInt() & Integer.MAX_VALUE);
                }
            } else {
                strValueOf = java.lang.String.valueOf(p184s3.C7147y.e().nextInt() & Integer.MAX_VALUE);
            }
        } else {
            strValueOf = java.lang.String.valueOf(p184s3.C7147y.e().nextInt() & Integer.MAX_VALUE);
        }
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(strValueOf);
        return strValueOf;
    }
}
