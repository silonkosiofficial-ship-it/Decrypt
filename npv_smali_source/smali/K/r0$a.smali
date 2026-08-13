.class final synthetic LK/r0$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LK/r0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK/r0$a;

    invoke-direct {v0}, LK/r0$a;-><init>()V

    sput-object v0, LK/r0$a;->L:LK/r0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "<init>(Landroid/view/View;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, LK/m0;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LK/r0$a;->s(Landroid/view/View;)LK/m0;

    move-result-object p1

    return-object p1
.end method

.method public final s(Landroid/view/View;)LK/m0;
    .locals 1

    new-instance v0, LK/m0;

    invoke-direct {v0, p1}, LK/m0;-><init>(Landroid/view/View;)V

    return-object v0
.end method
