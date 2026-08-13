.class public final LI3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO3/a$d;


# static fields
.field public static final F:LI3/g;


# instance fields
.field private final C:Ljava/lang/String;

.field private final D:Z

.field private final E:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI3/f;

    invoke-direct {v0}, LI3/f;-><init>()V

    new-instance v1, LI3/g;

    invoke-direct {v1, v0}, LI3/g;-><init>(LI3/f;)V

    sput-object v1, LI3/g;->F:LI3/g;

    return-void
.end method

.method public constructor <init>(LI3/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LI3/g;->C:Ljava/lang/String;

    iget-object v0, p1, LI3/f;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, LI3/g;->D:Z

    iget-object p1, p1, LI3/f;->b:Ljava/lang/String;

    iput-object p1, p0, LI3/g;->E:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic b(LI3/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LI3/g;->C:Ljava/lang/String;

    const/4 p0, 0x0

    return-object p0
.end method

.method static bridge synthetic c(LI3/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LI3/g;->E:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic d(LI3/g;)Z
    .locals 0

    iget-boolean p0, p0, LI3/g;->D:Z

    return p0
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "consumer_package"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "force_save_dialog"

    iget-boolean v2, p0, LI3/g;->D:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "log_session_id"

    iget-object v2, p0, LI3/g;->E:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LI3/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LI3/g;

    iget-object v1, p1, LI3/g;->C:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1, v1}, LQ3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, LI3/g;->D:Z

    iget-boolean v3, p1, LI3/g;->D:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, LI3/g;->E:Ljava/lang/String;

    iget-object p1, p1, LI3/g;->E:Ljava/lang/String;

    invoke-static {v1, p1}, LQ3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 5

    iget-boolean v0, p0, LI3/g;->D:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, LI3/g;->E:Ljava/lang/String;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    invoke-static {v2}, LQ3/n;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
