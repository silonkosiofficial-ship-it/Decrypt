.class public abstract LF8/b;
.super LF8/f;
.source "SourceFile"

# interfaces
.implements LF8/e0;


# direct methods
.method public constructor <init>(LE8/n;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LF8/b;->p(I)V

    :cond_0
    invoke-direct {p0, p1}, LF8/f;-><init>(LE8/n;)V

    return-void
.end method

.method private static synthetic p(I)V
    .locals 9

    .prologue
    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v5, v1

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"

    const/4 v7, 0x0

    if-eq p0, v2, :cond_3

    if-eq p0, v4, :cond_2

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_3

    const-string v8, "storageManager"

    aput-object v8, v5, v7

    goto :goto_2

    :cond_2
    const-string v8, "classifier"

    aput-object v8, v5, v7

    goto :goto_2

    :cond_3
    aput-object v6, v5, v7

    :goto_2
    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    aput-object v6, v5, v2

    goto :goto_3

    :cond_4
    const-string v6, "getAdditionalNeighboursInSupertypeGraph"

    aput-object v6, v5, v2

    goto :goto_3

    :cond_5
    const-string v6, "getBuiltIns"

    aput-object v6, v5, v2

    :goto_3
    if-eq p0, v2, :cond_7

    if-eq p0, v4, :cond_6

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    const-string v6, "<init>"

    aput-object v6, v5, v4

    goto :goto_4

    :cond_6
    const-string v6, "isSameClassifier"

    aput-object v6, v5, v4

    :cond_7
    :goto_4
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_8

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0
.end method


# virtual methods
.method protected d(LO7/h;)Z
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LF8/b;->p(I)V

    :cond_0
    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LF8/b;->q()LO7/e;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LF8/l;->b(LO7/h;LO7/h;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected h()LF8/E;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF8/b;->q()LO7/e;

    move-result-object v0

    invoke-static {v0}, LL7/g;->u0(LO7/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LF8/b;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->i()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method protected i(Z)Ljava/util/Collection;
    .locals 3

    .prologue
    invoke-virtual {p0}, LF8/b;->q()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    if-nez v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, LF8/b;->p(I)V

    :cond_0
    return-object p1

    :cond_1
    new-instance v1, LP8/f;

    invoke-direct {v1}, LP8/f;-><init>()V

    check-cast v0, LO7/e;

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, LO7/e;->a0()LO7/e;

    move-result-object v0

    if-eqz p1, :cond_2

    if-eqz v0, :cond_2

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v1
.end method

.method public abstract q()LO7/e;
.end method

.method public t()LL7/g;
    .locals 2

    .prologue
    invoke-virtual {p0}, LF8/b;->q()LO7/e;

    move-result-object v0

    invoke-static {v0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, LF8/b;->p(I)V

    :cond_0
    return-object v0
.end method
