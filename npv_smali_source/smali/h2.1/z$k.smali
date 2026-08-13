.class final Lh2/z$k;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;->E(LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lh2/z;


# direct methods
.method constructor <init>(Lh2/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$k;->H:Lh2/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    const/4 v0, 0x1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lh2/z$k;->G:I

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$k;->H:Lh2/z;

    invoke-static {p1}, Lh2/z;->e(Lh2/z;)Lh2/m;

    move-result-object p1

    sget-object v2, Lh2/t;->E:Lh2/t;

    invoke-virtual {p1, v2}, Lh2/m;->c(Lh2/t;)LZ8/f;

    move-result-object p1

    iget-object v2, p0, Lh2/z$k;->H:Lh2/z;

    invoke-static {v2}, Lh2/z;->e(Lh2/z;)Lh2/m;

    move-result-object v2

    sget-object v4, Lh2/t;->D:Lh2/t;

    invoke-virtual {v2, v4}, Lh2/m;->c(Lh2/t;)LZ8/f;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [LZ8/f;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    aput-object v2, v4, v0

    invoke-static {v4}, LZ8/h;->E([LZ8/f;)LZ8/f;

    move-result-object p1

    new-instance v2, Lh2/z$k$a;

    iget-object v4, p0, Lh2/z$k;->H:Lh2/z;

    invoke-direct {v2, v4, v3}, Lh2/z$k$a;-><init>(Lh2/z;Lm7/e;)V

    iput v0, p0, Lh2/z$k;->G:I

    invoke-static {p1, v2, p0}, LZ8/h;->w(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lh2/Z;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lh2/z$k;->H:Lh2/z;

    sget-object v1, Lh2/K;->a:Lh2/K;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lh2/K;->a(I)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Jump triggered on PagingSource "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lh2/z;->v()Lh2/L;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " by "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v3}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lh2/z$k;->H:Lh2/z;

    invoke-static {p1}, Lh2/z;->f(Lh2/z;)Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/z$k;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/z$k;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/z$k;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/z$k;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, Lh2/z$k;

    iget-object v0, p0, Lh2/z$k;->H:Lh2/z;

    invoke-direct {p1, v0, p2}, Lh2/z$k;-><init>(Lh2/z;Lm7/e;)V

    return-object p1
.end method
