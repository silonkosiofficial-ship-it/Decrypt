package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements org.chromium.support_lib_boundary.WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f4294a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static G2.d[] a(java.lang.reflect.InvocationHandler[] invocationHandlerArr) {
        G2.d[] dVarArr = new G2.d[invocationHandlerArr.length];
        for (int i6 = 0; i6 < invocationHandlerArr.length; i6++) {
            dVarArr[i6] = new H2.v(invocationHandlerArr[i6]);
        }
        return dVarArr;
    }

    public static G2.c b(org.chromium.support_lib_boundary.WebMessageBoundaryInterface webMessageBoundaryInterface) {
        G2.d[] dVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!H2.w.f4299C.d()) {
            return new G2.c(webMessageBoundaryInterface.getData(), dVarArrA);
        }
        org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) Z9.a.a(org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new G2.c(webMessagePayloadBoundaryInterface.getAsString(), dVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new G2.c(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), dVarArrA);
    }
}
