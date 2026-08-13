package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2193Bc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashMap f25987a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f25988b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f25989c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.HashSet f25990d = new java.util.HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.HashSet f25991e = new java.util.HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.HashSet f25992f = new java.util.HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.HashMap f25993g = new java.util.HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.HashSet f25994h = new java.util.HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.Map f25995i = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25996j;

    public final android.view.View a(java.lang.String str) {
        return (android.view.View) this.f25989c.get(str);
    }

    public final com.google.android.gms.internal.ads.C5912zc0 b(android.view.View view) {
        com.google.android.gms.internal.ads.C5912zc0 c5912zc0 = (com.google.android.gms.internal.ads.C5912zc0) this.f25988b.get(view);
        if (c5912zc0 != null) {
            this.f25988b.remove(view);
        }
        return c5912zc0;
    }

    public final java.lang.String c(java.lang.String str) {
        return (java.lang.String) this.f25993g.get(str);
    }

    public final java.lang.String d(android.view.View view) {
        if (this.f25987a.size() == 0) {
            return null;
        }
        java.lang.String str = (java.lang.String) this.f25987a.get(view);
        if (str != null) {
            this.f25987a.remove(view);
        }
        return str;
    }

    public final java.util.HashSet e() {
        return this.f25992f;
    }

    public final java.util.HashSet f() {
        return this.f25991e;
    }

    public final void g() {
        this.f25987a.clear();
        this.f25988b.clear();
        this.f25989c.clear();
        this.f25990d.clear();
        this.f25991e.clear();
        this.f25992f.clear();
        this.f25993g.clear();
        this.f25996j = false;
        this.f25994h.clear();
    }

    public final void h() {
        this.f25996j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        java.lang.Boolean bool;
        android.app.Activity activity;
        com.google.android.gms.internal.ads.C2963Wb0 c2963Wb0A = com.google.android.gms.internal.ads.C2963Wb0.a();
        if (c2963Wb0A != null) {
            for (com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0 : c2963Wb0A.b()) {
                android.view.View viewF = c2339Fb0.f();
                if (c2339Fb0.j()) {
                    java.lang.String strH = c2339Fb0.h();
                    if (viewF != null) {
                        boolean zIsInPictureInPictureMode = false;
                        java.lang.String str = null;
                        if (android.os.Build.VERSION.SDK_INT >= 24) {
                            android.content.Context context = viewF.getContext();
                            while (true) {
                                if (!(context instanceof android.content.ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else {
                                    if (context instanceof android.app.Activity) {
                                        activity = (android.app.Activity) context;
                                        break;
                                    }
                                    context = ((android.content.ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                zIsInPictureInPictureMode = activity.isInPictureInPictureMode();
                            }
                        }
                        if (zIsInPictureInPictureMode) {
                            this.f25994h.add(strH);
                        }
                        if (viewF.isAttachedToWindow()) {
                            if (viewF.hasWindowFocus()) {
                                this.f25995i.remove(viewF);
                                bool = java.lang.Boolean.FALSE;
                            } else if (this.f25995i.containsKey(viewF)) {
                                bool = (java.lang.Boolean) this.f25995i.get(viewF);
                            } else {
                                java.util.Map map = this.f25995i;
                                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                                map.put(viewF, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zIsInPictureInPictureMode) {
                                java.util.HashSet hashSet = new java.util.HashSet();
                                android.view.View view = viewF;
                                while (true) {
                                    if (view == null) {
                                        this.f25990d.addAll(hashSet);
                                        break;
                                    }
                                    java.lang.String strA = com.google.android.gms.internal.ads.AbstractC5802yc0.a(view);
                                    if (strA != null) {
                                        str = strA;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        java.lang.Object parent = view.getParent();
                                        view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f25991e.add(strH);
                            this.f25987a.put(viewF, strH);
                            for (com.google.android.gms.internal.ads.C3071Zb0 c3071Zb0 : c2339Fb0.i()) {
                                android.view.View view2 = (android.view.View) c3071Zb0.b().get();
                                if (view2 != null) {
                                    com.google.android.gms.internal.ads.C5912zc0 c5912zc0 = (com.google.android.gms.internal.ads.C5912zc0) this.f25988b.get(view2);
                                    if (c5912zc0 != null) {
                                        c5912zc0.c(c2339Fb0.h());
                                    } else {
                                        this.f25988b.put(view2, new com.google.android.gms.internal.ads.C5912zc0(c3071Zb0, c2339Fb0.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f25992f.add(strH);
                            this.f25989c.put(strH, viewF);
                            this.f25993g.put(strH, str);
                        }
                    } else {
                        this.f25992f.add(strH);
                        this.f25993g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(java.lang.String str) {
        return this.f25994h.contains(str);
    }

    public final boolean k(android.view.View view) {
        if (!this.f25995i.containsKey(view)) {
            return true;
        }
        this.f25995i.put(view, java.lang.Boolean.TRUE);
        return false;
    }

    public final int l(android.view.View view) {
        if (this.f25990d.contains(view)) {
            return 1;
        }
        return this.f25996j ? 2 : 3;
    }
}
