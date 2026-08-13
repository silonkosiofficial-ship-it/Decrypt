package p089i9;

/* JADX INFO: renamed from: i9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6675f extends p089i9.InterfaceC6684o.d {

    /* JADX INFO: renamed from: i9.f$a */
    public static final class a {
        public static void a(p089i9.InterfaceC6675f interfaceC6675f, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6675f.l(new p109k9.C6919e(new p089i9.C6689u(k6)));
        }

        public static void b(p089i9.InterfaceC6675f interfaceC6675f, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6675f.l(new p109k9.C6919e(new p089i9.F(k6)));
        }

        public static void c(p089i9.InterfaceC6675f interfaceC6675f, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6675f.l(new p109k9.C6919e(new p089i9.M(k6)));
        }

        public static void d(p089i9.InterfaceC6675f interfaceC6675f, int i6) {
            p089i9.InterfaceC6684o.d.a.d(interfaceC6675f, i6);
        }

        public static void e(p089i9.InterfaceC6675f interfaceC6675f, int i6, int i10) {
            interfaceC6675f.l(new p109k9.C6919e(new p089i9.C6688t(i6, i10, null, 4, null)));
        }

        public static void f(p089i9.InterfaceC6675f interfaceC6675f, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            if (interfaceC6683n instanceof p089i9.D) {
                interfaceC6675f.l(((p089i9.D) interfaceC6683n).c());
            }
        }
    }

    void l(p109k9.o oVar);
}
