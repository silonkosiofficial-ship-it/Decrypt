package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X7.x.b f16053d = new X7.x.b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X7.x f16054e = new X7.x(X7.v.b(null, 1, null), X7.x.a.f16058L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.z f16055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f16056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16057c;

    /* synthetic */ class a extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final X7.x.a f16058L = new X7.x.a();

        a() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.d(X7.v.class, "compiler.common.jvm");
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final X7.G l(p138n8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "p0");
            return X7.v.d(cVar);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final X7.x a() {
            return X7.x.f16054e;
        }
    }

    public x(X7.z zVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(zVar, "jsr305");
        p247y7.AbstractC7350t.f(lVar, "getReportLevelForAnnotation");
        this.f16055a = zVar;
        this.f16056b = lVar;
        this.f16057c = zVar.d() || lVar.l(X7.v.e()) == X7.G.IGNORE;
    }

    public final boolean b() {
        return this.f16057c;
    }

    public final p237x7.l c() {
        return this.f16056b;
    }

    public final X7.z d() {
        return this.f16055a;
    }

    public java.lang.String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f16055a + ", getReportLevelForAnnotation=" + this.f16056b + ')';
    }
}
