.class public abstract Lb1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/i$a;,
        Lb1/i$b;,
        Lb1/i$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Li1/f;

.field private c:I

.field private final d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Li1/f;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb1/i;->a:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li1/f;->n0()Li1/f;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Li1/f;

    const/4 v0, 0x0

    new-array v0, v0, [C

    invoke-direct {p1, v0}, Li1/f;-><init>([C)V

    :cond_1
    iput-object p1, p0, Lb1/i;->b:Li1/f;

    const/16 p1, 0x3e8

    iput p1, p0, Lb1/i;->d:I

    iput p1, p0, Lb1/i;->e:I

    return-void
.end method


# virtual methods
.method public final a(Lb1/z;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/b;->a:Lj1/b$a;

    iget-object v1, p0, Lb1/i;->b:Li1/f;

    new-instance v2, Lj1/b$d;

    invoke-direct {v2}, Lj1/b$d;-><init>()V

    invoke-virtual {v0, v1, p1, v2}, Lj1/b$a;->v(Li1/f;Lj1/g;Lj1/b$d;)V

    return-void
.end method

.method public final b(Lb1/w;)Li1/f;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb1/w;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lb1/i;->b:Li1/f;

    invoke-virtual {v0, p1}, Li1/b;->b0(Ljava/lang/String;)Li1/f;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb1/i;->b:Li1/f;

    new-instance v1, Li1/f;

    const/4 v2, 0x0

    new-array v2, v2, [C

    invoke-direct {v1, v2}, Li1/f;-><init>([C)V

    invoke-virtual {v0, p1, v1}, Li1/b;->k0(Ljava/lang/String;Li1/c;)V

    :cond_0
    iget-object v0, p0, Lb1/i;->b:Li1/f;

    invoke-virtual {v0, p1}, Li1/b;->a0(Ljava/lang/String;)Li1/f;

    move-result-object p1

    return-object p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lb1/i;->c:I

    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lb1/i;->b:Li1/f;

    invoke-virtual {v0}, Li1/b;->clear()V

    iget v0, p0, Lb1/i;->d:I

    iput v0, p0, Lb1/i;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lb1/i;->c:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lb1/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb1/i;->b:Li1/f;

    check-cast p1, Lb1/i;

    iget-object p1, p1, Lb1/i;->b:Li1/f;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb1/i;->b:Li1/f;

    invoke-virtual {v0}, Li1/b;->hashCode()I

    move-result v0

    return v0
.end method
