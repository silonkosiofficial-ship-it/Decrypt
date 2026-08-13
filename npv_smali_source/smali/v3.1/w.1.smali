.class final Lv3/w;
.super Ls3/G0;
.source "SourceFile"


# instance fields
.field final synthetic C:Landroid/content/Context;

.field final synthetic D:Lv3/z;


# direct methods
.method constructor <init>(Lv3/z;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Lv3/w;->C:Landroid/content/Context;

    iput-object p1, p0, Lv3/w;->D:Lv3/z;

    invoke-direct {p0}, Ls3/G0;-><init>()V

    return-void
.end method


# virtual methods
.method public final V1(Ls3/W0;)V
    .locals 3

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv3/w;->D:Lv3/z;

    iget-object v1, p0, Lv3/w;->C:Landroid/content/Context;

    iget-object p1, p1, Ls3/W0;->D:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2, v2}, Lv3/z;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    return-void
.end method
