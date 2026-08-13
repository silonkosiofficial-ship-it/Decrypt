package p108k8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final p088i8.q a(p088i8.q qVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (qVar.k0()) {
            return qVar.R();
        }
        if (qVar.l0()) {
            return gVar.a(qVar.S());
        }
        return null;
    }

    public static final java.util.List b(p088i8.c cVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        java.util.List listY0 = cVar.y0();
        if (!(!listY0.isEmpty())) {
            listY0 = null;
        }
        if (listY0 == null) {
            java.util.List listX0 = cVar.x0();
            p247y7.AbstractC7350t.e(listX0, "getContextReceiverTypeIdList(...)");
            java.util.List<java.lang.Integer> list = listX0;
            listY0 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (java.lang.Integer num : list) {
                p247y7.AbstractC7350t.c(num);
                listY0.add(gVar.a(num.intValue()));
            }
        }
        return listY0;
    }

    public static final java.util.List c(p088i8.i iVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        java.util.List listY = iVar.Y();
        if (!(!listY.isEmpty())) {
            listY = null;
        }
        if (listY == null) {
            java.util.List listX = iVar.X();
            p247y7.AbstractC7350t.e(listX, "getContextReceiverTypeIdList(...)");
            java.util.List<java.lang.Integer> list = listX;
            listY = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (java.lang.Integer num : list) {
                p247y7.AbstractC7350t.c(num);
                listY.add(gVar.a(num.intValue()));
            }
        }
        return listY;
    }

    public static final java.util.List d(p088i8.n nVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        java.util.List listX = nVar.X();
        if (!(!listX.isEmpty())) {
            listX = null;
        }
        if (listX == null) {
            java.util.List listW = nVar.W();
            p247y7.AbstractC7350t.e(listW, "getContextReceiverTypeIdList(...)");
            java.util.List<java.lang.Integer> list = listW;
            listX = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (java.lang.Integer num : list) {
                p247y7.AbstractC7350t.c(num);
                listX.add(gVar.a(num.intValue()));
            }
        }
        return listX;
    }

    public static final p088i8.q e(p088i8.r rVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(rVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (rVar.d0()) {
            p088i8.q qVarT = rVar.T();
            p247y7.AbstractC7350t.e(qVarT, "getExpandedType(...)");
            return qVarT;
        }
        if (rVar.e0()) {
            return gVar.a(rVar.U());
        }
        throw new java.lang.IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    public static final p088i8.q f(p088i8.q qVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (qVar.p0()) {
            return qVar.b0();
        }
        if (qVar.q0()) {
            return gVar.a(qVar.c0());
        }
        return null;
    }

    public static final boolean g(p088i8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        return iVar.w0() || iVar.x0();
    }

    public static final boolean h(p088i8.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        return nVar.t0() || nVar.u0();
    }

    public static final p088i8.q i(p088i8.c cVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (cVar.p1()) {
            return cVar.K0();
        }
        if (cVar.q1()) {
            return gVar.a(cVar.L0());
        }
        return null;
    }

    public static final p088i8.q j(p088i8.q qVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (qVar.s0()) {
            return qVar.e0();
        }
        if (qVar.t0()) {
            return gVar.a(qVar.f0());
        }
        return null;
    }

    public static final p088i8.q k(p088i8.i iVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (iVar.w0()) {
            return iVar.f0();
        }
        if (iVar.x0()) {
            return gVar.a(iVar.h0());
        }
        return null;
    }

    public static final p088i8.q l(p088i8.n nVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (nVar.t0()) {
            return nVar.e0();
        }
        if (nVar.u0()) {
            return gVar.a(nVar.f0());
        }
        return null;
    }

    public static final p088i8.q m(p088i8.i iVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(iVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (iVar.y0()) {
            p088i8.q qVarI0 = iVar.i0();
            p247y7.AbstractC7350t.e(qVarI0, "getReturnType(...)");
            return qVarI0;
        }
        if (iVar.z0()) {
            return gVar.a(iVar.j0());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final p088i8.q n(p088i8.n nVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (nVar.v0()) {
            p088i8.q qVarH0 = nVar.h0();
            p247y7.AbstractC7350t.e(qVarH0, "getReturnType(...)");
            return qVarH0;
        }
        if (nVar.w0()) {
            return gVar.a(nVar.i0());
        }
        throw new java.lang.IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final java.util.List o(p088i8.c cVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        java.util.List listB1 = cVar.b1();
        if (!(!listB1.isEmpty())) {
            listB1 = null;
        }
        if (listB1 == null) {
            java.util.List listA1 = cVar.a1();
            p247y7.AbstractC7350t.e(listA1, "getSupertypeIdList(...)");
            java.util.List<java.lang.Integer> list = listA1;
            listB1 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (java.lang.Integer num : list) {
                p247y7.AbstractC7350t.c(num);
                listB1.add(gVar.a(num.intValue()));
            }
        }
        return listB1;
    }

    public static final p088i8.q p(i8.q.b bVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(bVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (bVar.B()) {
            return bVar.y();
        }
        if (bVar.C()) {
            return gVar.a(bVar.z());
        }
        return null;
    }

    public static final p088i8.q q(p088i8.u uVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(uVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (uVar.S()) {
            p088i8.q qVarM = uVar.M();
            p247y7.AbstractC7350t.e(qVarM, "getType(...)");
            return qVarM;
        }
        if (uVar.T()) {
            return gVar.a(uVar.N());
        }
        throw new java.lang.IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final p088i8.q r(p088i8.r rVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(rVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (rVar.i0()) {
            p088i8.q qVarA0 = rVar.a0();
            p247y7.AbstractC7350t.e(qVarA0, "getUnderlyingType(...)");
            return qVarA0;
        }
        if (rVar.j0()) {
            return gVar.a(rVar.b0());
        }
        throw new java.lang.IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    public static final java.util.List s(p088i8.s sVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(sVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        java.util.List listS = sVar.S();
        if (!(!listS.isEmpty())) {
            listS = null;
        }
        if (listS == null) {
            java.util.List listR = sVar.R();
            p247y7.AbstractC7350t.e(listR, "getUpperBoundIdList(...)");
            java.util.List<java.lang.Integer> list = listR;
            listS = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (java.lang.Integer num : list) {
                p247y7.AbstractC7350t.c(num);
                listS.add(gVar.a(num.intValue()));
            }
        }
        return listS;
    }

    public static final p088i8.q t(p088i8.u uVar, p108k8.g gVar) {
        p247y7.AbstractC7350t.f(uVar, "<this>");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        if (uVar.U()) {
            return uVar.O();
        }
        if (uVar.V()) {
            return gVar.a(uVar.P());
        }
        return null;
    }
}
