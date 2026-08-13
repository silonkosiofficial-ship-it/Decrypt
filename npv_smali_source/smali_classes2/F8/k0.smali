.class public LF8/k0;
.super LF8/j0;
.source "SourceFile"


# instance fields
.field private final a:LF8/u0;

.field private final b:LF8/E;


# direct methods
.method public constructor <init>(LF8/E;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LF8/k0;->c(I)V

    :cond_0
    sget-object v0, LF8/u0;->G:LF8/u0;

    invoke-direct {p0, v0, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-void
.end method

.method public constructor <init>(LF8/u0;LF8/E;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LF8/k0;->c(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LF8/k0;->c(I)V

    :cond_1
    invoke-direct {p0}, LF8/j0;-><init>()V

    iput-object p1, p0, LF8/k0;->a:LF8/u0;

    iput-object p2, p0, LF8/k0;->b:LF8/E;

    return-void
.end method

.method private static synthetic c(I)V
    .locals 9

    .prologue
    const/4 v0, 0x5

    const/4 v1, 0x4

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v8, "projection"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_0
    const-string v8, "kotlinTypeRefiner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "type"

    aput-object v8, v5, v7

    :goto_2
    const/4 v7, 0x1

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v7

    goto :goto_3

    :cond_2
    const-string v6, "getType"

    aput-object v6, v5, v7

    goto :goto_3

    :cond_3
    const-string v6, "getProjectionKind"

    aput-object v6, v5, v7

    :goto_3
    if-eq p0, v3, :cond_5

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    const/4 v3, 0x6

    if-eq p0, v3, :cond_4

    const-string v3, "<init>"

    aput-object v3, v5, v4

    goto :goto_4

    :cond_4
    const-string v3, "refine"

    aput-object v3, v5, v4

    goto :goto_4

    :cond_5
    const-string v3, "replaceType"

    aput-object v3, v5, v4

    :cond_6
    :goto_4
    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()LF8/u0;
    .locals 2

    .prologue
    iget-object v0, p0, LF8/k0;->a:LF8/u0;

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, LF8/k0;->c(I)V

    :cond_0
    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getType()LF8/E;
    .locals 2

    .prologue
    iget-object v0, p0, LF8/k0;->b:LF8/E;

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LF8/k0;->c(I)V

    :cond_0
    return-object v0
.end method

.method public v(LG8/g;)LF8/i0;
    .locals 3

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LF8/k0;->c(I)V

    :cond_0
    new-instance v0, LF8/k0;

    iget-object v1, p0, LF8/k0;->a:LF8/u0;

    iget-object v2, p0, LF8/k0;->b:LF8/E;

    invoke-virtual {p1, v2}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object v0
.end method
