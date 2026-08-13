.class public abstract synthetic LE0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LE0/i;LE0/c;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ModifierLocal accessed from an unattached node"

    invoke-static {v0}, LC0/a;->a(Ljava/lang/String;)V

    :cond_0
    const/16 v0, 0x20

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_b

    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object v2

    invoke-virtual {v2}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, v0

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    :goto_1
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v2, v0

    if-eqz v2, :cond_8

    move-object v2, v1

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_8

    instance-of v5, v2, LE0/i;

    if-eqz v5, :cond_1

    check-cast v2, LE0/i;

    invoke-interface {v2}, LE0/i;->s0()LE0/g;

    move-result-object v5

    invoke-virtual {v5, p1}, LE0/g;->a(LE0/c;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, LE0/i;->s0()LE0/g;

    move-result-object p0

    invoke-virtual {p0, p1}, LE0/g;->b(LE0/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_7

    instance-of v5, v2, LF0/m;

    if-eqz v5, :cond_7

    move-object v5, v2

    check-cast v5, LF0/m;

    invoke-virtual {v5}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_3
    const/4 v8, 0x1

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_5

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_2

    move-object v2, v5

    goto :goto_4

    :cond_2
    if-nez v4, :cond_3

    new-instance v4, LX/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/d$c;

    invoke-direct {v4, v8, v6}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v4, v2}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v2, v3

    :cond_4
    invoke-virtual {v4, v5}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_5
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_3

    :cond_6
    if-ne v7, v8, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v4}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_1

    :cond_9
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_a
    move-object v1, v3

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1}, LE0/c;->a()Lx7/a;

    move-result-object p0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitAncestors called on an unattached node"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(LE0/i;)LE0/g;
    .locals 0

    sget-object p0, LE0/b;->a:LE0/b;

    return-object p0
.end method
