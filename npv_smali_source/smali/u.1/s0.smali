.class public final Lu/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/s0$a;,
        Lu/s0$b;,
        Lu/s0$c;,
        Lu/s0$d;
    }
.end annotation


# instance fields
.field private final a:Lu/v0;

.field private final b:Lu/s0;

.field private final c:Ljava/lang/String;

.field private final d:LV/w0;

.field private final e:LV/w0;

.field private final f:LV/u0;

.field private final g:LV/u0;

.field private final h:LV/w0;

.field private final i:Lf0/r;

.field private final j:Lf0/r;

.field private final k:LV/w0;

.field private l:J

.field private final m:LV/G1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lu/Z;

    invoke-direct {v0, p1}, Lu/Z;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, p2}, Lu/s0;-><init>(Lu/v0;Lu/s0;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lu/v0;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lu/s0;-><init>(Lu/v0;Lu/s0;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lu/v0;Lu/s0;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/s0;->a:Lu/v0;

    iput-object p2, p0, Lu/s0;->b:Lu/s0;

    iput-object p3, p0, Lu/s0;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p3, v0, p3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p2

    iput-object p2, p0, Lu/s0;->d:LV/w0;

    new-instance p2, Lu/s0$c;

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p2, v1, v2}, Lu/s0$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, p3, v0, p3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p2

    iput-object p2, p0, Lu/s0;->e:LV/w0;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, LV/n1;->a(J)LV/u0;

    move-result-object p2

    iput-object p2, p0, Lu/s0;->f:LV/u0;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-static {v1, v2}, LV/n1;->a(J)LV/u0;

    move-result-object p2

    iput-object p2, p0, Lu/s0;->g:LV/u0;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, p3, v0, p3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, Lu/s0;->h:LV/w0;

    invoke-static {}, LV/v1;->f()Lf0/r;

    move-result-object v1

    iput-object v1, p0, Lu/s0;->i:Lf0/r;

    invoke-static {}, LV/v1;->f()Lf0/r;

    move-result-object v1

    iput-object v1, p0, Lu/s0;->j:Lf0/r;

    invoke-static {p2, p3, v0, p3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p2

    iput-object p2, p0, Lu/s0;->k:LV/w0;

    new-instance p2, Lu/s0$g;

    invoke-direct {p2, p0}, Lu/s0$g;-><init>(Lu/s0;)V

    invoke-static {p2}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p2

    iput-object p2, p0, Lu/s0;->m:LV/G1;

    invoke-virtual {p1, p0}, Lu/v0;->f(Lu/s0;)V

    return-void
.end method

.method private final F()V
    .locals 5

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4}, Lu/s0$d;->v()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-direct {v3}, Lu/s0;->F()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private final L(Lu/s0$b;)V
    .locals 1

    iget-object v0, p0, Lu/s0;->e:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final O(Z)V
    .locals 1

    iget-object v0, p0, Lu/s0;->h:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final P(J)V
    .locals 1

    iget-object v0, p0, Lu/s0;->f:LV/u0;

    invoke-interface {v0, p1, p2}, LV/u0;->j(J)V

    return-void
.end method

.method public static final synthetic a(Lu/s0;)J
    .locals 2

    invoke-direct {p0}, Lu/s0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic b(Lu/s0;)V
    .locals 0

    invoke-direct {p0}, Lu/s0;->v()V

    return-void
.end method

.method private final f()J
    .locals 8

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu/s0$d;

    invoke-virtual {v6}, Lu/s0$d;->o()J

    move-result-wide v6

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v4, v1, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu/s0;

    invoke-direct {v5}, Lu/s0;->f()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-wide v2
.end method

.method private final r()Z
    .locals 1

    iget-object v0, p0, Lu/s0;->h:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final s()J
    .locals 2

    iget-object v0, p0, Lu/s0;->f:LV/u0;

    invoke-interface {v0}, LV/h0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method private final v()V
    .locals 9

    .prologue
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lu/s0;->O(Z)V

    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v5, v2

    :goto_0
    if-ge v5, v1, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu/s0$d;

    invoke-virtual {v6}, Lu/s0$d;->o()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iget-wide v7, p0, Lu/s0;->l:J

    invoke-virtual {v6, v7, v8}, Lu/s0$d;->x(J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, v2}, Lu/s0;->O(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/s0;->M(J)V

    iget-object p1, p0, Lu/s0;->a:Lu/v0;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lu/v0;->e(Z)V

    return-void
.end method

.method public final B(Lu/s0$a;)V
    .locals 0

    .prologue
    invoke-virtual {p1}, Lu/s0$a;->b()Lu/s0$a$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lu/s0$a$a;->e()Lu/s0$d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lu/s0;->C(Lu/s0$d;)V

    :cond_0
    return-void
.end method

.method public final C(Lu/s0$d;)V
    .locals 1

    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-virtual {v0, p1}, Lf0/r;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final D(Lu/s0;)Z
    .locals 1

    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-virtual {v0, p1}, Lf0/r;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final E(F)V
    .locals 5

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4, p1}, Lu/s0$d;->w(F)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-virtual {v3, p1}, Lu/s0;->E(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final G(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 5

    .prologue
    const-wide/high16 v0, -0x8000000000000000L

    invoke-virtual {p0, v0, v1}, Lu/s0;->M(J)V

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu/v0;->e(Z)V

    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    instance-of v2, v0, Lu/Z;

    if-eqz v2, :cond_1

    invoke-virtual {v0, p1}, Lu/v0;->d(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, p2}, Lu/s0;->N(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lu/s0;->K(Z)V

    new-instance v0, Lu/s0$c;

    invoke-direct {v0, p1, p2}, Lu/s0$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lu/s0;->L(Lu/s0$b;)V

    :cond_2
    iget-object p1, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    move v0, v1

    :goto_0
    if-ge v0, p2, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu/s0;

    const-string v3, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lu/s0;->u()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, p3, p4}, Lu/s0;->G(Ljava/lang/Object;Ljava/lang/Object;J)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_1
    if-ge v1, p2, :cond_5

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/s0$d;

    invoke-virtual {v0, p3, p4}, Lu/s0$d;->x(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    iput-wide p3, p0, Lu/s0;->l:J

    return-void
.end method

.method public final H(J)V
    .locals 6

    .prologue
    invoke-virtual {p0}, Lu/s0;->o()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lu/s0;->M(J)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lu/s0;->J(J)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu/s0;->O(Z)V

    iget-object v1, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4, p1, p2}, Lu/s0$d;->x(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-virtual {v3}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3, p1, p2}, Lu/s0;->H(J)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final I(Lu/g0$b;)V
    .locals 5

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4, p1}, Lu/s0$d;->C(Lu/g0$b;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-virtual {v3, p1}, Lu/s0;->I(Lu/g0$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final J(J)V
    .locals 1

    .prologue
    iget-object v0, p0, Lu/s0;->b:Lu/s0;

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lu/s0;->P(J)V

    :cond_0
    return-void
.end method

.method public final K(Z)V
    .locals 1

    iget-object v0, p0, Lu/s0;->k:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final M(J)V
    .locals 1

    iget-object v0, p0, Lu/s0;->g:LV/u0;

    invoke-interface {v0, p1, p2}, LV/u0;->j(J)V

    return-void
.end method

.method public final N(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/s0;->d:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final Q()V
    .locals 5

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4}, Lu/s0$d;->J()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-virtual {v3}, Lu/s0;->Q()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final R(Ljava/lang/Object;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lu/s0$c;

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lu/s0$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lu/s0;->L(Lu/s0$b;)V

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu/v0;->d(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0, p1}, Lu/s0;->N(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0;->t()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lu/s0;->O(Z)V

    :cond_1
    invoke-direct {p0}, Lu/s0;->F()V

    :cond_2
    return-void
.end method

.method public final c(Lu/s0$d;)Z
    .locals 1

    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-virtual {v0, p1}, Lf0/r;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d(Lu/s0;)Z
    .locals 1

    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-virtual {v0, p1}, Lf0/r;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Object;LV/n;I)V
    .locals 5

    .prologue
    const v0, -0x59064cff

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, p3

    goto :goto_2

    :cond_2
    move v1, p3

    :goto_2
    and-int/lit8 v2, p3, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_4

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v4, 0x12

    if-ne v2, v4, :cond_6

    invoke-interface {p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_a

    :cond_6
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    const-string v4, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)"

    invoke-static {v0, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result v0

    if-nez v0, :cond_e

    const v0, 0x6ca14252

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-virtual {p0, p1}, Lu/s0;->R(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lu/s0;->t()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-direct {p0}, Lu/s0;->r()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    const v0, 0x6cb7c35b

    invoke-interface {p2, v0}, LV/n;->T(I)V

    :goto_5
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_8

    :cond_9
    :goto_6
    const v0, 0x6ca4c9cd

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_a

    sget-object v0, Lm7/j;->C:Lm7/j;

    invoke-static {v0, p2}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object v0

    new-instance v4, LV/C;

    invoke-direct {v4, v0}, LV/C;-><init>(LW8/N;)V

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_a
    check-cast v0, LV/C;

    invoke-virtual {v0}, LV/C;->a()LW8/N;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v3, :cond_b

    const/4 v3, 0x1

    goto :goto_7

    :cond_b
    const/4 v3, 0x0

    :goto_7
    or-int/2addr v3, v4

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v4, Lu/s0$e;

    invoke-direct {v4, v0, p0}, Lu/s0$e;-><init>(LW8/N;Lu/s0;)V

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lx7/l;

    invoke-static {v0, p0, v4, p2, v1}, LV/Q;->a(Ljava/lang/Object;Ljava/lang/Object;Lx7/l;LV/n;I)V

    goto :goto_5

    :goto_8
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_9

    :cond_e
    const v0, 0x6cb7ea1b

    invoke-interface {p2, v0}, LV/n;->T(I)V

    goto :goto_8

    :goto_9
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    :goto_a
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_10

    new-instance v0, Lu/s0$f;

    invoke-direct {v0, p0, p1, p3}, Lu/s0$f;-><init>(Lu/s0;Ljava/lang/Object;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_10
    return-void
.end method

.method public final g()V
    .locals 5

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4}, Lu/s0$d;->e()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-virtual {v3}, Lu/s0;->g()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    invoke-virtual {v0}, Lu/v0;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final j()Z
    .locals 5

    .prologue
    iget-object v0, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    invoke-virtual {v4}, Lu/s0$d;->q()Lu/g0$b;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0;

    invoke-virtual {v4}, Lu/s0;->j()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    return v2
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu/s0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Lu/s0;->l:J

    return-wide v0
.end method

.method public final m()J
    .locals 2

    .prologue
    iget-object v0, p0, Lu/s0;->b:Lu/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu/s0;->m()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lu/s0;->s()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final n()Lu/s0$b;
    .locals 1

    iget-object v0, p0, Lu/s0;->e:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/s0$b;

    return-object v0
.end method

.method public final o()J
    .locals 2

    iget-object v0, p0, Lu/s0;->g:LV/u0;

    invoke-interface {v0}, LV/h0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/s0;->d:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final q()J
    .locals 2

    iget-object v0, p0, Lu/s0;->m:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final t()Z
    .locals 4

    .prologue
    invoke-virtual {p0}, Lu/s0;->o()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    invoke-virtual {p0}, Lu/s0;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const-string v2, "Transition animation values: "

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu/s0$d;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lu/s0;->k:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final w()V
    .locals 1

    invoke-virtual {p0}, Lu/s0;->z()V

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    invoke-virtual {v0}, Lu/v0;->g()V

    return-void
.end method

.method public final x(JF)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lu/s0;->o()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lu/s0;->A(J)V

    :cond_0
    invoke-virtual {p0}, Lu/s0;->o()J

    move-result-wide v0

    sub-long/2addr p1, v0

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    long-to-double p1, p1

    float-to-double v1, p3

    div-double/2addr p1, v1

    invoke-static {p1, p2}, LA7/a;->e(D)J

    move-result-wide p1

    :goto_0
    invoke-virtual {p0, p1, p2}, Lu/s0;->J(J)V

    if-nez v0, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    invoke-virtual {p0, p1, p2, p3}, Lu/s0;->y(JZ)V

    return-void
.end method

.method public final y(JZ)V
    .locals 8

    .prologue
    invoke-virtual {p0}, Lu/s0;->o()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lu/s0;->A(J)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    invoke-virtual {v0}, Lu/v0;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    invoke-virtual {v0, v1}, Lu/v0;->e(Z)V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu/s0;->O(Z)V

    iget-object v2, p0, Lu/s0;->i:Lf0/r;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_4

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu/s0$d;

    invoke-virtual {v5}, Lu/s0$d;->t()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5, p1, p2, p3}, Lu/s0$d;->u(JZ)V

    :cond_2
    invoke-virtual {v5}, Lu/s0$d;->t()Z

    move-result v5

    if-nez v5, :cond_3

    move v1, v0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget-object v2, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v4, v0

    :goto_2
    if-ge v4, v3, :cond_7

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu/s0;

    invoke-virtual {v5}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v5, p1, p2, p3}, Lu/s0;->y(JZ)V

    :cond_5
    invoke-virtual {v5}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    move v1, v0

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lu/s0;->z()V

    :cond_8
    return-void
.end method

.method public final z()V
    .locals 4

    .prologue
    const-wide/high16 v0, -0x8000000000000000L

    invoke-virtual {p0, v0, v1}, Lu/s0;->M(J)V

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    instance-of v1, v0, Lu/Z;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu/v0;->d(Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lu/s0;->J(J)V

    iget-object v0, p0, Lu/s0;->a:Lu/v0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu/v0;->e(Z)V

    iget-object v0, p0, Lu/s0;->j:Lf0/r;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu/s0;

    invoke-virtual {v3}, Lu/s0;->z()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
