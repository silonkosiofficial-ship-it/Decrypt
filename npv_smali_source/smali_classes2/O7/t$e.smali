.class final LO7/t$e;
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
    .locals 3

    .prologue
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v2, :cond_0

    const-string p0, "what"

    aput-object p0, v0, v1

    goto :goto_0

    :cond_0
    const-string p0, "from"

    aput-object p0, v0, v1

    :goto_0
    const-string p0, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2"

    aput-object p0, v0, v2

    const/4 p0, 0x2

    const-string v1, "isVisible"

    aput-object v1, v0, p0

    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public e(Lz8/g;LO7/q;LO7/m;Z)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-static {v0}, LO7/t$e;->g(I)V

    :cond_0
    const/4 v1, 0x1

    if-nez p3, :cond_1

    invoke-static {v1}, LO7/t$e;->g(I)V

    :cond_1
    sget-object v2, LO7/t;->a:LO7/u;

    invoke-virtual {v2, p1, p2, p3, p4}, LO7/u;->e(Lz8/g;LO7/q;LO7/m;Z)Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, LO7/t;->n:Lz8/g;

    if-ne p1, p3, :cond_2

    return v1

    :cond_2
    invoke-static {}, LO7/t;->b()Lz8/g;

    move-result-object p3

    if-ne p1, p3, :cond_3

    return v0

    :cond_3
    const-class p3, LO7/e;

    invoke-static {p2, p3}, Lr8/f;->q(LO7/m;Ljava/lang/Class;)LO7/m;

    move-result-object p2

    if-eqz p2, :cond_4

    instance-of p3, p1, Lz8/h;

    if-eqz p3, :cond_4

    check-cast p1, Lz8/h;

    invoke-interface {p1}, Lz8/h;->v()LO7/e;

    move-result-object p1

    invoke-interface {p1}, LO7/e;->a()LO7/e;

    move-result-object p1

    invoke-interface {p2}, LO7/m;->a()LO7/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    return v0
.end method
