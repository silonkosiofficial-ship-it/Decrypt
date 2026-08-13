.class public abstract LN4/o;
.super LN4/n;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/o$a;,
        LN4/o$c;,
        LN4/o$d;,
        LN4/o$b;
    }
.end annotation


# static fields
.field private static final D:LN4/T;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN4/o$b;

    sget-object v1, LN4/I;->G:LN4/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN4/o$b;-><init>(LN4/o;I)V

    sput-object v0, LN4/o;->D:LN4/T;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LN4/n;-><init>()V

    return-void
.end method

.method public static M()LN4/o;
    .locals 1

    sget-object v0, LN4/I;->G:LN4/o;

    return-object v0
.end method

.method public static N(Ljava/lang/Object;Ljava/lang/Object;)LN4/o;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, LN4/o;->w([Ljava/lang/Object;)LN4/o;

    move-result-object p0

    return-object p0
.end method

.method public static O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LN4/o;
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    invoke-static {v0}, LN4/o;->w([Ljava/lang/Object;)LN4/o;

    move-result-object p0

    return-object p0
.end method

.method public static P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LN4/o;
    .locals 2

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    invoke-static {v0}, LN4/o;->w([Ljava/lang/Object;)LN4/o;

    move-result-object p0

    return-object p0
.end method

.method public static R(Ljava/util/Comparator;Ljava/lang/Iterable;)LN4/o;
    .locals 0

    invoke-static {p0}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LN4/v;->b(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LN4/F;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {p1}, LN4/o;->o([Ljava/lang/Object;)LN4/o;

    move-result-object p0

    return-object p0
.end method

.method static o([Ljava/lang/Object;)LN4/o;
    .locals 1

    array-length v0, p0

    invoke-static {p0, v0}, LN4/o;->s([Ljava/lang/Object;I)LN4/o;

    move-result-object p0

    return-object p0
.end method

.method static s([Ljava/lang/Object;I)LN4/o;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    invoke-static {}, LN4/o;->M()LN4/o;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LN4/I;

    invoke-direct {v0, p0, p1}, LN4/I;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static varargs w([Ljava/lang/Object;)LN4/o;
    .locals 0

    invoke-static {p0}, LN4/F;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LN4/o;->o([Ljava/lang/Object;)LN4/o;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C()LN4/S;
    .locals 1

    invoke-virtual {p0}, LN4/o;->D()LN4/T;

    move-result-object v0

    return-object v0
.end method

.method public D()LN4/T;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LN4/o;->E(I)LN4/T;

    move-result-object v0

    return-object v0
.end method

.method public E(I)LN4/T;
    .locals 1

    .prologue
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, v0}, LM4/h;->k(II)I

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LN4/o;->D:LN4/T;

    return-object p1

    :cond_0
    new-instance v0, LN4/o$b;

    invoke-direct {v0, p0, p1}, LN4/o$b;-><init>(LN4/o;I)V

    return-object v0
.end method

.method public Q()LN4/o;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LN4/o$c;

    invoke-direct {v0, p0}, LN4/o$c;-><init>(LN4/o;)V

    :goto_0
    return-object v0
.end method

.method public S(II)LN4/o;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, LM4/h;->m(III)V

    sub-int v0, p2, p1

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, LN4/o;->M()LN4/o;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p1, p2}, LN4/o;->T(II)LN4/o;

    move-result-object p1

    return-object p1
.end method

.method T(II)LN4/o;
    .locals 1

    new-instance v0, LN4/o$d;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2}, LN4/o$d;-><init>(LN4/o;II)V

    return-object v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    invoke-virtual {p0, p1}, LN4/o;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method d([Ljava/lang/Object;I)I
    .locals 4

    .prologue
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p2, v0

    return p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LN4/x;->a(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    .prologue
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    not-int v1, v1

    not-int v1, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LN4/x;->b(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LN4/o;->C()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    .prologue
    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LN4/x;->d(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-virtual {p0}, LN4/o;->D()LN4/T;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-virtual {p0, p1}, LN4/o;->E(I)LN4/T;

    move-result-object p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN4/o;->S(II)LN4/o;

    move-result-object p1

    return-object p1
.end method
