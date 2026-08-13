.class public final Li8/l;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/l$b;
    }
.end annotation


# static fields
.field private static final N:Li8/l;

.field public static O:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:Ljava/util/List;

.field private H:Ljava/util/List;

.field private I:Ljava/util/List;

.field private J:Li8/t;

.field private K:Li8/w;

.field private L:B

.field private M:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/l$a;

    invoke-direct {v0}, Li8/l$a;-><init>()V

    sput-object v0, Li8/l;->O:Lp8/r;

    new-instance v0, Li8/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/l;-><init>(Z)V

    sput-object v0, Li8/l;->N:Li8/l;

    invoke-direct {v0}, Li8/l;->Z()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 10

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/l;->L:B

    iput v0, p0, Li8/l;->M:I

    invoke-direct {p0}, Li8/l;->Z()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v3, :cond_11

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x1a

    if-eq v7, v8, :cond_c

    const/16 v8, 0x22

    if-eq v7, v8, :cond_a

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_8

    const/16 v8, 0xf2

    const/4 v9, 0x0

    if-eq v7, v8, :cond_5

    const/16 v8, 0x102

    if-eq v7, v8, :cond_2

    invoke-virtual {p0, p1, v2, p2, v7}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

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
    iget v7, p0, Li8/l;->F:I

    and-int/2addr v7, v6

    if-ne v7, v6, :cond_3

    iget-object v7, p0, Li8/l;->K:Li8/w;

    invoke-virtual {v7}, Li8/w;->B()Li8/w$b;

    move-result-object v9

    :cond_3
    sget-object v7, Li8/w;->I:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    check-cast v7, Li8/w;

    iput-object v7, p0, Li8/l;->K:Li8/w;

    if-eqz v9, :cond_4

    invoke-virtual {v9, v7}, Li8/w$b;->w(Li8/w;)Li8/w$b;

    invoke-virtual {v9}, Li8/w$b;->q()Li8/w;

    move-result-object v7

    iput-object v7, p0, Li8/l;->K:Li8/w;

    :cond_4
    iget v7, p0, Li8/l;->F:I

    or-int/2addr v7, v6

    iput v7, p0, Li8/l;->F:I

    goto :goto_0

    :cond_5
    iget v7, p0, Li8/l;->F:I

    and-int/2addr v7, v1

    if-ne v7, v1, :cond_6

    iget-object v7, p0, Li8/l;->J:Li8/t;

    invoke-virtual {v7}, Li8/t;->G()Li8/t$b;

    move-result-object v9

    :cond_6
    sget-object v7, Li8/t;->K:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    check-cast v7, Li8/t;

    iput-object v7, p0, Li8/l;->J:Li8/t;

    if-eqz v9, :cond_7

    invoke-virtual {v9, v7}, Li8/t$b;->w(Li8/t;)Li8/t$b;

    invoke-virtual {v9}, Li8/t$b;->q()Li8/t;

    move-result-object v7

    iput-object v7, p0, Li8/l;->J:Li8/t;

    :cond_7
    iget v7, p0, Li8/l;->F:I

    or-int/2addr v7, v1

    iput v7, p0, Li8/l;->F:I

    goto :goto_0

    :cond_8
    and-int/lit8 v7, v4, 0x4

    if-eq v7, v5, :cond_9

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/l;->I:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    :cond_9
    iget-object v7, p0, Li8/l;->I:Ljava/util/List;

    sget-object v8, Li8/r;->S:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    :goto_1
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    and-int/lit8 v7, v4, 0x2

    if-eq v7, v6, :cond_b

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/l;->H:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    :cond_b
    iget-object v7, p0, Li8/l;->H:Ljava/util/List;

    sget-object v8, Li8/n;->Y:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    goto :goto_1

    :cond_c
    and-int/lit8 v7, v4, 0x1

    if-eq v7, v1, :cond_d

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Li8/l;->G:Ljava/util/List;

    or-int/lit8 v4, v4, 0x1

    :cond_d
    iget-object v7, p0, Li8/l;->G:Ljava/util/List;

    sget-object v8, Li8/i;->Y:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

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
    and-int/lit8 p2, v4, 0x1

    if-ne p2, v1, :cond_e

    iget-object p2, p0, Li8/l;->G:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/l;->G:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v6, :cond_f

    iget-object p2, p0, Li8/l;->H:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/l;->H:Ljava/util/List;

    :cond_f
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v5, :cond_10

    iget-object p2, p0, Li8/l;->I:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/l;->I:Ljava/util/List;

    :cond_10
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/l;->E:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/l;->E:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_11
    and-int/lit8 p1, v4, 0x1

    if-ne p1, v1, :cond_12

    iget-object p1, p0, Li8/l;->G:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/l;->G:Ljava/util/List;

    :cond_12
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v6, :cond_13

    iget-object p1, p0, Li8/l;->H:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/l;->H:Ljava/util/List;

    :cond_13
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v5, :cond_14

    iget-object p1, p0, Li8/l;->I:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/l;->I:Ljava/util/List;

    :cond_14
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/l;->E:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/l;->E:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/l;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/l;->L:B

    iput v0, p0, Li8/l;->M:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/l;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/l;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/l;->L:B

    iput p1, p0, Li8/l;->M:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/l;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/l;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/l;->G:Ljava/util/List;

    return-object p0
