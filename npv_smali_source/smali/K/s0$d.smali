.class final LK/s0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/s0;-><init>(Landroid/view/View;Lx7/l;LK/l0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK/s0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK/s0$d;

    invoke-direct {v0}, LK/s0$d;-><init>()V

    sput-object v0, LK/s0$d;->D:LK/s0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/r;

    invoke-virtual {p1}, LS0/r;->p()I

    move-result p1

    invoke-virtual {p0, p1}, LK/s0$d;->a(I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
