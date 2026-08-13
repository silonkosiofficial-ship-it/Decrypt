.class final Lu/c$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/c$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Ljava/lang/Object;

.field final synthetic I:Lu/a;

.field final synthetic J:LV/G1;

.field final synthetic K:LV/G1;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lu/a;LV/G1;LV/G1;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/c$b$a;->H:Ljava/lang/Object;

    iput-object p2, p0, Lu/c$b$a;->I:Lu/a;

    iput-object p3, p0, Lu/c$b$a;->J:LV/G1;

    iput-object p4, p0, Lu/c$b$a;->K:LV/G1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/c$b$a;->G:I

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

    iget-object p1, p0, Lu/c$b$a;->H:Ljava/lang/Object;

    iget-object v1, p0, Lu/c$b$a;->I:Lu/a;

    invoke-virtual {v1}, Lu/a;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object v3, p0, Lu/c$b$a;->I:Lu/a;

    iget-object v4, p0, Lu/c$b$a;->H:Ljava/lang/Object;

    iget-object p1, p0, Lu/c$b$a;->J:LV/G1;

    invoke-static {p1}, Lu/c;->b(LV/G1;)Lu/j;

    move-result-object v5

    iput v2, p0, Lu/c$b$a;->G:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lu/a;->f(Lu/a;Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lu/c$b$a;->K:LV/G1;

    invoke-static {p1}, Lu/c;->a(LV/G1;)Lx7/l;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lu/c$b$a;->I:Lu/a;

    invoke-virtual {v0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/c$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/c$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/c$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/c$b$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, Lu/c$b$a;

    iget-object v1, p0, Lu/c$b$a;->H:Ljava/lang/Object;

    iget-object v2, p0, Lu/c$b$a;->I:Lu/a;

    iget-object v3, p0, Lu/c$b$a;->J:LV/G1;

    iget-object v4, p0, Lu/c$b$a;->K:LV/G1;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lu/c$b$a;-><init>(Ljava/lang/Object;Lu/a;LV/G1;LV/G1;Lm7/e;)V

    return-object p1
.end method
