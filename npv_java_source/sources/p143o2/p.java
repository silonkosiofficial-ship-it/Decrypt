package p143o2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class p {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f52493G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p143o2.n f52494H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f52495I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p143o2.n nVar, p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f52494H = nVar;
            this.f52495I = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f52493G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p143o2.n nVar = this.f52494H;
                p237x7.p pVar = this.f52495I;
                this.f52493G = 1;
                obj = nVar.O(true, pVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((o2.p.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new o2.p.a(this.f52494H, this.f52495I, eVar);
        }
    }

    public static final java.lang.Object a(p143o2.n nVar, p237x7.p pVar, p127m7.e eVar) {
        return W8.AbstractC1784g.g(nVar.q().getCoroutineContext(), new o2.p.a(nVar, pVar, null), eVar);
    }

    public static final void b(p143o2.n nVar, p143o2.C7023c c7023c) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        p247y7.AbstractC7350t.f(c7023c, "configuration");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Set setU = nVar.u();
        int size = setU.size();
        boolean[] zArr = new boolean[size];
        java.util.Iterator it = setU.iterator();
        while (true) {
            int i6 = -1;
            if (!it.hasNext()) {
                int size2 = c7023c.f52414r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i10 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i10 < 0) {
                            break;
                        } else {
                            size2 = i10;
                        }
                    }
                }
                for (p183s2.a aVar : nVar.i(linkedHashMap)) {
                    if (!c7023c.f52400d.c(aVar.f54116a, aVar.f54117b)) {
                        c7023c.f52400d.a(aVar);
                    }
                }
                return;
            }
            F7.c cVar = (F7.c) it.next();
            int size3 = c7023c.f52414r.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i11 = size3 - 1;
                    if (cVar.d(c7023c.f52414r.get(size3))) {
                        zArr[size3] = true;
                        i6 = size3;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        size3 = i11;
                    }
                }
            }
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException(("A required auto migration spec (" + cVar.b() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(cVar, c7023c.f52414r.get(i6));
        }
    }

    public static final void c(java.util.Set set, java.util.Set set2) {
        p247y7.AbstractC7350t.f(set, "migrationStartAndEndVersions");
        p247y7.AbstractC7350t.f(set2, "migrationsNotRequiredFrom");
        if (!set.isEmpty()) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Number) it.next()).intValue();
                if (!(!set2.contains(java.lang.Integer.valueOf(iIntValue)))) {
                    throw new java.lang.IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
                }
            }
        }
    }

    public static final void d(p143o2.n nVar, p143o2.C7023c c7023c) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        p247y7.AbstractC7350t.f(c7023c, "configuration");
        java.util.Map mapX = nVar.x();
        boolean[] zArr = new boolean[mapX.size()];
        for (java.util.Map.Entry entry : mapX.entrySet()) {
            F7.c cVar = (F7.c) entry.getKey();
            for (F7.c cVar2 : (java.util.List) entry.getValue()) {
                int size = c7023c.f52413q.size() - 1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                while (true) {
                    int i6 = size - 1;
                    if (cVar2.d(c7023c.f52413q.get(size))) {
                        zArr[size] = true;
                        break;
                    } else {
                        if (i6 < 0) {
                            size = -1;
                            break;
                        }
                        size = i6;
                    }
                }
                if (size < 0) {
                    throw new java.lang.IllegalArgumentException(("A required type converter (" + cVar2.b() + ") for " + cVar.b() + " is missing in the database configuration.").toString());
                }
                nVar.d(cVar2, c7023c.f52413q.get(size));
            }
        }
        int size2 = c7023c.f52413q.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i10 = size2 - 1;
            if (!zArr[size2]) {
                throw new java.lang.IllegalArgumentException("Unexpected type converter " + c7023c.f52413q.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i10 < 0) {
                return;
            } else {
                size2 = i10;
            }
        }
    }
}
