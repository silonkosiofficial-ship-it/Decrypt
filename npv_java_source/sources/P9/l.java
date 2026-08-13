package P9;

/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P9.l.a f8694a = P9.l.a.f8696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P9.l f8695b = new P9.l.a.C0205a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ P9.l.a f8696a = new P9.l.a();

        /* JADX INFO: renamed from: P9.l$a$a, reason: collision with other inner class name */
        private static final class C0205a implements P9.l {
            @Override // P9.l
            public void a(int i6, P9.b bVar) {
                p247y7.AbstractC7350t.f(bVar, "errorCode");
            }

            @Override // P9.l
            public boolean b(int i6, java.util.List list) {
                p247y7.AbstractC7350t.f(list, "requestHeaders");
                return true;
            }

            @Override // P9.l
            public boolean c(int i6, java.util.List list, boolean z6) {
                p247y7.AbstractC7350t.f(list, "responseHeaders");
                return true;
            }

            @Override // P9.l
            public boolean d(int i6, X9.InterfaceC1838f interfaceC1838f, int i10, boolean z6) {
                p247y7.AbstractC7350t.f(interfaceC1838f, "source");
                interfaceC1838f.skip(i10);
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i6, P9.b bVar);

    boolean b(int i6, java.util.List list);

    boolean c(int i6, java.util.List list, boolean z6);

    boolean d(int i6, X9.InterfaceC1838f interfaceC1838f, int i10, boolean z6);
}
