package p214v3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static android.graphics.Point a(android.view.MotionEvent motionEvent, android.view.View view) {
        int[] iArrJ = j(view);
        return new android.graphics.Point(((int) motionEvent.getRawX()) - iArrJ[0], ((int) motionEvent.getRawY()) - iArrJ[1]);
    }

    public static android.view.WindowManager.LayoutParams b() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25434U7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static org.json.JSONObject c(java.lang.String str, android.content.Context context, android.graphics.Point point, android.graphics.Point point2) {
        org.json.JSONObject jSONObject = null;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("x", p184s3.C7147y.b().e(context, point2.x));
                    jSONObject3.put("y", p184s3.C7147y.b().e(context, point2.y));
                    jSONObject3.put("start_x", p184s3.C7147y.b().e(context, point.x));
                    jSONObject3.put("start_y", p184s3.C7147y.b().e(context, point.y));
                    jSONObject = jSONObject3;
                } catch (org.json.JSONException e6) {
                    p224w3.p.e("Error occurred while putting signals into JSON object.", e6);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (java.lang.Exception e10) {
                e = e10;
                jSONObject = jSONObject2;
                p224w3.p.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (java.lang.Exception e11) {
            e = e11;
        }
    }

    public static org.json.JSONObject d(android.content.Context context, java.util.Map map, java.util.Map map2, android.view.View view, android.widget.ImageView.ScaleType scaleType) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.String str3 = "ad_view";
        java.lang.String str4 = "relative_to";
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (map != null && view != null) {
            int[] iArrJ = j(view);
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrJ2 = j(view2);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    java.util.Iterator it2 = it;
                    try {
                        org.json.JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", p184s3.C7147y.b().e(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", p184s3.C7147y.b().e(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", p184s3.C7147y.b().e(context, iArrJ2[0] - iArrJ[0]));
                            jSONObject5.put("y", p184s3.C7147y.b().e(context, iArrJ2[1] - iArrJ[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            android.graphics.Rect rect = new android.graphics.Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = k(context, rect);
                            } else {
                                jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", p184s3.C7147y.b().e(context, iArrJ2[0] - iArrJ[0]));
                                jSONObject2.put("y", p184s3.C7147y.b().e(context, iArrJ2[1] - iArrJ[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((java.lang.String) entry.getKey()).equals("3010")) {
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25368O7)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25379P7)).booleanValue()) {
                                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", l(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", l(layoutParams.height) - 1);
                                }
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25390Q7)).booleanValue()) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(java.lang.Integer.valueOf(view2.getId()));
                                    for (android.view.ViewParent parent = view2.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                        arrayList.add(java.lang.Integer.valueOf(((android.view.View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", android.text.TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof android.widget.TextView) {
                                android.widget.TextView textView = (android.widget.TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (org.json.JSONException unused) {
                                    jSONObject = jSONObject6;
                                    p224w3.p.g("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((java.lang.String) entry.getKey(), jSONObject4);
                            } catch (org.json.JSONException unused2) {
                                p224w3.p.g("Unable to get asset views information");
                            }
                        } catch (org.json.JSONException unused3) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (org.json.JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static org.json.JSONObject e(android.content.Context context, android.view.View view) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                p174r3.v.t();
                jSONObject.put("can_show_on_lock_screen", p214v3.E0.T(view));
                p174r3.v.t();
                jSONObject.put("is_keyguard_locked", p214v3.E0.e(context));
            } catch (org.json.JSONException unused) {
                p224w3.p.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public static org.json.JSONObject f(android.view.View view) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                boolean z6 = true;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25357N7)).booleanValue()) {
                    p174r3.v.t();
                    android.view.ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof android.widget.ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent == null) {
                        z6 = false;
                    }
                } else {
                    p174r3.v.t();
                    android.view.ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof android.widget.AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if ((parent2 == null ? -1 : ((android.widget.AdapterView) parent2).getPositionForView(view)) == -1) {
                        z6 = false;
                    }
                }
                jSONObject.put("contained_in_scroll_view", z6);
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    public static org.json.JSONObject g(android.content.Context context, android.view.View view) {
        java.lang.String str;
        byte b6;
        org.json.JSONObject jSONObjectK;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                int[] iArrJ = j(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    iArr[0] = java.lang.Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                    iArr[1] = java.lang.Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("width", p184s3.C7147y.b().e(context, view.getMeasuredWidth()));
                jSONObject2.put("height", p184s3.C7147y.b().e(context, view.getMeasuredHeight()));
                jSONObject2.put("x", p184s3.C7147y.b().e(context, iArrJ[0]));
                jSONObject2.put("y", p184s3.C7147y.b().e(context, iArrJ[1]));
                jSONObject2.put("maximum_visible_width", p184s3.C7147y.b().e(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", p184s3.C7147y.b().e(context, iArr[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                android.graphics.Rect rect = new android.graphics.Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectK = k(context, rect);
                } else {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", p184s3.C7147y.b().e(context, iArrJ[0]));
                    jSONObject3.put("y", p184s3.C7147y.b().e(context, iArrJ[1]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectK = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectK);
            } catch (java.lang.Exception unused) {
                p224w3.p.g("Unable to get native ad view bounding box");
            }
            android.view.ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (java.lang.String) parent2.getClass().getMethod("getTemplateTypeName", null).invoke(parent2, null);
                } catch (java.lang.IllegalAccessException e6) {
                    e = e6;
                    p224w3.p.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (java.lang.NoSuchMethodException unused2) {
                    str = "";
                } catch (java.lang.SecurityException e10) {
                    e = e10;
                    p224w3.p.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (java.lang.reflect.InvocationTargetException e11) {
                    e = e11;
                    p224w3.p.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                }
            } else {
                str = "";
            }
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        b6 = 1;
                    } else {
                        b6 = -1;
                    }
                } else if (str.equals("small_template")) {
                    b6 = 0;
                } else {
                    b6 = -1;
                }
                if (b6 == 0) {
                    jSONObject.put("native_template_type", 1);
                } else if (b6 != 1) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (org.json.JSONException e12) {
                p224w3.p.e("Could not log native template signal to JSON", e12);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25379P7)).booleanValue()) {
                try {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    jSONObject.put("view_width_layout_type", l(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", l(layoutParams.height) - 1);
                } catch (java.lang.Exception unused3) {
                    p214v3.AbstractC7265q0.k("Unable to get native ad view layout types");
                }
            }
        }
        return jSONObject;
    }

    public static boolean h(android.content.Context context, com.google.android.gms.internal.ads.R60 r60) {
        if (!r60.f31147N) {
            return false;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25401R7)).booleanValue()) {
            return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25445V7)).booleanValue();
        }
        java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25412S7);
        if (!str.isEmpty() && context != null) {
            java.lang.String packageName = context.getPackageName();
            java.util.Iterator it = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25222B3)).booleanValue()) {
            return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25232C3)).booleanValue() || i6 <= 15299999;
        }
        return true;
    }

    public static int[] j(android.view.View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static org.json.JSONObject k(android.content.Context context, android.graphics.Rect rect) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", p184s3.C7147y.b().e(context, rect.right - rect.left));
        jSONObject.put("height", p184s3.C7147y.b().e(context, rect.bottom - rect.top));
        jSONObject.put("x", p184s3.C7147y.b().e(context, rect.left));
        jSONObject.put("y", p184s3.C7147y.b().e(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int l(int i6) {
        if (i6 != -2) {
            return i6 != -1 ? 2 : 3;
        }
        return 4;
    }
}
