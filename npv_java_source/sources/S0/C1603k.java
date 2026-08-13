package S0;

/* JADX INFO: renamed from: S0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1603k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S0.V f12360a = new S0.V(M0.AbstractC1333e.g(), M0.N.f6666b.a(), (M0.N) null, (p247y7.AbstractC7342k) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private S0.C1604l f12361b = new S0.C1604l(this.f12360a.f(), this.f12360a.h(), null);

    /* JADX INFO: renamed from: S0.k$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S0.InterfaceC1601i f12362D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S0.C1603k f12363E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S0.InterfaceC1601i interfaceC1601i, S0.C1603k c1603k) {
            super(1);
            this.f12362D = interfaceC1601i;
            this.f12363E = c1603k;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(S0.InterfaceC1601i interfaceC1601i) {
            return (this.f12362D == interfaceC1601i ? " > " : "   ") + this.f12363E.e(interfaceC1601i);
        }
    }

    private final java.lang.String c(java.util.List list, S0.InterfaceC1601i interfaceC1601i) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f12361b.h() + ", composition=" + this.f12361b.d() + ", selection=" + ((java.lang.Object) M0.N.q(this.f12361b.i())) + "):");
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        p097j7.G.o0(list, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new S0.C1603k.a(interfaceC1601i, this));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String e(S0.InterfaceC1601i interfaceC1601i) {
        java.lang.StringBuilder sb;
        int iB;
        if (!(interfaceC1601i instanceof S0.C1593a)) {
            if (interfaceC1601i instanceof S0.T) {
                sb = new java.lang.StringBuilder();
                sb.append("SetComposingTextCommand(text.length=");
                S0.T t6 = (S0.T) interfaceC1601i;
                sb.append(t6.c().length());
                sb.append(", newCursorPosition=");
                iB = t6.b();
            } else {
                if ((interfaceC1601i instanceof S0.S) || (interfaceC1601i instanceof S0.C1599g) || (interfaceC1601i instanceof S0.C1600h) || (interfaceC1601i instanceof S0.U) || (interfaceC1601i instanceof S0.C1606n) || (interfaceC1601i instanceof S0.C1598f)) {
                    return interfaceC1601i.toString();
                }
                sb = new java.lang.StringBuilder();
                sb.append("Unknown EditCommand: ");
                java.lang.String strC = p247y7.P.b(interfaceC1601i.getClass()).c();
                if (strC == null) {
                    strC = "{anonymous EditCommand}";
                }
                sb.append(strC);
            }
            return sb.toString();
        }
        sb = new java.lang.StringBuilder();
        sb.append("CommitTextCommand(text.length=");
        S0.C1593a c1593a = (S0.C1593a) interfaceC1601i;
        sb.append(c1593a.c().length());
        sb.append(", newCursorPosition=");
        iB = c1593a.b();
        sb.append(iB);
        sb.append(')');
        return sb.toString();
    }

    public final S0.V b(java.util.List list) {
        S0.InterfaceC1601i interfaceC1601i;
        java.lang.Exception e6;
        try {
            int size = list.size();
            int i6 = 0;
            interfaceC1601i = null;
            while (i6 < size) {
                try {
                    S0.InterfaceC1601i interfaceC1601i2 = (S0.InterfaceC1601i) list.get(i6);
                    try {
                        interfaceC1601i2.a(this.f12361b);
                        i6++;
                        interfaceC1601i = interfaceC1601i2;
                    } catch (java.lang.Exception e10) {
                        e6 = e10;
                        interfaceC1601i = interfaceC1601i2;
                        throw new java.lang.RuntimeException(c(list, interfaceC1601i), e6);
                    }
                } catch (java.lang.Exception e11) {
                    e6 = e11;
                }
            }
            M0.C1332d c1332dS = this.f12361b.s();
            long jI = this.f12361b.i();
            M0.N nB = M0.N.b(jI);
            nB.r();
            M0.N n6 = M0.N.m(this.f12360a.h()) ? null : nB;
            S0.V v6 = new S0.V(c1332dS, n6 != null ? n6.r() : M0.O.b(M0.N.k(jI), M0.N.l(jI)), this.f12361b.d(), (p247y7.AbstractC7342k) null);
            this.f12360a = v6;
            return v6;
        } catch (java.lang.Exception e12) {
            interfaceC1601i = null;
            e6 = e12;
        }
    }

    public final void d(S0.V v6, S0.d0 d0Var) {
        boolean z6 = true;
        boolean z10 = !p247y7.AbstractC7350t.b(v6.g(), this.f12361b.d());
        boolean z11 = false;
        if (!p247y7.AbstractC7350t.b(this.f12360a.f(), v6.f())) {
            this.f12361b = new S0.C1604l(v6.f(), v6.h(), null);
        } else if (M0.N.g(this.f12360a.h(), v6.h())) {
            z6 = false;
        } else {
            this.f12361b.p(M0.N.l(v6.h()), M0.N.k(v6.h()));
            z11 = true;
            z6 = false;
        }
        if (v6.g() == null) {
            this.f12361b.a();
        } else if (!M0.N.h(v6.g().r())) {
            this.f12361b.n(M0.N.l(v6.g().r()), M0.N.k(v6.g().r()));
        }
        if (z6 || (!z11 && z10)) {
            this.f12361b.a();
            v6 = S0.V.d(v6, null, 0L, null, 3, null);
        }
        S0.V v10 = this.f12360a;
        this.f12360a = v6;
        if (d0Var != null) {
            d0Var.d(v10, v6);
        }
    }

    public final S0.V f() {
        return this.f12360a;
    }
}
