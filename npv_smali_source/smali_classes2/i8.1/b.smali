.class public final Li8/b;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/b$c;,
        Li8/b$b;
    }
.end annotation


# static fields
.field private static final J:Li8/b;

.field public static K:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:I

.field private F:I

.field private G:Ljava/util/List;

.field private H:B

.field private I:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/b$a;

    invoke-direct {v0}, Li8/b$a;-><init>()V

    sput-object v0, Li8/b;->K:Lp8/r;

    new-instance v0, Li8/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/b;-><init>(Z)V

    sput-object v0, Li8/b;->J:Li8/b;

    invoke-direct {v0}, Li8/b;->C()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 8

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/b;->H:B

    iput v0, p0, Li8/b;->I:I

    invoke-direct {p0}, Li8/b;->C()V

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

    if-nez v3, :cond_6

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_4

    const/16 v7, 0x12

    if-eq v6, v7, :cond_2

    invoke-virtual {p0, p1, v2, p2, v6}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_2
    and-int/lit8 v6, v4, 0x2

    if-eq v6, v5, :cond_3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Li8/b;->G:Ljava/util/List;

    move v4, v5

    :cond_3
    iget-object v6, p0, Li8/b;->G:Ljava/util/List;

    sget-object v7, Li8/b$b;->K:Lp8/r;

    invoke-virtual {p1, v7, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget v6, p0, Li8/b;->E:I

    or-int/2addr v6, v1

    iput v6, p0, Li8/b;->E:I

    invoke-virtual {p1}, Lp8/e;->r()I

    move-result v6

    iput v6, p0, Li8/b;->F:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    :try_start_1
    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :goto_2
    invoke-virtual {p1, p0}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x2

    if-ne p2, v5, :cond_5

    iget-object p2, p0, Li8/b;->G:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/b;->G:Ljava/util/List;

    :cond_5
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b;->D:Lp8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b;->D:Lp8/d;

    throw p1

    :goto_4
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_6
    and-int/lit8 p1, v4, 0x2

    if-ne p1, v5, :cond_7

    iget-object p1, p0, Li8/b;->G:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/b;->G:Ljava/util/List;

    :cond_7
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/b;->D:Lp8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/b;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/b;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/b;->H:B

    iput v0, p0, Li8/b;->I:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/b;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/b;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/b;->H:B

    iput p1, p0, Li8/b;->I:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/b;->D:Lp8/d;

    return-void
.end method

.method private C()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/b;->F:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/b;->G:Ljava/util/List;

    return-void
.end method

.method public static D()Li8/b$c;
    .locals 1

    invoke-static {}, Li8/b$c;->n()Li8/b$c;

    move-result-object v0

    return-object v0
.end method

.method public static E(Li8/b;)Li8/b$c;
    .locals 1

    invoke-static {}, Li8/b;->D()Li8/b$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/b$c;->w(Li8/b;)Li8/b$c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Li8/b;I)I
    .locals 0

    iput p1, p0, Li8/b;->F:I

    return p1
.end method

.method static synthetic s(Li8/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/b;->G:Ljava/util/List;

    return-object p0
.end method

.method static synthetic t(Li8/b;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/b;->G:Ljava/util/List;

    return-object p1
.end method

.method static synthetic u(Li8/b;I)I
    .locals 0

    iput p1, p0, Li8/b;->E:I

    return p1
.end method

.method static synthetic v(Li8/b;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/b;->D:Lp8/d;

    return-object p0
.end method

.method public static z()Li8/b;
    .locals 1

    sget-object v0, Li8/b;->J:Li8/b;

    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Li8/b;->F:I

    return v0
.end method

.method public B()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public F()Li8/b$c;
    .locals 1

    invoke-static {}, Li8/b;->D()Li8/b$c;

    move-result-object v0

    return-object v0
.end method

.method public G()Li8/b$c;
    .locals 1

    invoke-static {p0}, Li8/b;->E(Li8/b;)Li8/b$c;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 4

    .prologue
    iget v0, p0, Li8/b;->I:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/b;->F:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-object v1, p0, Li8/b;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    iget-object v1, p0, Li8/b;->G:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/4 v3, 0x2

    invoke-static {v3, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Li8/b;->D:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/b;->I:I

    return v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/b;->F()Li8/b$c;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/b;->H:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/b;->B()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/b;->H:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/b;->x()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, Li8/b;->w(I)Li8/b$b;

    move-result-object v3

    invoke-virtual {v3}, Li8/b$b;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Li8/b;->H:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iput-byte v1, p0, Li8/b;->H:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/b;->G()Li8/b$c;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Li8/b;->b()I

    iget v0, p0, Li8/b;->E:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Li8/b;->F:I

    invoke-virtual {p1, v1, v0}, Lp8/f;->Z(II)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Li8/b;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Li8/b;->G:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li8/b;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public w(I)Li8/b$b;
    .locals 1

    iget-object v0, p0, Li8/b;->G:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/b$b;

    return-object p1
.end method

.method public x()I
    .locals 1

    iget-object v0, p0, Li8/b;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/b;->G:Ljava/util/List;

    return-object v0
.end method
