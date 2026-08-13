package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5240tT extends com.google.android.gms.internal.ads.AbstractBinderC2286Dn {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Map f38946C = new java.util.HashMap();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f38947D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f38948E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p224w3.v f38949F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f38950G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.lang.String f38951H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.String f38952I;

    public BinderC5240tT(android.content.Context context, com.google.android.gms.internal.ads.C4033iT c4033iT, p224w3.v vVar, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f38947D = context;
        this.f38948E = c3588eO;
        this.f38949F = vVar;
        this.f38950G = c4033iT;
    }

    private final java.lang.String A() {
        com.google.android.gms.internal.ads.AbstractC3155aT abstractC3155aT = (com.google.android.gms.internal.ads.AbstractC3155aT) this.f38946C.get(this.f38951H);
        return abstractC3155aT == null ? "" : abstractC3155aT.b();
    }

    private static android.content.res.XmlResourceParser A6(int i6) {
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        if (resourcesF == null) {
            return null;
        }
        try {
            return resourcesF.getLayout(i6);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    private static java.lang.String B6(int i6, java.lang.String str) {
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        if (resourcesF == null) {
            return str;
        }
        try {
            return resourcesF.getString(i6);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void C() {
        boolean zZzg;
        try {
            p174r3.v.t();
            p214v3.U uA = p214v3.E0.a(this.f38947D);
            X3.a aVarC2 = X3.b.c2(this.f38947D);
            java.lang.String str = this.f38952I;
            java.lang.String str2 = this.f38951H;
            com.google.android.gms.internal.ads.AbstractC3155aT abstractC3155aT = (com.google.android.gms.internal.ads.AbstractC3155aT) this.f38946C.get(str2);
            zZzg = uA.zzg(aVarC2, new p194t3.a(str, str2, abstractC3155aT == null ? "" : abstractC3155aT.c()));
            if (!zZzg) {
                try {
                    zZzg = uA.zzf(X3.b.c2(this.f38947D), this.f38952I, this.f38951H);
                } catch (android.os.RemoteException e6) {
                    e = e6;
                    p224w3.p.e("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (android.os.RemoteException e10) {
            e = e10;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.f38950G.g(this.f38951H);
        C6(this.f38951H, "offline_notification_worker_not_scheduled", com.google.android.gms.internal.ads.AbstractC3727fi0.d());
    }

    private final void C6(java.lang.String str, java.lang.String str2, java.util.Map map) {
        q6(this.f38947D, this.f38948E, this.f38950G, str, str2, map);
    }

    private final void D6(final android.app.Activity activity, final p204u3.x xVar) {
        p174r3.v.t();
        if (androidx.core.app.m.b(activity).a()) {
            C();
            E6(activity, xVar);
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                C6(this.f38951H, "asnpdi", com.google.android.gms.internal.ads.AbstractC3727fi0.d());
                return;
            }
            p174r3.v.t();
            android.app.AlertDialog.Builder builderL = p214v3.E0.l(activity);
            builderL.setTitle(B6(p154p3.d.f52736f, "Allow app to send you notifications?")).setPositiveButton(B6(p154p3.d.f52734d, "Allow"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.mT
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                    this.f37354C.r6(activity, xVar, dialogInterface, i6);
                }
            }).setNegativeButton(B6(p154p3.d.f52735e, "Don't allow"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.nT
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                    this.f37601C.s6(xVar, dialogInterface, i6);
                }
            }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.oT
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(android.content.DialogInterface dialogInterface) {
                    this.f37817C.t6(xVar, dialogInterface);
                }
            });
            builderL.create().show();
            C6(this.f38951H, "rtsdi", com.google.android.gms.internal.ads.AbstractC3727fi0.d());
        }
    }

    private final void E6(android.app.Activity activity, p204u3.x xVar) {
        android.app.AlertDialog alertDialogZ6 = z6(activity, xVar);
        alertDialogZ6.show();
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.google.android.gms.internal.ads.C5130sT(this, alertDialogZ6, timer, xVar), 3000L);
    }

    public static void p6(android.content.Context context, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C4033iT c4033iT, java.lang.String str, java.lang.String str2) {
        q6(context, c3588eO, c4033iT, str, str2, new java.util.HashMap());
    }

    public static void q6(android.content.Context context, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C4033iT c4033iT, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.String strE;
        java.lang.String str3 = true != p174r3.v.s().a(context) ? "offline" : "online";
        if (c3588eO != null) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
            c3479dOA.b("gqi", str);
            c3479dOA.b("action", str2);
            c3479dOA.b("device_connectivity", str3);
            c3479dOA.b("event_timestamp", java.lang.String.valueOf(p174r3.v.c().a()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                c3479dOA.b((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            strE = c3479dOA.e();
        } else {
            strE = "";
        }
        c4033iT.i(new com.google.android.gms.internal.ads.C4251kT(p174r3.v.c().a(), str, strE, 2));
    }

    public static final android.app.PendingIntent y6(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (android.os.Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return com.google.android.gms.internal.ads.AbstractC2897Ue0.b(context, 0, intent, com.google.android.gms.internal.ads.AbstractC2897Ue0.f32246a | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return com.google.android.gms.internal.ads.AbstractC2897Ue0.a(context, 0, intent, 201326592);
    }

    private final android.app.AlertDialog z6(android.app.Activity activity, final p204u3.x xVar) {
        p174r3.v.t();
        android.app.AlertDialog.Builder onCancelListener = p214v3.E0.l(activity).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.lT
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                p204u3.x xVar2 = xVar;
                if (xVar2 != null) {
                    xVar2.b();
                }
            }
        });
        android.content.res.XmlResourceParser xmlResourceParserA6 = A6(p154p3.c.f52730a);
        if (xmlResourceParserA6 == null) {
            onCancelListener.setMessage(B6(p154p3.d.f52737g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            android.view.View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserA6, (android.view.ViewGroup) null);
            onCancelListener.setView(viewInflate);
            java.lang.String strA = A();
            if (!android.text.TextUtils.isEmpty(strA)) {
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(p154p3.b.f52728a);
                textView.setVisibility(0);
                textView.setText(strA);
            }
            com.google.android.gms.internal.ads.AbstractC3155aT abstractC3155aT = (com.google.android.gms.internal.ads.AbstractC3155aT) this.f38946C.get(this.f38951H);
            android.graphics.drawable.Drawable drawableA = abstractC3155aT != null ? abstractC3155aT.a() : null;
            if (drawableA != null) {
                ((android.widget.ImageView) viewInflate.findViewById(p154p3.b.f52729b)).setImageDrawable(drawableA);
            }
            android.app.AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            return alertDialogCreate;
        } catch (android.content.res.Resources.NotFoundException unused) {
            onCancelListener.setMessage(B6(p154p3.d.f52737g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void M0(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            java.lang.String stringExtra2 = intent.getStringExtra("gws_query_id");
            java.lang.String stringExtra3 = intent.getStringExtra("uri");
            boolean zA = p174r3.v.s().a(this.f38947D);
            java.util.HashMap map = new java.util.HashMap();
            char c6 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c6 = true == zA ? (char) 1 : (char) 2;
                map.put("obvs", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
                map.put("olaih", java.lang.String.valueOf(stringExtra3.startsWith("http")));
                try {
                    android.content.Intent launchIntentForPackage = this.f38947D.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new android.content.Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(android.net.Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f38947D.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (android.content.ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            C6(stringExtra2, "offline_notification_action", map);
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.f38950G.getWritableDatabase();
                if (c6 == 1) {
                    this.f38950G.s(writableDatabase, this.f38949F, stringExtra2);
                } else {
                    com.google.android.gms.internal.ads.C4033iT.D(writableDatabase, stringExtra2);
                }
            } catch (android.database.sqlite.SQLiteException e6) {
                p224w3.p.d("Failed to get writable offline buffering database: ".concat(e6.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void P0(X3.a aVar, java.lang.String str, java.lang.String str2) {
        g5(aVar, new p194t3.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void g() {
        final p224w3.v vVar = this.f38949F;
        this.f38950G.o(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.bT
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.C4033iT.f(vVar, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void g5(X3.a aVar, p194t3.a aVar2) {
        android.graphics.Bitmap bitmapDecodeStream;
        java.lang.String str;
        android.content.Context context = (android.content.Context) X3.b.L0(aVar);
        java.lang.String str2 = aVar2.f54617C;
        java.lang.String str3 = aVar2.f54618D;
        java.lang.String str4 = aVar2.f54619E;
        java.lang.String strA = A();
        p174r3.v.u().g(context, "offline_notification_channel", "AdMob Offline Notifications");
        android.app.PendingIntent pendingIntentY6 = y6(context, "offline_notification_clicked", str3, str2);
        android.app.PendingIntent pendingIntentY7 = y6(context, "offline_notification_dismissed", str3, str2);
        androidx.core.app.j.e eVar = new androidx.core.app.j.e(context, "offline_notification_channel");
        eVar.i(!android.text.TextUtils.isEmpty(strA) ? java.lang.String.format(B6(p154p3.d.f52739i, "You are back online! Continue learning about %s"), strA) : B6(p154p3.d.f52738h, "You are back online! Let's pick up where we left off"));
        eVar.e(true).j(pendingIntentY7).g(pendingIntentY6).p(context.getApplicationInfo().icon).o(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25679r8)).intValue());
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25699t8)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(new java.net.URL(str4).openConnection().getInputStream());
            } catch (java.io.IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                eVar.l(bitmapDecodeStream).q(new androidx.core.app.j.b().i(bitmapDecodeStream).h(null));
            } catch (android.content.res.Resources.NotFoundException unused2) {
            }
        }
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        java.util.HashMap map = new java.util.HashMap();
        try {
            notificationManager.notify(str3, 54321, eVar.b());
            str = "offline_notification_impression";
        } catch (java.lang.IllegalArgumentException e6) {
            map.put("notification_not_shown_reason", e6.getMessage());
            str = "offline_notification_failed";
        }
        C6(str3, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void i6(java.lang.String[] strArr, int[] iArr, X3.a aVar) {
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (strArr[i6].equals("android.permission.POST_NOTIFICATIONS")) {
                com.google.android.gms.internal.ads.AbstractC5460vT abstractC5460vT = (com.google.android.gms.internal.ads.AbstractC5460vT) X3.b.L0(aVar);
                android.app.Activity activityA = abstractC5460vT.a();
                p204u3.x xVarB = abstractC5460vT.b();
                java.util.HashMap map = new java.util.HashMap();
                if (iArr[i6] == 0) {
                    map.put("dialog_action", "confirm");
                    C();
                    E6(activityA, xVarB);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (xVarB != null) {
                        xVarB.b();
                    }
                }
                C6(this.f38951H, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2323En
    public final void j0(X3.a aVar) {
        com.google.android.gms.internal.ads.AbstractC5460vT abstractC5460vT = (com.google.android.gms.internal.ads.AbstractC5460vT) X3.b.L0(aVar);
        final android.app.Activity activityA = abstractC5460vT.a();
        final p204u3.x xVarB = abstractC5460vT.b();
        this.f38951H = abstractC5460vT.c();
        this.f38952I = abstractC5460vT.d();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25669q8)).booleanValue()) {
            D6(activityA, xVarB);
            return;
        }
        C6(this.f38951H, "dialog_impression", com.google.android.gms.internal.ads.AbstractC3727fi0.d());
        p174r3.v.t();
        android.app.AlertDialog.Builder builderL = p214v3.E0.l(activityA);
        builderL.setTitle(B6(p154p3.d.f52743m, "Open ad when you're back online.")).setMessage(B6(p154p3.d.f52742l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(B6(p154p3.d.f52740j, "OK"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.pT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                this.f38007C.u6(activityA, xVarB, dialogInterface, i6);
            }
        }).setNegativeButton(B6(p154p3.d.f52741k, "No thanks"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.qT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
                this.f38277C.v6(xVarB, dialogInterface, i6);
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.rT
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                this.f38494C.w6(xVarB, dialogInterface);
            }
        });
        builderL.create().show();
    }

    final /* synthetic */ void r6(android.app.Activity activity, p204u3.x xVar, android.content.DialogInterface dialogInterface, int i6) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "confirm");
        C6(this.f38951H, "rtsdc", map);
        activity.startActivity(p174r3.v.u().e(activity));
        C();
        if (xVar != null) {
            xVar.b();
        }
    }

    final /* synthetic */ void s6(p204u3.x xVar, android.content.DialogInterface dialogInterface, int i6) {
        this.f38950G.g(this.f38951H);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        C6(this.f38951H, "rtsdc", map);
        if (xVar != null) {
            xVar.b();
        }
    }

    final /* synthetic */ void t6(p204u3.x xVar, android.content.DialogInterface dialogInterface) {
        this.f38950G.g(this.f38951H);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        C6(this.f38951H, "rtsdc", map);
        if (xVar != null) {
            xVar.b();
        }
    }

    final /* synthetic */ void u6(android.app.Activity activity, p204u3.x xVar, android.content.DialogInterface dialogInterface, int i6) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "confirm");
        C6(this.f38951H, "dialog_click", map);
        D6(activity, xVar);
    }

    final /* synthetic */ void v6(p204u3.x xVar, android.content.DialogInterface dialogInterface, int i6) {
        this.f38950G.g(this.f38951H);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        C6(this.f38951H, "dialog_click", map);
        if (xVar != null) {
            xVar.b();
        }
    }

    final /* synthetic */ void w6(p204u3.x xVar, android.content.DialogInterface dialogInterface) {
        this.f38950G.g(this.f38951H);
        java.util.HashMap map = new java.util.HashMap();
        map.put("dialog_action", "dismiss");
        C6(this.f38951H, "dialog_click", map);
        if (xVar != null) {
            xVar.b();
        }
    }

    public final void x6(java.lang.String str, com.google.android.gms.internal.ads.C3581eJ c3581eJ) {
        java.lang.String strK0 = c3581eJ.k0();
        java.lang.String strB = c3581eJ.b();
        java.lang.String string = "";
        if (android.text.TextUtils.isEmpty(strK0)) {
            strK0 = strB != null ? strB : "";
        }
        com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohZ = c3581eJ.Z();
        if (interfaceC4712ohZ != null) {
            try {
                string = interfaceC4712ohZ.d().toString();
            } catch (android.os.RemoteException unused) {
            }
        }
        com.google.android.gms.internal.ads.InterfaceC4712oh interfaceC4712ohA0 = c3581eJ.a0();
        android.graphics.drawable.Drawable drawable = null;
        if (interfaceC4712ohA0 != null) {
            try {
                X3.a aVarE = interfaceC4712ohA0.e();
                if (aVarE != null) {
                    drawable = (android.graphics.drawable.Drawable) X3.b.L0(aVarE);
                }
            } catch (android.os.RemoteException unused2) {
            }
        }
        this.f38946C.put(str, new com.google.android.gms.internal.ads.VS(strK0, string, drawable));
    }
}
