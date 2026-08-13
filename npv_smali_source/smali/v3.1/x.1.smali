.class final Lv3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic C:Landroid/content/Context;


# direct methods
.method constructor <init>(Lv3/y;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Lv3/x;->C:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object p1, p0, Lv3/x;->C:Landroid/content/Context;

    const-string p2, "https://support.google.com/dfp_premium/answer/7160685#push"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2}, Lv3/E0;->u(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method
