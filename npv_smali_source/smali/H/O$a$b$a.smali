.class final LH/O$a$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/O$a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:J

.field final synthetic J:LW8/N;

.field final synthetic K:LV/w0;

.field final synthetic L:Lz/l;


# direct methods
.method constructor <init>(LW8/N;LV/w0;Lz/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/O$a$b$a;->J:LW8/N;

    iput-object p2, p0, LH/O$a$b$a;->K:LV/w0;

    iput-object p3, p0, LH/O$a$b$a;->L:Lz/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LH/O$a$b$a;->G:I

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

    iget-object p1, p0, LH/O$a$b$a;->H:Ljava/lang/Object;

    check-cast p1, Lx/t;

    iget-wide v5, p0, LH/O$a$b$a;->I:J

    iget-object v1, p0, LH/O$a$b$a;->J:LW8/N;

    new-instance v10, LH/O$a$b$a$a;

    iget-object v4, p0, LH/O$a$b$a;->K:LV/w0;

    iget-object v7, p0, LH/O$a$b$a;->L:Lz/l;

    const/4 v8, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, LH/O$a$b$a$a;-><init>(LV/w0;JLz/l;Lm7/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v7, v1

    invoke-static/range {v7 .. v12}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iput v2, p0, LH/O$a$b$a;->G:I

    invoke-interface {p1, p0}, Lx/t;->j0(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, LH/O$a$b$a;->J:LW8/N;

    new-instance v3, LH/O$a$b$a$b;

    iget-object v1, p0, LH/O$a$b$a;->K:LV/w0;

    iget-object v2, p0, LH/O$a$b$a;->L:Lz/l;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p1, v2, v4}, LH/O$a$b$a$b;-><init>(LV/w0;ZLz/l;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lx/t;JLm7/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LH/O$a$b$a;

    iget-object v1, p0, LH/O$a$b$a;->J:LW8/N;

    iget-object v2, p0, LH/O$a$b$a;->K:LV/w0;

    iget-object v3, p0, LH/O$a$b$a;->L:Lz/l;

    invoke-direct {v0, v1, v2, v3, p4}, LH/O$a$b$a;-><init>(LW8/N;LV/w0;Lz/l;Lm7/e;)V

    iput-object p1, v0, LH/O$a$b$a;->H:Ljava/lang/Object;

    iput-wide p2, v0, LH/O$a$b$a;->I:J

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LH/O$a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lx/t;

    check-cast p2, Ln0/g;

    invoke-virtual {p2}, Ln0/g;->v()J

    move-result-wide v0

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, v0, v1, p3}, LH/O$a$b$a;->H(Lx/t;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
