.class public final LM1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LZ8/y;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LM1/z;->b:LM1/z;

    const-string v1, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v0

    iput-object v0, p0, LM1/k;->a:LZ8/y;

    return-void
.end method


# virtual methods
.method public final a()LM1/v;
    .locals 1

    iget-object v0, p0, LM1/k;->a:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM1/v;

    return-object v0
.end method

.method public final b()LZ8/f;
    .locals 1

    iget-object v0, p0, LM1/k;->a:LZ8/y;

    return-object v0
.end method

.method public final c(LM1/v;)LM1/v;
    .locals 5

    .prologue
    const-string v0, "newState"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/k;->a:LZ8/y;

    :cond_0
    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LM1/v;

    instance-of v3, v2, LM1/q;

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v3, LM1/z;->b:LM1/z;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    instance-of v3, v2, LM1/e;

    if-eqz v3, :cond_3

    invoke-virtual {p1}, LM1/v;->a()I

    move-result v3

    invoke-virtual {v2}, LM1/v;->a()I

    move-result v4

    if-le v3, v4, :cond_4

    :goto_1
    move-object v2, p1

    goto :goto_2

    :cond_3
    instance-of v3, v2, LM1/l;

    if-eqz v3, :cond_5

    :cond_4
    :goto_2
    invoke-interface {v0, v1, v2}, LZ8/y;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v2

    :cond_5
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method
