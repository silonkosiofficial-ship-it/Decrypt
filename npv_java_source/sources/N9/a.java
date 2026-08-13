package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements H9.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.n f7910a;

    public a(H9.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "cookieJar");
        this.f7910a = nVar;
    }

    private final java.lang.String b(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = 0;
        for (java.lang.Object obj : list) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            H9.m mVar = (H9.m) obj;
            if (i6 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.e());
            sb.append('=');
            sb.append(mVar.g());
            i6 = i10;
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // H9.v
    public H9.B a(H9.v.a aVar) {
        H9.C cA;
        p247y7.AbstractC7350t.f(aVar, "chain");
        H9.z zVarB = aVar.b();
        H9.z.a aVarH = zVarB.h();
        H9.A a6 = zVarB.a();
        if (a6 != null) {
            H9.w wVarB = a6.b();
            if (wVarB != null) {
                aVarH.c("Content-Type", wVarB.toString());
            }
            long jA = a6.a();
            if (jA != -1) {
                aVarH.c("Content-Length", java.lang.String.valueOf(jA));
                aVarH.f("Transfer-Encoding");
            } else {
                aVarH.c("Transfer-Encoding", "chunked");
                aVarH.f("Content-Length");
            }
        }
        boolean z6 = false;
        if (zVarB.d("Host") == null) {
            aVarH.c("Host", I9.d.S(zVarB.i(), false, 1, null));
        }
        if (zVarB.d("Connection") == null) {
            aVarH.c("Connection", "Keep-Alive");
        }
        if (zVarB.d("Accept-Encoding") == null && zVarB.d("Range") == null) {
            aVarH.c("Accept-Encoding", "gzip");
            z6 = true;
        }
        java.util.List listB = this.f7910a.b(zVarB.i());
        if (!listB.isEmpty()) {
            aVarH.c("Cookie", b(listB));
        }
        if (zVarB.d("User-Agent") == null) {
            aVarH.c("User-Agent", "okhttp/4.12.0");
        }
        H9.B bA = aVar.a(aVarH.b());
        N9.e.f(this.f7910a, zVarB.i(), bA.H());
        H9.B.a aVarR = bA.g0().r(zVarB);
        if (z6 && S8.r.K("gzip", H9.B.D(bA, "Content-Encoding", null, 2, null), true) && N9.e.b(bA) && (cA = bA.a()) != null) {
            X9.C1847o c1847o = new X9.C1847o(cA.g());
            aVarR.k(bA.H().g().f("Content-Encoding").f("Content-Length").d());
            aVarR.b(new N9.h(H9.B.D(bA, "Content-Type", null, 2, null), -1L, X9.K.b(c1847o)));
        }
        return aVarR.c();
    }
}
