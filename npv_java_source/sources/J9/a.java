package J9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements H9.InterfaceC1236b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H9.q f5829d;

    /* JADX INFO: renamed from: J9.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0137a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5830a;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            f5830a = iArr;
        }
    }

    public a(H9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "defaultDns");
        this.f5829d = qVar;
    }

    public /* synthetic */ a(H9.q qVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? H9.q.f4796b : qVar);
    }

    private final java.net.InetAddress b(java.net.Proxy proxy, H9.u uVar, H9.q qVar) {
        java.net.Proxy.Type type = proxy.type();
        if ((type == null ? -1 : J9.a.C0137a.f5830a[type.ordinal()]) == 1) {
            return (java.net.InetAddress) p097j7.AbstractC6879v.i0(qVar.a(uVar.h()));
        }
        java.net.SocketAddress socketAddressAddress = proxy.address();
        p247y7.AbstractC7350t.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        java.net.InetAddress address = ((java.net.InetSocketAddress) socketAddressAddress).getAddress();
        p247y7.AbstractC7350t.e(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // H9.InterfaceC1236b
    public H9.z a(H9.D d6, H9.B b6) {
        java.net.Proxy proxyB;
        H9.q qVarC;
        java.net.PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        H9.C1235a c1235aA;
        p247y7.AbstractC7350t.f(b6, "response");
        java.util.List<H9.h> listI = b6.i();
        H9.z zVarR0 = b6.r0();
        H9.u uVarI = zVarR0.i();
        boolean z6 = b6.o() == 407;
        if (d6 == null || (proxyB = d6.b()) == null) {
            proxyB = java.net.Proxy.NO_PROXY;
        }
        for (H9.h hVar : listI) {
            if (S8.r.K("Basic", hVar.c(), true)) {
                if (d6 == null || (c1235aA = d6.a()) == null || (qVarC = c1235aA.c()) == null) {
                    qVarC = this.f5829d;
                }
                if (z6) {
                    java.net.SocketAddress socketAddressAddress = proxyB.address();
                    p247y7.AbstractC7350t.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) socketAddressAddress;
                    java.lang.String hostName = inetSocketAddress.getHostName();
                    p247y7.AbstractC7350t.e(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, b(proxyB, uVarI, qVarC), inetSocketAddress.getPort(), uVarI.p(), hVar.b(), hVar.c(), uVarI.r(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    java.lang.String strH = uVarI.h();
                    p247y7.AbstractC7350t.e(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strH, b(proxyB, uVarI, qVarC), uVarI.l(), uVarI.p(), hVar.b(), hVar.c(), uVarI.r(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    java.lang.String str = z6 ? "Proxy-Authorization" : "Authorization";
                    java.lang.String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    p247y7.AbstractC7350t.e(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    p247y7.AbstractC7350t.e(password, "auth.password");
                    return zVarR0.h().c(str, H9.o.a(userName, new java.lang.String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }
}