.end method

.method static synthetic B(Li8/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/l;->G:Ljava/util/List;

    return-object p1
.end method

.method static synthetic C(Li8/l;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/l;->H:Ljava/util/List;

    return-object p0
.end method

.method static synthetic D(Li8/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/l;->H:Ljava/util/List;

    return-object p1
.end method

.method static synthetic E(Li8/l;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/l;->I:Ljava/util/List;

    return-object p0
.end method

.method static synthetic F(Li8/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/l;->I:Ljava/util/List;

    return-object p1
.end method

.method static synthetic G(Li8/l;Li8/t;)Li8/t;
    .locals 0

    iput-object p1, p0, Li8/l;->J:Li8/t;

    return-object p1
.end method

.method static synthetic H(Li8/l;Li8/w;)Li8/w;
    .locals 0

    iput-object p1, p0, Li8/l;->K:Li8/w;

    return-object p1
.end method

.method static synthetic I(Li8/l;I)I
    .locals 0

    iput p1, p0, Li8/l;->F:I

    return p1
.end method

.method static synthetic J(Li8/l;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/l;->E:Lp8/d;

    return-object p0
.end method

.method public static K()Li8/l;
    .locals 1

    sget-object v0, Li8/l;->N:Li8/l;

    return-object v0
.end method

.method private Z()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l;->G:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l;->H:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/l;->I:Ljava/util/List;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v0

    iput-object v0, p0, Li8/l;->J:Li8/t;

    invoke-static {}, Li8/w;->u()Li8/w;

    move-result-object v0

    iput-object v0, p0, Li8/l;->K:Li8/w;

    return-void
.end method

.method public static a0()Li8/l$b;
    .locals 1

    invoke-static {}, Li8/l$b;->t()Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public static b0(Li8/l;)Li8/l$b;
    .locals 1

    invoke-static {}, Li8/l;->a0()Li8/l$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/l$b;->C(Li8/l;)Li8/l$b;

    move-result-object p0

    return-object p0
.end method

.method public static d0(Ljava/io/InputStream;Lp8/g;)Li8/l;
    .locals 1

    sget-object v0, Li8/l;->O:Lp8/r;

    invoke-interface {v0, p0, p1}, Lp8/r;->c(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/l;

    return-object p0
.end method


# virtual methods
.method public L()Li8/l;
    .locals 1

    sget-object v0, Li8/l;->N:Li8/l;

    return-object v0
.end method

.method public M(I)Li8/i;
    .locals 1

    iget-object v0, p0, Li8/l;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/i;

    return-object p1
.end method

.method public N()I
    .locals 1

    iget-object v0, p0, Li8/l;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public O()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/l;->G:Ljava/util/List;

    return-object v0
.end method

.method public P(I)Li8/n;
    .locals 1

    iget-object v0, p0, Li8/l;->H:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/n;

    return-object p1
.end method

.method public Q()I
    .locals 1

    iget-object v0, p0, Li8/l;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public R()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/l;->H:Ljava/util/List;

    return-object v0
.end method

.method public S(I)Li8/r;
    .locals 1

    iget-object v0, p0, Li8/l;->I:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/r;

    return-object p1
.end method

.method public T()I
    .locals 1

    iget-object v0, p0, Li8/l;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public U()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/l;->I:Ljava/util/List;

    return-object v0
.end method

.method public V()Li8/t;
    .locals 1

    iget-object v0, p0, Li8/l;->J:Li8/t;

    return-object v0
.end method

.method public W()Li8/w;
    .locals 1

    iget-object v0, p0, Li8/l;->K:Li8/w;

    return-object v0
.end method

.method public X()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/l;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public Y()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/l;->F:I

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

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/l;->L()Li8/l;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Li8/l;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Li8/l;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Li8/l;->G:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x3

    invoke-static {v4, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    iget-object v3, p0, Li8/l;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    iget-object v3, p0, Li8/l;->H:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x4

    invoke-static {v4, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    iget-object v1, p0, Li8/l;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Li8/l;->I:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/4 v3, 0x5

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget v0, p0, Li8/l;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/16 v0, 0x1e

    iget-object v1, p0, Li8/l;->J:Li8/t;

    invoke-static {v0, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v0

    add-int/2addr v2, v0

    :cond_4
    iget v0, p0, Li8/l;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    const/16 v0, 0x20

    iget-object v1, p0, Li8/l;->K:Li8/w;

    invoke-static {v0, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v0

    add-int/2addr v2, v0

    :cond_5
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v0

    add-int/2addr v2, v0

    iget-object v0, p0, Li8/l;->E:Lp8/d;

    invoke-virtual {v0}, Lp8/d;->size()I

    move-result v0

    add-int/2addr v2, v0

    iput v2, p0, Li8/l;->M:I

    return v2
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/l;->c0()Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()Li8/l$b;
    .locals 1

    invoke-static {}, Li8/l;->a0()Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/l;->L:B

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
    invoke-virtual {p0}, Li8/l;->N()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {p0, v0}, Li8/l;->M(I)Li8/i;

    move-result-object v3

    invoke-virtual {v3}, Li8/i;->d()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Li8/l;->L:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Li8/l;->Q()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, Li8/l;->P(I)Li8/n;

    move-result-object v3

    invoke-virtual {v3}, Li8/n;->d()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Li8/l;->L:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v2

    :goto_2
    invoke-virtual {p0}, Li8/l;->T()I

    move-result v3

    if-ge v0, v3, :cond_7

    invoke-virtual {p0, v0}, Li8/l;->S(I)Li8/r;

    move-result-object v3

    invoke-virtual {v3}, Li8/r;->d()Z

    move-result v3

    if-nez v3, :cond_6

    iput-byte v2, p0, Li8/l;->L:B

    return v2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Li8/l;->X()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Li8/l;->V()Li8/t;

    move-result-object v0

    invoke-virtual {v0}, Li8/t;->d()Z

    move-result v0

    if-nez v0, :cond_8

    iput-byte v2, p0, Li8/l;->L:B

    return v2

    :cond_8
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_9

    iput-byte v2, p0, Li8/l;->L:B

    return v2

    :cond_9
    iput-byte v1, p0, Li8/l;->L:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/l;->e0()Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public e0()Li8/l$b;
    .locals 1

    invoke-static {p0}, Li8/l;->b0(Li8/l;)Li8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Li8/l;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Li8/l;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Li8/l;->G:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_1
    iget-object v3, p0, Li8/l;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Li8/l;->H:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x4

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    iget-object v2, p0, Li8/l;->I:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Li8/l;->I:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/p;

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v2}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    iget v1, p0, Li8/l;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/16 v1, 0x1e

    iget-object v2, p0, Li8/l;->J:Li8/t;

    invoke-virtual {p1, v1, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_3
    iget v1, p0, Li8/l;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/16 v1, 0x20

    iget-object v2, p0, Li8/l;->K:Li8/w;

    invoke-virtual {p1, v1, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_4
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/l;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
