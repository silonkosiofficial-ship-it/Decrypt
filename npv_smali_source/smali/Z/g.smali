.class public final LZ/g;
.super LZ/a;
.source "SourceFile"


# instance fields
.field private final E:[Ljava/lang/Object;

.field private final F:LZ/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;III)V
    .locals 0

    invoke-direct {p0, p3, p4}, LZ/a;-><init>(II)V

    iput-object p2, p0, LZ/g;->E:[Ljava/lang/Object;

    invoke-static {p4}, LZ/l;->d(I)I

    move-result p2

    invoke-static {p3, p2}, LE7/j;->g(II)I

    move-result p3

    new-instance p4, LZ/k;

    invoke-direct {p4, p1, p3, p2, p5}, LZ/k;-><init>([Ljava/lang/Object;III)V

    iput-object p4, p0, LZ/g;->F:LZ/k;

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-virtual {p0}, LZ/a;->b()V

    iget-object v0, p0, LZ/g;->F:LZ/k;

    invoke-virtual {v0}, LZ/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LZ/a;->f(I)V

    iget-object v0, p0, LZ/g;->F:LZ/k;

    invoke-virtual {v0}, LZ/k;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LZ/g;->E:[Ljava/lang/Object;

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LZ/a;->f(I)V

    iget-object v2, p0, LZ/g;->F:LZ/k;

    invoke-virtual {v2}, LZ/a;->e()I

    move-result v2

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-virtual {p0}, LZ/a;->c()V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    iget-object v1, p0, LZ/g;->F:LZ/k;

    invoke-virtual {v1}, LZ/a;->e()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, LZ/g;->E:[Ljava/lang/Object;

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LZ/a;->f(I)V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    iget-object v2, p0, LZ/g;->F:LZ/k;

    invoke-virtual {v2}, LZ/a;->e()I

    move-result v2

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LZ/a;->f(I)V

    iget-object v0, p0, LZ/g;->F:LZ/k;

    invoke-virtual {v0}, LZ/k;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
