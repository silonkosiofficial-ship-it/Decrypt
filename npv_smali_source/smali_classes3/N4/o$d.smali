.class LN4/o$d;
.super LN4/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final transient E:I

.field final transient F:I

.field final synthetic G:LN4/o;


# direct methods
.method constructor <init>(LN4/o;II)V
    .locals 0

    iput-object p1, p0, LN4/o$d;->G:LN4/o;

    invoke-direct {p0}, LN4/o;-><init>()V

    iput p2, p0, LN4/o$d;->E:I

    iput p3, p0, LN4/o$d;->F:I

    return-void
.end method


# virtual methods
.method public S(II)LN4/o;
    .locals 2

    iget v0, p0, LN4/o$d;->F:I

    invoke-static {p1, p2, v0}, LM4/h;->m(III)V

    iget-object v0, p0, LN4/o$d;->G:LN4/o;

    iget v1, p0, LN4/o$d;->E:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, LN4/o;->S(II)LN4/o;

    move-result-object p1

    return-object p1
.end method

.method e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/o$d;->G:LN4/o;

    invoke-virtual {v0}, LN4/n;->e()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method f()I
    .locals 2

    iget-object v0, p0, LN4/o$d;->G:LN4/o;

    invoke-virtual {v0}, LN4/n;->g()I

    move-result v0

    iget v1, p0, LN4/o$d;->E:I

    add-int/2addr v0, v1

    iget v1, p0, LN4/o$d;->F:I

    add-int/2addr v0, v1

    return v0
.end method

.method g()I
    .locals 2

    iget-object v0, p0, LN4/o$d;->G:LN4/o;

    invoke-virtual {v0}, LN4/n;->g()I

    move-result v0

    iget v1, p0, LN4/o$d;->E:I

    add-int/2addr v0, v1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LN4/o$d;->F:I

    invoke-static {p1, v0}, LM4/h;->g(II)I

    iget-object v0, p0, LN4/o$d;->G:LN4/o;

    iget v1, p0, LN4/o$d;->E:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, LN4/o;->C()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, LN4/o;->D()LN4/T;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, LN4/o;->E(I)LN4/T;

    move-result-object p1

    return-object p1
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LN4/o$d;->F:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN4/o$d;->S(II)LN4/o;

    move-result-object p1

    return-object p1
.end method
