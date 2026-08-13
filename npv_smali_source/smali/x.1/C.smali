.class public final Lx/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lx/A;

.field private b:Lv/T;

.field private c:Lx/p;

.field private d:Lx/s;

.field private e:Z

.field private f:Ly0/c;

.field private g:I

.field private h:Lx/w;

.field private final i:Lx/C$c;

.field private final j:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx/A;Lv/T;Lx/p;Lx/s;ZLy0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/C;->a:Lx/A;

    iput-object p2, p0, Lx/C;->b:Lv/T;

    iput-object p3, p0, Lx/C;->c:Lx/p;

    iput-object p4, p0, Lx/C;->d:Lx/s;

    iput-boolean p5, p0, Lx/C;->e:Z

    iput-object p6, p0, Lx/C;->f:Ly0/c;

    sget-object p1, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {p1}, Ly0/f$a;->b()I

    move-result p1

    iput p1, p0, Lx/C;->g:I

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->b()Lx/w;

    move-result-object p1

    iput-object p1, p0, Lx/C;->h:Lx/w;

    new-instance p1, Lx/C$c;

    invoke-direct {p1, p0}, Lx/C$c;-><init>(Lx/C;)V

    iput-object p1, p0, Lx/C;->i:Lx/C$c;

    new-instance p1, Lx/C$e;

    invoke-direct {p1, p0}, Lx/C$e;-><init>(Lx/C;)V

    iput-object p1, p0, Lx/C;->j:Lx7/l;

    return-void
.end method

.method private final D(JF)J
    .locals 8

    .prologue
    iget-object v0, p0, Lx/C;->d:Lx/s;

    sget-object v1, Lx/s;->D:Lx/s;

    if-ne v0, v1, :cond_0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-wide v2, p1

    move v4, p3

    invoke-static/range {v2 .. v7}, LY0/A;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-wide v0, p1

    move v3, p3

    invoke-static/range {v0 .. v5}, LY0/A;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public static final synthetic a(Lx/C;)Lx/p;
    .locals 0

    iget-object p0, p0, Lx/C;->c:Lx/p;

    return-object p0
.end method

.method public static final synthetic b(Lx/C;)I
    .locals 0

    iget p0, p0, Lx/C;->g:I

    return p0
.end method

.method public static final synthetic c(Lx/C;)Ly0/c;
    .locals 0

    iget-object p0, p0, Lx/C;->f:Ly0/c;

    return-object p0
.end method

.method public static final synthetic d(Lx/C;)Lx/C$c;
    .locals 0

    iget-object p0, p0, Lx/C;->i:Lx/C$c;

    return-object p0
.end method

.method public static final synthetic e(Lx/C;)Lx/w;
    .locals 0

    iget-object p0, p0, Lx/C;->h:Lx/w;

    return-object p0
.end method

.method public static final synthetic f(Lx/C;)Lv/T;
    .locals 0

    iget-object p0, p0, Lx/C;->b:Lv/T;

    return-object p0
.end method

.method public static final synthetic g(Lx/C;)Lx7/l;
    .locals 0

    iget-object p0, p0, Lx/C;->j:Lx7/l;

    return-object p0
.end method

.method public static final synthetic h(Lx/C;)Z
    .locals 0

    invoke-direct {p0}, Lx/C;->o()Z

    move-result p0

    return p0
.end method

