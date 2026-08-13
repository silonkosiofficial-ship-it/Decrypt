.class public abstract LC/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC/K;Lx7/l;LV/n;I)Lx7/a;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)"

    const v2, -0x7125daea

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
    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object p3

    new-instance v0, LC/n$b;

    invoke-direct {v0, p1}, LC/n$b;-><init>(LV/G1;)V

    invoke-static {p3, v0}, LV/v1;->d(LV/u1;Lx7/a;)LV/G1;

    move-result-object p1

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object p3

    new-instance v0, LC/n$c;

    invoke-direct {v0, p1, p0}, LC/n$c;-><init>(LV/G1;LC/K;)V

    invoke-static {p3, v0}, LV/v1;->d(LV/u1;Lx7/a;)LV/G1;

    move-result-object p0

    new-instance v0, LC/n$a;

    invoke-direct {v0, p0}, LC/n$a;-><init>(Ljava/lang/Object;)V

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
