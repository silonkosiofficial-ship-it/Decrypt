.class final LS/T$m$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$m$b;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LB/D;

.field final synthetic I:I

.field final synthetic J:LE7/i;

.field final synthetic K:LT/j;


# direct methods
.method constructor <init>(LB/D;ILE7/i;LT/j;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/T$m$b$a;->H:LB/D;

    iput p2, p0, LS/T$m$b$a;->I:I

    iput-object p3, p0, LS/T$m$b$a;->J:LE7/i;

    iput-object p4, p0, LS/T$m$b$a;->K:LT/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/T$m$b$a;->G:I

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

    iget-object v1, p0, LS/T$m$b$a;->H:LB/D;

    iget p1, p0, LS/T$m$b$a;->I:I

    iget-object v3, p0, LS/T$m$b$a;->J:LE7/i;

    invoke-virtual {v3}, LE7/g;->f()I

    move-result v3

    sub-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0xc

    iget-object v3, p0, LS/T$m$b$a;->K:LT/j;

    invoke-virtual {v3}, LT/j;->b()I

    move-result v3

    add-int/2addr p1, v3

    sub-int/2addr p1, v2

    iput v2, p0, LS/T$m$b$a;->G:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move v2, p1

    move-object v4, p0

    invoke-static/range {v1 .. v6}, LB/D;->K(LB/D;IILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LS/T$m$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/T$m$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/T$m$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/T$m$b$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, LS/T$m$b$a;

    iget-object v1, p0, LS/T$m$b$a;->H:LB/D;

    iget v2, p0, LS/T$m$b$a;->I:I

    iget-object v3, p0, LS/T$m$b$a;->J:LE7/i;

    iget-object v4, p0, LS/T$m$b$a;->K:LT/j;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LS/T$m$b$a;-><init>(LB/D;ILE7/i;LT/j;Lm7/e;)V

    return-object p1
.end method
