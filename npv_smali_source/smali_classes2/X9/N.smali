.class public final LX9/N;
.super Lj7/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/N$a;
    }
.end annotation


# static fields
.field public static final F:LX9/N$a;


# instance fields
.field private final D:[LX9/g;

.field private final E:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX9/N$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX9/N$a;-><init>(Ly7/k;)V

    sput-object v0, LX9/N;->F:LX9/N$a;

    return-void
.end method

.method private constructor <init>([LX9/g;[I)V
    .locals 0

    invoke-direct {p0}, Lj7/d;-><init>()V

    iput-object p1, p0, LX9/N;->D:[LX9/g;

    iput-object p2, p0, LX9/N;->E:[I

    return-void
.end method

.method public synthetic constructor <init>([LX9/g;[ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LX9/N;-><init>([LX9/g;[I)V

    return-void
.end method


# virtual methods
.method public final C()[I
    .locals 1

    iget-object v0, p0, LX9/N;->E:[I

    return-object v0
.end method

.method public bridge D(LX9/g;)I
    .locals 0

    invoke-super {p0, p1}, Lj7/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge E(LX9/g;)I
    .locals 0

    invoke-super {p0, p1}, Lj7/d;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LX9/g;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LX9/g;

    invoke-virtual {p0, p1}, LX9/N;->g(LX9/g;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LX9/N;->D:[LX9/g;

    array-length v0, v0

    return v0
.end method

.method public bridge g(LX9/g;)Z
    .locals 0

    invoke-super {p0, p1}, Lj7/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LX9/N;->o(I)LX9/g;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, LX9/g;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LX9/g;

    invoke-virtual {p0, p1}, LX9/N;->D(LX9/g;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, LX9/g;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LX9/g;

    invoke-virtual {p0, p1}, LX9/N;->E(LX9/g;)I

    move-result p1

    return p1
.end method

.method public o(I)LX9/g;
    .locals 1

    iget-object v0, p0, LX9/N;->D:[LX9/g;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final s()[LX9/g;
    .locals 1

    iget-object v0, p0, LX9/N;->D:[LX9/g;

    return-object v0
.end method
