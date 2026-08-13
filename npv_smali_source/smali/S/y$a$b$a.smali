.class final LS/y$a$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y$a$b;->a(Lz0/B;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS/y;

.field final synthetic I:J


# direct methods
.method constructor <init>(LS/y;JLm7/e;)V
    .locals 0

    iput-object p1, p0, LS/y$a$b$a;->H:LS/y;

    iput-wide p2, p0, LS/y$a$b$a;->I:J

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

    iget v1, p0, LS/y$a$b$a;->G:I

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

    iget-object p1, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {p1}, LS/y;->c2(LS/y;)F

    move-result v1

    iget-wide v3, p0, LS/y$a$b$a;->I:J

    invoke-static {v3, v4}, Ln0/g;->m(J)F

    move-result v3

    add-float/2addr v1, v3

    invoke-static {p1, v1}, LS/y;->f2(LS/y;F)V

    iget-object p1, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {p1}, LS/y;->d2(LS/y;)F

    move-result v1

    iget-wide v3, p0, LS/y$a$b$a;->I:J

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v3

    add-float/2addr v1, v3

    invoke-static {p1, v1}, LS/y;->g2(LS/y;F)V

    iget-object p1, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {p1}, LS/y;->e2(LS/y;)LS/c;

    move-result-object v3

    iget-object p1, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {p1}, LS/y;->d2(LS/y;)F

    move-result p1

    iget-object v1, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {v1}, LS/y;->a2(LS/y;)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/p;->i(J)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr p1, v1

    iget-object v1, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {v1}, LS/y;->c2(LS/y;)F

    move-result v1

    iget-object v4, p0, LS/y$a$b$a;->H:LS/y;

    invoke-static {v4}, LS/y;->a2(LS/y;)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/p;->h(J)I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v1, v4

    invoke-static {p1, v1}, LS/q1;->J(FF)F

    move-result v4

    iput v2, p0, LS/y$a$b$a;->G:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v3 .. v8}, LS/c;->C(LS/c;FZLm7/e;ILjava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LS/y$a$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/y$a$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/y$a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/y$a$b$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LS/y$a$b$a;

    iget-object v0, p0, LS/y$a$b$a;->H:LS/y;

    iget-wide v1, p0, LS/y$a$b$a;->I:J

    invoke-direct {p1, v0, v1, v2, p2}, LS/y$a$b$a;-><init>(LS/y;JLm7/e;)V

    return-object p1
.end method
