.class Landroidx/appcompat/widget/C$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/C;->n(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroid/widget/TextView;

.field final synthetic D:Landroid/graphics/Typeface;

.field final synthetic E:I

.field final synthetic F:Landroidx/appcompat/widget/C;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/C;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/C$b;->F:Landroidx/appcompat/widget/C;

    iput-object p2, p0, Landroidx/appcompat/widget/C$b;->C:Landroid/widget/TextView;

    iput-object p3, p0, Landroidx/appcompat/widget/C$b;->D:Landroid/graphics/Typeface;

    iput p4, p0, Landroidx/appcompat/widget/C$b;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/C$b;->C:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/appcompat/widget/C$b;->D:Landroid/graphics/Typeface;

    iget v2, p0, Landroidx/appcompat/widget/C$b;->E:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method
