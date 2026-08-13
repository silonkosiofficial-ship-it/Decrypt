.class final Lu/S$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/S;->k(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:LV/w0;

.field final synthetic K:Lu/S;


# direct methods
.method constructor <init>(LV/w0;Lu/S;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/S$b;->J:LV/w0;

    iput-object p2, p0, Lu/S$b;->K:Lu/S;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/S$b;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lu/S$b;->G:Ljava/lang/Object;

    check-cast v1, Ly7/L;

    iget-object v4, p0, Lu/S$b;->I:Ljava/lang/Object;

    check-cast v4, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lu/S$b;->G:Ljava/lang/Object;

    check-cast v1, Ly7/L;

    iget-object v4, p0, Lu/S$b;->I:Ljava/lang/Object;

    check-cast v4, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/S$b;->I:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v1, Ly7/L;

    invoke-direct {v1}, Ly7/L;-><init>()V

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, v1, Ly7/L;->C:F

    :cond_3
    :goto_0
    new-instance v4, Lu/S$b$a;

    iget-object v5, p0, Lu/S$b;->J:LV/w0;

    iget-object v6, p0, Lu/S$b;->K:Lu/S;

    invoke-direct {v4, v5, v6, v1, p1}, Lu/S$b$a;-><init>(LV/w0;Lu/S;Ly7/L;LW8/N;)V

    iput-object p1, p0, Lu/S$b;->I:Ljava/lang/Object;

    iput-object v1, p0, Lu/S$b;->G:Ljava/lang/Object;

    iput v3, p0, Lu/S$b;->H:I

    invoke-static {v4, p0}, Lu/P;->a(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget v4, v1, Ly7/L;->C:F

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    new-instance v4, Lu/S$b$b;

    invoke-direct {v4, p1}, Lu/S$b$b;-><init>(LW8/N;)V

    invoke-static {v4}, LV/v1;->o(Lx7/a;)LZ8/f;

    move-result-object v4

    new-instance v5, Lu/S$b$c;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lu/S$b$c;-><init>(Lm7/e;)V

    iput-object p1, p0, Lu/S$b;->I:Ljava/lang/Object;

    iput-object v1, p0, Lu/S$b;->G:Ljava/lang/Object;

    iput v2, p0, Lu/S$b;->H:I

    invoke-static {v4, v5, p0}, LZ8/h;->v(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3

    return-object v0
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/S$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/S$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/S$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/S$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lu/S$b;

    iget-object v1, p0, Lu/S$b;->J:LV/w0;

    iget-object v2, p0, Lu/S$b;->K:Lu/S;

    invoke-direct {v0, v1, v2, p2}, Lu/S$b;-><init>(LV/w0;Lu/S;Lm7/e;)V

    iput-object p1, v0, Lu/S$b;->I:Ljava/lang/Object;

    return-object v0
.end method
