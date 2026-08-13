.class public final Li8/c$b;
.super Lp8/i$c;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Ljava/util/List;

.field private K:Ljava/util/List;

.field private L:Ljava/util/List;

.field private M:Ljava/util/List;

.field private N:Ljava/util/List;

.field private O:Ljava/util/List;

.field private P:Ljava/util/List;

.field private Q:Ljava/util/List;

.field private R:Ljava/util/List;

.field private S:Ljava/util/List;

.field private T:Ljava/util/List;

.field private U:Ljava/util/List;

.field private V:I

.field private W:Li8/q;

.field private X:I

.field private Y:Ljava/util/List;

.field private Z:Ljava/util/List;

.field private a0:Ljava/util/List;

.field private b0:Li8/t;

.field private c0:Ljava/util/List;

.field private d0:Li8/w;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Li8/c$b;->G:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->J:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->K:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->L:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->M:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->N:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->O:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->P:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->Q:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->R:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->S:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->T:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->U:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->W:Li8/q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->Y:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->Z:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->a0:Ljava/util/List;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->b0:Li8/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->c0:Ljava/util/List;

    invoke-static {}, Li8/w;->u()Li8/w;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->d0:Li8/w;

    invoke-direct {p0}, Li8/c$b;->Q()V

    return-void
.end method

.method private A()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->N:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->N:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private B()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x2000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->T:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->T:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private C()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->Q:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->Q:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private E()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->Y:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->Y:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private F()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->a0:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->a0:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private G()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->Z:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->Z:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private H()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->M:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->M:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private I()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->R:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->R:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private J()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x4000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->U:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->U:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private K()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->L:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->L:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private L()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->K:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->K:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private M()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->S:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->S:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private O()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->J:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->J:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private P()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->c0:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->c0:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private Q()V
    .locals 0

    return-void
.end method

.method static synthetic t()Li8/c$b;
    .locals 1

    invoke-static {}, Li8/c$b;->x()Li8/c$b;

    move-result-object v0

    return-object v0
.end method

.method private static x()Li8/c$b;
    .locals 1

    new-instance v0, Li8/c$b;

    invoke-direct {v0}, Li8/c$b;-><init>()V

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->P:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->P:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/c$b;->O:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/c$b;->O:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    :cond_0
    return-void
.end method


