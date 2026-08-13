.class public final synthetic Lv3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic C:Lv3/v;

.field public final synthetic D:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv3/v;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/i;->C:Lv3/v;

    iput-object p2, p0, Lv3/i;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lv3/i;->C:Lv3/v;

    iget-object v1, p0, Lv3/i;->D:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lv3/v;->i(Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method
