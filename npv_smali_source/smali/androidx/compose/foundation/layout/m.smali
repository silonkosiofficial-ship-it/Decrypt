.class public abstract Landroidx/compose/foundation/layout/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(F)LA/B;
    .locals 7

    new-instance v6, LA/C;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p0

    move v3, p0

    move v4, p0

    invoke-direct/range {v0 .. v5}, LA/C;-><init>(FFFFLy7/k;)V

    return-object v6
.end method

.method public static final b(FF)LA/B;
    .locals 7

    new-instance v6, LA/C;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p0

    move v4, p1

    invoke-direct/range {v0 .. v5}, LA/C;-><init>(FFFFLy7/k;)V

    return-object v6
.end method

.method public static synthetic c(FFILjava/lang/Object;)LA/B;
    .locals 1

    .prologue
    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    int-to-float p0, v0

    invoke-static {p0}, LY0/i;->q(F)F

    move-result p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    int-to-float p1, v0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p1

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/m;->b(FF)LA/B;

    move-result-object p0

    return-object p0
.end method

.method public static final d(FFFF)LA/B;
    .locals 7

    new-instance v6, LA/C;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, LA/C;-><init>(FFFFLy7/k;)V

    return-object v6
.end method

.method public static synthetic e(FFFFILjava/lang/Object;)LA/B;
    .locals 1

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    int-to-float p0, v0

    invoke-static {p0}, LY0/i;->q(F)F

    move-result p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    int-to-float p1, v0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    int-to-float p2, v0

    invoke-static {p2}, LY0/i;->q(F)F

    move-result p2

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    int-to-float p3, v0

    invoke-static {p3}, LY0/i;->q(F)F

    move-result p3

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LA/B;LY0/v;)F
    .locals 1

    .prologue
    sget-object v0, LY0/v;->C:LY0/v;

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p1}, LA/B;->b(LY0/v;)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, LA/B;->a(LY0/v;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final g(LA/B;LY0/v;)F
    .locals 1

    .prologue
    sget-object v0, LY0/v;->C:LY0/v;

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p1}, LA/B;->a(LY0/v;)F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, LA/B;->b(LY0/v;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final h(Landroidx/compose/ui/d;LA/B;)Landroidx/compose/ui/d;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/layout/PaddingValuesElement;

    new-instance v1, Landroidx/compose/foundation/layout/m$d;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/m$d;-><init>(LA/B;)V

    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/layout/PaddingValuesElement;-><init>(LA/B;Lx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;
    .locals 9

    new-instance v8, Landroidx/compose/foundation/layout/PaddingElement;

    new-instance v6, Landroidx/compose/foundation/layout/m$c;

    invoke-direct {v6, p1}, Landroidx/compose/foundation/layout/m$c;-><init>(F)V

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v0, v8

    move v1, p1

    move v2, p1

    move v3, p1

    move v4, p1

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFZLx7/l;Ly7/k;)V

    invoke-interface {p0, v8}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;
    .locals 9

    new-instance v8, Landroidx/compose/foundation/layout/PaddingElement;

    new-instance v6, Landroidx/compose/foundation/layout/m$b;

    invoke-direct {v6, p1, p2}, Landroidx/compose/foundation/layout/m$b;-><init>(FF)V

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v0, v8

    move v1, p1

    move v2, p2

    move v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFZLx7/l;Ly7/k;)V

    invoke-interface {p0, v8}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 1

    .prologue
    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    int-to-float p1, v0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    int-to-float p2, v0

    invoke-static {p2}, LY0/i;->q(F)F

    move-result p2

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/m;->j(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/d;FFFF)Landroidx/compose/ui/d;
    .locals 9

    new-instance v8, Landroidx/compose/foundation/layout/PaddingElement;

    new-instance v6, Landroidx/compose/foundation/layout/m$a;

    invoke-direct {v6, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/m$a;-><init>(FFFF)V

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v0, v8

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFZLx7/l;Ly7/k;)V

    invoke-interface {p0, v8}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    int-to-float p1, v0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    int-to-float p2, v0

    invoke-static {p2}, LY0/i;->q(F)F

    move-result p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    int-to-float p3, v0

    invoke-static {p3}, LY0/i;->q(F)F

    move-result p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    int-to-float p4, v0

    invoke-static {p4}, LY0/i;->q(F)F

    move-result p4

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/m;->l(Landroidx/compose/ui/d;FFFF)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
