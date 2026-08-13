package S8;

/* JADX INFO: renamed from: S8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1639l {

    /* JADX INFO: renamed from: S8.l$a */
    public static final class a {
        public static S8.InterfaceC1639l.b a(S8.InterfaceC1639l interfaceC1639l) {
            return new S8.InterfaceC1639l.b(interfaceC1639l);
        }
    }

    /* JADX INFO: renamed from: S8.l$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S8.InterfaceC1639l f12678a;

        public b(S8.InterfaceC1639l interfaceC1639l) {
            p247y7.AbstractC7350t.f(interfaceC1639l, "match");
            this.f12678a = interfaceC1639l;
        }

        public final S8.InterfaceC1639l a() {
            return this.f12678a;
        }
    }

    S8.InterfaceC1639l.b a();

    java.util.List b();

    S8.InterfaceC1638k c();

    E7.i d();

    S8.InterfaceC1639l next();
}
