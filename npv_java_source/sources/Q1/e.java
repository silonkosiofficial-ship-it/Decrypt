package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q1.e f8762a = new Q1.e();

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f8763D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.a aVar) {
            super(0);
            this.f8763D = aVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X9.Q b() {
            java.io.File file = (java.io.File) this.f8763D.b();
            if (p247y7.AbstractC7350t.b(p197t7.c.a(file), "preferences_pb")) {
                X9.Q.a aVar = X9.Q.f16083D;
                java.io.File absoluteFile = file.getAbsoluteFile();
                p247y7.AbstractC7350t.e(absoluteFile, "file.absoluteFile");
                return X9.Q.a.d(aVar, absoluteFile, false, 1, null);
            }
            throw new java.lang.IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final M1.h a(M1.w wVar, N1.b bVar, java.util.List list, W8.N n6) {
        p247y7.AbstractC7350t.f(wVar, "storage");
        p247y7.AbstractC7350t.f(list, "migrations");
        p247y7.AbstractC7350t.f(n6, "scope");
        return new Q1.d(M1.i.f6796a.a(wVar, bVar, list, n6));
    }

    public final M1.h b(N1.b bVar, java.util.List list, W8.N n6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(list, "migrations");
        p247y7.AbstractC7350t.f(n6, "scope");
        p247y7.AbstractC7350t.f(aVar, "produceFile");
        return new Q1.d(a(new O1.d(X9.AbstractC1843k.f16176b, Q1.j.f8768a, null, new Q1.e.a(aVar), 4, null), bVar, list, n6));
    }
}
