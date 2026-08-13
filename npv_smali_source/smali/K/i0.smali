.class public final LK/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK/i0;

    invoke-direct {v0}, LK/i0;-><init>()V

    sput-object v0, LK/i0;->a:LK/i0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final A(LK/z0;Landroid/view/inputmethod/DeleteGesture;LK/y0;)V
    .locals 2

    invoke-static {p2}, LK/H;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/I;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v1, LM0/I;->a:LM0/I$a;

    invoke-virtual {v1}, LM0/I$a;->h()LM0/I;

    move-result-object v1

    invoke-static {p3, v0, p2, v1}, LK/j0;->g(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide p2

    sget-object v0, LJ/d;->a:LJ/d$a;

    invoke-virtual {v0}, LJ/d$a;->a()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LK/i0;->e(LK/z0;JI)V

    return-void
.end method

.method private final B(LH/w;Landroid/view/inputmethod/DeleteRangeGesture;LN/F;)V
    .locals 3

    .prologue
    if-eqz p3, :cond_0

    invoke-static {p2}, LK/a0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/b0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/c0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p1, v0, v1, p2, v2}, LK/j0;->h(LH/w;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LN/F;->X(J)V

    :cond_0
    return-void
.end method

.method private final C(LK/z0;Landroid/view/inputmethod/DeleteRangeGesture;LK/y0;)V
    .locals 3

    invoke-static {p2}, LK/a0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/b0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/c0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p3, v0, v1, p2, v2}, LK/j0;->i(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide p2

    sget-object v0, LJ/d;->a:LJ/d$a;

    invoke-virtual {v0}, LJ/d$a;->a()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LK/i0;->e(LK/z0;JI)V

    return-void
.end method

.method private static final F(LK/z0;)V
    .locals 0

    invoke-static {p0}, LK/z0;->b(LK/z0;)LJ/c;

    invoke-static {p0}, LK/z0;->a(LK/z0;)LJ/a;

    sget-object p0, LL/a;->C:LL/a;

    const/4 p0, 0x0

    throw p0
.end method

.method private static final G(LN/F;)V
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LN/F;->n()V

    :cond_0
    return-void
.end method

.method private final H(LH/w;Landroid/view/inputmethod/SelectGesture;LN/F;)V
    .locals 2

    .prologue
    if-eqz p3, :cond_0

    invoke-static {p2}, LK/Q;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/S;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v1, LM0/I;->a:LM0/I$a;

    invoke-virtual {v1}, LM0/I$a;->h()LM0/I;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, LK/j0;->f(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LN/F;->g0(J)V

    :cond_0
    return-void
.end method

.method private final I(LK/z0;Landroid/view/inputmethod/SelectGesture;LK/y0;)V
    .locals 2

    invoke-static {p2}, LK/Q;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/S;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v1, LM0/I;->a:LM0/I$a;

    invoke-virtual {v1}, LM0/I$a;->h()LM0/I;

    move-result-object v1

    invoke-static {p3, v0, p2, v1}, LK/j0;->g(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide p2

    sget-object v0, LJ/d;->a:LJ/d$a;

    invoke-virtual {v0}, LJ/d$a;->b()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LK/i0;->e(LK/z0;JI)V

    return-void
.end method

.method private final J(LH/w;Landroid/view/inputmethod/SelectRangeGesture;LN/F;)V
    .locals 3

    .prologue
    if-eqz p3, :cond_0

    invoke-static {p2}, LK/A;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/L;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p1, v0, v1, p2, v2}, LK/j0;->h(LH/w;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LN/F;->g0(J)V

    :cond_0
    return-void
.end method

.method private final K(LK/z0;Landroid/view/inputmethod/SelectRangeGesture;LK/y0;)V
    .locals 3

    invoke-static {p2}, LK/A;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/L;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p3, v0, v1, p2, v2}, LK/j0;->i(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide p2

    sget-object v0, LJ/d;->a:LJ/d$a;

    invoke-virtual {v0}, LJ/d$a;->b()I

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LK/i0;->e(LK/z0;JI)V

    return-void
.end method

.method private final L(I)I
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    sget-object p1, LM0/E;->a:LM0/E$a;

    invoke-virtual {p1}, LM0/E$a;->a()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, LM0/E;->a:LM0/E$a;

    invoke-virtual {p1}, LM0/E$a;->b()I

    move-result p1

    :goto_0
    return p1
.end method

.method public static synthetic a(LN/F;)V
    .locals 0

    invoke-static {p0}, LK/i0;->G(LN/F;)V

    return-void
.end method

.method public static synthetic b(LK/z0;)V
    .locals 0

    invoke-static {p0}, LK/i0;->F(LK/z0;)V

    return-void
.end method

.method private final c(LK/z0;Landroid/view/inputmethod/HandwritingGesture;)I
    .locals 0

    invoke-static {p1}, LK/z0;->b(LK/z0;)LJ/c;

    invoke-static {p1}, LK/z0;->a(LK/z0;)LJ/a;

    sget-object p1, LL/a;->C:LL/a;

    const/4 p1, 0x0

    throw p1
.end method

.method private final d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    invoke-static {p1}, LK/Z;->a(Landroid/view/inputmethod/HandwritingGesture;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x3

    return p1

    :cond_0
    new-instance v0, LS0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LS0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x5

    return p1
.end method

.method private final e(LK/z0;JI)V
    .locals 0

    .prologue
    invoke-static {p2, p3}, LM0/N;->h(J)Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-static {p1}, LK/z0;->b(LK/z0;)LJ/c;

    invoke-static {p1}, LK/z0;->a(LK/z0;)LJ/a;

    sget-object p1, LL/a;->C:LL/a;

    throw p3

    :cond_0
    throw p3
.end method

.method private final f(LH/w;Landroid/view/inputmethod/DeleteGesture;LM0/d;Lx7/l;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/DeleteGesture;",
            "LM0/d;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    invoke-static {p2}, LK/I;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LK/i0;->L(I)I

    move-result v0

    invoke-static {p2}, LK/H;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p1, v1, v0, v2}, LK/j0;->f(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide v4

    invoke-static {v4, v5}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_0
    sget-object p1, LM0/E;->a:LM0/E$a;

    invoke-virtual {p1}, LM0/E$a;->b()I

    move-result p1

    invoke-static {v0, p1}, LM0/E;->d(II)Z

    move-result v7

    move-object v3, p0

    move-object v6, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, LK/i0;->k(JLM0/d;ZLx7/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final g(LK/z0;Landroid/view/inputmethod/DeleteGesture;LK/y0;)I
    .locals 3

    .prologue
    invoke-static {p2}, LK/I;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LK/i0;->L(I)I

    move-result v0

    invoke-static {p2}, LK/H;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p3, v1, v0, v2}, LK/j0;->g(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LK/i0;->c(LK/z0;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    sget-object p2, LM0/E;->a:LM0/E$a;

    invoke-virtual {p2}, LM0/E$a;->b()I

    move-result p2

    invoke-static {v0, p2}, LM0/E;->d(II)Z

    move-result p2

    invoke-direct {p0, p1, v1, v2, p2}, LK/i0;->j(LK/z0;JZ)V

    const/4 p1, 0x1

    return p1
.end method

.method private final h(LH/w;Landroid/view/inputmethod/DeleteRangeGesture;LM0/d;Lx7/l;)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/DeleteRangeGesture;",
            "LM0/d;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    invoke-static {p2}, LK/c0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LK/i0;->L(I)I

    move-result v0

    invoke-static {p2}, LK/a0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/b0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v2

    sget-object v3, LM0/I;->a:LM0/I$a;

    invoke-virtual {v3}, LM0/I$a;->h()LM0/I;

    move-result-object v3

    invoke-static {p1, v1, v2, v0, v3}, LK/j0;->h(LH/w;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide v5

    invoke-static {v5, v6}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_0
    sget-object p1, LM0/E;->a:LM0/E$a;

    invoke-virtual {p1}, LM0/E$a;->b()I

    move-result p1

    invoke-static {v0, p1}, LM0/E;->d(II)Z

    move-result v8

    move-object v4, p0

    move-object v7, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, LK/i0;->k(JLM0/d;ZLx7/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final i(LK/z0;Landroid/view/inputmethod/DeleteRangeGesture;LK/y0;)I
    .locals 4

    .prologue
    invoke-static {p2}, LK/c0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)I

    move-result v0

    invoke-direct {p0, v0}, LK/i0;->L(I)I

    move-result v0

    invoke-static {p2}, LK/a0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/b0;->a(Landroid/view/inputmethod/DeleteRangeGesture;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-static {v2}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v2

    sget-object v3, LM0/I;->a:LM0/I$a;

    invoke-virtual {v3}, LM0/I$a;->h()LM0/I;

    move-result-object v3

    invoke-static {p3, v1, v2, v0, v3}, LK/j0;->i(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LK/i0;->c(LK/z0;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    sget-object p2, LM0/E;->a:LM0/E$a;

    invoke-virtual {p2}, LM0/E$a;->b()I

    move-result p2

    invoke-static {v0, p2}, LM0/E;->d(II)Z

    move-result p2

    invoke-direct {p0, p1, v1, v2, p2}, LK/i0;->j(LK/z0;JZ)V

    const/4 p1, 0x1

    return p1
.end method

.method private final j(LK/z0;JZ)V
    .locals 8

    .prologue
    if-nez p4, :cond_0

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-wide v2, p2

    invoke-static/range {v0 .. v7}, LK/z0;->c(LK/z0;Ljava/lang/CharSequence;JLL/a;ZILjava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private final k(JLM0/d;ZLx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LM0/d;",
            "Z",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    if-eqz p4, :cond_0

    invoke-static {p1, p2, p3}, LK/j0;->a(JLjava/lang/CharSequence;)J

    move-result-wide p1

    :cond_0
    new-instance p3, LS0/U;

    invoke-static {p1, p2}, LM0/N;->i(J)I

    move-result p4

    invoke-static {p1, p2}, LM0/N;->i(J)I

    move-result v1

    invoke-direct {p3, p4, v1}, LS0/U;-><init>(II)V

    invoke-static {p1, p2}, LM0/N;->j(J)I

    move-result p1

    new-instance p2, LS0/g;

    invoke-direct {p2, p1, v0}, LS0/g;-><init>(II)V

    const/4 p1, 0x2

    new-array p1, p1, [LS0/i;

    aput-object p3, p1, v0

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, LK/j0;->b([LS0/i;)LS0/i;

    move-result-object p1

    invoke-interface {p5, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final n(LH/w;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/A1;Lx7/l;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/InsertGesture;",
            "Landroidx/compose/ui/platform/A1;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    if-nez p3, :cond_1

    :cond_0
    :goto_0
    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p4}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_1
    invoke-static {p2}, LK/T;->a(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LK/j0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p3}, LK/j0;->c(LH/w;JLandroidx/compose/ui/platform/A1;)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LH/V;->f()LM0/K;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1, p3}, LK/j0;->j(LM0/K;I)Z

    move-result p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p2}, LK/U;->a(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p1, p4}, LK/i0;->p(ILjava/lang/String;Lx7/l;)V

    return v0
.end method

.method private final o(LK/z0;Landroid/view/inputmethod/InsertGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I
    .locals 8

    .prologue
    invoke-static {p2}, LK/T;->a(Landroid/view/inputmethod/InsertGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LK/j0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p3, v0, v1, p4}, LK/j0;->d(LK/y0;JLandroidx/compose/ui/platform/A1;)I

    move-result p3

    const/4 p4, -0x1

    if-ne p3, p4, :cond_0

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LK/i0;->c(LK/z0;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p2}, LK/U;->a(Landroid/view/inputmethod/InsertGesture;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, LM0/O;->a(I)J

    move-result-wide v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, LK/z0;->c(LK/z0;Ljava/lang/CharSequence;JLL/a;ZILjava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final p(ILjava/lang/String;Lx7/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    new-instance v0, LS0/U;

    invoke-direct {v0, p1, p1}, LS0/U;-><init>(II)V

    new-instance p1, LS0/a;

    const/4 v1, 0x1

    invoke-direct {p1, p2, v1}, LS0/a;-><init>(Ljava/lang/String;I)V

    const/4 p2, 0x2

    new-array p2, p2, [LS0/i;

    const/4 v2, 0x0

    aput-object v0, p2, v2

    aput-object p1, p2, v1

    invoke-static {p2}, LK/j0;->b([LS0/i;)LS0/i;

    move-result-object p1

    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final q(LH/w;Landroid/view/inputmethod/JoinOrSplitGesture;LM0/d;Landroidx/compose/ui/platform/A1;Lx7/l;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/JoinOrSplitGesture;",
            "LM0/d;",
            "Landroidx/compose/ui/platform/A1;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    if-nez p4, :cond_1

    :cond_0
    :goto_0
    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p5}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_1
    invoke-static {p2}, LK/Y;->a(Landroid/view/inputmethod/JoinOrSplitGesture;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-static {v0}, LK/j0;->l(Landroid/graphics/PointF;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p4}, LK/j0;->c(LH/w;JLandroidx/compose/ui/platform/A1;)I

    move-result p4

    const/4 v0, -0x1

    if-eq p4, v0, :cond_0

    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LH/V;->f()LM0/K;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1, p4}, LK/j0;->j(LM0/K;I)Z

    move-result p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p3, p4}, LK/j0;->k(Ljava/lang/CharSequence;I)J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v2, v3}, LM0/N;->n(J)I

    move-result p1

    const-string p2, " "

    invoke-direct {p0, p1, p2, p5}, LK/i0;->p(ILjava/lang/String;Lx7/l;)V

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LK/i0;->k(JLM0/d;ZLx7/l;)V

    :goto_1
    return v0
.end method

.method private final r(LK/z0;Landroid/view/inputmethod/JoinOrSplitGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method private final s(LH/w;Landroid/view/inputmethod/RemoveSpaceGesture;LM0/d;Landroidx/compose/ui/platform/A1;Lx7/l;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/RemoveSpaceGesture;",
            "LM0/d;",
            "Landroidx/compose/ui/platform/A1;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LH/V;->f()LM0/K;

    move-result-object v1

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-static {p2}, LK/V;->a(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-static {v1}, LK/j0;->l(Landroid/graphics/PointF;)J

    move-result-wide v3

    invoke-static {p2}, LK/W;->a(Landroid/view/inputmethod/RemoveSpaceGesture;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-static {v1}, LK/j0;->l(Landroid/graphics/PointF;)J

    move-result-wide v5

    invoke-virtual {p1}, LH/w;->i()LD0/t;

    move-result-object v7

    move-object v8, p4

    invoke-static/range {v2 .. v8}, LK/j0;->e(LM0/K;JJLD0/t;Landroidx/compose/ui/platform/A1;)J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p5}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ly7/M;

    invoke-direct {p1}, Ly7/M;-><init>()V

    const/4 p4, -0x1

    iput p4, p1, Ly7/M;->C:I

    new-instance v3, Ly7/M;

    invoke-direct {v3}, Ly7/M;-><init>()V

    iput p4, v3, Ly7/M;->C:I

    invoke-static {p3, v1, v2}, LM0/O;->e(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object p3

    new-instance v4, LS8/o;

    const-string v5, "\\s+"

    invoke-direct {v4, v5}, LS8/o;-><init>(Ljava/lang/String;)V

    new-instance v5, LK/i0$a;

    invoke-direct {v5, p1, v3}, LK/i0$a;-><init>(Ly7/M;Ly7/M;)V

    invoke-virtual {v4, p3, v5}, LS8/o;->f(Ljava/lang/CharSequence;Lx7/l;)Ljava/lang/String;

    move-result-object p3

    iget v4, p1, Ly7/M;->C:I

    if-eq v4, p4, :cond_3

    iget v4, v3, Ly7/M;->C:I

    if-ne v4, p4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v1, v2}, LM0/N;->n(J)I

    move-result p2

    iget p4, p1, Ly7/M;->C:I

    add-int/2addr p2, p4

    invoke-static {v1, v2}, LM0/N;->n(J)I

    move-result p4

    iget v4, v3, Ly7/M;->C:I

    add-int/2addr p4, v4

    iget p1, p1, Ly7/M;->C:I

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v1, v2}, LM0/N;->j(J)I

    move-result v1

    iget v2, v3, Ly7/M;->C:I

    sub-int/2addr v1, v2

    sub-int/2addr v4, v1

    invoke-virtual {p3, p1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p1, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, LS0/U;

    invoke-direct {p3, p2, p4}, LS0/U;-><init>(II)V

    new-instance p2, LS0/a;

    invoke-direct {p2, p1, v0}, LS0/a;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x2

    new-array p1, p1, [LS0/i;

    const/4 p4, 0x0

    aput-object p3, p1, p4

    aput-object p2, p1, v0

    invoke-static {p1}, LK/j0;->b([LS0/i;)LS0/i;

    move-result-object p1

    invoke-interface {p5, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return v0

    :cond_3
    :goto_2
    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p1

    invoke-direct {p0, p1, p5}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1
.end method

.method private final t(LK/z0;Landroid/view/inputmethod/RemoveSpaceGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method private final u(LH/w;Landroid/view/inputmethod/SelectGesture;LN/F;Lx7/l;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/SelectGesture;",
            "LN/F;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    invoke-static {p2}, LK/Q;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/S;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result v1

    invoke-direct {p0, v1}, LK/i0;->L(I)I

    move-result v1

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LK/j0;->f(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, v0, v1, p3, p4}, LK/i0;->y(JLN/F;Lx7/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final v(LK/z0;Landroid/view/inputmethod/SelectGesture;LK/y0;)I
    .locals 3

    .prologue
    invoke-static {p2}, LK/Q;->a(Landroid/view/inputmethod/SelectGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/S;->a(Landroid/view/inputmethod/SelectGesture;)I

    move-result v1

    invoke-direct {p0, v1}, LK/i0;->L(I)I

    move-result v1

    sget-object v2, LM0/I;->a:LM0/I$a;

    invoke-virtual {v2}, LM0/I$a;->h()LM0/I;

    move-result-object v2

    invoke-static {p3, v0, v1, v2}, LK/j0;->g(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LK/i0;->c(LK/z0;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private final w(LH/w;Landroid/view/inputmethod/SelectRangeGesture;LN/F;Lx7/l;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/SelectRangeGesture;",
            "LN/F;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    invoke-static {p2}, LK/A;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/L;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result v2

    invoke-direct {p0, v2}, LK/i0;->L(I)I

    move-result v2

    sget-object v3, LM0/I;->a:LM0/I$a;

    invoke-virtual {v3}, LM0/I$a;->h()LM0/I;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v3}, LK/j0;->h(LH/w;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p1, p2, p4}, LK/i0;->d(Landroid/view/inputmethod/HandwritingGesture;Lx7/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, v0, v1, p3, p4}, LK/i0;->y(JLN/F;Lx7/l;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final x(LK/z0;Landroid/view/inputmethod/SelectRangeGesture;LK/y0;)I
    .locals 4

    .prologue
    invoke-static {p2}, LK/A;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/L;->a(Landroid/view/inputmethod/SelectRangeGesture;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v1

    invoke-static {p2}, LK/X;->a(Landroid/view/inputmethod/SelectRangeGesture;)I

    move-result v2

    invoke-direct {p0, v2}, LK/i0;->L(I)I

    move-result v2

    sget-object v3, LM0/I;->a:LM0/I$a;

    invoke-virtual {v3}, LM0/I$a;->h()LM0/I;

    move-result-object v3

    invoke-static {p3, v0, v1, v2, v3}, LK/j0;->i(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LK/i0;->a:LK/i0;

    invoke-static {p2}, LK/d0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/HandwritingGesture;

    move-result-object p2

    invoke-direct {p3, p1, p2}, LK/i0;->c(LK/z0;Landroid/view/inputmethod/HandwritingGesture;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private final y(JLN/F;Lx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LN/F;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .prologue
    new-instance v0, LS0/U;

    invoke-static {p1, p2}, LM0/N;->n(J)I

    move-result v1

    invoke-static {p1, p2}, LM0/N;->i(J)I

    move-result p1

    invoke-direct {v0, v1, p1}, LS0/U;-><init>(II)V

    invoke-interface {p4, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, LN/F;->v(Z)V

    :cond_0
    return-void
.end method

.method private final z(LH/w;Landroid/view/inputmethod/DeleteGesture;LN/F;)V
    .locals 2

    .prologue
    if-eqz p3, :cond_0

    invoke-static {p2}, LK/H;->a(Landroid/view/inputmethod/DeleteGesture;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lo0/X1;->f(Landroid/graphics/RectF;)Ln0/i;

    move-result-object v0

    invoke-static {p2}, LK/I;->a(Landroid/view/inputmethod/DeleteGesture;)I

    move-result p2

    invoke-direct {p0, p2}, LK/i0;->L(I)I

    move-result p2

    sget-object v1, LM0/I;->a:LM0/I$a;

    invoke-virtual {v1}, LM0/I$a;->h()LM0/I;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, LK/j0;->f(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LN/F;->X(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final D(LH/w;Landroid/view/inputmethod/PreviewableHandwritingGesture;LN/F;Landroid/os/CancellationSignal;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, LH/w;->w()LM0/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LH/V;->f()LM0/K;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LM0/K;->l()LM0/J;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LM0/J;->j()LM0/d;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p2}, LK/e0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LK/f0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->H(LH/w;Landroid/view/inputmethod/SelectGesture;LN/F;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, LK/B;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LK/C;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->z(LH/w;Landroid/view/inputmethod/DeleteGesture;LN/F;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, LK/D;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, LK/E;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->J(LH/w;Landroid/view/inputmethod/SelectRangeGesture;LN/F;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, LK/F;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p2}, LK/G;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->B(LH/w;Landroid/view/inputmethod/DeleteRangeGesture;LN/F;)V

    :goto_1
    if-eqz p4, :cond_6

    new-instance p1, LK/g0;

    invoke-direct {p1, p3}, LK/g0;-><init>(LN/F;)V

    invoke-virtual {p4, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    :cond_6
    const/4 p1, 0x1

    return p1

    :cond_7
    return v1
.end method

.method public final E(LK/z0;Landroid/view/inputmethod/PreviewableHandwritingGesture;LK/y0;Landroid/os/CancellationSignal;)Z
    .locals 1

    .prologue
    invoke-static {p2}, LK/e0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, LK/f0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->I(LK/z0;Landroid/view/inputmethod/SelectGesture;LK/y0;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, LK/B;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, LK/C;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->A(LK/z0;Landroid/view/inputmethod/DeleteGesture;LK/y0;)V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LK/D;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, LK/E;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->K(LK/z0;Landroid/view/inputmethod/SelectRangeGesture;LK/y0;)V

    goto :goto_0

    :cond_2
    invoke-static {p2}, LK/F;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LK/G;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->C(LK/z0;Landroid/view/inputmethod/DeleteRangeGesture;LK/y0;)V

    :goto_0
    if-eqz p4, :cond_3

    new-instance p2, LK/h0;

    invoke-direct {p2, p1}, LK/h0;-><init>(LK/z0;)V

    invoke-virtual {p4, p2}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final l(LH/w;Landroid/view/inputmethod/HandwritingGesture;LN/F;Landroidx/compose/ui/platform/A1;Lx7/l;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH/w;",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "LN/F;",
            "Landroidx/compose/ui/platform/A1;",
            "Lx7/l;",
            ")I"
        }
    .end annotation

    .prologue
    invoke-virtual {p1}, LH/w;->w()LM0/d;

    move-result-object v3

    const/4 v0, 0x3

    if-nez v3, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, LH/w;->j()LH/V;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LH/V;->f()LM0/K;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LM0/K;->l()LM0/J;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LM0/J;->j()LM0/d;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v3, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-static {p2}, LK/e0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LK/f0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p5}, LK/i0;->u(LH/w;Landroid/view/inputmethod/SelectGesture;LN/F;Lx7/l;)I

    move-result p1

    goto/16 :goto_1

    :cond_3
    invoke-static {p2}, LK/B;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LK/C;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, v3, p5}, LK/i0;->f(LH/w;Landroid/view/inputmethod/DeleteGesture;LM0/d;Lx7/l;)I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-static {p2}, LK/D;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, LK/E;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p5}, LK/i0;->w(LH/w;Landroid/view/inputmethod/SelectRangeGesture;LN/F;Lx7/l;)I

    move-result p1

    goto :goto_1

    :cond_5
    invoke-static {p2}, LK/F;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p2}, LK/G;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, v3, p5}, LK/i0;->h(LH/w;Landroid/view/inputmethod/DeleteRangeGesture;LM0/d;Lx7/l;)I

    move-result p1

    goto :goto_1

    :cond_6
    invoke-static {p2}, LK/O;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p2}, LK/P;->a(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LK/i0;->q(LH/w;Landroid/view/inputmethod/JoinOrSplitGesture;LM0/d;Landroidx/compose/ui/platform/A1;Lx7/l;)I

    move-result p1

    goto :goto_1

    :cond_7
    invoke-static {p2}, LK/J;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {p2}, LK/K;->a(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p4, p5}, LK/i0;->n(LH/w;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/A1;Lx7/l;)I

    move-result p1

    goto :goto_1

    :cond_8
    invoke-static {p2}, LK/M;->a(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {p2}, LK/N;->a(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LK/i0;->s(LH/w;Landroid/view/inputmethod/RemoveSpaceGesture;LM0/d;Landroidx/compose/ui/platform/A1;Lx7/l;)I

    move-result p1

    goto :goto_1

    :cond_9
    const/4 p1, 0x2

    :goto_1
    return p1
.end method

.method public final m(LK/z0;Landroid/view/inputmethod/HandwritingGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I
    .locals 1

    .prologue
    invoke-static {p2}, LK/e0;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, LK/f0;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->v(LK/z0;Landroid/view/inputmethod/SelectGesture;LK/y0;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p2}, LK/B;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, LK/C;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->g(LK/z0;Landroid/view/inputmethod/DeleteGesture;LK/y0;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p2}, LK/D;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, LK/E;->a(Ljava/lang/Object;)Landroid/view/inputmethod/SelectRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->x(LK/z0;Landroid/view/inputmethod/SelectRangeGesture;LK/y0;)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {p2}, LK/F;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LK/G;->a(Ljava/lang/Object;)Landroid/view/inputmethod/DeleteRangeGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LK/i0;->i(LK/z0;Landroid/view/inputmethod/DeleteRangeGesture;LK/y0;)I

    move-result p1

    goto :goto_0

    :cond_3
    invoke-static {p2}, LK/O;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LK/P;->a(Ljava/lang/Object;)Landroid/view/inputmethod/JoinOrSplitGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LK/i0;->r(LK/z0;Landroid/view/inputmethod/JoinOrSplitGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I

    move-result p1

    goto :goto_0

    :cond_4
    invoke-static {p2}, LK/J;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, LK/K;->a(Ljava/lang/Object;)Landroid/view/inputmethod/InsertGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LK/i0;->o(LK/z0;Landroid/view/inputmethod/InsertGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I

    move-result p1

    goto :goto_0

    :cond_5
    invoke-static {p2}, LK/M;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p2}, LK/N;->a(Ljava/lang/Object;)Landroid/view/inputmethod/RemoveSpaceGesture;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LK/i0;->t(LK/z0;Landroid/view/inputmethod/RemoveSpaceGesture;LK/y0;Landroidx/compose/ui/platform/A1;)I

    move-result p1

    goto :goto_0

    :cond_6
    const/4 p1, 0x2

    :goto_0
    return p1
.end method
