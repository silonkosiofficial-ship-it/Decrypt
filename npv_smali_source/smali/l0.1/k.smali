.class public abstract Ll0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;FLo0/e2;ZJJ)Landroidx/compose/ui/d;
    .locals 10

    .prologue
    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    move v2, p1

    invoke-static {p1, v0}, LY0/i;->o(FF)I

    move-result v0

    if-gtz v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    const/4 v9, 0x0

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-wide/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;-><init>(FLo0/e2;ZJJLy7/k;)V

    move-object v1, p0

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/d;FLo0/e2;ZJJILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 8

    .prologue
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    int-to-float v2, v1

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    move v3, p1

    invoke-static {p1, v2}, LY0/i;->o(FF)I

    move-result v2

    if-lez v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v3, p1

    move v1, p3

    :cond_2
    :goto_1
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_3

    invoke-static {}, Lo0/D1;->a()J

    move-result-wide v4

    goto :goto_2

    :cond_3
    move-wide v4, p4

    :goto_2
    and-int/lit8 v2, p8, 0x10

    if-eqz v2, :cond_4

    invoke-static {}, Lo0/D1;->a()J

    move-result-wide v6

    goto :goto_3

    :cond_4
    move-wide v6, p6

    :goto_3
    move-object p2, p0

    move p3, p1

    move-object p4, v0

    move p5, v1

    move-wide p6, v4

    move-wide/from16 p8, v6

    invoke-static/range {p2 .. p9}, Ll0/k;->a(Landroidx/compose/ui/d;FLo0/e2;ZJJ)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method
