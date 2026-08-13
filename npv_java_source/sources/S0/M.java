package S0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S0.M.a f12266e = new S0.M.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12267f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private S0.C1607o f12269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12270c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12271d = -1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public M(java.lang.String str) {
        this.f12268a = str;
    }

    public final char a(int i6) {
        S0.C1607o c1607o = this.f12269b;
        if (c1607o != null && i6 >= this.f12270c) {
            int iE = c1607o.e();
            int i10 = this.f12270c;
            return i6 < iE + i10 ? c1607o.d(i6 - i10) : this.f12268a.charAt(i6 - ((iE - this.f12271d) + i10));
        }
        return this.f12268a.charAt(i6);
    }

    public final int b() {
        S0.C1607o c1607o = this.f12269b;
        return c1607o == null ? this.f12268a.length() : (this.f12268a.length() - (this.f12271d - this.f12270c)) + c1607o.e();
    }

    public final void c(int i6, int i10, java.lang.String str) {
        if (i6 > i10) {
            throw new java.lang.IllegalArgumentException(("start index must be less than or equal to end index: " + i6 + " > " + i10).toString());
        }
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("start must be non-negative, but was " + i6).toString());
        }
        S0.C1607o c1607o = this.f12269b;
        if (c1607o != null) {
            int i11 = this.f12270c;
            int i12 = i6 - i11;
            int i13 = i10 - i11;
            if (i12 >= 0 && i13 <= c1607o.e()) {
                c1607o.g(i12, i13, str);
                return;
            }
            this.f12268a = toString();
            this.f12269b = null;
            this.f12270c = -1;
            this.f12271d = -1;
            c(i6, i10, str);
            return;
        }
        int iMax = java.lang.Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = java.lang.Math.min(i6, 64);
        int iMin2 = java.lang.Math.min(this.f12268a.length() - i10, 64);
        int i14 = i6 - iMin;
        S0.AbstractC1609q.a(this.f12268a, cArr, 0, i14, i6);
        int i15 = iMax - iMin2;
        int i16 = iMin2 + i10;
        S0.AbstractC1609q.a(this.f12268a, cArr, i15, i10, i16);
        S0.AbstractC1608p.b(str, cArr, iMin);
        this.f12269b = new S0.C1607o(cArr, iMin + str.length(), i15);
        this.f12270c = i14;
        this.f12271d = i16;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public java.lang.String toString() {
        S0.C1607o c1607o = this.f12269b;
        if (c1607o == null) {
            return this.f12268a;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) this.f12268a, 0, this.f12270c);
        c1607o.a(sb);
        java.lang.String str = this.f12268a;
        sb.append((java.lang.CharSequence) str, this.f12271d, str.length());
        return sb.toString();
    }
}
