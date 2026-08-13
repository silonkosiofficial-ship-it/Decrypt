.class public abstract Lv/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;Lx/f;LV/n;II)Landroidx/compose/ui/d;
    .locals 9

    .prologue
    move-object v2, p2

    move-object/from16 v0, p8

    and-int/lit8 v1, p10, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v3, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)"

    const v4, -0x64017657

    move/from16 v5, p9

    invoke-static {v4, v5, v1, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    sget-object v1, Lx/y;->a:Lx/y;

    const/4 v3, 0x6

    invoke-virtual {v1, v0, v3}, Lx/y;->b(LV/n;I)Lv/T;

    move-result-object v3

    move-object v4, p0

    invoke-static {p0, p2}, Lv/l;->a(Landroidx/compose/ui/d;Lx/s;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-static {v4, v3}, Lv/U;->a(Landroidx/compose/ui/d;Lv/T;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v5

    invoke-interface {v0, v5}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/v;

    move v5, p4

    invoke-virtual {v1, v0, p2, p4}, Lx/y;->c(LY0/v;Lx/s;Z)Z

    move-result v5

    move-object v0, v4

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/gestures/d;->f(Landroidx/compose/ui/d;Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object v0
.end method
