.class final LV/y1$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/y1;->b(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lm7/i;

.field final synthetic J:LZ8/f;


# direct methods
.method constructor <init>(Lm7/i;LZ8/f;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LV/y1$a;->I:Lm7/i;

    iput-object p2, p0, LV/y1$a;->J:LZ8/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LV/y1$a;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LV/y1$a;->H:Ljava/lang/Object;

    check-cast p1, LV/M0;

    iget-object v1, p0, LV/y1$a;->I:Lm7/i;

    sget-object v4, Lm7/j;->C:Lm7/j;

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LV/y1$a;->J:LZ8/f;

    new-instance v2, LV/y1$a$a;

    invoke-direct {v2, p1}, LV/y1$a$a;-><init>(LV/M0;)V

    iput v3, p0, LV/y1$a;->G:I

    invoke-interface {v1, v2, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    iget-object v1, p0, LV/y1$a;->I:Lm7/i;

    new-instance v3, LV/y1$a$b;

    iget-object v4, p0, LV/y1$a;->J:LZ8/f;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, LV/y1$a$b;-><init>(LZ8/f;LV/M0;Lm7/e;)V

    iput v2, p0, LV/y1$a;->G:I

    invoke-static {v1, v3, p0}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LV/M0;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LV/y1$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LV/y1$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LV/y1$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/M0;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LV/y1$a;->H(LV/M0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LV/y1$a;

    iget-object v1, p0, LV/y1$a;->I:Lm7/i;

    iget-object v2, p0, LV/y1$a;->J:LZ8/f;

    invoke-direct {v0, v1, v2, p2}, LV/y1$a;-><init>(Lm7/i;LZ8/f;Lm7/e;)V

    iput-object p1, v0, LV/y1$a;->H:Ljava/lang/Object;

    return-object v0
.end method
