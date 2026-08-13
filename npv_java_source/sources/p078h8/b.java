package p078h8;

/* JADX INFO: loaded from: classes2.dex */
public class b implements g8.t.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f46527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.Map f46528k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f46529a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f46530b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46531c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f46532d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String[] f46533e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String[] f46534f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String[] f46535g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p078h8.a.EnumC0561a f46536h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.String[] f46537i = null;

    /* JADX INFO: renamed from: h8.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0563b implements g8.t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f46538a = new java.util.ArrayList();

        private static /* synthetic */ void f(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i6 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i6 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i6 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i6 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // g8.t.b
        public void a() {
            g((java.lang.String[]) this.f46538a.toArray(new java.lang.String[0]));
        }

        @Override // g8.t.b
        public void b(p138n8.b bVar, p138n8.f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // g8.t.b
        public void c(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                this.f46538a.add((java.lang.String) obj);
            }
        }

        @Override // g8.t.b
        public g8.t.a d(p138n8.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // g8.t.b
        public void e(p198t8.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(java.lang.String[] strArr);
    }

    private class c implements g8.t.a {

        class a extends p078h8.b.AbstractC0563b {
            a() {
            }

            private static /* synthetic */ void f(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // p078h8.b.AbstractC0563b
            protected void g(java.lang.String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                p078h8.b.this.f46533e = strArr;
            }
        }

        /* JADX INFO: renamed from: h8.b$c$b, reason: collision with other inner class name */
        class C0564b extends p078h8.b.AbstractC0563b {
            C0564b() {
            }

            private static /* synthetic */ void f(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // p078h8.b.AbstractC0563b
            protected void g(java.lang.String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                p078h8.b.this.f46534f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "enumClassId";
            } else if (i6 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i6 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i6 == 1 || i6 == 2) {
                objArr[2] = "visitEnum";
            } else if (i6 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private g8.t.b h() {
            return new h8.b.c.a();
        }

        private g8.t.b i() {
            return new h8.b.c.C0564b();
        }

        @Override // g8.t.a
        public void a() {
        }

        @Override // g8.t.a
        public g8.t.a b(p138n8.f fVar, p138n8.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // g8.t.a
        public void c(p138n8.f fVar, p198t8.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // g8.t.a
        public g8.t.b d(p138n8.f fVar) {
            java.lang.String strG = fVar != null ? fVar.g() : null;
            if ("d1".equals(strG)) {
                return h();
            }
            if ("d2".equals(strG)) {
                return i();
            }
            return null;
        }

        @Override // g8.t.a
        public void e(p138n8.f fVar, p138n8.b bVar, p138n8.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // g8.t.a
        public void f(p138n8.f fVar, java.lang.Object obj) {
            if (fVar == null) {
                return;
            }
            java.lang.String strG = fVar.g();
            if ("k".equals(strG)) {
                if (obj instanceof java.lang.Integer) {
                    p078h8.b.this.f46536h = p078h8.a.EnumC0561a.i(((java.lang.Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strG)) {
                if (obj instanceof int[]) {
                    p078h8.b.this.f46529a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strG)) {
                if (obj instanceof java.lang.String) {
                    java.lang.String str = (java.lang.String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    p078h8.b.this.f46530b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strG)) {
                if (obj instanceof java.lang.Integer) {
                    p078h8.b.this.f46531c = ((java.lang.Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strG) && (obj instanceof java.lang.String)) {
                java.lang.String str2 = (java.lang.String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                p078h8.b.this.f46532d = str2;
            }
        }
    }

    private class d implements g8.t.a {

        class a extends p078h8.b.AbstractC0563b {
            a() {
            }

            private static /* synthetic */ void f(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // p078h8.b.AbstractC0563b
            protected void g(java.lang.String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                p078h8.b.this.f46537i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "enumClassId";
            } else if (i6 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i6 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i6 == 1 || i6 == 2) {
                objArr[2] = "visitEnum";
            } else if (i6 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private g8.t.b h() {
            return new h8.b.d.a();
        }

        @Override // g8.t.a
        public void a() {
        }

        @Override // g8.t.a
        public g8.t.a b(p138n8.f fVar, p138n8.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // g8.t.a
        public void c(p138n8.f fVar, p198t8.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // g8.t.a
        public g8.t.b d(p138n8.f fVar) {
            if ("b".equals(fVar != null ? fVar.g() : null)) {
                return h();
            }
            return null;
        }

        @Override // g8.t.a
        public void e(p138n8.f fVar, p138n8.b bVar, p138n8.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // g8.t.a
        public void f(p138n8.f fVar, java.lang.Object obj) {
        }
    }

    private class e implements g8.t.a {

        class a extends p078h8.b.AbstractC0563b {
            a() {
            }

            private static /* synthetic */ void f(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // p078h8.b.AbstractC0563b
            protected void g(java.lang.String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                p078h8.b.this.f46533e = strArr;
            }
        }

        /* JADX INFO: renamed from: h8.b$e$b, reason: collision with other inner class name */
        class C0565b extends p078h8.b.AbstractC0563b {
            C0565b() {
            }

            private static /* synthetic */ void f(int i6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // p078h8.b.AbstractC0563b
            protected void g(java.lang.String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                p078h8.b.this.f46534f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 == 1) {
                objArr[0] = "enumClassId";
            } else if (i6 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i6 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i6 == 1 || i6 == 2) {
                objArr[2] = "visitEnum";
            } else if (i6 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private g8.t.b h() {
            return new h8.b.e.a();
        }

        private g8.t.b i() {
            return new h8.b.e.C0565b();
        }

        @Override // g8.t.a
        public void a() {
        }

        @Override // g8.t.a
        public g8.t.a b(p138n8.f fVar, p138n8.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // g8.t.a
        public void c(p138n8.f fVar, p198t8.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // g8.t.a
        public g8.t.b d(p138n8.f fVar) {
            java.lang.String strG = fVar != null ? fVar.g() : null;
            if ("data".equals(strG) || "filePartClassNames".equals(strG)) {
                return h();
            }
            if ("strings".equals(strG)) {
                return i();
            }
            return null;
        }

        @Override // g8.t.a
        public void e(p138n8.f fVar, p138n8.b bVar, p138n8.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // g8.t.a
        public void f(p138n8.f fVar, java.lang.Object obj) {
            if (fVar == null) {
                return;
            }
            java.lang.String strG = fVar.g();
            if ("version".equals(strG)) {
                if (obj instanceof int[]) {
                    p078h8.b.this.f46529a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strG)) {
                p078h8.b.this.f46530b = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            }
        }
    }

    static {
        try {
            f46527j = "true".equals(java.lang.System.getProperty("kotlin.ignore.old.metadata"));
        } catch (java.security.AccessControlException unused) {
            f46527j = false;
        }
        java.util.HashMap map = new java.util.HashMap();
        f46528k = map;
        map.put(p138n8.b.m(new p138n8.c("kotlin.jvm.internal.KotlinClass")), p078h8.a.EnumC0561a.CLASS);
        map.put(p138n8.b.m(new p138n8.c("kotlin.jvm.internal.KotlinFileFacade")), p078h8.a.EnumC0561a.FILE_FACADE);
        map.put(p138n8.b.m(new p138n8.c("kotlin.jvm.internal.KotlinMultifileClass")), p078h8.a.EnumC0561a.MULTIFILE_CLASS);
        map.put(p138n8.b.m(new p138n8.c("kotlin.jvm.internal.KotlinMultifileClassPart")), p078h8.a.EnumC0561a.MULTIFILE_CLASS_PART);
        map.put(p138n8.b.m(new p138n8.c("kotlin.jvm.internal.KotlinSyntheticClass")), p078h8.a.EnumC0561a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i6 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        p078h8.a.EnumC0561a enumC0561a = this.f46536h;
        return enumC0561a == p078h8.a.EnumC0561a.CLASS || enumC0561a == p078h8.a.EnumC0561a.FILE_FACADE || enumC0561a == p078h8.a.EnumC0561a.MULTIFILE_CLASS_PART;
    }

    @Override // g8.t.c
    public void a() {
    }

    @Override // g8.t.c
    public g8.t.a c(p138n8.b bVar, O7.a0 a0Var) {
        p078h8.a.EnumC0561a enumC0561a;
        if (bVar == null) {
            d(0);
        }
        if (a0Var == null) {
            d(1);
        }
        p138n8.c cVarB = bVar.b();
        if (cVarB.equals(X7.B.f15896a)) {
            return new h8.b.c();
        }
        if (cVarB.equals(X7.B.f15915t)) {
            return new h8.b.d();
        }
        if (f46527j || this.f46536h != null || (enumC0561a = (p078h8.a.EnumC0561a) f46528k.get(bVar)) == null) {
            return null;
        }
        this.f46536h = enumC0561a;
        return new h8.b.e();
    }

    public p078h8.a m(p128m8.e eVar) {
        if (this.f46536h == null || this.f46529a == null) {
            return null;
        }
        p128m8.e eVar2 = new p128m8.e(this.f46529a, (this.f46531c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f46535g = this.f46533e;
            this.f46533e = null;
        } else if (o() && this.f46533e == null) {
            return null;
        }
        java.lang.String[] strArr = this.f46537i;
        return new p078h8.a(this.f46536h, eVar2, this.f46533e, this.f46535g, this.f46534f, this.f46530b, this.f46531c, this.f46532d, strArr != null ? p128m8.a.e(strArr) : null);
    }

    public p078h8.a n() {
        return m(p128m8.e.f51215i);
    }
}
