package S8;

/* JADX INFO: renamed from: S8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1634g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S8.C1634g.b f12644d = new S8.C1634g.b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final S8.C1634g f12645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final S8.C1634g f12646f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S8.C1634g.a f12648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S8.C1634g.c f12649c;

    /* JADX INFO: renamed from: S8.g$a */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final S8.C1634g.a.C0269a f12650j = new S8.C1634g.a.C0269a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final S8.C1634g.a f12651k = new S8.C1634g.a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.String f12654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.String f12655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.lang.String f12656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.lang.String f12657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f12658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f12659h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f12660i;

        /* JADX INFO: renamed from: S8.g$a$a, reason: collision with other inner class name */
        public static final class C0269a {
            private C0269a() {
            }

            public /* synthetic */ C0269a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final S8.C1634g.a a() {
                return S8.C1634g.a.f12651k;
            }
        }

        public a(int i6, int i10, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            p247y7.AbstractC7350t.f(str, "groupSeparator");
            p247y7.AbstractC7350t.f(str2, "byteSeparator");
            p247y7.AbstractC7350t.f(str3, "bytePrefix");
            p247y7.AbstractC7350t.f(str4, "byteSuffix");
            this.f12652a = i6;
            this.f12653b = i10;
            this.f12654c = str;
            this.f12655d = str2;
            this.f12656e = str3;
            this.f12657f = str4;
            this.f12658g = i6 == Integer.MAX_VALUE && i10 == Integer.MAX_VALUE;
            this.f12659h = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.f12660i = S8.AbstractC1635h.b(str) || S8.AbstractC1635h.b(str2) || S8.AbstractC1635h.b(str3) || S8.AbstractC1635h.b(str4);
        }

        public final java.lang.StringBuilder b(java.lang.StringBuilder sb, java.lang.String str) {
            p247y7.AbstractC7350t.f(sb, "sb");
            p247y7.AbstractC7350t.f(str, "indent");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(this.f12652a);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(this.f12653b);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append(this.f12654c);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append(this.f12655d);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append(this.f12656e);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append(this.f12657f);
            sb.append("\"");
            return sb;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: S8.g$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final S8.C1634g a() {
            return S8.C1634g.f12645e;
        }
    }

    /* JADX INFO: renamed from: S8.g$c */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final S8.C1634g.c.a f12661h = new S8.C1634g.c.a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final S8.C1634g.c f12662i = new S8.C1634g.c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f12663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f12664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f12665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f12666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f12667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f12668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f12669g;

        /* JADX INFO: renamed from: S8.g$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final S8.C1634g.c a() {
                return S8.C1634g.c.f12662i;
            }
        }

        public c(java.lang.String str, java.lang.String str2, boolean z6, int i6) {
            p247y7.AbstractC7350t.f(str, "prefix");
            p247y7.AbstractC7350t.f(str2, "suffix");
            this.f12663a = str;
            this.f12664b = str2;
            this.f12665c = z6;
            this.f12666d = i6;
            boolean z10 = str.length() == 0 && str2.length() == 0;
            this.f12667e = z10;
            this.f12668f = z10 && i6 == 1;
            this.f12669g = S8.AbstractC1635h.b(str) || S8.AbstractC1635h.b(str2);
        }

        public final java.lang.StringBuilder b(java.lang.StringBuilder sb, java.lang.String str) {
            p247y7.AbstractC7350t.f(sb, "sb");
            p247y7.AbstractC7350t.f(str, "indent");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append(this.f12663a);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append(this.f12664b);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f12665c);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(this.f12666d);
            return sb;
        }

        public final boolean c() {
            return this.f12669g;
        }

        public final int d() {
            return this.f12666d;
        }

        public final java.lang.String e() {
            return this.f12663a;
        }

        public final boolean f() {
            return this.f12665c;
        }

        public final java.lang.String g() {
            return this.f12664b;
        }

        public final boolean h() {
            return this.f12667e;
        }

        public final boolean i() {
            return this.f12668f;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        S8.C1634g.a.C0269a c0269a = S8.C1634g.a.f12650j;
        S8.C1634g.a aVarA = c0269a.a();
        S8.C1634g.c.a aVar = S8.C1634g.c.f12661h;
        f12645e = new S8.C1634g(false, aVarA, aVar.a());
        f12646f = new S8.C1634g(true, c0269a.a(), aVar.a());
    }

    public C1634g(boolean z6, S8.C1634g.a aVar, S8.C1634g.c cVar) {
        p247y7.AbstractC7350t.f(aVar, "bytes");
        p247y7.AbstractC7350t.f(cVar, "number");
        this.f12647a = z6;
        this.f12648b = aVar;
        this.f12649c = cVar;
    }

    public final S8.C1634g.c b() {
        return this.f12649c;
    }

    public final boolean c() {
        return this.f12647a;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.f12647a);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.f12648b.b(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f12649c.b(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
