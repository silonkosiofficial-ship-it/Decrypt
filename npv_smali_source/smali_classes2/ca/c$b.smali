.class final Lca/c$b;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/c;->c(Lda/a;)LR8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lda/a;


# direct methods
.method constructor <init>(Lda/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lca/c$b;->I:Lda/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lca/c$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lca/c$b;->F:I

    iget v3, p0, Lca/c$b;->E:I

    iget-object v4, p0, Lca/c$b;->H:Ljava/lang/Object;

    check-cast v4, LR8/j;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lca/c$b;->H:Ljava/lang/Object;

    check-cast p1, LR8/j;

    iget-object v1, p0, Lca/c$b;->I:Lda/a;

    invoke-interface {v1}, Lda/c;->g()Lda/e;

    move-result-object v1

    invoke-interface {v1}, Lda/e;->a()I

    move-result v1

    const/4 v3, 0x0

    move-object v4, p1

    :goto_0
    if-ge v3, v1, :cond_3

    iget-object p1, p0, Lca/c$b;->I:Lda/a;

    invoke-interface {p1}, Lda/c;->g()Lda/e;

    move-result-object p1

    invoke-interface {p1, v3}, Lda/e;->b(I)Lda/c;

    move-result-object p1

    iput-object v4, p0, Lca/c$b;->H:Ljava/lang/Object;

    iput v3, p0, Lca/c$b;->E:I

    iput v1, p0, Lca/c$b;->F:I

    iput v2, p0, Lca/c$b;->G:I

    invoke-virtual {v4, p1, p0}, LR8/j;->b(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    add-int/2addr v3, v2

    goto :goto_0

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final E(LR8/j;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lca/c$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lca/c$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lca/c$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR8/j;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lca/c$b;->E(LR8/j;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lca/c$b;

    iget-object v1, p0, Lca/c$b;->I:Lda/a;

    invoke-direct {v0, v1, p2}, Lca/c$b;-><init>(Lda/a;Lm7/e;)V

    iput-object p1, v0, Lca/c$b;->H:Ljava/lang/Object;

    return-object v0
.end method
