.class final LN/s$h;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/s;->k(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LN/s$h;->I:Lx7/l;

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

    iget v1, p0, LN/s$h;->G:I

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

    iget-object p1, p0, LN/s$h;->H:Ljava/lang/Object;

    check-cast p1, Lz0/K;

    new-instance v1, LN/s$h$a;

    iget-object v3, p0, LN/s$h;->I:Lx7/l;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LN/s$h$a;-><init>(Lx7/l;Lm7/e;)V

    iput v2, p0, LN/s$h;->G:I

    invoke-interface {p1, v1, p0}, Lz0/K;->V(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lz0/K;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/s$h;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LN/s$h;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LN/s$h;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/K;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LN/s$h;->H(Lz0/K;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LN/s$h;

    iget-object v1, p0, LN/s$h;->I:Lx7/l;

    invoke-direct {v0, v1, p2}, LN/s$h;-><init>(Lx7/l;Lm7/e;)V

    iput-object p1, v0, LN/s$h;->H:Ljava/lang/Object;

    return-object v0
.end method
