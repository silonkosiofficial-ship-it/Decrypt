package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Intent f18641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f18642b;

    private static class a {
        static android.app.ActivityOptions a() {
            return android.app.ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static java.lang.String a() {
            android.os.LocaleList adjustedDefault = android.os.LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(android.app.ActivityOptions activityOptions, boolean z6) {
            activityOptions.setShareIdentityEnabled(z6);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    public static final class C0346d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.ArrayList f18645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.app.ActivityOptions f18646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.util.ArrayList f18647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.util.SparseArray f18648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private android.os.Bundle f18649g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f18652j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Intent f18643a = new android.content.Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.browser.customtabs.a.C0343a f18644b = new androidx.browser.customtabs.a.C0343a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f18650h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f18651i = true;

        public C0346d() {
        }

        public C0346d(androidx.browser.customtabs.f fVar) {
            if (fVar != null) {
                c(fVar);
            }
        }

        private void b() {
            java.lang.String strA = androidx.browser.customtabs.d.b.a();
            if (android.text.TextUtils.isEmpty(strA)) {
                return;
            }
            android.os.Bundle bundleExtra = this.f18643a.hasExtra("com.android.browser.headers") ? this.f18643a.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f18643a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void d(android.os.IBinder iBinder, android.app.PendingIntent pendingIntent) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f18643a.putExtras(bundle);
        }

        private void e() {
            if (this.f18646d == null) {
                this.f18646d = androidx.browser.customtabs.d.a.a();
            }
            androidx.browser.customtabs.d.c.a(this.f18646d, this.f18652j);
        }

        public androidx.browser.customtabs.d a() {
            if (!this.f18643a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = this.f18645c;
            if (arrayList != null) {
                this.f18643a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = this.f18647e;
            if (arrayList2 != null) {
                this.f18643a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f18643a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f18651i);
            this.f18643a.putExtras(this.f18644b.a().a());
            android.os.Bundle bundle = this.f18649g;
            if (bundle != null) {
                this.f18643a.putExtras(bundle);
            }
            if (this.f18648f != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f18648f);
                this.f18643a.putExtras(bundle2);
            }
            this.f18643a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f18650h);
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                b();
            }
            if (i6 >= 34) {
                e();
            }
            android.app.ActivityOptions activityOptions = this.f18646d;
            return new androidx.browser.customtabs.d(this.f18643a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public androidx.browser.customtabs.d.C0346d c(androidx.browser.customtabs.f fVar) {
            this.f18643a.setPackage(fVar.e().getPackageName());
            d(fVar.d(), fVar.f());
            return this;
        }
    }

    d(android.content.Intent intent, android.os.Bundle bundle) {
        this.f18641a = intent;
        this.f18642b = bundle;
    }

    public void a(android.content.Context context, android.net.Uri uri) {
        this.f18641a.setData(uri);
        androidx.core.content.a.j(context, this.f18641a, this.f18642b);
    }
}
