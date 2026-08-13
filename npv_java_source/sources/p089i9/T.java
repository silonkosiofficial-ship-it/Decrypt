package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.List f47463a = p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.A0(new E7.c('a', 'z'), new E7.c('A', 'Z')), p097j7.AbstractC6879v.p('[', ']', '\''));

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final i9.T.a f47464D = new i9.T.a();

        a() {
            super(1);
        }

        public final void a(p089i9.InterfaceC6684o interfaceC6684o) {
            p247y7.AbstractC7350t.f(interfaceC6684o, "$this$alternativeParsing");
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p089i9.InterfaceC6684o) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p089i9.S f47465D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p089i9.S s6) {
            super(1);
            this.f47465D = s6;
        }

        public final void a(p089i9.InterfaceC6684o interfaceC6684o) {
            p247y7.AbstractC7350t.f(interfaceC6684o, "$this$alternativeParsing");
            p089i9.T.i(interfaceC6684o, ((i9.S.c) this.f47465D).a());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p089i9.InterfaceC6684o) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final void h(p089i9.InterfaceC6684o interfaceC6684o, java.lang.String str) {
        p247y7.AbstractC7350t.f(interfaceC6684o, "<this>");
        p247y7.AbstractC7350t.f(str, "pattern");
        i(interfaceC6684o, p089i9.S.f47388a.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(p089i9.InterfaceC6684o interfaceC6684o, p089i9.S s6) {
        if (s6 instanceof i9.S.e) {
            interfaceC6684o.c(((i9.S.e) s6).a());
            return;
        }
        if (s6 instanceof i9.S.d) {
            java.util.Iterator it = ((i9.S.d) s6).a().iterator();
            while (it.hasNext()) {
                i(interfaceC6684o, (p089i9.S) it.next());
            }
            return;
        }
        if (s6 instanceof i9.S.c) {
            p089i9.AbstractC6685p.a(interfaceC6684o, new p237x7.l[]{i9.T.a.f47464D}, new i9.T.b(s6));
            return;
        }
        if (s6 instanceof i9.S.b) {
            i9.S.b bVar = (i9.S.b) s6;
            if (bVar instanceof i9.S.b.c) {
                if (interfaceC6684o instanceof p089i9.InterfaceC6684o.d) {
                    ((i9.S.b.c) s6).c((p089i9.InterfaceC6684o.d) interfaceC6684o);
                    return;
                }
                throw new java.lang.IllegalArgumentException(("A time-based directive " + s6 + " was used in a format builder that doesn't support time components").toString());
            }
            if (bVar instanceof i9.S.b.a) {
                if (interfaceC6684o instanceof p089i9.InterfaceC6684o.a) {
                    ((i9.S.b.a) s6).c((p089i9.InterfaceC6684o.a) interfaceC6684o);
                    return;
                }
                throw new java.lang.IllegalArgumentException(("A date-based directive " + s6 + " was used in a format builder that doesn't support date components").toString());
            }
            if (bVar instanceof i9.S.b.d) {
                if (interfaceC6684o instanceof p089i9.InterfaceC6684o.c) {
                    ((i9.S.b.d) s6).c((p089i9.InterfaceC6684o.c) interfaceC6684o);
                    return;
                }
                throw new java.lang.IllegalArgumentException(("A time-zone-based directive " + s6 + " was used in a format builder that doesn't support time-zone components").toString());
            }
            if (!(bVar instanceof i9.S.b.AbstractC0583b)) {
                if (bVar instanceof p089i9.U) {
                    throw new java.lang.IllegalArgumentException("The meaning of the directive '" + s6 + "' is unknown");
                }
                return;
            }
            if (interfaceC6684o instanceof p089i9.InterfaceC6684o.e) {
                ((i9.S.b.AbstractC0583b) s6).c((p089i9.InterfaceC6684o.e) interfaceC6684o);
                return;
            }
            throw new java.lang.IllegalArgumentException(("A UTC-offset-based directive " + s6 + " was used in a format builder that doesn't support UTC offset components").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void j(i9.S.b bVar, java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("The directive '");
        sb.append(bVar);
        sb.append("' is locale-dependent, but locales are not supported in Kotlin");
        if (str != null) {
            str2 = ". " + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static /* synthetic */ java.lang.Void k(i9.S.b bVar, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        return j(bVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p089i9.S l(char c6, int i6) {
        if (c6 == 'G') {
            return new i9.S.b.a.f(i6);
        }
        if (c6 == 'y') {
            return new i9.S.b.a.s(i6);
        }
        if (c6 == 'Y') {
            return new i9.S.b.a.o(i6);
        }
        if (c6 == 'u') {
            return new i9.S.b.a.r(i6);
        }
        if (c6 == 'U') {
            return new i9.S.b.a.C0581a(i6);
        }
        if (c6 == 'r') {
            return new i9.S.b.a.k(i6);
        }
        if (c6 == 'Q') {
            return new i9.S.b.a.j(i6);
        }
        if (c6 == 'q') {
            return new i9.S.b.a.n(i6);
        }
        if (c6 == 'M') {
            return new i9.S.b.a.i(i6);
        }
        if (c6 == 'L') {
            return new i9.S.b.a.m(i6);
        }
        if (c6 == 'w') {
            return new i9.S.b.a.q(i6);
        }
        if (c6 == 'W') {
            return new i9.S.b.a.p(i6);
        }
        if (c6 == 'd') {
            return new i9.S.b.a.C0582b(i6);
        }
        if (c6 == 'D') {
            return new i9.S.b.a.e(i6);
        }
        if (c6 == 'F') {
            return new i9.S.b.a.d(i6);
        }
        if (c6 == 'g') {
            return new i9.S.b.a.h(i6);
        }
        if (c6 == 'E') {
            return new i9.S.b.a.c(i6);
        }
        if (c6 == 'e') {
            return new i9.S.b.a.g(i6);
        }
        if (c6 == 'c') {
            return new i9.S.b.a.l(i6);
        }
        if (c6 == 'a') {
            return new i9.S.b.c.C0585b(i6);
        }
        if (c6 == 'h') {
            return new i9.S.b.c.a(i6);
        }
        if (c6 == 'H') {
            return new i9.S.b.c.C0586c(i6);
        }
        if (c6 == 'm') {
            return new i9.S.b.c.d(i6);
        }
        if (c6 == 's') {
            return new i9.S.b.c.e.a(i6);
        }
        if (c6 == 'S') {
            return new i9.S.b.c.f.a(i6);
        }
        if (c6 == 'A') {
            return new i9.S.b.c.f.C0587b(i6);
        }
        if (c6 == 'n') {
            return new i9.S.b.c.f.d(i6);
        }
        if (c6 == 'N') {
            return new i9.S.b.c.f.C0588c(i6);
        }
        if (c6 == 'V') {
            return new i9.S.b.d.C0589b(i6);
        }
        if (c6 == 'v') {
            return new i9.S.b.d.a(i6);
        }
        if (c6 == 'z') {
            return new i9.S.b.d.c(i6);
        }
        if (c6 == 'O') {
            return new i9.S.b.AbstractC0583b.a(i6);
        }
        if (c6 == 'X') {
            return new i9.S.b.AbstractC0583b.C0584b(i6);
        }
        if (c6 == 'x') {
            return new i9.S.b.AbstractC0583b.c(i6);
        }
        return c6 == 'Z' ? new i9.S.b.AbstractC0583b.d(i6) : new p089i9.U(c6, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void m(i9.S.b bVar) {
        throw new java.lang.IllegalArgumentException("Unknown length " + bVar.a() + " for the " + bVar.b() + " directive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void n(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("kotlinx.datetime formatting does not support the ");
        sb.append(str);
        sb.append(" field. ");
        if (str2 != null) {
            str3 = str2 + ' ';
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append("Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    static /* synthetic */ java.lang.Void o(java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        return n(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void p(i9.S.b bVar, int i6) {
        throw new java.lang.UnsupportedOperationException("Padding do " + i6 + " digits is not supported for the " + bVar.b() + " directive");
    }
}
