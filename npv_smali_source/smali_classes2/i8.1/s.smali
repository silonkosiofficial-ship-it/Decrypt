.class public final Li8/s;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/s$b;,
        Li8/s$c;
    }
.end annotation


# static fields
.field private static final P:Li8/s;

.field public static Q:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:I

.field private I:Z

.field private J:Li8/s$c;

.field private K:Ljava/util/List;

.field private L:Ljava/util/List;

.field private M:I

.field private N:B

.field private O:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/s$a;

    invoke-direct {v0}, Li8/s$a;-><init>()V

    sput-object v0, Li8/s;->Q:Lp8/r;

    new-instance v0, Li8/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/s;-><init>(Z)V

    sput-object v0, Li8/s;->P:Li8/s;

    invoke-direct {v0}, Li8/s;->Y()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 11

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Li8/s;->M:I

    iput-byte v0, p0, Li8/s;->N:B

    iput v0, p0, Li8/s;->O:I

    invoke-direct {p0}, Li8/s;->Y()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x10

    const/16 v6, 0x20

    if-nez v3, :cond_10

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x8

    if-eq v7, v8, :cond_d

    if-eq v7, v5, :cond_c

    const/16 v9, 0x18

    if-eq v7, v9, :cond_b

    if-eq v7, v6, :cond_9

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_7

    const/16 v8, 0x30

    if-eq v7, v8, :cond_5

    const/16 v8, 0x32

    if-eq v7, v8, :cond_2

    invoke-virtual {p0, p1, v2, p2, v7}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v7

    invoke-virtual {p1, v7}, Lp8/e;->i(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x20

    if-eq v8, v6, :cond_3

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_3

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/s;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_4

    iget-object v8, p0, Li8/s;->L:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v7}, Lp8/e;->h(I)V

    goto :goto_0

    :cond_5
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v6, :cond_6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/s;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_6
    iget-object v7, p0, Li8/s;->L:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_2
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    and-int/lit8 v7, v4, 0x10

    if-eq v7, v5, :cond_8

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/s;->K:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    :cond_8
    iget-object v7, p0, Li8/s;->K:Ljava/util/List;

    sget-object v8, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    goto :goto_2

    :cond_9
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v9

    invoke-static {v9}, Li8/s$c;->e(I)Li8/s$c;

    move-result-object v10

    if-nez v10, :cond_a

    invoke-virtual {v2, v7}, Lp8/f;->n0(I)V

    invoke-virtual {v2, v9}, Lp8/f;->n0(I)V

    goto/16 :goto_0

    :cond_a
    iget v7, p0, Li8/s;->F:I

    or-int/2addr v7, v8

    iput v7, p0, Li8/s;->F:I

    iput-object v10, p0, Li8/s;->J:Li8/s$c;

    goto/16 :goto_0

    :cond_b
    iget v7, p0, Li8/s;->F:I

    or-int/lit8 v7, v7, 0x4

    iput v7, p0, Li8/s;->F:I

    invoke-virtual {p1}, Lp8/e;->j()Z

    move-result v7

    iput-boolean v7, p0, Li8/s;->I:Z

    goto/16 :goto_0

    :cond_c
    iget v7, p0, Li8/s;->F:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Li8/s;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Li8/s;->H:I

    goto/16 :goto_0

    :cond_d
    iget v7, p0, Li8/s;->F:I

    or-int/2addr v7, v1

    iput v7, p0, Li8/s;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Li8/s;->G:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_3
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_4
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v4, 0x10

    if-ne p2, v5, :cond_e

    iget-object p2, p0, Li8/s;->K:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/s;->K:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v6, :cond_f

    iget-object p2, p0, Li8/s;->L:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/s;->L:Ljava/util/List;

    :cond_f
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/s;->E:Lp8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/s;->E:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_10
    and-int/lit8 p1, v4, 0x10

    if-ne p1, v5, :cond_11

    iget-object p1, p0, Li8/s;->K:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/s;->K:Ljava/util/List;

    :cond_11
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_12

    iget-object p1, p0, Li8/s;->L:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/s;->L:Ljava/util/List;

    :cond_12
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/s;->E:Lp8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/s;->E:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/s;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput v0, p0, Li8/s;->M:I

    iput-byte v0, p0, Li8/s;->N:B

    iput v0, p0, Li8/s;->O:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/s;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/s;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Li8/s;->M:I

    iput-byte p1, p0, Li8/s;->N:B

    iput p1, p0, Li8/s;->O:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/s;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/s;I)I
    .locals 0

    iput p1, p0, Li8/s;->G:I

    return p1
.end method

.method static synthetic B(Li8/s;I)I
    .locals 0

    iput p1, p0, Li8/s;->H:I

    return p1
.end method

.method static synthetic C(Li8/s;Z)Z
    .locals 0

    iput-boolean p1, p0, Li8/s;->I:Z

    return p1
.end method

.method static synthetic D(Li8/s;Li8/s$c;)Li8/s$c;
    .locals 0

    iput-object p1, p0, Li8/s;->J:Li8/s$c;

    return-object p1
.end method

