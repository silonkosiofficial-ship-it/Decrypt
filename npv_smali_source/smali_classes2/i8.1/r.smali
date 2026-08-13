.class public final Li8/r;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/r$b;
    }
.end annotation


# static fields
.field private static final R:Li8/r;

.field public static S:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:I

.field private I:Ljava/util/List;

.field private J:Li8/q;

.field private K:I

.field private L:Li8/q;

.field private M:I

.field private N:Ljava/util/List;

.field private O:Ljava/util/List;

.field private P:B

.field private Q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/r$a;

    invoke-direct {v0}, Li8/r$a;-><init>()V

    sput-object v0, Li8/r;->S:Lp8/r;

    new-instance v0, Li8/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/r;-><init>(Z)V

    sput-object v0, Li8/r;->R:Li8/r;

    invoke-direct {v0}, Li8/r;->k0()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 11

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/r;->P:B

    iput v0, p0, Li8/r;->Q:I

    invoke-direct {p0}, Li8/r;->k0()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x80

    const/4 v6, 0x4

    const/16 v7, 0x100

    if-nez v3, :cond_d

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v8

    const/4 v9, 0x0

    sparse-switch v8, :sswitch_data_0

    invoke-virtual {p0, p1, v2, p2, v8}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
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

    :sswitch_1
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v8

    invoke-virtual {p1, v8}, Lp8/e;->i(I)I

    move-result v8

    and-int/lit16 v9, v4, 0x100

    if-eq v9, v7, :cond_1

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v9

    if-lez v9, :cond_1

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Li8/r;->O:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    :cond_1
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v9

    if-lez v9, :cond_2

    iget-object v9, p0, Li8/r;->O:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v8}, Lp8/e;->h(I)V

    goto :goto_0

    :sswitch_2
    and-int/lit16 v8, v4, 0x100

    if-eq v8, v7, :cond_3

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/r;->O:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    :cond_3
    iget-object v8, p0, Li8/r;->O:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :goto_2
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :sswitch_3
    and-int/lit16 v8, v4, 0x80

    if-eq v8, v5, :cond_4

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/r;->N:Ljava/util/List;

    or-int/lit16 v4, v4, 0x80

    :cond_4
    iget-object v8, p0, Li8/r;->N:Ljava/util/List;

    sget-object v9, Li8/b;->K:Lp8/r;

    invoke-virtual {p1, v9, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v9

    goto :goto_2

    :sswitch_4
    iget v8, p0, Li8/r;->F:I

    or-int/lit8 v8, v8, 0x20

    iput v8, p0, Li8/r;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    iput v8, p0, Li8/r;->M:I

    goto/16 :goto_0

    :sswitch_5
    iget v8, p0, Li8/r;->F:I

    const/16 v10, 0x10

    and-int/2addr v8, v10

    if-ne v8, v10, :cond_5

    iget-object v8, p0, Li8/r;->L:Li8/q;

    invoke-virtual {v8}, Li8/q;->B0()Li8/q$c;

    move-result-object v9

    :cond_5
    sget-object v8, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    check-cast v8, Li8/q;

    iput-object v8, p0, Li8/r;->L:Li8/q;

    if-eqz v9, :cond_6

    invoke-virtual {v9, v8}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v9}, Li8/q$c;->v()Li8/q;

    move-result-object v8

    iput-object v8, p0, Li8/r;->L:Li8/q;

    :cond_6
    iget v8, p0, Li8/r;->F:I

    or-int/2addr v8, v10

    iput v8, p0, Li8/r;->F:I

    goto/16 :goto_0

    :sswitch_6
    iget v8, p0, Li8/r;->F:I

    or-int/lit8 v8, v8, 0x8

    iput v8, p0, Li8/r;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    iput v8, p0, Li8/r;->K:I

    goto/16 :goto_0

    :sswitch_7
    iget v8, p0, Li8/r;->F:I

    and-int/2addr v8, v6

    if-ne v8, v6, :cond_7

    iget-object v8, p0, Li8/r;->J:Li8/q;

    invoke-virtual {v8}, Li8/q;->B0()Li8/q$c;

    move-result-object v9

    :cond_7
    sget-object v8, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    check-cast v8, Li8/q;

    iput-object v8, p0, Li8/r;->J:Li8/q;

    if-eqz v9, :cond_8

    invoke-virtual {v9, v8}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v9}, Li8/q$c;->v()Li8/q;

    move-result-object v8

    iput-object v8, p0, Li8/r;->J:Li8/q;

    :cond_8
    iget v8, p0, Li8/r;->F:I

    or-int/2addr v8, v6

    iput v8, p0, Li8/r;->F:I

    goto/16 :goto_0

    :sswitch_8
    and-int/lit8 v8, v4, 0x4

    if-eq v8, v6, :cond_9

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Li8/r;->I:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    :cond_9
    iget-object v8, p0, Li8/r;->I:Ljava/util/List;

    sget-object v9, Li8/s;->Q:Lp8/r;

    invoke-virtual {p1, v9, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v9

    goto/16 :goto_2

    :sswitch_9
    iget v8, p0, Li8/r;->F:I

    or-int/lit8 v8, v8, 0x2

    iput v8, p0, Li8/r;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    iput v8, p0, Li8/r;->H:I

    goto/16 :goto_0

    :sswitch_a
    iget v8, p0, Li8/r;->F:I

    or-int/2addr v8, v1

    iput v8, p0, Li8/r;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    iput v8, p0, Li8/r;->G:I
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
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v6, :cond_a

    iget-object p2, p0, Li8/r;->I:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/r;->I:Ljava/util/List;

    :cond_a
    and-int/lit16 p2, v4, 0x80

    if-ne p2, v5, :cond_b

    iget-object p2, p0, Li8/r;->N:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/r;->N:Ljava/util/List;

    :cond_b
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v7, :cond_c

    iget-object p2, p0, Li8/r;->O:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/r;->O:Ljava/util/List;

    :cond_c
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/r;->E:Lp8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/r;->E:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_d
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v6, :cond_e

    iget-object p1, p0, Li8/r;->I:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/r;->I:Ljava/util/List;

    :cond_e
    and-int/lit16 p1, v4, 0x80

    if-ne p1, v5, :cond_f

    iget-object p1, p0, Li8/r;->N:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/r;->N:Ljava/util/List;

    :cond_f
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v7, :cond_10

    iget-object p1, p0, Li8/r;->O:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/r;->O:Ljava/util/List;

    :cond_10
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/r;->E:Lp8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/r;->E:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_a
        0x10 -> :sswitch_9
        0x1a -> :sswitch_8
        0x22 -> :sswitch_7
        0x28 -> :sswitch_6
        0x32 -> :sswitch_5
        0x38 -> :sswitch_4
        0x42 -> :sswitch_3
        0xf8 -> :sswitch_2
        0xfa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/r;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/r;->P:B

    iput v0, p0, Li8/r;->Q:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/r;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/r;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/r;->P:B

    iput p1, p0, Li8/r;->Q:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/r;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/r;I)I
    .locals 0

    iput p1, p0, Li8/r;->G:I

    return p1
