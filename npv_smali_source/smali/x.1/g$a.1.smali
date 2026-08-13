.class final Lx/g$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lx/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx/g$a;

    invoke-direct {v0}, Lx/g$a;-><init>()V

    sput-object v0, Lx/g$a;->D:Lx/g$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/x;)Lx/f;
    .locals 1

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/T;->g()LV/O0;

    move-result-object v0

    invoke-interface {p1, v0}, LV/x;->a(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "android.software.leanback"

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lx/f;->a:Lx/f$a;

    invoke-virtual {p1}, Lx/f$a;->b()Lx/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lx/g;->b()Lx/f;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/x;

    invoke-virtual {p0, p1}, Lx/g$a;->a(LV/x;)Lx/f;

    move-result-object p1

    return-object p1
.end method