.method static synthetic E(Li8/s;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/s;->K:Ljava/util/List;

    return-object p0
.end method

.method static synthetic F(Li8/s;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/s;->K:Ljava/util/List;

    return-object p1
.end method

.method static synthetic G(Li8/s;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/s;->L:Ljava/util/List;

    return-object p0
.end method

.method static synthetic H(Li8/s;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/s;->L:Ljava/util/List;

    return-object p1
.end method

.method static synthetic I(Li8/s;I)I
    .locals 0

    iput p1, p0, Li8/s;->F:I

    return p1
.end method

.method static synthetic J(Li8/s;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/s;->E:Lp8/d;

    return-object p0
.end method

.method public static K()Li8/s;
    .locals 1

    sget-object v0, Li8/s;->P:Li8/s;

    return-object v0
.end method

.method private Y()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/s;->G:I

    iput v0, p0, Li8/s;->H:I

    iput-boolean v0, p0, Li8/s;->I:Z

    sget-object v0, Li8/s$c;->F:Li8/s$c;

    iput-object v0, p0, Li8/s;->J:Li8/s$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/s;->K:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/s;->L:Ljava/util/List;

    return-void
.end method

.method public static Z()Li8/s$b;
    .locals 1

    invoke-static {}, Li8/s$b;->t()Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method public static a0(Li8/s;)Li8/s$b;
    .locals 1

    invoke-static {}, Li8/s;->Z()Li8/s$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/s$b;->B(Li8/s;)Li8/s$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public L()Li8/s;
    .locals 1

    sget-object v0, Li8/s;->P:Li8/s;

    return-object v0
.end method

.method public M()I
    .locals 1

    iget v0, p0, Li8/s;->G:I

    return v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Li8/s;->H:I

    return v0
.end method

.method public O()Z
    .locals 1

    iget-boolean v0, p0, Li8/s;->I:Z

    return v0
.end method

.method public P(I)Li8/q;
    .locals 1

    iget-object v0, p0, Li8/s;->K:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;

    return-object p1
.end method

.method public Q()I
    .locals 1

    iget-object v0, p0, Li8/s;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public R()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/s;->L:Ljava/util/List;

    return-object v0
.end method

.method public S()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/s;->K:Ljava/util/List;

    return-object v0
.end method

.method public T()Li8/s$c;
    .locals 1

    iget-object v0, p0, Li8/s;->J:Li8/s$c;

    return-object v0
.end method

.method public U()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/s;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public V()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/s;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public W()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/s;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public X()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/s;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/s;->L()Li8/s;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Li8/s;->O:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/s;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/s;->G:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Li8/s;->F:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Li8/s;->H:I

    invoke-static {v3, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/s;->F:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-boolean v4, p0, Li8/s;->I:Z

    invoke-static {v1, v4}, Lp8/f;->a(IZ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/s;->F:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Li8/s;->J:Li8/s$c;

    invoke-virtual {v1}, Li8/s$c;->c()I

    move-result v1

    invoke-static {v3, v1}, Lp8/f;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    move v1, v2

    :goto_1
    iget-object v3, p0, Li8/s;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    iget-object v3, p0, Li8/s;->K:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x5

    invoke-static {v4, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_2
    iget-object v3, p0, Li8/s;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    iget-object v3, p0, Li8/s;->L:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lp8/f;->p(I)I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    add-int/2addr v0, v1

    invoke-virtual {p0}, Li8/s;->R()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1}, Lp8/f;->p(I)I

    move-result v2

    add-int/2addr v0, v2

    :cond_7
    iput v1, p0, Li8/s;->M:I

    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/s;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/s;->O:I

    return v0
.end method

.method public b0()Li8/s$b;
    .locals 1

    invoke-static {}, Li8/s;->Z()Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/s;->b0()Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()Li8/s$b;
    .locals 1

    invoke-static {p0}, Li8/s;->a0(Li8/s;)Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/s;->N:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/s;->U()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/s;->N:B

    return v2

    :cond_2
    invoke-virtual {p0}, Li8/s;->V()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Li8/s;->N:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/s;->Q()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, Li8/s;->P(I)Li8/q;

    move-result-object v3

    invoke-virtual {v3}, Li8/q;->d()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Li8/s;->N:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Li8/s;->N:B

    return v2

    :cond_6
    iput-byte v1, p0, Li8/s;->N:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/s;->c0()Li8/s$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Li8/s;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/s;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/s;->G:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_0
    iget v1, p0, Li8/s;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Li8/s;->H:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_1
    iget v1, p0, Li8/s;->F:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-boolean v3, p0, Li8/s;->I:Z

    invoke-virtual {p1, v1, v3}, Lp8/f;->K(IZ)V

    :cond_2
    iget v1, p0, Li8/s;->F:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Li8/s;->J:Li8/s$c;

    invoke-virtual {v1}, Li8/s$c;->c()I

    move-result v1

    invoke-virtual {p1, v2, v1}, Lp8/f;->R(II)V

    :cond_3
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Li8/s;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    iget-object v3, p0, Li8/s;->K:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x5

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Li8/s;->R()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    const/16 v2, 0x32

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v2, p0, Li8/s;->M:I

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    :cond_5
    :goto_1
    iget-object v2, p0, Li8/s;->L:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Li8/s;->L:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Lp8/f;->a0(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    const/16 v1, 0x3e8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/s;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