.method public static final synthetic i(Lx/C;Lx/w;JI)J
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lx/C;->s(Lx/w;JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic j(Lx/C;I)V
    .locals 0

    iput p1, p0, Lx/C;->g:I

    return-void
.end method

.method public static final synthetic k(Lx/C;Lx/w;)V
    .locals 0

    iput-object p1, p0, Lx/C;->h:Lx/w;

    return-void
.end method

.method public static final synthetic l(Lx/C;J)F
    .locals 0

    invoke-direct {p0, p1, p2}, Lx/C;->z(J)F

    move-result p0

    return p0
.end method

.method public static final synthetic m(Lx/C;JF)J
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lx/C;->D(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method private final o()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lx/C;->a:Lx/A;

    invoke-interface {v0}, Lx/A;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lx/C;->a:Lx/A;

    invoke-interface {v0}, Lx/A;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final s(Lx/w;JI)J
    .locals 10

    iget-object v0, p0, Lx/C;->f:Ly0/c;

    invoke-virtual {v0, p2, p3, p4}, Ly0/c;->d(JI)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ln0/g;->q(JJ)J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lx/C;->x(J)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lx/C;->u(J)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lx/C;->A(J)F

    move-result v2

    invoke-interface {p1, v2}, Lx/w;->a(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lx/C;->B(F)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lx/C;->u(J)J

    move-result-wide v2

    invoke-static {p2, p3, v2, v3}, Ln0/g;->q(JJ)J

    move-result-wide v7

    iget-object v4, p0, Lx/C;->f:Ly0/c;

    move-wide v5, v2

    move v9, p4

    invoke-virtual/range {v4 .. v9}, Ly0/c;->b(JJI)J

    move-result-wide p1

    invoke-static {v0, v1, v2, v3}, Ln0/g;->r(JJ)J

    move-result-wide p3

    invoke-static {p3, p4, p1, p2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private final y(J)J
    .locals 8

    .prologue
    iget-object v0, p0, Lx/C;->d:Lx/s;

    sget-object v1, Lx/s;->D:Lx/s;

    if-ne v0, v1, :cond_0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v2, p1

    invoke-static/range {v2 .. v7}, LY0/A;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, LY0/A;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private final z(J)F
    .locals 2

    .prologue
    iget-object v0, p0, Lx/C;->d:Lx/s;

    sget-object v1, Lx/s;->D:Lx/s;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result p1

    :goto_0
    return p1
.end method


# virtual methods
.method public final A(J)F
    .locals 2

    .prologue
    iget-object v0, p0, Lx/C;->d:Lx/s;

    sget-object v1, Lx/s;->D:Lx/s;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method public final B(F)J
    .locals 3

    .prologue
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lx/C;->d:Lx/s;

    sget-object v2, Lx/s;->D:Lx/s;

    if-ne v1, v2, :cond_1

    invoke-static {p1, v0}, Ln0/h;->a(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final C(Lx/A;Lx/s;Lv/T;ZLx/p;Ly0/c;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Lx/C;->a:Lx/A;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lx/C;->a:Lx/A;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p3, p0, Lx/C;->b:Lv/T;

    iget-object p3, p0, Lx/C;->d:Lx/s;

    if-eq p3, p2, :cond_1

    iput-object p2, p0, Lx/C;->d:Lx/s;

    move p1, v1

    :cond_1
    iget-boolean p2, p0, Lx/C;->e:Z

    if-eq p2, p4, :cond_2

    iput-boolean p4, p0, Lx/C;->e:Z

    goto :goto_1

    :cond_2
    move v1, p1

    :goto_1
    iput-object p5, p0, Lx/C;->c:Lx/p;

    iput-object p6, p0, Lx/C;->f:Ly0/c;

    return v1
.end method

.method public final n(JLm7/e;)Ljava/lang/Object;
    .locals 11

    .prologue
    instance-of v0, p3, Lx/C$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx/C$a;

    iget v1, v0, Lx/C$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/C$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/C$a;

    invoke-direct {v0, p0, p3}, Lx/C$a;-><init>(Lx/C;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lx/C$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/C$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lx/C$a;->F:Ljava/lang/Object;

    check-cast p1, Ly7/N;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p3, Ly7/N;

    invoke-direct {p3}, Ly7/N;-><init>()V

    iput-wide p1, p3, Ly7/N;->C:J

    sget-object v2, Lv/L;->C:Lv/L;

    new-instance v10, Lx/C$b;

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, p0

    move-object v6, p3

    move-wide v7, p1

    invoke-direct/range {v4 .. v9}, Lx/C$b;-><init>(Lx/C;Ly7/N;JLm7/e;)V

    iput-object p3, v0, Lx/C$a;->F:Ljava/lang/Object;

    iput v3, v0, Lx/C$a;->I:I

    invoke-virtual {p0, v2, v10, v0}, Lx/C;->v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p3

    :goto_1
    iget-wide p1, p1, Ly7/N;->C:J

    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    return-object p1
.end method

.method public final p()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lx/C;->d:Lx/s;

    sget-object v1, Lx/s;->C:Lx/s;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q(JLm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0, p1, p2}, Lx/C;->y(J)J

    move-result-wide p1

    new-instance v0, Lx/C$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx/C$d;-><init>(Lx/C;Lm7/e;)V

    iget-object v1, p0, Lx/C;->b:Lv/T;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lx/C;->o()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1, p1, p2, v0, p3}, Lv/T;->b(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final r(J)J
    .locals 1

    .prologue
    iget-object v0, p0, Lx/C;->a:Lx/A;

    invoke-interface {v0}, Lx/A;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/C;->a:Lx/A;

    invoke-virtual {p0, p1, p2}, Lx/C;->A(J)F

    move-result p1

    invoke-virtual {p0, p1}, Lx/C;->t(F)F

    move-result p1

    invoke-interface {v0, p1}, Lx/A;->e(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lx/C;->t(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lx/C;->B(F)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final t(F)F
    .locals 1

    .prologue
    iget-boolean v0, p0, Lx/C;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr p1, v0

    :cond_0
    return p1
.end method

.method public final u(J)J
    .locals 1

    .prologue
    iget-boolean v0, p0, Lx/C;->e:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p1, p2, v0}, Ln0/g;->s(JF)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Lx/C;->a:Lx/A;

    new-instance v1, Lx/C$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, v2}, Lx/C$f;-><init>(Lx/C;Lx7/p;Lm7/e;)V

    invoke-interface {v0, p1, v1, p3}, Lx/A;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final w()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lx/C;->a:Lx/A;

    invoke-interface {v0}, Lx/A;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lx/C;->b:Lv/T;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv/T;->d()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final x(J)J
    .locals 8

    .prologue
    iget-object v0, p0, Lx/C;->d:Lx/s;

    sget-object v1, Lx/s;->D:Lx/s;

    if-ne v0, v1, :cond_0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v2, p1

    invoke-static/range {v2 .. v7}, Ln0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Ln0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method
