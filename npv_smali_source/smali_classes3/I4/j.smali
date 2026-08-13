.class final LI4/j;
.super LK4/v;
.source "SourceFile"


# instance fields
.field private final C:LK4/x;

.field private final D:Ll4/m;

.field final synthetic E:LI4/k;


# direct methods
.method constructor <init>(LI4/k;Ll4/m;)V
    .locals 1

    iput-object p1, p0, LI4/j;->E:LI4/k;

    invoke-direct {p0}, LK4/v;-><init>()V

    new-instance p1, LK4/x;

    const-string v0, "OnRequestIntegrityTokenCallback"

    invoke-direct {p1, v0}, LK4/x;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LI4/j;->C:LK4/x;

    iput-object p2, p0, LI4/j;->D:Ll4/m;

    return-void
.end method


# virtual methods
.method public final k3(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    iget-object v0, p0, LI4/j;->E:LI4/k;

    iget-object v0, v0, LI4/k;->c:LK4/d;

    iget-object v1, p0, LI4/j;->D:Ll4/m;

    invoke-virtual {v0, v1}, LK4/d;->v(Ll4/m;)V

    iget-object v0, p0, LI4/j;->C:LK4/x;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestIntegrityToken"

    invoke-virtual {v0, v2, v1}, LK4/x;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, LI4/j;->D:Ll4/m;

    new-instance v2, LI4/c;

    invoke-direct {v2, v0, v1}, LI4/c;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p1, v2}, Ll4/m;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    const-string v0, "token"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, LI4/j;->D:Ll4/m;

    new-instance v0, LI4/c;

    const/16 v2, -0x64

    invoke-direct {v0, v2, v1}, LI4/c;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Ll4/m;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    const-string v3, "dialog.intent"

    if-lt v1, v2, :cond_2

    const-class v1, Landroid/app/PendingIntent;

    invoke-static {p1, v3, v1}, LI4/i;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Landroid/app/PendingIntent;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    goto :goto_0

    :goto_1
    iget-object v1, p0, LI4/j;->D:Ll4/m;

    new-instance v2, LI4/f;

    invoke-direct {v2}, LI4/f;-><init>()V

    invoke-virtual {v2, v0}, LI4/n;->c(Ljava/lang/String;)LI4/n;

    iget-object v0, p0, LI4/j;->C:LK4/x;

    invoke-virtual {v2, v0}, LI4/n;->b(LK4/x;)LI4/n;

    invoke-virtual {v2, p1}, LI4/n;->a(Landroid/app/PendingIntent;)LI4/n;

    invoke-virtual {v2}, LI4/n;->d()LI4/o;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll4/m;->e(Ljava/lang/Object;)Z

    return-void
.end method
