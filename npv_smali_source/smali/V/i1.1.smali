.class final LV/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/b;
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# instance fields
.field private final C:LV/h1;

.field private final D:I

.field private final E:I


# direct methods
.method public constructor <init>(LV/h1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/i1;->C:LV/h1;

    iput p2, p0, LV/i1;->D:I

    iput p3, p0, LV/i1;->E:I

    return-void
.end method

.method private final d()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/i1;->C:LV/h1;

    invoke-virtual {v0}, LV/h1;->R()I

    move-result v0

    iget v1, p0, LV/i1;->E:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 6

    invoke-direct {p0}, LV/i1;->d()V

    iget-object v0, p0, LV/i1;->C:LV/h1;

    iget v1, p0, LV/i1;->D:I

    invoke-virtual {v0, v1}, LV/h1;->Y(I)LV/W;

    new-instance v0, LV/U;

    iget-object v1, p0, LV/i1;->C:LV/h1;

    iget v2, p0, LV/i1;->D:I

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v1}, LV/h1;->M()[I

    move-result-object v4

    iget v5, p0, LV/i1;->D:I

    invoke-static {v4, v5}, LV/j1;->h([II)I

    move-result v4

    add-int/2addr v2, v4

    invoke-direct {v0, v1, v3, v2}, LV/U;-><init>(LV/h1;II)V

    return-object v0
.end method
