package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G {
    public static final p258z9.C a(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(number, "value");
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(str2, "output");
        return e(-1, l(number, str, str2));
    }

    public static final p258z9.E b(java.lang.Number number, java.lang.String str) {
        p247y7.AbstractC7350t.f(number, "value");
        p247y7.AbstractC7350t.f(str, "output");
        return new p258z9.E("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) j(str, 0, 1, null)));
    }

    public static final p258z9.E c(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(number, "value");
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(str2, "output");
        return new p258z9.E(l(number, str, str2));
    }

    public static final p258z9.E d(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "keyDescriptor");
        return new p258z9.E("Value of type '" + fVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.j() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final p258z9.C e(int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "message");
        if (i6 >= 0) {
            str = "Unexpected JSON token at offset " + i6 + ": " + str;
        }
        return new p258z9.C(str);
    }

    public static final p258z9.C f(int i6, java.lang.String str, java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(str, "message");
        p247y7.AbstractC7350t.f(charSequence, "input");
        return e(i6, str + "\nJSON input: " + ((java.lang.Object) i(charSequence, i6)));
    }

    public static final java.lang.Void g(p258z9.AbstractC7388a abstractC7388a, java.lang.String str) {
        p247y7.AbstractC7350t.f(abstractC7388a, "<this>");
        p247y7.AbstractC7350t.f(str, "entity");
        abstractC7388a.x("Trailing comma before the end of JSON " + str, abstractC7388a.f57735a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new p087i7.C6665k();
    }

    public static /* synthetic */ java.lang.Void h(p258z9.AbstractC7388a abstractC7388a, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str = "object";
        }
        return g(abstractC7388a, str);
    }

    public static final java.lang.CharSequence i(java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i6 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i10 = i6 - 30;
        int i11 = i6 + 30;
        return (i10 <= 0 ? "" : ".....") + charSequence.subSequence(E7.j.d(i10, 0), E7.j.g(i11, charSequence.length())).toString() + (i11 >= charSequence.length() ? "" : ".....");
    }

    public static /* synthetic */ java.lang.CharSequence j(java.lang.CharSequence charSequence, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = -1;
        }
        return i(charSequence, i6);
    }

    public static final java.lang.Void k(p258z9.AbstractC7388a abstractC7388a, java.lang.Number number) {
        p247y7.AbstractC7350t.f(abstractC7388a, "<this>");
        p247y7.AbstractC7350t.f(number, "result");
        p258z9.AbstractC7388a.y(abstractC7388a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new p087i7.C6665k();
    }

    private static final java.lang.String l(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) j(str2, 0, 1, null));
    }
}
