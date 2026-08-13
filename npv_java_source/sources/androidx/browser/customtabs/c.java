package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p030d.b f18602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.ComponentName f18603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f18604c;

    class a extends p030d.a.AbstractBinderC0485a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private android.os.Handler f18605C = new android.os.Handler(android.os.Looper.getMainLooper());

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f18606D;

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC0344a implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18608C;

            RunnableC0344a(android.os.Bundle bundle) {
                this.f18608C = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.j(this.f18608C);
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f18610C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18611D;

            b(int i6, android.os.Bundle bundle) {
                this.f18610C = i6;
                this.f18611D = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.g(this.f18610C, this.f18611D);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        class RunnableC0345c implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ java.lang.String f18613C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18614D;

            RunnableC0345c(java.lang.String str, android.os.Bundle bundle) {
                this.f18613C = str;
                this.f18614D = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.a(this.f18613C, this.f18614D);
            }
        }

        class d implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18616C;

            d(android.os.Bundle bundle) {
                this.f18616C = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.e(this.f18616C);
            }
        }

        class e implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ java.lang.String f18618C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18619D;

            e(java.lang.String str, android.os.Bundle bundle) {
                this.f18618C = str;
                this.f18619D = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.h(this.f18618C, this.f18619D);
            }
        }

        class f implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f18621C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ android.net.Uri f18622D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ boolean f18623E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18624F;

            f(int i6, android.net.Uri uri, boolean z6, android.os.Bundle bundle) {
                this.f18621C = i6;
                this.f18622D = uri;
                this.f18623E = z6;
                this.f18624F = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.i(this.f18621C, this.f18622D, this.f18623E, this.f18624F);
            }
        }

        class g implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f18626C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f18627D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18628E;

            g(int i6, int i10, android.os.Bundle bundle) {
                this.f18626C = i6;
                this.f18627D = i10;
                this.f18628E = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.d(this.f18626C, this.f18627D, this.f18628E);
            }
        }

        class h implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18630C;

            h(android.os.Bundle bundle) {
                this.f18630C = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.k(this.f18630C);
            }
        }

        class i implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f18632C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f18633D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f18634E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ int f18635F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ int f18636G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18637H;

            i(int i6, int i10, int i11, int i12, int i13, android.os.Bundle bundle) {
                this.f18632C = i6;
                this.f18633D = i10;
                this.f18634E = i11;
                this.f18635F = i12;
                this.f18636G = i13;
                this.f18637H = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.c(this.f18632C, this.f18633D, this.f18634E, this.f18635F, this.f18636G, this.f18637H);
            }
        }

        class j implements java.lang.Runnable {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ android.os.Bundle f18639C;

            j(android.os.Bundle bundle) {
                this.f18639C = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.browser.customtabs.c.a.this.f18606D.f(this.f18639C);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f18606D = bVar;
        }

        @Override // p030d.a
        public void C4(android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.h(bundle));
        }

        @Override // p030d.a
        public void M5(android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.d(bundle));
        }

        @Override // p030d.a
        public void Q3(int i6, int i10, android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.g(i6, i10, bundle));
        }

        @Override // p030d.a
        public void R4(int i6, android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.b(i6, bundle));
        }

        @Override // p030d.a
        public void R5(int i6, android.net.Uri uri, boolean z6, android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.f(i6, uri, z6, bundle));
        }

        @Override // p030d.a
        public void i3(android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.j(bundle));
        }

        @Override // p030d.a
        public android.os.Bundle m2(java.lang.String str, android.os.Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f18606D;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // p030d.a
        public void q4(java.lang.String str, android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.RunnableC0345c(str, bundle));
        }

        @Override // p030d.a
        public void s1(int i6, int i10, int i11, int i12, int i13, android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.i(i6, i10, i11, i12, i13, bundle));
        }

        @Override // p030d.a
        public void w3(android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.RunnableC0344a(bundle));
        }

        @Override // p030d.a
        public void y5(java.lang.String str, android.os.Bundle bundle) {
            if (this.f18606D == null) {
                return;
            }
            this.f18605C.post(new androidx.browser.customtabs.c.a.e(str, bundle));
        }
    }

    c(p030d.b bVar, android.content.ComponentName componentName, android.content.Context context) {
        this.f18602a = bVar;
        this.f18603b = componentName;
        this.f18604c = context;
    }

    public static boolean a(android.content.Context context, java.lang.String str, androidx.browser.customtabs.e eVar) {
        eVar.b(context.getApplicationContext());
        android.content.Intent intent = new android.content.Intent("android.support.customtabs.action.CustomTabsService");
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private p030d.a.AbstractBinderC0485a b(androidx.browser.customtabs.b bVar) {
        return new androidx.browser.customtabs.c.a(bVar);
    }

    public static java.lang.String c(android.content.Context context, java.util.List list) {
        return d(context, list, false);
    }

    public static java.lang.String d(android.content.Context context, java.util.List list, boolean z6) {
        android.content.pm.ResolveInfo resolveInfoResolveActivity;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.List<java.lang.String> arrayList = list == null ? new java.util.ArrayList() : list;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://"));
        if (!z6 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            java.lang.String str = resolveInfoResolveActivity.activityInfo.packageName;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        android.content.Intent intent2 = new android.content.Intent("android.support.customtabs.action.CustomTabsService");
        for (java.lang.String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return android.os.Build.VERSION.SDK_INT >= 30 ? null : null;
    }

    private androidx.browser.customtabs.f f(androidx.browser.customtabs.b bVar, android.app.PendingIntent pendingIntent) {
        boolean zN2;
        p030d.a.AbstractBinderC0485a abstractBinderC0485aB = b(bVar);
        try {
            if (pendingIntent != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zN2 = this.f18602a.s3(abstractBinderC0485aB, bundle);
            } else {
                zN2 = this.f18602a.n2(abstractBinderC0485aB);
            }
            if (zN2) {
                return new androidx.browser.customtabs.f(this.f18602a, abstractBinderC0485aB, this.f18603b, pendingIntent);
            }
            return null;
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    public androidx.browser.customtabs.f e(androidx.browser.customtabs.b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j6) {
        try {
            return this.f18602a.X2(j6);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
