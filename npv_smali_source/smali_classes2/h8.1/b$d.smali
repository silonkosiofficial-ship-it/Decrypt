.class Lh8/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lh8/b;


# direct methods
.method private constructor <init>(Lh8/b;)V
    .locals 0

    iput-object p1, p0, Lh8/b$d;->a:Lh8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lh8/b;Lh8/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lh8/b$d;-><init>(Lh8/b;)V

    return-void
.end method

.method private static synthetic g(I)V
    .locals 6

    .prologue
    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq p0, v2, :cond_2

    if-eq p0, v4, :cond_1

    if-eq p0, v0, :cond_0

    const-string v5, "classLiteralValue"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_0
    const-string v5, "classId"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_1
    const-string v5, "enumEntryName"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_2
    const-string v5, "enumClassId"

    aput-object v5, v1, v3

    :goto_0
    const-string v3, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor"

    aput-object v3, v1, v2

    if-eq p0, v2, :cond_4

    if-eq p0, v4, :cond_4

    if-eq p0, v0, :cond_3

    const-string p0, "visitClassLiteral"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_3
    const-string p0, "visitAnnotation"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_4
    const-string p0, "visitEnum"

    aput-object p0, v1, v4

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h()Lg8/t$b;
    .locals 1

    new-instance v0, Lh8/b$d$a;

    invoke-direct {v0, p0}, Lh8/b$d$a;-><init>(Lh8/b$d;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Ln8/f;Ln8/b;)Lg8/t$a;
    .locals 0

    .prologue
    if-nez p2, :cond_0

    const/4 p1, 0x3

    invoke-static {p1}, Lh8/b$d;->g(I)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Ln8/f;Lt8/f;)V
    .locals 0

    .prologue
    if-nez p2, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lh8/b$d;->g(I)V

    :cond_0
    return-void
.end method

.method public d(Ln8/f;)Lg8/t$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const-string v1, "b"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lh8/b$d;->h()Lg8/t$b;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public e(Ln8/f;Ln8/b;Ln8/f;)V
    .locals 0

    .prologue
    if-nez p2, :cond_0

    const/4 p1, 0x1

    invoke-static {p1}, Lh8/b$d;->g(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 p1, 0x2

    invoke-static {p1}, Lh8/b$d;->g(I)V

    :cond_1
    return-void
.end method

.method public f(Ln8/f;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
