package p201u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f55247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f55248b;

    public static final class a extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f55252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f55253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f55254h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f55255i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f6, float f10, float f11, boolean z6, boolean z10, float f12, float f13) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f55249c = f6;
            this.f55250d = f10;
            this.f55251e = f11;
            this.f55252f = z6;
            this.f55253g = z10;
            this.f55254h = f12;
            this.f55255i = f13;
        }

        public final float c() {
            return this.f55254h;
        }

        public final float d() {
            return this.f55255i;
        }

        public final float e() {
            return this.f55249c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.a)) {
                return false;
            }
            u0.h.a aVar = (u0.h.a) obj;
            return java.lang.Float.compare(this.f55249c, aVar.f55249c) == 0 && java.lang.Float.compare(this.f55250d, aVar.f55250d) == 0 && java.lang.Float.compare(this.f55251e, aVar.f55251e) == 0 && this.f55252f == aVar.f55252f && this.f55253g == aVar.f55253g && java.lang.Float.compare(this.f55254h, aVar.f55254h) == 0 && java.lang.Float.compare(this.f55255i, aVar.f55255i) == 0;
        }

        public final float f() {
            return this.f55251e;
        }

        public final float g() {
            return this.f55250d;
        }

        public final boolean h() {
            return this.f55252f;
        }

        public int hashCode() {
            return (((((((((((java.lang.Float.floatToIntBits(this.f55249c) * 31) + java.lang.Float.floatToIntBits(this.f55250d)) * 31) + java.lang.Float.floatToIntBits(this.f55251e)) * 31) + p190t.h.a(this.f55252f)) * 31) + p190t.h.a(this.f55253g)) * 31) + java.lang.Float.floatToIntBits(this.f55254h)) * 31) + java.lang.Float.floatToIntBits(this.f55255i);
        }

        public final boolean i() {
            return this.f55253g;
        }

        public java.lang.String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f55249c + ", verticalEllipseRadius=" + this.f55250d + ", theta=" + this.f55251e + ", isMoreThanHalf=" + this.f55252f + ", isPositiveArc=" + this.f55253g + ", arcStartX=" + this.f55254h + ", arcStartY=" + this.f55255i + ')';
        }
    }

    public static final class b extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u0.h.b f55256c = new u0.h.b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z6 = false;
            super(z6, z6, 3, null);
        }
    }

    public static final class c extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f55261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f55262h;

        public c(float f6, float f10, float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f55257c = f6;
            this.f55258d = f10;
            this.f55259e = f11;
            this.f55260f = f12;
            this.f55261g = f13;
            this.f55262h = f14;
        }

        public final float c() {
            return this.f55257c;
        }

        public final float d() {
            return this.f55259e;
        }

        public final float e() {
            return this.f55261g;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.c)) {
                return false;
            }
            u0.h.c cVar = (u0.h.c) obj;
            return java.lang.Float.compare(this.f55257c, cVar.f55257c) == 0 && java.lang.Float.compare(this.f55258d, cVar.f55258d) == 0 && java.lang.Float.compare(this.f55259e, cVar.f55259e) == 0 && java.lang.Float.compare(this.f55260f, cVar.f55260f) == 0 && java.lang.Float.compare(this.f55261g, cVar.f55261g) == 0 && java.lang.Float.compare(this.f55262h, cVar.f55262h) == 0;
        }

        public final float f() {
            return this.f55258d;
        }

        public final float g() {
            return this.f55260f;
        }

        public final float h() {
            return this.f55262h;
        }

        public int hashCode() {
            return (((((((((java.lang.Float.floatToIntBits(this.f55257c) * 31) + java.lang.Float.floatToIntBits(this.f55258d)) * 31) + java.lang.Float.floatToIntBits(this.f55259e)) * 31) + java.lang.Float.floatToIntBits(this.f55260f)) * 31) + java.lang.Float.floatToIntBits(this.f55261g)) * 31) + java.lang.Float.floatToIntBits(this.f55262h);
        }

        public java.lang.String toString() {
            return "CurveTo(x1=" + this.f55257c + ", y1=" + this.f55258d + ", x2=" + this.f55259e + ", y2=" + this.f55260f + ", x3=" + this.f55261g + ", y3=" + this.f55262h + ')';
        }
    }

    public static final class d extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55263c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f6) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55263c = f6;
        }

        public final float c() {
            return this.f55263c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0.h.d) && java.lang.Float.compare(this.f55263c, ((u0.h.d) obj).f55263c) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f55263c);
        }

        public java.lang.String toString() {
            return "HorizontalTo(x=" + this.f55263c + ')';
        }
    }

    public static final class e extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55265d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f6, float f10) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55264c = f6;
            this.f55265d = f10;
        }

        public final float c() {
            return this.f55264c;
        }

        public final float d() {
            return this.f55265d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.e)) {
                return false;
            }
            u0.h.e eVar = (u0.h.e) obj;
            return java.lang.Float.compare(this.f55264c, eVar.f55264c) == 0 && java.lang.Float.compare(this.f55265d, eVar.f55265d) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f55264c) * 31) + java.lang.Float.floatToIntBits(this.f55265d);
        }

        public java.lang.String toString() {
            return "LineTo(x=" + this.f55264c + ", y=" + this.f55265d + ')';
        }
    }

    public static final class f extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55267d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f6, float f10) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55266c = f6;
            this.f55267d = f10;
        }

        public final float c() {
            return this.f55266c;
        }

        public final float d() {
            return this.f55267d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.f)) {
                return false;
            }
            u0.h.f fVar = (u0.h.f) obj;
            return java.lang.Float.compare(this.f55266c, fVar.f55266c) == 0 && java.lang.Float.compare(this.f55267d, fVar.f55267d) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f55266c) * 31) + java.lang.Float.floatToIntBits(this.f55267d);
        }

        public java.lang.String toString() {
            return "MoveTo(x=" + this.f55266c + ", y=" + this.f55267d + ')';
        }
    }

    public static final class g extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55271f;

        public g(float f6, float f10, float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f55268c = f6;
            this.f55269d = f10;
            this.f55270e = f11;
            this.f55271f = f12;
        }

        public final float c() {
            return this.f55268c;
        }

        public final float d() {
            return this.f55270e;
        }

        public final float e() {
            return this.f55269d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.g)) {
                return false;
            }
            u0.h.g gVar = (u0.h.g) obj;
            return java.lang.Float.compare(this.f55268c, gVar.f55268c) == 0 && java.lang.Float.compare(this.f55269d, gVar.f55269d) == 0 && java.lang.Float.compare(this.f55270e, gVar.f55270e) == 0 && java.lang.Float.compare(this.f55271f, gVar.f55271f) == 0;
        }

        public final float f() {
            return this.f55271f;
        }

        public int hashCode() {
            return (((((java.lang.Float.floatToIntBits(this.f55268c) * 31) + java.lang.Float.floatToIntBits(this.f55269d)) * 31) + java.lang.Float.floatToIntBits(this.f55270e)) * 31) + java.lang.Float.floatToIntBits(this.f55271f);
        }

        public java.lang.String toString() {
            return "QuadTo(x1=" + this.f55268c + ", y1=" + this.f55269d + ", x2=" + this.f55270e + ", y2=" + this.f55271f + ')';
        }
    }

    /* JADX INFO: renamed from: u0.h$h, reason: collision with other inner class name */
    public static final class C0724h extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55275f;

        public C0724h(float f6, float f10, float f11, float f12) {
            super(true, false, 2, null);
            this.f55272c = f6;
            this.f55273d = f10;
            this.f55274e = f11;
            this.f55275f = f12;
        }

        public final float c() {
            return this.f55272c;
        }

        public final float d() {
            return this.f55274e;
        }

        public final float e() {
            return this.f55273d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p201u0.h.C0724h)) {
                return false;
            }
            p201u0.h.C0724h c0724h = (p201u0.h.C0724h) obj;
            return java.lang.Float.compare(this.f55272c, c0724h.f55272c) == 0 && java.lang.Float.compare(this.f55273d, c0724h.f55273d) == 0 && java.lang.Float.compare(this.f55274e, c0724h.f55274e) == 0 && java.lang.Float.compare(this.f55275f, c0724h.f55275f) == 0;
        }

        public final float f() {
            return this.f55275f;
        }

        public int hashCode() {
            return (((((java.lang.Float.floatToIntBits(this.f55272c) * 31) + java.lang.Float.floatToIntBits(this.f55273d)) * 31) + java.lang.Float.floatToIntBits(this.f55274e)) * 31) + java.lang.Float.floatToIntBits(this.f55275f);
        }

        public java.lang.String toString() {
            return "ReflectiveCurveTo(x1=" + this.f55272c + ", y1=" + this.f55273d + ", x2=" + this.f55274e + ", y2=" + this.f55275f + ')';
        }
    }

    public static final class i extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55277d;

        public i(float f6, float f10) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f55276c = f6;
            this.f55277d = f10;
        }

        public final float c() {
            return this.f55276c;
        }

        public final float d() {
            return this.f55277d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.i)) {
                return false;
            }
            u0.h.i iVar = (u0.h.i) obj;
            return java.lang.Float.compare(this.f55276c, iVar.f55276c) == 0 && java.lang.Float.compare(this.f55277d, iVar.f55277d) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f55276c) * 31) + java.lang.Float.floatToIntBits(this.f55277d);
        }

        public java.lang.String toString() {
            return "ReflectiveQuadTo(x=" + this.f55276c + ", y=" + this.f55277d + ')';
        }
    }

    public static final class j extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f55281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f55282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f55283h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f55284i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f6, float f10, float f11, boolean z6, boolean z10, float f12, float f13) {
            boolean z11 = false;
            super(z11, z11, 3, null);
            this.f55278c = f6;
            this.f55279d = f10;
            this.f55280e = f11;
            this.f55281f = z6;
            this.f55282g = z10;
            this.f55283h = f12;
            this.f55284i = f13;
        }

        public final float c() {
            return this.f55283h;
        }

        public final float d() {
            return this.f55284i;
        }

        public final float e() {
            return this.f55278c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.j)) {
                return false;
            }
            u0.h.j jVar = (u0.h.j) obj;
            return java.lang.Float.compare(this.f55278c, jVar.f55278c) == 0 && java.lang.Float.compare(this.f55279d, jVar.f55279d) == 0 && java.lang.Float.compare(this.f55280e, jVar.f55280e) == 0 && this.f55281f == jVar.f55281f && this.f55282g == jVar.f55282g && java.lang.Float.compare(this.f55283h, jVar.f55283h) == 0 && java.lang.Float.compare(this.f55284i, jVar.f55284i) == 0;
        }

        public final float f() {
            return this.f55280e;
        }

        public final float g() {
            return this.f55279d;
        }

        public final boolean h() {
            return this.f55281f;
        }

        public int hashCode() {
            return (((((((((((java.lang.Float.floatToIntBits(this.f55278c) * 31) + java.lang.Float.floatToIntBits(this.f55279d)) * 31) + java.lang.Float.floatToIntBits(this.f55280e)) * 31) + p190t.h.a(this.f55281f)) * 31) + p190t.h.a(this.f55282g)) * 31) + java.lang.Float.floatToIntBits(this.f55283h)) * 31) + java.lang.Float.floatToIntBits(this.f55284i);
        }

        public final boolean i() {
            return this.f55282g;
        }

        public java.lang.String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f55278c + ", verticalEllipseRadius=" + this.f55279d + ", theta=" + this.f55280e + ", isMoreThanHalf=" + this.f55281f + ", isPositiveArc=" + this.f55282g + ", arcStartDx=" + this.f55283h + ", arcStartDy=" + this.f55284i + ')';
        }
    }

    public static final class k extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f55289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f55290h;

        public k(float f6, float f10, float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f55285c = f6;
            this.f55286d = f10;
            this.f55287e = f11;
            this.f55288f = f12;
            this.f55289g = f13;
            this.f55290h = f14;
        }

        public final float c() {
            return this.f55285c;
        }

        public final float d() {
            return this.f55287e;
        }

        public final float e() {
            return this.f55289g;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.k)) {
                return false;
            }
            u0.h.k kVar = (u0.h.k) obj;
            return java.lang.Float.compare(this.f55285c, kVar.f55285c) == 0 && java.lang.Float.compare(this.f55286d, kVar.f55286d) == 0 && java.lang.Float.compare(this.f55287e, kVar.f55287e) == 0 && java.lang.Float.compare(this.f55288f, kVar.f55288f) == 0 && java.lang.Float.compare(this.f55289g, kVar.f55289g) == 0 && java.lang.Float.compare(this.f55290h, kVar.f55290h) == 0;
        }

        public final float f() {
            return this.f55286d;
        }

        public final float g() {
            return this.f55288f;
        }

        public final float h() {
            return this.f55290h;
        }

        public int hashCode() {
            return (((((((((java.lang.Float.floatToIntBits(this.f55285c) * 31) + java.lang.Float.floatToIntBits(this.f55286d)) * 31) + java.lang.Float.floatToIntBits(this.f55287e)) * 31) + java.lang.Float.floatToIntBits(this.f55288f)) * 31) + java.lang.Float.floatToIntBits(this.f55289g)) * 31) + java.lang.Float.floatToIntBits(this.f55290h);
        }

        public java.lang.String toString() {
            return "RelativeCurveTo(dx1=" + this.f55285c + ", dy1=" + this.f55286d + ", dx2=" + this.f55287e + ", dy2=" + this.f55288f + ", dx3=" + this.f55289g + ", dy3=" + this.f55290h + ')';
        }
    }

    public static final class l extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55291c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f6) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55291c = f6;
        }

        public final float c() {
            return this.f55291c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0.h.l) && java.lang.Float.compare(this.f55291c, ((u0.h.l) obj).f55291c) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f55291c);
        }

        public java.lang.String toString() {
            return "RelativeHorizontalTo(dx=" + this.f55291c + ')';
        }
    }

    public static final class m extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55293d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f6, float f10) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55292c = f6;
            this.f55293d = f10;
        }

        public final float c() {
            return this.f55292c;
        }

        public final float d() {
            return this.f55293d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.m)) {
                return false;
            }
            u0.h.m mVar = (u0.h.m) obj;
            return java.lang.Float.compare(this.f55292c, mVar.f55292c) == 0 && java.lang.Float.compare(this.f55293d, mVar.f55293d) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f55292c) * 31) + java.lang.Float.floatToIntBits(this.f55293d);
        }

        public java.lang.String toString() {
            return "RelativeLineTo(dx=" + this.f55292c + ", dy=" + this.f55293d + ')';
        }
    }

    public static final class n extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55295d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f6, float f10) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55294c = f6;
            this.f55295d = f10;
        }

        public final float c() {
            return this.f55294c;
        }

        public final float d() {
            return this.f55295d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.n)) {
                return false;
            }
            u0.h.n nVar = (u0.h.n) obj;
            return java.lang.Float.compare(this.f55294c, nVar.f55294c) == 0 && java.lang.Float.compare(this.f55295d, nVar.f55295d) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f55294c) * 31) + java.lang.Float.floatToIntBits(this.f55295d);
        }

        public java.lang.String toString() {
            return "RelativeMoveTo(dx=" + this.f55294c + ", dy=" + this.f55295d + ')';
        }
    }

    public static final class o extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55299f;

        public o(float f6, float f10, float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f55296c = f6;
            this.f55297d = f10;
            this.f55298e = f11;
            this.f55299f = f12;
        }

        public final float c() {
            return this.f55296c;
        }

        public final float d() {
            return this.f55298e;
        }

        public final float e() {
            return this.f55297d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.o)) {
                return false;
            }
            u0.h.o oVar = (u0.h.o) obj;
            return java.lang.Float.compare(this.f55296c, oVar.f55296c) == 0 && java.lang.Float.compare(this.f55297d, oVar.f55297d) == 0 && java.lang.Float.compare(this.f55298e, oVar.f55298e) == 0 && java.lang.Float.compare(this.f55299f, oVar.f55299f) == 0;
        }

        public final float f() {
            return this.f55299f;
        }

        public int hashCode() {
            return (((((java.lang.Float.floatToIntBits(this.f55296c) * 31) + java.lang.Float.floatToIntBits(this.f55297d)) * 31) + java.lang.Float.floatToIntBits(this.f55298e)) * 31) + java.lang.Float.floatToIntBits(this.f55299f);
        }

        public java.lang.String toString() {
            return "RelativeQuadTo(dx1=" + this.f55296c + ", dy1=" + this.f55297d + ", dx2=" + this.f55298e + ", dy2=" + this.f55299f + ')';
        }
    }

    public static final class p extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55303f;

        public p(float f6, float f10, float f11, float f12) {
            super(true, false, 2, null);
            this.f55300c = f6;
            this.f55301d = f10;
            this.f55302e = f11;
            this.f55303f = f12;
        }

        public final float c() {
            return this.f55300c;
        }

        public final float d() {
            return this.f55302e;
        }

        public final float e() {
            return this.f55301d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.p)) {
                return false;
            }
            u0.h.p pVar = (u0.h.p) obj;
            return java.lang.Float.compare(this.f55300c, pVar.f55300c) == 0 && java.lang.Float.compare(this.f55301d, pVar.f55301d) == 0 && java.lang.Float.compare(this.f55302e, pVar.f55302e) == 0 && java.lang.Float.compare(this.f55303f, pVar.f55303f) == 0;
        }

        public final float f() {
            return this.f55303f;
        }

        public int hashCode() {
            return (((((java.lang.Float.floatToIntBits(this.f55300c) * 31) + java.lang.Float.floatToIntBits(this.f55301d)) * 31) + java.lang.Float.floatToIntBits(this.f55302e)) * 31) + java.lang.Float.floatToIntBits(this.f55303f);
        }

        public java.lang.String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f55300c + ", dy1=" + this.f55301d + ", dx2=" + this.f55302e + ", dy2=" + this.f55303f + ')';
        }
    }

    public static final class q extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f55305d;

        public q(float f6, float f10) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f55304c = f6;
            this.f55305d = f10;
        }

        public final float c() {
            return this.f55304c;
        }

        public final float d() {
            return this.f55305d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u0.h.q)) {
                return false;
            }
            u0.h.q qVar = (u0.h.q) obj;
            return java.lang.Float.compare(this.f55304c, qVar.f55304c) == 0 && java.lang.Float.compare(this.f55305d, qVar.f55305d) == 0;
        }

        public int hashCode() {
            return (java.lang.Float.floatToIntBits(this.f55304c) * 31) + java.lang.Float.floatToIntBits(this.f55305d);
        }

        public java.lang.String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f55304c + ", dy=" + this.f55305d + ')';
        }
    }

    public static final class r extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55306c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f6) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55306c = f6;
        }

        public final float c() {
            return this.f55306c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0.h.r) && java.lang.Float.compare(this.f55306c, ((u0.h.r) obj).f55306c) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f55306c);
        }

        public java.lang.String toString() {
            return "RelativeVerticalTo(dy=" + this.f55306c + ')';
        }
    }

    public static final class s extends p201u0.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f55307c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f6) {
            boolean z6 = false;
            super(z6, z6, 3, null);
            this.f55307c = f6;
        }

        public final float c() {
            return this.f55307c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0.h.s) && java.lang.Float.compare(this.f55307c, ((u0.h.s) obj).f55307c) == 0;
        }

        public int hashCode() {
            return java.lang.Float.floatToIntBits(this.f55307c);
        }

        public java.lang.String toString() {
            return "VerticalTo(y=" + this.f55307c + ')';
        }
    }

    private h(boolean z6, boolean z10) {
        this.f55247a = z6;
        this.f55248b = z10;
    }

    public /* synthetic */ h(boolean z6, boolean z10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? false : z10, null);
    }

    public /* synthetic */ h(boolean z6, boolean z10, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, z10);
    }

    public final boolean a() {
        return this.f55247a;
    }

    public final boolean b() {
        return this.f55248b;
    }
}
