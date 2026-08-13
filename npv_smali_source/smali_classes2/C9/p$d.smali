.class final LC9/p$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p;->g(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:LV/w0;

.field final synthetic J:LV/q0;


# direct methods
.method constructor <init>(LV/w0;LV/q0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LC9/p$d;->I:LV/w0;

    iput-object p2, p0, LC9/p$d;->J:LV/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LC9/p$d;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LC9/p$d;->H:Ljava/lang/Object;

    check-cast p1, LZ8/f;

    iget-object v1, p0, LC9/p$d;->I:LV/w0;

    invoke-static {v1, v2}, LC9/p;->y(LV/w0;Z)V

    iget-object v1, p0, LC9/p$d;->J:LV/q0;

    const/4 v3, 0x0

    invoke-static {v1, v3}, LC9/p;->w(LV/q0;F)V

    :try_start_1
    new-instance v1, LC9/p$d$a;

    iget-object v3, p0, LC9/p$d;->J:LV/q0;

    invoke-direct {v1, v3}, LC9/p$d$a;-><init>(LV/q0;)V

    iput v2, p0, LC9/p$d;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LC9/p$d;->J:LV/q0;

    invoke-static {p1}, LC9/p;->v(LV/q0;)F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, LC9/p$d;->J:LV/q0;

    invoke-static {p1, v0}, LC9/p;->w(LV/q0;F)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    iget-object p1, p0, LC9/p$d;->I:LV/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LC9/p;->y(LV/w0;Z)V

    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/f;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC9/p$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LC9/p$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LC9/p$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/f;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LC9/p$d;->H(LZ8/f;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LC9/p$d;

    iget-object v1, p0, LC9/p$d;->I:LV/w0;

    iget-object v2, p0, LC9/p$d;->J:LV/q0;

    invoke-direct {v0, v1, v2, p2}, LC9/p$d;-><init>(LV/w0;LV/q0;Lm7/e;)V

    iput-object p1, v0, LC9/p$d;->H:Ljava/lang/Object;

    return-object v0
.end method
