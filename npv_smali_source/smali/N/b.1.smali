.class public abstract LN/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/b$a;
    }
.end annotation


# static fields
.field public static final h:LN/b$a;

.field public static final i:I


# instance fields
.field private final a:LM0/d;

.field private final b:J

.field private final c:LM0/K;

.field private final d:LS0/L;

.field private final e:LN/I;

.field private f:J

.field private g:LM0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/b$a;-><init>(Ly7/k;)V

    sput-object v0, LN/b;->h:LN/b$a;

    const/16 v0, 0x8

    sput v0, LN/b;->i:I

    return-void
.end method

.method private constructor <init>(LM0/d;JLM0/K;LS0/L;LN/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/b;->a:LM0/d;

    iput-wide p2, p0, LN/b;->b:J

    iput-object p4, p0, LN/b;->c:LM0/K;

    iput-object p5, p0, LN/b;->d:LS0/L;

    iput-object p6, p0, LN/b;->e:LN/I;

    iput-wide p2, p0, LN/b;->f:J

    iput-object p1, p0, LN/b;->g:LM0/d;

    return-void
.end method

.method public synthetic constructor <init>(LM0/d;JLM0/K;LS0/L;LN/I;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LN/b;-><init>(LM0/d;JLM0/K;LS0/L;LN/I;)V

    return-void
.end method

.method private final C()LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->l()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final E()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->m()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final F()LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final H()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->t()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final V()I
    .locals 3

    iget-object v0, p0, LN/b;->d:LS0/L;

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->b(I)I

    move-result v0

    return v0
.end method

.method private final W()I
    .locals 3

    iget-object v0, p0, LN/b;->d:LS0/L;

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->b(I)I

    move-result v0

    return v0
.end method

.method private final X()I
    .locals 3

    iget-object v0, p0, LN/b;->d:LS0/L;

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LS0/L;->b(I)I

    move-result v0

    return v0
.end method

.method private final a(I)I
    .locals 1

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, LE7/j;->g(II)I

    move-result p1

    return p1
.end method

.method private final g(LM0/K;I)I
    .locals 2

    invoke-virtual {p1, p2}, LM0/K;->q(I)I

    move-result p2

    iget-object v0, p0, LN/b;->d:LS0/L;

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v1}, LM0/K;->o(IZ)I

    move-result p1

    invoke-interface {v0, p1}, LS0/L;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic h(LN/b;LM0/K;IILjava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LN/b;->W()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LN/b;->g(LM0/K;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final j(LM0/K;I)I
    .locals 1

    invoke-virtual {p1, p2}, LM0/K;->q(I)I

    move-result p2

    iget-object v0, p0, LN/b;->d:LS0/L;

    invoke-virtual {p1, p2}, LM0/K;->u(I)I

    move-result p1

    invoke-interface {v0, p1}, LS0/L;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic k(LN/b;LM0/K;IILjava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LN/b;->X()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LN/b;->j(LM0/K;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final n(LM0/K;I)I
    .locals 3

    .prologue
    :goto_0
    iget-object v0, p0, LN/b;->a:LM0/d;

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object p1, p0, LN/b;->a:LM0/d;

    invoke-virtual {p1}, LM0/d;->length()I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p2}, LN/b;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LM0/K;->C(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->i(J)I

    move-result v2

    if-gt v2, p2, :cond_1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LN/b;->d:LS0/L;

    invoke-static {v0, v1}, LM0/N;->i(J)I

    move-result p2

    invoke-interface {p1, p2}, LS0/L;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic o(LN/b;LM0/K;IILjava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LN/b;->V()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LN/b;->n(LM0/K;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final r(LM0/K;I)I
    .locals 3

    .prologue
    :goto_0
    if-gtz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p2}, LN/b;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LM0/K;->C(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->n(J)I

    move-result v2

    if-lt v2, p2, :cond_1

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LN/b;->d:LS0/L;

    invoke-static {v0, v1}, LM0/N;->n(J)I

    move-result p2

    invoke-interface {p1, p2}, LS0/L;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic s(LN/b;LM0/K;IILjava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LN/b;->V()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LN/b;->r(LM0/K;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getPrevWordOffset"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final x()Z
    .locals 2

    .prologue
    iget-object v0, p0, LN/b;->c:LM0/K;

    if-eqz v0, :cond_0

    invoke-direct {p0}, LN/b;->V()I

    move-result v1

    invoke-virtual {v0, v1}, LM0/K;->y(I)LX0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, LX0/i;->D:LX0/i;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private final y(LM0/K;I)I
    .locals 5

    .prologue
    invoke-direct {p0}, LN/b;->V()I

    move-result v0

    iget-object v1, p0, LN/b;->e:LN/I;

    invoke-virtual {v1}, LN/I;->a()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, LN/b;->e:LN/I;

    invoke-virtual {p1, v0}, LM0/K;->e(I)Ln0/i;

    move-result-object v2

    invoke-virtual {v2}, Ln0/i;->i()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, LN/I;->c(Ljava/lang/Float;)V

    :cond_0
    invoke-virtual {p1, v0}, LM0/K;->q(I)I

    move-result v0

    add-int/2addr v0, p2

    if-gez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p1}, LM0/K;->n()I

    move-result p2

    if-lt v0, p2, :cond_2

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1, v0}, LM0/K;->m(I)F

    move-result p2

    const/4 v1, 0x1

    int-to-float v2, v1

    sub-float/2addr p2, v2

    iget-object v2, p0, LN/b;->e:LN/I;

    invoke-virtual {v2}, LN/I;->a()Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-direct {p0}, LN/b;->x()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v0}, LM0/K;->t(I)F

    move-result v4

    cmpl-float v4, v3, v4

    if-gez v4, :cond_4

    :cond_3
    invoke-direct {p0}, LN/b;->x()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p1, v0}, LM0/K;->s(I)F

    move-result v4

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_5

    :cond_4
    invoke-virtual {p1, v0, v1}, LM0/K;->o(IZ)I

    move-result p1

    return p1

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0, p2}, Ln0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LM0/K;->x(J)I

    move-result p1

    iget-object p2, p0, LN/b;->d:LS0/L;

    invoke-interface {p2, p1}, LS0/L;->a(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final A()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LN/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LN/b;->F()LN/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LN/b;->C()LN/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LN/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LN/b;->H()LN/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LN/b;->E()LN/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final D()LN/b;
    .locals 3

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result v1

    invoke-static {v0, v1}, LH/z;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->k(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, LH/z;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final G()LN/b;
    .locals 3

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result v1

    invoke-static {v0, v1}, LH/z;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->l(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v1, v0}, LH/z;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final I()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LN/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LN/b;->C()LN/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LN/b;->F()LN/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final J()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LN/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LN/b;->E()LN/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LN/b;->H()LN/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final K()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final L()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final M()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->f()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final N()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LN/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN/b;->P()LN/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/b;->M()LN/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final O()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LN/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN/b;->M()LN/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/b;->P()LN/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final P()LN/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->i()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final Q()LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LN/b;->c:LM0/K;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, LN/b;->y(LM0/K;I)I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final R()LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, LN/b;->U(II)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final S()LN/b;
    .locals 3

    .prologue
    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LN/b;->b:J

    invoke-static {v0, v1}, LM0/N;->n(J)I

    move-result v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LM0/O;->b(II)J

    move-result-wide v0

    iput-wide v0, p0, LN/b;->f:J

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method protected final T(I)V
    .locals 0

    invoke-virtual {p0, p1, p1}, LN/b;->U(II)V

    return-void
.end method

.method protected final U(II)V
    .locals 0

    invoke-static {p1, p2}, LM0/O;->b(II)J

    move-result-wide p1

    iput-wide p1, p0, LN/b;->f:J

    return-void
.end method

.method public final b(Lx7/l;)LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-wide v0, p0, LN/b;->f:J

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-direct {p0}, LN/b;->x()Z

    move-result p1

    iget-wide v0, p0, LN/b;->f:J

    if-eqz p1, :cond_1

    invoke-static {v0, v1}, LM0/N;->l(J)I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, LN/b;->T(I)V

    goto :goto_1

    :cond_1
    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result p1

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c(Lx7/l;)LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-wide v0, p0, LN/b;->f:J

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-direct {p0}, LN/b;->x()Z

    move-result p1

    iget-wide v0, p0, LN/b;->f:J

    if-eqz p1, :cond_1

    invoke-static {v0, v1}, LM0/N;->k(J)I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, LN/b;->T(I)V

    goto :goto_1

    :cond_1
    invoke-static {v0, v1}, LM0/N;->l(J)I

    move-result p1

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final d()LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->v()LN/I;

    move-result-object v0

    invoke-virtual {v0}, LN/I;->b()V

    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LN/b;->f:J

    invoke-static {v0, v1}, LM0/N;->i(J)I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final e()LM0/d;
    .locals 1

    iget-object v0, p0, LN/b;->g:LM0/d;

    return-object v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 4

    .prologue
    iget-object v0, p0, LN/b;->c:LM0/K;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LN/b;->h(LN/b;LM0/K;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final i()Ljava/lang/Integer;
    .locals 4

    .prologue
    iget-object v0, p0, LN/b;->c:LM0/K;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LN/b;->k(LN/b;LM0/K;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final l()I
    .locals 3

    iget-object v0, p0, LN/b;->g:LM0/d;

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LH/A;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final m()Ljava/lang/Integer;
    .locals 4

    .prologue
    iget-object v0, p0, LN/b;->c:LM0/K;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LN/b;->o(LN/b;LM0/K;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final p()LS0/L;
    .locals 1

    iget-object v0, p0, LN/b;->d:LS0/L;

    return-object v0
.end method

.method public final q()I
    .locals 3

    iget-object v0, p0, LN/b;->g:LM0/d;

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LN/b;->f:J

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LH/A;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final t()Ljava/lang/Integer;
    .locals 4

    .prologue
    iget-object v0, p0, LN/b;->c:LM0/K;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LN/b;->s(LN/b;LM0/K;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final u()J
    .locals 2

    iget-wide v0, p0, LN/b;->f:J

    return-wide v0
.end method

.method public final v()LN/I;
    .locals 1

    iget-object v0, p0, LN/b;->e:LN/I;

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LN/b;->g:LM0/d;

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()LN/b;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LN/b;->c:LM0/K;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LN/b;->y(LM0/K;I)I

    move-result v0

    invoke-virtual {p0, v0}, LN/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
