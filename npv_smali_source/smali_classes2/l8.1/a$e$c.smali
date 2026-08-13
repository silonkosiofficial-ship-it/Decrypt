.class public final Ll8/a$e$c;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/a$e$c$b;,
        Ll8/a$e$c$c;
    }
.end annotation


# static fields
.field private static final P:Ll8/a$e$c;

.field public static Q:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:I

.field private G:I

.field private H:Ljava/lang/Object;

.field private I:Ll8/a$e$c$c;

.field private J:Ljava/util/List;

.field private K:I

.field private L:Ljava/util/List;

.field private M:I

.field private N:B

.field private O:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll8/a$e$c$a;

    invoke-direct {v0}, Ll8/a$e$c$a;-><init>()V

    sput-object v0, Ll8/a$e$c;->Q:Lp8/r;

    new-instance v0, Ll8/a$e$c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll8/a$e$c;-><init>(Z)V

    sput-object v0, Ll8/a$e$c;->P:Ll8/a$e$c;

    invoke-direct {v0}, Ll8/a$e$c;->Q()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 11

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ll8/a$e$c;->K:I

    iput v0, p0, Ll8/a$e$c;->M:I

    iput-byte v0, p0, Ll8/a$e$c;->N:B

    iput v0, p0, Ll8/a$e$c;->O:I

    invoke-direct {p0}, Ll8/a$e$c;->Q()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x20

    const/16 v6, 0x10

    if-nez v3, :cond_12

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x8

    if-eq v7, v8, :cond_f

    if-eq v7, v6, :cond_e

    const/16 v9, 0x18

    if-eq v7, v9, :cond_c

    if-eq v7, v5, :cond_a

    const/16 v8, 0x22

    if-eq v7, v8, :cond_8

    const/16 v8, 0x28

    if-eq v7, v8, :cond_6

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_3

    const/16 v8, 0x32

    if-eq v7, v8, :cond_2

    invoke-virtual {p0, p1, v2, p2, v7}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :cond_2
    invoke-virtual {p1}, Lp8/e;->k()Lp8/d;

    move-result-object v7

    iget v8, p0, Ll8/a$e$c;->E:I

    or-int/lit8 v8, v8, 0x4

    iput v8, p0, Ll8/a$e$c;->E:I

    iput-object v7, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v7

    invoke-virtual {p1, v7}, Lp8/e;->i(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x20

    if-eq v8, v5, :cond_4

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_4

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Ll8/a$e$c;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_5

    iget-object v8, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v7}, Lp8/e;->h(I)V

    goto :goto_0

    :cond_6
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v5, :cond_7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Ll8/a$e$c;->L:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    :cond_7
    iget-object v7, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_2
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v7

    invoke-virtual {p1, v7}, Lp8/e;->i(I)I

    move-result v7

    and-int/lit8 v8, v4, 0x10

    if-eq v8, v6, :cond_9

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_9

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, p0, Ll8/a$e$c;->J:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    :cond_9
    :goto_3
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v8

    if-lez v8, :cond_5

    iget-object v8, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    and-int/lit8 v7, v4, 0x10

    if-eq v7, v6, :cond_b

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Ll8/a$e$c;->J:Ljava/util/List;

    or-int/lit8 v4, v4, 0x10

    :cond_b
    iget-object v7, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_2

    :cond_c
    invoke-virtual {p1}, Lp8/e;->m()I

    move-result v9

    invoke-static {v9}, Ll8/a$e$c$c;->e(I)Ll8/a$e$c$c;

    move-result-object v10

    if-nez v10, :cond_d

    invoke-virtual {v2, v7}, Lp8/f;->n0(I)V

    invoke-virtual {v2, v9}, Lp8/f;->n0(I)V

    goto/16 :goto_0

    :cond_d
    iget v7, p0, Ll8/a$e$c;->E:I

    or-int/2addr v7, v8

    iput v7, p0, Ll8/a$e$c;->E:I

    iput-object v10, p0, Ll8/a$e$c;->I:Ll8/a$e$c$c;

    goto/16 :goto_0

    :cond_e
    iget v7, p0, Ll8/a$e$c;->E:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, Ll8/a$e$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Ll8/a$e$c;->G:I

    goto/16 :goto_0

    :cond_f
    iget v7, p0, Ll8/a$e$c;->E:I

    or-int/2addr v7, v1

    iput v7, p0, Ll8/a$e$c;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    iput v7, p0, Ll8/a$e$c;->F:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :goto_4
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_5
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    and-int/lit8 p2, v4, 0x10

    if-ne p2, v6, :cond_10

    iget-object p2, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e$c;->J:Ljava/util/List;

    :cond_10
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v5, :cond_11

    iget-object p2, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e$c;->L:Ljava/util/List;

    :cond_11
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e$c;->D:Lp8/d;

    goto :goto_7

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e$c;->D:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_12
    and-int/lit8 p1, v4, 0x10

    if-ne p1, v6, :cond_13

    iget-object p1, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e$c;->J:Ljava/util/List;

    :cond_13
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v5, :cond_14

    iget-object p1, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e$c;->L:Ljava/util/List;

    :cond_14
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e$c;->D:Lp8/d;

    goto :goto_8

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e$c;->D:Lp8/d;

    throw p1

    :goto_8
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll8/a$e$c;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput v0, p0, Ll8/a$e$c;->K:I

    iput v0, p0, Ll8/a$e$c;->M:I

    iput-byte v0, p0, Ll8/a$e$c;->N:B

    iput v0, p0, Ll8/a$e$c;->O:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e$c;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll8/a$e$c;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Ll8/a$e$c;->K:I

    iput p1, p0, Ll8/a$e$c;->M:I

    iput-byte p1, p0, Ll8/a$e$c;->N:B

    iput p1, p0, Ll8/a$e$c;->O:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Ll8/a$e$c;->D:Lp8/d;

    return-void
