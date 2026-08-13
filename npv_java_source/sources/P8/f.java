package P8;

/* JADX INFO: loaded from: classes2.dex */
public class f extends java.util.AbstractList implements java.util.RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f8485C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f8486D;

    private static class b implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final P8.f.b f8487C = new P8.f.b();

        private b() {
        }

        public static P8.f.b b() {
            return f8487C;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.IllegalStateException();
        }
    }

    private class c extends P8.f.d {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f8488D;

        public c() {
            super();
            this.f8488D = ((java.util.AbstractList) P8.f.this).modCount;
        }

        @Override // P8.f.d
        protected void b() {
            if (((java.util.AbstractList) P8.f.this).modCount == this.f8488D) {
                return;
            }
            throw new java.util.ConcurrentModificationException("ModCount: " + ((java.util.AbstractList) P8.f.this).modCount + "; expected: " + this.f8488D);
        }

        @Override // P8.f.d
        protected java.lang.Object c() {
            return P8.f.this.f8486D;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            P8.f.this.clear();
        }
    }

    private static abstract class d implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f8490C;

        private d() {
        }

        protected abstract void b();

        protected abstract java.lang.Object c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f8490C;
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
            if (this.f8490C) {
                throw new java.util.NoSuchElementException();
            }
            this.f8490C = true;
            b();
            return c();
        }
    }

    private static /* synthetic */ void d(int i6) {
        java.lang.String str = (i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6 || i6 == 7) ? 2 : 3];
        switch (i6) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i6 == 2 || i6 == 3) {
            objArr[1] = "iterator";
        } else if (i6 == 5 || i6 == 6 || i6 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i6) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6 && i6 != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, java.lang.Object obj) {
        int i10;
        if (i6 < 0 || i6 > (i10 = this.f8485C)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i6 + ", Size: " + this.f8485C);
        }
        if (i10 == 0) {
            this.f8486D = obj;
        } else if (i10 == 1 && i6 == 0) {
            this.f8486D = new java.lang.Object[]{obj, this.f8486D};
        } else {
            java.lang.Object[] objArr = new java.lang.Object[i10 + 1];
            if (i10 == 1) {
                objArr[0] = this.f8486D;
            } else {
                java.lang.Object[] objArr2 = (java.lang.Object[]) this.f8486D;
                java.lang.System.arraycopy(objArr2, 0, objArr, 0, i6);
                java.lang.System.arraycopy(objArr2, i6, objArr, i6 + 1, this.f8485C - i6);
            }
            objArr[i6] = obj;
            this.f8486D = objArr;
        }
        this.f8485C++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        int i6 = this.f8485C;
        if (i6 == 0) {
            this.f8486D = obj;
        } else if (i6 == 1) {
            this.f8486D = new java.lang.Object[]{this.f8486D, obj};
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.f8486D;
            int length = objArr.length;
            if (i6 >= length) {
                int i10 = ((length * 3) / 2) + 1;
                int i11 = i6 + 1;
                if (i10 < i11) {
                    i10 = i11;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[i10];
                this.f8486D = objArr2;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f8485C] = obj;
        }
        this.f8485C++;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f8486D = null;
        this.f8485C = 0;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i6) {
        int i10;
        if (i6 >= 0 && i6 < (i10 = this.f8485C)) {
            return i10 == 1 ? this.f8486D : ((java.lang.Object[]) this.f8486D)[i6];
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i6 + ", Size: " + this.f8485C);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        int i6 = this.f8485C;
        if (i6 == 0) {
            P8.f.b bVarB = P8.f.b.b();
            if (bVarB == null) {
                d(2);
            }
            return bVarB;
        }
        if (i6 == 1) {
            return new P8.f.c();
        }
        java.util.Iterator it = super.iterator();
        if (it == null) {
            d(3);
        }
        return it;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i6) {
        int i10;
        java.lang.Object obj;
        if (i6 < 0 || i6 >= (i10 = this.f8485C)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i6 + ", Size: " + this.f8485C);
        }
        if (i10 == 1) {
            obj = this.f8486D;
            this.f8486D = null;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.f8486D;
            java.lang.Object obj2 = objArr[i6];
            if (i10 == 2) {
                this.f8486D = objArr[1 - i6];
            } else {
                int i11 = (i10 - i6) - 1;
                if (i11 > 0) {
                    java.lang.System.arraycopy(objArr, i6 + 1, objArr, i6, i11);
                }
                objArr[this.f8485C - 1] = null;
            }
            obj = obj2;
        }
        this.f8485C--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        int i10;
        if (i6 < 0 || i6 >= (i10 = this.f8485C)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i6 + ", Size: " + this.f8485C);
        }
        if (i10 == 1) {
            java.lang.Object obj2 = this.f8486D;
            this.f8486D = obj;
            return obj2;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) this.f8486D;
        java.lang.Object obj3 = objArr[i6];
        objArr[i6] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8485C;
    }

    @Override // java.util.List, j$.util.List
    public void sort(java.util.Comparator comparator) {
        int i6 = this.f8485C;
        if (i6 >= 2) {
            java.util.Arrays.sort((java.lang.Object[]) this.f8486D, 0, i6, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr == null) {
            d(4);
        }
        int length = objArr.length;
        int i6 = this.f8485C;
        if (i6 == 1) {
            if (length == 0) {
                java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f8486D;
                return objArr2;
            }
            objArr[0] = this.f8486D;
        } else {
            if (length < i6) {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) this.f8486D, i6, objArr.getClass());
                if (objArrCopyOf == null) {
                    d(6);
                }
                return objArrCopyOf;
            }
            if (i6 != 0) {
                java.lang.System.arraycopy(this.f8486D, 0, objArr, 0, i6);
            }
        }
        int i10 = this.f8485C;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
