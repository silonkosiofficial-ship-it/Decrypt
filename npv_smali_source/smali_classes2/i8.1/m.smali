.class public final Li8/m;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/m$b;
    }
.end annotation


# static fields
.field private static final M:Li8/m;

.field public static N:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:Li8/p;

.field private H:Li8/o;

.field private I:Li8/l;

.field private J:Ljava/util/List;

.field private K:B

.field private L:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/m$a;

    invoke-direct {v0}, Li8/m$a;-><init>()V

    sput-object v0, Li8/m;->N:Lp8/r;

    new-instance v0, Li8/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/m;-><init>(Z)V

    sput-object v0, Li8/m;->M:Li8/m;

    invoke-direct {v0}, Li8/m;->S()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/m;->K:B

    iput v0, p0, Li8/m;->L:I

    invoke-direct {p0}, Li8/m;->S()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x8

    if-nez v3, :cond_e

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-eq v6, v7, :cond_a

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x22

    if-eq v6, v7, :cond_2

    invoke-virtual {p0, p1, v2, p2, v6}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    and-int/lit8 v6, v4, 0x8

    if-eq v6, v5, :cond_3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Li8/m;->J:Ljava/util/List;

    move v4, v5

    :cond_3
    iget-object v6, p0, Li8/m;->J:Ljava/util/List;

    sget-object v7, Li8/c;->n0:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget v6, p0, Li8/m;->F:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_5

    iget-object v6, p0, Li8/m;->I:Li8/l;

    invoke-virtual {v6}, Li8/l;->e0()Li8/l$b;

    move-result-object v8

    :cond_5
    sget-object v6, Li8/l;->O:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    check-cast v6, Li8/l;

    iput-object v6, p0, Li8/m;->I:Li8/l;

    if-eqz v8, :cond_6

    invoke-virtual {v8, v6}, Li8/l$b;->C(Li8/l;)Li8/l$b;

    invoke-virtual {v8}, Li8/l$b;->v()Li8/l;

    move-result-object v6

    iput-object v6, p0, Li8/m;->I:Li8/l;

    :cond_6
    iget v6, p0, Li8/m;->F:I

    :goto_1
    or-int/2addr v6, v7

    iput v6, p0, Li8/m;->F:I

    goto :goto_0

    :cond_7
    iget v6, p0, Li8/m;->F:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_8

    iget-object v6, p0, Li8/m;->H:Li8/o;

    invoke-virtual {v6}, Li8/o;->B()Li8/o$b;

    move-result-object v8

    :cond_8
    sget-object v6, Li8/o;->I:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    check-cast v6, Li8/o;

    iput-object v6, p0, Li8/m;->H:Li8/o;

    if-eqz v8, :cond_9

    invoke-virtual {v8, v6}, Li8/o$b;->w(Li8/o;)Li8/o$b;

    invoke-virtual {v8}, Li8/o$b;->q()Li8/o;

    move-result-object v6

    iput-object v6, p0, Li8/m;->H:Li8/o;

    :cond_9
    iget v6, p0, Li8/m;->F:I

    goto :goto_1

    :cond_a
    iget v6, p0, Li8/m;->F:I

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_b

    iget-object v6, p0, Li8/m;->G:Li8/p;

    invoke-virtual {v6}, Li8/p;->B()Li8/p$b;

    move-result-object v8

    :cond_b
    sget-object v6, Li8/p;->I:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    check-cast v6, Li8/p;

    iput-object v6, p0, Li8/m;->G:Li8/p;

    if-eqz v8, :cond_c

    invoke-virtual {v8, v6}, Li8/p$b;->w(Li8/p;)Li8/p$b;

    invoke-virtual {v8}, Li8/p$b;->q()Li8/p;

    move-result-object v6

    iput-object v6, p0, Li8/m;->G:Li8/p;

    :cond_c
    iget v6, p0, Li8/m;->F:I

    or-int/2addr v6, v1

    iput v6, p0, Li8/m;->F:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_2
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_3
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v5, :cond_d

    iget-object p2, p0, Li8/m;->J:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/m;->J:Ljava/util/List;

    :cond_d
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/m;->E:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/m;->E:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_e
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v5, :cond_f

    iget-object p1, p0, Li8/m;->J:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/m;->J:Ljava/util/List;

    :cond_f
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/m;->E:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/m;->E:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/m;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/m;->K:B

    iput v0, p0, Li8/m;->L:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/m;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/m;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/m;->K:B

    iput p1, p0, Li8/m;->L:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/m;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/m;Li8/p;)Li8/p;
    .locals 0

    iput-object p1, p0, Li8/m;->G:Li8/p;

    return-object p1
.end method

.method static synthetic B(Li8/m;Li8/o;)Li8/o;
    .locals 0

    iput-object p1, p0, Li8/m;->H:Li8/o;

    return-object p1
.end method

.method static synthetic C(Li8/m;Li8/l;)Li8/l;
    .locals 0

    iput-object p1, p0, Li8/m;->I:Li8/l;

    return-object p1
