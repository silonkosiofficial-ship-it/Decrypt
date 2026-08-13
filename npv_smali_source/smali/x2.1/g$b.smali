.class final Lx2/g$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx2/g;->a(Landroid/view/View;)Lx2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lx2/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx2/g$b;

    invoke-direct {v0}, Lx2/g$b;-><init>()V

    sput-object v0, Lx2/g$b;->D:Lx2/g$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lx2/f;
    .locals 1

    .prologue
    const-string v0, "view"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lx2/a;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lx2/f;

    if-eqz v0, :cond_0

    check-cast p1, Lx2/f;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lx2/g$b;->a(Landroid/view/View;)Lx2/f;

    move-result-object p1

    return-object p1
.end method
