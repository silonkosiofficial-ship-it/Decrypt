.class public final Ll8/a$e;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/a$e$b;,
        Ll8/a$e$c;
    }
.end annotation


# static fields
.field private static final J:Ll8/a$e;

.field public static K:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:Ljava/util/List;

.field private F:Ljava/util/List;

.field private G:I

.field private H:B

.field private I:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll8/a$e$a;

    invoke-direct {v0}, Ll8/a$e$a;-><init>()V

    sput-object v0, Ll8/a$e;->K:Lp8/r;

    new-instance v0, Ll8/a$e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll8/a$e;-><init>(Z)V

    sput-object v0, Ll8/a$e;->J:Ll8/a$e;

    invoke-direct {v0}, Ll8/a$e;->z()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ll8/a$e;->G:I

    iput-byte v0, p0, Ll8/a$e;->H:B

    iput v0, p0, Ll8/a$e;->I:I

    invoke-direct {p0}, Ll8/a$e;->z()V

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

    if-nez v3, :cond_b

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0xa

    if-eq v6, v7, :cond_7

    const/16 v7, 0x28

    if-eq v6, v7, :cond_5

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_2

    invoke-virtual {p0, p1, v2, p2, v6}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

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

    goto :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p1}, Lp8/e;->z()I

    move-result v6

    invoke-virtual {p1, v6}, Lp8/e;->i(I)I

    move-result v6

    and-int/lit8 v7, v4, 0x2

    if-eq v7, v5, :cond_3

    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v7

    if-lez v7, :cond_3

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Ll8/a$e;->F:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lp8/e;->e()I

    move-result v7

    if-lez v7, :cond_4

    iget-object v7, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v6}, Lp8/e;->h(I)V

    goto :goto_0

    :cond_5
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_6

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Ll8/a$e;->F:Ljava/util/List;

    or-int/lit8 v4, v4, 0x2

    :cond_6
    iget-object v6, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_2
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    and-int/lit8 v6, v4, 0x1

    if-eq v6, v1, :cond_8

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Ll8/a$e;->E:Ljava/util/List;

    or-int/lit8 v4, v4, 0x1

    :cond_8
    iget-object v6, p0, Ll8/a$e;->E:Ljava/util/List;

    sget-object v7, Ll8/a$e$c;->Q:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

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
    and-int/lit8 p2, v4, 0x1

    if-ne p2, v1, :cond_9

    iget-object p2, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e;->E:Ljava/util/List;

    :cond_9
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_a

    iget-object p2, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e;->F:Ljava/util/List;

    :cond_a
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e;->D:Lp8/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e;->D:Lp8/d;

    throw p1

    :goto_6
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_b
    and-int/lit8 p1, v4, 0x1

    if-ne p1, v1, :cond_c

    iget-object p1, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e;->E:Ljava/util/List;

    :cond_c
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_d

    iget-object p1, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e;->F:Ljava/util/List;

    :cond_d
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e;->D:Lp8/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Ll8/a$e;->D:Lp8/d;

    throw p1

    :goto_7
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll8/a$e;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput v0, p0, Ll8/a$e;->G:I

    iput-byte v0, p0, Ll8/a$e;->H:B

    iput v0, p0, Ll8/a$e;->I:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Ll8/a$e;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Ll8/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll8/a$e;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Ll8/a$e;->G:I

    iput-byte p1, p0, Ll8/a$e;->H:B

    iput p1, p0, Ll8/a$e;->I:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Ll8/a$e;->D:Lp8/d;

    return-void
.end method

.method public static A()Ll8/a$e$b;
    .locals 1

    invoke-static {}, Ll8/a$e$b;->n()Ll8/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public static B(Ll8/a$e;)Ll8/a$e$b;
    .locals 1

    invoke-static {}, Ll8/a$e;->A()Ll8/a$e$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll8/a$e$b;->x(Ll8/a$e;)Ll8/a$e$b;

    move-result-object p0

    return-object p0
.end method

.method public static D(Ljava/io/InputStream;Lp8/g;)Ll8/a$e;
    .locals 1

    sget-object v0, Ll8/a$e;->K:Lp8/r;

    invoke-interface {v0, p0, p1}, Lp8/r;->b(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll8/a$e;

    return-object p0
.end method

.method static synthetic r(Ll8/a$e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ll8/a$e;->E:Ljava/util/List;

    return-object p0
.end method

.method static synthetic s(Ll8/a$e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ll8/a$e;->E:Ljava/util/List;

    return-object p1
.end method

.method static synthetic t(Ll8/a$e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ll8/a$e;->F:Ljava/util/List;

    return-object p0
.end method

.method static synthetic u(Ll8/a$e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Ll8/a$e;->F:Ljava/util/List;

    return-object p1
.end method

.method static synthetic v(Ll8/a$e;)Lp8/d;
    .locals 0

    iget-object p0, p0, Ll8/a$e;->D:Lp8/d;

    return-object p0
.end method

.method public static w()Ll8/a$e;
    .locals 1

    sget-object v0, Ll8/a$e;->J:Ll8/a$e;

    return-object v0
.end method

.method private z()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e;->F:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public C()Ll8/a$e$b;
    .locals 1

    invoke-static {}, Ll8/a$e;->A()Ll8/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public E()Ll8/a$e$b;
    .locals 1

    invoke-static {p0}, Ll8/a$e;->B(Ll8/a$e;)Ll8/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 5

    .prologue
    iget v0, p0, Ll8/a$e;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    const/4 v4, 0x1

    invoke-static {v4, v3}, Lp8/f;->r(ILp8/p;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    iget-object v3, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lp8/f;->p(I)I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v2, v1

    invoke-virtual {p0}, Ll8/a$e;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1}, Lp8/f;->p(I)I

    move-result v0

    add-int/2addr v2, v0

    :cond_3
    iput v1, p0, Ll8/a$e;->G:I

    iget-object v0, p0, Ll8/a$e;->D:Lp8/d;

    invoke-virtual {v0}, Lp8/d;->size()I

    move-result v0

    add-int/2addr v2, v0

    iput v2, p0, Ll8/a$e;->I:I

    return v2
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$e;->C()Ll8/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    iget-byte v0, p0, Ll8/a$e;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, Ll8/a$e;->H:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Ll8/a$e;->E()Ll8/a$e$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Ll8/a$e;->b()I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Ll8/a$e;->E:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/p;

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll8/a$e;->x()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/16 v1, 0x2a

    invoke-virtual {p1, v1}, Lp8/f;->n0(I)V

    iget v1, p0, Ll8/a$e;->G:I

    invoke-virtual {p1, v1}, Lp8/f;->n0(I)V

    :cond_1
    :goto_1
    iget-object v1, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Ll8/a$e;->F:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lp8/f;->a0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll8/a$e;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll8/a$e;->F:Ljava/util/List;

    return-object v0
.end method

.method public y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll8/a$e;->E:Ljava/util/List;

    return-object v0
.end method
