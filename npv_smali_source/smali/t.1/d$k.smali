.class final Lt/d$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d;->g(Lu/s0;Lx7/l;Landroidx/compose/ui/d;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lt/d$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt/d$k;

    invoke-direct {v0}, Lt/d$k;-><init>()V

    sput-object v0, Lt/d$k;->D:Lt/d$k;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;Lt/m;)Ljava/lang/Boolean;
    .locals 0

    .prologue
    if-ne p1, p2, :cond_0

    sget-object p1, Lt/m;->E:Lt/m;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt/m;

    check-cast p2, Lt/m;

    invoke-virtual {p0, p1, p2}, Lt/d$k;->a(Lt/m;Lt/m;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
