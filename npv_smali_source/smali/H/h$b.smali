.class final LH/h$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LH/w;

.field final synthetic I:LV/G1;

.field final synthetic J:LS0/X;

.field final synthetic K:LN/F;

.field final synthetic L:LS0/s;


# direct methods
.method constructor <init>(LH/w;LV/G1;LS0/X;LN/F;LS0/s;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/h$b;->H:LH/w;

    iput-object p2, p0, LH/h$b;->I:LV/G1;

    iput-object p3, p0, LH/h$b;->J:LS0/X;

    iput-object p4, p0, LH/h$b;->K:LN/F;

    iput-object p5, p0, LH/h$b;->L:LS0/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LH/h$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, LH/h$b$a;

    iget-object v1, p0, LH/h$b;->I:LV/G1;

    invoke-direct {p1, v1}, LH/h$b$a;-><init>(LV/G1;)V

    invoke-static {p1}, LV/v1;->o(Lx7/a;)LZ8/f;

    move-result-object p1

    new-instance v1, LH/h$b$b;

    iget-object v3, p0, LH/h$b;->H:LH/w;

    iget-object v4, p0, LH/h$b;->J:LS0/X;

    iget-object v5, p0, LH/h$b;->K:LN/F;

    iget-object v6, p0, LH/h$b;->L:LS0/s;

    invoke-direct {v1, v3, v4, v5, v6}, LH/h$b$b;-><init>(LH/w;LS0/X;LN/F;LS0/s;)V

    iput v2, p0, LH/h$b;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LH/h$b;->H:LH/w;

    invoke-static {p1}, LH/h;->i(LH/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_1
    iget-object v0, p0, LH/h$b;->H:LH/w;

    invoke-static {v0}, LH/h;->i(LH/w;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LH/h$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/h$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/h$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance p1, LH/h$b;

    iget-object v1, p0, LH/h$b;->H:LH/w;

    iget-object v2, p0, LH/h$b;->I:LV/G1;

    iget-object v3, p0, LH/h$b;->J:LS0/X;

    iget-object v4, p0, LH/h$b;->K:LN/F;

    iget-object v5, p0, LH/h$b;->L:LS0/s;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LH/h$b;-><init>(LH/w;LV/G1;LS0/X;LN/F;LS0/s;Lm7/e;)V

    return-object p1
.end method
