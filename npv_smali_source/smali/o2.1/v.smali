.class public final Lo2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;
.implements Lz2/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/v$a;
    }
.end annotation


# static fields
.field public static final K:Lo2/v$a;

.field public static final L:Ljava/util/TreeMap;


# instance fields
.field private final C:I

.field private volatile D:Ljava/lang/String;

.field public final E:[J

.field public final F:[D

.field public final G:[Ljava/lang/String;

.field public final H:[[B

.field private final I:[I

.field private J:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/v$a;-><init>(Ly7/k;)V

    sput-object v0, Lo2/v;->K:Lo2/v$a;

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    sput-object v0, Lo2/v;->L:Ljava/util/TreeMap;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo2/v;->C:I

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [I

    iput-object v0, p0, Lo2/v;->I:[I

    new-array v0, p1, [J

    iput-object v0, p0, Lo2/v;->E:[J

    new-array v0, p1, [D

    iput-object v0, p0, Lo2/v;->F:[D

    new-array v0, p1, [Ljava/lang/String;

    iput-object v0, p0, Lo2/v;->G:[Ljava/lang/String;

    new-array p1, p1, [[B

    iput-object p1, p0, Lo2/v;->H:[[B

    return-void
.end method

.method public synthetic constructor <init>(ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lo2/v;-><init>(I)V

    return-void
.end method

.method public static final g(Ljava/lang/String;I)Lo2/v;
    .locals 1

    sget-object v0, Lo2/v;->K:Lo2/v$a;

    invoke-virtual {v0, p0, p1}, Lo2/v$a;->a(Ljava/lang/String;I)Lo2/v;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C(ILjava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/v;->I:[I

    const/4 v1, 0x4

    aput v1, v0, p1

    iget-object v0, p0, Lo2/v;->G:[Ljava/lang/String;

    aput-object p2, v0, p1

    return-void
.end method

.method public M0(I)V
    .locals 2

    iget-object v0, p0, Lo2/v;->I:[I

    const/4 v1, 0x1

    aput v1, v0, p1

    return-void
.end method

.method public P(ID)V
    .locals 2

    iget-object v0, p0, Lo2/v;->I:[I

    const/4 v1, 0x3

    aput v1, v0, p1

    iget-object v0, p0, Lo2/v;->F:[D

    aput-wide p2, v0, p1

    return-void
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lo2/v;->D:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public f(Lz2/f;)V
    .locals 6

    .prologue
    const-string v0, "statement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/v;->i()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_7

    move v2, v1

    :goto_0
    iget-object v3, p0, Lo2/v;->I:[I

    aget v3, v3, v2

    if-eq v3, v1, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_5

    const/4 v4, 0x3

    if-eq v3, v4, :cond_4

    const/4 v4, 0x4

    const-string v5, "Required value was null."

    if-eq v3, v4, :cond_2

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lo2/v;->H:[[B

    aget-object v3, v3, v2

    if-eqz v3, :cond_1

    invoke-interface {p1, v2, v3}, Lz2/f;->p0(I[B)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v3, p0, Lo2/v;->G:[Ljava/lang/String;

    aget-object v3, v3, v2

    if-eqz v3, :cond_3

    invoke-interface {p1, v2, v3}, Lz2/f;->C(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object v3, p0, Lo2/v;->F:[D

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lz2/f;->P(ID)V

    goto :goto_1

    :cond_5
    iget-object v3, p0, Lo2/v;->E:[J

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lz2/f;->l(IJ)V

    goto :goto_1

    :cond_6
    invoke-interface {p1, v2}, Lz2/f;->M0(I)V

    :goto_1
    if-eq v2, v0, :cond_7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lo2/v;->J:I

    return v0
.end method

.method public l(IJ)V
    .locals 2

    iget-object v0, p0, Lo2/v;->I:[I

    const/4 v1, 0x2

    aput v1, v0, p1

    iget-object v0, p0, Lo2/v;->E:[J

    aput-wide p2, v0, p1

    return-void
.end method

.method public final o(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo2/v;->D:Ljava/lang/String;

    iput p2, p0, Lo2/v;->J:I

    return-void
.end method

.method public p0(I[B)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/v;->I:[I

    const/4 v1, 0x5

    aput v1, v0, p1

    iget-object v0, p0, Lo2/v;->H:[[B

    aput-object p2, v0, p1

    return-void
.end method

.method public final r()V
    .locals 2

    .prologue
    sget-object v0, Lo2/v;->L:Ljava/util/TreeMap;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lo2/v;->C:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lo2/v;->K:Lo2/v$a;

    invoke-virtual {v1}, Lo2/v$a;->b()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
