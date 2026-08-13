package D6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends java.lang.UnsupportedOperationException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f1929C;

    public c(Q6.c cVar, F7.c cVar2, F7.c cVar3) {
        p247y7.AbstractC7350t.f(cVar, "response");
        p247y7.AbstractC7350t.f(cVar2, "from");
        p247y7.AbstractC7350t.f(cVar3, "to");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n        Expected response body of the type '");
        sb.append(cVar3);
        sb.append("' but was '");
        sb.append(cVar2);
        sb.append("'\n        In response from `");
        sb.append(Q6.e.c(cVar).r());
        sb.append("`\n        Response status `");
        sb.append(cVar.e());
        sb.append("`\n        Response header `ContentType: ");
        T6.InterfaceC1668p interfaceC1668pA = cVar.a();
        T6.C1673v c1673v = T6.C1673v.f13241a;
        sb.append(interfaceC1668pA.d(c1673v.h()));
        sb.append("` \n        Request header `Accept: ");
        sb.append(Q6.e.c(cVar).a().d(c1673v.c()));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f1929C = S8.r.o(sb.toString());
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f1929C;
    }
}
