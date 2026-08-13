package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.os.Bundle f21396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.core.graphics.drawable.IconCompat f21397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.core.app.q[] f21398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.core.app.q[] f21399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f21400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f21401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f21402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f21403h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f21404i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public java.lang.CharSequence f21405j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public android.app.PendingIntent f21406k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f21407l;

        public a(int i6, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this(i6 != 0 ? androidx.core.graphics.drawable.IconCompat.c(null, "", i6) : null, charSequence, pendingIntent);
        }

        public a(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), null, null, true, 0, true, false, false);
        }

        a(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.q[] qVarArr, androidx.core.app.q[] qVarArr2, boolean z6, int i6, boolean z10, boolean z11, boolean z12) {
            this.f21401f = true;
            this.f21397b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f21404i = iconCompat.e();
            }
            this.f21405j = androidx.core.app.j.e.d(charSequence);
            this.f21406k = pendingIntent;
            this.f21396a = bundle == null ? new android.os.Bundle() : bundle;
            this.f21398c = qVarArr;
            this.f21399d = qVarArr2;
            this.f21400e = z6;
            this.f21402g = i6;
            this.f21401f = z10;
            this.f21403h = z11;
            this.f21407l = z12;
        }

        public android.app.PendingIntent a() {
            return this.f21406k;
        }

        public boolean b() {
            return this.f21400e;
        }

        public android.os.Bundle c() {
            return this.f21396a;
        }

        public androidx.core.graphics.drawable.IconCompat d() {
            int i6;
            if (this.f21397b == null && (i6 = this.f21404i) != 0) {
                this.f21397b = androidx.core.graphics.drawable.IconCompat.c(null, "", i6);
            }
            return this.f21397b;
        }

        public androidx.core.app.q[] e() {
            return this.f21398c;
        }

        public int f() {
            return this.f21402g;
        }

        public boolean g() {
            return this.f21401f;
        }

        public java.lang.CharSequence h() {
            return this.f21405j;
        }

        public boolean i() {
            return this.f21407l;
        }

        public boolean j() {
            return this.f21403h;
        }
    }

    public static class b extends androidx.core.app.j.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.drawable.IconCompat f21408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.core.graphics.drawable.IconCompat f21409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f21410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.CharSequence f21411h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f21412i;

        private static class a {
            static void a(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.j$b$b, reason: collision with other inner class name */
        private static class C0402b {
            static void a(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(android.app.Notification.BigPictureStyle bigPictureStyle, boolean z6) {
                bigPictureStyle.showBigPictureWhenCollapsed(z6);
            }
        }

        @Override // androidx.core.app.j.f
        public void b(androidx.core.app.i iVar) {
            android.app.Notification.BigPictureStyle bigContentTitle = new android.app.Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.f21462b);
            androidx.core.graphics.drawable.IconCompat iconCompat = this.f21408e;
            if (iconCompat != null) {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    androidx.core.app.j.b.C0402b.a(bigContentTitle, this.f21408e.m(iVar instanceof androidx.core.app.k ? ((androidx.core.app.k) iVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f21408e.d());
                }
            }
            if (this.f21410g) {
                if (this.f21409f == null) {
                    bigContentTitle.bigLargeIcon((android.graphics.Bitmap) null);
                } else {
                    androidx.core.app.j.b.a.a(bigContentTitle, this.f21409f.m(iVar instanceof androidx.core.app.k ? ((androidx.core.app.k) iVar).f() : null));
                }
            }
            if (this.f21464d) {
                bigContentTitle.setSummaryText(this.f21463c);
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.core.app.j.b.C0402b.c(bigContentTitle, this.f21412i);
                androidx.core.app.j.b.C0402b.b(bigContentTitle, this.f21411h);
            }
        }

        @Override // androidx.core.app.j.f
        protected java.lang.String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public androidx.core.app.j.b h(android.graphics.Bitmap bitmap) {
            this.f21409f = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.b(bitmap);
            this.f21410g = true;
            return this;
        }

        public androidx.core.app.j.b i(android.graphics.Bitmap bitmap) {
            this.f21408e = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends androidx.core.app.j.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.CharSequence f21413e;

        @Override // androidx.core.app.j.f
        public void a(android.os.Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.j.f
        public void b(androidx.core.app.i iVar) {
            android.app.Notification.BigTextStyle bigTextStyleBigText = new android.app.Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f21462b).bigText(this.f21413e);
            if (this.f21464d) {
                bigTextStyleBigText.setSummaryText(this.f21463c);
            }
        }

        @Override // androidx.core.app.j.f
        protected java.lang.String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public androidx.core.app.j.c h(java.lang.CharSequence charSequence) {
            this.f21413e = androidx.core.app.j.e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static android.app.Notification.BubbleMetadata a(androidx.core.app.j.d dVar) {
            return null;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f21414A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f21415B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.lang.String f21416C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        android.os.Bundle f21417D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f21418E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f21419F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        android.app.Notification f21420G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        android.widget.RemoteViews f21421H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        android.widget.RemoteViews f21422I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        android.widget.RemoteViews f21423J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.String f21424K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f21425L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        java.lang.String f21426M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        long f21427N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f21428O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f21429P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        boolean f21430Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        android.app.Notification f21431R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f21432S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        java.lang.Object f21433T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public java.util.ArrayList f21434U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.content.Context f21435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.util.ArrayList f21436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.util.ArrayList f21437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.util.ArrayList f21438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.CharSequence f21439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        java.lang.CharSequence f21440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.app.PendingIntent f21441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        android.app.PendingIntent f21442h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        android.widget.RemoteViews f21443i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.core.graphics.drawable.IconCompat f21444j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        java.lang.CharSequence f21445k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f21446l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f21447m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f21448n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f21449o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        androidx.core.app.j.f f21450p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        java.lang.CharSequence f21451q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        java.lang.CharSequence f21452r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        java.lang.CharSequence[] f21453s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f21454t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f21455u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f21456v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        java.lang.String f21457w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f21458x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        java.lang.String f21459y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f21460z;

        public e(android.content.Context context) {
            this(context, null);
        }

        public e(android.content.Context context, java.lang.String str) {
            this.f21436b = new java.util.ArrayList();
            this.f21437c = new java.util.ArrayList();
            this.f21438d = new java.util.ArrayList();
            this.f21448n = true;
            this.f21460z = false;
            this.f21418E = 0;
            this.f21419F = 0;
            this.f21425L = 0;
            this.f21428O = 0;
            this.f21429P = 0;
            android.app.Notification notification = new android.app.Notification();
            this.f21431R = notification;
            this.f21435a = context;
            this.f21424K = str;
            notification.when = java.lang.System.currentTimeMillis();
            this.f21431R.audioStreamType = -1;
            this.f21447m = 0;
            this.f21434U = new java.util.ArrayList();
            this.f21430Q = true;
        }

        protected static java.lang.CharSequence d(java.lang.CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void k(int i6, boolean z6) {
            android.app.Notification notification;
            int i10;
            if (z6) {
                notification = this.f21431R;
                i10 = i6 | notification.flags;
            } else {
                notification = this.f21431R;
                i10 = (~i6) & notification.flags;
            }
            notification.flags = i10;
        }

        public androidx.core.app.j.e a(int i6, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this.f21436b.add(new androidx.core.app.j.a(i6, charSequence, pendingIntent));
            return this;
        }

        public android.app.Notification b() {
            return new androidx.core.app.k(this).c();
        }

        public android.os.Bundle c() {
            if (this.f21417D == null) {
                this.f21417D = new android.os.Bundle();
            }
            return this.f21417D;
        }

        public androidx.core.app.j.e e(boolean z6) {
            k(16, z6);
            return this;
        }

        public androidx.core.app.j.e f(java.lang.String str) {
            this.f21424K = str;
            return this;
        }

        public androidx.core.app.j.e g(android.app.PendingIntent pendingIntent) {
            this.f21441g = pendingIntent;
            return this;
        }

        public androidx.core.app.j.e h(java.lang.CharSequence charSequence) {
            this.f21440f = d(charSequence);
            return this;
        }

        public androidx.core.app.j.e i(java.lang.CharSequence charSequence) {
            this.f21439e = d(charSequence);
            return this;
        }

        public androidx.core.app.j.e j(android.app.PendingIntent pendingIntent) {
            this.f21431R.deleteIntent = pendingIntent;
            return this;
        }

        public androidx.core.app.j.e l(android.graphics.Bitmap bitmap) {
            this.f21444j = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.b(androidx.core.app.j.b(this.f21435a, bitmap));
            return this;
        }

        public androidx.core.app.j.e m(boolean z6) {
            this.f21460z = z6;
            return this;
        }

        public androidx.core.app.j.e n(boolean z6) {
            k(2, z6);
            return this;
        }

        public androidx.core.app.j.e o(int i6) {
            this.f21447m = i6;
            return this;
        }

        public androidx.core.app.j.e p(int i6) {
            this.f21431R.icon = i6;
            return this;
        }

        public androidx.core.app.j.e q(androidx.core.app.j.f fVar) {
            if (this.f21450p != fVar) {
                this.f21450p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public androidx.core.app.j.e r(java.lang.CharSequence charSequence) {
            this.f21431R.tickerText = d(charSequence);
            return this;
        }

        public androidx.core.app.j.e s(long j6) {
            this.f21431R.when = j6;
            return this;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected androidx.core.app.j.e f21461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.CharSequence f21462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.CharSequence f21463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f21464d = false;

        public void a(android.os.Bundle bundle) {
            if (this.f21464d) {
                bundle.putCharSequence("android.summaryText", this.f21463c);
            }
            java.lang.CharSequence charSequence = this.f21462b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            java.lang.String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(androidx.core.app.i iVar);

        protected abstract java.lang.String c();

        public android.widget.RemoteViews d(androidx.core.app.i iVar) {
            return null;
        }

        public android.widget.RemoteViews e(androidx.core.app.i iVar) {
            return null;
        }

        public android.widget.RemoteViews f(androidx.core.app.i iVar) {
            return null;
        }

        public void g(androidx.core.app.j.e eVar) {
            if (this.f21461a != eVar) {
                this.f21461a = eVar;
                if (eVar != null) {
                    eVar.q(this);
                }
            }
        }
    }

    public static android.os.Bundle a(android.app.Notification notification) {
        return notification.extras;
    }

    public static android.graphics.Bitmap b(android.content.Context context, android.graphics.Bitmap bitmap) {
        if (bitmap == null || android.os.Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(p202u1.b.f55371b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(p202u1.b.f55370a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = java.lang.Math.min(((double) dimensionPixelSize) / ((double) java.lang.Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) java.lang.Math.max(1, bitmap.getHeight())));
        return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(((double) bitmap.getWidth()) * dMin), (int) java.lang.Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }
}
