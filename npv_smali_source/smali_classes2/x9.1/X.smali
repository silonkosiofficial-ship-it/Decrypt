.class public final Lx9/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/f;


# static fields
.field public static final a:Lx9/X;

.field private static final b:Lv9/m;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/X;

    invoke-direct {v0}, Lx9/X;-><init>()V

    sput-object v0, Lx9/X;->a:Lx9/X;

    sget-object v0, Lv9/n$d;->a:Lv9/n$d;

    sput-object v0, Lx9/X;->b:Lv9/m;

    const-string v0, "kotlin.Nothing"

    sput-object v0, Lx9/X;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Descriptor for type `kotlin.Nothing` does not have elements"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lx9/X;->c:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic c()Z
    .locals 1

    invoke-static {p0}, Lv9/e;->c(Lv9/f;)Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lx9/X;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lx9/X;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public g(I)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lx9/X;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public h(I)Lv9/f;
    .locals 0

    invoke-direct {p0}, Lx9/X;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lx9/X;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Lx9/X;->j()Lv9/m;

    move-result-object v1

    invoke-virtual {v1}, Lv9/m;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public i(I)Z
    .locals 0

    invoke-direct {p0}, Lx9/X;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public j()Lv9/m;
    .locals 1

    sget-object v0, Lx9/X;->b:Lv9/m;

    return-object v0
.end method

.method public synthetic k()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lv9/e;->a(Lv9/f;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic m()Z
    .locals 1

    invoke-static {p0}, Lv9/e;->b(Lv9/f;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NothingSerialDescriptor"

    return-object v0
.end method
