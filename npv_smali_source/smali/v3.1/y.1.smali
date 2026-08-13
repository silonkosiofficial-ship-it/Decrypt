.class final Lv3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Landroid/content/Context;

.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Z

.field final synthetic F:Z


# direct methods
.method constructor <init>(Lv3/z;Landroid/content/Context;Ljava/lang/String;ZZ)V
    .locals 0

    iput-object p2, p0, Lv3/y;->C:Landroid/content/Context;

    iput-object p3, p0, Lv3/y;->D:Ljava/lang/String;

    iput-boolean p4, p0, Lv3/y;->E:Z

    iput-boolean p5, p0, Lv3/y;->F:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lv3/y;->C:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->l(Landroid/content/Context;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lv3/y;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-boolean v1, p0, Lv3/y;->E:Z

    if-eqz v1, :cond_0

    const-string v1, "Error"

    :goto_0
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    goto :goto_1

    :cond_0
    const-string v1, "Info"

    goto :goto_0

    :goto_1
    iget-boolean v1, p0, Lv3/y;->F:Z

    const/4 v2, 0x0

    const-string v3, "Dismiss"

    if-eqz v1, :cond_1

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lv3/y;->C:Landroid/content/Context;

    new-instance v4, Lv3/x;

    invoke-direct {v4, p0, v1}, Lv3/x;-><init>(Lv3/y;Landroid/content/Context;)V

    const-string v1, "Learn More"

    invoke-virtual {v0, v1, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :goto_2
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
