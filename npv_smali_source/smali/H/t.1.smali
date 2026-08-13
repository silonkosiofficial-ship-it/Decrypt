.class public final LH/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/compose/ui/platform/s1;

.field public b:LH/u;

.field public c:Lm0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/s1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/t;->a:Landroidx/compose/ui/platform/s1;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .prologue
    sget-object v0, LS0/r;->b:LS0/r$a;

    invoke-virtual {v0}, LS0/r$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LH/t;->b()Lm0/f;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->e()I

    move-result v0

    :goto_0
    invoke-interface {p1, v0}, Lm0/f;->i(I)Z

    goto :goto_4

    :cond_0
    invoke-virtual {v0}, LS0/r$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LH/t;->b()Lm0/f;

    move-result-object p1

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->f()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LS0/r$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LH/t;->a:Landroidx/compose/ui/platform/s1;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Landroidx/compose/ui/platform/s1;->a()V

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, LS0/r$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LS0/r$a;->g()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, LS0/r$a;->h()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, LS0/r$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v2

    :goto_3
    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, LS0/r$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LS0/r;->m(II)Z

    :cond_7
    :goto_4
    return-void
.end method

.method public final b()Lm0/f;
    .locals 1

    .prologue
    iget-object v0, p0, LH/t;->c:Lm0/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "focusManager"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()LH/u;
    .locals 1

    .prologue
    iget-object v0, p0, LH/t;->b:LH/u;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "keyboardActions"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(I)V
    .locals 3

    .prologue
    sget-object v0, LS0/r;->b:LS0/r$a;

    invoke-virtual {v0}, LS0/r$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LH/t;->c()LH/u;

    move-result-object v0

    invoke-virtual {v0}, LH/u;->b()Lx7/l;

    move-result-object v0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, LS0/r$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LH/t;->c()LH/u;

    move-result-object v0

    invoke-virtual {v0}, LH/u;->c()Lx7/l;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LS0/r$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LH/t;->c()LH/u;

    move-result-object v0

    invoke-virtual {v0}, LH/u;->d()Lx7/l;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LS0/r$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, LH/t;->c()LH/u;

    move-result-object v0

    invoke-virtual {v0}, LH/u;->e()Lx7/l;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LS0/r$a;->g()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LH/t;->c()LH/u;

    move-result-object v0

    invoke-virtual {v0}, LH/u;->f()Lx7/l;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LS0/r$a;->h()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LH/t;->c()LH/u;

    move-result-object v0

    invoke-virtual {v0}, LH/u;->g()Lx7/l;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, LS0/r$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LS0/r;->m(II)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, LS0/r$a;->e()I

    move-result v0

    invoke-static {p1, v0}, LS0/r;->m(II)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_9

    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_7

    invoke-interface {v0, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Li7/M;->a:Li7/M;

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0, p1}, LH/t;->a(I)V

    :cond_8
    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid ImeAction"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lm0/f;)V
    .locals 0

    iput-object p1, p0, LH/t;->c:Lm0/f;

    return-void
.end method

.method public final f(LH/u;)V
    .locals 0

    iput-object p1, p0, LH/t;->b:LH/u;

    return-void
.end method
