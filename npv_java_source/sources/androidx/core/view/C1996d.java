package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1996d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.view.C1996d.f f21705a;

    /* JADX INFO: renamed from: androidx.core.view.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.view.C1996d.c f21706a;

        public a(android.content.ClipData clipData, int i6) {
            this.f21706a = android.os.Build.VERSION.SDK_INT >= 31 ? new androidx.core.view.C1996d.b(clipData, i6) : new androidx.core.view.C1996d.C0413d(clipData, i6);
        }

        public androidx.core.view.C1996d a() {
            return this.f21706a.i();
        }

        public androidx.core.view.C1996d.a b(android.os.Bundle bundle) {
            this.f21706a.setExtras(bundle);
            return this;
        }

        public androidx.core.view.C1996d.a c(int i6) {
            this.f21706a.b(i6);
            return this;
        }

        public androidx.core.view.C1996d.a d(android.net.Uri uri) {
            this.f21706a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$b */
    private static final class b implements androidx.core.view.C1996d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.ContentInfo.Builder f21707a;

        b(android.content.ClipData clipData, int i6) {
            this.f21707a = androidx.core.view.AbstractC2006i.a(clipData, i6);
        }

        @Override // androidx.core.view.C1996d.c
        public void a(android.net.Uri uri) {
            this.f21707a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1996d.c
        public void b(int i6) {
            this.f21707a.setFlags(i6);
        }

        @Override // androidx.core.view.C1996d.c
        public androidx.core.view.C1996d i() {
            return new androidx.core.view.C1996d(new androidx.core.view.C1996d.e(this.f21707a.build()));
        }

        @Override // androidx.core.view.C1996d.c
        public void setExtras(android.os.Bundle bundle) {
            this.f21707a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$c */
    private interface c {
        void a(android.net.Uri uri);

        void b(int i6);

        androidx.core.view.C1996d i();

        void setExtras(android.os.Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0413d implements androidx.core.view.C1996d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.content.ClipData f21708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.net.Uri f21711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.os.Bundle f21712e;

        C0413d(android.content.ClipData clipData, int i6) {
            this.f21708a = clipData;
            this.f21709b = i6;
        }

        @Override // androidx.core.view.C1996d.c
        public void a(android.net.Uri uri) {
            this.f21711d = uri;
        }

        @Override // androidx.core.view.C1996d.c
        public void b(int i6) {
            this.f21710c = i6;
        }

        @Override // androidx.core.view.C1996d.c
        public androidx.core.view.C1996d i() {
            return new androidx.core.view.C1996d(new androidx.core.view.C1996d.g(this));
        }

        @Override // androidx.core.view.C1996d.c
        public void setExtras(android.os.Bundle bundle) {
            this.f21712e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$e */
    private static final class e implements androidx.core.view.C1996d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.ContentInfo f21713a;

        e(android.view.ContentInfo contentInfo) {
            this.f21713a = androidx.core.view.AbstractC1994c.a(B1.i.g(contentInfo));
        }

        @Override // androidx.core.view.C1996d.f
        public android.content.ClipData a() {
            return this.f21713a.getClip();
        }

        @Override // androidx.core.view.C1996d.f
        public int b() {
            return this.f21713a.getFlags();
        }

        @Override // androidx.core.view.C1996d.f
        public android.view.ContentInfo c() {
            return this.f21713a;
        }

        @Override // androidx.core.view.C1996d.f
        public int o() {
            return this.f21713a.getSource();
        }

        public java.lang.String toString() {
            return "ContentInfoCompat{" + this.f21713a + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$f */
    private interface f {
        android.content.ClipData a();

        int b();

        android.view.ContentInfo c();

        int o();
    }

    /* JADX INFO: renamed from: androidx.core.view.d$g */
    private static final class g implements androidx.core.view.C1996d.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.ClipData f21714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final android.net.Uri f21717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final android.os.Bundle f21718e;

        g(androidx.core.view.C1996d.C0413d c0413d) {
            this.f21714a = (android.content.ClipData) B1.i.g(c0413d.f21708a);
            this.f21715b = B1.i.c(c0413d.f21709b, 0, 5, "source");
            this.f21716c = B1.i.f(c0413d.f21710c, 1);
            this.f21717d = c0413d.f21711d;
            this.f21718e = c0413d.f21712e;
        }

        @Override // androidx.core.view.C1996d.f
        public android.content.ClipData a() {
            return this.f21714a;
        }

        @Override // androidx.core.view.C1996d.f
        public int b() {
            return this.f21716c;
        }

        @Override // androidx.core.view.C1996d.f
        public android.view.ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.C1996d.f
        public int o() {
            return this.f21715b;
        }

        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f21714a.getDescription());
            sb.append(", source=");
            sb.append(androidx.core.view.C1996d.e(this.f21715b));
            sb.append(", flags=");
            sb.append(androidx.core.view.C1996d.a(this.f21716c));
            if (this.f21717d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f21717d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f21718e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C1996d(androidx.core.view.C1996d.f fVar) {
        this.f21705a = fVar;
    }

    static java.lang.String a(int i6) {
        return (i6 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : java.lang.String.valueOf(i6);
    }

    static java.lang.String e(int i6) {
        if (i6 == 0) {
            return "SOURCE_APP";
        }
        if (i6 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i6 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i6 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i6 != 4) {
            return i6 != 5 ? java.lang.String.valueOf(i6) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static androidx.core.view.C1996d g(android.view.ContentInfo contentInfo) {
        return new androidx.core.view.C1996d(new androidx.core.view.C1996d.e(contentInfo));
    }

    public android.content.ClipData b() {
        return this.f21705a.a();
    }

    public int c() {
        return this.f21705a.b();
    }

    public int d() {
        return this.f21705a.o();
    }

    public android.view.ContentInfo f() {
        android.view.ContentInfo contentInfoC = this.f21705a.c();
        j$.util.Objects.requireNonNull(contentInfoC);
        return androidx.core.view.AbstractC1994c.a(contentInfoC);
    }

    public java.lang.String toString() {
        return this.f21705a.toString();
    }
}
