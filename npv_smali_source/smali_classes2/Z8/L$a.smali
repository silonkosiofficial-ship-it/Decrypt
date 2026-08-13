.class final LZ8/L$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/L;->a(LZ8/N;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LZ8/N;


# direct methods
.method constructor <init>(LZ8/N;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LZ8/L$a;->I:LZ8/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LZ8/L$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LZ8/L$a;->H:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    new-instance v1, Ly7/K;

    invoke-direct {v1}, Ly7/K;-><init>()V

    iget-object v3, p0, LZ8/L$a;->I:LZ8/N;

    new-instance v4, LZ8/L$a$a;

    invoke-direct {v4, v1, p1}, LZ8/L$a$a;-><init>(Ly7/K;LZ8/g;)V

    iput v2, p0, LZ8/L$a;->G:I

    invoke-interface {v3, v4, p0}, LZ8/C;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZ8/L$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LZ8/L$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LZ8/L$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LZ8/L$a;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LZ8/L$a;

    iget-object v1, p0, LZ8/L$a;->I:LZ8/N;

    invoke-direct {v0, v1, p2}, LZ8/L$a;-><init>(LZ8/N;Lm7/e;)V

    iput-object p1, v0, LZ8/L$a;->H:Ljava/lang/Object;

    return-object v0
.end method
