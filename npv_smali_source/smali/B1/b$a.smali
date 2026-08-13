.class public final LB1/b$a;
.super Lj7/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB1/b;->a(Landroid/util/LongSparseArray;)Lj7/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private C:I

.field final synthetic D:Landroid/util/LongSparseArray;


# direct methods
.method constructor <init>(Landroid/util/LongSparseArray;)V
    .locals 0

    iput-object p1, p0, LB1/b$a;->D:Landroid/util/LongSparseArray;

    invoke-direct {p0}, Lj7/P;-><init>()V

    return-void
.end method


# virtual methods
.method public b()J
    .locals 3

    iget-object v0, p0, LB1/b$a;->D:Landroid/util/LongSparseArray;

    iget v1, p0, LB1/b$a;->C:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LB1/b$a;->C:I

    invoke-virtual {v0, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, LB1/b$a;->C:I

    iget-object v1, p0, LB1/b$a;->D:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
