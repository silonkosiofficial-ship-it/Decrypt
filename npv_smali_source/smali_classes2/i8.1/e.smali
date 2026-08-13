.class public final Li8/e;
.super Lp8/i;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/e$b;
    }
.end annotation


# static fields
.field private static final H:Li8/e;

.field public static I:Lp8/r;


# instance fields
.field private final D:Lp8/d;

.field private E:Ljava/util/List;

.field private F:B

.field private G:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/e$a;

    invoke-direct {v0}, Li8/e$a;-><init>()V

    sput-object v0, Li8/e;->I:Lp8/r;

    new-instance v0, Li8/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/e;-><init>(Z)V

    sput-object v0, Li8/e;->H:Li8/e;

    invoke-direct {v0}, Li8/e;->x()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 7

    .prologue
    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/e;->F:B

    iput v0, p0, Li8/e;->G:I

    invoke-direct {p0}, Li8/e;->x()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    if-nez v3, :cond_5

    :try_start_0
    invoke-virtual {p1}, Lp8/e;->J()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0xa

    if-eq v5, v6, :cond_2

    invoke-virtual {p0, p1, v2, p2, v5}, Lp8/i;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

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
    if-eq v4, v1, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Li8/e;->E:Ljava/util/List;

    move v4, v1

    :cond_3
    iget-object v5, p0, Li8/e;->E:Ljava/util/List;

    sget-object v6, Li8/f;->M:Lp8/r;

    invoke-virtual {p1, v6, p2}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
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
    if-ne v4, v1, :cond_4

    iget-object p2, p0, Li8/e;->E:Ljava/util/List;

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Li8/e;->E:Ljava/util/List;

    :cond_4
    :try_start_2
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/e;->D:Lp8/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/e;->D:Lp8/d;

    throw p1

    :goto_4
    invoke-virtual {p0}, Lp8/i;->m()V

    throw p1

    :cond_5
    if-ne v4, v1, :cond_6

    iget-object p1, p0, Li8/e;->E:Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li8/e;->E:Ljava/util/List;

    :cond_6
    :try_start_3
    invoke-virtual {v2}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/e;->D:Lp8/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lp8/d$b;->o()Lp8/d;

    move-result-object p2

    iput-object p2, p0, Li8/e;->D:Lp8/d;

    throw p1

    :goto_5
    invoke-virtual {p0}, Lp8/i;->m()V

    return-void
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/e;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$b;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i;-><init>(Lp8/i$b;)V

    const/4 v0, -0x1

    iput-byte v0, p0, Li8/e;->F:B

    iput v0, p0, Li8/e;->G:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/e;->D:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$b;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/e;-><init>(Lp8/i$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i;-><init>()V

    const/4 p1, -0x1

    iput-byte p1, p0, Li8/e;->F:B

    iput p1, p0, Li8/e;->G:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/e;->D:Lp8/d;

    return-void
.end method

.method static synthetic r(Li8/e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/e;->E:Ljava/util/List;

    return-object p0
.end method

.method static synthetic s(Li8/e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/e;->E:Ljava/util/List;

    return-object p1
.end method

.method static synthetic t(Li8/e;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/e;->D:Lp8/d;

    return-object p0
.end method

.method public static u()Li8/e;
    .locals 1

    sget-object v0, Li8/e;->H:Li8/e;

    return-object v0
.end method

.method private x()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/e;->E:Ljava/util/List;

    return-void
.end method

.method public static y()Li8/e$b;
    .locals 1

    invoke-static {}, Li8/e$b;->n()Li8/e$b;

    move-result-object v0

    return-object v0
.end method

.method public static z(Li8/e;)Li8/e$b;
    .locals 1

    invoke-static {}, Li8/e;->y()Li8/e$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/e$b;->w(Li8/e;)Li8/e$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A()Li8/e$b;
    .locals 1

    invoke-static {}, Li8/e;->y()Li8/e$b;

    move-result-object v0

    return-object v0
.end method

.method public B()Li8/e$b;
    .locals 1

    invoke-static {p0}, Li8/e;->z(Li8/e;)Li8/e$b;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 4

    .prologue
    iget v0, p0, Li8/e;->G:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Li8/e;->E:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Li8/e;->E:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/p;

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lp8/f;->r(ILp8/p;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li8/e;->D:Lp8/d;

    invoke-virtual {v0}, Lp8/d;->size()I

    move-result v0

    add-int/2addr v1, v0

    iput v1, p0, Li8/e;->G:I

    return v1
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/e;->A()Li8/e$b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/e;->F:B

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
    invoke-virtual {p0}, Li8/e;->w()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {p0, v0}, Li8/e;->v(I)Li8/f;

    move-result-object v3

    invoke-virtual {v3}, Li8/f;->d()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Li8/e;->F:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iput-byte v1, p0, Li8/e;->F:B

    return v1
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/e;->B()Li8/e$b;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp8/f;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Li8/e;->b()I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Li8/e;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Li8/e;->E:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li8/e;->D:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public v(I)Li8/f;
    .locals 1

    iget-object v0, p0, Li8/e;->E:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/f;

    return-object p1
.end method

.method public w()I
    .locals 1

    iget-object v0, p0, Li8/e;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
