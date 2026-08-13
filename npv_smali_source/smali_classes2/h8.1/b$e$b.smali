.class Lh8/b$e$b;
.super Lh8/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh8/b$e;->i()Lg8/t$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lh8/b$e;


# direct methods
.method constructor <init>(Lh8/b$e;)V
    .locals 0

    iput-object p1, p0, Lh8/b$e$b;->b:Lh8/b$e;

    invoke-direct {p0}, Lh8/b$b;-><init>()V

    return-void
.end method

.method private static synthetic f(I)V
    .locals 2

    const/4 p0, 0x3

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "data"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "visitEnd"

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
.method protected g([Ljava/lang/String;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lh8/b$e$b;->f(I)V

    :cond_0
    iget-object v0, p0, Lh8/b$e$b;->b:Lh8/b$e;

    iget-object v0, v0, Lh8/b$e;->a:Lh8/b;

    invoke-static {v0, p1}, Lh8/b;->l(Lh8/b;[Ljava/lang/String;)[Ljava/lang/String;

    return-void
.end method
