.class public final synthetic Lcom/google/android/material/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/view/View;

.field public final synthetic D:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/internal/m;->C:Landroid/view/View;

    iput-boolean p2, p0, Lcom/google/android/material/internal/m;->D:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/internal/m;->C:Landroid/view/View;

    iget-boolean v1, p0, Lcom/google/android/material/internal/m;->D:Z

    invoke-static {v0, v1}, Lcom/google/android/material/internal/n;->a(Landroid/view/View;Z)V

    return-void
.end method
