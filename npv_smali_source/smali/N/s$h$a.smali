.class final LN/s$h$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/s$h;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LN/s$h$a;->G:Lx7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/s$h$a;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LN/s$h$a;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LN/s$h$a;->F:Ljava/lang/Object;

    check-cast p1, Lz0/c;

    move-object v1, p1

    :goto_0
    sget-object p1, Lz0/r;->C:Lz0/r;

    iput-object v1, p0, LN/s$h$a;->F:Ljava/lang/Object;

    iput v2, p0, LN/s$h$a;->E:I

    invoke-interface {v1, p1, p0}, Lz0/c;->X0(Lz0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    check-cast p1, Lz0/p;

    iget-object v3, p0, LN/s$h$a;->G:Lx7/l;

    invoke-static {p1}, LN/s;->g(Lz0/p;)Z

    move-result p1

    xor-int/2addr p1, v2

    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/s$h$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LN/s$h$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LN/s$h$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LN/s$h$a;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LN/s$h$a;

    iget-object v1, p0, LN/s$h$a;->G:Lx7/l;

    invoke-direct {v0, v1, p2}, LN/s$h$a;-><init>(Lx7/l;Lm7/e;)V

    iput-object p1, v0, LN/s$h$a;->F:Ljava/lang/Object;

    return-object v0
.end method
