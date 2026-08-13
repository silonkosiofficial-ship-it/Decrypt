.class final LZ8/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/C;


# instance fields
.field private final C:LZ8/C;

.field private final D:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/C;Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ8/T;->C:LZ8/C;

    iput-object p2, p0, LZ8/T;->D:Lx7/p;

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LZ8/T$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/T$a;

    iget v1, v0, LZ8/T$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/T$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/T$a;

    invoke-direct {v0, p0, p2}, LZ8/T$a;-><init>(LZ8/T;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/T$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/T$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LZ8/T;->C:LZ8/C;

    new-instance v2, LZ8/S;

    iget-object v4, p0, LZ8/T;->D:Lx7/p;

    invoke-direct {v2, p1, v4}, LZ8/S;-><init>(LZ8/g;Lx7/p;)V

    iput v3, v0, LZ8/T$a;->H:I

    invoke-interface {p2, v2, v0}, LZ8/C;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LZ8/T;->C:LZ8/C;

    invoke-interface {v0}, LZ8/C;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
