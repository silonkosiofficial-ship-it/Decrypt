.class public abstract LB/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LB/D;Lx7/l;LV/n;I)Lx7/a;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)"

    const v2, -0x147cff54

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    new-instance p3, Landroidx/compose/foundation/lazy/a;

    invoke-direct {p3}, Landroidx/compose/foundation/lazy/a;-><init>()V

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object v0

    new-instance v1, LB/o$b;

    invoke-direct {v1, p1}, LB/o$b;-><init>(LV/G1;)V

    invoke-static {v0, v1}, LV/v1;->d(LV/u1;Lx7/a;)LV/G1;

    move-result-object p1

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object v0

    new-instance v1, LB/o$c;

    invoke-direct {v1, p1, p0, p3}, LB/o$c;-><init>(LV/G1;LB/D;Landroidx/compose/foundation/lazy/a;)V

    invoke-static {v0, v1}, LV/v1;->d(LV/u1;Lx7/a;)LV/G1;

    move-result-object p0

    new-instance v0, LB/o$a;

    invoke-direct {v0, p0}, LB/o$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LF7/l;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    return-object v0
.end method
