.class final LN4/J$c;
.super LN4/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final transient E:[Ljava/lang/Object;

.field private final transient F:I

.field private final transient G:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LN4/o;-><init>()V

    iput-object p1, p0, LN4/J$c;->E:[Ljava/lang/Object;

    iput p2, p0, LN4/J$c;->F:I

    iput p3, p0, LN4/J$c;->G:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LN4/J$c;->G:I

    invoke-static {p1, v0}, LM4/h;->g(II)I

    iget-object v0, p0, LN4/J$c;->E:[Ljava/lang/Object;

    mul-int/lit8 p1, p1, 0x2

    iget v1, p0, LN4/J$c;->F:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LN4/J$c;->G:I

    return v0
.end method
