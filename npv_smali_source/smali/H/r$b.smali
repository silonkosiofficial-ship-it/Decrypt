.class final synthetic LH/r$b;
.super Ly7/G;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final K:LH/r$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/r$b;

    invoke-direct {v0}, LH/r$b;-><init>()V

    sput-object v0, LH/r$b;->K:LH/r$b;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z"

    const/4 v1, 0x1

    const-class v2, Lx0/d;

    const-string v3, "isCtrlPressed"

    invoke-direct {p0, v2, v3, v0, v1}, Ly7/G;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b;

    invoke-virtual {p1}, Lx0/b;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-static {p1}, Lx0/d;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
