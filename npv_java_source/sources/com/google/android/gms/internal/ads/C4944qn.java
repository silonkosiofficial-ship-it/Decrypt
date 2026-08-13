package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4944qn extends com.google.android.gms.internal.ads.C5603wn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f38318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.Object f38326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f38327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final android.app.Activity f38328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2625Mu f38329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private android.widget.ImageView f38330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private android.widget.LinearLayout f38331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5713xn f38332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private android.widget.PopupWindow f38333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private android.widget.RelativeLayout f38334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private android.view.ViewGroup f38335t;

    static {
        V3.g.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public C4944qn(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC5713xn interfaceC5713xn) {
        super(interfaceC2698Ot, "resize");
        this.f38318c = "top-right";
        this.f38319d = true;
        this.f38320e = 0;
        this.f38321f = 0;
        this.f38322g = -1;
        this.f38323h = 0;
        this.f38324i = 0;
        this.f38325j = -1;
        this.f38326k = new java.lang.Object();
        this.f38327l = interfaceC2698Ot;
        this.f38328m = interfaceC2698Ot.h();
        this.f38332q = interfaceC5713xn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void j(boolean z6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ja)).booleanValue()) {
            this.f38334s.removeView((android.view.View) this.f38327l);
            this.f38333r.dismiss();
        } else {
            this.f38333r.dismiss();
            this.f38334s.removeView((android.view.View) this.f38327l);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ka)).booleanValue()) {
            android.view.ViewParent parent = ((android.view.View) this.f38327l).getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView((android.view.View) this.f38327l);
            }
        }
        android.view.ViewGroup viewGroup = this.f38335t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f38330o);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.La)).booleanValue()) {
                try {
                    this.f38335t.addView((android.view.View) this.f38327l);
                    this.f38327l.l1(this.f38329n);
                } catch (java.lang.IllegalStateException e6) {
                    p224w3.p.e("Unable to add webview back to view hierarchy.", e6);
                }
            } else {
                this.f38335t.addView((android.view.View) this.f38327l);
                this.f38327l.l1(this.f38329n);
            }
        }
        if (z6) {
            g("default");
            com.google.android.gms.internal.ads.InterfaceC5713xn interfaceC5713xn = this.f38332q;
            if (interfaceC5713xn != null) {
                interfaceC5713xn.b();
            }
        }
        this.f38333r = null;
        this.f38334s = null;
        this.f38335t = null;
        this.f38331p = null;
    }

    public final void h(final boolean z6) {
        synchronized (this.f38326k) {
            try {
                if (this.f38333r != null) {
                    if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ia)).booleanValue() || android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                        j(z6);
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.r(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.on
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f37868C.j(z6);
                            }
                        });
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x025a A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:64:0x013a, B:130:0x025a, B:131:0x025f, B:133:0x0261, B:135:0x0281, B:137:0x0285, B:139:0x0292, B:141:0x02ce, B:173:0x0387, B:174:0x038a, B:182:0x03ab, B:183:0x03c3, B:184:0x03e4, B:186:0x03ec, B:187:0x03f3, B:188:0x0419, B:191:0x041c, B:193:0x0441, B:194:0x0456, B:175:0x038e, B:176:0x0392, B:177:0x0396, B:178:0x0399, B:179:0x039d, B:180:0x03a3, B:181:0x03a7, B:140:0x02cb, B:196:0x0458, B:197:0x045d, B:66:0x0140, B:68:0x0144, B:96:0x0197, B:97:0x01a1, B:106:0x01f4, B:108:0x01f7, B:110:0x01fb, B:113:0x0202, B:98:0x01a5, B:99:0x01af, B:100:0x01b6, B:101:0x01c2, B:102:0x01ca, B:103:0x01de, B:104:0x01ea, B:114:0x0211, B:120:0x023b, B:126:0x024b, B:123:0x0241, B:125:0x0249, B:117:0x0233, B:119:0x0239, B:199:0x045f, B:200:0x0464, B:202:0x0466, B:203:0x046b), top: B:207:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0261 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:64:0x013a, B:130:0x025a, B:131:0x025f, B:133:0x0261, B:135:0x0281, B:137:0x0285, B:139:0x0292, B:141:0x02ce, B:173:0x0387, B:174:0x038a, B:182:0x03ab, B:183:0x03c3, B:184:0x03e4, B:186:0x03ec, B:187:0x03f3, B:188:0x0419, B:191:0x041c, B:193:0x0441, B:194:0x0456, B:175:0x038e, B:176:0x0392, B:177:0x0396, B:178:0x0399, B:179:0x039d, B:180:0x03a3, B:181:0x03a7, B:140:0x02cb, B:196:0x0458, B:197:0x045d, B:66:0x0140, B:68:0x0144, B:96:0x0197, B:97:0x01a1, B:106:0x01f4, B:108:0x01f7, B:110:0x01fb, B:113:0x0202, B:98:0x01a5, B:99:0x01af, B:100:0x01b6, B:101:0x01c2, B:102:0x01ca, B:103:0x01de, B:104:0x01ea, B:114:0x0211, B:120:0x023b, B:126:0x024b, B:123:0x0241, B:125:0x0249, B:117:0x0233, B:119:0x0239, B:199:0x045f, B:200:0x0464, B:202:0x0466, B:203:0x046b), top: B:207:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0370  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ec A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012c, B:64:0x013a, B:130:0x025a, B:131:0x025f, B:133:0x0261, B:135:0x0281, B:137:0x0285, B:139:0x0292, B:141:0x02ce, B:173:0x0387, B:174:0x038a, B:182:0x03ab, B:183:0x03c3, B:184:0x03e4, B:186:0x03ec, B:187:0x03f3, B:188:0x0419, B:191:0x041c, B:193:0x0441, B:194:0x0456, B:175:0x038e, B:176:0x0392, B:177:0x0396, B:178:0x0399, B:179:0x039d, B:180:0x03a3, B:181:0x03a7, B:140:0x02cb, B:196:0x0458, B:197:0x045d, B:66:0x0140, B:68:0x0144, B:96:0x0197, B:97:0x01a1, B:106:0x01f4, B:108:0x01f7, B:110:0x01fb, B:113:0x0202, B:98:0x01a5, B:99:0x01af, B:100:0x01b6, B:101:0x01c2, B:102:0x01ca, B:103:0x01de, B:104:0x01ea, B:114:0x0211, B:120:0x023b, B:126:0x024b, B:123:0x0241, B:125:0x0249, B:117:0x0233, B:119:0x0239, B:199:0x045f, B:200:0x0464, B:202:0x0466, B:203:0x046b), top: B:207:0x0007, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:0x018a  */
    public final void i(java.util.Map map) {
        java.lang.String str;
        int[] iArr;
        android.view.ViewParent parent;
        byte b6;
        int i6;
        int i10;
        com.google.android.gms.internal.ads.InterfaceC5713xn interfaceC5713xn;
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        synchronized (this.f38326k) {
            try {
                if (this.f38328m == null) {
                    c("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.f38327l.I() == null) {
                    c("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.f38327l.I().i()) {
                    c("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (this.f38327l.R0()) {
                    c("Cannot resize an expanded banner.");
                    return;
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("width"))) {
                    p174r3.v.t();
                    this.f38325j = p214v3.E0.o((java.lang.String) map.get("width"));
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("height"))) {
                    p174r3.v.t();
                    this.f38322g = p214v3.E0.o((java.lang.String) map.get("height"));
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("offsetX"))) {
                    p174r3.v.t();
                    this.f38323h = p214v3.E0.o((java.lang.String) map.get("offsetX"));
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("offsetY"))) {
                    p174r3.v.t();
                    this.f38324i = p214v3.E0.o((java.lang.String) map.get("offsetY"));
                }
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("allowOffscreen"))) {
                    this.f38319d = java.lang.Boolean.parseBoolean((java.lang.String) map.get("allowOffscreen"));
                }
                java.lang.String str2 = (java.lang.String) map.get("customClosePosition");
                if (!android.text.TextUtils.isEmpty(str2)) {
                    this.f38318c = str2;
                }
                if (this.f38325j < 0 || this.f38322g < 0) {
                    c("Invalid width and height options. Cannot resize.");
                    return;
                }
                android.view.Window window = this.f38328m.getWindow();
                if (window != null && window.getDecorView() != null) {
                    p174r3.v.t();
                    int[] iArrV = p214v3.E0.v(this.f38328m);
                    p174r3.v.t();
                    int[] iArrR = p214v3.E0.r(this.f38328m);
                    int i15 = iArrV[0];
                    int i16 = iArrV[1];
                    int i17 = this.f38325j;
                    if (i17 < 50 || i17 > i15) {
                        str = "Width is too small or too large.";
                    } else {
                        int i18 = this.f38322g;
                        if (i18 < 50 || i18 > i16) {
                            str = "Height is too small or too large.";
                        } else {
                            if (i18 == i16 && i17 == i15) {
                                str = "Cannot resize to a full-screen ad.";
                            } else if (this.f38319d) {
                                switch (this.f38318c) {
                                    case "center":
                                        b10 = 2;
                                        break;
                                    case "top-left":
                                        b10 = 0;
                                        break;
                                    case "bottom-left":
                                        b10 = 3;
                                        break;
                                    case "bottom-right":
                                        b10 = 5;
                                        break;
                                    case "bottom-center":
                                        b10 = 4;
                                        break;
                                    case "top-center":
                                        b10 = 1;
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                if (b10 == 0) {
                                    i11 = this.f38320e + this.f38323h;
                                    i12 = this.f38321f;
                                } else if (b10 != 1) {
                                    if (b10 != 2) {
                                        if (b10 == 3) {
                                            i11 = this.f38320e + this.f38323h;
                                            i14 = this.f38321f;
                                        } else if (b10 == 4) {
                                            i11 = ((this.f38320e + this.f38323h) + (i17 >> 1)) - 25;
                                            i14 = this.f38321f;
                                        } else if (b10 != 5) {
                                            i11 = ((this.f38320e + this.f38323h) + i17) - 50;
                                            i12 = this.f38321f;
                                        } else {
                                            i11 = ((this.f38320e + this.f38323h) + i17) - 50;
                                            i14 = this.f38321f;
                                        }
                                        i13 = ((i14 + this.f38324i) + i18) - 50;
                                    } else {
                                        i11 = ((this.f38320e + this.f38323h) + (i17 >> 1)) - 25;
                                        i13 = ((this.f38321f + this.f38324i) + (i18 >> 1)) - 25;
                                    }
                                    if (i11 >= 0 || i11 + 50 > i15 || i13 < iArrR[0] || i13 + 50 > iArrR[1]) {
                                        iArr = null;
                                    } else {
                                        iArr = new int[]{this.f38320e + this.f38323h, this.f38321f + this.f38324i};
                                    }
                                } else {
                                    i11 = ((this.f38320e + this.f38323h) + (i17 >> 1)) - 25;
                                    i12 = this.f38321f;
                                }
                                i13 = i12 + this.f38324i;
                                if (i11 >= 0) {
                                    iArr = null;
                                } else {
                                    iArr = null;
                                }
                            } else {
                                p174r3.v.t();
                                int[] iArrV2 = p214v3.E0.v(this.f38328m);
                                p174r3.v.t();
                                int[] iArrR2 = p214v3.E0.r(this.f38328m);
                                int i19 = iArrV2[0];
                                int i20 = this.f38320e + this.f38323h;
                                int i21 = this.f38321f + this.f38324i;
                                if (i20 < 0) {
                                    i20 = 0;
                                } else {
                                    int i22 = this.f38325j;
                                    if (i20 + i22 > i19) {
                                        i20 = i19 - i22;
                                    }
                                }
                                int i23 = iArrR2[0];
                                if (i21 < i23) {
                                    i21 = i23;
                                } else {
                                    int i24 = this.f38322g;
                                    int i25 = i21 + i24;
                                    int i26 = iArrR2[1];
                                    if (i25 > i26) {
                                        i21 = i26 - i24;
                                    }
                                }
                                iArr = new int[]{i20, i21};
                            }
                            if (iArr == null) {
                                c("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            p184s3.C7147y.b();
                            int iZ = p224w3.g.z(this.f38328m, this.f38325j);
                            p184s3.C7147y.b();
                            int iZ2 = p224w3.g.z(this.f38328m, this.f38322g);
                            parent = ((android.view.View) this.f38327l).getParent();
                            if (parent != null || !(parent instanceof android.view.ViewGroup)) {
                                c("Webview is detached, probably in the middle of a resize or expand.");
                                return;
                            }
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                            viewGroup.removeView((android.view.View) this.f38327l);
                            android.widget.PopupWindow popupWindow = this.f38333r;
                            if (popupWindow == null) {
                                this.f38335t = viewGroup;
                                p174r3.v.t();
                                java.lang.Object obj = this.f38327l;
                                ((android.view.View) obj).setDrawingCacheEnabled(true);
                                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(((android.view.View) obj).getDrawingCache());
                                ((android.view.View) obj).setDrawingCacheEnabled(false);
                                android.widget.ImageView imageView = new android.widget.ImageView(this.f38328m);
                                this.f38330o = imageView;
                                imageView.setImageBitmap(bitmapCreateBitmap);
                                this.f38329n = this.f38327l.I();
                                this.f38335t.addView(this.f38330o);
                            } else {
                                popupWindow.dismiss();
                            }
                            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.f38328m);
                            this.f38334s = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.f38334s.setLayoutParams(new android.view.ViewGroup.LayoutParams(iZ, iZ2));
                            p174r3.v.t();
                            android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow((android.view.View) this.f38334s, iZ, iZ2, false);
                            this.f38333r = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.f38333r.setTouchable(true);
                            this.f38333r.setClippingEnabled(!this.f38319d);
                            this.f38334s.addView((android.view.View) this.f38327l, -1, -1);
                            this.f38331p = new android.widget.LinearLayout(this.f38328m);
                            p184s3.C7147y.b();
                            int iZ3 = p224w3.g.z(this.f38328m, 50);
                            p184s3.C7147y.b();
                            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iZ3, p224w3.g.z(this.f38328m, 50));
                            switch (this.f38318c) {
                                case "center":
                                    b6 = 2;
                                    break;
                                case "top-left":
                                    b6 = 0;
                                    break;
                                case "bottom-left":
                                    b6 = 3;
                                    break;
                                case "bottom-right":
                                    b6 = 5;
                                    break;
                                case "bottom-center":
                                    b6 = 4;
                                    break;
                                case "top-center":
                                    b6 = 1;
                                    break;
                                default:
                                    b6 = -1;
                                    break;
                            }
                            try {
                                if (b6 != 0) {
                                    int i27 = 14;
                                    if (b6 != 1) {
                                        if (b6 == 2) {
                                            layoutParams.addRule(13);
                                        } else if (b6 == 3) {
                                            layoutParams.addRule(12);
                                        } else if (b6 != 4) {
                                            i27 = 11;
                                            if (b6 != 5) {
                                                layoutParams.addRule(10);
                                            } else {
                                                layoutParams.addRule(12);
                                            }
                                        } else {
                                            layoutParams.addRule(12);
                                        }
                                        this.f38331p.setOnClickListener(new com.google.android.gms.internal.ads.ViewOnClickListenerC4834pn(this));
                                        this.f38331p.setContentDescription("Close button");
                                        this.f38334s.addView(this.f38331p, layoutParams);
                                        android.widget.PopupWindow popupWindow3 = this.f38333r;
                                        android.view.View decorView = window.getDecorView();
                                        p184s3.C7147y.b();
                                        int iZ4 = p224w3.g.z(this.f38328m, iArr[0]);
                                        p184s3.C7147y.b();
                                        popupWindow3.showAtLocation(decorView, 0, iZ4, p224w3.g.z(this.f38328m, iArr[1]));
                                        i6 = iArr[0];
                                        i10 = iArr[1];
                                        interfaceC5713xn = this.f38332q;
                                        if (interfaceC5713xn != null) {
                                            interfaceC5713xn.a(i6, i10, this.f38325j, this.f38322g);
                                        }
                                        this.f38327l.l1(com.google.android.gms.internal.ads.C2625Mu.b(iZ, iZ2));
                                        int i28 = iArr[0];
                                        int i29 = iArr[1];
                                        p174r3.v.t();
                                        f(i28, i29 - p214v3.E0.r(this.f38328m)[0], this.f38325j, this.f38322g);
                                        g("resized");
                                        return;
                                    }
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(i27);
                                    this.f38331p.setOnClickListener(new com.google.android.gms.internal.ads.ViewOnClickListenerC4834pn(this));
                                    this.f38331p.setContentDescription("Close button");
                                    this.f38334s.addView(this.f38331p, layoutParams);
                                    android.widget.PopupWindow popupWindow4 = this.f38333r;
                                    android.view.View decorView2 = window.getDecorView();
                                    p184s3.C7147y.b();
                                    int iZ5 = p224w3.g.z(this.f38328m, iArr[0]);
                                    p184s3.C7147y.b();
                                    popupWindow4.showAtLocation(decorView2, 0, iZ5, p224w3.g.z(this.f38328m, iArr[1]));
                                    i6 = iArr[0];
                                    i10 = iArr[1];
                                    interfaceC5713xn = this.f38332q;
                                    if (interfaceC5713xn != null) {
                                        interfaceC5713xn.a(i6, i10, this.f38325j, this.f38322g);
                                    }
                                    this.f38327l.l1(com.google.android.gms.internal.ads.C2625Mu.b(iZ, iZ2));
                                    int i210 = iArr[0];
                                    int i211 = iArr[1];
                                    p174r3.v.t();
                                    f(i210, i211 - p214v3.E0.r(this.f38328m)[0], this.f38325j, this.f38322g);
                                    g("resized");
                                    return;
                                }
                                layoutParams.addRule(10);
                                android.widget.PopupWindow popupWindow5 = this.f38333r;
                                android.view.View decorView3 = window.getDecorView();
                                p184s3.C7147y.b();
                                int iZ6 = p224w3.g.z(this.f38328m, iArr[0]);
                                p184s3.C7147y.b();
                                popupWindow5.showAtLocation(decorView3, 0, iZ6, p224w3.g.z(this.f38328m, iArr[1]));
                                i6 = iArr[0];
                                i10 = iArr[1];
                                interfaceC5713xn = this.f38332q;
                                if (interfaceC5713xn != null) {
                                    interfaceC5713xn.a(i6, i10, this.f38325j, this.f38322g);
                                }
                                this.f38327l.l1(com.google.android.gms.internal.ads.C2625Mu.b(iZ, iZ2));
                                int i212 = iArr[0];
                                int i213 = iArr[1];
                                p174r3.v.t();
                                f(i212, i213 - p214v3.E0.r(this.f38328m)[0], this.f38325j, this.f38322g);
                                g("resized");
                                return;
                            } catch (java.lang.RuntimeException e6) {
                                c("Cannot show popup window: " + e6.getMessage());
                                this.f38334s.removeView((android.view.View) this.f38327l);
                                android.view.ViewGroup viewGroup2 = this.f38335t;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(this.f38330o);
                                    this.f38335t.addView((android.view.View) this.f38327l);
                                    this.f38327l.l1(this.f38329n);
                                }
                                return;
                            }
                            layoutParams.addRule(9);
                            this.f38331p.setOnClickListener(new com.google.android.gms.internal.ads.ViewOnClickListenerC4834pn(this));
                            this.f38331p.setContentDescription("Close button");
                            this.f38334s.addView(this.f38331p, layoutParams);
                        }
                    }
                    p224w3.p.g(str);
                    iArr = null;
                    if (iArr == null) {
                        c("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    p184s3.C7147y.b();
                    int iZ7 = p224w3.g.z(this.f38328m, this.f38325j);
                    p184s3.C7147y.b();
                    int iZ8 = p224w3.g.z(this.f38328m, this.f38322g);
                    parent = ((android.view.View) this.f38327l).getParent();
                    if (parent != null) {
                    }
                    c("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                c("Activity context is not ready, cannot get window or decor view.");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void k(int i6, int i10, boolean z6) {
        synchronized (this.f38326k) {
            this.f38320e = i6;
            this.f38321f = i10;
        }
    }

    public final void l(int i6, int i10) {
        this.f38320e = i6;
        this.f38321f = i10;
    }

    public final boolean m() {
        boolean z6;
        synchronized (this.f38326k) {
            z6 = this.f38333r != null;
        }
        return z6;
    }
}
