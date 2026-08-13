package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3918hO implements com.google.android.gms.internal.ads.InterfaceC5539w90 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f36059D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V3.f f36060E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f36058C = new java.util.HashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Map f36061F = new java.util.HashMap();

    public C3918hO(com.google.android.gms.internal.ads.YN yn, java.util.Set set, V3.f fVar) {
        this.f36059D = yn;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.C3808gO c3808gO = (com.google.android.gms.internal.ads.C3808gO) it.next();
            this.f36061F.put(c3808gO.f35600c, c3808gO);
        }
        this.f36060E = fVar;
    }

    private final void a(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, boolean z6) {
        com.google.android.gms.internal.ads.C3808gO c3808gO = (com.google.android.gms.internal.ads.C3808gO) this.f36061F.get(enumC4770p90);
        if (c3808gO == null) {
            return;
        }
        java.lang.String str = true != z6 ? "f." : "s.";
        java.util.Map map = this.f36058C;
        com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p91 = c3808gO.f35599b;
        if (map.containsKey(enumC4770p91)) {
            long jC = this.f36060E.c() - ((java.lang.Long) this.f36058C.get(enumC4770p91)).longValue();
            this.f36059D.b().put("label.".concat(c3808gO.f35598a), str + jC);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void i(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str, java.lang.Throwable th) {
        if (this.f36058C.containsKey(enumC4770p90)) {
            long jC = this.f36060E.c() - ((java.lang.Long) this.f36058C.get(enumC4770p90)).longValue();
            com.google.android.gms.internal.ads.YN yn = this.f36059D;
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            yn.b().put("task.".concat(strValueOf), "f.".concat(java.lang.String.valueOf(java.lang.Long.toString(jC))));
        }
        if (this.f36061F.containsKey(enumC4770p90)) {
            a(enumC4770p90, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void p(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void w(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        if (this.f36058C.containsKey(enumC4770p90)) {
            long jC = this.f36060E.c() - ((java.lang.Long) this.f36058C.get(enumC4770p90)).longValue();
            com.google.android.gms.internal.ads.YN yn = this.f36059D;
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            yn.b().put("task.".concat(strValueOf), "s.".concat(java.lang.String.valueOf(java.lang.Long.toString(jC))));
        }
        if (this.f36061F.containsKey(enumC4770p90)) {
            a(enumC4770p90, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void z(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        this.f36058C.put(enumC4770p90, java.lang.Long.valueOf(this.f36060E.c()));
    }
}
