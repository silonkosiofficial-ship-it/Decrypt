package p089i9;

/* JADX INFO: renamed from: i9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6672c extends p089i9.InterfaceC6684o.a {

    /* JADX INFO: renamed from: i9.c$a */
    public static final class a {
        public static void a(p089i9.InterfaceC6672c interfaceC6672c, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            if (interfaceC6683n instanceof p089i9.C6694z) {
                interfaceC6672c.v(((p089i9.C6694z) interfaceC6683n).c());
            }
        }

        public static void b(p089i9.InterfaceC6672c interfaceC6672c, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6672c.v(new p109k9.C6919e(new p089i9.C6686q(k6)));
        }

        public static void c(p089i9.InterfaceC6672c interfaceC6672c, p089i9.C6687s c6687s) {
            p247y7.AbstractC7350t.f(c6687s, "names");
            interfaceC6672c.v(new p109k9.C6919e(new p089i9.r(c6687s)));
        }

        public static void d(p089i9.InterfaceC6672c interfaceC6672c, p089i9.I i6) {
            p247y7.AbstractC7350t.f(i6, "names");
            interfaceC6672c.v(new p109k9.C6919e(new p089i9.H(i6)));
        }

        public static void e(p089i9.InterfaceC6672c interfaceC6672c, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6672c.v(new p109k9.C6919e(new p089i9.G(k6)));
        }

        public static void f(p089i9.InterfaceC6672c interfaceC6672c, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6672c.v(new p109k9.C6919e(new p089i9.c0(k6, false, 2, null)));
        }

        public static void g(p089i9.InterfaceC6672c interfaceC6672c, int i6) {
            interfaceC6672c.v(new p109k9.C6919e(new p089i9.L(i6, false, 2, null)));
        }
    }

    void v(p109k9.o oVar);
}