.end method

.method static synthetic B(Li8/r;I)I
    .locals 0

    iput p1, p0, Li8/r;->H:I

    return p1
.end method

.method static synthetic C(Li8/r;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/r;->I:Ljava/util/List;

    return-object p0
.end method

.method static synthetic D(Li8/r;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/r;->I:Ljava/util/List;

    return-object p1
.end method

.method static synthetic E(Li8/r;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/r;->J:Li8/q;

    return-object p1
.end method

.method static synthetic F(Li8/r;I)I
    .locals 0

    iput p1, p0, Li8/r;->K:I

    return p1
.end method

.method static synthetic G(Li8/r;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/r;->L:Li8/q;

    return-object p1
.end method

.method static synthetic H(Li8/r;I)I
    .locals 0

    iput p1, p0, Li8/r;->M:I

    return p1
.end method

.method static synthetic I(Li8/r;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/r;->N:Ljava/util/List;

    return-object p0
.end method

.method static synthetic J(Li8/r;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/r;->N:Ljava/util/List;

    return-object p1
.end method

.method static synthetic K(Li8/r;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/r;->O:Ljava/util/List;

    return-object p0
.end method

.method static synthetic L(Li8/r;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/r;->O:Ljava/util/List;

    return-object p1
.end method

.method static synthetic M(Li8/r;I)I
    .locals 0

    iput p1, p0, Li8/r;->F:I

    return p1
.end method

.method static synthetic N(Li8/r;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/r;->E:Lp8/d;

    return-object p0
.end method

.method public static R()Li8/r;
    .locals 1

    sget-object v0, Li8/r;->R:Li8/r;

    return-object v0
.end method

.method private k0()V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Li8/r;->G:I

    const/4 v0, 0x0

    iput v0, p0, Li8/r;->H:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/r;->I:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/r;->J:Li8/q;

    iput v0, p0, Li8/r;->K:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/r;->L:Li8/q;

    iput v0, p0, Li8/r;->M:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r;->N:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/r;->O:Ljava/util/List;

    return-void
.end method

.method public static l0()Li8/r$b;
    .locals 1

    invoke-static {}, Li8/r$b;->t()Li8/r$b;

    move-result-object v0

    return-object v0
.end method

.method public static m0(Li8/r;)Li8/r$b;
    .locals 1

    invoke-static {}, Li8/r;->l0()Li8/r$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/r$b;->E(Li8/r;)Li8/r$b;

    move-result-object p0

    return-object p0
.end method

.method public static o0(Ljava/io/InputStream;Lp8/g;)Li8/r;
    .locals 1

    sget-object v0, Li8/r;->S:Lp8/r;

    invoke-interface {v0, p0, p1}, Lp8/r;->b(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/r;

    return-object p0
.end method


# virtual methods
.method public O(I)Li8/b;
    .locals 1

    iget-object v0, p0, Li8/r;->N:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/b;

    return-object p1
.end method

.method public P()I
    .locals 1

    iget-object v0, p0, Li8/r;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public Q()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/r;->N:Ljava/util/List;

    return-object v0
.end method

.method public S()Li8/r;
    .locals 1

    sget-object v0, Li8/r;->R:Li8/r;

    return-object v0
.end method

.method public T()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/r;->L:Li8/q;

    return-object v0
.end method

.method public U()I
    .locals 1

    iget v0, p0, Li8/r;->M:I

    return v0
.end method

.method public V()I
    .locals 1

    iget v0, p0, Li8/r;->G:I

    return v0
.end method

.method public W()I
    .locals 1

    iget v0, p0, Li8/r;->H:I

    return v0
.end method

.method public X(I)Li8/s;
    .locals 1

    iget-object v0, p0, Li8/r;->I:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/s;

    return-object p1
.end method

.method public Y()I
    .locals 1

    iget-object v0, p0, Li8/r;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public Z()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/r;->I:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/r;->S()Li8/r;

    move-result-object v0

    return-object v0
.end method

.method public a0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/r;->J:Li8/q;

    return-object v0
.end method

.method public b()I
    .locals 6

    .prologue
    iget v0, p0, Li8/r;->Q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/r;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/r;->G:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Li8/r;->F:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Li8/r;->H:I

    invoke-static {v3, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    move v1, v2

    :goto_1
    iget-object v4, p0, Li8/r;->I:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_3

    iget-object v4, p0, Li8/r;->I:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/4 v5, 0x3

    invoke-static {v5, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget v1, p0, Li8/r;->F:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Li8/r;->J:Li8/q;

    invoke-static {v4, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/r;->F:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_5

    const/4 v1, 0x5

    iget v5, p0, Li8/r;->K:I

    invoke-static {v1, v5}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Li8/r;->F:I

    const/16 v5, 0x10

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_6

    const/4 v1, 0x6

    iget-object v5, p0, Li8/r;->L:Li8/q;

    invoke-static {v1, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Li8/r;->F:I

    const/16 v5, 0x20

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_7

    const/4 v1, 0x7

    iget v5, p0, Li8/r;->M:I

    invoke-static {v1, v5}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    move v1, v2

    :goto_2
    iget-object v5, p0, Li8/r;->N:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_8

    iget-object v5, p0, Li8/r;->N:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp8/p;

    invoke-static {v4, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v5

    add-int/2addr v0, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    move v1, v2

    :goto_3
    iget-object v4, p0, Li8/r;->O:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_9

    iget-object v4, p0, Li8/r;->O:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    add-int/2addr v0, v1

    invoke-virtual {p0}, Li8/r;->c0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/2addr v1, v3

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/r;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/r;->Q:I

    return v0
.end method

.method public b0()I
    .locals 1

    iget v0, p0, Li8/r;->K:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/r;->n0()Li8/r$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/r;->O:Ljava/util/List;

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/r;->P:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/r;->h0()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/r;->P:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/r;->Y()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, Li8/r;->X(I)Li8/s;

    move-result-object v3

    invoke-virtual {v3}, Li8/s;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Li8/r;->P:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Li8/r;->i0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Li8/r;->a0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Li8/r;->P:B

    return v2

    :cond_5
    invoke-virtual {p0}, Li8/r;->d0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Li8/r;->T()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Li8/r;->P:B

    return v2

    :cond_6
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Li8/r;->P()I

    move-result v3

    if-ge v0, v3, :cond_8

    invoke-virtual {p0, v0}, Li8/r;->O(I)Li8/b;

    move-result-object v3

    invoke-virtual {v3}, Li8/b;->d()Z

    move-result v3

    if-nez v3, :cond_7

    iput-byte v2, p0, Li8/r;->P:B

    return v2

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_9

    iput-byte v2, p0, Li8/r;->P:B

    return v2

    :cond_9
    iput-byte v1, p0, Li8/r;->P:B

    return v1
.end method

.method public d0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/r;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/r;->p0()Li8/r$b;

    move-result-object v0

    return-object v0
.end method

.method public e0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/r;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/r;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public h(Lp8/f;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Li8/r;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/r;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/r;->G:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_0
    iget v1, p0, Li8/r;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, Li8/r;->H:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_1
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Li8/r;->I:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Li8/r;->I:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v2, p0, Li8/r;->F:I

    const/4 v3, 0x4

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Li8/r;->J:Li8/q;

    invoke-virtual {p1, v3, v2}, Lp8/f;->c0(ILp8/p;)V

    :cond_3
    iget v2, p0, Li8/r;->F:I

    const/16 v3, 0x8

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_4

    const/4 v2, 0x5

    iget v4, p0, Li8/r;->K:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_4
    iget v2, p0, Li8/r;->F:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_5

    const/4 v2, 0x6

    iget-object v4, p0, Li8/r;->L:Li8/q;

    invoke-virtual {p1, v2, v4}, Lp8/f;->c0(ILp8/p;)V

    :cond_5
    iget v2, p0, Li8/r;->F:I

    const/16 v4, 0x20

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_6

    const/4 v2, 0x7

    iget v4, p0, Li8/r;->M:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_6
    move v2, v1

    :goto_1
    iget-object v4, p0, Li8/r;->N:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_7

    iget-object v4, p0, Li8/r;->N:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    invoke-virtual {p1, v3, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    iget-object v2, p0, Li8/r;->O:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    iget-object v2, p0, Li8/r;->O:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x1f

    invoke-virtual {p1, v3, v2}, Lp8/f;->Z(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/r;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public h0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/r;->F:I

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

.method public i0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/r;->F:I

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

.method public j0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/r;->F:I

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

.method public n0()Li8/r$b;
    .locals 1

    invoke-static {}, Li8/r;->l0()Li8/r$b;

    move-result-object v0

    return-object v0
.end method

.method public p0()Li8/r$b;
    .locals 1

    invoke-static {p0}, Li8/r;->m0(Li8/r;)Li8/r$b;

    move-result-object v0

    return-object v0
.end method