.end method

.method static synthetic A(Ll8/a$e$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ll8/a$e$c;->L:Ljava/util/List;

    return-object p0
.end method

.method static synthetic B(Ll8/a$e$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ll8/a$e$c;->L:Ljava/util/List;

    return-object p1
.end method

.method public static C()Ll8/a$e$c;
    .locals 1

    sget-object v0, Ll8/a$e$c;->P:Ll8/a$e$c;

    return-object v0
.end method

.method private Q()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll8/a$e$c;->F:I

    const/4 v0, 0x0

    iput v0, p0, Ll8/a$e$c;->G:I

    const-string v0, ""

    iput-object v0, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    sget-object v0, Ll8/a$e$c$c;->D:Ll8/a$e$c$c;

    iput-object v0, p0, Ll8/a$e$c;->I:Ll8/a$e$c$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c;->L:Ljava/util/List;

    return-void
.end method

.method public static R()Ll8/a$e$c$b;
    .locals 1

    invoke-static {}, Ll8/a$e$c$b;->n()Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public static S(Ll8/a$e$c;)Ll8/a$e$c$b;
    .locals 1

    invoke-static {}, Ll8/a$e$c;->R()Ll8/a$e$c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll8/a$e$c$b;->x(Ll8/a$e$c;)Ll8/a$e$c$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Ll8/a$e$c;I)I
    .locals 0

    iput p1, p0, Ll8/a$e$c;->E:I

    return p1
.end method

.method static synthetic s(Ll8/a$e$c;)Lp8/d;
    .locals 0

    iget-object p0, p0, Ll8/a$e$c;->D:Lp8/d;

    return-object p0
.end method

.method static synthetic t(Ll8/a$e$c;I)I
    .locals 0

    iput p1, p0, Ll8/a$e$c;->F:I

    return p1
.end method

.method static synthetic u(Ll8/a$e$c;I)I
    .locals 0

    iput p1, p0, Ll8/a$e$c;->G:I

    return p1
.end method

.method static synthetic v(Ll8/a$e$c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic w(Ll8/a$e$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic x(Ll8/a$e$c;Ll8/a$e$c$c;)Ll8/a$e$c$c;
    .locals 0

    iput-object p1, p0, Ll8/a$e$c;->I:Ll8/a$e$c$c;

    return-object p1
.end method

.method static synthetic y(Ll8/a$e$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ll8/a$e$c;->J:Ljava/util/List;

    return-object p0
.end method

.method static synthetic z(Ll8/a$e$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ll8/a$e$c;->J:Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public D()Ll8/a$e$c$c;
    .locals 1

    iget-object v0, p0, Ll8/a$e$c;->I:Ll8/a$e$c$c;

    return-object v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Ll8/a$e$c;->G:I

    return v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Ll8/a$e$c;->F:I

    return v0
.end method

.method public G()I
    .locals 1

    iget-object v0, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll8/a$e$c;->L:Ljava/util/List;

    return-object v0
.end method

.method public I()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    check-cast v0, Lp8/d;

    invoke-virtual {v0}, Lp8/d;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lp8/d;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object v1, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public J()Lp8/d;
    .locals 2

    .prologue
    iget-object v0, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lp8/d;->o(Ljava/lang/String;)Lp8/d;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c;->H:Ljava/lang/Object;

    return-object v0

    :cond_0
    check-cast v0, Lp8/d;

    return-object v0
.end method

.method public K()I
    .locals 1

    iget-object v0, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public L()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll8/a$e$c;->J:Ljava/util/List;

    return-object v0
.end method

.method public M()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$e$c;->E:I

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

.method public N()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$e$c;->E:I

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

.method public O()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$e$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public P()Z
    .locals 2

    .prologue
    iget v0, p0, Ll8/a$e$c;->E:I

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

.method public T()Ll8/a$e$c$b;
    .locals 1

    invoke-static {}, Ll8/a$e$c;->R()Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public U()Ll8/a$e$c$b;
    .locals 1

    invoke-static {p0}, Ll8/a$e$c;->S(Ll8/a$e$c;)Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Ll8/a$e$c;->O:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Ll8/a$e$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll8/a$e$c;->F:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, Ll8/a$e$c;->E:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll8/a$e$c;->G:I

    invoke-static {v3, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, Ll8/a$e$c;->E:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Ll8/a$e$c;->I:Ll8/a$e$c$c;

    invoke-virtual {v1}, Ll8/a$e$c$c;->c()I

    move-result v1

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lp8/f;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    move v1, v2

    move v3, v1

    :goto_1
    iget-object v4, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_4

    iget-object v4, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    add-int/2addr v0, v3

    invoke-virtual {p0}, Ll8/a$e$c;->L()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    add-int/lit8 v0, v0, 0x1

    invoke-static {v3}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iput v3, p0, Ll8/a$e$c;->K:I

    move v1, v2

    :goto_2
    iget-object v3, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    iget-object v3, p0, Ll8/a$e$c;->L:Ljava/util/List;

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

    invoke-virtual {p0}, Ll8/a$e$c;->H()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1}, Lp8/f;->p(I)I

    move-result v2

    add-int/2addr v0, v2

    :cond_7
    iput v1, p0, Ll8/a$e$c;->M:I

    iget v1, p0, Ll8/a$e$c;->E:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    const/4 v1, 0x6

    invoke-virtual {p0}, Ll8/a$e$c;->J()Lp8/d;

    move-result-object v2

    invoke-static {v1, v2}, Lp8/f;->d(ILp8/d;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-object v1, p0, Ll8/a$e$c;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Ll8/a$e$c;->O:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$e$c;->T()Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    iget-byte v0, p0, Ll8/a$e$c;->N:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, Ll8/a$e$c;->N:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$e$c;->U()Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Ll8/a$e$c;->b()I

    iget v0, p0, Ll8/a$e$c;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll8/a$e$c;->F:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_0
    iget v0, p0, Ll8/a$e$c;->E:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll8/a$e$c;->G:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_1
    iget v0, p0, Ll8/a$e$c;->E:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll8/a$e$c;->I:Ll8/a$e$c$c;

    invoke-virtual {v0}, Ll8/a$e$c$c;->c()I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lp8/f;->R(II)V

    :cond_2
    invoke-virtual {p0}, Ll8/a$e$c;->L()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    const/16 v0, 0x22

    invoke-virtual {p1, v0}, Lp8/f;->n0(I)V

    iget v0, p0, Ll8/a$e$c;->K:I

    invoke-virtual {p1, v0}, Lp8/f;->n0(I)V

    :cond_3
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Ll8/a$e$c;->J:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Lp8/f;->a0(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ll8/a$e$c;->H()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/16 v1, 0x2a

    invoke-virtual {p1, v1}, Lp8/f;->n0(I)V

    iget v1, p0, Ll8/a$e$c;->M:I

    invoke-virtual {p1, v1}, Lp8/f;->n0(I)V

    :cond_5
    :goto_1
    iget-object v1, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Ll8/a$e$c;->L:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lp8/f;->a0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iget v0, p0, Ll8/a$e$c;->E:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_7

    const/4 v0, 0x6

    invoke-virtual {p0}, Ll8/a$e$c;->J()Lp8/d;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lp8/f;->N(ILp8/d;)V

    :cond_7
    iget-object v0, p0, Ll8/a$e$c;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method
