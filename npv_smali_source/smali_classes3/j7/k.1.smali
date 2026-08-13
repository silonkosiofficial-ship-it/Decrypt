.class public abstract Lj7/k;
.super Lj7/b;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj7/k$a;
    }
.end annotation


# static fields
.field public static final C:Lj7/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj7/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj7/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lj7/k;->C:Lj7/k$a;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj7/b;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v0, Lj7/k;->C:Lj7/k$a;

    check-cast p1, Ljava/util/Set;

    invoke-virtual {v0, p0, p1}, Lj7/k$a;->a(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    sget-object v0, Lj7/k;->C:Lj7/k$a;

    invoke-virtual {v0, p0}, Lj7/k$a;->b(Ljava/util/Collection;)I

    move-result v0

    return v0
.end method
