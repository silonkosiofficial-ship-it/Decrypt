.class final LO7/t$f;
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
    .locals 6

    .prologue
    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq p0, v2, :cond_2

    if-eq p0, v4, :cond_1

    if-eq p0, v0, :cond_0

    const-string v5, "what"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_0
    const-string v5, "fromClass"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_1
    const-string v5, "whatDeclaration"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_2
    const-string v5, "from"

    aput-object v5, v1, v3

    :goto_0
    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"

    aput-object v3, v1, v2

    if-eq p0, v4, :cond_3

    if-eq p0, v0, :cond_3

    const-string p0, "isVisible"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_3
    const-string p0, "doesReceiverFitForProtectedVisibility"

    aput-object p0, v1, v4

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h(Lz8/g;LO7/q;LO7/e;)Z
    .locals 3

    .prologue
    if-nez p2, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LO7/t$f;->g(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, LO7/t$f;->g(I)V

    :cond_1
    sget-object v0, LO7/t;->o:Lz8/g;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    return v1

    :cond_2
    instance-of v0, p2, LO7/b;

    const/4 v2, 0x1

    if-nez v0, :cond_3

    return v2

    :cond_3
    instance-of p2, p2, LO7/l;

    if-eqz p2, :cond_4

    return v2

    :cond_4
    sget-object p2, LO7/t;->n:Lz8/g;

    if-ne p1, p2, :cond_5

    return v2

    :cond_5
    invoke-static {}, LO7/t;->b()Lz8/g;

    move-result-object p2

    if-eq p1, p2, :cond_8

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {p1}, Lz8/g;->getType()LF8/E;

    move-result-object p1

    invoke-static {p1, p3}, Lr8/f;->I(LF8/E;LO7/m;)Z

    move-result p2

    if-nez p2, :cond_7

    invoke-static {p1}, LF8/u;->a(LF8/E;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    :goto_0
    return v1
.end method


# virtual methods
.method public e(Lz8/g;LO7/q;LO7/m;Z)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-static {v0}, LO7/t$f;->g(I)V

    :cond_0
    const/4 v1, 0x1

    if-nez p3, :cond_1

    invoke-static {v1}, LO7/t$f;->g(I)V

    :cond_1
    const-class v2, LO7/e;

    invoke-static {p2, v2}, Lr8/f;->q(LO7/m;Ljava/lang/Class;)LO7/m;

    move-result-object v3

    check-cast v3, LO7/e;

    invoke-static {p3, v2, v0}, Lr8/f;->r(LO7/m;Ljava/lang/Class;Z)LO7/m;

    move-result-object p3

    check-cast p3, LO7/e;

    if-nez p3, :cond_2

    return v0

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v3}, Lr8/f;->x(LO7/m;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v3, v2}, Lr8/f;->q(LO7/m;Ljava/lang/Class;)LO7/m;

    move-result-object v3

    check-cast v3, LO7/e;

    if-eqz v3, :cond_3

    invoke-static {p3, v3}, Lr8/f;->H(LO7/e;LO7/e;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v1

    :cond_3
    invoke-static {p2}, Lr8/f;->M(LO7/q;)LO7/q;

    move-result-object v3

    invoke-static {v3, v2}, Lr8/f;->q(LO7/m;Ljava/lang/Class;)LO7/m;

    move-result-object v2

    check-cast v2, LO7/e;

    if-nez v2, :cond_4

    return v0

    :cond_4
    invoke-static {p3, v2}, Lr8/f;->H(LO7/e;LO7/e;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0, p1, v3, p3}, LO7/t$f;->h(Lz8/g;LO7/q;LO7/e;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    invoke-interface {p3}, LO7/e;->b()LO7/m;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p4}, LO7/t$f;->e(Lz8/g;LO7/q;LO7/m;Z)Z

    move-result p1

    return p1
.end method
