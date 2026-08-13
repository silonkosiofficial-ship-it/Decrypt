package H9;

/* JADX INFO: loaded from: classes2.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H9.q.a f4795a = H9.q.a.f4797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H9.q f4796b = new H9.q.a.C0110a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ H9.q.a f4797a = new H9.q.a();

        /* JADX INFO: renamed from: H9.q$a$a, reason: collision with other inner class name */
        private static final class C0110a implements H9.q {
            @Override // H9.q
            public java.util.List a(java.lang.String str) throws java.net.UnknownHostException {
                p247y7.AbstractC7350t.f(str, "hostname");
                try {
                    java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str);
                    p247y7.AbstractC7350t.e(allByName, "getAllByName(hostname)");
                    return p097j7.AbstractC6872n.R0(allByName);
                } catch (java.lang.NullPointerException e6) {
                    java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e6);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    java.util.List a(java.lang.String str);
}
