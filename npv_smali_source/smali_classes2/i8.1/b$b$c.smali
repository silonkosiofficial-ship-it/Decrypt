.class public final Li8/b$b$c;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/b$b$c$b;,
        Li8/b$b$c$c;
    }
.end annotation


# static fields
.field private static final S:Li8/b$b$c;

.field public static T:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:Li8/b$b$c$c;

.field private G:J

.field private H:F

.field private I:D

.field private J:I

.field private K:I

.field private L:I

.field private M:Li8/b;

.field private N:Ljava/util/List;

.field private O:I

.field private P:I

.field private Q:B

.field private R:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/b$b$c$a;

    invoke-direct {v0}, Li8/b$b$c$a;-><init>()V

    sput-object v0, Li8/b$b$c;->T:Lp8/r;

    new-instance v0, Li8/b$b$c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/b$b$c;-><init>(Z)V

    sput-object v0, Li8/b$b$c;->S:Li8/b$b$c;

    invoke-direct {v0}, Li8/b$b$c;->d0()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/b$b$c;->Q:B

    iput v0, p0, Li8/b$b$c;->R:I

    invoke-direct {p0}, Li8/b$b$c;->d0()V

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

    if-nez v3, :cond_6

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-virtual {p0, p1, v2, p2, v6}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
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

    :sswitch_1
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/2addr v6, v5

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v6

    iput v6, p0, Li8/b$b$c;->O:I

    goto :goto_0

    :sswitch_2
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit16 v6, v6, 0x200

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v6

    iput v6, p0, Li8/b$b$c;->P:I

    goto :goto_0

    :sswitch_3
    and-int/lit16 v6, v4, 0x100

    if-eq v6, v5, :cond_1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Li8/b$b$c;->N:Ljava/util/List;

    move v4, v5

    :cond_1
    iget-object v6, p0, Li8/b$b$c;->N:Ljava/util/List;

    sget-object v7, Li8/b$b$c;->T:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :sswitch_4
    iget v6, p0, Li8/b$b$c;->E:I

    const/16 v7, 0x80

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_2

    iget-object v6, p0, Li8/b$b$c;->M:Li8/b;

    invoke-virtual {v6}, Li8/b;->G()Li8/b$c;

    move-result-object v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    sget-object v8, Li8/b;->K:Lp8/r;

    invoke-virtual {p1, v8, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v8

    check-cast v8, Li8/b;

    iput-object v8, p0, Li8/b$b$c;->M:Li8/b;

    if-eqz v6, :cond_3

    invoke-virtual {v6, v8}, Li8/b$c;->w(Li8/b;)Li8/b$c;

    invoke-virtual {v6}, Li8/b$c;->q()Li8/b;

    move-result-object v6

    iput-object v6, p0, Li8/b$b$c;->M:Li8/b;

    :cond_3
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/2addr v6, v7

    iput v6, p0, Li8/b$b$c;->E:I

    goto :goto_0

    :sswitch_5
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit8 v6, v6, 0x40

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v6

    iput v6, p0, Li8/b$b$c;->L:I

    goto/16 :goto_0

    :sswitch_6
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit8 v6, v6, 0x20

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v6

    iput v6, p0, Li8/b$b$c;->K:I

    goto/16 :goto_0

    :sswitch_7
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit8 v6, v6, 0x10

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v6

    iput v6, p0, Li8/b$b$c;->J:I

    goto/16 :goto_0

    :sswitch_8
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit8 v6, v6, 0x8

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->l()D

    move-result-wide v6

    iput-wide v6, p0, Li8/b$b$c;->I:D

    goto/16 :goto_0

    :sswitch_9
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit8 v6, v6, 0x4

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->p()F

    move-result v6

    iput v6, p0, Li8/b$b$c;->H:F

    goto/16 :goto_0

    :sswitch_a
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/lit8 v6, v6, 0x2

    iput v6, p0, Li8/b$b$c;->E:I

    invoke-virtual {p1}, Lp8/e;->G()J

    move-result-wide v6

    iput-wide v6, p0, Li8/b$b$c;->G:J

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v7

    invoke-static {v7}, Li8/b$b$c$c;->e(I)Li8/b$b$c$c;

    move-result-object v8

    if-nez v8, :cond_4

    invoke-virtual {v2, v6}, Lp8/f;->n0(I)V

    invoke-virtual {v2, v7}, Lp8/f;->n0(I)V

    goto/16 :goto_0

    :cond_4
    iget v6, p0, Li8/b$b$c;->E:I

    or-int/2addr v6, v1

    iput v6, p0, Li8/b$b$c;->E:I

    iput-object v8, p0, Li8/b$b$c;->F:Li8/b$b$c$c;
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
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v5, :cond_5

    iget-object p2, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/b$b$c;->N:Ljava/util/List;

    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b$b$c;->D:Lp8/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b$b$c;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_6
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v5, :cond_7

    iget-object p1, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/b$b$c;->N:Ljava/util/List;

    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/b$b$c;->D:Lp8/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b$b$c;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_b
        0x10 -> :sswitch_a
        0x1d -> :sswitch_9
        0x21 -> :sswitch_8
        0x28 -> :sswitch_7
        0x30 -> :sswitch_6
        0x38 -> :sswitch_5
        0x42 -> :sswitch_4
        0x4a -> :sswitch_3
        0x50 -> :sswitch_2
        0x58 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/b$b$c;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/b$b$c;->Q:B

    iput v0, p0, Li8/b$b$c;->R:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/b$b$c;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/b$b$c;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/b$b$c;->Q:B

    iput p1, p0, Li8/b$b$c;->R:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/b$b$c;->D:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/b$b$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/b$b$c;->N:Ljava/util/List;

    return-object p1
.end method

.method static synthetic B(Li8/b$b$c;I)I
    .locals 0

    iput p1, p0, Li8/b$b$c;->O:I

    return p1
.end method

.method static synthetic C(Li8/b$b$c;I)I
    .locals 0

    iput p1, p0, Li8/b$b$c;->P:I

    return p1
.end method

.method static synthetic D(Li8/b$b$c;I)I
    .locals 0

    iput p1, p0, Li8/b$b$c;->E:I

    return p1
.end method

.method static synthetic E(Li8/b$b$c;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/b$b$c;->D:Lp8/d;

    return-object p0
.end method

.method public static L()Li8/b$b$c;
    .locals 1

    sget-object v0, Li8/b$b$c;->S:Li8/b$b$c;

    return-object v0
.end method

.method private d0()V
    .locals 2

    sget-object v0, Li8/b$b$c$c;->D:Li8/b$b$c$c;

    iput-object v0, p0, Li8/b$b$c;->F:Li8/b$b$c$c;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Li8/b$b$c;->G:J

    const/4 v0, 0x0

    iput v0, p0, Li8/b$b$c;->H:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Li8/b$b$c;->I:D

    const/4 v0, 0x0

    iput v0, p0, Li8/b$b$c;->J:I

    iput v0, p0, Li8/b$b$c;->K:I

    iput v0, p0, Li8/b$b$c;->L:I

    invoke-static {}, Li8/b;->z()Li8/b;

    move-result-object v1

    iput-object v1, p0, Li8/b$b$c;->M:Li8/b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/b$b$c;->N:Ljava/util/List;

    iput v0, p0, Li8/b$b$c;->O:I

    iput v0, p0, Li8/b$b$c;->P:I

    return-void
.end method

.method public static e0()Li8/b$b$c$b;
    .locals 1

    invoke-static {}, Li8/b$b$c$b;->n()Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static f0(Li8/b$b$c;)Li8/b$b$c$b;
    .locals 1

    invoke-static {}, Li8/b$b$c;->e0()Li8/b$b$c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/b$b$c$b;->x(Li8/b$b$c;)Li8/b$b$c$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/b$b$c;Li8/b$b$c$c;)Li8/b$b$c$c;
    .locals 0

    iput-object p1, p0, Li8/b$b$c;->F:Li8/b$b$c$c;

    return-object p1
.end method

.method static synthetic s(Li8/b$b$c;J)J
    .locals 0

    iput-wide p1, p0, Li8/b$b$c;->G:J

    return-wide p1
.end method

.method static synthetic t(Li8/b$b$c;F)F
    .locals 0

    iput p1, p0, Li8/b$b$c;->H:F

    return p1
.end method

.method static synthetic u(Li8/b$b$c;D)D
    .locals 0

    iput-wide p1, p0, Li8/b$b$c;->I:D

    return-wide p1
.end method

.method static synthetic v(Li8/b$b$c;I)I
    .locals 0

    iput p1, p0, Li8/b$b$c;->J:I

    return p1
.end method

.method static synthetic w(Li8/b$b$c;I)I
    .locals 0

    iput p1, p0, Li8/b$b$c;->K:I

    return p1
.end method

.method static synthetic x(Li8/b$b$c;I)I
    .locals 0

    iput p1, p0, Li8/b$b$c;->L:I

    return p1
.end method

.method static synthetic y(Li8/b$b$c;Li8/b;)Li8/b;
    .locals 0

    iput-object p1, p0, Li8/b$b$c;->M:Li8/b;

    return-object p1
.end method

.method static synthetic z(Li8/b$b$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/b$b$c;->N:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public F()Li8/b;
    .locals 1

    iget-object v0, p0, Li8/b$b$c;->M:Li8/b;

    return-object v0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Li8/b$b$c;->O:I

    return v0
.end method

.method public H(I)Li8/b$b$c;
    .locals 1

    iget-object v0, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/b$b$c;

    return-object p1
.end method

.method public I()I
    .locals 1

    iget-object v0, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/b$b$c;->N:Ljava/util/List;

    return-object v0
.end method

.method public K()I
    .locals 1

    iget v0, p0, Li8/b$b$c;->K:I

    return v0
.end method

.method public M()D
    .locals 2

    iget-wide v0, p0, Li8/b$b$c;->I:D

    return-wide v0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Li8/b$b$c;->L:I

    return v0
.end method

.method public O()I
    .locals 1

    iget v0, p0, Li8/b$b$c;->P:I

    return v0
.end method

.method public P()F
    .locals 1

    iget v0, p0, Li8/b$b$c;->H:F

    return v0
.end method

.method public Q()J
    .locals 2

    iget-wide v0, p0, Li8/b$b$c;->G:J

    return-wide v0
.end method

.method public R()I
    .locals 1

    iget v0, p0, Li8/b$b$c;->J:I

    return v0
.end method

.method public S()Li8/b$b$c$c;
    .locals 1

    iget-object v0, p0, Li8/b$b$c;->F:Li8/b$b$c$c;

    return-object v0
.end method

.method public T()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public U()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public V()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public W()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public X()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public Y()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public Z()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public a0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public b()I
    .locals 7

    .prologue
    iget v0, p0, Li8/b$b$c;->R:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/b$b$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li8/b$b$c;->F:Li8/b$b$c$c;

    invoke-virtual {v0}, Li8/b$b$c$c;->c()I

    move-result v0

    invoke-static {v1, v0}, Lp8/f;->h(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Li8/b$b$c;->E:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget-wide v4, p0, Li8/b$b$c;->G:J

    invoke-static {v3, v4, v5}, Lp8/f;->z(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Li8/b$b$c;->E:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget v4, p0, Li8/b$b$c;->H:F

    invoke-static {v1, v4}, Lp8/f;->l(IF)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-wide v5, p0, Li8/b$b$c;->I:D

    invoke-static {v3, v5, v6}, Lp8/f;->f(ID)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget v3, p0, Li8/b$b$c;->J:I

    invoke-static {v1, v3}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v3, 0x20

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_6

    const/4 v1, 0x6

    iget v3, p0, Li8/b$b$c;->K:I

    invoke-static {v1, v3}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v3, 0x40

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_7

    const/4 v1, 0x7

    iget v3, p0, Li8/b$b$c;->L:I

    invoke-static {v1, v3}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v3, 0x80

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_8

    iget-object v1, p0, Li8/b$b$c;->M:Li8/b;

    invoke-static {v4, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    :goto_1
    iget-object v1, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_9

    iget-object v1, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/16 v3, 0x9

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_9
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    const/16 v1, 0xa

    iget v2, p0, Li8/b$b$c;->P:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, Li8/b$b$c;->E:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_b

    const/16 v1, 0xb

    iget v2, p0, Li8/b$b$c;->O:I

    invoke-static {v1, v2}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-object v1, p0, Li8/b$b$c;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/b$b$c;->R:I

    return v0
.end method

.method public b0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

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

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/b$b$c;->h0()Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public c0()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b$b$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/b$b$c;->Q:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/b$b$c;->T()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Li8/b$b$c;->F()Li8/b;

    move-result-object v0

    invoke-virtual {v0}, Li8/b;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/b$b$c;->Q:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/b$b$c;->I()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, Li8/b$b$c;->H(I)Li8/b$b$c;

    move-result-object v3

    invoke-virtual {v3}, Li8/b$b$c;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Li8/b$b$c;->Q:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iput-byte v1, p0, Li8/b$b$c;->Q:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/b$b$c;->i0()Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Li8/b$b$c;->b()I

    iget v0, p0, Li8/b$b$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/b$b$c;->F:Li8/b$b$c$c;

    invoke-virtual {v0}, Li8/b$b$c$c;->c()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lp8/f;->R(II)V

    :cond_0
    iget v0, p0, Li8/b$b$c;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-wide v2, p0, Li8/b$b$c;->G:J

    invoke-virtual {p1, v1, v2, v3}, Lp8/f;->s0(IJ)V

    :cond_1
    iget v0, p0, Li8/b$b$c;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x3

    iget v2, p0, Li8/b$b$c;->H:F

    invoke-virtual {p1, v0, v2}, Lp8/f;->V(IF)V

    :cond_2
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget-wide v3, p0, Li8/b$b$c;->I:D

    invoke-virtual {p1, v1, v3, v4}, Lp8/f;->P(ID)V

    :cond_3
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, Li8/b$b$c;->J:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_4
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x6

    iget v1, p0, Li8/b$b$c;->K:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_5
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_6

    const/4 v0, 0x7

    iget v1, p0, Li8/b$b$c;->L:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_6
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Li8/b$b$c;->M:Li8/b;

    invoke-virtual {p1, v2, v0}, Lp8/f;->c0(ILp8/p;)V

    :cond_7
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_8

    iget-object v1, p0, Li8/b$b$c;->N:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/16 v2, 0x9

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_8
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_9

    const/16 v0, 0xa

    iget v1, p0, Li8/b$b$c;->P:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_9
    iget v0, p0, Li8/b$b$c;->E:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_a

    const/16 v0, 0xb

    iget v1, p0, Li8/b$b$c;->O:I

    invoke-virtual {p1, v0, v1}, Lp8/f;->Z(II)V

    :cond_a
    iget-object v0, p0, Li8/b$b$c;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public h0()Li8/b$b$c$b;
    .locals 1

    invoke-static {}, Li8/b$b$c;->e0()Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method

.method public i0()Li8/b$b$c$b;
    .locals 1

    invoke-static {p0}, Li8/b$b$c;->f0(Li8/b$b$c;)Li8/b$b$c$b;

    move-result-object v0

    return-object v0
.end method
