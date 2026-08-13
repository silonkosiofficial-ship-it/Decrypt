.class final LJ6/k$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ6/k;->b(LC6/c;Lx7/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lx7/q;

.field final synthetic K:LC6/c;


# direct methods
.method constructor <init>(Lx7/q;LC6/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LJ6/k$b;->J:Lx7/q;

    iput-object p2, p0, LJ6/k$b;->K:LC6/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ6/k$b;->G:I

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

    iget-object p1, p0, LJ6/k$b;->H:Ljava/lang/Object;

    check-cast p1, LI6/S;

    iget-object v1, p0, LJ6/k$b;->I:Ljava/lang/Object;

    check-cast v1, LO6/d;

    iget-object v3, p0, LJ6/k$b;->J:Lx7/q;

    new-instance v4, LJ6/k$a;

    iget-object v5, p0, LJ6/k$b;->K:LC6/c;

    invoke-virtual {v5}, LC6/c;->getCoroutineContext()Lm7/i;

    move-result-object v5

    invoke-direct {v4, p1, v5}, LJ6/k$a;-><init>(LI6/S;Lm7/i;)V

    const/4 p1, 0x0

    iput-object p1, p0, LJ6/k$b;->H:Ljava/lang/Object;

    iput v2, p0, LJ6/k$b;->G:I

    invoke-interface {v3, v4, v1, p0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(LI6/S;LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LJ6/k$b;

    iget-object v1, p0, LJ6/k$b;->J:Lx7/q;

    iget-object v2, p0, LJ6/k$b;->K:LC6/c;

    invoke-direct {v0, v1, v2, p3}, LJ6/k$b;-><init>(Lx7/q;LC6/c;Lm7/e;)V

    iput-object p1, v0, LJ6/k$b;->H:Ljava/lang/Object;

    iput-object p2, v0, LJ6/k$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LJ6/k$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI6/S;

    check-cast p2, LO6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LJ6/k$b;->H(LI6/S;LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
