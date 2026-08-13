.class LE8/f$c;
.super LE8/f$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f;->g(Lx7/a;Lx7/l;Lx7/l;)LE8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic G:Lx7/l;

.field final synthetic H:Lx7/l;

.field final synthetic I:LE8/f;


# direct methods
.method constructor <init>(LE8/f;LE8/f;Lx7/a;Lx7/l;Lx7/l;)V
    .locals 0

    iput-object p1, p0, LE8/f$c;->I:LE8/f;

    iput-object p4, p0, LE8/f$c;->G:Lx7/l;

    iput-object p5, p0, LE8/f$c;->H:Lx7/l;

    invoke-direct {p0, p2, p3}, LE8/f$k;-><init>(LE8/f;Lx7/a;)V

    return-void
.end method

.method private static synthetic a(I)V
    .locals 6

    .prologue
    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string v1, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v0, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    const/4 v2, 0x3

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5"

    const/4 v4, 0x0

    if-eq p0, v0, :cond_2

    aput-object v3, v2, v4

    goto :goto_2

    :cond_2
    const-string v5, "value"

    aput-object v5, v2, v4

    :goto_2
    const/4 v4, 0x1

    if-eq p0, v0, :cond_3

    const-string v3, "recursionDetected"

    aput-object v3, v2, v4

    goto :goto_3

    :cond_3
    aput-object v3, v2, v4

    :goto_3
    if-eq p0, v0, :cond_4

    goto :goto_4

    :cond_4
    const-string v3, "doPostCompute"

    aput-object v3, v2, v0

    :goto_4
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0
.end method


# virtual methods
.method protected f(Z)LE8/f$o;
    .locals 1

    .prologue
    iget-object v0, p0, LE8/f$c;->G:Lx7/l;

    if-nez v0, :cond_1

    invoke-super {p0, p1}, LE8/f$h;->f(Z)LE8/f$o;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LE8/f$c;->a(I)V

    :cond_0
    return-object p1

    :cond_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LE8/f$o;->d(Ljava/lang/Object;)LE8/f$o;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 v0, 0x1

    invoke-static {v0}, LE8/f$c;->a(I)V

    :cond_2
    return-object p1
.end method

.method protected g(Ljava/lang/Object;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LE8/f$c;->a(I)V

    :cond_0
    iget-object v0, p0, LE8/f$c;->H:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
