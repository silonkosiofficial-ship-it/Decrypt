.class public final Li8/n;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/n$b;
    }
.end annotation


# static fields
.field private static final X:Li8/n;

.field public static Y:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Li8/q;

.field private K:I

.field private L:Ljava/util/List;

.field private M:Li8/q;

.field private N:I

.field private O:Ljava/util/List;

.field private P:Ljava/util/List;

.field private Q:I

.field private R:Li8/u;

.field private S:I

.field private T:I

.field private U:Ljava/util/List;

.field private V:B

.field private W:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/n$a;

    invoke-direct {v0}, Li8/n$a;-><init>()V

    sput-object v0, Li8/n;->Y:Lp8/r;

    new-instance v0, Li8/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/n;-><init>(Z)V

    sput-object v0, Li8/n;->X:Li8/n;

    invoke-direct {v0}, Li8/n;->z0()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 12

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Li8/n;->Q:I

    iput-byte v0, p0, Li8/n;->V:B

    iput v0, p0, Li8/n;->W:I

    invoke-direct {p0}, Li8/n;->z0()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x100

    const/16 v6, 0x20

    const/16 v7, 0x2000

    const/16 v8, 0x200

    if-nez v3, :cond_12

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v9

    const/4 v10, 0x0

    sparse-switch v9, :sswitch_data_0

    invoke-virtual {p0, p1, v2, p2, v9}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :catch_1
    move-exception p1

    goto/16 :goto_6

    :sswitch_1
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v9

    invoke-virtual {p1, v9}, Lp8/e;->i(I)I

    move-result v9

    and-int/lit16 v10, v4, 0x2000

    if-eq v10, v7, :cond_1

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_1

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/n;->U:Ljava/util/List;

    or-int/lit16 v4, v4, 0x2000

    :cond_1
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_2

    iget-object v10, p0, Li8/n;->U:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v9}, Lp8/e;->h(I)V

    goto :goto_0

    :sswitch_2
    and-int/lit16 v9, v4, 0x2000

    if-eq v9, v7, :cond_3

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Li8/n;->U:Ljava/util/List;

    or-int/lit16 v4, v4, 0x2000

    :cond_3
    iget-object v9, p0, Li8/n;->U:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    :goto_2
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v9

    invoke-virtual {p1, v9}, Lp8/e;->i(I)I

    move-result v9

    and-int/lit16 v10, v4, 0x200

    if-eq v10, v8, :cond_4

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_4

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/n;->P:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    :cond_4
    :goto_3
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_2

    iget-object v10, p0, Li8/n;->P:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :sswitch_4
    and-int/lit16 v9, v4, 0x200

    if-eq v9, v8, :cond_5

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Li8/n;->P:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    :cond_5
    iget-object v9, p0, Li8/n;->P:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_2

    :sswitch_5
    and-int/lit16 v9, v4, 0x100

    if-eq v9, v5, :cond_6

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Li8/n;->O:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    :cond_6
    iget-object v9, p0, Li8/n;->O:Ljava/util/List;

    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v10, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto :goto_2

    :sswitch_6
    iget v9, p0, Li8/n;->F:I

    or-int/2addr v9, v1

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->G:I

    goto/16 :goto_0

    :sswitch_7
    iget v9, p0, Li8/n;->F:I

    or-int/lit8 v9, v9, 0x40

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->N:I

    goto/16 :goto_0

    :sswitch_8
    iget v9, p0, Li8/n;->F:I

    or-int/lit8 v9, v9, 0x10

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->K:I

    goto/16 :goto_0

    :sswitch_9
    iget v9, p0, Li8/n;->F:I

    or-int/2addr v9, v8

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->T:I

    goto/16 :goto_0

    :sswitch_a
    iget v9, p0, Li8/n;->F:I

    or-int/2addr v9, v5

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->S:I

    goto/16 :goto_0

    :sswitch_b
    iget v9, p0, Li8/n;->F:I

    const/16 v11, 0x80

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_7

    iget-object v9, p0, Li8/n;->R:Li8/u;

    invoke-virtual {v9}, Li8/u;->a0()Li8/u$b;

    move-result-object v10

    :cond_7
    sget-object v9, Li8/u;->P:Lp8/r;

    invoke-virtual {p1, v9, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v9

    check-cast v9, Li8/u;

    iput-object v9, p0, Li8/n;->R:Li8/u;

    if-eqz v10, :cond_8

    invoke-virtual {v10, v9}, Li8/u$b;->z(Li8/u;)Li8/u$b;

    invoke-virtual {v10}, Li8/u$b;->v()Li8/u;

    move-result-object v9

    iput-object v9, p0, Li8/n;->R:Li8/u;

    :cond_8
    iget v9, p0, Li8/n;->F:I

    :goto_4
    or-int/2addr v9, v11

    iput v9, p0, Li8/n;->F:I

    goto/16 :goto_0

    :sswitch_c
    iget v9, p0, Li8/n;->F:I

    and-int/2addr v9, v6

    if-ne v9, v6, :cond_9

    iget-object v9, p0, Li8/n;->M:Li8/q;

    invoke-virtual {v9}, Li8/q;->B0()Li8/q$c;

    move-result-object v10

    :cond_9
    sget-object v9, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v9, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v9

    check-cast v9, Li8/q;

    iput-object v9, p0, Li8/n;->M:Li8/q;

    if-eqz v10, :cond_a

    invoke-virtual {v10, v9}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v10}, Li8/q$c;->v()Li8/q;

    move-result-object v9

    iput-object v9, p0, Li8/n;->M:Li8/q;

    :cond_a
    iget v9, p0, Li8/n;->F:I

    or-int/2addr v9, v6

    iput v9, p0, Li8/n;->F:I

    goto/16 :goto_0

    :sswitch_d
    and-int/lit8 v9, v4, 0x20

    if-eq v9, v6, :cond_b

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Li8/n;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_b
    iget-object v9, p0, Li8/n;->L:Ljava/util/List;

    sget-object v10, Li8/s;->Q:Lp8/r;

    invoke-virtual {p1, v10, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_2

    :sswitch_e
    iget v9, p0, Li8/n;->F:I

    const/16 v11, 0x8

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_c

    iget-object v9, p0, Li8/n;->J:Li8/q;

    invoke-virtual {v9}, Li8/q;->B0()Li8/q$c;

    move-result-object v10

    :cond_c
    sget-object v9, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v9, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v9

    check-cast v9, Li8/q;

    iput-object v9, p0, Li8/n;->J:Li8/q;

    if-eqz v10, :cond_d

    invoke-virtual {v10, v9}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v10}, Li8/q$c;->v()Li8/q;

    move-result-object v9

    iput-object v9, p0, Li8/n;->J:Li8/q;

    :cond_d
    iget v9, p0, Li8/n;->F:I

    goto :goto_4

    :sswitch_f
    iget v9, p0, Li8/n;->F:I

    or-int/lit8 v9, v9, 0x4

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->I:I

    goto/16 :goto_0

    :sswitch_10
    iget v9, p0, Li8/n;->F:I

    or-int/lit8 v9, v9, 0x2

    iput v9, p0, Li8/n;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    iput v9, p0, Li8/n;->H:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_5
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_6
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_7
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v6, :cond_e

    iget-object p2, p0, Li8/n;->L:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/n;->L:Ljava/util/List;

    :cond_e
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v5, :cond_f

    iget-object p2, p0, Li8/n;->O:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/n;->O:Ljava/util/List;

    :cond_f
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v8, :cond_10

    iget-object p2, p0, Li8/n;->P:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/n;->P:Ljava/util/List;

    :cond_10
    and-int/lit16 p2, v4, 0x2000

    if-ne p2, v7, :cond_11

    iget-object p2, p0, Li8/n;->U:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/n;->U:Ljava/util/List;

    :cond_11
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/n;->E:Lp8/d;

    goto :goto_8

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/n;->E:Lp8/d;

    throw p1

    :goto_8
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_12
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_13

    iget-object p1, p0, Li8/n;->L:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/n;->L:Ljava/util/List;

    :cond_13
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v5, :cond_14

    iget-object p1, p0, Li8/n;->O:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/n;->O:Ljava/util/List;

    :cond_14
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v8, :cond_15

    iget-object p1, p0, Li8/n;->P:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/n;->P:Ljava/util/List;

    :cond_15
    and-int/lit16 p1, v4, 0x2000

    if-ne p1, v7, :cond_16

    iget-object p1, p0, Li8/n;->U:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/n;->U:Ljava/util/List;

    :cond_16
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/n;->E:Lp8/d;

    goto :goto_9

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/n;->E:Lp8/d;

    throw p1

    :goto_9
    invoke-virtual {p0}, Lp8/i$d;->m()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_10
        0x10 -> :sswitch_f
        0x1a -> :sswitch_e
        0x22 -> :sswitch_d
        0x2a -> :sswitch_c
        0x32 -> :sswitch_b
        0x38 -> :sswitch_a
        0x40 -> :sswitch_9
        0x48 -> :sswitch_8
        0x50 -> :sswitch_7
        0x58 -> :sswitch_6
        0x62 -> :sswitch_5
        0x68 -> :sswitch_4
        0x6a -> :sswitch_3
        0xf8 -> :sswitch_2
        0xfa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/n;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput v0, p0, Li8/n;->Q:I

    iput-byte v0, p0, Li8/n;->V:B

    iput v0, p0, Li8/n;->W:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/n;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/n;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Li8/n;->Q:I

    iput-byte p1, p0, Li8/n;->V:B

    iput p1, p0, Li8/n;->W:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/n;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->G:I

    return p1
