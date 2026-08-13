package p082i1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p082i1.c {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final i1.h.a f46655K = new i1.h.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p082i1.h a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "content");
            char[] charArray = str.toCharArray();
            p247y7.AbstractC7350t.e(charArray, "toCharArray(...)");
            p082i1.h hVar = new p082i1.h(charArray);
            hVar.O(0L);
            hVar.N(((long) str.length()) - 1);
            return hVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p082i1.h hVar) {
        super(hVar);
        p247y7.AbstractC7350t.f(hVar, "clString");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(char[] cArr) {
        super(cArr);
        p247y7.AbstractC7350t.f(cArr, "mContent");
    }

    @Override // p082i1.c
    public p082i1.c d() {
        return new p082i1.h(this);
    }

    @Override // p082i1.c
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p082i1.h) && p247y7.AbstractC7350t.b(e(), ((p082i1.h) obj).e())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // p082i1.c
    public int hashCode() {
        return super.hashCode();
    }
}
