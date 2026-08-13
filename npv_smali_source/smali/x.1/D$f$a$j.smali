.class final Lx/D$f$a$j;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/D$f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:LW8/N;

.field final synthetic H:Lx7/l;

.field final synthetic I:Lx7/l;

.field final synthetic J:Ly7/O;

.field final synthetic K:Lx/u;


# direct methods
.method constructor <init>(LW8/N;Lx7/l;Lx7/l;Ly7/O;Lx/u;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/D$f$a$j;->G:LW8/N;

    iput-object p2, p0, Lx/D$f$a$j;->H:Lx7/l;

    iput-object p3, p0, Lx/D$f$a$j;->I:Lx7/l;

    iput-object p4, p0, Lx/D$f$a$j;->J:Ly7/O;

    iput-object p5, p0, Lx/D$f$a$j;->K:Lx/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/D$f$a$j;->E:I

    const/4 v2, 0x1

    const/4 v3, 0x0

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

    iget-object p1, p0, Lx/D$f$a$j;->F:Ljava/lang/Object;

    check-cast p1, Lz0/c;

    iput v2, p0, Lx/D$f$a$j;->E:I

    invoke-static {p1, v3, p0, v2, v3}, Lx/D;->l(Lz0/c;Lz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lz0/B;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lz0/B;->a()V

    iget-object v4, p0, Lx/D$f$a$j;->G:LW8/N;

    new-instance v7, Lx/D$f$a$j$a;

    iget-object v0, p0, Lx/D$f$a$j;->K:Lx/u;

    invoke-direct {v7, v0, v3}, Lx/D$f$a$j$a;-><init>(Lx/u;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object v0, p0, Lx/D$f$a$j;->H:Lx7/l;

    invoke-virtual {p1}, Lz0/B;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object v3, Li7/M;->a:Li7/M;

    goto :goto_2

    :cond_3
    iget-object v4, p0, Lx/D$f$a$j;->G:LW8/N;

    new-instance v7, Lx/D$f$a$j$b;

    iget-object p1, p0, Lx/D$f$a$j;->K:Lx/u;

    invoke-direct {v7, p1, v3}, Lx/D$f$a$j$b;-><init>(Lx/u;Lm7/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object p1, p0, Lx/D$f$a$j;->I:Lx7/l;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lx/D$f$a$j;->J:Ly7/O;

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, Lz0/B;

    invoke-virtual {v0}, Lz0/B;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    :goto_2
    return-object v3
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/D$f$a$j;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/D$f$a$j;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/D$f$a$j;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/D$f$a$j;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 8

    new-instance v7, Lx/D$f$a$j;

    iget-object v1, p0, Lx/D$f$a$j;->G:LW8/N;

    iget-object v2, p0, Lx/D$f$a$j;->H:Lx7/l;

    iget-object v3, p0, Lx/D$f$a$j;->I:Lx7/l;

    iget-object v4, p0, Lx/D$f$a$j;->J:Ly7/O;

    iget-object v5, p0, Lx/D$f$a$j;->K:Lx/u;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lx/D$f$a$j;-><init>(LW8/N;Lx7/l;Lx7/l;Ly7/O;Lx/u;Lm7/e;)V

    iput-object p1, v7, Lx/D$f$a$j;->F:Ljava/lang/Object;

    return-object v7
.end method
