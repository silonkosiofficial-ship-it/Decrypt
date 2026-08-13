package H9;

/* JADX INFO: loaded from: classes2.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final H9.y.a f4899D = new H9.y.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f4907C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final H9.y a(java.lang.String str) throws java.io.IOException {
            p247y7.AbstractC7350t.f(str, "protocol");
            H9.y yVar = H9.y.HTTP_1_0;
            if (!p247y7.AbstractC7350t.b(str, yVar.f4907C)) {
                yVar = H9.y.HTTP_1_1;
                if (!p247y7.AbstractC7350t.b(str, yVar.f4907C)) {
                    yVar = H9.y.H2_PRIOR_KNOWLEDGE;
                    if (!p247y7.AbstractC7350t.b(str, yVar.f4907C)) {
                        yVar = H9.y.HTTP_2;
                        if (!p247y7.AbstractC7350t.b(str, yVar.f4907C)) {
                            yVar = H9.y.SPDY_3;
                            if (!p247y7.AbstractC7350t.b(str, yVar.f4907C)) {
                                yVar = H9.y.QUIC;
                                if (!p247y7.AbstractC7350t.b(str, yVar.f4907C)) {
                                    throw new java.io.IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return yVar;
        }
    }

    y(java.lang.String str) {
        this.f4907C = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f4907C;
    }
}
