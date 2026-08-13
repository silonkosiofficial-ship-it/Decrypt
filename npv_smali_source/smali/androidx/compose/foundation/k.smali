.class public abstract Landroidx/compose/foundation/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILV/n;II)Landroidx/compose/foundation/m;
    .locals 11

    .prologue
    const/4 v0, 0x1

    and-int/2addr p3, v0

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    move p0, v1

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v2, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)"

    const v3, -0x5746c6c7

    invoke-static {v3, p2, p3, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    new-array v4, v1, [Ljava/lang/Object;

    sget-object p3, Landroidx/compose/foundation/m;->i:Landroidx/compose/foundation/m$c;

    invoke-virtual {p3}, Landroidx/compose/foundation/m$c;->a()Le0/j;

    move-result-object v5

    and-int/lit8 p3, p2, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 v2, 0x4

    if-le p3, v2, :cond_2

    invoke-interface {p1, p0}, LV/n;->i(I)Z

    move-result p3

    if-nez p3, :cond_4

    :cond_2
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v2, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    :cond_4
    :goto_0
    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    if-nez v0, :cond_5

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_6

    :cond_5
    new-instance p2, Landroidx/compose/foundation/k$a;

    invoke-direct {p2, p0}, Landroidx/compose/foundation/k$a;-><init>(I)V

    invoke-interface {p1, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v7, p2

    check-cast v7, Lx7/a;

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, p1

    invoke-static/range {v4 .. v10}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/m;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    return-object p0
.end method

.method private static final b(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;ZZ)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/k$b;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/k$b;-><init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v7, Landroidx/compose/foundation/k$c;

    move-object v1, v7

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/k$c;-><init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V

    invoke-static {p0, v0, v7}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;Z)Landroidx/compose/ui/d;
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p4

    move-object v3, p3

    move v4, p2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/k;->b(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;ZZ)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;ZILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/k;->c(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;Z)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
