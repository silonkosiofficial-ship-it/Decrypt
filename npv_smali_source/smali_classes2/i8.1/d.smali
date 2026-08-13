.class public final Li8/d;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/d$b;
    }
.end annotation


# static fields
.field private static final L:Li8/d;

.field public static M:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:Ljava/util/List;

.field private I:Ljava/util/List;

.field private J:B

.field private K:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/d$a;

    invoke-direct {v0}, Li8/d$a;-><init>()V

    sput-object v0, Li8/d;->M:Lp8/r;

    new-instance v0, Li8/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/d;-><init>(Z)V

    sput-object v0, Li8/d;->L:Li8/d;

    invoke-direct {v0}, Li8/d;->P()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 10

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/d;->J:B

    iput v0, p0, Li8/d;->K:I

    invoke-direct {p0}, Li8/d;->P()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v3, :cond_c

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x8

    if-eq v7, v8, :cond_9

    const/16 v8, 0x12

    if-eq v7, v8, :cond_7

    const/16 v8, 0xf8

    if-eq v7, v8, :cond_5

    const/16 v8, 0xfa

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

    and-int/lit8 v8, v4, 0x4

    if-eq v8, v6, :cond_3

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_3

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/d;->I:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_4

    iget-object v8, p0, Li8/d;->I:Ljava/util/List;

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
    and-int/lit8 v7, v4, 0x4

    if-eq v7, v6, :cond_6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/d;->I:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    :cond_6
    iget-object v7, p0, Li8/d;->I:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_2
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    and-int/lit8 v7, v4, 0x2

    if-eq v7, v5, :cond_8

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/d;->H:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    :cond_8
    iget-object v7, p0, Li8/d;->H:Ljava/util/List;

    sget-object v8, Li8/u;->P:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    goto :goto_2

    :cond_9
    iget v7, p0, Li8/d;->F:I

    or-int/2addr v7, v1

    iput v7, p0, Li8/d;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Li8/d;->G:I
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
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_a

    iget-object p2, p0, Li8/d;->H:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/d;->H:Ljava/util/List;

    :cond_a
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v6, :cond_b

    iget-object p2, p0, Li8/d;->I:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/d;->I:Ljava/util/List;

    :cond_b
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/d;->E:Lp8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/d;->E:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    iget-object p1, p0, Li8/d;->H:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/d;->H:Ljava/util/List;

    :cond_d
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v6, :cond_e

    iget-object p1, p0, Li8/d;->I:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/d;->I:Ljava/util/List;

    :cond_e
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/d;->E:Lp8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/d;->E:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/d;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/d;->J:B

    iput v0, p0, Li8/d;->K:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/d;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/d;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/d;->J:B

    iput p1, p0, Li8/d;->K:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/d;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/d;I)I
    .locals 0

    iput p1, p0, Li8/d;->G:I

    return p1
.end method

.method static synthetic B(Li8/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/d;->H:Ljava/util/List;

    return-object p0
.end method

.method static synthetic C(Li8/d;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/d;->H:Ljava/util/List;

    return-object p1
.end method

.method static synthetic D(Li8/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/d;->I:Ljava/util/List;

    return-object p0
.end method

.method static synthetic E(Li8/d;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/d;->I:Ljava/util/List;

    return-object p1
.end method

.method static synthetic F(Li8/d;I)I
    .locals 0

    iput p1, p0, Li8/d;->F:I

    return p1
.end method

.method static synthetic G(Li8/d;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/d;->E:Lp8/d;

    return-object p0
.end method

.method public static H()Li8/d;
    .locals 1

    sget-object v0, Li8/d;->L:Li8/d;

    return-object v0
.end method

.method private P()V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Li8/d;->G:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/d;->H:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/d;->I:Ljava/util/List;

    return-void
.end method

.method public static Q()Li8/d$b;
    .locals 1

    invoke-static {}, Li8/d$b;->t()Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method public static R(Li8/d;)Li8/d$b;
    .locals 1

    invoke-static {}, Li8/d;->Q()Li8/d$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/d$b;->B(Li8/d;)Li8/d$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public I()Li8/d;
    .locals 1

    sget-object v0, Li8/d;->L:Li8/d;

    return-object v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Li8/d;->G:I

    return v0
.end method

.method public K(I)Li8/u;
    .locals 1

    iget-object v0, p0, Li8/d;->H:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/u;

    return-object p1
.end method

.method public L()I
    .locals 1

    iget-object v0, p0, Li8/d;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/d;->H:Ljava/util/List;

    return-object v0
.end method

.method public N()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/d;->I:Ljava/util/List;

    return-object v0
.end method

.method public O()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/d;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public S()Li8/d$b;
    .locals 1

    invoke-static {}, Li8/d;->Q()Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method public T()Li8/d$b;
    .locals 1

    invoke-static {p0}, Li8/d;->R(Li8/d;)Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/d;->I()Li8/d;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Li8/d;->K:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/d;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/d;->G:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    move v1, v2

    :goto_1
    iget-object v3, p0, Li8/d;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v1, v3, :cond_2

    iget-object v3, p0, Li8/d;->H:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-static {v4, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_2
    iget-object v3, p0, Li8/d;->I:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Li8/d;->I:Ljava/util/List;

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

    :cond_3
    add-int/2addr v0, v1

    invoke-virtual {p0}, Li8/d;->N()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/2addr v1, v4

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/d;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/d;->K:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/d;->S()Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/d;->J:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/d;->L()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {p0, v0}, Li8/d;->K(I)Li8/u;

    move-result-object v3

    invoke-virtual {v3}, Li8/u;->d()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Li8/d;->J:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, Li8/d;->J:B

    return v2

    :cond_4
    iput-byte v1, p0, Li8/d;->J:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/d;->T()Li8/d$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Li8/d;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/d;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/d;->G:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Li8/d;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Li8/d;->H:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x2

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p0, Li8/d;->I:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Li8/d;->I:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x1f

    invoke-virtual {p1, v3, v2}, Lp8/f;->Z(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/d;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
