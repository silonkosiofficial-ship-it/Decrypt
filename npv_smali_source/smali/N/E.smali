.class public final LN/E;
.super LN/b;
.source "SourceFile"


# instance fields
.field private final j:LS0/V;

.field private final k:LH/V;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS0/V;LS0/L;LH/V;LN/I;)V
    .locals 8

    .prologue
    invoke-virtual {p1}, LS0/V;->f()LM0/d;

    move-result-object v1

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v2

    if-eqz p3, :cond_0

    invoke-virtual {p3}, LH/V;->f()LM0/K;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v7, 0x0

    move-object v0, p0

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v7}, LN/b;-><init>(LM0/d;JLM0/K;LS0/L;LN/I;Ly7/k;)V

    iput-object p1, p0, LN/E;->j:LS0/V;

    iput-object p3, p0, LN/E;->k:LH/V;

    return-void
.end method

.method private final a0(LH/V;I)I
    .locals 5

    .prologue
    invoke-virtual {p1}, LH/V;->c()LD0/t;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LH/V;->b()LD0/t;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, LD0/s;->a(LD0/t;LD0/t;ZILjava/lang/Object;)Ln0/i;

    move-result-object v2

    :cond_0
    if-nez v2, :cond_2

    :cond_1
    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {v0}, Ln0/i$a;->a()Ln0/i;

    move-result-object v2

    :cond_2
    invoke-virtual {p0}, LN/b;->p()LS0/L;

    move-result-object v0

    iget-object v1, p0, LN/E;->j:LS0/V;

    invoke-virtual {v1}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->i(J)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->b(I)I

    move-result v0

    invoke-virtual {p1}, LH/V;->f()LM0/K;

    move-result-object v1

    invoke-virtual {v1, v0}, LM0/K;->e(I)Ln0/i;

    move-result-object v0

    invoke-virtual {v0}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {v0}, Ln0/i;->l()F

    move-result v0

    invoke-virtual {v2}, Ln0/i;->k()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    int-to-float p2, p2

    mul-float/2addr v2, p2

    add-float/2addr v0, v2

    invoke-virtual {p0}, LN/b;->p()LS0/L;

    move-result-object p2

    invoke-virtual {p1}, LH/V;->f()LM0/K;

    move-result-object p1

    invoke-static {v1, v0}, Ln0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LM0/K;->x(J)I

    move-result p1

    invoke-interface {p2, p1}, LS0/L;->a(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final Y(Lx7/l;)Ljava/util/List;
    .locals 5

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0}, LN/b;->u()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS0/i;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    new-instance p1, LS0/a;

    const-string v1, ""

    invoke-direct {p1, v1, v0}, LS0/a;-><init>(Ljava/lang/String;I)V

    new-instance v1, LS0/U;

    invoke-virtual {p0}, LN/b;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->l(J)I

    move-result v2

    invoke-virtual {p0}, LN/b;->u()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->l(J)I

    move-result v3

    invoke-direct {v1, v2, v3}, LS0/U;-><init>(II)V

    const/4 v2, 0x2

    new-array v2, v2, [LS0/i;

    aput-object p1, v2, v0

    const/4 p1, 0x1

    aput-object v1, v2, p1

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final Z()LS0/V;
    .locals 7

    iget-object v0, p0, LN/E;->j:LS0/V;

    invoke-virtual {p0}, LN/b;->e()LM0/d;

    move-result-object v1

    invoke-virtual {p0}, LN/b;->u()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LS0/V;->d(LS0/V;LM0/d;JLM0/N;ILjava/lang/Object;)LS0/V;

    move-result-object v0

    return-object v0
.end method

.method public final b0()LN/E;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LN/E;->k:LH/V;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LN/E;->a0(LH/V;I)I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c0()LN/E;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LN/E;->k:LH/V;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, LN/E;->a0(LH/V;I)I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
