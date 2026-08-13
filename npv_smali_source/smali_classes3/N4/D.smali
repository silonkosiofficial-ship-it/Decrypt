.class final LN4/D;
.super LN4/G;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final C:LN4/D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/D;

    invoke-direct {v0}, LN4/D;-><init>()V

    sput-object v0, LN4/D;->C:LN4/D;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LN4/G;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p0, p1, p2}, LN4/D;->f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    invoke-static {p1}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural()"

    return-object v0
.end method
