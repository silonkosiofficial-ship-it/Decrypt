package p062g1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p062g1.a.C0509a f45437g = new p062g1.a.C0509a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45438h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f45439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f45442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f45443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45444f;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public static final class C0509a {
        private C0509a() {
        }

        public /* synthetic */ C0509a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.String a(int i6) {
            java.lang.String str = "00000000" + S8.AbstractC1633f.p(i6, null, 1, null);
            java.lang.String strSubstring = str.substring(str.length() - 8);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            return "#" + strSubstring;
        }
    }

    public a(p062g1.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "c");
        this.f45441c = Integer.MIN_VALUE;
        this.f45442d = Float.NaN;
        this.f45439a = aVar.f45439a;
        this.f45440b = aVar.f45440b;
        this.f45441c = aVar.f45441c;
        this.f45442d = aVar.f45442d;
        this.f45443e = aVar.f45443e;
        this.f45444f = aVar.f45444f;
    }

    public a(java.lang.String str, int i6, float f6) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f45441c = Integer.MIN_VALUE;
        this.f45439a = str;
        this.f45440b = i6;
        this.f45442d = f6;
    }

    public a(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f45441c = Integer.MIN_VALUE;
        this.f45442d = Float.NaN;
        this.f45439a = str;
        this.f45440b = i6;
        if (i6 == 901) {
            this.f45442d = i10;
        } else {
            this.f45441c = i10;
        }
    }

    public final p062g1.a a() {
        return new p062g1.a(this);
    }

    public final boolean b() {
        return this.f45444f;
    }

    public final float c() {
        return this.f45442d;
    }

    public final int d() {
        return this.f45441c;
    }

    public final java.lang.String e() {
        return this.f45439a;
    }

    public final java.lang.String f() {
        return this.f45443e;
    }

    public final int g() {
        return this.f45440b;
    }

    public final void h(float f6) {
        this.f45442d = f6;
    }

    public final void i(int i6) {
        this.f45441c = i6;
    }

    public java.lang.String toString() {
        java.lang.String str = this.f45439a + ":";
        switch (this.f45440b) {
            case 900:
                return str + this.f45441c;
            case 901:
                return str + this.f45442d;
            case 902:
                return str + f45437g.a(this.f45441c);
            case 903:
                return str + this.f45443e;
            case 904:
                return str + this.f45444f;
            case 905:
                return str + this.f45442d;
            default:
                return str + "????";
        }
    }
}
