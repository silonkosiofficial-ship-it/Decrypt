.class public final LV/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/a;
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# instance fields
.field private C:[I

.field private D:I

.field private E:[Ljava/lang/Object;

.field private F:I

.field private G:I

.field private H:Z

.field private I:I

.field private J:Ljava/util/ArrayList;

.field private K:Ljava/util/HashMap;

.field private L:Lr/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, LV/h1;->C:[I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LV/h1;->E:[Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LV/h1;->J:Ljava/util/ArrayList;

    return-void
.end method

.method private final Z(I)LV/d;
    .locals 2

    .prologue
    iget-boolean v0, p0, LV/h1;->H:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "use active SlotWriter to crate an anchor for location instead"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    if-ltz p1, :cond_1

    iget v0, p0, LV/h1;->D:I

    if-ge p1, v0, :cond_1

    iget-object v1, p0, LV/h1;->J:Ljava/util/ArrayList;

    invoke-static {v1, p1, v0}, LV/j1;->f(Ljava/util/ArrayList;II)LV/d;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final C()Z
    .locals 2

    .prologue
    iget v0, p0, LV/h1;->D:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-object v0, p0, LV/h1;->C:[I

    invoke-static {v0, v1}, LV/j1;->c([II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final D()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, LV/h1;->J:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final E()Lr/C;
    .locals 1

    iget-object v0, p0, LV/h1;->L:Lr/C;

    return-object v0
.end method

.method public final M()[I
    .locals 1

    iget-object v0, p0, LV/h1;->C:[I

    return-object v0
.end method

.method public final N()I
    .locals 1

    iget v0, p0, LV/h1;->D:I

    return v0
.end method

.method public final O()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/h1;->E:[Ljava/lang/Object;

    return-object v0
.end method

.method public final P()I
    .locals 1

    iget v0, p0, LV/h1;->F:I

    return v0
.end method

.method public final Q()Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, LV/h1;->K:Ljava/util/HashMap;

    return-object v0
.end method

.method public final R()I
    .locals 1

    iget v0, p0, LV/h1;->I:I

    return v0
.end method

.method public final S()Z
    .locals 1

    iget-boolean v0, p0, LV/h1;->H:Z

    return v0
.end method

.method public final T(ILV/d;)Z
    .locals 3

    .prologue
    iget-boolean v0, p0, LV/h1;->H:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "Writer is active"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    if-ltz p1, :cond_1

    iget v2, p0, LV/h1;->D:I

    if-ge p1, v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    if-nez v2, :cond_2

    const-string v2, "Invalid group index"

    invoke-static {v2}, LV/q;->r(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p2}, LV/h1;->W(LV/d;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LV/h1;->C:[I

    invoke-static {v2, p1}, LV/j1;->h([II)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {p2}, LV/d;->a()I

    move-result p2

    if-gt p1, p2, :cond_3

    if-ge p2, v2, :cond_3

    goto :goto_1

    :cond_3
    move v1, v0

    :goto_1
    return v1
.end method

.method public final U()LV/g1;
    .locals 2

    .prologue
    iget-boolean v0, p0, LV/h1;->H:Z

    if-nez v0, :cond_0

    iget v0, p0, LV/h1;->G:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LV/h1;->G:I

    new-instance v0, LV/g1;

    invoke-direct {v0, p0}, LV/g1;-><init>(LV/h1;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read while a writer is pending"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final V()LV/k1;
    .locals 2

    .prologue
    iget-boolean v0, p0, LV/h1;->H:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "Cannot start a writer when another writer is pending"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, LV/h1;->G:I

    if-gtz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "Cannot start a writer when a reader is pending"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_2
    iput-boolean v1, p0, LV/h1;->H:Z

    iget v0, p0, LV/h1;->I:I

    add-int/2addr v0, v1

    iput v0, p0, LV/h1;->I:I

    new-instance v0, LV/k1;

    invoke-direct {v0, p0}, LV/k1;-><init>(LV/h1;)V

    return-object v0
.end method

.method public final W(LV/d;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, LV/d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/h1;->J:Ljava/util/ArrayList;

    invoke-virtual {p1}, LV/d;->a()I

    move-result v1

    iget v2, p0, LV/h1;->D:I

    invoke-static {v0, v1, v2}, LV/j1;->t(Ljava/util/ArrayList;II)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, LV/h1;->J:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final X([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lr/C;)V
    .locals 0

    iput-object p1, p0, LV/h1;->C:[I

    iput p2, p0, LV/h1;->D:I

    iput-object p3, p0, LV/h1;->E:[Ljava/lang/Object;

    iput p4, p0, LV/h1;->F:I

    iput-object p5, p0, LV/h1;->J:Ljava/util/ArrayList;

    iput-object p6, p0, LV/h1;->K:Ljava/util/HashMap;

    iput-object p7, p0, LV/h1;->L:Lr/C;

    return-void
.end method

.method public final Y(I)LV/W;
    .locals 2

    .prologue
    iget-object v0, p0, LV/h1;->K:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LV/h1;->Z(I)LV/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LV/W;

    :cond_0
    return-object v1
.end method

.method public final d(I)LV/d;
    .locals 4

    .prologue
    iget-boolean v0, p0, LV/h1;->H:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "use active SlotWriter to create an anchor location instead"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    if-ltz p1, :cond_1

    iget v2, p0, LV/h1;->D:I

    if-ge p1, v2, :cond_1

    move v0, v1

    :cond_1
    if-nez v0, :cond_2

    const-string v0, "Parameter index is out of range"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LV/h1;->J:Ljava/util/ArrayList;

    iget v2, p0, LV/h1;->D:I

    invoke-static {v0, p1, v2}, LV/j1;->t(Ljava/util/ArrayList;II)I

    move-result v2

    if-gez v2, :cond_3

    new-instance v3, LV/d;

    invoke-direct {v3, p1}, LV/d;-><init>(I)V

    add-int/2addr v2, v1

    neg-int p1, v2

    invoke-virtual {v0, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, LV/d;

    :goto_0
    return-object v3
.end method

.method public final e(LV/d;)I
    .locals 1

    .prologue
    iget-boolean v0, p0, LV/h1;->H:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "Use active SlotWriter to determine anchor location instead"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, LV/d;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Anchor refers to a group that was removed"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, LV/d;->a()I

    move-result p1

    return p1
.end method

.method public final f(LV/g1;Ljava/util/HashMap;)V
    .locals 0

    .prologue
    invoke-virtual {p1}, LV/g1;->y()LV/h1;

    move-result-object p1

    if-ne p1, p0, :cond_0

    iget p1, p0, LV/h1;->G:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "Unexpected reader close()"

    invoke-static {p1}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iget p1, p0, LV/h1;->G:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LV/h1;->G:I

    if-eqz p2, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, LV/h1;->K:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-object p2, p0, LV/h1;->K:Ljava/util/HashMap;

    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :cond_3
    :goto_3
    return-void
.end method

.method public final g(LV/k1;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lr/C;)V
    .locals 9

    .prologue
    move-object v8, p0

    invoke-virtual {p1}, LV/k1;->f0()LV/h1;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, v8, :cond_0

    iget-boolean v0, v8, LV/h1;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Unexpected writer close()"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    iput-boolean v1, v8, LV/h1;->H:Z

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, LV/h1;->X([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lr/C;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    iget v0, p0, LV/h1;->D:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LV/U;

    const/4 v1, 0x0

    iget v2, p0, LV/h1;->D:I

    invoke-direct {v0, p0, v1, v2}, LV/U;-><init>(LV/h1;II)V

    return-object v0
.end method

.method public final o()V
    .locals 4

    new-instance v0, Lr/C;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/C;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/h1;->L:Lr/C;

    return-void
.end method

.method public final s()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LV/h1;->K:Ljava/util/HashMap;

    return-void
.end method
