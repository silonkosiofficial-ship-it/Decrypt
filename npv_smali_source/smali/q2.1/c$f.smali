.class final Lq2/c$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq2/c;->a(ZLx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lx7/p;

.field final synthetic I:Ly7/O;


# direct methods
.method constructor <init>(Lx7/p;Ly7/O;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lq2/c$f;->H:Lx7/p;

    iput-object p2, p0, Lq2/c$f;->I:Ly7/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq2/c$f;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq2/c$f;->H:Lx7/p;

    iget-object v1, p0, Lq2/c$f;->I:Ly7/O;

    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    iput v2, p0, Lq2/c$f;->G:I

    invoke-interface {p1, v1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq2/c$f;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lq2/c$f;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lq2/c$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lq2/c$f;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, Lq2/c$f;

    iget-object v0, p0, Lq2/c$f;->H:Lx7/p;

    iget-object v1, p0, Lq2/c$f;->I:Ly7/O;

    invoke-direct {p1, v0, v1, p2}, Lq2/c$f;-><init>(Lx7/p;Ly7/O;Lm7/e;)V

    return-object p1
.end method
