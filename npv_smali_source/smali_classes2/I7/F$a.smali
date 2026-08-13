.class public LI7/F$a;
.super LI7/F$b;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final D:Lx7/a;

.field private volatile E:Ljava/lang/ref/SoftReference;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx7/a;)V
    .locals 1

    .prologue
    if-nez p2, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LI7/F$a;->g(I)V

    :cond_0
    invoke-direct {p0}, LI7/F$b;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LI7/F$a;->E:Ljava/lang/ref/SoftReference;

    iput-object p2, p0, LI7/F$a;->D:Lx7/a;

    if-eqz p1, :cond_1

    new-instance p2, Ljava/lang/ref/SoftReference;

    invoke-virtual {p0, p1}, LI7/F$b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LI7/F$a;->E:Ljava/lang/ref/SoftReference;

    :cond_1
    return-void
.end method

.method private static synthetic g(I)V
    .locals 2

    const/4 p0, 0x3

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "initializer"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "<init>"

    const/4 v1, 0x2

    aput-object v0, p0, v1

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, LI7/F$a;->E:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LI7/F$b;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LI7/F$a;->D:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-virtual {p0, v0}, LI7/F$b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, LI7/F$a;->E:Ljava/lang/ref/SoftReference;

    return-object v0
.end method
