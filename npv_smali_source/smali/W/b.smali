.class public final LW/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW/b$a;
    }
.end annotation


# static fields
.field public static final m:LW/b$a;

.field public static final n:I


# instance fields
.field private final a:LV/o;

.field private b:LW/a;

.field private c:Z

.field private final d:LV/X;

.field private e:Z

.field private f:I

.field private g:I

.field private h:LV/F1;

.field private i:I

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW/b$a;-><init>(Ly7/k;)V

    sput-object v0, LW/b;->m:LW/b$a;

    const/16 v0, 0x8

    sput v0, LW/b;->n:I

    return-void
.end method

.method public constructor <init>(LV/o;LW/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW/b;->a:LV/o;

    iput-object p2, p0, LW/b;->b:LW/a;

    new-instance p1, LV/X;

    invoke-direct {p1}, LV/X;-><init>()V

    iput-object p1, p0, LW/b;->d:LV/X;

    const/4 p1, 0x1

    iput-boolean p1, p0, LW/b;->e:Z

    new-instance p1, LV/F1;

    invoke-direct {p1}, LV/F1;-><init>()V

    iput-object p1, p0, LW/b;->h:LV/F1;

    const/4 p1, -0x1

    iput p1, p0, LW/b;->i:I

    iput p1, p0, LW/b;->j:I

    iput p1, p0, LW/b;->k:I

    return-void
.end method

.method private final A()V
    .locals 0

    invoke-direct {p0}, LW/b;->B()V

    return-void
.end method

.method private final B()V
    .locals 2

    .prologue
    iget v0, p0, LW/b;->g:I

    if-lez v0, :cond_0

    iget-object v1, p0, LW/b;->b:LW/a;

    invoke-virtual {v1, v0}, LW/a;->G(I)V

    const/4 v0, 0x0

    iput v0, p0, LW/b;->g:I

    :cond_0
    iget-object v0, p0, LW/b;->h:LV/F1;

    invoke-virtual {v0}, LV/F1;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LW/b;->b:LW/a;

    iget-object v1, p0, LW/b;->h:LV/F1;

    invoke-virtual {v1}, LV/F1;->i()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LW/a;->k([Ljava/lang/Object;)V

    iget-object v0, p0, LW/b;->h:LV/F1;

    invoke-virtual {v0}, LV/F1;->a()V

    :cond_1
    return-void
.end method

.method private final C()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LW/b;->I(LW/b;ZILjava/lang/Object;)V

    invoke-virtual {p0}, LW/b;->K()V

    return-void
.end method

.method private final D(Z)V
    .locals 0

    invoke-direct {p0, p1}, LW/b;->H(Z)V

    return-void
.end method

.method static synthetic E(LW/b;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, LW/b;->D(Z)V

    return-void
.end method

.method private final F(III)V
    .locals 1

    invoke-direct {p0}, LW/b;->A()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2, p3}, LW/a;->u(III)V

    return-void
.end method

.method private final G()V
    .locals 4

    .prologue
    iget v0, p0, LW/b;->l:I

    if-lez v0, :cond_1

    iget v1, p0, LW/b;->i:I

    const/4 v2, -0x1

    if-ltz v1, :cond_0

    invoke-direct {p0, v1, v0}, LW/b;->J(II)V

    iput v2, p0, LW/b;->i:I

    goto :goto_0

    :cond_0
    iget v1, p0, LW/b;->k:I

    iget v3, p0, LW/b;->j:I

    invoke-direct {p0, v1, v3, v0}, LW/b;->F(III)V

    iput v2, p0, LW/b;->j:I

    iput v2, p0, LW/b;->k:I

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, LW/b;->l:I

    :cond_1
    return-void
.end method

.method private final H(Z)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object p1

    invoke-virtual {p1}, LV/g1;->u()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object p1

    invoke-virtual {p1}, LV/g1;->k()I

    move-result p1

    :goto_0
    iget v0, p0, LW/b;->f:I

    sub-int v0, p1, v0

    if-ltz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_2

    const-string v1, "Tried to seek backward"

    invoke-static {v1}, LV/q;->r(Ljava/lang/String;)V

    :cond_2
    if-lez v0, :cond_3

    iget-object v1, p0, LW/b;->b:LW/a;

    invoke-virtual {v1, v0}, LW/a;->e(I)V

    iput p1, p0, LW/b;->f:I

    :cond_3
    return-void
.end method

.method static synthetic I(LW/b;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, LW/b;->H(Z)V

    return-void
.end method

.method private final J(II)V
    .locals 1

    invoke-direct {p0}, LW/b;->A()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->x(II)V

    return-void
.end method

.method private final k(LV/d;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->o(LV/d;)V

    iput-boolean v2, p0, LW/b;->c:Z

    return-void
.end method

.method private final l()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LW/b;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LW/b;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v0, v2, v1}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->p()V

    iput-boolean v2, p0, LW/b;->c:Z

    :cond_0
    return-void
.end method

.method private final q()LV/g1;
    .locals 1

    iget-object v0, p0, LW/b;->a:LV/o;

    invoke-virtual {v0}, LV/o;->G0()LV/g1;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final K()V
    .locals 4

    .prologue
    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object v0

    invoke-virtual {v0}, LV/g1;->x()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object v0

    invoke-virtual {v0}, LV/g1;->u()I

    move-result v1

    iget-object v2, p0, LW/b;->d:LV/X;

    const/4 v3, -0x2

    invoke-virtual {v2, v3}, LV/X;->h(I)I

    move-result v2

    if-eq v2, v1, :cond_0

    invoke-direct {p0}, LW/b;->l()V

    if-lez v1, :cond_0

    invoke-virtual {v0, v1}, LV/g1;->a(I)LV/d;

    move-result-object v0

    iget-object v2, p0, LW/b;->d:LV/X;

    invoke-virtual {v2, v1}, LV/X;->j(I)V

    invoke-direct {p0, v0}, LW/b;->k(LV/d;)V

    :cond_0
    return-void
.end method

.method public final L()V
    .locals 1

    .prologue
    invoke-direct {p0}, LW/b;->B()V

    iget-boolean v0, p0, LW/b;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LW/b;->U()V

    invoke-virtual {p0}, LW/b;->j()V

    :cond_0
    return-void
.end method

.method public final M(LV/Z0;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->v(LV/Z0;)V

    return-void
.end method

.method public final N()V
    .locals 2

    invoke-direct {p0}, LW/b;->C()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->w()V

    iget v0, p0, LW/b;->f:I

    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object v1

    invoke-virtual {v1}, LV/g1;->p()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LW/b;->f:I

    return-void
.end method

.method public final O(II)V
    .locals 2

    .prologue
    if-lez p2, :cond_3

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid remove index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, LW/b;->i:I

    if-ne v0, p1, :cond_2

    iget p1, p0, LW/b;->l:I

    add-int/2addr p1, p2

    iput p1, p0, LW/b;->l:I

    goto :goto_1

    :cond_2
    invoke-direct {p0}, LW/b;->G()V

    iput p1, p0, LW/b;->i:I

    iput p2, p0, LW/b;->l:I

    :cond_3
    :goto_1
    return-void
.end method

.method public final P()V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->y()V

    return-void
.end method

.method public final Q()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, LW/b;->c:Z

    iget-object v1, p0, LW/b;->d:LV/X;

    invoke-virtual {v1}, LV/X;->a()V

    iput v0, p0, LW/b;->f:I

    return-void
.end method

.method public final R(LW/a;)V
    .locals 0

    iput-object p1, p0, LW/b;->b:LW/a;

    return-void
.end method

.method public final S(Z)V
    .locals 0

    iput-boolean p1, p0, LW/b;->e:Z

    return-void
.end method

.method public final T(Lx7/a;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->z(Lx7/a;)V

    return-void
.end method

.method public final U()V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->A()V

    return-void
.end method

.method public final V(I)V
    .locals 1

    .prologue
    if-lez p1, :cond_0

    invoke-direct {p0}, LW/b;->C()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->B(I)V

    :cond_0
    return-void
.end method

.method public final W(Ljava/lang/Object;LV/d;I)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2, p3}, LW/a;->C(Ljava/lang/Object;LV/d;I)V

    return-void
.end method

.method public final X(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->D(Ljava/lang/Object;)V

    return-void
.end method

.method public final Y(Ljava/lang/Object;Lx7/p;)V
    .locals 1

    invoke-direct {p0}, LW/b;->A()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->E(Ljava/lang/Object;Lx7/p;)V

    return-void
.end method

.method public final Z(Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LW/b;->D(Z)V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->F(Ljava/lang/Object;I)V

    return-void
.end method

.method public final a(LV/d;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->f(LV/d;Ljava/lang/Object;)V

    return-void
.end method

.method public final a0(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, LW/b;->A()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->H(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/util/List;Ld0/d;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->g(Ljava/util/List;Ld0/d;)V

    return-void
.end method

.method public final c(LV/n0;LV/s;LV/o0;LV/o0;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2, p3, p4}, LW/a;->h(LV/n0;LV/s;LV/o0;LV/o0;)V

    return-void
.end method

.method public final d()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->i()V

    return-void
.end method

.method public final e(Ld0/d;LV/d;)V
    .locals 1

    invoke-direct {p0}, LW/b;->B()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->j(Ld0/d;LV/d;)V

    return-void
.end method

.method public final f(Lx7/l;LV/r;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->l(Lx7/l;LV/r;)V

    return-void
.end method

.method public final g()V
    .locals 5

    .prologue
    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object v0

    invoke-virtual {v0}, LV/g1;->u()I

    move-result v0

    iget-object v1, p0, LW/b;->d:LV/X;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, LV/X;->h(I)I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gt v1, v0, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-nez v1, :cond_1

    const-string v1, "Missed recording an endGroup"

    invoke-static {v1}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, LW/b;->d:LV/X;

    invoke-virtual {v1, v2}, LV/X;->h(I)I

    move-result v1

    if-ne v1, v0, :cond_2

    const/4 v0, 0x0

    invoke-static {p0, v3, v4, v0}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    iget-object v0, p0, LW/b;->d:LV/X;

    invoke-virtual {v0}, LV/X;->i()I

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->m()V

    :cond_2
    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0}, LW/a;->n()V

    const/4 v0, 0x0

    iput v0, p0, LW/b;->f:I

    return-void
.end method

.method public final i()V
    .locals 0

    invoke-direct {p0}, LW/b;->G()V

    return-void
.end method

.method public final j()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LW/b;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    invoke-static {p0, v0, v1, v2}, LW/b;->E(LW/b;ZILjava/lang/Object;)V

    iget-object v1, p0, LW/b;->b:LW/a;

    invoke-virtual {v1}, LW/a;->m()V

    iput-boolean v0, p0, LW/b;->c:Z

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 1

    .prologue
    invoke-direct {p0}, LW/b;->B()V

    iget-object v0, p0, LW/b;->d:LV/X;

    invoke-virtual {v0}, LV/X;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Missed recording an endGroup()"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final n()LW/a;
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, LW/b;->e:Z

    return v0
.end method

.method public final p()Z
    .locals 2

    .prologue
    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object v0

    invoke-virtual {v0}, LV/g1;->u()I

    move-result v0

    iget v1, p0, LW/b;->f:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final r(LW/a;Ld0/d;)V
    .locals 1

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->q(LW/a;Ld0/d;)V

    return-void
.end method

.method public final s(LV/d;LV/h1;)V
    .locals 1

    invoke-direct {p0}, LW/b;->B()V

    invoke-direct {p0}, LW/b;->C()V

    invoke-direct {p0}, LW/b;->G()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2}, LW/a;->r(LV/d;LV/h1;)V

    return-void
.end method

.method public final t(LV/d;LV/h1;LW/c;)V
    .locals 1

    invoke-direct {p0}, LW/b;->B()V

    invoke-direct {p0}, LW/b;->C()V

    invoke-direct {p0}, LW/b;->G()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1, p2, p3}, LW/a;->s(LV/d;LV/h1;LW/c;)V

    return-void
.end method

.method public final u(I)V
    .locals 1

    invoke-direct {p0}, LW/b;->C()V

    iget-object v0, p0, LW/b;->b:LW/a;

    invoke-virtual {v0, p1}, LW/a;->t(I)V

    return-void
.end method

.method public final v(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, LW/b;->G()V

    iget-object v0, p0, LW/b;->h:LV/F1;

    invoke-virtual {v0, p1}, LV/F1;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public final w(III)V
    .locals 3

    .prologue
    if-lez p3, :cond_1

    iget v0, p0, LW/b;->l:I

    if-lez v0, :cond_0

    iget v1, p0, LW/b;->j:I

    sub-int v2, p1, v0

    if-ne v1, v2, :cond_0

    iget v1, p0, LW/b;->k:I

    sub-int v2, p2, v0

    if-ne v1, v2, :cond_0

    add-int/2addr v0, p3

    iput v0, p0, LW/b;->l:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LW/b;->G()V

    iput p1, p0, LW/b;->j:I

    iput p2, p0, LW/b;->k:I

    iput p3, p0, LW/b;->l:I

    :cond_1
    :goto_0
    return-void
.end method

.method public final x(I)V
    .locals 2

    iget v0, p0, LW/b;->f:I

    invoke-direct {p0}, LW/b;->q()LV/g1;

    move-result-object v1

    invoke-virtual {v1}, LV/g1;->k()I

    move-result v1

    sub-int/2addr p1, v1

    add-int/2addr v0, p1

    iput v0, p0, LW/b;->f:I

    return-void
.end method

.method public final y(I)V
    .locals 0

    iput p1, p0, LW/b;->f:I

    return-void
.end method

.method public final z()V
    .locals 1

    .prologue
    invoke-direct {p0}, LW/b;->G()V

    iget-object v0, p0, LW/b;->h:LV/F1;

    invoke-virtual {v0}, LV/F1;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LW/b;->h:LV/F1;

    invoke-virtual {v0}, LV/F1;->g()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget v0, p0, LW/b;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LW/b;->g:I

    :goto_0
    return-void
.end method
