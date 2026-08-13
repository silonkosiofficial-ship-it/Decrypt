.class final Lu3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic C:Lu3/x;


# direct methods
.method constructor <init>(Lu3/x;)V
    .locals 0

    iput-object p1, p0, Lu3/o;->C:Lu3/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lu3/o;->C:Lu3/x;

    const/4 v0, 0x2

    iput v0, p1, Lu3/x;->X:I

    iget-object p1, p1, Lu3/x;->C:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
