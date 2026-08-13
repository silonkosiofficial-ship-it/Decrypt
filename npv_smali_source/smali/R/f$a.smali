.class final LR/f$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/f;->b(Lz/j;LV/n;I)Lv/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lz/j;

.field final synthetic J:LR/o;


# direct methods
.method constructor <init>(Lz/j;LR/o;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LR/f$a;->I:Lz/j;

    iput-object p2, p0, LR/f$a;->J:LR/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LR/f$a;->G:I

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

    iget-object p1, p0, LR/f$a;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    iget-object v1, p0, LR/f$a;->I:Lz/j;

    invoke-interface {v1}, Lz/j;->b()LZ8/f;

    move-result-object v1

    new-instance v3, LR/f$a$a;

    iget-object v4, p0, LR/f$a;->J:LR/o;

    invoke-direct {v3, v4, p1}, LR/f$a$a;-><init>(LR/o;LW8/N;)V

    iput v2, p0, LR/f$a;->G:I

    invoke-interface {v1, v3, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LR/f$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LR/f$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LR/f$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LR/f$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LR/f$a;

    iget-object v1, p0, LR/f$a;->I:Lz/j;

    iget-object v2, p0, LR/f$a;->J:LR/o;

    invoke-direct {v0, v1, v2, p2}, LR/f$a;-><init>(Lz/j;LR/o;Lm7/e;)V

    iput-object p1, v0, LR/f$a;->H:Ljava/lang/Object;

    return-object v0
.end method
