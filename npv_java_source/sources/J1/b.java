package J1;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    public interface a {
        void a(java.lang.Object obj, android.graphics.Rect rect);
    }

    /* JADX INFO: renamed from: J1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0132b {
        java.lang.Object a(java.lang.Object obj, int i6);

        int b(java.lang.Object obj);
    }

    private static class c implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final android.graphics.Rect f5617C = new android.graphics.Rect();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final android.graphics.Rect f5618D = new android.graphics.Rect();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final boolean f5619E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final J1.b.a f5620F;

        c(boolean z6, J1.b.a aVar) {
            this.f5619E = z6;
            this.f5620F = aVar;
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object obj, java.lang.Object obj2) {
            android.graphics.Rect rect = this.f5617C;
            android.graphics.Rect rect2 = this.f5618D;
            this.f5620F.a(obj, rect);
            this.f5620F.a(obj2, rect2);
            int i6 = rect.top;
            int i10 = rect2.top;
            if (i6 < i10) {
                return -1;
            }
            if (i6 > i10) {
                return 1;
            }
            int i11 = rect.left;
            int i12 = rect2.left;
            if (i11 < i12) {
                return this.f5619E ? 1 : -1;
            }
            if (i11 > i12) {
                return this.f5619E ? -1 : 1;
            }
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if (i13 < i14) {
                return -1;
            }
            if (i13 > i14) {
                return 1;
            }
            int i15 = rect.right;
            int i16 = rect2.right;
            if (i15 < i16) {
                return this.f5619E ? 1 : -1;
            }
            if (i15 > i16) {
                return this.f5619E ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i6, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3) {
        boolean zB = b(i6, rect, rect2);
        if (b(i6, rect, rect3) || !zB) {
            return false;
        }
        return !j(i6, rect, rect3) || i6 == 17 || i6 == 66 || k(i6, rect, rect2) < m(i6, rect, rect3);
    }

    private static boolean b(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[SYNTHETIC] */
    public static java.lang.Object c(java.lang.Object obj, J1.b.InterfaceC0132b interfaceC0132b, J1.b.a aVar, java.lang.Object obj2, android.graphics.Rect rect, int i6) {
        int iWidth;
        int iB;
        android.graphics.Rect rect2;
        java.lang.Object obj3;
        java.lang.Object objA;
        int iHeight;
        android.graphics.Rect rect3 = new android.graphics.Rect(rect);
        if (i6 != 17) {
            if (i6 == 33) {
                iHeight = rect.height() + 1;
            } else if (i6 == 66) {
                iWidth = -(rect.width() + 1);
            } else {
                if (i6 != 130) {
                    throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                iHeight = -(rect.height() + 1);
            }
            rect3.offset(0, iHeight);
            iB = interfaceC0132b.b(obj);
            rect2 = new android.graphics.Rect();
            obj3 = null;
            for (int i10 = 0; i10 < iB; i10++) {
                objA = interfaceC0132b.a(obj, i10);
                if (objA == obj2) {
                    aVar.a(objA, rect2);
                    if (h(i6, rect, rect2, rect3)) {
                        rect3.set(rect2);
                        obj3 = objA;
                    }
                }
            }
            return obj3;
        }
        iWidth = rect.width() + 1;
        rect3.offset(iWidth, 0);
        iB = interfaceC0132b.b(obj);
        rect2 = new android.graphics.Rect();
        obj3 = null;
        while (i10 < iB) {
            objA = interfaceC0132b.a(obj, i10);
            if (objA == obj2) {
                aVar.a(objA, rect2);
                if (h(i6, rect, rect2, rect3)) {
                    rect3.set(rect2);
                    obj3 = objA;
                }
            }
        }
        return obj3;
    }

    public static java.lang.Object d(java.lang.Object obj, J1.b.InterfaceC0132b interfaceC0132b, J1.b.a aVar, java.lang.Object obj2, int i6, boolean z6, boolean z10) {
        int iB = interfaceC0132b.b(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList(iB);
        for (int i10 = 0; i10 < iB; i10++) {
            arrayList.add(interfaceC0132b.a(obj, i10));
        }
        java.util.Collections.sort(arrayList, new J1.b.c(z6, aVar));
        if (i6 == 1) {
            return f(obj2, arrayList, z10);
        }
        if (i6 == 2) {
            return e(obj2, arrayList, z10);
        }
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static java.lang.Object e(java.lang.Object obj, java.util.ArrayList arrayList, boolean z6) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z6 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static java.lang.Object f(java.lang.Object obj, java.util.ArrayList arrayList, boolean z6) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z6 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i6, int i10) {
        return (i6 * 13 * i6) + (i10 * i10);
    }

    private static boolean h(int i6, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3) {
        if (!i(rect, rect2, i6)) {
            return false;
        }
        if (i(rect, rect3, i6) && !a(i6, rect, rect2, rect3)) {
            return !a(i6, rect, rect3, rect2) && g(k(i6, rect, rect2), o(i6, rect, rect2)) < g(k(i6, rect, rect3), o(i6, rect, rect3));
        }
        return true;
    }

    private static boolean i(android.graphics.Rect rect, android.graphics.Rect rect2, int i6) {
        if (i6 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i6 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i6 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i6 != 130) {
            throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i6 == 17) {
            return rect.left >= rect2.right;
        }
        if (i6 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i6 == 66) {
            return rect.right <= rect2.left;
        }
        if (i6 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        return java.lang.Math.max(0, l(i6, rect, rect2));
    }

    private static int l(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i10;
        int i11;
        if (i6 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i6 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i6 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i6 != 130) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return i10 - i11;
    }

    private static int m(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        return java.lang.Math.max(1, n(i6, rect, rect2));
    }

    private static int n(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i10;
        int i11;
        if (i6 == 17) {
            i10 = rect.left;
            i11 = rect2.left;
        } else if (i6 == 33) {
            i10 = rect.top;
            i11 = rect2.top;
        } else if (i6 == 66) {
            i10 = rect2.right;
            i11 = rect.right;
        } else {
            if (i6 != 130) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.bottom;
            i11 = rect.bottom;
        }
        return i10 - i11;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    private static int o(int i6, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int iHeight;
        int i10;
        int iHeight2;
        if (i6 == 17) {
            iHeight = rect.top + (rect.height() / 2);
            i10 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i6 != 33) {
                if (i6 == 66) {
                    iHeight = rect.top + (rect.height() / 2);
                    i10 = rect2.top;
                    iHeight2 = rect2.height();
                } else if (i6 != 130) {
                    throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            iHeight = rect.left + (rect.width() / 2);
            i10 = rect2.left;
            iHeight2 = rect2.width();
        }
        return java.lang.Math.abs(iHeight - (i10 + (iHeight2 / 2)));
    }
}
