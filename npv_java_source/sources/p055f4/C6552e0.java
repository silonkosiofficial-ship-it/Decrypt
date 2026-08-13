package p055f4;

/* JADX INFO: renamed from: f4.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6552e0 implements p055f4.E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Application f45117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.Z f45118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.os.Handler f45119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.Executor f45120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p055f4.X0 f45121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p055f4.C6571o f45122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p055f4.D f45123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p055f4.C6575q f45124h;

    C6552e0(android.app.Application application, p055f4.Z z6, android.os.Handler handler, java.util.concurrent.Executor executor, p055f4.X0 x6, p055f4.C6571o c6571o, p055f4.D d6, p055f4.C6575q c6575q) {
        this.f45117a = application;
        this.f45118b = z6;
        this.f45119c = handler;
        this.f45120d = executor;
        this.f45121e = x6;
        this.f45122f = c6571o;
        this.f45123g = d6;
        this.f45124h = c6575q;
    }

    private final void g(org.json.JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("url");
        if (android.text.TextUtils.isEmpty(strOptString)) {
        }
        android.net.Uri uri = android.net.Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            "Action[browser]: empty scheme: ".concat(java.lang.String.valueOf(strOptString));
        }
        try {
            this.f45118b.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
        } catch (android.content.ActivityNotFoundException e6) {
            "Action[browser]: can not open url: ".concat(java.lang.String.valueOf(strOptString));
        }
    }

    @Override // p055f4.E0
    public final java.util.concurrent.Executor a() {
        final android.os.Handler handler = this.f45119c;
        j$.util.Objects.requireNonNull(handler);
        return new java.util.concurrent.Executor() { // from class: f4.b0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p055f4.E0
    public final boolean b(java.lang.String str, org.json.JSONObject jSONObject) {
        byte b6;
        byte b10 = -1;
        switch (str) {
            case "load_complete":
                b6 = 0;
                break;
            case "configure_app_assets":
                b6 = 3;
                break;
            case "browser":
                b6 = 2;
                break;
            case "dismiss":
                b6 = 1;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0) {
            this.f45123g.j();
            return true;
        }
        if (b6 != 1) {
            if (b6 == 2) {
                g(jSONObject);
                return true;
            }
            if (b6 != 3) {
                return false;
            }
            c();
            return true;
        }
        java.lang.String strOptString = jSONObject.optString("status");
        switch (strOptString.hashCode()) {
            case -954325659:
                if (strOptString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    b10 = 3;
                }
                break;
            case -258041904:
                if (strOptString.equals("personalized")) {
                    b10 = 0;
                }
                break;
            case 429411856:
                if (strOptString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    b10 = 4;
                }
                break;
            case 467888915:
                if (strOptString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    b10 = 1;
                }
                break;
            case 1666911234:
                if (strOptString.equals("non_personalized")) {
                    b10 = 2;
                }
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4) {
            this.f45123g.h(3);
        } else {
            this.f45123g.i(new p055f4.Z0(1, "We are getting something wrong with the webview."));
        }
        return true;
    }

    public final void c() {
        this.f45120d.execute(new java.lang.Runnable() { // from class: f4.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f45101C.d();
            }
        });
    }

    final /* synthetic */ void d() {
        java.lang.String strConcat;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.app.Application application = this.f45117a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            android.graphics.drawable.Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(java.lang.String.valueOf(android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (java.lang.String str : this.f45124h.c().keySet()) {
                jSONObject2.put(str, this.f45124h.c().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        this.f45123g.d().d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    final void e(java.lang.String str) {
        "Receive consent action: ".concat(java.lang.String.valueOf(str));
        android.net.Uri uri = android.net.Uri.parse(str);
        this.f45121e.b(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.f45122f);
    }

    final void f(int i6, java.lang.String str, java.lang.String str2) {
        this.f45123g.k(new p055f4.Z0(2, java.lang.String.format(java.util.Locale.US, "WebResourceError(%d, %s): %s", java.lang.Integer.valueOf(i6), str2, str)));
    }
}
