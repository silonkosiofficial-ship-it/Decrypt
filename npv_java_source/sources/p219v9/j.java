package p219v9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f56050C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p219v9.f f56051D;

        a(p219v9.f fVar) {
            this.f56051D = fVar;
            this.f56050C = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p219v9.f next() {
            p219v9.f fVar = this.f56051D;
            int iE = fVar.e();
            int i6 = this.f56050C;
            this.f56050C = i6 - 1;
            return fVar.h(iE - i6);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56050C > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f56052C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p219v9.f f56053D;

        b(p219v9.f fVar) {
            this.f56053D = fVar;
            this.f56052C = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            p219v9.f fVar = this.f56053D;
            int iE = fVar.e();
            int i6 = this.f56052C;
            this.f56052C = i6 - 1;
            return fVar.f(iE - i6);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56052C > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements java.lang.Iterable, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p219v9.f f56054C;

        public c(p219v9.f fVar) {
            this.f56054C = fVar;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator iterator() {
            return new v9.j.a(this.f56054C);
        }
    }

    public static final class d implements java.lang.Iterable, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p219v9.f f56055C;

        public d(p219v9.f fVar) {
            this.f56055C = fVar;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator iterator() {
            return new v9.j.b(this.f56055C);
        }
    }

    public static final java.lang.Iterable a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return new v9.j.c(fVar);
    }

    public static final java.lang.Iterable b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return new v9.j.d(fVar);
    }
}
