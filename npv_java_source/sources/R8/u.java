package R8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends R8.s {

    public static final class a implements java.lang.Iterable, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ R8.h f9774C;

        public a(R8.h hVar) {
            this.f9774C = hVar;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator iterator() {
            return this.f9774C.iterator();
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final R8.u.b f9775L = new R8.u.b();

        b() {
            super(1, R8.h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.util.Iterator l(R8.h hVar) {
            p247y7.AbstractC7350t.f(hVar, "p0");
            return hVar.iterator();
        }
    }

    public static java.lang.Object A(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        java.util.Iterator it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static R8.h B(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "transform");
        return new R8.f(hVar, lVar, R8.u.b.f9775L);
    }

    public static final java.lang.Appendable C(R8.h hVar, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(appendable, "buffer");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i10 = 0;
        for (java.lang.Object obj : hVar) {
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            S8.r.b(appendable, obj, lVar);
        }
        if (i6 >= 0 && i10 > i6) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final java.lang.String D(R8.h hVar, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        return ((java.lang.StringBuilder) C(hVar, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i6, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ java.lang.String E(R8.h hVar, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return D(hVar, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static java.lang.Object F(R8.h hVar) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(hVar, "<this>");
        java.util.Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Sequence is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static R8.h G(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "transform");
        return new R8.w(hVar, lVar);
    }

    public static R8.h H(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "transform");
        return R8.k.y(new R8.w(hVar, lVar));
    }

    public static R8.h I(R8.h hVar, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(iterable, "elements");
        return R8.r.j(R8.r.r(hVar, p097j7.AbstractC6879v.Y(iterable)));
    }

    public static R8.h J(R8.h hVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        return R8.r.j(R8.r.r(hVar, R8.r.r(obj)));
    }

    public static R8.h K(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return new R8.v(hVar, lVar);
    }

    public static final java.util.Collection L(R8.h hVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(collection, "destination");
        java.util.Iterator it = hVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static java.util.List M(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        java.util.Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return p097j7.AbstractC6879v.m();
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return p097j7.AbstractC6879v.e(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }

    public static java.util.List N(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        return (java.util.List) L(hVar, new java.util.ArrayList());
    }

    public static java.lang.Iterable t(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        return new R8.u.a(hVar);
    }

    public static int u(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        java.util.Iterator it = hVar.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            it.next();
            i6++;
            if (i6 < 0) {
                p097j7.AbstractC6879v.v();
            }
        }
        return i6;
    }

    public static R8.h v(R8.h hVar, int i6) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        if (i6 >= 0) {
            if (i6 == 0) {
                return hVar;
            }
            return hVar instanceof R8.c ? ((R8.c) hVar).a(i6) : new R8.b(hVar, i6);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
    }

    public static R8.h w(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return new R8.e(hVar, true, lVar);
    }

    public static R8.h x(R8.h hVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return new R8.e(hVar, false, lVar);
    }

    public static R8.h y(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        R8.h hVarX = R8.k.x(hVar, new p237x7.l() { // from class: R8.t
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(R8.u.z(obj));
            }
        });
        p247y7.AbstractC7350t.d(hVarX, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return hVarX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(java.lang.Object obj) {
        return obj == null;
    }
}
