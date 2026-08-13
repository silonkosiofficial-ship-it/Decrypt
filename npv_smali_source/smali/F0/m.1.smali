.class public abstract LF0/m;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"


# instance fields
.field private final P:I

.field private Q:Landroidx/compose/ui/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    invoke-static {p0}, LF0/g0;->g(Landroidx/compose/ui/d$c;)I

    move-result v0

    iput v0, p0, LF0/m;->P:I

    return-void
.end method

.method private final X1(IZ)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/d$c;->N1(I)V

    if-eq v0, p1, :cond_4

    invoke-static {p0}, LF0/k;->f(LF0/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/d$c;->J1(I)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    or-int/2addr p1, v2

    invoke-virtual {v1, p1}, Landroidx/compose/ui/d$c;->N1(I)V

    if-eq v1, v0, :cond_1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    if-ne v1, v0, :cond_2

    invoke-static {v0}, LF0/g0;->h(Landroidx/compose/ui/d$c;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/compose/ui/d$c;->N1(I)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroidx/compose/ui/d$c;->q1()I

    move-result p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    or-int/2addr p1, p2

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {v1, p1}, Landroidx/compose/ui/d$c;->J1(I)V

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_2

    :cond_4
    return-void
.end method

.method private final Y1(ILandroidx/compose/ui/d$c;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v2

    and-int/2addr p1, v2

    if-eqz p1, :cond_0

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    instance-of p1, p0, LF0/E;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\nDelegate Node: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public B1()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroidx/compose/ui/d$c;->B1()V

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->B1()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public C1()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->C1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroidx/compose/ui/d$c;->C1()V

    return-void
.end method

.method public G1()V
    .locals 1

    .prologue
    invoke-super {p0}, Landroidx/compose/ui/d$c;->G1()V

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->G1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public H1()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->H1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroidx/compose/ui/d$c;->H1()V

    return-void
.end method

.method public I1()V
    .locals 1

    .prologue
    invoke-super {p0}, Landroidx/compose/ui/d$c;->I1()V

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->I1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public K1(Landroidx/compose/ui/d$c;)V
    .locals 1

    .prologue
    invoke-super {p0, p1}, Landroidx/compose/ui/d$c;->K1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/d$c;->K1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public S1(LF0/d0;)V
    .locals 1

    .prologue
    invoke-super {p0, p1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final T1(LF0/j;)LF0/j;
    .locals 6

    .prologue
    invoke-interface {p1}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v0, p1, :cond_3

    instance-of v2, p1, Landroidx/compose/ui/d$c;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/d$c;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v2

    if-ne v0, v2, :cond_2

    invoke-static {v1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot delegate to an already delegated node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_4

    const-string v2, "Cannot delegate to an already attached node"

    invoke-static {v2}, LC0/a;->b(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/compose/ui/d$c;->K1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    invoke-static {v0}, LF0/g0;->h(Landroidx/compose/ui/d$c;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroidx/compose/ui/d$c;->N1(I)V

    invoke-direct {p0, v3, v0}, LF0/m;->Y1(ILandroidx/compose/ui/d$c;)V

    iget-object v4, p0, LF0/m;->Q:Landroidx/compose/ui/d$c;

    invoke-virtual {v0, v4}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    iput-object v0, p0, LF0/m;->Q:Landroidx/compose/ui/d$c;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    or-int/2addr v4, v3

    const/4 v5, 0x0

    invoke-direct {p0, v4, v5}, LF0/m;->X1(IZ)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, 0x2

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v5

    and-int/2addr v3, v5

    if-eqz v3, :cond_6

    invoke-static {v4}, LF0/f0;->a(I)I

    move-result v3

    and-int/2addr v2, v3

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v2

    invoke-virtual {v2}, LF0/J;->k0()LF0/b0;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-virtual {v2}, LF0/b0;->C()V

    goto :goto_2

    :cond_6
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v1

    invoke-virtual {p0, v1}, LF0/m;->S1(LF0/d0;)V

    :goto_2
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->B1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->H1()V

    invoke-static {v0}, LF0/g0;->a(Landroidx/compose/ui/d$c;)V

    :cond_7
    return-object p1
.end method

.method public final U1()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, LF0/m;->Q:Landroidx/compose/ui/d$c;

    return-object v0
.end method

.method public final V1()I
    .locals 1

    iget v0, p0, LF0/m;->P:I

    return v0
.end method

.method protected final W1(LF0/j;)V
    .locals 5

    .prologue
    iget-object v0, p0, LF0/m;->Q:Landroidx/compose/ui/d$c;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_5

    if-ne v0, p1, :cond_4

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, LF0/g0;->d(Landroidx/compose/ui/d$c;)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->I1()V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->C1()V

    :cond_0
    invoke-virtual {v0, v0}, Landroidx/compose/ui/d$c;->K1(Landroidx/compose/ui/d$c;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/d$c;->J1(I)V

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    if-nez v2, :cond_1

    iput-object p1, p0, LF0/m;->Q:Landroidx/compose/ui/d$c;

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p1}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    :goto_1
    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->L1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->P1(Landroidx/compose/ui/d$c;)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result p1

    invoke-static {p0}, LF0/g0;->h(Landroidx/compose/ui/d$c;)I

    move-result v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, LF0/m;->X1(IZ)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result v3

    and-int/2addr p1, v3

    if-eqz p1, :cond_3

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->k0()LF0/b0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    invoke-virtual {p1}, LF0/b0;->C()V

    :cond_3
    :goto_2
    return-void

    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v2

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find delegate: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
