package p078h8;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p078h8.a.EnumC0561a f46507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p128m8.e f46508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String[] f46509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String[] f46510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String[] f46511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f46512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f46513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f46514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f46515i;

    /* JADX INFO: renamed from: h8.a$a, reason: collision with other inner class name */
    public enum EnumC0561a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final java.util.Map f46517E;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f46526C;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f46525M = p157p7.b.a(e());

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p078h8.a.EnumC0561a.C0562a f46516D = new p078h8.a.EnumC0561a.C0562a(null);

        /* JADX INFO: renamed from: h8.a$a$a, reason: collision with other inner class name */
        public static final class C0562a {
            private C0562a() {
            }

            public /* synthetic */ C0562a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final p078h8.a.EnumC0561a a(int i6) {
                p078h8.a.EnumC0561a enumC0561a = (p078h8.a.EnumC0561a) p078h8.a.EnumC0561a.f46517E.get(java.lang.Integer.valueOf(i6));
                return enumC0561a == null ? p078h8.a.EnumC0561a.UNKNOWN : enumC0561a;
            }
        }

        static {
            p078h8.a.EnumC0561a[] enumC0561aArrValues = values();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(enumC0561aArrValues.length), 16));
            for (p078h8.a.EnumC0561a enumC0561a : enumC0561aArrValues) {
                linkedHashMap.put(java.lang.Integer.valueOf(enumC0561a.f46526C), enumC0561a);
            }
            f46517E = linkedHashMap;
        }

        EnumC0561a(int i6) {
            this.f46526C = i6;
        }

        public static final p078h8.a.EnumC0561a i(int i6) {
            return f46516D.a(i6);
        }
    }

    public a(p078h8.a.EnumC0561a enumC0561a, p128m8.e eVar, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, java.lang.String str, int i6, java.lang.String str2, byte[] bArr) {
        p247y7.AbstractC7350t.f(enumC0561a, "kind");
        p247y7.AbstractC7350t.f(eVar, "metadataVersion");
        this.f46507a = enumC0561a;
        this.f46508b = eVar;
        this.f46509c = strArr;
        this.f46510d = strArr2;
        this.f46511e = strArr3;
        this.f46512f = str;
        this.f46513g = i6;
        this.f46514h = str2;
        this.f46515i = bArr;
    }

    private final boolean h(int i6, int i10) {
        return (i6 & i10) != 0;
    }

    public final java.lang.String[] a() {
        return this.f46509c;
    }

    public final java.lang.String[] b() {
        return this.f46510d;
    }

    public final p078h8.a.EnumC0561a c() {
        return this.f46507a;
    }

    public final p128m8.e d() {
        return this.f46508b;
    }

    public final java.lang.String e() {
        java.lang.String str = this.f46512f;
        if (this.f46507a == p078h8.a.EnumC0561a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final java.util.List f() {
        java.lang.String[] strArr = this.f46509c;
        if (this.f46507a != p078h8.a.EnumC0561a.MULTIFILE_CLASS) {
            strArr = null;
        }
        java.util.List listD = strArr != null ? p097j7.AbstractC6872n.d(strArr) : null;
        return listD == null ? p097j7.AbstractC6879v.m() : listD;
    }

    public final java.lang.String[] g() {
        return this.f46511e;
    }

    public final boolean i() {
        return h(this.f46513g, 2);
    }

    public final boolean j() {
        return h(this.f46513g, 64) && !h(this.f46513g, 32);
    }

    public final boolean k() {
        return h(this.f46513g, 16) && !h(this.f46513g, 32);
    }

    public java.lang.String toString() {
        return this.f46507a + " version=" + this.f46508b;
    }
}
