.class final LS/X0$h;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0;->f(Lu/j;ZLx7/a;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lu/a;

.field final synthetic I:Z

.field final synthetic J:Lu/j;

.field final synthetic K:Lx7/a;


# direct methods
.method constructor <init>(Lu/a;ZLu/j;Lx7/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/X0$h;->H:Lu/a;

    iput-boolean p2, p0, LS/X0$h;->I:Z

    iput-object p3, p0, LS/X0$h;->J:Lu/j;

    iput-object p4, p0, LS/X0$h;->K:Lx7/a;

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

    iget v1, p0, LS/X0$h;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v1, p0, LS/X0$h;->H:Lu/a;

    iget-boolean p1, p0, LS/X0$h;->I:Z

    if-eqz p1, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v3, p0, LS/X0$h;->J:Lu/j;

    iput v2, p0, LS/X0$h;->G:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, p1

    move-object v6, p0

    invoke-static/range {v1 .. v8}, Lu/a;->f(Lu/a;Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, p0, LS/X0$h;->K:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS/X0$h;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/X0$h;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/X0$h;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/X0$h;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, LS/X0$h;

    iget-object v1, p0, LS/X0$h;->H:Lu/a;

    iget-boolean v2, p0, LS/X0$h;->I:Z

    iget-object v3, p0, LS/X0$h;->J:Lu/j;

    iget-object v4, p0, LS/X0$h;->K:Lx7/a;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LS/X0$h;-><init>(Lu/a;ZLu/j;Lx7/a;Lm7/e;)V

    return-object p1
.end method
