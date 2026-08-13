.class public abstract Landroidx/compose/foundation/selection/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;)Landroidx/compose/ui/d;
    .locals 10

    .prologue
    move-object v2, p2

    move-object v1, p3

    instance-of v0, v1, Lv/I;

    if-eqz v0, :cond_0

    move-object v3, v1

    check-cast v3, Lv/I;

    new-instance v8, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v7, 0x0

    move-object v0, v8

    move v1, p1

    move-object v2, p2

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    new-instance v8, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, v8

    move v1, p1

    move-object v2, p2

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {v0, p2, p3}, Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/d;Lz/j;Lv/G;)Landroidx/compose/ui/d;

    move-result-object v8

    new-instance v9, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, v9

    move v1, p1

    move-object v2, p2

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V

    invoke-interface {v8, v9}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v8

    goto :goto_0

    :cond_2
    sget-object v6, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v7, Landroidx/compose/foundation/selection/a$a;

    move-object v0, v7

    move-object v1, p3

    move v2, p1

    move v3, p4

    move-object v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/selection/a$a;-><init>(Lv/G;ZZLK0/h;Lx7/a;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v6, v1, v7, v0, v1}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v8

    goto :goto_0

    :goto_1
    invoke-interface {p0, v8}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/a;->a(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
