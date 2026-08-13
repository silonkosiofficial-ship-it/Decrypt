package p089i9;

/* JADX INFO: renamed from: i9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6674e extends p089i9.InterfaceC6684o.e {

    /* JADX INFO: renamed from: i9.e$a */
    public static final class a {
        public static void a(p089i9.InterfaceC6674e interfaceC6674e, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            if (interfaceC6683n instanceof p089i9.W) {
                interfaceC6674e.t(((p089i9.W) interfaceC6683n).c());
            }
        }

        public static void b(p089i9.InterfaceC6674e interfaceC6674e, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6674e.t(new p109k9.z(new p109k9.C6919e(new p089i9.a0(k6)), true));
        }

        public static void c(p089i9.InterfaceC6674e interfaceC6674e, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6674e.t(new p109k9.C6919e(new p089i9.Y(k6)));
        }

        public static void d(p089i9.InterfaceC6674e interfaceC6674e, p089i9.K k6) {
            p247y7.AbstractC7350t.f(k6, "padding");
            interfaceC6674e.t(new p109k9.C6919e(new p089i9.Z(k6)));
        }
    }

    void t(p109k9.o oVar);
}
