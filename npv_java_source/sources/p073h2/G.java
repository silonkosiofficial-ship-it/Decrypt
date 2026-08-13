package p073h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    public static final class a extends p073h2.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f45924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f45926d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i6, java.util.List list, int i10, int i11) {
            super(null);
            p247y7.AbstractC7350t.f(list, "inserted");
            this.f45923a = i6;
            this.f45924b = list;
            this.f45925c = i10;
            this.f45926d = i11;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof h2.G.a) {
                h2.G.a aVar = (h2.G.a) obj;
                if (this.f45923a == aVar.f45923a && p247y7.AbstractC7350t.b(this.f45924b, aVar.f45924b) && this.f45925c == aVar.f45925c && this.f45926d == aVar.f45926d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f45923a + this.f45924b.hashCode() + this.f45925c + this.f45926d;
        }

        public java.lang.String toString() {
            return S8.r.q("PagingDataEvent.Append loaded " + this.f45924b.size() + " items (\n                    |   startIndex: " + this.f45923a + "\n                    |   first item: " + p097j7.AbstractC6879v.k0(this.f45924b) + "\n                    |   last item: " + p097j7.AbstractC6879v.v0(this.f45924b) + "\n                    |   newPlaceholdersBefore: " + this.f45925c + "\n                    |   oldPlaceholdersBefore: " + this.f45926d + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class b extends p073h2.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f45930d;

        public b(int i6, int i10, int i11, int i12) {
            super(null);
            this.f45927a = i6;
            this.f45928b = i10;
            this.f45929c = i11;
            this.f45930d = i12;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof h2.G.b) {
                h2.G.b bVar = (h2.G.b) obj;
                if (this.f45927a == bVar.f45927a && this.f45928b == bVar.f45928b && this.f45929c == bVar.f45929c && this.f45930d == bVar.f45930d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f45927a + this.f45928b + this.f45929c + this.f45930d;
        }

        public java.lang.String toString() {
            return S8.r.q("PagingDataEvent.DropAppend dropped " + this.f45928b + " items (\n                    |   startIndex: " + this.f45927a + "\n                    |   dropCount: " + this.f45928b + "\n                    |   newPlaceholdersBefore: " + this.f45929c + "\n                    |   oldPlaceholdersBefore: " + this.f45930d + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class c extends p073h2.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45933c;

        public c(int i6, int i10, int i11) {
            super(null);
            this.f45931a = i6;
            this.f45932b = i10;
            this.f45933c = i11;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof h2.G.c) {
                h2.G.c cVar = (h2.G.c) obj;
                if (this.f45931a == cVar.f45931a && this.f45932b == cVar.f45932b && this.f45933c == cVar.f45933c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f45931a + this.f45932b + this.f45933c;
        }

        public java.lang.String toString() {
            return S8.r.q("PagingDataEvent.DropPrepend dropped " + this.f45931a + " items (\n                    |   dropCount: " + this.f45931a + "\n                    |   newPlaceholdersBefore: " + this.f45932b + "\n                    |   oldPlaceholdersBefore: " + this.f45933c + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class d extends p073h2.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f45934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.util.List list, int i6, int i10) {
            super(null);
            p247y7.AbstractC7350t.f(list, "inserted");
            this.f45934a = list;
            this.f45935b = i6;
            this.f45936c = i10;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof h2.G.d) {
                h2.G.d dVar = (h2.G.d) obj;
                if (p247y7.AbstractC7350t.b(this.f45934a, dVar.f45934a) && this.f45935b == dVar.f45935b && this.f45936c == dVar.f45936c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f45934a.hashCode() + this.f45935b + this.f45936c;
        }

        public java.lang.String toString() {
            return S8.r.q("PagingDataEvent.Prepend loaded " + this.f45934a.size() + " items (\n                    |   first item: " + p097j7.AbstractC6879v.k0(this.f45934a) + "\n                    |   last item: " + p097j7.AbstractC6879v.v0(this.f45934a) + "\n                    |   newPlaceholdersBefore: " + this.f45935b + "\n                    |   oldPlaceholdersBefore: " + this.f45936c + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class e extends p073h2.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.N f45937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p073h2.N f45938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p073h2.N n6, p073h2.N n10) {
            super(null);
            p247y7.AbstractC7350t.f(n6, "newList");
            p247y7.AbstractC7350t.f(n10, "previousList");
            this.f45937a = n6;
            this.f45938b = n10;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof h2.G.e) {
                h2.G.e eVar = (h2.G.e) obj;
                if (this.f45937a.c() == eVar.f45937a.c() && this.f45937a.d() == eVar.f45937a.d() && this.f45937a.a() == eVar.f45937a.a() && this.f45937a.b() == eVar.f45937a.b() && this.f45938b.c() == eVar.f45938b.c() && this.f45938b.d() == eVar.f45938b.d() && this.f45938b.a() == eVar.f45938b.a() && this.f45938b.b() == eVar.f45938b.b()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f45937a.hashCode() + this.f45938b.hashCode();
        }

        public java.lang.String toString() {
            return S8.r.q("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.f45937a.c() + "\n                    |       placeholdersAfter: " + this.f45937a.d() + "\n                    |       size: " + this.f45937a.a() + "\n                    |       dataCount: " + this.f45937a.b() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.f45938b.c() + "\n                    |       placeholdersAfter: " + this.f45938b.d() + "\n                    |       size: " + this.f45938b.a() + "\n                    |       dataCount: " + this.f45938b.b() + "\n                    |   )\n                    |", null, 1, null);
        }
    }

    private G() {
    }

    public /* synthetic */ G(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }
}
