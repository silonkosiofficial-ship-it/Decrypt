.class final Lr3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic C:Lr3/u;


# direct methods
.method constructor <init>(Lr3/u;)V
    .locals 0

    iput-object p1, p0, Lr3/p;->C:Lr3/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    iget-object p1, p0, Lr3/p;->C:Lr3/u;

    invoke-static {p1}, Lr3/u;->r6(Lr3/u;)Lcom/google/android/gms/internal/ads/Z9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lr3/u;->r6(Lr3/u;)Lcom/google/android/gms/internal/ads/Z9;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/Z9;->d(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
