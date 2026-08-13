.class final LS/q1$h$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$h$a;->a()Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS/c;

.field final synthetic I:F

.field final synthetic J:Z

.field final synthetic K:LV/w0;

.field final synthetic L:LV/w0;


# direct methods
.method constructor <init>(LS/c;FZLV/w0;LV/w0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS/q1$h$a$a;->H:LS/c;

    iput p2, p0, LS/q1$h$a$a;->I:F

    iput-boolean p3, p0, LS/q1$h$a$a;->J:Z

    iput-object p4, p0, LS/q1$h$a$a;->K:LV/w0;

    iput-object p5, p0, LS/q1$h$a$a;->L:LV/w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS/q1$h$a$a;->G:I

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

    iget-object v1, p0, LS/q1$h$a$a;->H:LS/c;

    iget-object p1, p0, LS/q1$h$a$a;->K:LV/w0;

    invoke-static {p1}, LS/q1;->x(LV/w0;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->m(J)F

    move-result p1

    iget-object v3, p0, LS/q1$h$a$a;->K:LV/w0;

    invoke-static {v3}, LS/q1;->x(LV/w0;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v3

    iget v4, p0, LS/q1$h$a$a;->I:F

    iget-boolean v5, p0, LS/q1$h$a$a;->J:Z

    iget-object v6, p0, LS/q1$h$a$a;->L:LV/w0;

    invoke-static {v6}, LS/q1;->z(LV/w0;)J

    move-result-wide v6

    iput v2, p0, LS/q1$h$a$a;->G:I

    move v2, p1

    move-object v8, p0

    invoke-static/range {v1 .. v8}, LS/q1;->S(LS/c;FFFZJLm7/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LS/q1$h$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS/q1$h$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/q1$h$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS/q1$h$a$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 7

    new-instance p1, LS/q1$h$a$a;

    iget-object v1, p0, LS/q1$h$a$a;->H:LS/c;

    iget v2, p0, LS/q1$h$a$a;->I:F

    iget-boolean v3, p0, LS/q1$h$a$a;->J:Z

    iget-object v4, p0, LS/q1$h$a$a;->K:LV/w0;

    iget-object v5, p0, LS/q1$h$a$a;->L:LV/w0;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LS/q1$h$a$a;-><init>(LS/c;FZLV/w0;LV/w0;Lm7/e;)V

    return-object p1
.end method
