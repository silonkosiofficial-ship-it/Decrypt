.class LN4/J$a;
.super LN4/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final transient E:LN4/p;

.field private final transient F:[Ljava/lang/Object;

.field private final transient G:I

.field private final transient H:I


# direct methods
.method constructor <init>(LN4/p;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LN4/r;-><init>()V

    iput-object p1, p0, LN4/J$a;->E:LN4/p;

    iput-object p2, p0, LN4/J$a;->F:[Ljava/lang/Object;

    iput p3, p0, LN4/J$a;->G:I

    iput p4, p0, LN4/J$a;->H:I

    return-void
.end method

.method static synthetic R(LN4/J$a;)I
    .locals 0

    iget p0, p0, LN4/J$a;->H:I

    return p0
.end method

.method static synthetic S(LN4/J$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LN4/J$a;->F:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic T(LN4/J$a;)I
    .locals 0

    iget p0, p0, LN4/J$a;->G:I

    return p0
.end method


# virtual methods
.method D()LN4/o;
    .locals 1

    new-instance v0, LN4/J$a$a;

    invoke-direct {v0, p0}, LN4/J$a$a;-><init>(LN4/J$a;)V

    return-object v0
.end method

.method public U()LN4/S;
    .locals 1

    invoke-virtual {p0}, LN4/r;->o()LN4/o;

    move-result-object v0

    invoke-virtual {v0}, LN4/o;->C()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, LN4/J$a;->E:LN4/p;

    invoke-virtual {v2, v0}, LN4/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method d([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LN4/r;->o()LN4/o;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LN4/o;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LN4/J$a;->U()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LN4/J$a;->H:I

    return v0
.end method
