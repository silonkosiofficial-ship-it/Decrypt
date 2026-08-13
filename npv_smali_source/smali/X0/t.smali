.class public final LX0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/t$a;,
        LX0/t$b;
    }
.end annotation


# static fields
.field public static final c:LX0/t$a;

.field private static final d:LX0/t;

.field private static final e:LX0/t;


# instance fields
.field private final a:I

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LX0/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX0/t$a;-><init>(Ly7/k;)V

    sput-object v0, LX0/t;->c:LX0/t$a;

    new-instance v0, LX0/t;

    sget-object v2, LX0/t$b;->a:LX0/t$b$a;

    invoke-virtual {v2}, LX0/t$b$a;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1}, LX0/t;-><init>(IZLy7/k;)V

    sput-object v0, LX0/t;->d:LX0/t;

    new-instance v0, LX0/t;

    invoke-virtual {v2}, LX0/t$b$a;->b()I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LX0/t;-><init>(IZLy7/k;)V

    sput-object v0, LX0/t;->e:LX0/t;

    return-void
.end method

.method private constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LX0/t;->a:I

    iput-boolean p2, p0, LX0/t;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(IZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LX0/t;-><init>(IZ)V

    return-void
.end method

.method public static final synthetic a()LX0/t;
    .locals 1

    sget-object v0, LX0/t;->d:LX0/t;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LX0/t;->a:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LX0/t;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LX0/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LX0/t;->a:I

    check-cast p1, LX0/t;

    iget v3, p1, LX0/t;->a:I

    invoke-static {v1, v3}, LX0/t$b;->e(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, LX0/t;->b:Z

    iget-boolean p1, p1, LX0/t;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LX0/t;->a:I

    invoke-static {v0}, LX0/t$b;->f(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LX0/t;->b:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    sget-object v0, LX0/t;->d:LX0/t;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TextMotion.Static"

    goto :goto_0

    :cond_0
    sget-object v0, LX0/t;->e:LX0/t;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TextMotion.Animated"

    goto :goto_0

    :cond_1
    const-string v0, "Invalid"

    :goto_0
    return-object v0
.end method
