package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p128m8.i f51228a = new p128m8.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p158p8.g f51229b;

    static {
        p158p8.g gVarD = p158p8.g.d();
        p118l8.a.a(gVarD);
        p247y7.AbstractC7350t.e(gVarD, "apply(...)");
        f51229b = gVarD;
    }

    private i() {
    }

    public static /* synthetic */ m8.d.a d(p128m8.i iVar, p088i8.n nVar, p108k8.c cVar, p108k8.g gVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            z6 = true;
        }
        return iVar.c(nVar, cVar, gVar, z6);
    }

    public static final boolean f(p088i8.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "proto");
        p108k8.b.C0627b c0627bA = p128m8.c.f51206a.a();
        java.lang.Object objU = nVar.u(p118l8.a.f50076e);
        p247y7.AbstractC7350t.e(objU, "getExtension(...)");
        java.lang.Boolean boolD = c0627bA.d(((java.lang.Number) objU).intValue());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        return boolD.booleanValue();
    }

    private final java.lang.String g(p088i8.q qVar, p108k8.c cVar) {
        if (qVar.m0()) {
            return p128m8.b.b(cVar.a(qVar.W()));
        }
        return null;
    }

    public static final p087i7.u h(byte[] bArr, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(bArr, "bytes");
        p247y7.AbstractC7350t.f(strArr, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        return new p087i7.u(f51228a.k(byteArrayInputStream, strArr), p088i8.c.x1(byteArrayInputStream, f51229b));
    }

    public static final p087i7.u i(java.lang.String[] strArr, java.lang.String[] strArr2) {
        p247y7.AbstractC7350t.f(strArr, "data");
        p247y7.AbstractC7350t.f(strArr2, "strings");
        byte[] bArrE = p128m8.a.e(strArr);
        p247y7.AbstractC7350t.e(bArrE, "decodeBytes(...)");
        return h(bArrE, strArr2);
    }

    public static final p087i7.u j(java.lang.String[] strArr, java.lang.String[] strArr2) {
        p247y7.AbstractC7350t.f(strArr, "data");
        p247y7.AbstractC7350t.f(strArr2, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(p128m8.a.e(strArr));
        return new p087i7.u(f51228a.k(byteArrayInputStream, strArr2), p088i8.i.F0(byteArrayInputStream, f51229b));
    }

    private final p128m8.f k(java.io.InputStream inputStream, java.lang.String[] strArr) {
        l8.a.e eVarD = l8.a.e.D(inputStream, f51229b);
        p247y7.AbstractC7350t.e(eVarD, "parseDelimitedFrom(...)");
        return new p128m8.f(eVarD, strArr);
    }

    public static final p087i7.u l(byte[] bArr, java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(bArr, "bytes");
        p247y7.AbstractC7350t.f(strArr, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        return new p087i7.u(f51228a.k(byteArrayInputStream, strArr), p088i8.l.d0(byteArrayInputStream, f51229b));
    }

    public static final p087i7.u m(java.lang.String[] strArr, java.lang.String[] strArr2) {
        p247y7.AbstractC7350t.f(strArr, "data");
        p247y7.AbstractC7350t.f(strArr2, "strings");
        byte[] bArrE = p128m8.a.e(strArr);
        p247y7.AbstractC7350t.e(bArrE, "decodeBytes(...)");
        return l(bArrE, strArr2);
    }

    public final p158p8.g a() {
        return f51229b;
    }

    public final m8.d.b b(p088i8.d dVar, p108k8.c cVar, p108k8.g gVar) {
        java.lang.String strR0;
        p247y7.AbstractC7350t.f(dVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p8.i.f fVar = p118l8.a.f50072a;
        p247y7.AbstractC7350t.e(fVar, "constructorSignature");
        l8.a.c cVar2 = (l8.a.c) p108k8.e.a(dVar, fVar);
        java.lang.String string = (cVar2 == null || !cVar2.z()) ? "<init>" : cVar.getString(cVar2.x());
        if (cVar2 == null || !cVar2.y()) {
            java.util.List listM = dVar.M();
            p247y7.AbstractC7350t.e(listM, "getValueParameterList(...)");
            java.util.List<p088i8.u> list = listM;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (p088i8.u uVar : list) {
                p128m8.i iVar = f51228a;
                p247y7.AbstractC7350t.c(uVar);
                java.lang.String strG = iVar.g(p108k8.f.q(uVar, gVar), cVar);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strR0 = p097j7.AbstractC6879v.r0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strR0 = cVar.getString(cVar2.w());
        }
        return new m8.d.b(string, strR0);
    }

    public final m8.d.a c(p088i8.n nVar, p108k8.c cVar, p108k8.g gVar, boolean z6) {
        java.lang.String strG;
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p8.i.f fVar = p118l8.a.f50075d;
        p247y7.AbstractC7350t.e(fVar, "propertySignature");
        l8.a.d dVar = (l8.a.d) p108k8.e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        l8.a.b bVarA = dVar.F() ? dVar.A() : null;
        if (bVarA == null && z6) {
            return null;
        }
        int iC0 = (bVarA == null || !bVarA.z()) ? nVar.c0() : bVarA.x();
        if (bVarA == null || !bVarA.y()) {
            strG = g(p108k8.f.n(nVar, gVar), cVar);
            if (strG == null) {
                return null;
            }
        } else {
            strG = cVar.getString(bVarA.w());
        }
        return new m8.d.a(cVar.getString(iC0), strG);
    }

    public final m8.d.b e(p088i8.i iVar, p108k8.c cVar, p108k8.g gVar) {
        java.lang.String string;
        p247y7.AbstractC7350t.f(iVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p8.i.f fVar = p118l8.a.f50073b;
        p247y7.AbstractC7350t.e(fVar, "methodSignature");
        l8.a.c cVar2 = (l8.a.c) p108k8.e.a(iVar, fVar);
        int iD0 = (cVar2 == null || !cVar2.z()) ? iVar.d0() : cVar2.x();
        if (cVar2 == null || !cVar2.y()) {
            java.util.List listQ = p097j7.AbstractC6879v.q(p108k8.f.k(iVar, gVar));
            java.util.List listQ0 = iVar.q0();
            p247y7.AbstractC7350t.e(listQ0, "getValueParameterList(...)");
            java.util.List<p088i8.u> list = listQ0;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (p088i8.u uVar : list) {
                p247y7.AbstractC7350t.c(uVar);
                arrayList.add(p108k8.f.q(uVar, gVar));
            }
            java.util.List listC0 = p097j7.AbstractC6879v.C0(listQ, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listC0, 10));
            java.util.Iterator it = listC0.iterator();
            while (it.hasNext()) {
                java.lang.String strG = f51228a.g((p088i8.q) it.next(), cVar);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            java.lang.String strG2 = g(p108k8.f.m(iVar, gVar), cVar);
            if (strG2 == null) {
                return null;
            }
            string = p097j7.AbstractC6879v.r0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = cVar.getString(cVar2.w());
        }
        return new m8.d.b(cVar.getString(iD0), string);
    }
}
