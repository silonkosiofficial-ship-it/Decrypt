.class public abstract LD0/X$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LD0/X$a;)LY0/v;
    .locals 0

    invoke-virtual {p0}, LD0/X$a;->d()LY0/v;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LD0/X$a;)I
    .locals 0

    invoke-virtual {p0}, LD0/X$a;->e()I

    move-result p0

    return p0
.end method

.method public static final synthetic c(LD0/X$a;LD0/X;)V
    .locals 0

    invoke-direct {p0, p1}, LD0/X$a;->f(LD0/X;)V

    return-void
.end method

.method private final f(LD0/X;)V
    .locals 1

    .prologue
    instance-of v0, p1, LF0/X;

    if-eqz v0, :cond_0

    check-cast p1, LF0/X;

    iget-boolean v0, p0, LD0/X$a;->a:Z

    invoke-interface {p1, v0}, LF0/X;->g0(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X$a;->g(LD0/X;IIF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: place"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X$a;->i(LD0/X;JF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: place-70tqf50"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X$a;->k(LD0/X;IIF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeRelative"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic n(LD0/X$a;LD0/X;JFILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X$a;->m(LD0/X;JF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeRelative-70tqf50"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic p(LD0/X$a;LD0/X;IIFLx7/l;ILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    invoke-static {}, LD0/Y;->d()Lx7/l;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->o(LD0/X;IIFLx7/l;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeRelativeWithLayer"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic s(LD0/X$a;LD0/X;JFLx7/l;ILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, LD0/Y;->d()Lx7/l;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->q(LD0/X;JFLx7/l;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic t(LD0/X$a;LD0/X;JLr0/c;FILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->r(LD0/X;JLr0/c;F)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic v(LD0/X$a;LD0/X;IIFLx7/l;ILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    invoke-static {}, LD0/Y;->d()Lx7/l;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->u(LD0/X;IIFLx7/l;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeWithLayer"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic y(LD0/X$a;LD0/X;JFLx7/l;ILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, LD0/Y;->d()Lx7/l;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->w(LD0/X;JFLx7/l;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic z(LD0/X$a;LD0/X;JLr0/c;FILjava/lang/Object;)V
    .locals 6

    .prologue
    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LD0/X$a;->x(LD0/X;JLr0/c;F)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A(Lx7/l;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LD0/X$a;->a:Z

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, LD0/X$a;->a:Z

    return-void
.end method

.method protected abstract d()LY0/v;
.end method

.method protected abstract e()I
.end method

.method public final g(LD0/X;IIF)V
    .locals 2

    invoke-static {p2, p3}, LY0/q;->a(II)J

    move-result-wide p2

    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, p4, v0}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final i(LD0/X;JF)V
    .locals 2

    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, p4, v0}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final k(LD0/X;IIF)V
    .locals 3

    .prologue
    invoke-static {p2, p3}, LY0/q;->a(II)J

    move-result-wide p2

    invoke-static {p0}, LD0/X$a;->a(LD0/X$a;)LY0/v;

    move-result-object v0

    sget-object v1, LY0/v;->C:LY0/v;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->h(J)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->i(J)I

    move-result p2

    invoke-static {v0, p2}, LY0/q;->a(II)J

    move-result-wide p2

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p4, v2}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final m(LD0/X;JF)V
    .locals 3

    .prologue
    invoke-static {p0}, LD0/X$a;->a(LD0/X$a;)LY0/v;

    move-result-object v0

    sget-object v1, LY0/v;->C:LY0/v;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->h(J)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->i(J)I

    move-result p2

    invoke-static {v0, p2}, LY0/q;->a(II)J

    move-result-wide p2

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p4, v2}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final o(LD0/X;IIFLx7/l;)V
    .locals 2

    .prologue
    invoke-static {p2, p3}, LY0/q;->a(II)J

    move-result-wide p2

    invoke-static {p0}, LD0/X$a;->a(LD0/X$a;)LY0/v;

    move-result-object v0

    sget-object v1, LY0/v;->C:LY0/v;

    if-eq v0, v1, :cond_1

    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->h(J)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->i(J)I

    move-result p2

    invoke-static {v0, p2}, LY0/q;->a(II)J

    move-result-wide p2

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p4, p5}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final q(LD0/X;JFLx7/l;)V
    .locals 2

    .prologue
    invoke-static {p0}, LD0/X$a;->a(LD0/X$a;)LY0/v;

    move-result-object v0

    sget-object v1, LY0/v;->C:LY0/v;

    if-eq v0, v1, :cond_1

    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->h(J)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->i(J)I

    move-result p2

    invoke-static {v0, p2}, LY0/q;->a(II)J

    move-result-wide p2

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p4, p5}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final r(LD0/X;JLr0/c;F)V
    .locals 2

    .prologue
    invoke-static {p0}, LD0/X$a;->a(LD0/X$a;)LY0/v;

    move-result-object v0

    sget-object v1, LY0/v;->C:LY0/v;

    if-eq v0, v1, :cond_1

    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LD0/X$a;->b(LD0/X$a;)I

    move-result v0

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->h(J)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, p3}, LY0/p;->i(J)I

    move-result p2

    invoke-static {v0, p2}, LY0/q;->a(II)J

    move-result-wide p2

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p5, p4}, LD0/X;->s0(LD0/X;JFLr0/c;)V

    return-void
.end method

.method public final u(LD0/X;IIFLx7/l;)V
    .locals 2

    invoke-static {p2, p3}, LY0/q;->a(II)J

    move-result-wide p2

    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p4, p5}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final w(LD0/X;JFLx7/l;)V
    .locals 2

    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p4, p5}, LD0/X;->t0(LD0/X;JFLx7/l;)V

    return-void
.end method

.method public final x(LD0/X;JLr0/c;F)V
    .locals 2

    invoke-static {p0, p1}, LD0/X$a;->c(LD0/X$a;LD0/X;)V

    invoke-static {p1}, LD0/X;->r0(LD0/X;)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/p;->l(JJ)J

    move-result-wide p2

    invoke-static {p1, p2, p3, p5, p4}, LD0/X;->s0(LD0/X;JFLr0/c;)V

    return-void
.end method
