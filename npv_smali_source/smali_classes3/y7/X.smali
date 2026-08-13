.class public final Ly7/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF7/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/X$a;
    }
.end annotation


# static fields
.field public static final H:Ly7/X$a;


# instance fields
.field private final C:Ljava/lang/Object;

.field private final D:Ljava/lang/String;

.field private final E:LF7/r;

.field private final F:Z

.field private volatile G:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly7/X$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/X$a;-><init>(Ly7/k;)V

    sput-object v0, Ly7/X;->H:Ly7/X$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variance"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/X;->C:Ljava/lang/Object;

    iput-object p2, p0, Ly7/X;->D:Ljava/lang/String;

    iput-object p3, p0, Ly7/X;->E:LF7/r;

    iput-boolean p4, p0, Ly7/X;->F:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 2

    .prologue
    const-string v0, "upperBounds"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/X;->G:Ljava/util/List;

    if-nez v0, :cond_0

    iput-object p1, p0, Ly7/X;->G:Ljava/util/List;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Upper bounds of type parameter \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' have already been initialized."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Ly7/X;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly7/X;->C:Ljava/lang/Object;

    check-cast p1, Ly7/X;

    iget-object v1, p1, Ly7/X;->C:Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly7/X;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ly7/X;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly7/X;->D:Ljava/lang/String;

    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, Ly7/X;->G:Ljava/util/List;

    if-nez v0, :cond_0

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Ly7/P;->h(Ljava/lang/Class;)LF7/o;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ly7/X;->G:Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Ly7/X;->C:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Ly7/X;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public s()LF7/r;
    .locals 1

    iget-object v0, p0, Ly7/X;->E:LF7/r;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Ly7/X;->H:Ly7/X$a;

    invoke-virtual {v0, p0}, Ly7/X$a;->a(LF7/p;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
