.class final Lh2/k$c$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/k$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/q;

.field final synthetic J:Lh2/e;


# direct methods
.method constructor <init>(Lx7/q;Lh2/e;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/k$c$a;->I:Lx7/q;

    iput-object p2, p0, Lh2/k$c$a;->J:Lh2/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/k$c$a;->G:I

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

    iget-object p1, p0, Lh2/k$c$a;->H:Ljava/lang/Object;

    iget-object v1, p0, Lh2/k$c$a;->I:Lx7/q;

    iget-object v3, p0, Lh2/k$c$a;->J:Lh2/e;

    iput v2, p0, Lh2/k$c$a;->G:I

    invoke-interface {v1, v3, p1, p0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/k$c$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/k$c$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/k$c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/k$c$a;->H(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lh2/k$c$a;

    iget-object v1, p0, Lh2/k$c$a;->I:Lx7/q;

    iget-object v2, p0, Lh2/k$c$a;->J:Lh2/e;

    invoke-direct {v0, v1, v2, p2}, Lh2/k$c$a;-><init>(Lx7/q;Lh2/e;Lm7/e;)V

    iput-object p1, v0, Lh2/k$c$a;->H:Ljava/lang/Object;

    return-object v0
.end method
