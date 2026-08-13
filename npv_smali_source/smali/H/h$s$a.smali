.class final LH/h$s$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$s;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lz0/K;

.field final synthetic J:LH/F;

.field final synthetic K:LN/F;


# direct methods
.method constructor <init>(Lz0/K;LH/F;LN/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/h$s$a;->I:Lz0/K;

    iput-object p2, p0, LH/h$s$a;->J:LH/F;

    iput-object p3, p0, LH/h$s$a;->K:LN/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LH/h$s$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LH/h$s$a;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    sget-object v6, LW8/P;->F:LW8/P;

    new-instance v3, LH/h$s$a$a;

    iget-object v0, p0, LH/h$s$a;->I:Lz0/K;

    iget-object v1, p0, LH/h$s$a;->J:LH/F;

    const/4 v7, 0x0

    invoke-direct {v3, v0, v1, v7}, LH/h$s$a$a;-><init>(Lz0/K;LH/F;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance v3, LH/h$s$a$b;

    iget-object v0, p0, LH/h$s$a;->I:Lz0/K;

    iget-object v1, p0, LH/h$s$a;->K:LN/F;

    invoke-direct {v3, v0, v1, v7}, LH/h$s$a$b;-><init>(Lz0/K;LN/F;Lm7/e;)V

    const/4 v1, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LH/h$s$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/h$s$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/h$s$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/h$s$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LH/h$s$a;

    iget-object v1, p0, LH/h$s$a;->I:Lz0/K;

    iget-object v2, p0, LH/h$s$a;->J:LH/F;

    iget-object v3, p0, LH/h$s$a;->K:LN/F;

    invoke-direct {v0, v1, v2, v3, p2}, LH/h$s$a;-><init>(Lz0/K;LH/F;LN/F;Lm7/e;)V

    iput-object p1, v0, LH/h$s$a;->H:Ljava/lang/Object;

    return-object v0
.end method
