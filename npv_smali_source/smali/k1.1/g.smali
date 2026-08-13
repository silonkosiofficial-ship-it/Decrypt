.class public final Lk1/g;
.super Lj1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/g$a;
    }
.end annotation


# static fields
.field public static final H0:Lk1/g$a;

.field public static final I0:I


# instance fields
.field private A0:F

.field private B0:F

.field private C0:Ljava/lang/String;

.field private D0:Ljava/lang/String;

.field private E0:Ljava/lang/String;

.field private F0:Ljava/lang/String;

.field private G0:[I

.field private s0:Ll1/b;

.field private t0:I

.field private u0:I

.field private v0:I

.field private w0:I

.field private x0:I

.field private y0:I

.field private z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk1/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk1/g$a;-><init>(Ly7/k;)V

    sput-object v0, Lk1/g;->H0:Lk1/g$a;

    const/16 v0, 0x8

    sput v0, Lk1/g;->I0:I

    return-void
.end method

.method public constructor <init>(Lj1/g;Lj1/g$e;)V
    .locals 1

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lj1/e;-><init>(Lj1/g;Lj1/g$e;)V

    sget-object p1, Lj1/g$e;->L:Lj1/g$e;

    const/4 v0, 0x1

    if-ne p2, p1, :cond_0

    iput v0, p0, Lk1/g;->y0:I

    goto :goto_0

    :cond_0
    sget-object p1, Lj1/g$e;->M:Lj1/g$e;

    if-ne p2, p1, :cond_1

    iput v0, p0, Lk1/g;->z0:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public V0()Lm1/j;
    .locals 1

    .prologue
    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    if-nez v0, :cond_0

    new-instance v0, Ll1/b;

    invoke-direct {v0}, Ll1/b;-><init>()V

    iput-object v0, p0, Lk1/g;->s0:Ll1/b;

    :cond_0
    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final Z0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "columnWeights"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk1/g;->D0:Ljava/lang/String;

    return-void
.end method

.method public final a1(I)V
    .locals 2

    .prologue
    invoke-super {p0}, Lj1/e;->Y0()Lj1/g$e;

    move-result-object v0

    sget-object v1, Lj1/g$e;->L:Lj1/g$e;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lk1/g;->z0:I

    return-void
.end method

.method public apply()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lk1/g;->V0()Lm1/j;

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/g;->x0:I

    invoke-virtual {v0, v1}, Ll1/b;->X2(I)V

    iget v0, p0, Lk1/g;->y0:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/g;->y0:I

    invoke-virtual {v0, v1}, Ll1/b;->Z2(I)V

    :cond_0
    iget v0, p0, Lk1/g;->z0:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/g;->z0:I

    invoke-virtual {v0, v1}, Ll1/b;->U2(I)V

    :cond_1
    iget v0, p0, Lk1/g;->A0:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lk1/g;->A0:F

    invoke-virtual {v0, v2}, Ll1/b;->W2(F)V

    :goto_0
    iget v0, p0, Lk1/g;->B0:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/g;->B0:F

    invoke-virtual {v0, v1}, Ll1/b;->c3(F)V

    :goto_1
    iget-object v0, p0, Lk1/g;->C0:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_4

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lk1/g;->C0:Ljava/lang/String;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll1/b;->Y2(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lk1/g;->D0:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lk1/g;->D0:Ljava/lang/String;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll1/b;->T2(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lk1/g;->E0:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lk1/g;->E0:Ljava/lang/String;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll1/b;->b3(Ljava/lang/CharSequence;)V

    :cond_6
    iget-object v0, p0, Lk1/g;->F0:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lk1/g;->F0:Ljava/lang/String;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll1/b;->a3(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lk1/g;->G0:[I

    if-eqz v0, :cond_9

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v0, v0

    const/4 v1, 0x1

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    :goto_2
    xor-int/2addr v0, v1

    if-eqz v0, :cond_9

    iget-object v0, p0, Lk1/g;->s0:Ll1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lk1/g;->G0:[I

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll1/b;->V2([I)V

    :cond_9
    invoke-virtual {p0}, Lj1/e;->U0()V

    return-void
.end method

.method public final b1(Ljava/lang/String;)V
    .locals 7

    .prologue
    const-string v0, "flags"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, LS8/o;

    const-string v1, "\\|"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LS8/o;->g(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lj7/v;->M0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :goto_1
    check-cast p1, Ljava/util/Collection;

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v3, p1

    move v4, v1

    :goto_2
    if-ge v4, v3, :cond_5

    aget-object v5, p1, v4

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "toLowerCase(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "subgridbycolrow"

    invoke-static {v5, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_3
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    const-string v6, "spansrespectwidgetorder"

    invoke-static {v5, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_3

    :cond_4
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    add-int/lit8 v3, v1, 0x1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, p1, v1

    move v1, v3

    goto :goto_5

    :cond_6
    iput-object p1, p0, Lk1/g;->G0:[I

    return-void
.end method

.method public final c1(F)V
    .locals 0

    iput p1, p0, Lk1/g;->A0:F

    return-void
.end method

.method public final d1(I)V
    .locals 0

    iput p1, p0, Lk1/g;->x0:I

    return-void
.end method

.method public final e1(I)V
    .locals 0

    iput p1, p0, Lk1/g;->w0:I

    return-void
.end method

.method public final f1(I)V
    .locals 0

    iput p1, p0, Lk1/g;->u0:I

    return-void
.end method

.method public final g1(I)V
    .locals 0

    iput p1, p0, Lk1/g;->t0:I

    return-void
.end method

.method public final h1(I)V
    .locals 0

    iput p1, p0, Lk1/g;->v0:I

    return-void
.end method

.method public final i1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rowWeights"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk1/g;->C0:Ljava/lang/String;

    return-void
.end method

.method public final j1(I)V
    .locals 2

    .prologue
    invoke-super {p0}, Lj1/e;->Y0()Lj1/g$e;

    move-result-object v0

    sget-object v1, Lj1/g$e;->M:Lj1/g$e;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lk1/g;->y0:I

    return-void
.end method

.method public final k1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "skips"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk1/g;->F0:Ljava/lang/String;

    return-void
.end method

.method public final l1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "spans"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk1/g;->E0:Ljava/lang/String;

    return-void
.end method

.method public final m1(F)V
    .locals 0

    iput p1, p0, Lk1/g;->B0:F

    return-void
.end method
