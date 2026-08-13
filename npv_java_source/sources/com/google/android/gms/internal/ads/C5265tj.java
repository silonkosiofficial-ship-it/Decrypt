package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5265tj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p174r3.b f39011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f39012b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4944qn f39014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f39015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2591Lx f39016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p204u3.InterfaceC7200b f39017g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39018h = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.v f39013c = new p224w3.v(null);

    public C5265tj(p174r3.b bVar, com.google.android.gms.internal.ads.C4944qn c4944qn, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        this.f39011a = bVar;
        this.f39014d = c4944qn;
        this.f39015e = c4033iT;
        this.f39012b = c3588eO;
        this.f39016f = c2591Lx;
    }

    public static int b(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static android.net.Uri c(android.content.Context context, com.google.android.gms.internal.ads.Z9 z10, android.net.Uri uri, android.view.View view, android.app.Activity activity, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        if (z10 == null) {
            return uri;
        }
        try {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sb)).booleanValue() || c4985r70 == null) {
                if (z10.e(uri)) {
                    uri = z10.a(uri, context, view, activity);
                }
            } else if (z10.e(uri)) {
                uri = c4985r70.a(uri, context, view, activity);
            }
        } catch (com.google.android.gms.internal.ads.C3162aa unused) {
        } catch (java.lang.Exception e6) {
            p174r3.v.s().x(e6, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static android.net.Uri d(android.net.Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis())).build();
            }
        } catch (java.lang.UnsupportedOperationException e6) {
            p224w3.p.e("Error adding click uptime parameter to url: ".concat(java.lang.String.valueOf(uri.toString())), e6);
        }
        return uri;
    }

    public static boolean f(java.util.Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:118:0x02e2  */
    public final void h(java.lang.String str, p184s3.InterfaceC7076a interfaceC7076a, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        boolean zB;
        java.util.HashMap map2;
        boolean z6;
        java.lang.String string;
        int i6;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) interfaceC7076a;
        com.google.android.gms.internal.ads.R60 r60Q = interfaceC2698Ot.Q();
        com.google.android.gms.internal.ads.U60 u60H0 = interfaceC2698Ot.h0();
        boolean zG = false;
        if (r60Q == null || u60H0 == null) {
            str3 = "";
            zB = false;
        } else {
            java.lang.String str4 = u60H0.f32114b;
            zB = r60Q.b();
            str3 = str4;
        }
        boolean z10 = (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Da)).booleanValue() && map.containsKey("sc") && ((java.lang.String) map.get("sc")).equals("0")) ? false : true;
        boolean z11 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Dc)).booleanValue() && map.containsKey("ig_cl") && ((java.lang.String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (interfaceC2698Ot.R0()) {
                p224w3.p.g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                k(false);
                ((com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a).w(f(map), b(map), z10);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            k(false);
            boolean z12 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Nb)).booleanValue() && j$.util.Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            com.google.android.gms.internal.ads.InterfaceC2256Cu interfaceC2256Cu = (com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a;
            boolean zF = f(map);
            int iB = b(map);
            if (str != null) {
                interfaceC2256Cu.b(zF, iB, str, z10, z12);
                return;
            } else {
                interfaceC2256Cu.C(zF, iB, (java.lang.String) map.get("html"), (java.lang.String) map.get("baseurl"), z10);
                return;
            }
        }
        android.content.Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            android.content.Context context = interfaceC2698Ot.getContext();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25299I4)).booleanValue()) {
                p214v3.AbstractC7265q0.k("User opt out chrome custom tab.");
                i6 = 10;
            } else {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25277G4)).booleanValue()) {
                    zG = com.google.android.gms.internal.ads.C3393cg.g(context);
                } else if (androidx.browser.customtabs.c.c(context, null) != null) {
                    zG = true;
                }
                if (zG) {
                    k(true);
                    if (android.text.TextUtils.isEmpty(str)) {
                        p224w3.p.g("Cannot open browser with null or empty url");
                        m(7);
                        return;
                    }
                    android.net.Uri uriD = d(c(interfaceC2698Ot.getContext(), interfaceC2698Ot.H(), android.net.Uri.parse(str), interfaceC2698Ot.N(), interfaceC2698Ot.h(), interfaceC2698Ot.a1()));
                    if (zB && this.f39015e != null && l(interfaceC7076a, interfaceC2698Ot.getContext(), uriD.toString(), str3)) {
                        return;
                    }
                    this.f39017g = new com.google.android.gms.internal.ads.C4826pj(this);
                    ((com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a).Z(new p204u3.l(null, uriD.toString(), null, null, null, null, null, null, X3.b.c2(this.f39017g).asBinder(), true), z10, z11, str3);
                    return;
                }
                i6 = 4;
            }
            m(i6);
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            j(interfaceC7076a, map, zB, str3, z10, z11);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((java.lang.String) map.get("system_browser"))) {
            j(interfaceC7076a, map, zB, str3, z10, z11);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25543e8)).booleanValue()) {
                k(true);
                java.lang.String str5 = (java.lang.String) map.get("p");
                if (str5 == null) {
                    p224w3.p.g("Package name missing from open app action.");
                    return;
                }
                if (zB && this.f39015e != null && l(interfaceC7076a, interfaceC2698Ot.getContext(), str5, str3)) {
                    return;
                }
                android.content.pm.PackageManager packageManager = interfaceC2698Ot.getContext().getPackageManager();
                if (packageManager == null) {
                    p224w3.p.g("Cannot get package manager from open app action.");
                    return;
                }
                android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a).Z(new p204u3.l(launchIntentForPackage, this.f39017g), z10, z11, str3);
                    return;
                }
                return;
            }
            return;
        }
        k(true);
        java.lang.String str6 = (java.lang.String) map.get("intent_url");
        if (!android.text.TextUtils.isEmpty(str6)) {
            try {
                uri = android.content.Intent.parseUri(str6, 0);
            } catch (java.net.URISyntaxException e6) {
                p224w3.p.e("Error parsing the url: ".concat(java.lang.String.valueOf(str6)), e6);
            }
        }
        android.content.Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            android.net.Uri data = intent.getData();
            if (!android.net.Uri.EMPTY.equals(data)) {
                android.net.Uri uriD2 = d(c(interfaceC2698Ot.getContext(), interfaceC2698Ot.H(), data, interfaceC2698Ot.N(), interfaceC2698Ot.h(), interfaceC2698Ot.a1()));
                if (android.text.TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriD2);
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25554f8)).booleanValue()) {
                        intent.setDataAndType(uriD2, intent.getType());
                    } else {
                        intent.setData(uriD2);
                    }
                }
            }
        }
        boolean z13 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25216A8)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        java.util.HashMap map3 = new java.util.HashMap();
        if (z13) {
            map2 = map3;
            this.f39017g = new com.google.android.gms.internal.ads.C4936qj(this, z10, interfaceC7076a, map3, map);
            z6 = false;
        } else {
            map2 = map3;
            z6 = z10;
        }
        if (intent != null) {
            if (!zB || this.f39015e == null || !l(interfaceC7076a, interfaceC2698Ot.getContext(), intent.getData().toString(), str3)) {
                ((com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a).Z(new p204u3.l(intent, this.f39017g), z6, z11, str3);
                return;
            } else {
                if (z13) {
                    map2.put((java.lang.String) map.get("event_id"), java.lang.Boolean.TRUE);
                    ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC7076a).O("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        boolean z14 = z11;
        if (android.text.TextUtils.isEmpty(str)) {
            string = str;
        } else {
            string = d(c(interfaceC2698Ot.getContext(), interfaceC2698Ot.H(), android.net.Uri.parse(str), interfaceC2698Ot.N(), interfaceC2698Ot.h(), interfaceC2698Ot.a1())).toString();
        }
        if (!zB || this.f39015e == null || !l(interfaceC7076a, interfaceC2698Ot.getContext(), string, str3)) {
            ((com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a).Z(new p204u3.l((java.lang.String) map.get("i"), string, (java.lang.String) map.get("m"), (java.lang.String) map.get("p"), (java.lang.String) map.get("c"), (java.lang.String) map.get("f"), (java.lang.String) map.get("e"), this.f39017g), z6, z14, str3);
        } else if (z13) {
            map2.put((java.lang.String) map.get(r5), java.lang.Boolean.TRUE);
            ((com.google.android.gms.internal.ads.InterfaceC5817yk) interfaceC7076a).O("openIntentAsync", map2);
        }
    }

    private final void i(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f39015e.g(str);
        com.google.android.gms.internal.ads.C3588eO c3588eO = this.f39012b;
        if (c3588eO != null) {
            com.google.android.gms.internal.ads.BinderC5240tT.q6(context, c3588eO, this.f39015e, str, "dialog_not_shown", com.google.android.gms.internal.ads.AbstractC3727fi0.e("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e4 A[PHI: r7
  0x00e4: PHI (r7v19 android.content.pm.ResolveInfo) = (r7v11 android.content.pm.ResolveInfo), (r7v14 android.content.pm.ResolveInfo) binds: [B:23:0x00e2, B:50:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:31:0x0106  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147 A[LOOP:1: B:41:0x012a->B:46:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    private final void j(p184s3.InterfaceC7076a interfaceC7076a, java.util.Map map, boolean z6, java.lang.String str, boolean z10, boolean z11) {
        android.net.Uri.Builder builderScheme;
        android.content.Intent intentA;
        android.content.Intent intentA2;
        java.util.ArrayList arrayList;
        android.content.pm.ResolveInfo resolveInfoD;
        ?? r6;
        java.util.ArrayList arrayList2;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int size;
        int i6;
        java.util.ArrayList arrayList3;
        android.content.pm.ResolveInfo resolveInfo;
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it;
        int i10;
        android.content.pm.ResolveInfo resolveInfoC;
        android.content.Intent intentB;
        p184s3.InterfaceC7076a interfaceC7076a2;
        boolean z12 = true;
        k(true);
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) interfaceC7076a;
        android.content.Context context = interfaceC2698Ot.getContext();
        com.google.android.gms.internal.ads.Z9 z9H = interfaceC2698Ot.H();
        android.view.View viewN = interfaceC2698Ot.N();
        com.google.android.gms.internal.ads.C4985r70 c4985r70A1 = interfaceC2698Ot.a1();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        java.lang.String str2 = (java.lang.String) map.get("u");
        java.lang.Object objB = null;
        if (android.text.TextUtils.isEmpty(str2)) {
            r6 = objB;
        } else {
            android.net.Uri uriD = d(c(context, z9H, android.net.Uri.parse(str2), viewN, null, c4985r70A1));
            boolean z13 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_first_package"));
            boolean z14 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_running_process"));
            if (!java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_custom_tabs"))) {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25233C4)).booleanValue()) {
                    z12 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriD.getScheme())) {
                builderScheme = uriD.buildUpon().scheme("https");
            } else if ("https".equalsIgnoreCase(uriD.getScheme())) {
                builderScheme = uriD.buildUpon().scheme("http");
            } else {
                ?? r10 = objB;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                intentA = com.google.android.gms.internal.ads.AbstractC5155sj.a(uriD, context, z9H, viewN, c4985r70A1);
                intentA2 = com.google.android.gms.internal.ads.AbstractC5155sj.a(r10, context, z9H, viewN, c4985r70A1);
                if (z12) {
                    p174r3.v.t();
                    p214v3.E0.U(context, intentA);
                    p174r3.v.t();
                    p214v3.E0.U(context, intentA2);
                }
                arrayList = arrayList4;
                resolveInfoD = com.google.android.gms.internal.ads.AbstractC5155sj.d(intentA, arrayList4, context, z9H, viewN, c4985r70A1);
                if (resolveInfoD == null) {
                    objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                    r6 = objB;
                } else if (intentA2 != null || (resolveInfoC = com.google.android.gms.internal.ads.AbstractC5155sj.c(intentA2, context, z9H, viewN, c4985r70A1)) == null) {
                    r6 = intentB;
                    if (!arrayList.isEmpty()) {
                        if (z14 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            size = arrayList.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                    arrayList3 = arrayList;
                                    resolveInfo = (android.content.pm.ResolveInfo) arrayList3.get(i6);
                                    it = runningAppProcesses.iterator();
                                    while (true) {
                                        i10 = i6 + 1;
                                        if (it.hasNext()) {
                                            arrayList = arrayList3;
                                            i6 = i10;
                                        } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                            resolveInfoD = resolveInfo;
                                        }
                                    }
                                }
                                objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                                r6 = objB;
                            }
                        }
                        arrayList2 = arrayList;
                        if (z13) {
                            resolveInfoD = (android.content.pm.ResolveInfo) arrayList2.get(0);
                            objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                            r6 = objB;
                        }
                    }
                    r6 = intentA;
                } else {
                    intentB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoC, context, z9H, viewN, c4985r70A1);
                    if (com.google.android.gms.internal.ads.AbstractC5155sj.c(intentB, context, z9H, viewN, c4985r70A1) == null) {
                        r6 = intentB;
                        if (!arrayList.isEmpty()) {
                            if (z14) {
                                size = arrayList.size();
                                i6 = 0;
                                while (true) {
                                    if (i6 < size) {
                                        arrayList3 = arrayList;
                                        resolveInfo = (android.content.pm.ResolveInfo) arrayList3.get(i6);
                                        it = runningAppProcesses.iterator();
                                        while (true) {
                                            i10 = i6 + 1;
                                            if (it.hasNext()) {
                                                arrayList = arrayList3;
                                                i6 = i10;
                                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                                resolveInfoD = resolveInfo;
                                            }
                                        }
                                    }
                                    objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                                    r6 = objB;
                                }
                            }
                            arrayList2 = arrayList;
                            if (z13) {
                                resolveInfoD = (android.content.pm.ResolveInfo) arrayList2.get(0);
                                objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                                r6 = objB;
                            }
                        }
                        r6 = intentA;
                    }
                }
            }
            objB = builderScheme.build();
            ?? r11 = objB;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            intentA = com.google.android.gms.internal.ads.AbstractC5155sj.a(uriD, context, z9H, viewN, c4985r70A1);
            intentA2 = com.google.android.gms.internal.ads.AbstractC5155sj.a(r11, context, z9H, viewN, c4985r70A1);
            if (z12) {
                p174r3.v.t();
                p214v3.E0.U(context, intentA);
                p174r3.v.t();
                p214v3.E0.U(context, intentA2);
            }
            arrayList = arrayList5;
            resolveInfoD = com.google.android.gms.internal.ads.AbstractC5155sj.d(intentA, arrayList5, context, z9H, viewN, c4985r70A1);
            if (resolveInfoD == null) {
                objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                r6 = objB;
            } else if (intentA2 != null) {
                r6 = intentB;
                if (!arrayList.isEmpty()) {
                    if (z14) {
                        size = arrayList.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                arrayList3 = arrayList;
                                resolveInfo = (android.content.pm.ResolveInfo) arrayList3.get(i6);
                                it = runningAppProcesses.iterator();
                                while (true) {
                                    i10 = i6 + 1;
                                    if (it.hasNext()) {
                                        arrayList = arrayList3;
                                        i6 = i10;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        resolveInfoD = resolveInfo;
                                    }
                                }
                            }
                            objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                            r6 = objB;
                        }
                    }
                    arrayList2 = arrayList;
                    if (z13) {
                        resolveInfoD = (android.content.pm.ResolveInfo) arrayList2.get(0);
                        objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                        r6 = objB;
                    }
                }
                r6 = intentA;
            } else {
                r6 = intentB;
                if (!arrayList.isEmpty()) {
                    if (z14) {
                        size = arrayList.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                arrayList3 = arrayList;
                                resolveInfo = (android.content.pm.ResolveInfo) arrayList3.get(i6);
                                it = runningAppProcesses.iterator();
                                while (true) {
                                    i10 = i6 + 1;
                                    if (it.hasNext()) {
                                        arrayList = arrayList3;
                                        i6 = i10;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        resolveInfoD = resolveInfo;
                                    }
                                }
                            }
                            objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                            r6 = objB;
                        }
                    }
                    arrayList2 = arrayList;
                    if (z13) {
                        resolveInfoD = (android.content.pm.ResolveInfo) arrayList2.get(0);
                        objB = com.google.android.gms.internal.ads.AbstractC5155sj.b(intentA, resolveInfoD, context, z9H, viewN, c4985r70A1);
                        r6 = objB;
                    }
                }
                r6 = intentA;
            }
        }
        if (!z6 || this.f39015e == null || r6 == 0) {
            interfaceC7076a2 = interfaceC7076a;
        } else {
            interfaceC7076a2 = interfaceC7076a;
            if (l(interfaceC7076a2, interfaceC2698Ot.getContext(), r6.getData().toString(), str)) {
                return;
            }
        }
        try {
            ((com.google.android.gms.internal.ads.InterfaceC2256Cu) interfaceC7076a2).Z(new p204u3.l(r6, this.f39017g), z10, z11, str);
        } catch (android.content.ActivityNotFoundException e6) {
            p224w3.p.g(e6.getMessage());
        }
    }

    private final void k(boolean z6) {
        com.google.android.gms.internal.ads.C4944qn c4944qn = this.f39014d;
        if (c4944qn != null) {
            c4944qn.h(z6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25709u8)).booleanValue() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (((java.lang.Boolean) p184s3.A.c().a(android.os.Build.VERSION.SDK_INT < 33 ? com.google.android.gms.internal.ads.AbstractC2161Af.f25659p8 : com.google.android.gms.internal.ads.AbstractC2161Af.f25649o8)).booleanValue() != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean l(p184s3.InterfaceC7076a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5265tj.l(s3.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i6) {
        com.google.android.gms.internal.ads.C3588eO c3588eO;
        java.lang.String str;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25266F4)).booleanValue() || (c3588eO = this.f39012b) == null) {
            return;
        }
        com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
        c3479dOA.b("action", "cct_action");
        switch (i6) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        c3479dOA.b("cct_open_status", str);
        c3479dOA.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        p184s3.InterfaceC7076a interfaceC7076a = (p184s3.InterfaceC7076a) obj;
        java.lang.String str = (java.lang.String) map.get("u");
        java.util.Map map2 = new java.util.HashMap();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) interfaceC7076a;
        if (interfaceC2698Ot.Q() != null) {
            map2 = interfaceC2698Ot.Q().f31205w0;
        }
        java.lang.String strC = com.google.android.gms.internal.ads.AbstractC5059rq.c(str, interfaceC2698Ot.getContext(), true, map2);
        java.lang.String str2 = (java.lang.String) map.get("a");
        if (str2 == null) {
            p224w3.p.g("Action missing from an open GMSG.");
            return;
        }
        p174r3.b bVar = this.f39011a;
        if (bVar == null || bVar.c()) {
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r((((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25436U9)).booleanValue() && this.f39016f != null && com.google.android.gms.internal.ads.C2591Lx.j(strC)) ? this.f39016f.b(strC, p184s3.C7147y.e()) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(strC), new com.google.android.gms.internal.ads.C4716oj(this, map, interfaceC7076a, str2), this.f39018h);
        } else {
            bVar.b(strC);
        }
    }
}
