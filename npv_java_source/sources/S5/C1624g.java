package S5;

/* JADX INFO: renamed from: S5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1624g implements S5.InterfaceC1625h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S5.C1624g.a f12541b = new S5.C1624g.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.b f12542a;

    /* JADX INFO: renamed from: S5.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C1624g(F5.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "transportFactoryProvider");
        this.f12542a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(S5.z zVar) {
        java.lang.String strB = S5.A.f12433a.c().b(zVar);
        p247y7.AbstractC7350t.e(strB, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        java.lang.String str = "Session Event Type: " + zVar.b().name();
        byte[] bytes = strB.getBytes(S8.C1631d.f12624b);
        p247y7.AbstractC7350t.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // S5.InterfaceC1625h
    public void a(S5.z zVar) {
        p247y7.AbstractC7350t.f(zVar, "sessionEvent");
        ((W2.i) this.f12542a.get()).a("FIREBASE_APPQUALITY_SESSION", S5.z.class, W2.b.b("json"), new W2.g() { // from class: S5.f
            @Override // W2.g
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f12540a.c((S5.z) obj);
            }
        }).a(W2.c.f(zVar));
    }
}
