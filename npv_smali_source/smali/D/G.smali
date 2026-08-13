.class public abstract LD/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/q;LV/n;I)V
    .locals 9

    .prologue
    const/4 v0, 0x1

    const v1, 0x282f3fa8

    invoke-interface {p1, v1}, LV/n;->r(I)LV/n;

    move-result-object p1

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {p1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, p2

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    if-ne v4, v3, :cond_3

    invoke-interface {p1}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)"

    invoke-static {v1, v2, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Le0/i;->d()LV/O0;

    move-result-object v1

    invoke-interface {p1, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le0/g;

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v3, LD/F;->d:LD/F$b;

    invoke-virtual {v3, v1}, LD/F$b;->a(Le0/g;)Le0/j;

    move-result-object v3

    invoke-interface {p1, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, LD/G$c;

    invoke-direct {v5, v1}, LD/G$c;-><init>(Le0/g;)V

    invoke-interface {p1, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lx7/a;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v4, 0x0

    move-object v6, p1

    invoke-static/range {v2 .. v8}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/F;

    invoke-static {}, Le0/i;->d()LV/O0;

    move-result-object v2

    invoke-virtual {v2, v1}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v2

    new-instance v3, LD/G$a;

    invoke-direct {v3, v1, p0}, LD/G$a;-><init>(LD/F;Lx7/q;)V

    const/16 v1, 0x36

    const v4, 0x6f1942e8

    invoke-static {v4, v0, v3, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget v1, LV/P0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {v2, v0, p1, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    :goto_3
    invoke-interface {p1}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, LD/G$b;

    invoke-direct {v0, p0, p2}, LD/G$b;-><init>(Lx7/q;I)V

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_8
    return-void
.end method
