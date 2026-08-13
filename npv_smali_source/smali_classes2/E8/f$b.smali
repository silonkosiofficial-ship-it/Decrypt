.class LE8/f$b;
.super LE8/f$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f;->e(Lx7/a;Ljava/lang/Object;)LE8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic F:Ljava/lang/Object;

.field final synthetic G:LE8/f;


# direct methods
.method constructor <init>(LE8/f;LE8/f;Lx7/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LE8/f$b;->G:LE8/f;

    iput-object p4, p0, LE8/f$b;->F:Ljava/lang/Object;

    invoke-direct {p0, p2, p3}, LE8/f$j;-><init>(LE8/f;Lx7/a;)V

    return-void
.end method

.method private static synthetic a(I)V
    .locals 2

    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "recursionDetected"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "@NotNull method %s.%s must not return null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected f(Z)LE8/f$o;
    .locals 1

    .prologue
    iget-object p1, p0, LE8/f$b;->F:Ljava/lang/Object;

    invoke-static {p1}, LE8/f$o;->d(Ljava/lang/Object;)LE8/f$o;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LE8/f$b;->a(I)V

    :cond_0
    return-object p1
.end method
