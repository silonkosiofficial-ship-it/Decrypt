package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G extends p097j7.E {

    public static final class a implements R8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Iterable f49282a;

        public a(java.lang.Iterable iterable) {
            this.f49282a = iterable;
        }

        @Override // R8.h
        public java.util.Iterator iterator() {
            return this.f49282a.iterator();
        }
    }

    public static java.util.List A0(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(iterable2, "elements");
        if (iterable instanceof java.util.Collection) {
            return p097j7.AbstractC6879v.C0((java.util.Collection) iterable, iterable2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p097j7.AbstractC6879v.C(arrayList, iterable);
        p097j7.AbstractC6879v.C(arrayList, iterable2);
        return arrayList;
    }

    public static java.util.List B0(java.lang.Iterable iterable, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return p097j7.AbstractC6879v.D0((java.util.Collection) iterable, obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p097j7.AbstractC6879v.C(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.util.List C0(java.util.Collection collection, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        p247y7.AbstractC7350t.f(iterable, "elements");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            p097j7.AbstractC6879v.C(arrayList, iterable);
            return arrayList;
        }
        java.util.Collection collection2 = (java.util.Collection) iterable;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static java.util.List D0(java.util.Collection collection, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.util.List E0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).size() <= 1) {
            return p097j7.AbstractC6879v.T0(iterable);
        }
        java.util.List listV0 = V0(iterable);
        p097j7.AbstractC6879v.V(listV0);
        return listV0;
    }

    public static java.lang.Object F0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return p097j7.AbstractC6879v.G0((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            throw new java.lang.IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static java.lang.Object G0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new java.lang.IllegalArgumentException("List has more than one element.");
    }

    public static java.lang.Object H0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static java.lang.Object I0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static java.util.List J0(java.util.List list, E7.i iVar) {
        p247y7.AbstractC7350t.f(list, "<this>");
        p247y7.AbstractC7350t.f(iVar, "indices");
        return iVar.isEmpty() ? p097j7.AbstractC6879v.m() : p097j7.AbstractC6879v.T0(list.subList(iVar.M().intValue(), iVar.E().intValue() + 1));
    }

    public static java.util.List K0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List listV0 = V0(iterable);
            p097j7.AbstractC6879v.A(listV0);
            return listV0;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return p097j7.AbstractC6879v.T0(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Comparable[0]);
        p097j7.AbstractC6872n.J((java.lang.Comparable[]) array);
        return p097j7.AbstractC6872n.d(array);
    }

    public static java.util.List L0(java.lang.Iterable iterable, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.List listV0 = V0(iterable);
            p097j7.AbstractC6879v.B(listV0, comparator);
            return listV0;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        if (collection.size() <= 1) {
            return p097j7.AbstractC6879v.T0(iterable);
        }
        java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
        p097j7.AbstractC6872n.K(array, comparator);
        return p097j7.AbstractC6872n.d(array);
    }

    public static java.util.List M0(java.lang.Iterable iterable, int i6) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
        }
        if (i6 == 0) {
            return p097j7.AbstractC6879v.m();
        }
        if (iterable instanceof java.util.Collection) {
            if (i6 >= ((java.util.Collection) iterable).size()) {
                return p097j7.AbstractC6879v.T0(iterable);
            }
            if (i6 == 1) {
                return p097j7.AbstractC6879v.e(p097j7.AbstractC6879v.h0(iterable));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i6);
        java.util.Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i6) {
                break;
            }
        }
        return p097j7.AbstractC6881x.t(arrayList);
    }

    public static java.util.List N0(java.util.List list, int i6) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
        }
        if (i6 == 0) {
            return p097j7.AbstractC6879v.m();
        }
        int size = list.size();
        if (i6 >= size) {
            return p097j7.AbstractC6879v.T0(list);
        }
        if (i6 == 1) {
            return p097j7.AbstractC6879v.e(p097j7.AbstractC6879v.t0(list));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i6);
        if (list instanceof java.util.RandomAccess) {
            for (int i10 = size - i6; i10 < size; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            java.util.ListIterator listIterator = list.listIterator(size - i6);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] O0(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            zArr[i6] = ((java.lang.Boolean) it.next()).booleanValue();
            i6++;
        }
        return zArr;
    }

    public static final java.util.Collection P0(java.lang.Iterable iterable, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(collection, "destination");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static float[] Q0(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        float[] fArr = new float[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            fArr[i6] = ((java.lang.Number) it.next()).floatValue();
            i6++;
        }
        return fArr;
    }

    public static java.util.HashSet R0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return (java.util.HashSet) P0(iterable, new java.util.HashSet(p097j7.S.d(p097j7.AbstractC6879v.x(iterable, 12))));
    }

    public static int[] S0(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            iArr[i6] = ((java.lang.Number) it.next()).intValue();
            i6++;
        }
        return iArr;
    }

    public static java.util.List T0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            return p097j7.AbstractC6881x.t(V0(iterable));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p097j7.AbstractC6879v.m();
        }
        if (size != 1) {
            return p097j7.AbstractC6879v.W0(collection);
        }
        return p097j7.AbstractC6879v.e(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] U0(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            jArr[i6] = ((java.lang.Number) it.next()).longValue();
            i6++;
        }
        return jArr;
    }

    public static final java.util.List V0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return iterable instanceof java.util.Collection ? p097j7.AbstractC6879v.W0((java.util.Collection) iterable) : (java.util.List) P0(iterable, new java.util.ArrayList());
    }

    public static java.util.List W0(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        return new java.util.ArrayList(collection);
    }

    public static boolean X(java.lang.Iterable iterable, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) {
            return true;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((java.lang.Boolean) lVar.l(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static java.util.Set X0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return iterable instanceof java.util.Collection ? new java.util.LinkedHashSet((java.util.Collection) iterable) : (java.util.Set) P0(iterable, new java.util.LinkedHashSet());
    }

    public static R8.h Y(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return new j7.G.a(iterable);
    }

    public static java.util.Set Y0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            return p097j7.b0.f((java.util.Set) P0(iterable, new java.util.LinkedHashSet()));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p097j7.Z.d();
        }
        if (size != 1) {
            return (java.util.Set) P0(iterable, new java.util.LinkedHashSet(p097j7.S.d(collection.size())));
        }
        return p097j7.Z.c(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
    }

    public static boolean Z(java.lang.Iterable iterable, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).contains(obj);
        }
        return m0(iterable, obj) >= 0;
    }

    public static java.util.Set Z0(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(iterable2, "other");
        java.util.Set setX0 = p097j7.AbstractC6879v.X0(iterable);
        p097j7.AbstractC6879v.C(setX0, iterable2);
        return setX0;
    }

    public static int a0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).size();
        }
        java.util.Iterator it = iterable.iterator();
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

    public static java.lang.Iterable a1(final java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return new p097j7.M(new p237x7.a() { // from class: j7.F
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p097j7.G.b1(iterable);
            }
        });
    }

    public static java.util.List b0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return p097j7.AbstractC6879v.T0(p097j7.AbstractC6879v.X0(iterable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Iterator b1(java.lang.Iterable iterable) {
        return iterable.iterator();
    }

    public static java.util.List c0(java.lang.Iterable iterable, int i6) {
        java.util.ArrayList arrayList;
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
        }
        if (i6 == 0) {
            return p097j7.AbstractC6879v.T0(iterable);
        }
        if (iterable instanceof java.util.Collection) {
            int size = ((java.util.Collection) iterable).size() - i6;
            if (size <= 0) {
                return p097j7.AbstractC6879v.m();
            }
            if (size == 1) {
                return p097j7.AbstractC6879v.e(p097j7.AbstractC6879v.s0(iterable));
            }
            arrayList = new java.util.ArrayList(size);
            if (iterable instanceof java.util.List) {
                boolean z6 = iterable instanceof java.util.RandomAccess;
                java.util.List list = (java.util.List) iterable;
                if (z6) {
                    int size2 = list.size();
                    while (i6 < size2) {
                        arrayList.add(list.get(i6));
                        i6++;
                    }
                } else {
                    java.util.ListIterator listIterator = list.listIterator(i6);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        int i10 = 0;
        for (java.lang.Object obj : iterable) {
            if (i10 >= i6) {
                arrayList.add(obj);
            } else {
                i10++;
            }
        }
        return p097j7.AbstractC6881x.t(arrayList);
    }

    public static java.util.List c1(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(iterable2, "other");
        java.util.Iterator it = iterable.iterator();
        java.util.Iterator it2 = iterable2.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(p097j7.AbstractC6879v.x(iterable, 10), p097j7.AbstractC6879v.x(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(p087i7.B.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static java.util.List d0(java.util.List list, int i6) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (i6 >= 0) {
            return p097j7.AbstractC6879v.M0(list, E7.j.d(list.size() - i6, 0));
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
    }

    public static java.util.List e0(java.lang.Iterable iterable, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.List f0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        return (java.util.List) g0(iterable, new java.util.ArrayList());
    }

    public static final java.util.Collection g0(java.lang.Iterable iterable, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(collection, "destination");
        for (java.lang.Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static java.lang.Object h0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return p097j7.AbstractC6879v.i0((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public static java.lang.Object i0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static java.lang.Object j0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static java.lang.Object k0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static java.lang.Object l0(java.util.List list, int i6) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (i6 < 0 || i6 >= list.size()) {
            return null;
        }
        return list.get(i6);
    }

    public static final int m0(java.lang.Iterable iterable, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return ((java.util.List) iterable).indexOf(obj);
        }
        int i6 = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            if (p247y7.AbstractC7350t.b(obj, obj2)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static java.util.Set n0(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(iterable2, "other");
        java.util.Set setX0 = p097j7.AbstractC6879v.X0(iterable);
        p097j7.C.N(setX0, iterable2);
        return setX0;
    }

    public static final java.lang.Appendable o0(java.lang.Iterable iterable, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(appendable, "buffer");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i10 = 0;
        for (java.lang.Object obj : iterable) {
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

    public static final java.lang.String q0(java.lang.Iterable iterable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        return ((java.lang.StringBuilder) o0(iterable, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i6, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ java.lang.String r0(java.lang.Iterable iterable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
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
        return q0(iterable, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static java.lang.Object s0(java.lang.Iterable iterable) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            return p097j7.AbstractC6879v.t0((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static java.lang.Object t0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(p097j7.AbstractC6879v.o(list));
    }

    public static java.lang.Object u0(java.lang.Iterable iterable) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static java.lang.Object v0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static java.util.List w0(java.lang.Iterable iterable, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(lVar, "transform");
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.l(it.next()));
        }
        return arrayList;
    }

    public static java.lang.Comparable x0(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.util.List y0(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(iterable2, "elements");
        java.util.Collection collectionE = p097j7.C.E(iterable2);
        if (collectionE.isEmpty()) {
            return p097j7.AbstractC6879v.T0(iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (!collectionE.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.List z0(java.lang.Iterable iterable, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        boolean z6 = false;
        for (java.lang.Object obj2 : iterable) {
            boolean z10 = true;
            if (!z6 && p247y7.AbstractC7350t.b(obj2, obj)) {
                z6 = true;
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
