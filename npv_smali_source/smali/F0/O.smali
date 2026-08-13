.class public final LF0/O;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF0/O$a;,
        LF0/O$b;
    }
.end annotation


# instance fields
.field private final a:LF0/J;

.field private b:Z

.field private c:LF0/J$e;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:I

.field private o:Z

.field private p:Z

.field private q:I

.field private final r:LF0/O$b;

.field private s:LF0/O$a;

.field private t:J

.field private final u:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/O;->a:LF0/J;

    sget-object p1, LF0/J$e;->G:LF0/J$e;

    iput-object p1, p0, LF0/O;->c:LF0/J$e;

    new-instance p1, LF0/O$b;

    invoke-direct {p1, p0}, LF0/O$b;-><init>(LF0/O;)V

    iput-object p1, p0, LF0/O;->r:LF0/O$b;

    const/16 v4, 0xf

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, LF0/O;->t:J

    new-instance p1, LF0/O$d;

    invoke-direct {p1, p0}, LF0/O$d;-><init>(LF0/O;)V

    iput-object p1, p0, LF0/O;->u:Lx7/a;

    return-void
.end method

.method private final T(J)V
    .locals 7

    .prologue
    sget-object v0, LF0/J$e;->D:LF0/J$e;

    iput-object v0, p0, LF0/O;->c:LF0/J$e;

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/O;->g:Z

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-static {v0}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v1

    iget-object v2, p0, LF0/O;->a:LF0/J;

    new-instance v4, LF0/O$c;

    invoke-direct {v4, p0, p1, p2}, LF0/O$c;-><init>(LF0/O;J)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF0/q0;->h(LF0/q0;LF0/J;ZLx7/a;ILjava/lang/Object;)V

    invoke-virtual {p0}, LF0/O;->P()V

    iget-object p1, p0, LF0/O;->a:LF0/J;

    invoke-static {p1}, LF0/P;->a(LF0/J;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LF0/O;->O()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LF0/O;->R()V

    :goto_0
    sget-object p1, LF0/J$e;->G:LF0/J$e;

    iput-object p1, p0, LF0/O;->c:LF0/J$e;

    return-void
.end method

.method private final U(J)V
    .locals 4

    .prologue
    iget-object v0, p0, LF0/O;->c:LF0/J$e;

    sget-object v1, LF0/J$e;->G:LF0/J$e;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "layout state is not idle before measure starts"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    sget-object v0, LF0/J$e;->C:LF0/J$e;

    iput-object v0, p0, LF0/O;->c:LF0/J$e;

    iput-boolean v2, p0, LF0/O;->d:Z

    iput-wide p1, p0, LF0/O;->t:J

    iget-object p1, p0, LF0/O;->a:LF0/J;

    invoke-static {p1}, LF0/N;->b(LF0/J;)LF0/o0;

    move-result-object p1

    invoke-interface {p1}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object p1

    iget-object p2, p0, LF0/O;->a:LF0/J;

    iget-object v3, p0, LF0/O;->u:Lx7/a;

    invoke-virtual {p1, p2, v2, v3}, LF0/q0;->g(LF0/J;ZLx7/a;)V

    iget-object p1, p0, LF0/O;->c:LF0/J$e;

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, LF0/O;->O()V

    iput-object v1, p0, LF0/O;->c:LF0/J$e;

    :cond_2
    return-void
.end method

.method public static final synthetic a(LF0/O;)LF0/J;
    .locals 0

    iget-object p0, p0, LF0/O;->a:LF0/J;

    return-object p0
.end method

.method public static final synthetic b(LF0/O;)Z
    .locals 0

    iget-boolean p0, p0, LF0/O;->f:Z

    return p0
.end method

.method public static final synthetic c(LF0/O;)Z
    .locals 0

    iget-boolean p0, p0, LF0/O;->i:Z

    return p0
.end method

.method public static final synthetic d(LF0/O;)I
    .locals 0

    iget p0, p0, LF0/O;->j:I

    return p0
.end method

.method public static final synthetic e(LF0/O;)I
    .locals 0

    iget p0, p0, LF0/O;->k:I

    return p0
.end method

.method public static final synthetic f(LF0/O;)J
    .locals 2

    iget-wide v0, p0, LF0/O;->t:J

    return-wide v0
.end method

.method public static final synthetic g(LF0/O;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF0/O;->T(J)V

    return-void
.end method

.method public static final synthetic h(LF0/O;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF0/O;->U(J)V

    return-void
.end method

.method public static final synthetic i(LF0/O;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O;->b:Z

    return-void
.end method

.method public static final synthetic j(LF0/O;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O;->e:Z

    return-void
.end method

.method public static final synthetic k(LF0/O;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O;->f:Z

    return-void
.end method

.method public static final synthetic l(LF0/O;LF0/J$e;)V
    .locals 0

    iput-object p1, p0, LF0/O;->c:LF0/J$e;

    return-void
.end method

.method public static final synthetic m(LF0/O;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O;->h:Z

    return-void
.end method

.method public static final synthetic n(LF0/O;Z)V
    .locals 0

    iput-boolean p1, p0, LF0/O;->i:Z

    return-void
.end method

.method public static final synthetic o(LF0/O;I)V
    .locals 0

    iput p1, p0, LF0/O;->j:I

    return-void
.end method

.method public static final synthetic p(LF0/O;I)V
    .locals 0

    iput p1, p0, LF0/O;->k:I

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->e:Z

    return v0
.end method

.method public final B()LF0/J$e;
    .locals 1

    iget-object v0, p0, LF0/O;->c:LF0/J$e;

    return-object v0
.end method

.method public final C()LF0/b;
    .locals 1

    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    return-object v0
.end method

.method public final D()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->p:Z

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->o:Z

    return v0
.end method

.method public final F()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->h:Z

    return v0
.end method

.method public final G()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->g:Z

    return v0
.end method

.method public final H()LF0/O$a;
    .locals 1

    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    return-object v0
.end method

.method public final I()LF0/O$b;
    .locals 1

    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    return-object v0
.end method

.method public final J()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->d:Z

    return v0
.end method

.method public final K()LF0/d0;
    .locals 1

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->k0()LF0/b0;

    move-result-object v0

    invoke-virtual {v0}, LF0/b0;->n()LF0/d0;

    move-result-object v0

    return-object v0
.end method

.method public final L()I
    .locals 1

    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v0}, LD0/X;->I0()I

    move-result v0

    return v0
.end method

.method public final M()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v0}, LF0/O$b;->w1()V

    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/O$a;->s1()V

    :cond_0
    return-void
.end method

.method public final N()V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LF0/O$b;->K1(Z)V

    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, LF0/O$a;->D1(Z)V

    :cond_0
    return-void
.end method

.method public final O()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O;->e:Z

    iput-boolean v0, p0, LF0/O;->f:Z

    return-void
.end method

.method public final P()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O;->h:Z

    iput-boolean v0, p0, LF0/O;->i:Z

    return-void
.end method

.method public final Q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O;->g:Z

    return-void
.end method

.method public final R()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/O;->d:Z

    return-void
.end method

.method public final S()V
    .locals 3

    .prologue
    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->X()LF0/J$e;

    move-result-object v0

    sget-object v1, LF0/J$e;->E:LF0/J$e;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    sget-object v1, LF0/J$e;->F:LF0/J$e;

    if-ne v0, v1, :cond_2

    :cond_0
    iget-object v1, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v1}, LF0/O$b;->r1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2}, LF0/O;->Z(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, LF0/O;->Y(Z)V

    :cond_2
    :goto_0
    sget-object v1, LF0/J$e;->F:LF0/J$e;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LF0/O$a;->m1()Z

    move-result v0

    if-ne v0, v2, :cond_3

    invoke-virtual {p0, v2}, LF0/O;->b0(Z)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v2}, LF0/O;->a0(Z)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final V()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v0}, LF0/O$b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->p()V

    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/O$a;->f()LF0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/a;->p()V

    :cond_0
    return-void
.end method

.method public final W(I)V
    .locals 3

    .prologue
    iget v0, p0, LF0/O;->n:I

    iput p1, p0, LF0/O;->n:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez p1, :cond_1

    move v1, v2

    :cond_1
    if-eq v0, v1, :cond_4

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    if-nez p1, :cond_3

    iget p1, v0, LF0/O;->n:I

    add-int/lit8 p1, p1, -0x1

    :goto_2
    invoke-virtual {v0, p1}, LF0/O;->W(I)V

    goto :goto_3

    :cond_3
    iget p1, v0, LF0/O;->n:I

    add-int/2addr p1, v2

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method public final X(I)V
    .locals 3

    .prologue
    iget v0, p0, LF0/O;->q:I

    iput p1, p0, LF0/O;->q:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez p1, :cond_1

    move v1, v2

    :cond_1
    if-eq v0, v1, :cond_4

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/J;->V()LF0/O;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    if-nez p1, :cond_3

    iget p1, v0, LF0/O;->q:I

    add-int/lit8 p1, p1, -0x1

    :goto_2
    invoke-virtual {v0, p1}, LF0/O;->X(I)V

    goto :goto_3

    :cond_3
    iget p1, v0, LF0/O;->q:I

    add-int/2addr p1, v2

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method

.method public final Y(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, LF0/O;->m:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, LF0/O;->m:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LF0/O;->l:Z

    if-nez v0, :cond_0

    iget p1, p0, LF0/O;->n:I

    add-int/lit8 p1, p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, LF0/O;->W(I)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, LF0/O;->l:Z

    if-nez p1, :cond_1

    iget p1, p0, LF0/O;->n:I

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final Z(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, LF0/O;->l:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, LF0/O;->l:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LF0/O;->m:Z

    if-nez v0, :cond_0

    iget p1, p0, LF0/O;->n:I

    add-int/lit8 p1, p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, LF0/O;->W(I)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, LF0/O;->m:Z

    if-nez p1, :cond_1

    iget p1, p0, LF0/O;->n:I

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final a0(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, LF0/O;->p:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, LF0/O;->p:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LF0/O;->o:Z

    if-nez v0, :cond_0

    iget p1, p0, LF0/O;->q:I

    add-int/lit8 p1, p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, LF0/O;->X(I)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, LF0/O;->o:Z

    if-nez p1, :cond_1

    iget p1, p0, LF0/O;->q:I

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final b0(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, LF0/O;->o:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, LF0/O;->o:Z

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LF0/O;->p:Z

    if-nez v0, :cond_0

    iget p1, p0, LF0/O;->q:I

    add-int/lit8 p1, p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, LF0/O;->X(I)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, LF0/O;->p:Z

    if-nez p1, :cond_1

    iget p1, p0, LF0/O;->q:I

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final c0()V
    .locals 7

    .prologue
    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v0}, LF0/O$b;->O1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF0/O$a;->I1()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-static {v0}, LF0/P;->a(LF0/J;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF0/J;->w1(LF0/J;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LF0/O;->a:LF0/J;

    invoke-virtual {v0}, LF0/J;->o0()LF0/J;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF0/J;->s1(LF0/J;ZZZILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final q()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-nez v0, :cond_0

    new-instance v0, LF0/O$a;

    invoke-direct {v0, p0}, LF0/O$a;-><init>(LF0/O;)V

    iput-object v0, p0, LF0/O;->s:LF0/O$a;

    :cond_0
    return-void
.end method

.method public final r()LF0/b;
    .locals 1

    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    return-object v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, LF0/O;->n:I

    return v0
.end method

.method public final t()I
    .locals 1

    iget v0, p0, LF0/O;->q:I

    return v0
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->m:Z

    return v0
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->l:Z

    return v0
.end method

.method public final w()Z
    .locals 1

    iget-boolean v0, p0, LF0/O;->b:Z

    return v0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v0}, LD0/X;->w0()I

    move-result v0

    return v0
.end method

.method public final y()LY0/b;
    .locals 1

    iget-object v0, p0, LF0/O;->r:LF0/O$b;

    invoke-virtual {v0}, LF0/O$b;->q1()LY0/b;

    move-result-object v0

    return-object v0
.end method

.method public final z()LY0/b;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/O;->s:LF0/O$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/O$a;->k1()LY0/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
