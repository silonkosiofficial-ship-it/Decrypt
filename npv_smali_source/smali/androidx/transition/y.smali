.class Landroidx/transition/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lr/a;

.field final b:Landroid/util/SparseArray;

.field final c:Lr/v;

.field final d:Lr/a;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/a;

    invoke-direct {v0}, Lr/a;-><init>()V

    iput-object v0, p0, Landroidx/transition/y;->a:Lr/a;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/transition/y;->b:Landroid/util/SparseArray;

    new-instance v0, Lr/v;

    invoke-direct {v0}, Lr/v;-><init>()V

    iput-object v0, p0, Landroidx/transition/y;->c:Lr/v;

    new-instance v0, Lr/a;

    invoke-direct {v0}, Lr/a;-><init>()V

    iput-object v0, p0, Landroidx/transition/y;->d:Lr/a;

    return-void
.end method
