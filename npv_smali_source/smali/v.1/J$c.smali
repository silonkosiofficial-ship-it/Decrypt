.class final Lv/J$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/J;->D1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lv/J;


# direct methods
.method constructor <init>(Lv/J;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lv/J$c;->H:Lv/J;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lv/J$c;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lv/J$c;->H:Lv/J;

    invoke-static {p1}, Lv/J;->T1(Lv/J;)LY8/j;

    move-result-object p1

    if-eqz p1, :cond_4

    iput v3, p0, Lv/J$c;->G:I

    invoke-interface {p1, p0}, LY8/B;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-object p1, p0, Lv/J$c;->H:Lv/J;

    invoke-static {p1}, Lv/J;->V1(Lv/J;)Lv/V;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object p1, Lv/J$c$a;->D:Lv/J$c$a;

    iput v2, p0, Lv/J$c;->G:I

    invoke-static {p1, p0}, LV/l0;->b(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lv/J$c;->H:Lv/J;

    invoke-static {p1}, Lv/J;->V1(Lv/J;)Lv/V;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lv/V;->c()V

    goto :goto_0
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv/J$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lv/J$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lv/J$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lv/J$c;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, Lv/J$c;

    iget-object v0, p0, Lv/J$c;->H:Lv/J;

    invoke-direct {p1, v0, p2}, Lv/J$c;-><init>(Lv/J;Lm7/e;)V

    return-object p1
.end method
