.class abstract synthetic LV/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)LV/G1;
    .locals 4

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.produceState (ProduceState.kt:146)"

    const v2, -0x65844c3d

    invoke-static {v2, p5, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x2

    invoke-static {p0, v3, v0, v3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {p4, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LV/w0;

    invoke-interface {p4, p3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez p0, :cond_2

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne v2, p0, :cond_3

    :cond_2
    new-instance v2, LV/x1$b;

    invoke-direct {v2, p3, v0, v3}, LV/x1$b;-><init>(Lx7/p;LV/w0;Lm7/e;)V

    invoke-interface {p4, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lx7/p;

    shr-int/lit8 p0, p5, 0x3

    and-int/lit8 p0, p0, 0x7e

    invoke-static {p1, p2, v2, p4, p0}, LV/Q;->d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object v0
.end method

.method public static final b(Ljava/lang/Object;Lx7/p;LV/n;I)LV/G1;
    .locals 4

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.produceState (ProduceState.kt:79)"

    const v2, 0x9f8503

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne p3, v1, :cond_1

    const/4 p3, 0x2

    invoke-static {p0, v2, p3, v2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p3, LV/w0;

    sget-object p0, Li7/M;->a:Li7/M;

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_3

    :cond_2
    new-instance v3, LV/x1$a;

    invoke-direct {v3, p1, p3, v2}, LV/x1$a;-><init>(Lx7/p;LV/w0;Lm7/e;)V

    invoke-interface {p2, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lx7/p;

    const/4 p1, 0x6

    invoke-static {p0, v3, p2, p1}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object p3
.end method
