package H2;

/* JADX INFO: loaded from: classes.dex */
public class r extends G2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface f4289a;

    class a implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface f4290a;

        a(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f4290a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
            return new H2.r(this.f4290a);
        }
    }

    public r(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f4289a = jsReplyProxyBoundaryInterface;
    }

    public static H2.r a(java.lang.reflect.InvocationHandler invocationHandler) {
        org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) Z9.a.a(org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (H2.r) jsReplyProxyBoundaryInterface.getOrCreatePeer(new H2.r.a(jsReplyProxyBoundaryInterface));
    }
}
