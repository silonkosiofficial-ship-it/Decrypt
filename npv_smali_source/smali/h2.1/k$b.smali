.class final Lh2/k$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/k;->c(LZ8/f;Ljava/lang/Object;Lx7/q;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Ljava/lang/Object;

.field final synthetic K:LZ8/f;

.field final synthetic L:Lx7/q;


# direct methods
.method constructor <init>(Ljava/lang/Object;LZ8/f;Lx7/q;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/k$b;->J:Ljava/lang/Object;

    iput-object p2, p0, Lh2/k$b;->K:LZ8/f;

    iput-object p3, p0, Lh2/k$b;->L:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/k$b;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh2/k$b;->G:Ljava/lang/Object;

    check-cast v1, Ly7/O;

    iget-object v3, p0, Lh2/k$b;->I:Ljava/lang/Object;

    check-cast v3, LZ8/g;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/k$b;->I:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    iget-object v4, p0, Lh2/k$b;->J:Ljava/lang/Object;

    iput-object v4, v1, Ly7/O;->C:Ljava/lang/Object;

    iput-object p1, p0, Lh2/k$b;->I:Ljava/lang/Object;

    iput-object v1, p0, Lh2/k$b;->G:Ljava/lang/Object;

    iput v3, p0, Lh2/k$b;->H:I

    invoke-interface {p1, v4, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, p1

    :goto_0
    iget-object p1, p0, Lh2/k$b;->K:LZ8/f;

    new-instance v4, Lh2/k$b$a;

    iget-object v5, p0, Lh2/k$b;->L:Lx7/q;

    invoke-direct {v4, v1, v5, v3}, Lh2/k$b$a;-><init>(Ly7/O;Lx7/q;LZ8/g;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lh2/k$b;->I:Ljava/lang/Object;

    iput-object v1, p0, Lh2/k$b;->G:Ljava/lang/Object;

    iput v2, p0, Lh2/k$b;->H:I

    invoke-interface {p1, v4, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/k$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/k$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/k$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/k$b;->H(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lh2/k$b;

    iget-object v1, p0, Lh2/k$b;->J:Ljava/lang/Object;

    iget-object v2, p0, Lh2/k$b;->K:LZ8/f;

    iget-object v3, p0, Lh2/k$b;->L:Lx7/q;

    invoke-direct {v0, v1, v2, v3, p2}, Lh2/k$b;-><init>(Ljava/lang/Object;LZ8/f;Lx7/q;Lm7/e;)V

    iput-object p1, v0, Lh2/k$b;->I:Ljava/lang/Object;

    return-object v0
.end method
