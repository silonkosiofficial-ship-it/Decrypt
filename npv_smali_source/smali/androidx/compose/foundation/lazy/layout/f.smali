.class public abstract Landroidx/compose/foundation/lazy/layout/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IIZ)F
    .locals 0

    .prologue
    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/layout/f;->b(II)F

    move-result p0

    if-eqz p2, :cond_0

    const/16 p1, 0x64

    int-to-float p1, p1

    add-float/2addr p0, p1

    :cond_0
    return p0
.end method

.method public static final b(II)F
    .locals 0

    mul-int/lit16 p0, p0, 0x1f4

    add-int/2addr p1, p0

    int-to-float p0, p1

    return p0
.end method

.method public static final c(Landroidx/compose/ui/d;Lx7/a;LD/E;Lx/s;ZZLV/n;I)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result p6

    if-eqz p6, :cond_0

    const/4 p6, -0x1

    const-string v0, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)"

    const v1, 0x3fc8fe51

    invoke-static {v1, p7, p6, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p6, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;-><init>(Lx7/a;LD/E;Lx/s;ZZ)V

    invoke-interface {p0, p6}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p0
.end method