# virtual methods
.method public S(Li8/c;)Li8/c$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/c;->z0()Li8/c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/c;->m1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/c;->E0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/c$b;->Y(I)Li8/c$b;

    :cond_1
    invoke-virtual {p1}, Li8/c;->n1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/c;->F0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/c$b;->Z(I)Li8/c$b;

    :cond_2
    invoke-virtual {p1}, Li8/c;->l1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/c;->r0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/c$b;->X(I)Li8/c$b;

    :cond_3
    invoke-static {p1}, Li8/c;->a0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Li8/c$b;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Li8/c;->a0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->J:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Li8/c$b;->O()V

    iget-object v0, p0, Li8/c$b;->J:Ljava/util/List;

    invoke-static {p1}, Li8/c;->a0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    :goto_0
    invoke-static {p1}, Li8/c;->c0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Li8/c$b;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p1}, Li8/c;->c0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->K:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_1

    :cond_6
    invoke-direct {p0}, Li8/c$b;->L()V

    iget-object v0, p0, Li8/c$b;->K:Ljava/util/List;

    invoke-static {p1}, Li8/c;->c0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    :goto_1
    invoke-static {p1}, Li8/c;->e0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Li8/c$b;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1}, Li8/c;->e0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->L:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_2

    :cond_8
    invoke-direct {p0}, Li8/c$b;->K()V

    iget-object v0, p0, Li8/c$b;->L:Ljava/util/List;

    invoke-static {p1}, Li8/c;->e0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_2
    invoke-static {p1}, Li8/c;->h0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Li8/c$b;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, Li8/c;->h0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->M:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_3

    :cond_a
    invoke-direct {p0}, Li8/c$b;->H()V

    iget-object v0, p0, Li8/c$b;->M:Ljava/util/List;

    invoke-static {p1}, Li8/c;->h0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    :goto_3
    invoke-static {p1}, Li8/c;->j0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Li8/c$b;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {p1}, Li8/c;->j0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->N:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_4

    :cond_c
    invoke-direct {p0}, Li8/c$b;->A()V

    iget-object v0, p0, Li8/c$b;->N:Ljava/util/List;

    invoke-static {p1}, Li8/c;->j0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_d
    :goto_4
    invoke-static {p1}, Li8/c;->l0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Li8/c$b;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p1}, Li8/c;->l0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->O:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_5

    :cond_e
    invoke-direct {p0}, Li8/c$b;->z()V

    iget-object v0, p0, Li8/c$b;->O:Ljava/util/List;

    invoke-static {p1}, Li8/c;->l0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_5
    invoke-static {p1}, Li8/c;->n0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Li8/c$b;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {p1}, Li8/c;->n0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->P:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_6

    :cond_10
    invoke-direct {p0}, Li8/c$b;->y()V

    iget-object v0, p0, Li8/c$b;->P:Ljava/util/List;

    invoke-static {p1}, Li8/c;->n0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_11
    :goto_6
    invoke-static {p1}, Li8/c;->p0(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Li8/c$b;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {p1}, Li8/c;->p0(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->Q:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_7

    :cond_12
    invoke-direct {p0}, Li8/c$b;->C()V

    iget-object v0, p0, Li8/c$b;->Q:Ljava/util/List;

    invoke-static {p1}, Li8/c;->p0(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_13
    :goto_7
    invoke-static {p1}, Li8/c;->A(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Li8/c$b;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {p1}, Li8/c;->A(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->R:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_8

    :cond_14
    invoke-direct {p0}, Li8/c$b;->I()V

    iget-object v0, p0, Li8/c$b;->R:Ljava/util/List;

    invoke-static {p1}, Li8/c;->A(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_15
    :goto_8
    invoke-static {p1}, Li8/c;->C(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Li8/c$b;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {p1}, Li8/c;->C(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->S:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_9

    :cond_16
    invoke-direct {p0}, Li8/c$b;->M()V

    iget-object v0, p0, Li8/c$b;->S:Ljava/util/List;

    invoke-static {p1}, Li8/c;->C(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_17
    :goto_9
    invoke-static {p1}, Li8/c;->E(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Li8/c$b;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {p1}, Li8/c;->E(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->T:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_a

    :cond_18
    invoke-direct {p0}, Li8/c$b;->B()V

    iget-object v0, p0, Li8/c$b;->T:Ljava/util/List;

    invoke-static {p1}, Li8/c;->E(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_19
    :goto_a
    invoke-static {p1}, Li8/c;->G(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Li8/c$b;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {p1}, Li8/c;->G(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->U:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_b

    :cond_1a
    invoke-direct {p0}, Li8/c$b;->J()V

    iget-object v0, p0, Li8/c$b;->U:Ljava/util/List;

    invoke-static {p1}, Li8/c;->G(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1b
    :goto_b
    invoke-virtual {p1}, Li8/c;->o1()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, Li8/c;->J0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/c$b;->a0(I)Li8/c$b;

    :cond_1c
    invoke-virtual {p1}, Li8/c;->p1()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p1}, Li8/c;->K0()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/c$b;->U(Li8/q;)Li8/c$b;

    :cond_1d
    invoke-virtual {p1}, Li8/c;->q1()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {p1}, Li8/c;->L0()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/c$b;->b0(I)Li8/c$b;

    :cond_1e
    invoke-static {p1}, Li8/c;->L(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p0, Li8/c$b;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {p1}, Li8/c;->L(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->Y:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    const v1, -0x40001

    and-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_c

    :cond_1f
    invoke-direct {p0}, Li8/c$b;->E()V

    iget-object v0, p0, Li8/c$b;->Y:Ljava/util/List;

    invoke-static {p1}, Li8/c;->L(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_20
    :goto_c
    invoke-static {p1}, Li8/c;->N(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_22

    iget-object v0, p0, Li8/c$b;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {p1}, Li8/c;->N(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->Z:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    const v1, -0x80001

    and-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_d

    :cond_21
    invoke-direct {p0}, Li8/c$b;->G()V

    iget-object v0, p0, Li8/c$b;->Z:Ljava/util/List;

    invoke-static {p1}, Li8/c;->N(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_22
    :goto_d
    invoke-static {p1}, Li8/c;->P(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    iget-object v0, p0, Li8/c$b;->a0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {p1}, Li8/c;->P(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->a0:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    const v1, -0x100001

    and-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_e

    :cond_23
    invoke-direct {p0}, Li8/c$b;->F()V

    iget-object v0, p0, Li8/c$b;->a0:Ljava/util/List;

    invoke-static {p1}, Li8/c;->P(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_24
    :goto_e
    invoke-virtual {p1}, Li8/c;->r1()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual {p1}, Li8/c;->i1()Li8/t;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/c$b;->V(Li8/t;)Li8/c$b;

    :cond_25
    invoke-static {p1}, Li8/c;->S(Li8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, p0, Li8/c$b;->c0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {p1}, Li8/c;->S(Li8/c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c$b;->c0:Ljava/util/List;

    iget v0, p0, Li8/c$b;->F:I

    const v1, -0x400001

    and-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    goto :goto_f

    :cond_26
    invoke-direct {p0}, Li8/c$b;->P()V

    iget-object v0, p0, Li8/c$b;->c0:Ljava/util/List;

    invoke-static {p1}, Li8/c;->S(Li8/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_27
    :goto_f
    invoke-virtual {p1}, Li8/c;->s1()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {p1}, Li8/c;->k1()Li8/w;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/c$b;->W(Li8/w;)Li8/c$b;

    :cond_28
    invoke-virtual {p0, p1}, Lp8/i$c;->r(Lp8/i$d;)V

    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/c;->W(Li8/c;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public T(Lp8/e;Lp8/g;)Li8/c$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/c;->n0:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/c;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/c$b;->S(Li8/c;)Li8/c$b;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p1}, Lp8/k;->a()Lp8/p;

    move-result-object p2

    check-cast p2, Li8/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Li8/c$b;->S(Li8/c;)Li8/c$b;

    :cond_1
    throw p1
.end method

.method public U(Li8/q;)Li8/c$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/c$b;->W:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/c$b;->W:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/c$b;->W:Li8/q;

    iget p1, p0, Li8/c$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/c$b;->F:I

    return-object p0
.end method

.method public V(Li8/t;)Li8/c$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x200000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/c$b;->b0:Li8/t;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/c$b;->b0:Li8/t;

    invoke-static {v0}, Li8/t;->E(Li8/t;)Li8/t$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/t$b;->w(Li8/t;)Li8/t$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/t$b;->q()Li8/t;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/c$b;->b0:Li8/t;

    iget p1, p0, Li8/c$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/c$b;->F:I

    return-object p0
.end method

.method public W(Li8/w;)Li8/c$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x800000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/c$b;->d0:Li8/w;

    invoke-static {}, Li8/w;->u()Li8/w;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/c$b;->d0:Li8/w;

    invoke-static {v0}, Li8/w;->z(Li8/w;)Li8/w$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/w$b;->w(Li8/w;)Li8/w$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/w$b;->q()Li8/w;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/c$b;->d0:Li8/w;

    iget p1, p0, Li8/c$b;->F:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/c$b;->F:I

    return-object p0
.end method

.method public X(I)Li8/c$b;
    .locals 1

    iget v0, p0, Li8/c$b;->F:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/c$b;->F:I

    iput p1, p0, Li8/c$b;->I:I

    return-object p0
.end method

.method public Y(I)Li8/c$b;
    .locals 1

    iget v0, p0, Li8/c$b;->F:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/c$b;->F:I

    iput p1, p0, Li8/c$b;->G:I

    return-object p0
.end method

.method public Z(I)Li8/c$b;
    .locals 1

    iget v0, p0, Li8/c$b;->F:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li8/c$b;->F:I

    iput p1, p0, Li8/c$b;->H:I

    return-object p0
.end method

.method public a0(I)Li8/c$b;
    .locals 2

    iget v0, p0, Li8/c$b;->F:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    iput p1, p0, Li8/c$b;->V:I

    return-object p0
.end method

.method public b0(I)Li8/c$b;
    .locals 2

    iget v0, p0, Li8/c$b;->F:I

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    iput v0, p0, Li8/c$b;->F:I

    iput p1, p0, Li8/c$b;->X:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/c$b;->w()Li8/c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/c$b;->T(Lp8/e;Lp8/g;)Li8/c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/c$b;->u()Li8/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/c;

    invoke-virtual {p0, p1}, Li8/c$b;->S(Li8/c;)Li8/c$b;

    move-result-object p1

    return-object p1
.end method

.method public u()Li8/c;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/c$b;->v()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public v()Li8/c;
    .locals 5

    .prologue
    new-instance v0, Li8/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/c;-><init>(Lp8/i$c;Li8/a;)V

    iget v1, p0, Li8/c$b;->F:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Li8/c$b;->G:I

    invoke-static {v0, v2}, Li8/c;->X(Li8/c;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Li8/c$b;->H:I

    invoke-static {v0, v2}, Li8/c;->Y(Li8/c;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, Li8/c$b;->I:I

    invoke-static {v0, v2}, Li8/c;->Z(Li8/c;I)I

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x8

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_3

    iget-object v2, p0, Li8/c$b;->J:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->J:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit8 v2, v2, -0x9

    iput v2, p0, Li8/c$b;->F:I

    :cond_3
    iget-object v2, p0, Li8/c$b;->J:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->b0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_4

    iget-object v2, p0, Li8/c$b;->K:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->K:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit8 v2, v2, -0x11

    iput v2, p0, Li8/c$b;->F:I

    :cond_4
    iget-object v2, p0, Li8/c$b;->K:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->d0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    iget-object v2, p0, Li8/c$b;->L:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->L:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, Li8/c$b;->F:I

    :cond_5
    iget-object v2, p0, Li8/c$b;->L:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->f0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x40

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_6

    iget-object v2, p0, Li8/c$b;->M:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->M:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit8 v2, v2, -0x41

    iput v2, p0, Li8/c$b;->F:I

    :cond_6
    iget-object v2, p0, Li8/c$b;->M:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->i0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x80

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_7

    iget-object v2, p0, Li8/c$b;->N:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->N:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x81

    iput v2, p0, Li8/c$b;->F:I

    :cond_7
    iget-object v2, p0, Li8/c$b;->N:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->k0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, Li8/c$b;->O:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->O:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, Li8/c$b;->F:I

    :cond_8
    iget-object v2, p0, Li8/c$b;->O:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->m0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, Li8/c$b;->P:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->P:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, Li8/c$b;->F:I

    :cond_9
    iget-object v2, p0, Li8/c$b;->P:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->o0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x400

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_a

    iget-object v2, p0, Li8/c$b;->Q:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->Q:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, Li8/c$b;->F:I

    :cond_a
    iget-object v2, p0, Li8/c$b;->Q:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->q0(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x800

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_b

    iget-object v2, p0, Li8/c$b;->R:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->R:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x801

    iput v2, p0, Li8/c$b;->F:I

    :cond_b
    iget-object v2, p0, Li8/c$b;->R:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->B(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x1000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_c

    iget-object v2, p0, Li8/c$b;->S:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->S:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x1001

    iput v2, p0, Li8/c$b;->F:I

    :cond_c
    iget-object v2, p0, Li8/c$b;->S:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->D(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x2000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_d

    iget-object v2, p0, Li8/c$b;->T:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->T:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x2001

    iput v2, p0, Li8/c$b;->F:I

    :cond_d
    iget-object v2, p0, Li8/c$b;->T:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->F(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/16 v4, 0x4000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_e

    iget-object v2, p0, Li8/c$b;->U:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->U:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    and-int/lit16 v2, v2, -0x4001

    iput v2, p0, Li8/c$b;->F:I

    :cond_e
    iget-object v2, p0, Li8/c$b;->U:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->H(Li8/c;Ljava/util/List;)Ljava/util/List;

    const v2, 0x8000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_f

    or-int/lit8 v3, v3, 0x8

    :cond_f
    iget v2, p0, Li8/c$b;->V:I

    invoke-static {v0, v2}, Li8/c;->I(Li8/c;I)I

    const/high16 v2, 0x10000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_10

    or-int/lit8 v3, v3, 0x10

    :cond_10
    iget-object v2, p0, Li8/c$b;->W:Li8/q;

    invoke-static {v0, v2}, Li8/c;->J(Li8/c;Li8/q;)Li8/q;

    const/high16 v2, 0x20000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_11

    or-int/lit8 v3, v3, 0x20

    :cond_11
    iget v2, p0, Li8/c$b;->X:I

    invoke-static {v0, v2}, Li8/c;->K(Li8/c;I)I

    iget v2, p0, Li8/c$b;->F:I

    const/high16 v4, 0x40000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_12

    iget-object v2, p0, Li8/c$b;->Y:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->Y:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const v4, -0x40001

    and-int/2addr v2, v4

    iput v2, p0, Li8/c$b;->F:I

    :cond_12
    iget-object v2, p0, Li8/c$b;->Y:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->M(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/high16 v4, 0x80000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_13

    iget-object v2, p0, Li8/c$b;->Z:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->Z:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const v4, -0x80001

    and-int/2addr v2, v4

    iput v2, p0, Li8/c$b;->F:I

    :cond_13
    iget-object v2, p0, Li8/c$b;->Z:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->O(Li8/c;Ljava/util/List;)Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const/high16 v4, 0x100000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_14

    iget-object v2, p0, Li8/c$b;->a0:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->a0:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const v4, -0x100001

    and-int/2addr v2, v4

    iput v2, p0, Li8/c$b;->F:I

    :cond_14
    iget-object v2, p0, Li8/c$b;->a0:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->Q(Li8/c;Ljava/util/List;)Ljava/util/List;

    const/high16 v2, 0x200000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_15

    or-int/lit8 v3, v3, 0x40

    :cond_15
    iget-object v2, p0, Li8/c$b;->b0:Li8/t;

    invoke-static {v0, v2}, Li8/c;->R(Li8/c;Li8/t;)Li8/t;

    iget v2, p0, Li8/c$b;->F:I

    const/high16 v4, 0x400000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_16

    iget-object v2, p0, Li8/c$b;->c0:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/c$b;->c0:Ljava/util/List;

    iget v2, p0, Li8/c$b;->F:I

    const v4, -0x400001

    and-int/2addr v2, v4

    iput v2, p0, Li8/c$b;->F:I

    :cond_16
    iget-object v2, p0, Li8/c$b;->c0:Ljava/util/List;

    invoke-static {v0, v2}, Li8/c;->T(Li8/c;Ljava/util/List;)Ljava/util/List;

    const/high16 v2, 0x800000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_17

    or-int/lit16 v3, v3, 0x80

    :cond_17
    iget-object v1, p0, Li8/c$b;->d0:Li8/w;

    invoke-static {v0, v1}, Li8/c;->U(Li8/c;Li8/w;)Li8/w;

    invoke-static {v0, v3}, Li8/c;->V(Li8/c;I)I

    return-object v0
.end method

.method public w()Li8/c$b;
    .locals 2

    invoke-static {}, Li8/c$b;->x()Li8/c$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/c$b;->v()Li8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/c$b;->S(Li8/c;)Li8/c$b;

    move-result-object v0

    return-object v0
.end method
