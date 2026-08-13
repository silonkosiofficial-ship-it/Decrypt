package T1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T1.f.b f12910a;

    private static class a extends T1.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.widget.TextView f12911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T1.d f12912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12913c = true;

        a(android.widget.TextView textView) {
            this.f12911a = textView;
            this.f12912b = new T1.d(textView);
        }

        private android.text.InputFilter[] d(android.text.InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (android.text.InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f12912b) {
                    return inputFilterArr;
                }
            }
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
            java.lang.System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f12912b;
            return inputFilterArr2;
        }

        private android.util.SparseArray e(android.text.InputFilter[] inputFilterArr) {
            android.util.SparseArray sparseArray = new android.util.SparseArray(1);
            for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                android.text.InputFilter inputFilter = inputFilterArr[i6];
                if (inputFilter instanceof T1.d) {
                    sparseArray.put(i6, inputFilter);
                }
            }
            return sparseArray;
        }

        private android.text.InputFilter[] f(android.text.InputFilter[] inputFilterArr) {
            android.util.SparseArray sparseArrayE = e(inputFilterArr);
            if (sparseArrayE.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length - sparseArrayE.size()];
            int i6 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (sparseArrayE.indexOfKey(i10) < 0) {
                    inputFilterArr2[i6] = inputFilterArr[i10];
                    i6++;
                }
            }
            return inputFilterArr2;
        }

        private android.text.method.TransformationMethod h(android.text.method.TransformationMethod transformationMethod) {
            return transformationMethod instanceof T1.h ? ((T1.h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f12911a.setFilters(a(this.f12911a.getFilters()));
        }

        private android.text.method.TransformationMethod k(android.text.method.TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof T1.h) || (transformationMethod instanceof android.text.method.PasswordTransformationMethod)) ? transformationMethod : new T1.h(transformationMethod);
        }

        @Override // T1.f.b
        android.text.InputFilter[] a(android.text.InputFilter[] inputFilterArr) {
            return !this.f12913c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // T1.f.b
        void b(boolean z6) {
            if (z6) {
                j();
            }
        }

        @Override // T1.f.b
        void c(boolean z6) {
            this.f12913c = z6;
            j();
            i();
        }

        void g(boolean z6) {
            this.f12913c = z6;
        }

        void j() {
            this.f12911a.setTransformationMethod(l(this.f12911a.getTransformationMethod()));
        }

        android.text.method.TransformationMethod l(android.text.method.TransformationMethod transformationMethod) {
            return this.f12913c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        abstract android.text.InputFilter[] a(android.text.InputFilter[] inputFilterArr);

        abstract void b(boolean z6);

        abstract void c(boolean z6);
    }

    private static class c extends T1.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T1.f.a f12914a;

        c(android.widget.TextView textView) {
            this.f12914a = new T1.f.a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.f.k();
        }

        @Override // T1.f.b
        android.text.InputFilter[] a(android.text.InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f12914a.a(inputFilterArr);
        }

        @Override // T1.f.b
        void b(boolean z6) {
            if (d()) {
                return;
            }
            this.f12914a.b(z6);
        }

        @Override // T1.f.b
        void c(boolean z6) {
            if (d()) {
                this.f12914a.g(z6);
            } else {
                this.f12914a.c(z6);
            }
        }
    }

    public f(android.widget.TextView textView, boolean z6) {
        B1.i.h(textView, "textView cannot be null");
        this.f12910a = !z6 ? new T1.f.c(textView) : new T1.f.a(textView);
    }

    public android.text.InputFilter[] a(android.text.InputFilter[] inputFilterArr) {
        return this.f12910a.a(inputFilterArr);
    }

    public void b(boolean z6) {
        this.f12910a.b(z6);
    }

    public void c(boolean z6) {
        this.f12910a.c(z6);
    }
}
