package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements O1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q1.j f8768a = new Q1.j();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8769a;

        static {
            int[] iArr = new int[P1.h.b.values().length];
            try {
                iArr[P1.h.b.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[P1.h.b.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[P1.h.b.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[P1.h.b.INTEGER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[P1.h.b.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[P1.h.b.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[P1.h.b.STRING_SET.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[P1.h.b.BYTES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[P1.h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            f8769a = iArr;
        }
    }

    private j() {
    }

    private final void d(java.lang.String str, P1.h hVar, Q1.c cVar) throws M1.c {
        P1.h.b bVarG0 = hVar.g0();
        switch (bVarG0 == null ? -1 : Q1.j.a.f8769a[bVarG0.ordinal()]) {
            case -1:
                throw new M1.c("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new p087i7.s();
            case 1:
                cVar.i(Q1.h.a(str), java.lang.Boolean.valueOf(hVar.X()));
                return;
            case 2:
                cVar.i(Q1.h.d(str), java.lang.Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.i(Q1.h.c(str), java.lang.Double.valueOf(hVar.a0()));
                return;
            case 4:
                cVar.i(Q1.h.e(str), java.lang.Integer.valueOf(hVar.c0()));
                return;
            case 5:
                cVar.i(Q1.h.f(str), java.lang.Long.valueOf(hVar.d0()));
                return;
            case 6:
                Q1.f.a aVarG = Q1.h.g(str);
                java.lang.String strE0 = hVar.e0();
                p247y7.AbstractC7350t.e(strE0, "value.string");
                cVar.i(aVarG, strE0);
                return;
            case 7:
                Q1.f.a aVarH = Q1.h.h(str);
                java.util.List listT = hVar.f0().T();
                p247y7.AbstractC7350t.e(listT, "value.stringSet.stringsList");
                cVar.i(aVarH, p097j7.AbstractC6879v.Y0(listT));
                return;
            case 8:
                Q1.f.a aVarB = Q1.h.b(str);
                byte[] bArrP = hVar.Y().P();
                p247y7.AbstractC7350t.e(bArrP, "value.bytes.toByteArray()");
                cVar.i(aVarB, bArrP);
                return;
            case 9:
                throw new M1.c("Value not set.", null, 2, null);
        }
    }

    private final P1.h f(java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC2062w abstractC2062wK;
        java.lang.String str;
        if (obj instanceof java.lang.Boolean) {
            abstractC2062wK = P1.h.h0().u(((java.lang.Boolean) obj).booleanValue()).k();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof java.lang.Float) {
            abstractC2062wK = P1.h.h0().x(((java.lang.Number) obj).floatValue()).k();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof java.lang.Double) {
            abstractC2062wK = P1.h.h0().w(((java.lang.Number) obj).doubleValue()).k();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof java.lang.Integer) {
            abstractC2062wK = P1.h.h0().y(((java.lang.Number) obj).intValue()).k();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof java.lang.Long) {
            abstractC2062wK = P1.h.h0().z(((java.lang.Number) obj).longValue()).k();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof java.lang.String) {
            abstractC2062wK = P1.h.h0().A((java.lang.String) obj).k();
            str = "newBuilder().setString(value).build()";
        } else if (obj instanceof java.util.Set) {
            P1.h.a aVarH0 = P1.h.h0();
            P1.g.a aVarU = P1.g.U();
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            abstractC2062wK = aVarH0.B(aVarU.u((java.util.Set) obj)).k();
            str = "newBuilder().setStringSe…                ).build()";
        } else {
            if (!(obj instanceof byte[])) {
                throw new java.lang.IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
            }
            abstractC2062wK = P1.h.h0().v(androidx.datastore.preferences.protobuf.AbstractC2047g.n((byte[]) obj)).k();
            str = "newBuilder().setBytes(By….copyFrom(value)).build()";
        }
        p247y7.AbstractC7350t.e(abstractC2062wK, str);
        return (P1.h) abstractC2062wK;
    }

    @Override // O1.c
    public java.lang.Object c(X9.InterfaceC1838f interfaceC1838f, p127m7.e eVar) throws M1.c {
        P1.f fVarA = P1.d.f8282a.a(interfaceC1838f.r1());
        Q1.c cVarB = Q1.g.b(new Q1.f.b[0]);
        java.util.Map mapQ = fVarA.Q();
        p247y7.AbstractC7350t.e(mapQ, "preferencesProto.preferencesMap");
        for (java.util.Map.Entry entry : mapQ.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            P1.h hVar = (P1.h) entry.getValue();
            Q1.j jVar = f8768a;
            p247y7.AbstractC7350t.e(str, "name");
            p247y7.AbstractC7350t.e(hVar, "value");
            jVar.d(str, hVar, cVarB);
        }
        return cVarB.d();
    }

    @Override // O1.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Q1.f a() {
        return Q1.g.a();
    }

    @Override // O1.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public java.lang.Object b(Q1.f fVar, X9.InterfaceC1837e interfaceC1837e, p127m7.e eVar) {
        java.util.Map mapA = fVar.a();
        P1.f.a aVarU = P1.f.U();
        for (java.util.Map.Entry entry : mapA.entrySet()) {
            aVarU.u(((Q1.f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((P1.f) aVarU.k()).h(interfaceC1837e.p1());
        return p087i7.M.f46721a;
    }
}
