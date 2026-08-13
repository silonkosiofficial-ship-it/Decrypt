.class public abstract LH/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LN/F;Lx7/p;LV/n;I)V
    .locals 10

    .prologue
    const v0, -0x7658948d

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LV/n;->A()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_7

    new-instance v0, Lw/i;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v3, v4}, Lw/i;-><init>(Lw/i$a;ILy7/k;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lw/i;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    new-instance v3, LH/f$a;

    invoke-direct {v3, v0}, LH/f$a;-><init>(Lw/i;)V

    invoke-interface {p2, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v2, v3

    check-cast v2, Lx7/a;

    invoke-static {p0, v0}, LN/H;->a(LN/F;Lw/i;)Lx7/l;

    move-result-object v3

    invoke-virtual {p0}, LN/F;->E()Z

    move-result v5

    shl-int/lit8 v1, v1, 0xc

    const/high16 v4, 0x70000

    and-int/2addr v1, v4

    or-int/lit8 v8, v1, 0x36

    const/16 v9, 0x8

    const/4 v4, 0x0

    move-object v1, v0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Lw/a;->b(Lw/i;Lx7/a;Lx7/l;Landroidx/compose/ui/d;ZLx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_4
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, LH/f$b;

    invoke-direct {v0, p0, p1, p3}, LH/f$b;-><init>(LN/F;Lx7/p;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method
