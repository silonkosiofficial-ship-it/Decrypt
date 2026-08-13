.class public final synthetic Lu3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lu3/t;

.field public final synthetic D:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Lu3/t;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/s;->C:Lu3/t;

    iput-object p2, p0, Lu3/s;->D:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu3/s;->C:Lu3/t;

    iget-object v0, v0, Lu3/t;->c:Lu3/x;

    iget-object v0, v0, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Lu3/s;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
