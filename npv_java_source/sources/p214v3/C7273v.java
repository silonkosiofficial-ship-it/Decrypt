package p214v3;

/* JADX INFO: renamed from: v3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7273v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f55936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f55937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f55938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f55939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f55940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f55941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f55942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f55943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.graphics.PointF f55944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.graphics.PointF f55945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.os.Handler f55946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.lang.Runnable f55947l;

    public C7273v(android.content.Context context) {
        this.f55942g = 0;
        this.f55947l = new java.lang.Runnable() { // from class: v3.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f55885C.g();
            }
        };
        this.f55936a = context;
        this.f55943h = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        p174r3.v.x().b();
        this.f55946k = p174r3.v.x().a();
        this.f55937b = p174r3.v.w().a();
    }

    public C7273v(android.content.Context context, java.lang.String str) {
        this(context);
        this.f55938c = str;
    }

    private final void s(android.content.Context context) {
        final int i6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iU = u(arrayList, "None", true);
        final int iU2 = u(arrayList, "Shake", true);
        final int iU3 = u(arrayList, "Flick", true);
        int iOrdinal = this.f55937b.b().ordinal();
        if (iOrdinal != 1) {
            i6 = iOrdinal != 2 ? iU : iU3;
        } else {
            i6 = iU2;
        }
        p174r3.v.t();
        android.app.AlertDialog.Builder builderL = p214v3.E0.l(context);
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(i6);
        builderL.setTitle("Setup gesture");
        builderL.setSingleChoiceItems((java.lang.CharSequence[]) arrayList.toArray(new java.lang.String[0]), i6, new android.content.DialogInterface.OnClickListener() { // from class: v3.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i10) {
                atomicInteger.set(i10);
            }
        });
        builderL.setNegativeButton("Dismiss", new android.content.DialogInterface.OnClickListener() { // from class: v3.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i10) {
                this.f55921C.r();
            }
        });
        builderL.setPositiveButton("Save", new android.content.DialogInterface.OnClickListener() { // from class: v3.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i10) {
                this.f55922C.h(atomicInteger, i6, iU2, iU3, dialogInterface, i10);
            }
        });
        builderL.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: v3.r
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                this.f55927C.r();
            }
        });
        builderL.create().show();
    }

    private final boolean t(float f6, float f10, float f11, float f12) {
        return java.lang.Math.abs(this.f55944i.x - f6) < ((float) this.f55943h) && java.lang.Math.abs(this.f55944i.y - f10) < ((float) this.f55943h) && java.lang.Math.abs(this.f55945j.x - f11) < ((float) this.f55943h) && java.lang.Math.abs(this.f55945j.y - f12) < ((float) this.f55943h);
    }

    private static final int u(java.util.List list, java.lang.String str, boolean z6) {
        if (!z6) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        s(this.f55936a);
    }

    final /* synthetic */ void b(com.google.android.gms.internal.ads.Yk0 yk0) {
        if (p174r3.v.w().j(this.f55936a, this.f55939d, this.f55940e)) {
            yk0.execute(new java.lang.Runnable() { // from class: v3.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55896C.c();
                }
            });
        } else {
            p174r3.v.w().d(this.f55936a, this.f55939d, this.f55940e);
        }
    }

    final /* synthetic */ void c() {
        s(this.f55936a);
    }

    final /* synthetic */ void d() {
        p174r3.v.w().c(this.f55936a);
    }

    final /* synthetic */ void e(com.google.android.gms.internal.ads.Yk0 yk0) {
        if (p174r3.v.w().j(this.f55936a, this.f55939d, this.f55940e)) {
            yk0.execute(new java.lang.Runnable() { // from class: v3.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55893C.f();
                }
            });
        } else {
            p174r3.v.w().d(this.f55936a, this.f55939d, this.f55940e);
        }
    }

    final /* synthetic */ void f() {
        p174r3.v.w().c(this.f55936a);
    }

    final /* synthetic */ void g() {
        this.f55942g = 4;
        r();
    }

    final /* synthetic */ void h(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i6, int i10, int i11, android.content.DialogInterface dialogInterface, int i12) {
        com.google.android.gms.internal.ads.KP kp;
        com.google.android.gms.internal.ads.GP gp;
        if (atomicInteger.get() != i6) {
            if (atomicInteger.get() == i10) {
                kp = this.f55937b;
                gp = com.google.android.gms.internal.ads.GP.SHAKE;
            } else if (atomicInteger.get() == i11) {
                kp = this.f55937b;
                gp = com.google.android.gms.internal.ads.GP.FLICK;
            } else {
                kp = this.f55937b;
                gp = com.google.android.gms.internal.ads.GP.NONE;
            }
            kp.n(gp);
        }
        r();
    }

    final /* synthetic */ void i(java.lang.String str, android.content.DialogInterface dialogInterface, int i6) {
        p174r3.v.t();
        p214v3.E0.t(this.f55936a, android.content.Intent.createChooser(new android.content.Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i6, int i10, int i11, int i12, int i13, android.content.DialogInterface dialogInterface, int i14) {
        if (i14 != i6) {
            if (i14 == i10) {
                p224w3.p.b("Debug mode [Creative Preview] selected.");
                com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: v3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55887C.l();
                    }
                });
                return;
            }
            if (i14 == i11) {
                p224w3.p.b("Debug mode [Troubleshooting] selected.");
                com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: v3.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55932C.k();
                    }
                });
                return;
            }
            if (i14 == i12) {
                com.google.android.gms.internal.ads.KP kp = this.f55937b;
                final com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;
                com.google.android.gms.internal.ads.Yk0 yk1 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
                if (kp.r()) {
                    yk0.execute(new java.lang.Runnable() { // from class: v3.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f55928C.d();
                        }
                    });
                    return;
                } else {
                    yk1.execute(new java.lang.Runnable() { // from class: v3.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f55929C.e(yk0);
                        }
                    });
                    return;
                }
            }
            if (i14 == i13) {
                com.google.android.gms.internal.ads.KP kp2 = this.f55937b;
                final com.google.android.gms.internal.ads.Yk0 yk2 = com.google.android.gms.internal.ads.AbstractC3524dr.f34800f;
                com.google.android.gms.internal.ads.Yk0 yk3 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
                if (kp2.r()) {
                    yk2.execute(new java.lang.Runnable() { // from class: v3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f55881C.a();
                        }
                    });
                    return;
                } else {
                    yk3.execute(new java.lang.Runnable() { // from class: v3.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f55898C.b(yk2);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f55936a instanceof android.app.Activity)) {
            p224w3.p.f("Can not create dialog without Activity Context");
            return;
        }
        java.lang.String str = this.f55938c;
        final java.lang.String str2 = "No debug information";
        if (!android.text.TextUtils.isEmpty(str)) {
            android.net.Uri uriBuild = new android.net.Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            p174r3.v.t();
            java.util.Map mapP = p214v3.E0.p(uriBuild);
            for (java.lang.String str3 : mapP.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((java.lang.String) mapP.get(str3));
                sb.append("\n\n");
            }
            java.lang.String strTrim = sb.toString().trim();
            if (!android.text.TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        p174r3.v.t();
        android.app.AlertDialog.Builder builderL = p214v3.E0.l(this.f55936a);
        builderL.setMessage(str2);
        builderL.setTitle("Ad Information");
        builderL.setPositiveButton("Share", new android.content.DialogInterface.OnClickListener() { // from class: v3.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface2, int i15) {
                this.f55888C.i(str2, dialogInterface2, i15);
            }
        });
        builderL.setNegativeButton("Close", new android.content.DialogInterface.OnClickListener() { // from class: v3.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface2, int i15) {
            }
        });
        builderL.create().show();
    }

    final /* synthetic */ void k() {
        p214v3.C7280z c7280zW = p174r3.v.w();
        java.lang.String str = this.f55939d;
        java.lang.String str2 = this.f55940e;
        java.lang.String str3 = this.f55941f;
        boolean zM = c7280zW.m();
        android.content.Context context = this.f55936a;
        c7280zW.h(c7280zW.j(context, str, str2));
        if (!c7280zW.m()) {
            c7280zW.d(context, str, str2);
            return;
        }
        if (!zM && !android.text.TextUtils.isEmpty(str3)) {
            c7280zW.e(context, str2, str3, str);
        }
        p224w3.p.b("Device is linked for debug signals.");
        c7280zW.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        p214v3.C7280z c7280zW = p174r3.v.w();
        android.content.Context context = this.f55936a;
        java.lang.String str = this.f55939d;
        java.lang.String str2 = this.f55940e;
        if (!c7280zW.k(context, str, str2)) {
            c7280zW.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(c7280zW.f55997f)) {
            p224w3.p.b("Creative is not pushed for this device.");
            c7280zW.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(c7280zW.f55997f)) {
            p224w3.p.b("The app is not linked for creative preview.");
            c7280zW.d(context, str, str2);
        } else if ("0".equals(c7280zW.f55997f)) {
            p224w3.p.b("Device is linked for in app preview.");
            c7280zW.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f55942g = 0;
            this.f55944i = new android.graphics.PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i6 = this.f55942g;
        if (i6 == -1) {
            return;
        }
        if (i6 == 0) {
            if (actionMasked == 5) {
                this.f55942g = 5;
                this.f55945j = new android.graphics.PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f55946k.postDelayed(this.f55947l, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25310J4)).longValue());
                return;
            }
            return;
        }
        if (i6 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z6 = false;
                for (int i10 = 0; i10 < historySize; i10++) {
                    z6 |= !t(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z6) {
                    return;
                }
            }
            this.f55942g = -1;
            this.f55946k.removeCallbacks(this.f55947l);
        }
    }

    public final void n(java.lang.String str) {
        this.f55939d = str;
    }

    public final void o(java.lang.String str) {
        this.f55940e = str;
    }

    public final void p(java.lang.String str) {
        this.f55938c = str;
    }

    public final void q(java.lang.String str) {
        this.f55941f = str;
    }

    public final void r() {
        try {
            if (!(this.f55936a instanceof android.app.Activity)) {
                p224w3.p.f("Can not create dialog without Activity Context");
                return;
            }
            java.lang.String str = "Creative preview (enabled)";
            if (true == android.text.TextUtils.isEmpty(p174r3.v.w().b())) {
                str = "Creative preview";
            }
            java.lang.String str2 = true != p174r3.v.w().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final int iU = u(arrayList, "Ad information", true);
            final int iU2 = u(arrayList, str, true);
            final int iU3 = u(arrayList, str2, true);
            boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25533d9)).booleanValue();
            final int iU4 = u(arrayList, "Open ad inspector", zBooleanValue);
            final int iU5 = u(arrayList, "Ad inspector settings", zBooleanValue);
            p174r3.v.t();
            android.app.AlertDialog.Builder builderL = p214v3.E0.l(this.f55936a);
            builderL.setTitle("Select a debug mode").setItems((java.lang.CharSequence[]) arrayList.toArray(new java.lang.String[0]), new android.content.DialogInterface.OnClickListener() { // from class: v3.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                    this.f55905C.j(iU, iU2, iU3, iU4, iU5, dialogInterface, i6);
                }
            });
            builderL.create().show();
        } catch (android.view.WindowManager.BadTokenException e6) {
            p214v3.AbstractC7265q0.l("", e6);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f55938c);
        sb.append(",DebugSignal: ");
        sb.append(this.f55941f);
        sb.append(",AFMA Version: ");
        sb.append(this.f55940e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f55939d);
        sb.append("}");
        return sb.toString();
    }
}
