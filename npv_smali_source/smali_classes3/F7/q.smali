.class public final LF7/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/q$a;,
        LF7/q$b;
    }
.end annotation


# static fields
.field public static final c:LF7/q$a;

.field public static final d:LF7/q;


# instance fields
.field private final a:LF7/r;

.field private final b:LF7/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF7/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF7/q$a;-><init>(Ly7/k;)V

    sput-object v0, LF7/q;->c:LF7/q$a;

    new-instance v0, LF7/q;

    invoke-direct {v0, v1, v1}, LF7/q;-><init>(LF7/r;LF7/o;)V

    sput-object v0, LF7/q;->d:LF7/q;

    return-void
.end method

.method public constructor <init>(LF7/r;LF7/o;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/q;->a:LF7/r;

    iput-object p2, p0, LF7/q;->b:LF7/o;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-nez p2, :cond_1

    move v0, v1

    :cond_1
    if-ne v2, v0, :cond_2

    return-void

    :cond_2
    if-nez p1, :cond_3

    const-string p1, "Star projection must have no type specified."

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The projection variance "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " requires type to be specified."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a()LF7/r;
    .locals 1

    iget-object v0, p0, LF7/q;->a:LF7/r;

    return-object v0
.end method

.method public final b()LF7/o;
    .locals 1

    iget-object v0, p0, LF7/q;->b:LF7/o;

    return-object v0
.end method

.method public final c()LF7/o;
    .locals 1

    iget-object v0, p0, LF7/q;->b:LF7/o;

    return-object v0
.end method

.method public final d()LF7/r;
    .locals 1

    iget-object v0, p0, LF7/q;->a:LF7/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LF7/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LF7/q;

    iget-object v1, p0, LF7/q;->a:LF7/r;

    iget-object v3, p1, LF7/q;->a:LF7/r;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LF7/q;->b:LF7/o;

    iget-object p1, p1, LF7/q;->b:LF7/o;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, LF7/q;->a:LF7/r;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LF7/q;->b:LF7/o;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    iget-object v0, p0, LF7/q;->a:LF7/r;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    sget-object v2, LF7/q$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    if-eq v0, v1, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "out "

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF7/q;->b:LF7/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_1
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "in "

    goto :goto_1

    :cond_3
    iget-object v0, p0, LF7/q;->b:LF7/o;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v0, "*"

    :goto_2
    return-object v0
.end method
