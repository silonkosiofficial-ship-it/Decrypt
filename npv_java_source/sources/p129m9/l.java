package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f51254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p129m9.q f51255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f51256c;

        public a(java.lang.Object obj, p129m9.q qVar, int i6) {
            p247y7.AbstractC7350t.f(qVar, "parserStructure");
            this.f51254a = obj;
            this.f51255b = qVar;
            this.f51256c = i6;
        }

        public final int a() {
            return this.f51256c;
        }

        public final java.lang.Object b() {
            return this.f51254a;
        }

        public final p129m9.q c() {
            return this.f51255b;
        }
    }

    public static final class b implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(((p129m9.i) obj2).b()), java.lang.Integer.valueOf(((p129m9.i) obj).b()));
        }
    }

    public static p129m9.q a(p129m9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "commands");
        return qVar;
    }

    public static final p129m9.c b(p129m9.q qVar, java.lang.CharSequence charSequence, p129m9.c cVar, int i6) throws p129m9.j {
        p247y7.AbstractC7350t.f(charSequence, "input");
        p247y7.AbstractC7350t.f(cVar, "initialContainer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listS = p097j7.AbstractC6879v.s(new m9.l.a(cVar, qVar, i6));
        while (true) {
            m9.l.a aVar = (m9.l.a) p097j7.AbstractC6879v.M(listS);
            if (aVar != null) {
                p129m9.c cVar2 = (p129m9.c) ((p129m9.c) aVar.b()).e();
                int iA = aVar.a();
                p129m9.q qVarC = aVar.c();
                int size = qVarC.b().size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        if (!qVarC.a().isEmpty()) {
                            int size2 = qVarC.a().size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i11 = size2 - 1;
                                listS.add(new m9.l.a(cVar2, (p129m9.q) qVarC.a().get(size2), iA));
                                if (i11 < 0) {
                                    break;
                                }
                                size2 = i11;
                            }
                        } else {
                            if (iA != charSequence.length()) {
                                arrayList.add(new p129m9.i(iA, p129m9.m.f51257D));
                                break;
                            }
                            return cVar2;
                        }
                    } else {
                        java.lang.Object objA = ((p129m9.o) qVarC.b().get(i10)).a(cVar2, charSequence, iA);
                        if (!(objA instanceof java.lang.Integer)) {
                            if (objA instanceof p129m9.i) {
                                arrayList.add((p129m9.i) objA);
                                break;
                            }
                            throw new java.lang.IllegalStateException(("Unexpected parse result: " + objA).toString());
                        }
                        iA = ((java.lang.Number) objA).intValue();
                        i10++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    p097j7.AbstractC6879v.B(arrayList, new m9.l.b());
                }
                throw new p129m9.j(arrayList);
            }
        }
    }

    public static /* synthetic */ p129m9.c c(p129m9.q qVar, java.lang.CharSequence charSequence, p129m9.c cVar, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return b(qVar, charSequence, cVar, i6);
    }
}
