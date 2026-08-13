.class public final synthetic Lj0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lj0/b;

.field public final synthetic D:Landroid/util/LongSparseArray;


# direct methods
.method public synthetic constructor <init>(Lj0/b;Landroid/util/LongSparseArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/l;->C:Lj0/b;

    iput-object p2, p0, Lj0/l;->D:Landroid/util/LongSparseArray;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj0/l;->C:Lj0/b;

    iget-object v1, p0, Lj0/l;->D:Landroid/util/LongSparseArray;

    invoke-static {v0, v1}, Lj0/b$b;->a(Lj0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method
