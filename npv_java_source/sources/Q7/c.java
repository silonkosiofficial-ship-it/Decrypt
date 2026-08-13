package Q7;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public static final class a implements Q7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Q7.c.a f9115a = new Q7.c.a();

        private a() {
        }

        @Override // Q7.c
        public boolean d(O7.InterfaceC1424e interfaceC1424e, O7.Z z6) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
            p247y7.AbstractC7350t.f(z6, "functionDescriptor");
            return true;
        }
    }

    public static final class b implements Q7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Q7.c.b f9116a = new Q7.c.b();

        private b() {
        }

        @Override // Q7.c
        public boolean d(O7.InterfaceC1424e interfaceC1424e, O7.Z z6) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
            p247y7.AbstractC7350t.f(z6, "functionDescriptor");
            return !z6.k().H(Q7.d.a());
        }
    }

    boolean d(O7.InterfaceC1424e interfaceC1424e, O7.Z z6);
}
