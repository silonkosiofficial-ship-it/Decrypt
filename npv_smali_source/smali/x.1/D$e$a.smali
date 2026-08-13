.class final Lx/D$e$a;
.super Lo7/k;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/D$e;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:LW8/N;

.field final synthetic H:Lx7/q;

.field final synthetic I:Lx7/l;

.field final synthetic J:Lx/u;


# direct methods
.method constructor <init>(LW8/N;Lx7/q;Lx7/l;Lx/u;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lx/D$e$a;->G:LW8/N;

    iput-object p2, p0, Lx/D$e$a;->H:Lx7/q;

    iput-object p3, p0, Lx/D$e$a;->I:Lx7/l;

    iput-object p4, p0, Lx/D$e$a;->J:Lx/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/k;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .prologue
    move-object/from16 v6, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, Lx/D$e$a;->E:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v9, :cond_1

    if-ne v0, v8, :cond_0

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v6, Lx/D$e$a;->F:Ljava/lang/Object;

    check-cast v0, Lz0/c;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v11, v0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v0, v6, Lx/D$e$a;->F:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Lz0/c;

    iget-object v0, v6, Lx/D$e$a;->G:LW8/N;

    new-instance v3, Lx/D$e$a$a;

    iget-object v1, v6, Lx/D$e$a;->J:Lx/u;

    invoke-direct {v3, v1, v10}, Lx/D$e$a$a;-><init>(Lx/u;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iput-object v11, v6, Lx/D$e$a;->F:Ljava/lang/Object;

    iput v9, v6, Lx/D$e$a;->E:I

    const/4 v1, 0x0

    move-object v0, v11

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v5}, Lx/D;->e(Lz0/c;ZLz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    :goto_0
    check-cast v0, Lz0/B;

    invoke-virtual {v0}, Lz0/B;->a()V

    iget-object v1, v6, Lx/D$e$a;->H:Lx7/q;

    invoke-static {}, Lx/D;->c()Lx7/q;

    move-result-object v2

    if-eq v1, v2, :cond_4

    iget-object v12, v6, Lx/D$e$a;->G:LW8/N;

    new-instance v15, Lx/D$e$a$b;

    iget-object v1, v6, Lx/D$e$a;->H:Lx7/q;

    iget-object v2, v6, Lx/D$e$a;->J:Lx/u;

    invoke-direct {v15, v1, v2, v0, v10}, Lx/D$e$a$b;-><init>(Lx7/q;Lx/u;Lz0/B;Lm7/e;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_4
    iput-object v10, v6, Lx/D$e$a;->F:Ljava/lang/Object;

    iput v8, v6, Lx/D$e$a;->E:I

    invoke-static {v11, v10, v6, v9, v10}, Lx/D;->l(Lz0/c;Lz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    return-object v7

    :cond_5
    :goto_1
    check-cast v0, Lz0/B;

    if-nez v0, :cond_6

    iget-object v11, v6, Lx/D$e$a;->G:LW8/N;

    new-instance v14, Lx/D$e$a$c;

    iget-object v0, v6, Lx/D$e$a;->J:Lx/u;

    invoke-direct {v14, v0, v10}, Lx/D$e$a$c;-><init>(Lx/u;Lm7/e;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lz0/B;->a()V

    iget-object v1, v6, Lx/D$e$a;->G:LW8/N;

    new-instance v2, Lx/D$e$a$d;

    iget-object v3, v6, Lx/D$e$a;->J:Lx/u;

    invoke-direct {v2, v3, v10}, Lx/D$e$a$d;-><init>(Lx/u;Lm7/e;)V

    const/16 v21, 0x3

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v1

    move-object/from16 v20, v2

    invoke-static/range {v17 .. v22}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object v1, v6, Lx/D$e$a;->I:Lx7/l;

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lz0/B;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_2
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public final E(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/D$e$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lx/D$e$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/D$e$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lx/D$e$a;->E(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance v6, Lx/D$e$a;

    iget-object v1, p0, Lx/D$e$a;->G:LW8/N;

    iget-object v2, p0, Lx/D$e$a;->H:Lx7/q;

    iget-object v3, p0, Lx/D$e$a;->I:Lx7/l;

    iget-object v4, p0, Lx/D$e$a;->J:Lx/u;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lx/D$e$a;-><init>(LW8/N;Lx7/q;Lx7/l;Lx/u;Lm7/e;)V

    iput-object p1, v6, Lx/D$e$a;->F:Ljava/lang/Object;

    return-object v6
.end method