.end method

.method public static A0()Li8/n$b;
    .locals 1

    invoke-static {}, Li8/n$b;->t()Li8/n$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic B(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->H:I

    return p1
.end method

.method public static B0(Li8/n;)Li8/n$b;
    .locals 1

    invoke-static {}, Li8/n;->A0()Li8/n$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/n$b;->E(Li8/n;)Li8/n$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic C(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->I:I

    return p1
.end method

.method static synthetic D(Li8/n;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/n;->J:Li8/q;

    return-object p1
.end method

.method static synthetic E(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->K:I

    return p1
.end method

.method static synthetic F(Li8/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/n;->L:Ljava/util/List;

    return-object p0
.end method

.method static synthetic G(Li8/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/n;->L:Ljava/util/List;

    return-object p1
.end method

.method static synthetic H(Li8/n;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/n;->M:Li8/q;

    return-object p1
.end method

.method static synthetic I(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->N:I

    return p1
.end method

.method static synthetic J(Li8/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/n;->O:Ljava/util/List;

    return-object p0
.end method

.method static synthetic K(Li8/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/n;->O:Ljava/util/List;

    return-object p1
.end method

.method static synthetic L(Li8/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/n;->P:Ljava/util/List;

    return-object p0
.end method

.method static synthetic M(Li8/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/n;->P:Ljava/util/List;

    return-object p1
.end method

.method static synthetic N(Li8/n;Li8/u;)Li8/u;
    .locals 0

    iput-object p1, p0, Li8/n;->R:Li8/u;

    return-object p1
.end method

.method static synthetic O(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->S:I

    return p1
.end method

.method static synthetic P(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->T:I

    return p1
.end method

.method static synthetic Q(Li8/n;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/n;->U:Ljava/util/List;

    return-object p0
.end method

.method static synthetic R(Li8/n;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/n;->U:Ljava/util/List;

    return-object p1
.end method

.method static synthetic S(Li8/n;I)I
    .locals 0

    iput p1, p0, Li8/n;->F:I

    return p1
.end method

.method static synthetic T(Li8/n;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/n;->E:Lp8/d;

    return-object p0
.end method

.method public static Y()Li8/n;
    .locals 1

    sget-object v0, Li8/n;->X:Li8/n;

    return-object v0
.end method

.method private z0()V
    .locals 2

    const/16 v0, 0x206

    iput v0, p0, Li8/n;->G:I

    const/16 v0, 0x806

    iput v0, p0, Li8/n;->H:I

    const/4 v0, 0x0

    iput v0, p0, Li8/n;->I:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/n;->J:Li8/q;

    iput v0, p0, Li8/n;->K:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/n;->L:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/n;->M:Li8/q;

    iput v0, p0, Li8/n;->N:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/n;->O:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/n;->P:Ljava/util/List;

    invoke-static {}, Li8/u;->I()Li8/u;

    move-result-object v1

    iput-object v1, p0, Li8/n;->R:Li8/u;

    iput v0, p0, Li8/n;->S:I

    iput v0, p0, Li8/n;->T:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/n;->U:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public C0()Li8/n$b;
    .locals 1

    invoke-static {}, Li8/n;->A0()Li8/n$b;

    move-result-object v0

    return-object v0
.end method

.method public D0()Li8/n$b;
    .locals 1

    invoke-static {p0}, Li8/n;->B0(Li8/n;)Li8/n$b;

    move-result-object v0

    return-object v0
.end method

.method public U(I)Li8/q;
    .locals 1

    iget-object v0, p0, Li8/n;->O:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;

    return-object p1
.end method

.method public V()I
    .locals 1

    iget-object v0, p0, Li8/n;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public W()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/n;->P:Ljava/util/List;

    return-object v0
.end method

.method public X()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/n;->O:Ljava/util/List;

    return-object v0
.end method

.method public Z()Li8/n;
    .locals 1

    sget-object v0, Li8/n;->X:Li8/n;

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/n;->Z()Li8/n;

    move-result-object v0

    return-object v0
.end method

.method public a0()I
    .locals 1

    iget v0, p0, Li8/n;->G:I

    return v0
.end method

.method public b()I
    .locals 8

    .prologue
    iget v0, p0, Li8/n;->W:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/n;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/n;->H:I

    invoke-static {v3, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v4, p0, Li8/n;->F:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    iget v4, p0, Li8/n;->I:I

    invoke-static {v1, v4}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_2
    iget v4, p0, Li8/n;->F:I

    const/16 v6, 0x8

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_3

    const/4 v4, 0x3

    iget-object v7, p0, Li8/n;->J:Li8/q;

    invoke-static {v4, v7}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3
    move v4, v2

    :goto_1
    iget-object v7, p0, Li8/n;->L:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_4

    iget-object v7, p0, Li8/n;->L:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp8/p;

    invoke-static {v5, v7}, Lp8/f;->r(ILp8/p;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    const/4 v4, 0x5

    iget-object v5, p0, Li8/n;->M:Li8/q;

    invoke-static {v4, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_5
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x80

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    const/4 v4, 0x6

    iget-object v5, p0, Li8/n;->R:Li8/u;

    invoke-static {v4, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_6
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x100

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_7

    const/4 v4, 0x7

    iget v5, p0, Li8/n;->S:I

    invoke-static {v4, v5}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_7
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x200

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    iget v4, p0, Li8/n;->T:I

    invoke-static {v6, v4}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_8
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    const/16 v4, 0x9

    iget v5, p0, Li8/n;->K:I

    invoke-static {v4, v5}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_9
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x40

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_a

    const/16 v4, 0xa

    iget v5, p0, Li8/n;->N:I

    invoke-static {v4, v5}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_a
    iget v4, p0, Li8/n;->F:I

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_b

    const/16 v3, 0xb

    iget v4, p0, Li8/n;->G:I

    invoke-static {v3, v4}, Lp8/f;->o(II)I

    move-result v3

    add-int/2addr v0, v3

    :cond_b
    move v3, v2

    :goto_2
    iget-object v4, p0, Li8/n;->O:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_c

    iget-object v4, p0, Li8/n;->O:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v5, 0xc

    invoke-static {v5, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_c
    move v3, v2

    move v4, v3

    :goto_3
    iget-object v5, p0, Li8/n;->P:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_d

    iget-object v5, p0, Li8/n;->P:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lp8/f;->p(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_d
    add-int/2addr v0, v4

    invoke-virtual {p0}, Li8/n;->W()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v3

    add-int/2addr v0, v3

    :cond_e
    iput v4, p0, Li8/n;->Q:I

    move v3, v2

    :goto_4
    iget-object v4, p0, Li8/n;->U:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_f

    iget-object v4, p0, Li8/n;->U:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_f
    add-int/2addr v0, v3

    invoke-virtual {p0}, Li8/n;->o0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/n;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/n;->W:I

    return v0
.end method

.method public b0()I
    .locals 1

    iget v0, p0, Li8/n;->S:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/n;->C0()Li8/n$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Li8/n;->I:I

    return v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/n;->V:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/n;->r0()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_2
    invoke-virtual {p0}, Li8/n;->v0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Li8/n;->h0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/n;->m0()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, Li8/n;->l0(I)Li8/s;

    move-result-object v3

    invoke-virtual {v3}, Li8/s;->d()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Li8/n;->t0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Li8/n;->e0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_6
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Li8/n;->V()I

    move-result v3

    if-ge v0, v3, :cond_8

    invoke-virtual {p0, v0}, Li8/n;->U(I)Li8/q;

    move-result-object v3

    invoke-virtual {v3}, Li8/q;->d()Z

    move-result v3

    if-nez v3, :cond_7

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Li8/n;->y0()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Li8/n;->k0()Li8/u;

    move-result-object v0

    invoke-virtual {v0}, Li8/u;->d()Z

    move-result v0

    if-nez v0, :cond_9

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_9
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_a

    iput-byte v2, p0, Li8/n;->V:B

    return v2

    :cond_a
    iput-byte v1, p0, Li8/n;->V:B

    return v1
.end method

.method public d0()I
    .locals 1

    iget v0, p0, Li8/n;->H:I

    return v0
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/n;->D0()Li8/n$b;

    move-result-object v0

    return-object v0
.end method

.method public e0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/n;->M:Li8/q;

    return-object v0
.end method

.method public f0()I
    .locals 1

    iget v0, p0, Li8/n;->N:I

    return v0
.end method

.method public h(Lp8/f;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Li8/n;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/n;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/n;->H:I

    invoke-virtual {p1, v3, v1}, Lp8/f;->Z(II)V

    :cond_0
    iget v1, p0, Li8/n;->F:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_1

    iget v1, p0, Li8/n;->I:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_1
    iget v1, p0, Li8/n;->F:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v5, p0, Li8/n;->J:Li8/q;

    invoke-virtual {p1, v1, v5}, Lp8/f;->c0(ILp8/p;)V

    :cond_2
    const/4 v1, 0x0

    move v5, v1

    :goto_0
    iget-object v6, p0, Li8/n;->L:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    iget-object v6, p0, Li8/n;->L:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp8/p;

    invoke-virtual {p1, v4, v6}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    const/4 v4, 0x5

    iget-object v5, p0, Li8/n;->M:Li8/q;

    invoke-virtual {p1, v4, v5}, Lp8/f;->c0(ILp8/p;)V

    :cond_4
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x80

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    const/4 v4, 0x6

    iget-object v5, p0, Li8/n;->R:Li8/u;

    invoke-virtual {p1, v4, v5}, Lp8/f;->c0(ILp8/p;)V

    :cond_5
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x100

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    const/4 v4, 0x7

    iget v5, p0, Li8/n;->S:I

    invoke-virtual {p1, v4, v5}, Lp8/f;->Z(II)V

    :cond_6
    iget v4, p0, Li8/n;->F:I

    const/16 v5, 0x200

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_7

    iget v4, p0, Li8/n;->T:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_7
    iget v2, p0, Li8/n;->F:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    const/16 v2, 0x9

    iget v4, p0, Li8/n;->K:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_8
    iget v2, p0, Li8/n;->F:I

    const/16 v4, 0x40

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    const/16 v2, 0xa

    iget v4, p0, Li8/n;->N:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_9
    iget v2, p0, Li8/n;->F:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_a

    const/16 v2, 0xb

    iget v3, p0, Li8/n;->G:I

    invoke-virtual {p1, v2, v3}, Lp8/f;->Z(II)V

    :cond_a
    move v2, v1

    :goto_1
    iget-object v3, p0, Li8/n;->O:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    iget-object v3, p0, Li8/n;->O:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/16 v4, 0xc

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_b
    invoke-virtual {p0}, Li8/n;->W()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_c

    const/16 v2, 0x6a

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v2, p0, Li8/n;->Q:I

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    :cond_c
    move v2, v1

    :goto_2
    iget-object v3, p0, Li8/n;->P:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_d

    iget-object v3, p0, Li8/n;->P:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Lp8/f;->a0(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_d
    :goto_3
    iget-object v2, p0, Li8/n;->U:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_e

    iget-object v2, p0, Li8/n;->U:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x1f

    invoke-virtual {p1, v3, v2}, Lp8/f;->Z(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_e
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/n;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public h0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/n;->J:Li8/q;

    return-object v0
.end method

.method public i0()I
    .locals 1

    iget v0, p0, Li8/n;->K:I

    return v0
.end method

.method public j0()I
    .locals 1

    iget v0, p0, Li8/n;->T:I

    return v0
.end method

.method public k0()Li8/u;
    .locals 1

    iget-object v0, p0, Li8/n;->R:Li8/u;

    return-object v0
.end method

.method public l0(I)Li8/s;
    .locals 1

    iget-object v0, p0, Li8/n;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/s;

    return-object p1
.end method

.method public m0()I
    .locals 1

    iget-object v0, p0, Li8/n;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public n0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/n;->L:Ljava/util/List;

    return-object v0
.end method

.method public o0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/n;->U:Ljava/util/List;

    return-object v0
.end method

.method public p0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public q0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public r0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

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

.method public s0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

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

.method public t0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

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

.method public u0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

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

.method public w0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

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

.method public x0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/n;->F:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