.end method

.method static synthetic D(Li8/m;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/m;->J:Ljava/util/List;

    return-object p0
.end method

.method static synthetic E(Li8/m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/m;->J:Ljava/util/List;

    return-object p1
.end method

.method static synthetic F(Li8/m;I)I
    .locals 0

    iput p1, p0, Li8/m;->F:I

    return p1
.end method

.method static synthetic G(Li8/m;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/m;->E:Lp8/d;

    return-object p0
.end method

.method public static K()Li8/m;
    .locals 1

    sget-object v0, Li8/m;->M:Li8/m;

    return-object v0
.end method

.method private S()V
    .locals 1

    invoke-static {}, Li8/p;->u()Li8/p;

    move-result-object v0

    iput-object v0, p0, Li8/m;->G:Li8/p;

    invoke-static {}, Li8/o;->u()Li8/o;

    move-result-object v0

    iput-object v0, p0, Li8/m;->H:Li8/o;

    invoke-static {}, Li8/l;->K()Li8/l;

    move-result-object v0

    iput-object v0, p0, Li8/m;->I:Li8/l;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/m;->J:Ljava/util/List;

    return-void
.end method

.method public static T()Li8/m$b;
    .locals 1

    invoke-static {}, Li8/m$b;->t()Li8/m$b;

    move-result-object v0

    return-object v0
.end method

.method public static U(Li8/m;)Li8/m$b;
    .locals 1

    invoke-static {}, Li8/m;->T()Li8/m$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/m$b;->A(Li8/m;)Li8/m$b;

    move-result-object p0

    return-object p0
.end method

.method public static W(Ljava/io/InputStream;Lp8/g;)Li8/m;
    .locals 1

    sget-object v0, Li8/m;->N:Lp8/r;

    invoke-interface {v0, p0, p1}, Lp8/r;->c(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/m;

    return-object p0
.end method


# virtual methods
.method public H(I)Li8/c;
    .locals 1

    iget-object v0, p0, Li8/m;->J:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/c;

    return-object p1
.end method

.method public I()I
    .locals 1

    iget-object v0, p0, Li8/m;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/m;->J:Ljava/util/List;

    return-object v0
.end method

.method public L()Li8/m;
    .locals 1

    sget-object v0, Li8/m;->M:Li8/m;

    return-object v0
.end method

.method public M()Li8/l;
    .locals 1

    iget-object v0, p0, Li8/m;->I:Li8/l;

    return-object v0
.end method

.method public N()Li8/o;
    .locals 1

    iget-object v0, p0, Li8/m;->H:Li8/o;

    return-object v0
.end method

.method public O()Li8/p;
    .locals 1

    iget-object v0, p0, Li8/m;->G:Li8/p;

    return-object v0
.end method

.method public P()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/m;->F:I

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

.method public Q()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/m;->F:I

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

.method public R()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/m;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public V()Li8/m$b;
    .locals 1

    invoke-static {}, Li8/m;->T()Li8/m$b;

    move-result-object v0

    return-object v0
.end method

.method public X()Li8/m$b;
    .locals 1

    invoke-static {p0}, Li8/m;->U(Li8/m;)Li8/m$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/m;->L()Li8/m;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Li8/m;->L:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/m;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li8/m;->G:Li8/p;

    invoke-static {v1, v0}, Lp8/f;->r(ILp8/p;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Li8/m;->F:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Li8/m;->H:Li8/o;

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/m;->F:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-object v4, p0, Li8/m;->I:Li8/l;

    invoke-static {v1, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    :goto_1
    iget-object v1, p0, Li8/m;->J:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    iget-object v1, p0, Li8/m;->J:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/m;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/m;->L:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/m;->V()Li8/m$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/m;->K:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/m;->Q()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Li8/m;->N()Li8/o;

    move-result-object v0

    invoke-virtual {v0}, Li8/o;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/m;->K:B

    return v2

    :cond_2
    invoke-virtual {p0}, Li8/m;->P()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Li8/m;->M()Li8/l;

    move-result-object v0

    invoke-virtual {v0}, Li8/l;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Li8/m;->K:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/m;->I()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, Li8/m;->H(I)Li8/c;

    move-result-object v3

    invoke-virtual {v3}, Li8/c;->d()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Li8/m;->K:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Li8/m;->K:B

    return v2

    :cond_6
    iput-byte v1, p0, Li8/m;->K:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/m;->X()Li8/m$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Li8/m;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/m;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Li8/m;->G:Li8/p;

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_0
    iget v1, p0, Li8/m;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Li8/m;->H:Li8/o;

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_1
    iget v1, p0, Li8/m;->F:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, Li8/m;->I:Li8/l;

    invoke-virtual {p1, v1, v3}, Lp8/f;->c0(ILp8/p;)V

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Li8/m;->J:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    iget-object v3, p0, Li8/m;->J:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-virtual {p1, v2, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/m;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
