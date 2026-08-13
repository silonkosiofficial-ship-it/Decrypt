package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4131jK implements com.google.android.gms.internal.ads.InterfaceC4459mJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4282km f36650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XC f36651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CC f36652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KG f36653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f36654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f36655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p224w3.a f36656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f36657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36658i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36659j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36660k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3844gm f36661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3954hm f36662m;

    public C4131jK(com.google.android.gms.internal.ads.C3844gm c3844gm, com.google.android.gms.internal.ads.C3954hm c3954hm, com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km, com.google.android.gms.internal.ads.XC xc, com.google.android.gms.internal.ads.CC cc, com.google.android.gms.internal.ads.KG kg, android.content.Context context, com.google.android.gms.internal.ads.R60 r60, p224w3.a aVar, com.google.android.gms.internal.ads.C4546n70 c4546n70) {
        this.f36661l = c3844gm;
        this.f36662m = c3954hm;
        this.f36650a = interfaceC4282km;
        this.f36651b = xc;
        this.f36652c = cc;
        this.f36653d = kg;
        this.f36654e = context;
        this.f36655f = r60;
        this.f36656g = aVar;
        this.f36657h = c4546n70;
    }

    private final void w(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km = this.f36650a;
            if (interfaceC4282km != null && !interfaceC4282km.h0()) {
                this.f36650a.P1(X3.b.c2(view));
                this.f36652c.e0();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fa)).booleanValue()) {
                    this.f36653d.p0();
                    return;
                }
                return;
            }
            com.google.android.gms.internal.ads.C3844gm c3844gm = this.f36661l;
            if (c3844gm != null && !c3844gm.s6()) {
                this.f36661l.p6(X3.b.c2(view));
                this.f36652c.e0();
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fa)).booleanValue()) {
                    this.f36653d.p0();
                    return;
                }
                return;
            }
            com.google.android.gms.internal.ads.C3954hm c3954hm = this.f36662m;
            if (c3954hm == null || c3954hm.v()) {
                return;
            }
            this.f36662m.p6(X3.b.c2(view));
            this.f36652c.e0();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fa)).booleanValue()) {
                this.f36653d.p0();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to call handleClick", e6);
        }
    }

    private static final java.util.HashMap x(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                        if (view != null) {
                            map2.put((java.lang.String) entry.getKey(), view);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final boolean Y() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void b(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        try {
            if (!this.f36658i) {
                this.f36658i = p174r3.v.w().n(this.f36654e, this.f36656g.f56217C, this.f36655f.f31136C.toString(), this.f36657h.f37513f);
            }
            if (this.f36660k) {
                com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km = this.f36650a;
                if (interfaceC4282km != null && !interfaceC4282km.Y()) {
                    this.f36650a.C();
                    this.f36651b.a();
                    return;
                }
                com.google.android.gms.internal.ads.C3844gm c3844gm = this.f36661l;
                if (c3844gm != null && !c3844gm.t6()) {
                    this.f36661l.w();
                    this.f36651b.a();
                    return;
                }
                com.google.android.gms.internal.ads.C3954hm c3954hm = this.f36662m;
                if (c3954hm == null || c3954hm.t6()) {
                    return;
                }
                this.f36662m.t();
                this.f36651b.a();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to call recordImpression", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void c(p184s3.D0 d6) {
        p224w3.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void d(android.view.View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final boolean e(android.os.Bundle bundle) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:73:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void f(android.view.View view, java.util.Map map, java.util.Map map2, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        java.lang.Object obj;
        java.lang.ClassLoader classLoader;
        java.util.Iterator it;
        X3.a aVarN;
        try {
            X3.a aVarC2 = X3.b.c2(view);
            org.json.JSONObject jSONObject = this.f36655f.f31179j0;
            boolean z6 = true;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25263F1)).booleanValue() && jSONObject.length() != 0) {
                java.util.Map map3 = map == null ? new java.util.HashMap() : map;
                java.util.Map map4 = map2 == null ? new java.util.HashMap() : map2;
                java.util.HashMap map5 = new java.util.HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            java.lang.Class<?> cls = obj.getClass();
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25274G1)).booleanValue() && next.equals("3010")) {
                                com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km = this.f36650a;
                                java.lang.Object objL0 = null;
                                if (interfaceC4282km != null) {
                                    try {
                                        aVarN = interfaceC4282km.n();
                                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                                    }
                                } else {
                                    com.google.android.gms.internal.ads.C3844gm c3844gm = this.f36661l;
                                    if (c3844gm != null) {
                                        aVarN = c3844gm.n6();
                                    } else {
                                        com.google.android.gms.internal.ads.C3954hm c3954hm = this.f36662m;
                                        aVarN = c3954hm != null ? c3954hm.p4() : null;
                                    }
                                }
                                if (aVarN != null) {
                                    objL0 = X3.b.L0(aVarN);
                                }
                                if (objL0 != null) {
                                    cls = objL0.getClass();
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    p214v3.V.c(jSONArrayOptJSONArray, arrayList);
                                    p174r3.v.t();
                                    classLoader = this.f36654e.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (java.lang.Class.forName((java.lang.String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    p214v3.V.c(jSONArrayOptJSONArray, arrayList2);
                                    p174r3.v.t();
                                    classLoader = this.f36654e.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (java.lang.Class.forName((java.lang.String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (org.json.JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z6 = false;
                        break;
                    }
                }
            }
            this.f36660k = z6;
            java.util.HashMap mapX = x(map);
            java.util.HashMap mapX2 = x(map2);
            com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km2 = this.f36650a;
            if (interfaceC4282km2 != null) {
                interfaceC4282km2.p3(aVarC2, X3.b.c2(mapX), X3.b.c2(mapX2));
                return;
            }
            com.google.android.gms.internal.ads.C3844gm c3844gm2 = this.f36661l;
            if (c3844gm2 != null) {
                c3844gm2.r6(aVarC2, X3.b.c2(mapX), X3.b.c2(mapX2));
                this.f36661l.q6(aVarC2);
                return;
            }
            com.google.android.gms.internal.ads.C3954hm c3954hm2 = this.f36662m;
            if (c3954hm2 != null) {
                c3954hm2.r6(aVarC2, X3.b.c2(mapX), X3.b.c2(mapX2));
                this.f36662m.q6(aVarC2);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to call trackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void g() {
        p224w3.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void i(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z6, android.widget.ImageView.ScaleType scaleType) {
        if (this.f36659j && this.f36655f.f31145L) {
            return;
        }
        w(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void k(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void l(android.view.View view, java.util.Map map) {
        try {
            X3.a aVarC2 = X3.b.c2(view);
            com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282km = this.f36650a;
            if (interfaceC4282km != null) {
                interfaceC4282km.D5(aVarC2);
                return;
            }
            com.google.android.gms.internal.ads.C3844gm c3844gm = this.f36661l;
            if (c3844gm != null) {
                c3844gm.P1(aVarC2);
                return;
            }
            com.google.android.gms.internal.ads.C3954hm c3954hm = this.f36662m;
            if (c3954hm != null) {
                c3954hm.s6(aVarC2);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to call untrackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void m(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void n(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void o(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z6, android.widget.ImageView.ScaleType scaleType, int i6) {
        java.lang.String str;
        if (!this.f36659j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.f36655f.f31145L) {
                w(view2);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        p224w3.p.g(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void p(com.google.android.gms.internal.ads.InterfaceC3946hi interfaceC3946hi) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final org.json.JSONObject q(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final boolean r() {
        return this.f36655f.f31145L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void t(p184s3.A0 a6) {
        p224w3.p.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void u() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void u0(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final org.json.JSONObject v(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4459mJ
    public final void z() {
        this.f36659j = true;
    }
}
