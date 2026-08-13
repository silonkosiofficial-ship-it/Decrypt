package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public final class Z implements F7.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y7.Z.a f57268e = new y7.Z.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7.d f57269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f57270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F7.o f57271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f57272d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57273a;

        static {
            int[] iArr = new int[F7.r.values().length];
            try {
                iArr[F7.r.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F7.r.IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F7.r.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f57273a = iArr;
        }
    }

    public Z(F7.d dVar, java.util.List list, F7.o oVar, int i6) {
        p247y7.AbstractC7350t.f(dVar, "classifier");
        p247y7.AbstractC7350t.f(list, "arguments");
        this.f57269a = dVar;
        this.f57270b = list;
        this.f57271c = oVar;
        this.f57272d = i6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z(F7.d dVar, java.util.List list, boolean z6) {
        this(dVar, list, null, z6 ? 1 : 0);
        p247y7.AbstractC7350t.f(dVar, "classifier");
        p247y7.AbstractC7350t.f(list, "arguments");
    }

    private final java.lang.String e(F7.q qVar) {
        java.lang.String strValueOf;
        java.lang.StringBuilder sb;
        java.lang.String str;
        if (qVar.d() == null) {
            return "*";
        }
        F7.o oVarC = qVar.c();
        p247y7.Z z6 = oVarC instanceof p247y7.Z ? (p247y7.Z) oVarC : null;
        if (z6 == null || (strValueOf = z6.f(true)) == null) {
            strValueOf = java.lang.String.valueOf(qVar.c());
        }
        F7.r rVarD = qVar.d();
        int i6 = rVarD == null ? -1 : y7.Z.b.f57273a[rVarD.ordinal()];
        if (i6 == 1) {
            return strValueOf;
        }
        if (i6 == 2) {
            sb = new java.lang.StringBuilder();
            str = "in ";
        } else {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            sb = new java.lang.StringBuilder();
            str = "out ";
        }
        sb.append(str);
        sb.append(strValueOf);
        return sb.toString();
    }

    private final java.lang.String f(boolean z6) {
        java.lang.String name;
        F7.d dVarB = b();
        F7.c cVar = dVarB instanceof F7.c ? (F7.c) dVarB : null;
        java.lang.Class clsB = cVar != null ? p227w7.a.b(cVar) : null;
        if (clsB == null) {
            name = b().toString();
        } else if ((this.f57272d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = h(clsB);
        } else if (z6 && clsB.isPrimitive()) {
            F7.d dVarB2 = b();
            p247y7.AbstractC7350t.d(dVarB2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = p227w7.a.c((F7.c) dVarB2).getName();
        } else {
            name = clsB.getName();
        }
        java.lang.String str = name + (a().isEmpty() ? "" : p097j7.AbstractC6879v.r0(a(), ", ", "<", ">", 0, null, new p237x7.l() { // from class: y7.Y
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p247y7.Z.g(this.f57267C, (F7.q) obj);
            }
        }, 24, null)) + (k() ? "?" : "");
        F7.o oVar = this.f57271c;
        if (!(oVar instanceof p247y7.Z)) {
            return str;
        }
        java.lang.String strF = ((p247y7.Z) oVar).f(true);
        if (p247y7.AbstractC7350t.b(strF, str)) {
            return str;
        }
        if (p247y7.AbstractC7350t.b(strF, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strF + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence g(p247y7.Z z6, F7.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "it");
        return z6.e(qVar);
    }

    private final java.lang.String h(java.lang.Class cls) {
        if (p247y7.AbstractC7350t.b(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (p247y7.AbstractC7350t.b(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (p247y7.AbstractC7350t.b(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (p247y7.AbstractC7350t.b(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (p247y7.AbstractC7350t.b(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (p247y7.AbstractC7350t.b(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (p247y7.AbstractC7350t.b(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return p247y7.AbstractC7350t.b(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // F7.o
    public java.util.List a() {
        return this.f57270b;
    }

    @Override // F7.o
    public F7.d b() {
        return this.f57269a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p247y7.Z) {
            p247y7.Z z6 = (p247y7.Z) obj;
            if (p247y7.AbstractC7350t.b(b(), z6.b()) && p247y7.AbstractC7350t.b(a(), z6.a()) && p247y7.AbstractC7350t.b(this.f57271c, z6.f57271c) && this.f57272d == z6.f57272d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((b().hashCode() * 31) + a().hashCode()) * 31) + this.f57272d;
    }

    public final int i() {
        return this.f57272d;
    }

    public final F7.o j() {
        return this.f57271c;
    }

    public boolean k() {
        return (this.f57272d & 1) != 0;
    }

    public java.lang.String toString() {
        return f(false) + " (Kotlin reflection is not available)";
    }
}
