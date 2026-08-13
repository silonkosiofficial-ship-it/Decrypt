.class final Lx/D$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/D;->h(Lz0/K;Lx7/q;Lx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lz0/K;

.field final synthetic J:Lx7/q;

.field final synthetic K:Lx7/l;

.field final synthetic L:Lx/u;


# direct methods
.method constructor <init>(Lz0/K;Lx7/q;Lx7/l;Lx/u;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/D$e;->I:Lz0/K;

    iput-object p2, p0, Lx/D$e;->J:Lx7/q;

    iput-object p3, p0, Lx/D$e;->K:Lx7/l;

    iput-object p4, p0, Lx/D$e;->L:Lx/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/D$e;->G:I

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

    iget-object p1, p0, Lx/D$e;->H:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LW8/N;

    iget-object p1, p0, Lx/D$e;->I:Lz0/K;

    new-instance v1, Lx/D$e$a;

    iget-object v5, p0, Lx/D$e;->J:Lx7/q;

    iget-object v6, p0, Lx/D$e;->K:Lx7/l;

    iget-object v7, p0, Lx/D$e;->L:Lx/u;

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lx/D$e$a;-><init>(LW8/N;Lx7/q;Lx7/l;Lx/u;Lm7/e;)V

    iput v2, p0, Lx/D$e;->G:I

    invoke-static {p1, v1, p0}, Lx/q;->c(Lz0/K;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/D$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/D$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/D$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/D$e;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lx/D$e;

    iget-object v1, p0, Lx/D$e;->I:Lz0/K;

    iget-object v2, p0, Lx/D$e;->J:Lx7/q;

    iget-object v3, p0, Lx/D$e;->K:Lx7/l;

    iget-object v4, p0, Lx/D$e;->L:Lx/u;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lx/D$e;-><init>(Lz0/K;Lx7/q;Lx7/l;Lx/u;Lm7/e;)V

    iput-object p1, v6, Lx/D$e;->H:Ljava/lang/Object;

    return-object v6
.end method
