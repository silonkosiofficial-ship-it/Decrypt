.class public final Li8/i;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/i$b;
    }
.end annotation


# static fields
.field private static final X:Li8/i;

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

.field private R:Ljava/util/List;

.field private S:Li8/t;

.field private T:Ljava/util/List;

.field private U:Li8/e;

.field private V:B

.field private W:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/i$a;

    invoke-direct {v0}, Li8/i$a;-><init>()V

    sput-object v0, Li8/i;->Y:Lp8/r;

    new-instance v0, Li8/i;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/i;-><init>(Z)V

    sput-object v0, Li8/i;->X:Li8/i;

    invoke-direct {v0}, Li8/i;->B0()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 13

    .prologue
    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Li8/i;->Q:I

    iput-byte v0, p0, Li8/i;->V:B

    iput v0, p0, Li8/i;->W:I

    invoke-direct {p0}, Li8/i;->B0()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x400

    const/16 v6, 0x20

    const/16 v7, 0x200

    const/16 v8, 0x1000

    const/16 v9, 0x100

    if-nez v3, :cond_16

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v10

    const/4 v11, 0x0

    sparse-switch v10, :sswitch_data_0

    invoke-virtual {p0, p1, v2, p2, v10}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

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
    iget v10, p0, Li8/i;->F:I

    and-int/2addr v10, v9

    if-ne v10, v9, :cond_1

    iget-object v10, p0, Li8/i;->U:Li8/e;

    invoke-virtual {v10}, Li8/e;->B()Li8/e$b;

    move-result-object v11

    :cond_1
    sget-object v10, Li8/e;->I:Lp8/r;

    invoke-virtual {p1, v10, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/e;

    iput-object v10, p0, Li8/i;->U:Li8/e;

    if-eqz v11, :cond_2

    invoke-virtual {v11, v10}, Li8/e$b;->w(Li8/e;)Li8/e$b;

    invoke-virtual {v11}, Li8/e$b;->q()Li8/e;

    move-result-object v10

    iput-object v10, p0, Li8/i;->U:Li8/e;

    :cond_2
    iget v10, p0, Li8/i;->F:I

    or-int/2addr v10, v9

    iput v10, p0, Li8/i;->F:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v10

    invoke-virtual {p1, v10}, Lp8/e;->i(I)I

    move-result v10

    and-int/lit16 v11, v4, 0x1000

    if-eq v11, v8, :cond_3

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v11

    if-lez v11, :cond_3

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, p0, Li8/i;->T:Ljava/util/List;

    or-int/lit16 v4, v4, 0x1000

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v11

    if-lez v11, :cond_4

    iget-object v11, p0, Li8/i;->T:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v10}, Lp8/e;->h(I)V

    goto :goto_0

    :sswitch_3
    and-int/lit16 v10, v4, 0x1000

    if-eq v10, v8, :cond_5

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/i;->T:Ljava/util/List;

    or-int/lit16 v4, v4, 0x1000

    :cond_5
    iget-object v10, p0, Li8/i;->T:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    :goto_2
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_4
    iget v10, p0, Li8/i;->F:I

    const/16 v12, 0x80

    and-int/2addr v10, v12

    if-ne v10, v12, :cond_6

    iget-object v10, p0, Li8/i;->S:Li8/t;

    invoke-virtual {v10}, Li8/t;->G()Li8/t$b;

    move-result-object v11

    :cond_6
    sget-object v10, Li8/t;->K:Lp8/r;

    invoke-virtual {p1, v10, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/t;

    iput-object v10, p0, Li8/i;->S:Li8/t;

    if-eqz v11, :cond_7

    invoke-virtual {v11, v10}, Li8/t$b;->w(Li8/t;)Li8/t$b;

    invoke-virtual {v11}, Li8/t$b;->q()Li8/t;

    move-result-object v10

    iput-object v10, p0, Li8/i;->S:Li8/t;

    :cond_7
    iget v10, p0, Li8/i;->F:I

    :goto_3
    or-int/2addr v10, v12

    iput v10, p0, Li8/i;->F:I

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v10

    invoke-virtual {p1, v10}, Lp8/e;->i(I)I

    move-result v10

    and-int/lit16 v11, v4, 0x200

    if-eq v11, v7, :cond_8

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v11

    if-lez v11, :cond_8

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, p0, Li8/i;->P:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    :cond_8
    :goto_4
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v11

    if-lez v11, :cond_4

    iget-object v11, p0, Li8/i;->P:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :sswitch_6
    and-int/lit16 v10, v4, 0x200

    if-eq v10, v7, :cond_9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/i;->P:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    :cond_9
    iget-object v10, p0, Li8/i;->P:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_2

    :sswitch_7
    and-int/lit16 v10, v4, 0x100

    if-eq v10, v9, :cond_a

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/i;->O:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    :cond_a
    iget-object v10, p0, Li8/i;->O:Ljava/util/List;

    sget-object v11, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v11, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v11

    goto/16 :goto_2

    :sswitch_8
    iget v10, p0, Li8/i;->F:I

    or-int/2addr v10, v1

    iput v10, p0, Li8/i;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    iput v10, p0, Li8/i;->G:I

    goto/16 :goto_0

    :sswitch_9
    iget v10, p0, Li8/i;->F:I

    or-int/lit8 v10, v10, 0x40

    iput v10, p0, Li8/i;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    iput v10, p0, Li8/i;->N:I

    goto/16 :goto_0

    :sswitch_a
    iget v10, p0, Li8/i;->F:I

    or-int/lit8 v10, v10, 0x10

    iput v10, p0, Li8/i;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    iput v10, p0, Li8/i;->K:I

    goto/16 :goto_0

    :sswitch_b
    and-int/lit16 v10, v4, 0x400

    if-eq v10, v5, :cond_b

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/i;->R:Ljava/util/List;

    or-int/lit16 v4, v4, 0x400

    :cond_b
    iget-object v10, p0, Li8/i;->R:Ljava/util/List;

    sget-object v11, Li8/u;->P:Lp8/r;

    invoke-virtual {p1, v11, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v11

    goto/16 :goto_2

    :sswitch_c
    iget v10, p0, Li8/i;->F:I

    and-int/2addr v10, v6

    if-ne v10, v6, :cond_c

    iget-object v10, p0, Li8/i;->M:Li8/q;

    invoke-virtual {v10}, Li8/q;->B0()Li8/q$c;

    move-result-object v11

    :cond_c
    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v10, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/q;

    iput-object v10, p0, Li8/i;->M:Li8/q;

    if-eqz v11, :cond_d

    invoke-virtual {v11, v10}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v11}, Li8/q$c;->v()Li8/q;

    move-result-object v10

    iput-object v10, p0, Li8/i;->M:Li8/q;

    :cond_d
    iget v10, p0, Li8/i;->F:I

    or-int/2addr v10, v6

    iput v10, p0, Li8/i;->F:I

    goto/16 :goto_0

    :sswitch_d
    and-int/lit8 v10, v4, 0x20

    if-eq v10, v6, :cond_e

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Li8/i;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_e
    iget-object v10, p0, Li8/i;->L:Ljava/util/List;

    sget-object v11, Li8/s;->Q:Lp8/r;

    invoke-virtual {p1, v11, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v11

    goto/16 :goto_2

    :sswitch_e
    iget v10, p0, Li8/i;->F:I

    const/16 v12, 0x8

    and-int/2addr v10, v12

    if-ne v10, v12, :cond_f

    iget-object v10, p0, Li8/i;->J:Li8/q;

    invoke-virtual {v10}, Li8/q;->B0()Li8/q$c;

    move-result-object v11

    :cond_f
    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {p1, v10, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/q;

    iput-object v10, p0, Li8/i;->J:Li8/q;

    if-eqz v11, :cond_10

    invoke-virtual {v11, v10}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v11}, Li8/q$c;->v()Li8/q;

    move-result-object v10

    iput-object v10, p0, Li8/i;->J:Li8/q;

    :cond_10
    iget v10, p0, Li8/i;->F:I

    goto/16 :goto_3

    :sswitch_f
    iget v10, p0, Li8/i;->F:I

    or-int/lit8 v10, v10, 0x4

    iput v10, p0, Li8/i;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    iput v10, p0, Li8/i;->I:I

    goto/16 :goto_0

    :sswitch_10
    iget v10, p0, Li8/i;->F:I

    or-int/lit8 v10, v10, 0x2

    iput v10, p0, Li8/i;->F:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v10

    iput v10, p0, Li8/i;->H:I
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

    if-ne p2, v6, :cond_11

    iget-object p2, p0, Li8/i;->L:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/i;->L:Ljava/util/List;

    :cond_11
    and-int/lit16 p2, v4, 0x400

    if-ne p2, v5, :cond_12

    iget-object p2, p0, Li8/i;->R:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/i;->R:Ljava/util/List;

    :cond_12
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v9, :cond_13

    iget-object p2, p0, Li8/i;->O:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/i;->O:Ljava/util/List;

    :cond_13
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v7, :cond_14

    iget-object p2, p0, Li8/i;->P:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/i;->P:Ljava/util/List;

    :cond_14
    and-int/lit16 p2, v4, 0x1000

    if-ne p2, v8, :cond_15

    iget-object p2, p0, Li8/i;->T:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/i;->T:Ljava/util/List;

    :cond_15
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/i;->E:Lp8/d;

    goto :goto_8

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/i;->E:Lp8/d;

    throw p1

    :goto_8
    invoke-virtual {p0}, Lp8/i$d;->m()V

    throw p1

    :cond_16
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_17

    iget-object p1, p0, Li8/i;->L:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/i;->L:Ljava/util/List;

    :cond_17
    and-int/lit16 p1, v4, 0x400

    if-ne p1, v5, :cond_18

    iget-object p1, p0, Li8/i;->R:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/i;->R:Ljava/util/List;

    :cond_18
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v9, :cond_19

    iget-object p1, p0, Li8/i;->O:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/i;->O:Ljava/util/List;

    :cond_19
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v7, :cond_1a

    iget-object p1, p0, Li8/i;->P:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/i;->P:Ljava/util/List;

    :cond_1a
    and-int/lit16 p1, v4, 0x1000

    if-ne p1, v8, :cond_1b

    iget-object p1, p0, Li8/i;->T:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/i;->T:Ljava/util/List;

    :cond_1b
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/i;->E:Lp8/d;

    goto :goto_9

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/i;->E:Lp8/d;

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
        0x52 -> :sswitch_7
        0x58 -> :sswitch_6
        0x5a -> :sswitch_5
        0xf2 -> :sswitch_4
        0xf8 -> :sswitch_3
        0xfa -> :sswitch_2
        0x102 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/i;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput v0, p0, Li8/i;->Q:I

    iput-byte v0, p0, Li8/i;->V:B

    iput v0, p0, Li8/i;->W:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/i;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/i;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Li8/i;->Q:I

    iput-byte p1, p0, Li8/i;->V:B

    iput p1, p0, Li8/i;->W:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/i;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/i;I)I
    .locals 0

    iput p1, p0, Li8/i;->G:I

    return p1
.end method

.method static synthetic B(Li8/i;I)I
    .locals 0

    iput p1, p0, Li8/i;->H:I

    return p1
.end method

.method private B0()V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Li8/i;->G:I

    iput v0, p0, Li8/i;->H:I

    const/4 v0, 0x0

    iput v0, p0, Li8/i;->I:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/i;->J:Li8/q;

    iput v0, p0, Li8/i;->K:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/i;->L:Ljava/util/List;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/i;->M:Li8/q;

    iput v0, p0, Li8/i;->N:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i;->O:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i;->P:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i;->R:Ljava/util/List;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v0

    iput-object v0, p0, Li8/i;->S:Li8/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/i;->T:Ljava/util/List;

    invoke-static {}, Li8/e;->u()Li8/e;

    move-result-object v0

    iput-object v0, p0, Li8/i;->U:Li8/e;

    return-void
.end method

.method static synthetic C(Li8/i;I)I
    .locals 0

    iput p1, p0, Li8/i;->I:I

    return p1
.end method

.method public static C0()Li8/i$b;
    .locals 1

    invoke-static {}, Li8/i$b;->t()Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic D(Li8/i;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/i;->J:Li8/q;

    return-object p1
.end method

.method public static D0(Li8/i;)Li8/i$b;
    .locals 1

    invoke-static {}, Li8/i;->C0()Li8/i$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/i$b;->G(Li8/i;)Li8/i$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic E(Li8/i;I)I
    .locals 0

    iput p1, p0, Li8/i;->K:I

    return p1
.end method

.method static synthetic F(Li8/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/i;->L:Ljava/util/List;

    return-object p0
.end method

.method public static F0(Ljava/io/InputStream;Lp8/g;)Li8/i;
    .locals 1

    sget-object v0, Li8/i;->Y:Lp8/r;

    invoke-interface {v0, p0, p1}, Lp8/r;->c(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/i;

    return-object p0
.end method

.method static synthetic G(Li8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/i;->L:Ljava/util/List;

    return-object p1
.end method

.method static synthetic H(Li8/i;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/i;->M:Li8/q;

    return-object p1
.end method

.method static synthetic I(Li8/i;I)I
    .locals 0

    iput p1, p0, Li8/i;->N:I

    return p1
.end method

.method static synthetic J(Li8/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/i;->O:Ljava/util/List;

    return-object p0
.end method

.method static synthetic K(Li8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/i;->O:Ljava/util/List;

    return-object p1
.end method

.method static synthetic L(Li8/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/i;->P:Ljava/util/List;

    return-object p0
.end method

.method static synthetic M(Li8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/i;->P:Ljava/util/List;

    return-object p1
.end method

.method static synthetic N(Li8/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/i;->R:Ljava/util/List;

    return-object p0
.end method

.method static synthetic O(Li8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/i;->R:Ljava/util/List;

    return-object p1
.end method

.method static synthetic P(Li8/i;Li8/t;)Li8/t;
    .locals 0

    iput-object p1, p0, Li8/i;->S:Li8/t;

    return-object p1
.end method

.method static synthetic Q(Li8/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/i;->T:Ljava/util/List;

    return-object p0
.end method

.method static synthetic R(Li8/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/i;->T:Ljava/util/List;

    return-object p1
.end method

.method static synthetic S(Li8/i;Li8/e;)Li8/e;
    .locals 0

    iput-object p1, p0, Li8/i;->U:Li8/e;

    return-object p1
.end method

.method static synthetic T(Li8/i;I)I
    .locals 0

    iput p1, p0, Li8/i;->F:I

    return p1
.end method

.method static synthetic U(Li8/i;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/i;->E:Lp8/d;

    return-object p0
.end method

.method public static a0()Li8/i;
    .locals 1

    sget-object v0, Li8/i;->X:Li8/i;

    return-object v0
.end method


# virtual methods
.method public A0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public E0()Li8/i$b;
    .locals 1

    invoke-static {}, Li8/i;->C0()Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method public G0()Li8/i$b;
    .locals 1

    invoke-static {p0}, Li8/i;->D0(Li8/i;)Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method public V(I)Li8/q;
    .locals 1

    iget-object v0, p0, Li8/i;->O:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;

    return-object p1
.end method

.method public W()I
    .locals 1

    iget-object v0, p0, Li8/i;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public X()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/i;->P:Ljava/util/List;

    return-object v0
.end method

.method public Y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/i;->O:Ljava/util/List;

    return-object v0
.end method

.method public Z()Li8/e;
    .locals 1

    iget-object v0, p0, Li8/i;->U:Li8/e;

    return-object v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/i;->b0()Li8/i;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 9

    .prologue
    iget v0, p0, Li8/i;->W:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/i;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/i;->H:I

    invoke-static {v3, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v4, p0, Li8/i;->F:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    iget v4, p0, Li8/i;->I:I

    invoke-static {v1, v4}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_2
    iget v4, p0, Li8/i;->F:I

    const/16 v6, 0x8

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_3

    const/4 v4, 0x3

    iget-object v7, p0, Li8/i;->J:Li8/q;

    invoke-static {v4, v7}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3
    move v4, v2

    :goto_1
    iget-object v7, p0, Li8/i;->L:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_4

    iget-object v7, p0, Li8/i;->L:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp8/p;

    invoke-static {v5, v7}, Lp8/f;->r(ILp8/p;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget v4, p0, Li8/i;->F:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    const/4 v4, 0x5

    iget-object v7, p0, Li8/i;->M:Li8/q;

    invoke-static {v4, v7}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_5
    move v4, v2

    :goto_2
    iget-object v7, p0, Li8/i;->R:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_6

    iget-object v7, p0, Li8/i;->R:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp8/p;

    const/4 v8, 0x6

    invoke-static {v8, v7}, Lp8/f;->r(ILp8/p;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    iget v4, p0, Li8/i;->F:I

    const/16 v7, 0x10

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_7

    const/4 v4, 0x7

    iget v7, p0, Li8/i;->K:I

    invoke-static {v4, v7}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_7
    iget v4, p0, Li8/i;->F:I

    const/16 v7, 0x40

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_8

    iget v4, p0, Li8/i;->N:I

    invoke-static {v6, v4}, Lp8/f;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_8
    iget v4, p0, Li8/i;->F:I

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_9

    const/16 v3, 0x9

    iget v4, p0, Li8/i;->G:I

    invoke-static {v3, v4}, Lp8/f;->o(II)I

    move-result v3

    add-int/2addr v0, v3

    :cond_9
    move v3, v2

    :goto_3
    iget-object v4, p0, Li8/i;->O:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    iget-object v4, p0, Li8/i;->O:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xa

    invoke-static {v6, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    move v3, v2

    move v4, v3

    :goto_4
    iget-object v6, p0, Li8/i;->P:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_b

    iget-object v6, p0, Li8/i;->P:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lp8/f;->p(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    add-int/2addr v0, v4

    invoke-virtual {p0}, Li8/i;->X()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_c

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v3

    add-int/2addr v0, v3

    :cond_c
    iput v4, p0, Li8/i;->Q:I

    iget v3, p0, Li8/i;->F:I

    const/16 v4, 0x80

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_d

    const/16 v3, 0x1e

    iget-object v4, p0, Li8/i;->S:Li8/t;

    invoke-static {v3, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v0, v3

    :cond_d
    move v3, v2

    :goto_5
    iget-object v4, p0, Li8/i;->T:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_e

    iget-object v4, p0, Li8/i;->T:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_e
    add-int/2addr v0, v3

    invoke-virtual {p0}, Li8/i;->r0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    iget v1, p0, Li8/i;->F:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_f

    iget-object v1, p0, Li8/i;->U:Li8/e;

    invoke-static {v5, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_f
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/i;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/i;->W:I

    return v0
.end method

.method public b0()Li8/i;
    .locals 1

    sget-object v0, Li8/i;->X:Li8/i;

    return-object v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/i;->E0()Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Li8/i;->G:I

    return v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/i;->V:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/i;->u0()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_2
    invoke-virtual {p0}, Li8/i;->y0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Li8/i;->i0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/i;->l0()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, Li8/i;->k0(I)Li8/s;

    move-result-object v3

    invoke-virtual {v3}, Li8/s;->d()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Li8/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Li8/i;->f0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_6
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Li8/i;->W()I

    move-result v3

    if-ge v0, v3, :cond_8

    invoke-virtual {p0, v0}, Li8/i;->V(I)Li8/q;

    move-result-object v3

    invoke-virtual {v3}, Li8/q;->d()Z

    move-result v3

    if-nez v3, :cond_7

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    move v0, v2

    :goto_2
    invoke-virtual {p0}, Li8/i;->p0()I

    move-result v3

    if-ge v0, v3, :cond_a

    invoke-virtual {p0, v0}, Li8/i;->o0(I)Li8/u;

    move-result-object v3

    invoke-virtual {v3}, Li8/u;->d()Z

    move-result v3

    if-nez v3, :cond_9

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_a
    invoke-virtual {p0}, Li8/i;->A0()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Li8/i;->n0()Li8/t;

    move-result-object v0

    invoke-virtual {v0}, Li8/t;->d()Z

    move-result v0

    if-nez v0, :cond_b

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_b
    invoke-virtual {p0}, Li8/i;->s0()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Li8/i;->Z()Li8/e;

    move-result-object v0

    invoke-virtual {v0}, Li8/e;->d()Z

    move-result v0

    if-nez v0, :cond_c

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_c
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_d

    iput-byte v2, p0, Li8/i;->V:B

    return v2

    :cond_d
    iput-byte v1, p0, Li8/i;->V:B

    return v1
.end method

.method public d0()I
    .locals 1

    iget v0, p0, Li8/i;->I:I

    return v0
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/i;->G0()Li8/i$b;

    move-result-object v0

    return-object v0
.end method

.method public e0()I
    .locals 1

    iget v0, p0, Li8/i;->H:I

    return v0
.end method

.method public f0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/i;->M:Li8/q;

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 8

    .prologue
    invoke-virtual {p0}, Li8/i;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/i;->F:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/i;->H:I

    invoke-virtual {p1, v3, v1}, Lp8/f;->Z(II)V

    :cond_0
    iget v1, p0, Li8/i;->F:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_1

    iget v1, p0, Li8/i;->I:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_1
    iget v1, p0, Li8/i;->F:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v5, p0, Li8/i;->J:Li8/q;

    invoke-virtual {p1, v1, v5}, Lp8/f;->c0(ILp8/p;)V

    :cond_2
    const/4 v1, 0x0

    move v5, v1

    :goto_0
    iget-object v6, p0, Li8/i;->L:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    iget-object v6, p0, Li8/i;->L:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp8/p;

    invoke-virtual {p1, v4, v6}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget v4, p0, Li8/i;->F:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    const/4 v4, 0x5

    iget-object v6, p0, Li8/i;->M:Li8/q;

    invoke-virtual {p1, v4, v6}, Lp8/f;->c0(ILp8/p;)V

    :cond_4
    move v4, v1

    :goto_1
    iget-object v6, p0, Li8/i;->R:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_5

    iget-object v6, p0, Li8/i;->R:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp8/p;

    const/4 v7, 0x6

    invoke-virtual {p1, v7, v6}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    iget v4, p0, Li8/i;->F:I

    const/16 v6, 0x10

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_6

    const/4 v4, 0x7

    iget v6, p0, Li8/i;->K:I

    invoke-virtual {p1, v4, v6}, Lp8/f;->Z(II)V

    :cond_6
    iget v4, p0, Li8/i;->F:I

    const/16 v6, 0x40

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_7

    iget v4, p0, Li8/i;->N:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_7
    iget v2, p0, Li8/i;->F:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_8

    const/16 v2, 0x9

    iget v3, p0, Li8/i;->G:I

    invoke-virtual {p1, v2, v3}, Lp8/f;->Z(II)V

    :cond_8
    move v2, v1

    :goto_2
    iget-object v3, p0, Li8/i;->O:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    iget-object v3, p0, Li8/i;->O:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/16 v4, 0xa

    invoke-virtual {p1, v4, v3}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, Li8/i;->X()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_a

    const/16 v2, 0x5a

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v2, p0, Li8/i;->Q:I

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    :cond_a
    move v2, v1

    :goto_3
    iget-object v3, p0, Li8/i;->P:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    iget-object v3, p0, Li8/i;->P:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Lp8/f;->a0(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    iget v2, p0, Li8/i;->F:I

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_c

    const/16 v2, 0x1e

    iget-object v3, p0, Li8/i;->S:Li8/t;

    invoke-virtual {p1, v2, v3}, Lp8/f;->c0(ILp8/p;)V

    :cond_c
    :goto_4
    iget-object v2, p0, Li8/i;->T:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_d

    iget-object v2, p0, Li8/i;->T:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x1f

    invoke-virtual {p1, v3, v2}, Lp8/f;->Z(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_d
    iget v1, p0, Li8/i;->F:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_e

    iget-object v1, p0, Li8/i;->U:Li8/e;

    invoke-virtual {p1, v5, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_e
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/i;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public h0()I
    .locals 1

    iget v0, p0, Li8/i;->N:I

    return v0
.end method

.method public i0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/i;->J:Li8/q;

    return-object v0
.end method

.method public j0()I
    .locals 1

    iget v0, p0, Li8/i;->K:I

    return v0
.end method

.method public k0(I)Li8/s;
    .locals 1

    iget-object v0, p0, Li8/i;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/s;

    return-object p1
.end method

.method public l0()I
    .locals 1

    iget-object v0, p0, Li8/i;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public m0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/i;->L:Ljava/util/List;

    return-object v0
.end method

.method public n0()Li8/t;
    .locals 1

    iget-object v0, p0, Li8/i;->S:Li8/t;

    return-object v0
.end method

.method public o0(I)Li8/u;
    .locals 1

    iget-object v0, p0, Li8/i;->R:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/u;

    return-object p1
.end method

.method public p0()I
    .locals 1

    iget-object v0, p0, Li8/i;->R:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public q0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/i;->R:Ljava/util/List;

    return-object v0
.end method

.method public r0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/i;->T:Ljava/util/List;

    return-object v0
.end method

.method public s0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public t0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public u0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public v0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public w0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public x0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public y0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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

.method public z0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/i;->F:I

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
