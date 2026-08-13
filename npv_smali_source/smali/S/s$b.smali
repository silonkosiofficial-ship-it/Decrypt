.class final LS/s$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s;->e(ZLz/j;LV/n;I)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lu/a;

.field final synthetic I:F

.field final synthetic J:Z

.field final synthetic K:LS/s;

.field final synthetic L:Lz/i;


# direct methods
.method constructor <init>(Lu/a;FZLS/s;Lz/i;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/s$b;->H:Lu/a;

    iput p2, p0, LS/s$b;->I:F

    iput-boolean p3, p0, LS/s$b;->J:Z

    iput-object p4, p0, LS/s$b;->K:LS/s;

    iput-object p5, p0, LS/s$b;->L:Lz/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/s$b;->G:I

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

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS/s$b;->H:Lu/a;

    invoke-virtual {p1}, Lu/a;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/i;

    invoke-virtual {p1}, LY0/i;->v()F

    move-result p1

    iget v1, p0, LS/s$b;->I:F

    invoke-static {p1, v1}, LY0/i;->s(FF)Z

    move-result p1

    if-nez p1, :cond_8

    iget-boolean p1, p0, LS/s$b;->J:Z

    if-nez p1, :cond_3

    iget-object p1, p0, LS/s$b;->H:Lu/a;

    iget v1, p0, LS/s$b;->I:F

    invoke-static {v1}, LY0/i;->m(F)LY0/i;

    move-result-object v1

    iput v3, p0, LS/s$b;->G:I

    invoke-virtual {p1, v1, p0}, Lu/a;->s(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_3
    iget-object p1, p0, LS/s$b;->H:Lu/a;

    invoke-virtual {p1}, Lu/a;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/i;

    invoke-virtual {p1}, LY0/i;->v()F

    move-result p1

    iget-object v1, p0, LS/s$b;->K:LS/s;

    invoke-static {v1}, LS/s;->d(LS/s;)F

    move-result v1

    invoke-static {p1, v1}, LY0/i;->s(FF)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    new-instance p1, Lz/n$b;

    sget-object v1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v1}, Ln0/g$a;->c()J

    move-result-wide v4

    invoke-direct {p1, v4, v5, v3}, Lz/n$b;-><init>(JLy7/k;)V

    move-object v3, p1

    goto :goto_1

    :cond_4
    iget-object v1, p0, LS/s$b;->K:LS/s;

    invoke-static {v1}, LS/s;->c(LS/s;)F

    move-result v1

    invoke-static {p1, v1}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v3, Lz/g;

    invoke-direct {v3}, Lz/g;-><init>()V

    goto :goto_1

    :cond_5
    iget-object v1, p0, LS/s$b;->K:LS/s;

    invoke-static {v1}, LS/s;->b(LS/s;)F

    move-result v1

    invoke-static {p1, v1}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v3, Lz/d;

    invoke-direct {v3}, Lz/d;-><init>()V

    goto :goto_1

    :cond_6
    iget-object v1, p0, LS/s$b;->K:LS/s;

    invoke-static {v1}, LS/s;->a(LS/s;)F

    move-result v1

    invoke-static {p1, v1}, LY0/i;->s(FF)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance v3, Lz/b;

    invoke-direct {v3}, Lz/b;-><init>()V

    :cond_7
    :goto_1
    iget-object p1, p0, LS/s$b;->H:Lu/a;

    iget v1, p0, LS/s$b;->I:F

    iget-object v4, p0, LS/s$b;->L:Lz/i;

    iput v2, p0, LS/s$b;->G:I

    invoke-static {p1, v1, v3, v4, p0}, LT/o;->d(Lu/a;FLz/i;Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS/s$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/s$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/s$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/s$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance p1, LS/s$b;

    iget-object v1, p0, LS/s$b;->H:Lu/a;

    iget v2, p0, LS/s$b;->I:F

    iget-boolean v3, p0, LS/s$b;->J:Z

    iget-object v4, p0, LS/s$b;->K:LS/s;

    iget-object v5, p0, LS/s$b;->L:Lz/i;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LS/s$b;-><init>(Lu/a;FZLS/s;Lz/i;Lm7/e;)V

    return-object p1
.end method
