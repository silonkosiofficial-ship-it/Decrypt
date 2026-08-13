package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5147sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f38782a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f38783b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f38784c = new java.util.ArrayList();

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f38783b.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) p184s3.A.c().a((com.google.android.gms.internal.ads.AbstractC5037rf) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(com.google.android.gms.internal.ads.AbstractC2198Bf.a());
        return arrayList;
    }

    public final java.util.List b() {
        java.util.List listA = a();
        java.util.Iterator it = this.f38784c.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) p184s3.A.c().a((com.google.android.gms.internal.ads.AbstractC5037rf) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                listA.add(str);
            }
        }
        listA.addAll(com.google.android.gms.internal.ads.AbstractC2198Bf.b());
        return listA;
    }

    public final void c(com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        this.f38783b.add(abstractC5037rf);
    }

    public final void d(com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        this.f38782a.add(abstractC5037rf);
    }

    public final void e(android.content.SharedPreferences.Editor editor, int i6, org.json.JSONObject jSONObject) {
        for (com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf : this.f38782a) {
            if (abstractC5037rf.e() == 1) {
                abstractC5037rf.d(editor, abstractC5037rf.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            p224w3.p.d("Flag Json is null.");
        }
    }
}
