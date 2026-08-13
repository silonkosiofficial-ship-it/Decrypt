.class Lcom/google/android/material/internal/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/G;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/n;->b(Landroid/view/View;Lcom/google/android/material/internal/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Lcom/google/android/material/internal/n$c;

.field final synthetic D:Lcom/google/android/material/internal/n$d;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/n$c;Lcom/google/android/material/internal/n$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/n$a;->C:Lcom/google/android/material/internal/n$c;

    iput-object p2, p0, Lcom/google/android/material/internal/n$a;->D:Lcom/google/android/material/internal/n$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/y0;)Landroidx/core/view/y0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/internal/n$a;->C:Lcom/google/android/material/internal/n$c;

    new-instance v1, Lcom/google/android/material/internal/n$d;

    iget-object v2, p0, Lcom/google/android/material/internal/n$a;->D:Lcom/google/android/material/internal/n$d;

    invoke-direct {v1, v2}, Lcom/google/android/material/internal/n$d;-><init>(Lcom/google/android/material/internal/n$d;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/material/internal/n$c;->a(Landroid/view/View;Landroidx/core/view/y0;Lcom/google/android/material/internal/n$d;)Landroidx/core/view/y0;

    move-result-object p1

    return-object p1
.end method
