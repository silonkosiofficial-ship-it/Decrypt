.class final LH/h$i$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$i;->a(Lm0/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LE/b;

.field final synthetic I:LS0/V;

.field final synthetic J:LH/w;

.field final synthetic K:LH/V;

.field final synthetic L:LS0/L;


# direct methods
.method constructor <init>(LE/b;LS0/V;LH/w;LH/V;LS0/L;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/h$i$a;->H:LE/b;

    iput-object p2, p0, LH/h$i$a;->I:LS0/V;

    iput-object p3, p0, LH/h$i$a;->J:LH/w;

    iput-object p4, p0, LH/h$i$a;->K:LH/V;

    iput-object p5, p0, LH/h$i$a;->L:LS0/L;

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

    iget v1, p0, LH/h$i$a;->G:I

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

    iget-object v1, p0, LH/h$i$a;->H:LE/b;

    iget-object p1, p0, LH/h$i$a;->I:LS0/V;

    iget-object v3, p0, LH/h$i$a;->J:LH/w;

    invoke-virtual {v3}, LH/w;->v()LH/D;

    move-result-object v3

    iget-object v4, p0, LH/h$i$a;->K:LH/V;

    invoke-virtual {v4}, LH/V;->f()LM0/K;

    move-result-object v4

    iget-object v5, p0, LH/h$i$a;->L:LS0/L;

    iput v2, p0, LH/h$i$a;->G:I

    move-object v2, p1

    move-object v6, p0

    invoke-static/range {v1 .. v6}, LH/h;->m(LE/b;LS0/V;LH/D;LM0/K;LS0/L;Lm7/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LH/h$i$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/h$i$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/h$i$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/h$i$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance p1, LH/h$i$a;

    iget-object v1, p0, LH/h$i$a;->H:LE/b;

    iget-object v2, p0, LH/h$i$a;->I:LS0/V;

    iget-object v3, p0, LH/h$i$a;->J:LH/w;

    iget-object v4, p0, LH/h$i$a;->K:LH/V;

    iget-object v5, p0, LH/h$i$a;->L:LS0/L;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LH/h$i$a;-><init>(LE/b;LS0/V;LH/w;LH/V;LS0/L;Lm7/e;)V

    return-object p1
.end method
