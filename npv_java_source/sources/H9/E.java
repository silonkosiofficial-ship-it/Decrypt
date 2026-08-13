package H9;

/* JADX INFO: loaded from: classes2.dex */
public enum E {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final H9.E.a f4574D = new H9.E.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f4581C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final H9.E a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return H9.E.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return H9.E.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return H9.E.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return H9.E.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return H9.E.SSL_3_0;
            }
            throw new java.lang.IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    E(java.lang.String str) {
        this.f4581C = str;
    }

    public final java.lang.String g() {
        return this.f4581C;
    }
}
