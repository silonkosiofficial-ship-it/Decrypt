.class final LS/X0$i;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0;->g(Lu/j;ZLV/n;I)LV/G1;
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


# direct methods
.method constructor <init>(Lu/a;ZLu/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/X0$i;->H:Lu/a;

    iput-boolean p2, p0, LS/X0$i;->I:Z

    iput-object p3, p0, LS/X0$i;->J:Lu/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/X0$i;->G:I

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

    iget-object v1, p0, LS/X0$i;->H:Lu/a;

    iget-boolean p1, p0, LS/X0$i;->I:Z

    if-eqz p1, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    const p1, 0x3f4ccccd    # 0.8f

    :goto_0
    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v3, p0, LS/X0$i;->J:Lu/j;

    iput v2, p0, LS/X0$i;->G:I

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
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS/X0$i;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/X0$i;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/X0$i;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/X0$i;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LS/X0$i;

    iget-object v0, p0, LS/X0$i;->H:Lu/a;

    iget-boolean v1, p0, LS/X0$i;->I:Z

    iget-object v2, p0, LS/X0$i;->J:Lu/j;

    invoke-direct {p1, v0, v1, v2, p2}, LS/X0$i;-><init>(Lu/a;ZLu/j;Lm7/e;)V

    return-object p1
.end method
