.class final LQ3/B;
.super LQ3/D;
.source "SourceFile"


# instance fields
.field final synthetic C:Landroid/content/Intent;

.field final synthetic D:Landroid/app/Activity;

.field final synthetic E:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, LQ3/B;->C:Landroid/content/Intent;

    iput-object p2, p0, LQ3/B;->D:Landroid/app/Activity;

    iput p3, p0, LQ3/B;->E:I

    invoke-direct {p0}, LQ3/D;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, LQ3/B;->C:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, LQ3/B;->D:Landroid/app/Activity;

    iget v2, p0, LQ3/B;->E:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
