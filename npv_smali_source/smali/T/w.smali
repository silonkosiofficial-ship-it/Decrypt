.class public abstract LT/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLM0/P;Lx7/p;LV/n;I)V
    .locals 7

    .prologue
    const/4 v0, 0x2

    const v1, -0x2aaf331b

    invoke-interface {p4, v1}, LV/n;->r(I)LV/n;

    move-result-object p4

    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_1

    invoke-interface {p4, p0, p1}, LV/n;->j(J)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_1
    move v2, p5

    :goto_1
    and-int/lit8 v3, p5, 0x30

    if-nez v3, :cond_3

    invoke-interface {p4, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, p5, 0x180

    if-nez v3, :cond_5

    invoke-interface {p4, p3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_7

    invoke-interface {p4}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p4}, LV/n;->A()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)"

    invoke-static {v1, v2, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-static {}, LS/m1;->c()LV/O0;

    move-result-object v1

    invoke-interface {p4, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM0/P;

    invoke-virtual {v1, p2}, LM0/P;->I(LM0/P;)LM0/P;

    move-result-object v1

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v3

    invoke-static {p0, p1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v4

    invoke-virtual {v3, v4}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v3

    invoke-static {}, LS/m1;->c()LV/O0;

    move-result-object v4

    invoke-virtual {v4, v1}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v1

    new-array v0, v0, [LV/P0;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget v1, LV/P0;->i:I

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    invoke-static {v0, p3, p4, v1}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_5
    invoke-interface {p4}, LV/n;->x()LV/e1;

    move-result-object p4

    if-eqz p4, :cond_a

    new-instance v6, LT/w$a;

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LT/w$a;-><init>(JLM0/P;Lx7/p;I)V

    invoke-interface {p4, v6}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method
