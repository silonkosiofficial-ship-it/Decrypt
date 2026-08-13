.class public final Lh2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/s$a;,
        Lh2/s$b;
    }
.end annotation


# static fields
.field public static final f:Lh2/s$a;

.field private static final g:Lh2/s;


# instance fields
.field private final a:Lh2/r;

.field private final b:Lh2/r;

.field private final c:Lh2/r;

.field private final d:Z

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh2/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/s$a;-><init>(Ly7/k;)V

    sput-object v0, Lh2/s;->f:Lh2/s$a;

    new-instance v0, Lh2/s;

    sget-object v1, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v1}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v2

    invoke-virtual {v1}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v3

    invoke-virtual {v1}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lh2/s;-><init>(Lh2/r;Lh2/r;Lh2/r;)V

    sput-object v0, Lh2/s;->g:Lh2/s;

    return-void
.end method

.method public constructor <init>(Lh2/r;Lh2/r;Lh2/r;)V
    .locals 3

    .prologue
    const-string v0, "refresh"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prepend"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "append"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/s;->a:Lh2/r;

    iput-object p2, p0, Lh2/s;->b:Lh2/r;

    iput-object p3, p0, Lh2/s;->c:Lh2/r;

    instance-of v0, p1, Lh2/r$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    instance-of v0, p3, Lh2/r$a;

    if-nez v0, :cond_1

    instance-of v0, p2, Lh2/r$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lh2/s;->d:Z

    instance-of p1, p1, Lh2/r$c;

    if-eqz p1, :cond_2

    instance-of p1, p3, Lh2/r$c;

    if-eqz p1, :cond_2

    instance-of p1, p2, Lh2/r$c;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    iput-boolean v1, p0, Lh2/s;->e:Z

    return-void
.end method

.method public static final synthetic a()Lh2/s;
    .locals 1

    sget-object v0, Lh2/s;->g:Lh2/s;

    return-object v0
.end method

.method public static synthetic c(Lh2/s;Lh2/r;Lh2/r;Lh2/r;ILjava/lang/Object;)Lh2/s;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lh2/s;->a:Lh2/r;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lh2/s;->b:Lh2/r;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lh2/s;->c:Lh2/r;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lh2/s;->b(Lh2/r;Lh2/r;Lh2/r;)Lh2/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lh2/r;Lh2/r;Lh2/r;)Lh2/s;
    .locals 1

    const-string v0, "refresh"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prepend"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "append"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/s;

    invoke-direct {v0, p1, p2, p3}, Lh2/s;-><init>(Lh2/r;Lh2/r;Lh2/r;)V

    return-object v0
.end method

.method public final d()Lh2/r;
    .locals 1

    iget-object v0, p0, Lh2/s;->c:Lh2/r;

    return-object v0
.end method

.method public final e()Lh2/r;
    .locals 1

    iget-object v0, p0, Lh2/s;->b:Lh2/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh2/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh2/s;

    iget-object v1, p0, Lh2/s;->a:Lh2/r;

    iget-object v3, p1, Lh2/s;->a:Lh2/r;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh2/s;->b:Lh2/r;

    iget-object v3, p1, Lh2/s;->b:Lh2/r;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh2/s;->c:Lh2/r;

    iget-object p1, p1, Lh2/s;->c:Lh2/r;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lh2/r;
    .locals 1

    iget-object v0, p0, Lh2/s;->a:Lh2/r;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lh2/s;->d:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lh2/s;->e:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lh2/s;->a:Lh2/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/s;->b:Lh2/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/s;->c:Lh2/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i(Lh2/t;Lh2/r;)Lh2/s;
    .locals 7

    .prologue
    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newState"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/s$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lh2/s;->c(Lh2/s;Lh2/r;Lh2/r;Lh2/r;ILjava/lang/Object;)Lh2/s;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p2

    :goto_0
    invoke-static/range {v0 .. v5}, Lh2/s;->c(Lh2/s;Lh2/r;Lh2/r;Lh2/r;ILjava/lang/Object;)Lh2/s;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p2

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoadStates(refresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/s;->a:Lh2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prepend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/s;->b:Lh2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", append="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/s;->c:Lh2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
