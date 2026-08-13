package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I7.H f5329a = new I7.H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p168q8.c f5330b = p168q8.c.f53159g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5331a;

        static {
            int[] iArr = new int[F7.j.a.values().length];
            try {
                iArr[F7.j.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F7.j.a.INSTANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F7.j.a.VALUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f5331a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.H.b f5332D = new I7.H.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(O7.j0 j0Var) {
            I7.H h6 = I7.H.f5329a;
            F8.E type = j0Var.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            return h6.h(type);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.H.c f5333D = new I7.H.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(O7.j0 j0Var) {
            I7.H h6 = I7.H.f5329a;
            F8.E type = j0Var.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            return h6.h(type);
        }
    }

    private H() {
    }

    private final void a(java.lang.StringBuilder sb, O7.X x6) {
        if (x6 != null) {
            F8.E type = x6.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            sb.append(h(type));
            sb.append(".");
        }
    }

    private final void b(java.lang.StringBuilder sb, O7.InterfaceC1420a interfaceC1420a) {
        O7.X xI = I7.M.i(interfaceC1420a);
        O7.X xV0 = interfaceC1420a.v0();
        a(sb, xI);
        boolean z6 = (xI == null || xV0 == null) ? false : true;
        if (z6) {
            sb.append("(");
        }
        a(sb, xV0);
        if (z6) {
            sb.append(")");
        }
    }

    private final java.lang.String c(O7.InterfaceC1420a interfaceC1420a) {
        if (interfaceC1420a instanceof O7.U) {
            return g((O7.U) interfaceC1420a);
        }
        if (interfaceC1420a instanceof O7.InterfaceC1443y) {
            return d((O7.InterfaceC1443y) interfaceC1420a);
        }
        throw new java.lang.IllegalStateException(("Illegal callable: " + interfaceC1420a).toString());
    }

    public final java.lang.String d(O7.InterfaceC1443y interfaceC1443y) throws java.io.IOException {
        p247y7.AbstractC7350t.f(interfaceC1443y, "descriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("fun ");
        I7.H h6 = f5329a;
        h6.b(sb, interfaceC1443y);
        p168q8.c cVar = f5330b;
        p138n8.f name = interfaceC1443y.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        sb.append(cVar.v(name, true));
        java.util.List listN = interfaceC1443y.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        p097j7.G.o0(listN, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : I7.H.b.f5332D);
        sb.append(": ");
        F8.E eL = interfaceC1443y.l();
        p247y7.AbstractC7350t.c(eL);
        sb.append(h6.h(eL));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final java.lang.String e(O7.InterfaceC1443y interfaceC1443y) throws java.io.IOException {
        p247y7.AbstractC7350t.f(interfaceC1443y, "invoke");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        I7.H h6 = f5329a;
        h6.b(sb, interfaceC1443y);
        java.util.List listN = interfaceC1443y.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        p097j7.G.o0(listN, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : I7.H.c.f5333D);
        sb.append(" -> ");
        F8.E eL = interfaceC1443y.l();
        p247y7.AbstractC7350t.c(eL);
        sb.append(h6.h(eL));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final java.lang.String f(I7.u uVar) {
        java.lang.String str;
        p247y7.AbstractC7350t.f(uVar, "parameter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = I7.H.a.f5331a[uVar.j().ordinal()];
        if (i6 == 1) {
            str = "extension receiver parameter";
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    str = "parameter #" + uVar.getIndex() + ' ' + uVar.getName();
                }
                sb.append(" of ");
                sb.append(f5329a.c(uVar.d().F()));
                java.lang.String string = sb.toString();
                p247y7.AbstractC7350t.e(string, "toString(...)");
                return string;
            }
            str = "instance parameter";
        }
        sb.append(str);
        sb.append(" of ");
        sb.append(f5329a.c(uVar.d().F()));
        java.lang.String string2 = sb.toString();
        p247y7.AbstractC7350t.e(string2, "toString(...)");
        return string2;
    }

    public final java.lang.String g(O7.U u6) {
        p247y7.AbstractC7350t.f(u6, "descriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(u6.t0() ? "var " : "val ");
        I7.H h6 = f5329a;
        h6.b(sb, u6);
        p168q8.c cVar = f5330b;
        p138n8.f name = u6.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        sb.append(cVar.v(name, true));
        sb.append(": ");
        F8.E type = u6.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        sb.append(h6.h(type));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final java.lang.String h(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
        return f5330b.w(e6);
    }
}
