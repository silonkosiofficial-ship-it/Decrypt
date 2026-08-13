.class public abstract LV/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/P0;Lx7/p;LV/n;I)V
    .locals 3

    .prologue
    const v0, -0x50862cb8

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LV/n;->c(LV/P0;)V

    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LV/n;->O()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance v0, LV/y$b;

    invoke-direct {v0, p0, p1, p3}, LV/y$b;-><init>(LV/P0;Lx7/p;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_2
    return-void
.end method

.method public static final b([LV/P0;Lx7/p;LV/n;I)V
    .locals 3

    .prologue
    const v0, -0x52e5dee3

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LV/n;->I([LV/P0;)V

    shr-int/lit8 v0, p3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LV/n;->E()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance v0, LV/y$a;

    invoke-direct {v0, p0, p1, p3}, LV/y$a;-><init>([LV/P0;Lx7/p;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_2
    return-void
.end method

.method public static final c(LV/u1;Lx7/a;)LV/O0;
    .locals 1

    new-instance v0, LV/O;

    invoke-direct {v0, p0, p1}, LV/O;-><init>(LV/u1;Lx7/a;)V

    return-object v0
.end method

.method public static synthetic d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, LV/v1;->p()LV/u1;

    move-result-object p0

    :cond_0
    invoke-static {p0, p1}, LV/y;->c(LV/u1;Lx7/a;)LV/O0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lx7/l;)LV/O0;
    .locals 1

    new-instance v0, LV/E;

    invoke-direct {v0, p0}, LV/E;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public static final f(Lx7/a;)LV/O0;
    .locals 1

    new-instance v0, LV/H1;

    invoke-direct {v0, p0}, LV/H1;-><init>(Lx7/a;)V

    return-object v0
.end method
