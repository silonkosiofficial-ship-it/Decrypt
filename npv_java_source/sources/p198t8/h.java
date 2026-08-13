package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p198t8.h f54633a = new p198t8.h();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ L7.h f54634D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L7.h hVar) {
            super(1);
            this.f54634D = hVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "it");
            F8.M mO = g6.t().O(this.f54634D);
            p247y7.AbstractC7350t.e(mO, "getPrimitiveArrayKotlinType(...)");
            return mO;
        }
    }

    private h() {
    }

    private final p198t8.b b(java.util.List list, O7.G g6, L7.h hVar) {
        java.util.List listT0 = p097j7.AbstractC6879v.T0(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listT0.iterator();
        while (it.hasNext()) {
            p198t8.g gVarD = d(this, it.next(), null, 2, null);
            if (gVarD != null) {
                arrayList.add(gVarD);
            }
        }
        if (g6 == null) {
            return new p198t8.b(arrayList, new t8.h.a(hVar));
        }
        F8.M mO = g6.t().O(hVar);
        p247y7.AbstractC7350t.e(mO, "getPrimitiveArrayKotlinType(...)");
        return new p198t8.v(arrayList, mO);
    }

    public static /* synthetic */ p198t8.g d(p198t8.h hVar, java.lang.Object obj, O7.G g6, int i6, java.lang.Object obj2) {
        if ((i6 & 2) != 0) {
            g6 = null;
        }
        return hVar.c(obj, g6);
    }

    public final p198t8.b a(java.util.List list, F8.E e6) {
        p247y7.AbstractC7350t.f(list, "value");
        p247y7.AbstractC7350t.f(e6, "type");
        return new p198t8.v(list, e6);
    }

    public final p198t8.g c(java.lang.Object obj, O7.G g6) {
        java.util.List listT0;
        L7.h hVar;
        if (obj instanceof java.lang.Byte) {
            return new p198t8.d(((java.lang.Number) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return new p198t8.t(((java.lang.Number) obj).shortValue());
        }
        if (obj instanceof java.lang.Integer) {
            return new p198t8.m(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            return new p198t8.q(((java.lang.Number) obj).longValue());
        }
        if (obj instanceof java.lang.Character) {
            return new p198t8.e(((java.lang.Character) obj).charValue());
        }
        if (obj instanceof java.lang.Float) {
            return new p198t8.l(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Double) {
            return new p198t8.i(((java.lang.Number) obj).doubleValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return new p198t8.c(((java.lang.Boolean) obj).booleanValue());
        }
        if (obj instanceof java.lang.String) {
            return new p198t8.u((java.lang.String) obj);
        }
        if (obj instanceof byte[]) {
            listT0 = p097j7.AbstractC6872n.L0((byte[]) obj);
            hVar = L7.h.BYTE;
        } else if (obj instanceof short[]) {
            listT0 = p097j7.AbstractC6872n.S0((short[]) obj);
            hVar = L7.h.SHORT;
        } else if (obj instanceof int[]) {
            listT0 = p097j7.AbstractC6872n.P0((int[]) obj);
            hVar = L7.h.INT;
        } else if (obj instanceof long[]) {
            listT0 = p097j7.AbstractC6872n.Q0((long[]) obj);
            hVar = L7.h.LONG;
        } else if (obj instanceof char[]) {
            listT0 = p097j7.AbstractC6872n.M0((char[]) obj);
            hVar = L7.h.CHAR;
        } else if (obj instanceof float[]) {
            listT0 = p097j7.AbstractC6872n.O0((float[]) obj);
            hVar = L7.h.FLOAT;
        } else if (obj instanceof double[]) {
            listT0 = p097j7.AbstractC6872n.N0((double[]) obj);
            hVar = L7.h.DOUBLE;
        } else {
            if (!(obj instanceof boolean[])) {
                if (obj == null) {
                    return new p198t8.r();
                }
                return null;
            }
            listT0 = p097j7.AbstractC6872n.T0((boolean[]) obj);
            hVar = L7.h.BOOLEAN;
        }
        return b(listT0, g6, hVar);
    }
}
