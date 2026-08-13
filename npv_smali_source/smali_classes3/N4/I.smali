.class LN4/I;
.super LN4/o;
.source "SourceFile"


# static fields
.field static final G:LN4/o;


# instance fields
.field final transient E:[Ljava/lang/Object;

.field private final transient F:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN4/I;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, LN4/I;-><init>([Ljava/lang/Object;I)V

    sput-object v0, LN4/I;->G:LN4/o;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, LN4/o;-><init>()V

    iput-object p1, p0, LN4/I;->E:[Ljava/lang/Object;

    iput p2, p0, LN4/I;->F:I

    return-void
.end method


# virtual methods
.method d([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, LN4/I;->E:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, LN4/I;->F:I

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LN4/I;->F:I

    add-int/2addr p2, p1

    return p2
.end method

.method e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/I;->E:[Ljava/lang/Object;

    return-object v0
.end method

.method f()I
    .locals 1

    iget v0, p0, LN4/I;->F:I

    return v0
.end method

.method g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LN4/I;->F:I

    invoke-static {p1, v0}, LM4/h;->g(II)I

    iget-object v0, p0, LN4/I;->E:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LN4/I;->F:I

    return v0
.end method
