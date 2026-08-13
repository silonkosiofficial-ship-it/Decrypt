.class final LO7/t$d;
.super LO7/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(LO7/n0;)V
    .locals 0

    invoke-direct {p0, p1}, LO7/r;-><init>(LO7/n0;)V

    return-void
.end method

.method private static synthetic g(I)V
    .locals 5

    .prologue
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v3, :cond_0

    const-string v4, "descriptor"

    aput-object v4, v0, v1

    goto :goto_0

    :cond_0
    const-string v4, "from"

    aput-object v4, v0, v1

    goto :goto_0

    :cond_1
    const-string v4, "what"

    aput-object v4, v0, v1

    :goto_0
    const-string v1, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1"

    aput-object v1, v0, v2

    if-eq p0, v2, :cond_2

    if-eq p0, v3, :cond_2

    const-string p0, "hasContainingSourceFile"

    aput-object p0, v0, v3

    goto :goto_1

    :cond_2
    const-string p0, "isVisible"

    aput-object p0, v0, v3

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h(LO7/m;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, LO7/t$d;->g(I)V

    :cond_0
    invoke-static {p1}, Lr8/f;->j(LO7/m;)LO7/b0;

    move-result-object p1

    sget-object v1, LO7/b0;->a:LO7/b0;

    if-eq p1, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public e(Lz8/g;LO7/q;LO7/m;Z)Z
    .locals 2

    .prologue
    const/4 p1, 0x1

    if-nez p2, :cond_0

    invoke-static {p1}, LO7/t$d;->g(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, LO7/t$d;->g(I)V

    :cond_1
    invoke-static {p2}, Lr8/f;->J(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p3}, LO7/t$d;->h(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2, p3}, LO7/t;->f(LO7/m;LO7/m;)Z

    move-result p1

    return p1

    :cond_2
    instance-of v0, p2, LO7/l;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, LO7/l;

    invoke-interface {v0}, LO7/l;->b()LO7/i;

    move-result-object v0

    if-eqz p4, :cond_3

    invoke-static {v0}, Lr8/f;->G(LO7/m;)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-static {v0}, Lr8/f;->J(LO7/m;)Z

    move-result p4

    if-eqz p4, :cond_3

    instance-of p4, p3, LO7/l;

    if-eqz p4, :cond_3

    invoke-interface {p3}, LO7/m;->b()LO7/m;

    move-result-object p4

    invoke-static {p4}, Lr8/f;->J(LO7/m;)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-static {p2, p3}, LO7/t;->f(LO7/m;LO7/m;)Z

    move-result p4

    if-eqz p4, :cond_3

    return p1

    :cond_3
    if-eqz p2, :cond_5

    invoke-interface {p2}, LO7/m;->b()LO7/m;

    move-result-object p2

    instance-of p4, p2, LO7/e;

    if-eqz p4, :cond_4

    invoke-static {p2}, Lr8/f;->x(LO7/m;)Z

    move-result p4

    if-eqz p4, :cond_5

    :cond_4
    instance-of p4, p2, LO7/K;

    if-eqz p4, :cond_3

    :cond_5
    const/4 p4, 0x0

    if-nez p2, :cond_6

    return p4

    :cond_6
    :goto_0
    if-eqz p3, :cond_a

    if-ne p2, p3, :cond_7

    return p1

    :cond_7
    instance-of v0, p3, LO7/K;

    if-eqz v0, :cond_9

    instance-of v0, p2, LO7/K;

    if-eqz v0, :cond_8

    move-object v0, p2

    check-cast v0, LO7/K;

    invoke-interface {v0}, LO7/K;->e()Ln8/c;

    move-result-object v0

    move-object v1, p3

    check-cast v1, LO7/K;

    invoke-interface {v1}, LO7/K;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln8/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p3, p2}, Lr8/f;->b(LO7/m;LO7/m;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_1

    :cond_8
    move p1, p4

    :goto_1
    return p1

    :cond_9
    invoke-interface {p3}, LO7/m;->b()LO7/m;

    move-result-object p3

    goto :goto_0

    :cond_a
    return p4
.end method
